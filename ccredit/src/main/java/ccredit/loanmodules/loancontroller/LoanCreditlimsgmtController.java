package ccredit.loanmodules.loancontroller;
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
import ccredit.loanmodules.loanmodel.LoanCreditlimsgmt;
import ccredit.loanmodules.loanservice.LoanCreditlimsgmtService;

/**
* 授信额度信息 
* 2018-04-28 11:05:34  yangzhou
*/
@Controller
@RequestMapping("/loanCreditlimsgmtController")
public class LoanCreditlimsgmtController extends BaseAction{
	@Autowired
	private LoanCreditlimsgmtService loanCreditlimsgmtService;
	/**
	* 载入初始化页面
	* @param loan_creditlimsgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadLoanCreditlimsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public ModelAndView loadLoanCreditlimsgmt(LoanCreditlimsgmt loanCreditlimsgmt,HttpServletRequest request){
		return new ModelAndView("pc/loan/loan-creditlimsgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param loan_creditlimsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getLoanCreditlimsgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getLoanCreditlimsgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<LoanCreditlimsgmt> loanCreditlimsgmtList = loanCreditlimsgmtService.getLoanCreditlimsgmtListByCondition(condition);
		PageInfo<LoanCreditlimsgmt> page = new PageInfo<LoanCreditlimsgmt>(loanCreditlimsgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param loan_creditlimsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getLoanCreditlimsgmtById",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getLoanCreditlimsgmtById(String loan_creditlimsgmt_id,HttpServletRequest request){
		LoanCreditlimsgmt loanCreditlimsgmt = loanCreditlimsgmtService.getLoanCreditlimsgmtById(loan_creditlimsgmt_id);
		return outDataStr2(loanCreditlimsgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param loan_creditlimsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addLoanCreditlimsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String addLoanCreditlimsgmt(LoanCreditlimsgmt loanCreditlimsgmt,HttpServletRequest request){
		int i = 0;
		if(null != loanCreditlimsgmt && !"".equals(loanCreditlimsgmt)){
			loanCreditlimsgmt.setLoan_creditlimsgmt_id(UUID.toUUID());
			loanCreditlimsgmt.setLastdate(new Date(System.currentTimeMillis()));
			loanCreditlimsgmt.setChangeflag("1");
			i=loanCreditlimsgmtService.addLoanCreditlimsgmt(loanCreditlimsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param loan_creditlimsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateLoanCreditlimsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String updateLoanCreditlimsgmt(LoanCreditlimsgmt loanCreditlimsgmt,HttpServletRequest request){
		int i = 0;
		if(null != loanCreditlimsgmt && !"".equals(loanCreditlimsgmt)){
			loanCreditlimsgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=loanCreditlimsgmtService.updateLoanCreditlimsgmt(loanCreditlimsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param loan_creditlimsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delLoanCreditlimsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String delLoanCreditlimsgmt(String loan_creditlimsgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != loan_creditlimsgmt_id && !"".equals(loan_creditlimsgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("loan_creditlimsgmt_id",loan_creditlimsgmt_id.split(","));
			i=loanCreditlimsgmtService.delLoanCreditlimsgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param loan_creditlimsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyLoanCreditlimsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String copyLoanCreditlimsgmt(String loan_creditlimsgmt_id,HttpServletRequest request){
		int i = 0;
		LoanCreditlimsgmt loanCreditlimsgmt = loanCreditlimsgmtService.getLoanCreditlimsgmtById(loan_creditlimsgmt_id);
		if(null != loanCreditlimsgmt && !"".equals(loanCreditlimsgmt)){
			loanCreditlimsgmt.setLoan_creditlimsgmt_id(UUID.toUUID());
			i=loanCreditlimsgmtService.addLoanCreditlimsgmt(loanCreditlimsgmt);
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
	@RequestMapping(value="/exportLoanCreditlimsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public void exportLoanCreditlimsgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
