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
import ccredit.loanmodules.loanmodel.LoanAcctspectrstdspnsgmt;
import ccredit.loanmodules.loanservice.LoanAcctspectrstdspnsgmtService;

/**
* 特定交易说明 
* 2018-04-27 16:37:31  yangzhou
*/
@Controller
@RequestMapping("/loanAcctspectrstdspnsgmtController")
public class LoanAcctspectrstdspnsgmtController extends BaseAction{
	@Autowired
	private LoanAcctspectrstdspnsgmtService loanAcctspectrstdspnsgmtService;
	/**
	* 载入初始化页面
	* @param loan_acctspectrstdspnsgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadLoanAcctspectrstdspnsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public ModelAndView loadLoanAcctspectrstdspnsgmt(LoanAcctspectrstdspnsgmt loanAcctspectrstdspnsgmt,HttpServletRequest request){
		return new ModelAndView("pc/loan/loan-acctspectrstdspnsgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param loan_acctspectrstdspnsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getLoanAcctspectrstdspnsgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public String getLoanAcctspectrstdspnsgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<LoanAcctspectrstdspnsgmt> loanAcctspectrstdspnsgmtList = loanAcctspectrstdspnsgmtService.getLoanAcctspectrstdspnsgmtListByCondition(condition);
		PageInfo<LoanAcctspectrstdspnsgmt> page = new PageInfo<LoanAcctspectrstdspnsgmt>(loanAcctspectrstdspnsgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param loan_acctspectrstdspnsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getLoanAcctspectrstdspnsgmtById",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public String getLoanAcctspectrstdspnsgmtById(String loan_acctspectrstdspnsgmt_id,HttpServletRequest request){
		LoanAcctspectrstdspnsgmt loanAcctspectrstdspnsgmt = loanAcctspectrstdspnsgmtService.getLoanAcctspectrstdspnsgmtById(loan_acctspectrstdspnsgmt_id);
		return outDataStr2(loanAcctspectrstdspnsgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param loan_acctspectrstdspnsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addLoanAcctspectrstdspnsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public String addLoanAcctspectrstdspnsgmt(LoanAcctspectrstdspnsgmt loanAcctspectrstdspnsgmt,HttpServletRequest request){
		int i = 0;
		if(null != loanAcctspectrstdspnsgmt && !"".equals(loanAcctspectrstdspnsgmt)){
			loanAcctspectrstdspnsgmt.setLoan_acctspectrstdspnsgmt_id(UUID.toUUID());
			i=loanAcctspectrstdspnsgmtService.addLoanAcctspectrstdspnsgmt(loanAcctspectrstdspnsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param loan_acctspectrstdspnsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateLoanAcctspectrstdspnsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public String updateLoanAcctspectrstdspnsgmt(LoanAcctspectrstdspnsgmt loanAcctspectrstdspnsgmt,HttpServletRequest request){
		int i = 0;
		if(null != loanAcctspectrstdspnsgmt && !"".equals(loanAcctspectrstdspnsgmt)){
			i=loanAcctspectrstdspnsgmtService.updateLoanAcctspectrstdspnsgmt(loanAcctspectrstdspnsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param loan_acctspectrstdspnsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delLoanAcctspectrstdspnsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public String delLoanAcctspectrstdspnsgmt(String loan_acctspectrstdspnsgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != loan_acctspectrstdspnsgmt_id && !"".equals(loan_acctspectrstdspnsgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("loan_acctspectrstdspnsgmt_id",loan_acctspectrstdspnsgmt_id.split(","));
			i=loanAcctspectrstdspnsgmtService.delLoanAcctspectrstdspnsgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param loan_acctspectrstdspnsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyLoanAcctspectrstdspnsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public String copyLoanAcctspectrstdspnsgmt(String loan_acctspectrstdspnsgmt_id,HttpServletRequest request){
		int i = 0;
		LoanAcctspectrstdspnsgmt loanAcctspectrstdspnsgmt = loanAcctspectrstdspnsgmtService.getLoanAcctspectrstdspnsgmtById(loan_acctspectrstdspnsgmt_id);
		if(null != loanAcctspectrstdspnsgmt && !"".equals(loanAcctspectrstdspnsgmt)){
			loanAcctspectrstdspnsgmt.setLoan_acctspectrstdspnsgmt_id(UUID.toUUID());
			i=loanAcctspectrstdspnsgmtService.addLoanAcctspectrstdspnsgmt(loanAcctspectrstdspnsgmt);
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
	@RequestMapping(value="/exportLoanAcctspectrstdspnsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public void exportLoanAcctspectrstdspnsgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
