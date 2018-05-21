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
import ccredit.loanmodules.loanmodel.LoanAcctcredsgmt;
import ccredit.loanmodules.loanservice.LoanAcctcredsgmtService;

/**
* 授信额度信息 
* 2018-04-27 16:30:17  yangzhou
*/
@Controller
@RequestMapping("/loanAcctcredsgmtController")
public class LoanAcctcredsgmtController extends BaseAction{
	@Autowired
	private LoanAcctcredsgmtService loanAcctcredsgmtService;
	/**
	* 载入初始化页面
	* @param loan_acctcredsgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadLoanAcctcredsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public ModelAndView loadLoanAcctcredsgmt(LoanAcctcredsgmt loanAcctcredsgmt,HttpServletRequest request){
		return new ModelAndView("pc/loan/loan-acctcredsgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param loan_acctcredsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getLoanAcctcredsgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public String getLoanAcctcredsgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<LoanAcctcredsgmt> loanAcctcredsgmtList = loanAcctcredsgmtService.getLoanAcctcredsgmtListByCondition(condition);
		PageInfo<LoanAcctcredsgmt> page = new PageInfo<LoanAcctcredsgmt>(loanAcctcredsgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param loan_acctcredsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getLoanAcctcredsgmtById",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public String getLoanAcctcredsgmtById(String loan_acctcredsgmt_id,HttpServletRequest request){
		LoanAcctcredsgmt loanAcctcredsgmt = loanAcctcredsgmtService.getLoanAcctcredsgmtById(loan_acctcredsgmt_id);
		return outDataStr2(loanAcctcredsgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param loan_acctcredsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addLoanAcctcredsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public String addLoanAcctcredsgmt(LoanAcctcredsgmt loanAcctcredsgmt,HttpServletRequest request){
		int i = 0;
		if(null != loanAcctcredsgmt && !"".equals(loanAcctcredsgmt)){
			loanAcctcredsgmt.setLoan_acctcredsgmt_id(UUID.toUUID());
			i=loanAcctcredsgmtService.addLoanAcctcredsgmt(loanAcctcredsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param loan_acctcredsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateLoanAcctcredsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public String updateLoanAcctcredsgmt(LoanAcctcredsgmt loanAcctcredsgmt,HttpServletRequest request){
		int i = 0;
		if(null != loanAcctcredsgmt && !"".equals(loanAcctcredsgmt)){
			i=loanAcctcredsgmtService.updateLoanAcctcredsgmt(loanAcctcredsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param loan_acctcredsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delLoanAcctcredsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public String delLoanAcctcredsgmt(String loan_acctcredsgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != loan_acctcredsgmt_id && !"".equals(loan_acctcredsgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("loan_acctcredsgmt_id",loan_acctcredsgmt_id.split(","));
			i=loanAcctcredsgmtService.delLoanAcctcredsgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param loan_acctcredsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyLoanAcctcredsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public String copyLoanAcctcredsgmt(String loan_acctcredsgmt_id,HttpServletRequest request){
		int i = 0;
		LoanAcctcredsgmt loanAcctcredsgmt = loanAcctcredsgmtService.getLoanAcctcredsgmtById(loan_acctcredsgmt_id);
		if(null != loanAcctcredsgmt && !"".equals(loanAcctcredsgmt)){
			loanAcctcredsgmt.setLoan_acctcredsgmt_id(UUID.toUUID());
			i=loanAcctcredsgmtService.addLoanAcctcredsgmt(loanAcctcredsgmt);
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
	@RequestMapping(value="/exportLoanAcctcredsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public void exportLoanAcctcredsgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
