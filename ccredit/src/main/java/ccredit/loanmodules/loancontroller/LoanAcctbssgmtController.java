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
import ccredit.xtmodules.xtcore.base.BaseAction;
import ccredit.xtmodules.xtcore.base.BaseSearch;
import ccredit.xtmodules.xtcore.util.excel.poi.ExportExcel;
import ccredit.xtmodules.xtservice.XtDataDictionaryService;
import ccredit.xtmodules.xtcore.util.UUID;
import ccredit.loanmodules.loanmodel.LoanAcctbssgmt;
import ccredit.loanmodules.loanservice.LoanAcctbssgmtService;

/**
* 企业借贷信息基础段 
* 2018-04-26 14:53:04  yangzhou
*/
@Controller
@RequestMapping("/loanAcctbssgmtController")
public class LoanAcctbssgmtController extends BaseAction{
	@Autowired
	private LoanAcctbssgmtService loanAcctbssgmtService;
	@Autowired
	private XtDataDictionaryService xtDataDictionaryService;
	
	/**
	* 载入初始化页面
	* @param loan_acctbssgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadLoanAcctbssgmt",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView loadLoanAcctbssgmt(LoanAcctbssgmt loanAcctbssgmt,HttpServletRequest request){
		return new ModelAndView("pc/loan/loan-acctbssgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param loan_acctbssgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getLoanAcctbssgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	public String getLoanAcctbssgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<LoanAcctbssgmt> loanAcctbssgmtList = loanAcctbssgmtService.getLoanAcctbssgmtListByCondition(condition);
		PageInfo<LoanAcctbssgmt> page = new PageInfo<LoanAcctbssgmt>(loanAcctbssgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param loan_acctbssgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getLoanAcctbssgmtById",method={RequestMethod.POST,RequestMethod.GET})
	public String getLoanAcctbssgmtById(String loan_acctbssgmt_id,HttpServletRequest request){
		LoanAcctbssgmt loanAcctbssgmt = loanAcctbssgmtService.getLoanAcctbssgmtById(loan_acctbssgmt_id);
		return outDataStr2(loanAcctbssgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param loan_acctbssgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addLoanAcctbssgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String addLoanAcctbssgmt(LoanAcctbssgmt loanAcctbssgmt,HttpServletRequest request){
		int i = 0;
		if(null != loanAcctbssgmt && !"".equals(loanAcctbssgmt)){
			loanAcctbssgmt.setLoan_acctbssgmt_id(UUID.toUUID());
			
			i=loanAcctbssgmtService.addLoanAcctbssgmt(loanAcctbssgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param loan_acctbssgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateLoanAcctbssgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String updateLoanAcctbssgmt(LoanAcctbssgmt loanAcctbssgmt,HttpServletRequest request){
		int i = 0;
		if(null != loanAcctbssgmt && !"".equals(loanAcctbssgmt)){
			i=loanAcctbssgmtService.updateLoanAcctbssgmt(loanAcctbssgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param loan_acctbssgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delLoanAcctbssgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String delLoanAcctbssgmt(String loan_acctbssgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != loan_acctbssgmt_id && !"".equals(loan_acctbssgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("loan_acctbssgmt_id",loan_acctbssgmt_id.split(","));
			i=loanAcctbssgmtService.delLoanAcctbssgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param loan_acctbssgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyLoanAcctbssgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String copyLoanAcctbssgmt(String loan_acctbssgmt_id,HttpServletRequest request){
		int i = 0;
		LoanAcctbssgmt loanAcctbssgmt = loanAcctbssgmtService.getLoanAcctbssgmtById(loan_acctbssgmt_id);
		if(null != loanAcctbssgmt && !"".equals(loanAcctbssgmt)){
			loanAcctbssgmt.setLoan_acctbssgmt_id(UUID.toUUID());
			i=loanAcctbssgmtService.addLoanAcctbssgmt(loanAcctbssgmt);
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
	@RequestMapping(value="/exportLoanAcctbssgmt",method={RequestMethod.POST,RequestMethod.GET})
	public void exportLoanAcctbssgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
