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
import ccredit.loanmodules.loanmodel.LoanOrigcreditorinfsgmt;
import ccredit.loanmodules.loanservice.LoanOrigcreditorinfsgmtService;

/**
* 初始债权说明 
* 2018-04-27 16:32:12  yangzhou
*/
@Controller
@RequestMapping("/loanOrigcreditorinfsgmtController")
public class LoanOrigcreditorinfsgmtController extends BaseAction{
	@Autowired
	private LoanOrigcreditorinfsgmtService loanOrigcreditorinfsgmtService;
	/**
	* 载入初始化页面
	* @param loan_origcreditorinfsgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadLoanOrigcreditorinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public ModelAndView loadLoanOrigcreditorinfsgmt(LoanOrigcreditorinfsgmt loanOrigcreditorinfsgmt,HttpServletRequest request){
		return new ModelAndView("pc/loan/loan-origcreditorinfsgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param loan_origcreditorinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getLoanOrigcreditorinfsgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getLoanOrigcreditorinfsgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<LoanOrigcreditorinfsgmt> loanOrigcreditorinfsgmtList = loanOrigcreditorinfsgmtService.getLoanOrigcreditorinfsgmtListByCondition(condition);
		PageInfo<LoanOrigcreditorinfsgmt> page = new PageInfo<LoanOrigcreditorinfsgmt>(loanOrigcreditorinfsgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param loan_origcreditorinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getLoanOrigcreditorinfsgmtById",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getLoanOrigcreditorinfsgmtById(String loan_origcreditorinfsgmt_id,HttpServletRequest request){
		LoanOrigcreditorinfsgmt loanOrigcreditorinfsgmt = loanOrigcreditorinfsgmtService.getLoanOrigcreditorinfsgmtById(loan_origcreditorinfsgmt_id);
		return outDataStr2(loanOrigcreditorinfsgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param loan_origcreditorinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addLoanOrigcreditorinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String addLoanOrigcreditorinfsgmt(LoanOrigcreditorinfsgmt loanOrigcreditorinfsgmt,HttpServletRequest request){
		int i = 0;
		if(null != loanOrigcreditorinfsgmt && !"".equals(loanOrigcreditorinfsgmt)){
			loanOrigcreditorinfsgmt.setLoan_origcreditorinfsgmt_id(UUID.toUUID());
			i=loanOrigcreditorinfsgmtService.addLoanOrigcreditorinfsgmt(loanOrigcreditorinfsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param loan_origcreditorinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateLoanOrigcreditorinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String updateLoanOrigcreditorinfsgmt(LoanOrigcreditorinfsgmt loanOrigcreditorinfsgmt,HttpServletRequest request){
		int i = 0;
		if(null != loanOrigcreditorinfsgmt && !"".equals(loanOrigcreditorinfsgmt)){
			i=loanOrigcreditorinfsgmtService.updateLoanOrigcreditorinfsgmt(loanOrigcreditorinfsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param loan_origcreditorinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delLoanOrigcreditorinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String delLoanOrigcreditorinfsgmt(String loan_origcreditorinfsgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != loan_origcreditorinfsgmt_id && !"".equals(loan_origcreditorinfsgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("loan_origcreditorinfsgmt_id",loan_origcreditorinfsgmt_id.split(","));
			i=loanOrigcreditorinfsgmtService.delLoanOrigcreditorinfsgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param loan_origcreditorinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyLoanOrigcreditorinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String copyLoanOrigcreditorinfsgmt(String loan_origcreditorinfsgmt_id,HttpServletRequest request){
		int i = 0;
		LoanOrigcreditorinfsgmt loanOrigcreditorinfsgmt = loanOrigcreditorinfsgmtService.getLoanOrigcreditorinfsgmtById(loan_origcreditorinfsgmt_id);
		if(null != loanOrigcreditorinfsgmt && !"".equals(loanOrigcreditorinfsgmt)){
			loanOrigcreditorinfsgmt.setLoan_origcreditorinfsgmt_id(UUID.toUUID());
			i=loanOrigcreditorinfsgmtService.addLoanOrigcreditorinfsgmt(loanOrigcreditorinfsgmt);
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
	@RequestMapping(value="/exportLoanOrigcreditorinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public void exportLoanOrigcreditorinfsgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
