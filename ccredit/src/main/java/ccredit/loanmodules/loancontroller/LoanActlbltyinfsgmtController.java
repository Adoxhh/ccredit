package ccredit.loanmodules.loancontroller;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.github.pagehelper.PageInfo;

import ccredit.xtmodules.xtcore.annotation.AuthUneedLogin;
import ccredit.xtmodules.xtcore.base.BaseAction;
import ccredit.xtmodules.xtcore.base.BaseSearch;
import ccredit.xtmodules.xtcore.util.excel.poi.ExportExcel;
import ccredit.xtmodules.xtcore.util.UUID;
import ccredit.loanmodules.loanmodel.LoanActlbltyinfsgmt;
import ccredit.loanmodules.loanservice.LoanActlbltyinfsgmtService;

/**
* 还款表现信息 
* 2018-04-27 16:35:45  yangzhou
*/
@Controller
@RequestMapping("/loanActlbltyinfsgmtController")
public class LoanActlbltyinfsgmtController extends BaseAction{
	@Autowired
	private LoanActlbltyinfsgmtService loanActlbltyinfsgmtService;
	/**
	* 载入初始化页面
	* @param loan_actlbltyinfsgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadLoanActlbltyinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public ModelAndView loadLoanActlbltyinfsgmt(LoanActlbltyinfsgmt loanActlbltyinfsgmt,HttpServletRequest request){
		return new ModelAndView("pc/loan/loan-actlbltyinfsgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param loan_actlbltyinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getLoanActlbltyinfsgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public String getLoanActlbltyinfsgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<LoanActlbltyinfsgmt> loanActlbltyinfsgmtList = loanActlbltyinfsgmtService.getLoanActlbltyinfsgmtListByCondition(condition);
		PageInfo<LoanActlbltyinfsgmt> page = new PageInfo<LoanActlbltyinfsgmt>(loanActlbltyinfsgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param loan_actlbltyinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getLoanActlbltyinfsgmtById",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public String getLoanActlbltyinfsgmtById(String loan_actlbltyinfsgmt_id,HttpServletRequest request){
		LoanActlbltyinfsgmt loanActlbltyinfsgmt = loanActlbltyinfsgmtService.getLoanActlbltyinfsgmtById(loan_actlbltyinfsgmt_id);
		return outDataStr2(loanActlbltyinfsgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param loan_actlbltyinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addLoanActlbltyinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public String addLoanActlbltyinfsgmt(LoanActlbltyinfsgmt loanActlbltyinfsgmt,HttpServletRequest request){
		int i = 0;
		if(null != loanActlbltyinfsgmt && !"".equals(loanActlbltyinfsgmt)){
			loanActlbltyinfsgmt.setLoan_actlbltyinfsgmt_id(UUID.toUUID());
			i=loanActlbltyinfsgmtService.addLoanActlbltyinfsgmt(loanActlbltyinfsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param loan_actlbltyinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateLoanActlbltyinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public String updateLoanActlbltyinfsgmt(LoanActlbltyinfsgmt loanActlbltyinfsgmt,HttpServletRequest request){
		int i = 0;
		if(null != loanActlbltyinfsgmt && !"".equals(loanActlbltyinfsgmt)){
			i=loanActlbltyinfsgmtService.updateLoanActlbltyinfsgmt(loanActlbltyinfsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param loan_actlbltyinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delLoanActlbltyinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public String delLoanActlbltyinfsgmt(String loan_actlbltyinfsgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != loan_actlbltyinfsgmt_id && !"".equals(loan_actlbltyinfsgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("loan_actlbltyinfsgmt_id",loan_actlbltyinfsgmt_id.split(","));
			i=loanActlbltyinfsgmtService.delLoanActlbltyinfsgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param loan_actlbltyinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyLoanActlbltyinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public String copyLoanActlbltyinfsgmt(String loan_actlbltyinfsgmt_id,HttpServletRequest request){
		int i = 0;
		LoanActlbltyinfsgmt loanActlbltyinfsgmt = loanActlbltyinfsgmtService.getLoanActlbltyinfsgmtById(loan_actlbltyinfsgmt_id);
		if(null != loanActlbltyinfsgmt && !"".equals(loanActlbltyinfsgmt)){
			loanActlbltyinfsgmt.setLoan_actlbltyinfsgmt_id(UUID.toUUID());
			i=loanActlbltyinfsgmtService.addLoanActlbltyinfsgmt(loanActlbltyinfsgmt);
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
	@RequestMapping(value="/exportLoanActlbltyinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public void exportLoanActlbltyinfsgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
