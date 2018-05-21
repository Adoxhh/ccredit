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
import ccredit.finmodules.finmodel.FinIncomeandexpensestatementsgmt;
import ccredit.finmodules.finservice.FinIncomeandexpensestatementsgmtService;

/**
* 事业单位收入支出表 
* 2018-05-03 15:04:06  yangzhou
*/
@Controller
@RequestMapping("/finIncomeandexpensestatementsgmtController")
public class FinIncomeandexpensestatementsgmtController extends BaseAction{
	@Autowired
	private FinIncomeandexpensestatementsgmtService finIncomeandexpensestatementsgmtService;
	/**
	* 载入初始化页面
	* @param fin_incomeandexpensestatementsgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadFinIncomeandexpensestatementsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public ModelAndView loadFinIncomeandexpensestatementsgmt(FinIncomeandexpensestatementsgmt finIncomeandexpensestatementsgmt,HttpServletRequest request){
		return new ModelAndView("pc/fin/fin-incomeandexpensestatementsgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param fin_incomeandexpensestatementsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getFinIncomeandexpensestatementsgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getFinIncomeandexpensestatementsgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<FinIncomeandexpensestatementsgmt> finIncomeandexpensestatementsgmtList = finIncomeandexpensestatementsgmtService.getFinIncomeandexpensestatementsgmtListByCondition(condition);
		PageInfo<FinIncomeandexpensestatementsgmt> page = new PageInfo<FinIncomeandexpensestatementsgmt>(finIncomeandexpensestatementsgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param fin_incomeandexpensestatementsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getFinIncomeandexpensestatementsgmtById",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getFinIncomeandexpensestatementsgmtById(String fin_incomeandexpensestatementsgmt_id,HttpServletRequest request){
		FinIncomeandexpensestatementsgmt finIncomeandexpensestatementsgmt = finIncomeandexpensestatementsgmtService.getFinIncomeandexpensestatementsgmtById(fin_incomeandexpensestatementsgmt_id);
		return outDataStr2(finIncomeandexpensestatementsgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param fin_incomeandexpensestatementsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addFinIncomeandexpensestatementsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String addFinIncomeandexpensestatementsgmt(FinIncomeandexpensestatementsgmt finIncomeandexpensestatementsgmt,HttpServletRequest request){
		int i = 0;
		if(null != finIncomeandexpensestatementsgmt && !"".equals(finIncomeandexpensestatementsgmt)){
			finIncomeandexpensestatementsgmt.setFin_incomeandexpensestatementsgmt_id(UUID.toUUID());
			finIncomeandexpensestatementsgmt.setLastdate(new Date(System.currentTimeMillis()));
			finIncomeandexpensestatementsgmt.setChangeflag("1");
			i=finIncomeandexpensestatementsgmtService.addFinIncomeandexpensestatementsgmt(finIncomeandexpensestatementsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param fin_incomeandexpensestatementsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateFinIncomeandexpensestatementsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String updateFinIncomeandexpensestatementsgmt(FinIncomeandexpensestatementsgmt finIncomeandexpensestatementsgmt,HttpServletRequest request){
		int i = 0;
		if(null != finIncomeandexpensestatementsgmt && !"".equals(finIncomeandexpensestatementsgmt)){
			finIncomeandexpensestatementsgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=finIncomeandexpensestatementsgmtService.updateFinIncomeandexpensestatementsgmt(finIncomeandexpensestatementsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param fin_incomeandexpensestatementsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delFinIncomeandexpensestatementsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String delFinIncomeandexpensestatementsgmt(String fin_incomeandexpensestatementsgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != fin_incomeandexpensestatementsgmt_id && !"".equals(fin_incomeandexpensestatementsgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("fin_incomeandexpensestatementsgmt_id",fin_incomeandexpensestatementsgmt_id.split(","));
			i=finIncomeandexpensestatementsgmtService.delFinIncomeandexpensestatementsgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param fin_incomeandexpensestatementsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyFinIncomeandexpensestatementsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String copyFinIncomeandexpensestatementsgmt(String fin_incomeandexpensestatementsgmt_id,HttpServletRequest request){
		int i = 0;
		FinIncomeandexpensestatementsgmt finIncomeandexpensestatementsgmt = finIncomeandexpensestatementsgmtService.getFinIncomeandexpensestatementsgmtById(fin_incomeandexpensestatementsgmt_id);
		if(null != finIncomeandexpensestatementsgmt && !"".equals(finIncomeandexpensestatementsgmt)){
			finIncomeandexpensestatementsgmt.setFin_incomeandexpensestatementsgmt_id(UUID.toUUID());
			i=finIncomeandexpensestatementsgmtService.addFinIncomeandexpensestatementsgmt(finIncomeandexpensestatementsgmt);
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
	@RequestMapping(value="/exportFinIncomeandexpensestatementsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public void exportFinIncomeandexpensestatementsgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
