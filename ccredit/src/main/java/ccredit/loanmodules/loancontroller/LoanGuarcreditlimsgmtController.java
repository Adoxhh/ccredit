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
import ccredit.loanmodules.loanmodel.LoanGuarcreditlimsgmt;
import ccredit.loanmodules.loanservice.LoanGuarcreditlimsgmtService;

/**
* 最高额额度信息 
* 2018-04-28 15:20:42  yangzhou
*/
@Controller
@RequestMapping("/loanGuarcreditlimsgmtController")
public class LoanGuarcreditlimsgmtController extends BaseAction{
	@Autowired
	private LoanGuarcreditlimsgmtService loanGuarcreditlimsgmtService;
	/**
	* 载入初始化页面
	* @param loan_guarcreditlimsgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadLoanGuarcreditlimsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public ModelAndView loadLoanGuarcreditlimsgmt(LoanGuarcreditlimsgmt loanGuarcreditlimsgmt,HttpServletRequest request){
		return new ModelAndView("pc/loan/loan-guarcreditlimsgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param loan_guarcreditlimsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getLoanGuarcreditlimsgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getLoanGuarcreditlimsgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<LoanGuarcreditlimsgmt> loanGuarcreditlimsgmtList = loanGuarcreditlimsgmtService.getLoanGuarcreditlimsgmtListByCondition(condition);
		PageInfo<LoanGuarcreditlimsgmt> page = new PageInfo<LoanGuarcreditlimsgmt>(loanGuarcreditlimsgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param loan_guarcreditlimsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getLoanGuarcreditlimsgmtById",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getLoanGuarcreditlimsgmtById(String loan_guarcreditlimsgmt_id,HttpServletRequest request){
		LoanGuarcreditlimsgmt loanGuarcreditlimsgmt = loanGuarcreditlimsgmtService.getLoanGuarcreditlimsgmtById(loan_guarcreditlimsgmt_id);
		return outDataStr2(loanGuarcreditlimsgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param loan_guarcreditlimsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addLoanGuarcreditlimsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String addLoanGuarcreditlimsgmt(LoanGuarcreditlimsgmt loanGuarcreditlimsgmt,HttpServletRequest request){
		int i = 0;
		if(null != loanGuarcreditlimsgmt && !"".equals(loanGuarcreditlimsgmt)){
			loanGuarcreditlimsgmt.setLoan_guarcreditlimsgmt_id(UUID.toUUID());
			loanGuarcreditlimsgmt.setLastdate(new Date(System.currentTimeMillis()));
			loanGuarcreditlimsgmt.setChangeflag("1");
			i=loanGuarcreditlimsgmtService.addLoanGuarcreditlimsgmt(loanGuarcreditlimsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param loan_guarcreditlimsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateLoanGuarcreditlimsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String updateLoanGuarcreditlimsgmt(LoanGuarcreditlimsgmt loanGuarcreditlimsgmt,HttpServletRequest request){
		int i = 0;
		if(null != loanGuarcreditlimsgmt && !"".equals(loanGuarcreditlimsgmt)){
			loanGuarcreditlimsgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=loanGuarcreditlimsgmtService.updateLoanGuarcreditlimsgmt(loanGuarcreditlimsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param loan_guarcreditlimsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delLoanGuarcreditlimsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String delLoanGuarcreditlimsgmt(String loan_guarcreditlimsgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != loan_guarcreditlimsgmt_id && !"".equals(loan_guarcreditlimsgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("loan_guarcreditlimsgmt_id",loan_guarcreditlimsgmt_id.split(","));
			i=loanGuarcreditlimsgmtService.delLoanGuarcreditlimsgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param loan_guarcreditlimsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyLoanGuarcreditlimsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String copyLoanGuarcreditlimsgmt(String loan_guarcreditlimsgmt_id,HttpServletRequest request){
		int i = 0;
		LoanGuarcreditlimsgmt loanGuarcreditlimsgmt = loanGuarcreditlimsgmtService.getLoanGuarcreditlimsgmtById(loan_guarcreditlimsgmt_id);
		if(null != loanGuarcreditlimsgmt && !"".equals(loanGuarcreditlimsgmt)){
			loanGuarcreditlimsgmt.setLoan_guarcreditlimsgmt_id(UUID.toUUID());
			i=loanGuarcreditlimsgmtService.addLoanGuarcreditlimsgmt(loanGuarcreditlimsgmt);
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
	@RequestMapping(value="/exportLoanGuarcreditlimsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public void exportLoanGuarcreditlimsgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
