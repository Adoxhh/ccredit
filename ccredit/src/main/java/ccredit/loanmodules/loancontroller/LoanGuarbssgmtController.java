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
import ccredit.loanmodules.loanmodel.LoanGuarbssgmt;
import ccredit.loanmodules.loanservice.LoanGuarbssgmtService;

/**
* 最高额保证合同信息基础段 
* 2018-04-28 16:04:23  yangzhou
*/
@Controller
@RequestMapping("/loanGuarbssgmtController")
public class LoanGuarbssgmtController extends BaseAction{
	@Autowired
	private LoanGuarbssgmtService loanGuarbssgmtService;
	/**
	* 载入初始化页面
	* @param loan_guarbssgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadLoanGuarbssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public ModelAndView loadLoanGuarbssgmt(LoanGuarbssgmt loanGuarbssgmt,HttpServletRequest request){
		return new ModelAndView("pc/loan/loan-guarbssgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param loan_guarbssgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getLoanGuarbssgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getLoanGuarbssgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<LoanGuarbssgmt> loanGuarbssgmtList = loanGuarbssgmtService.getLoanGuarbssgmtListByCondition(condition);
		PageInfo<LoanGuarbssgmt> page = new PageInfo<LoanGuarbssgmt>(loanGuarbssgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param loan_guarbssgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getLoanGuarbssgmtById",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getLoanGuarbssgmtById(String loan_guarbssgmt_id,HttpServletRequest request){
		LoanGuarbssgmt loanGuarbssgmt = loanGuarbssgmtService.getLoanGuarbssgmtById(loan_guarbssgmt_id);
		return outDataStr2(loanGuarbssgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param loan_guarbssgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addLoanGuarbssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String addLoanGuarbssgmt(LoanGuarbssgmt loanGuarbssgmt,HttpServletRequest request){
		int i = 0;
		if(null != loanGuarbssgmt && !"".equals(loanGuarbssgmt)){
			loanGuarbssgmt.setLoan_guarbssgmt_id(UUID.toUUID());
			loanGuarbssgmt.setLastdate(new Date(System.currentTimeMillis()));
			loanGuarbssgmt.setChangeflag("1");
			i=loanGuarbssgmtService.addLoanGuarbssgmt(loanGuarbssgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param loan_guarbssgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateLoanGuarbssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String updateLoanGuarbssgmt(LoanGuarbssgmt loanGuarbssgmt,HttpServletRequest request){
		int i = 0;
		if(null != loanGuarbssgmt && !"".equals(loanGuarbssgmt)){
			loanGuarbssgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=loanGuarbssgmtService.updateLoanGuarbssgmt(loanGuarbssgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param loan_guarbssgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delLoanGuarbssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String delLoanGuarbssgmt(String loan_guarbssgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != loan_guarbssgmt_id && !"".equals(loan_guarbssgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("loan_guarbssgmt_id",loan_guarbssgmt_id.split(","));
			i=loanGuarbssgmtService.delLoanGuarbssgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param loan_guarbssgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyLoanGuarbssgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String copyLoanGuarbssgmt(String loan_guarbssgmt_id,HttpServletRequest request){
		int i = 0;
		LoanGuarbssgmt loanGuarbssgmt = loanGuarbssgmtService.getLoanGuarbssgmtById(loan_guarbssgmt_id);
		if(null != loanGuarbssgmt && !"".equals(loanGuarbssgmt)){
			loanGuarbssgmt.setLoan_guarbssgmt_id(UUID.toUUID());
			i=loanGuarbssgmtService.addLoanGuarbssgmt(loanGuarbssgmt);
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
	@RequestMapping(value="/exportLoanGuarbssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public void exportLoanGuarbssgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
