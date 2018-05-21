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
import ccredit.finmodules.finmodel.FinFinancebssgmt;
import ccredit.finmodules.finservice.FinFinancebssgmtService;

/**
* 财务报表信息记录基础段 
* 2018-05-03 15:02:51  yangzhou
*/
@Controller
@RequestMapping("/finFinancebssgmtController")
public class FinFinancebssgmtController extends BaseAction{
	@Autowired
	private FinFinancebssgmtService finFinancebssgmtService;
	/**
	* 载入初始化页面
	* @param fin_financebssgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadFinFinancebssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public ModelAndView loadFinFinancebssgmt(FinFinancebssgmt finFinancebssgmt,HttpServletRequest request){
		return new ModelAndView("pc/fin/fin-financebssgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param fin_financebssgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getFinFinancebssgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getFinFinancebssgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<FinFinancebssgmt> finFinancebssgmtList = finFinancebssgmtService.getFinFinancebssgmtListByCondition(condition);
		PageInfo<FinFinancebssgmt> page = new PageInfo<FinFinancebssgmt>(finFinancebssgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param fin_financebssgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getFinFinancebssgmtById",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getFinFinancebssgmtById(String fin_financebssgmt_id,HttpServletRequest request){
		FinFinancebssgmt finFinancebssgmt = finFinancebssgmtService.getFinFinancebssgmtById(fin_financebssgmt_id);
		return outDataStr2(finFinancebssgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param fin_financebssgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addFinFinancebssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String addFinFinancebssgmt(FinFinancebssgmt finFinancebssgmt,HttpServletRequest request){
		int i = 0;
		if(null != finFinancebssgmt && !"".equals(finFinancebssgmt)){
			finFinancebssgmt.setFin_financebssgmt_id(UUID.toUUID());
			finFinancebssgmt.setLastdate(new Date(System.currentTimeMillis()));
			finFinancebssgmt.setChangeflag("1");
			i=finFinancebssgmtService.addFinFinancebssgmt(finFinancebssgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param fin_financebssgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateFinFinancebssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String updateFinFinancebssgmt(FinFinancebssgmt finFinancebssgmt,HttpServletRequest request){
		int i = 0;
		if(null != finFinancebssgmt && !"".equals(finFinancebssgmt)){
			finFinancebssgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=finFinancebssgmtService.updateFinFinancebssgmt(finFinancebssgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param fin_financebssgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delFinFinancebssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String delFinFinancebssgmt(String fin_financebssgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != fin_financebssgmt_id && !"".equals(fin_financebssgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("fin_financebssgmt_id",fin_financebssgmt_id.split(","));
			i=finFinancebssgmtService.delFinFinancebssgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param fin_financebssgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyFinFinancebssgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String copyFinFinancebssgmt(String fin_financebssgmt_id,HttpServletRequest request){
		int i = 0;
		FinFinancebssgmt finFinancebssgmt = finFinancebssgmtService.getFinFinancebssgmtById(fin_financebssgmt_id);
		if(null != finFinancebssgmt && !"".equals(finFinancebssgmt)){
			finFinancebssgmt.setFin_financebssgmt_id(UUID.toUUID());
			i=finFinancebssgmtService.addFinFinancebssgmt(finFinancebssgmt);
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
	@RequestMapping(value="/exportFinFinancebssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public void exportFinFinancebssgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
