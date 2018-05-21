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
import ccredit.loanmodules.loanmodel.LoanRltrepymtinfsgmt;
import ccredit.loanmodules.loanservice.LoanRltrepymtinfsgmtService;

/**
* 相关还款责任人 
* 2018-04-27 16:25:40  yangzhou
*/
@Controller
@RequestMapping("/loanRltrepymtinfsgmtController")
public class LoanRltrepymtinfsgmtController extends BaseAction{
	@Autowired
	private LoanRltrepymtinfsgmtService loanRltrepymtinfsgmtService;
	/**
	* 载入初始化页面
	* @param loan_rltrepymtinfsgmt 
	* @param request 
	* @return
	*/
	@RequestMapping (value="/loadLoanRltrepymtinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView loadLoanRltrepymtinfsgmt(LoanRltrepymtinfsgmt loanRltrepymtinfsgmt,HttpServletRequest request){
		return new ModelAndView("pc/loan/loan-rltrepymtinfsgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param loan_rltrepymtinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getLoanRltrepymtinfsgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getLoanRltrepymtinfsgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<LoanRltrepymtinfsgmt> loanRltrepymtinfsgmtList = loanRltrepymtinfsgmtService.getLoanRltrepymtinfsgmtListByCondition(condition);
		PageInfo<LoanRltrepymtinfsgmt> page = new PageInfo<LoanRltrepymtinfsgmt>(loanRltrepymtinfsgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param loan_rltrepymtinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getLoanRltrepymtinfsgmtById",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getLoanRltrepymtinfsgmtById(String loan_rltrepymtinfsgmt_id,HttpServletRequest request){
		LoanRltrepymtinfsgmt loanRltrepymtinfsgmt = loanRltrepymtinfsgmtService.getLoanRltrepymtinfsgmtById(loan_rltrepymtinfsgmt_id);
		return outDataStr2(loanRltrepymtinfsgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param loan_rltrepymtinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addLoanRltrepymtinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String addLoanRltrepymtinfsgmt(LoanRltrepymtinfsgmt loanRltrepymtinfsgmt,HttpServletRequest request){
		int i = 0;
		if(null != loanRltrepymtinfsgmt && !"".equals(loanRltrepymtinfsgmt)){
			loanRltrepymtinfsgmt.setLoan_rltrepymtinfsgmt_id(UUID.toUUID());
			i=loanRltrepymtinfsgmtService.addLoanRltrepymtinfsgmt(loanRltrepymtinfsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param loan_rltrepymtinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateLoanRltrepymtinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String updateLoanRltrepymtinfsgmt(LoanRltrepymtinfsgmt loanRltrepymtinfsgmt,HttpServletRequest request){
		int i = 0;
		if(null != loanRltrepymtinfsgmt && !"".equals(loanRltrepymtinfsgmt)){
			i=loanRltrepymtinfsgmtService.updateLoanRltrepymtinfsgmt(loanRltrepymtinfsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param loan_rltrepymtinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delLoanRltrepymtinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
public String delLoanRltrepymtinfsgmt(String loan_rltrepymtinfsgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != loan_rltrepymtinfsgmt_id && !"".equals(loan_rltrepymtinfsgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("loan_rltrepymtinfsgmt_id",loan_rltrepymtinfsgmt_id.split(","));
			i=loanRltrepymtinfsgmtService.delLoanRltrepymtinfsgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param loan_rltrepymtinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyLoanRltrepymtinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String copyLoanRltrepymtinfsgmt(String loan_rltrepymtinfsgmt_id,HttpServletRequest request){
		int i = 0;
		LoanRltrepymtinfsgmt loanRltrepymtinfsgmt = loanRltrepymtinfsgmtService.getLoanRltrepymtinfsgmtById(loan_rltrepymtinfsgmt_id);
		if(null != loanRltrepymtinfsgmt && !"".equals(loanRltrepymtinfsgmt)){
			loanRltrepymtinfsgmt.setLoan_rltrepymtinfsgmt_id(UUID.toUUID());
			i=loanRltrepymtinfsgmtService.addLoanRltrepymtinfsgmt(loanRltrepymtinfsgmt);
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
	@RequestMapping(value="/exportLoanRltrepymtinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public void exportLoanRltrepymtinfsgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
