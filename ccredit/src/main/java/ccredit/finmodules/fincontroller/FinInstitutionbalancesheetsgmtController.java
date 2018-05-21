package ccredit.finmodules.fincontroller;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.github.pagehelper.PageInfo;
import ccredit.xtmodules.xtcore.base.BaseAction;
import ccredit.xtmodules.xtcore.base.BaseSearch;
import ccredit.xtmodules.xtcore.util.excel.poi.ExportExcel;
import ccredit.xtmodules.xtcore.util.UUID;
import ccredit.xtmodules.xtcore.annotation.AuthUneedLogin;
import ccredit.finmodules.finmodel.FinInstitutionbalancesheetsgmt;
import ccredit.finmodules.finservice.FinInstitutionbalancesheetsgmtService;

/**
* 事业单位资产负债表 
* 2018-05-03 15:05:22  yangzhou
*/
@Controller
@RequestMapping("/finInstitutionbalancesheetsgmtController")
public class FinInstitutionbalancesheetsgmtController extends BaseAction{
	@Autowired
	private FinInstitutionbalancesheetsgmtService finInstitutionbalancesheetsgmtService;
	/**
	* 载入初始化页面
	* @param fin_institutionbalancesheetsgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadFinInstitutionbalancesheetsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public ModelAndView loadFinInstitutionbalancesheetsgmt(FinInstitutionbalancesheetsgmt finInstitutionbalancesheetsgmt,HttpServletRequest request){
		return new ModelAndView("pc/fin/fin-institutionbalancesheetsgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param fin_institutionbalancesheetsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getFinInstitutionbalancesheetsgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getFinInstitutionbalancesheetsgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<FinInstitutionbalancesheetsgmt> finInstitutionbalancesheetsgmtList = finInstitutionbalancesheetsgmtService.getFinInstitutionbalancesheetsgmtListByCondition(condition);
		PageInfo<FinInstitutionbalancesheetsgmt> page = new PageInfo<FinInstitutionbalancesheetsgmt>(finInstitutionbalancesheetsgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param fin_institutionbalancesheetsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getFinInstitutionbalancesheetsgmtById",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getFinInstitutionbalancesheetsgmtById(String fin_institutionbalancesheetsgmt_id,HttpServletRequest request){
		FinInstitutionbalancesheetsgmt finInstitutionbalancesheetsgmt = finInstitutionbalancesheetsgmtService.getFinInstitutionbalancesheetsgmtById(fin_institutionbalancesheetsgmt_id);
		return outDataStr2(finInstitutionbalancesheetsgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param fin_institutionbalancesheetsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addFinInstitutionbalancesheetsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String addFinInstitutionbalancesheetsgmt(FinInstitutionbalancesheetsgmt finInstitutionbalancesheetsgmt,HttpServletRequest request){
		int i = 0;
		if(null != finInstitutionbalancesheetsgmt && !"".equals(finInstitutionbalancesheetsgmt)){
			finInstitutionbalancesheetsgmt.setFin_institutionbalancesheetsgmt_id(UUID.toUUID());
			finInstitutionbalancesheetsgmt.setLastdate(new Date(System.currentTimeMillis()));
			finInstitutionbalancesheetsgmt.setChangeflag("1");
			i=finInstitutionbalancesheetsgmtService.addFinInstitutionbalancesheetsgmt(finInstitutionbalancesheetsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param fin_institutionbalancesheetsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateFinInstitutionbalancesheetsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String updateFinInstitutionbalancesheetsgmt(FinInstitutionbalancesheetsgmt finInstitutionbalancesheetsgmt,HttpServletRequest request){
		int i = 0;
		if(null != finInstitutionbalancesheetsgmt && !"".equals(finInstitutionbalancesheetsgmt)){
			finInstitutionbalancesheetsgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=finInstitutionbalancesheetsgmtService.updateFinInstitutionbalancesheetsgmt(finInstitutionbalancesheetsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param fin_institutionbalancesheetsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delFinInstitutionbalancesheetsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String delFinInstitutionbalancesheetsgmt(String fin_institutionbalancesheetsgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != fin_institutionbalancesheetsgmt_id && !"".equals(fin_institutionbalancesheetsgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("fin_institutionbalancesheetsgmt_id",fin_institutionbalancesheetsgmt_id.split(","));
			i=finInstitutionbalancesheetsgmtService.delFinInstitutionbalancesheetsgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param fin_institutionbalancesheetsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyFinInstitutionbalancesheetsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String copyFinInstitutionbalancesheetsgmt(String fin_institutionbalancesheetsgmt_id,HttpServletRequest request){
		int i = 0;
		FinInstitutionbalancesheetsgmt finInstitutionbalancesheetsgmt = finInstitutionbalancesheetsgmtService.getFinInstitutionbalancesheetsgmtById(fin_institutionbalancesheetsgmt_id);
		if(null != finInstitutionbalancesheetsgmt && !"".equals(finInstitutionbalancesheetsgmt)){
			finInstitutionbalancesheetsgmt.setFin_institutionbalancesheetsgmt_id(UUID.toUUID());
			i=finInstitutionbalancesheetsgmtService.addFinInstitutionbalancesheetsgmt(finInstitutionbalancesheetsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 导出
	* @param excleData 
	* @param excleHeader 
	* @param excleText 
	* @param request 
	* @param request 
	*/
	@RequestMapping(value="/exportFinInstitutionbalancesheetsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public void exportFinInstitutionbalancesheetsgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
