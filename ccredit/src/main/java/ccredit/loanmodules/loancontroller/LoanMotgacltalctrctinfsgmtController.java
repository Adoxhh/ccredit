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
import ccredit.loanmodules.loanmodel.LoanMotgacltalctrctinfsgmt;
import ccredit.loanmodules.loanservice.LoanMotgacltalctrctinfsgmtService;

/**
* 抵质押物信息 
* 2018-04-27 16:27:40  yangzhou
*/
@Controller
@RequestMapping("/loanMotgacltalctrctinfsgmtController")
public class LoanMotgacltalctrctinfsgmtController extends BaseAction{
	@Autowired
	private LoanMotgacltalctrctinfsgmtService loanMotgacltalctrctinfsgmtService;
	/**
	* 载入初始化页面
	* @param loan_motgacltalctrctinfsgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadLoanMotgacltalctrctinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
public ModelAndView loadLoanMotgacltalctrctinfsgmt(LoanMotgacltalctrctinfsgmt loanMotgacltalctrctinfsgmt,HttpServletRequest request){
		return new ModelAndView("pc/loan/loan-motgacltalctrctinfsgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param loan_motgacltalctrctinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getLoanMotgacltalctrctinfsgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
public String getLoanMotgacltalctrctinfsgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<LoanMotgacltalctrctinfsgmt> loanMotgacltalctrctinfsgmtList = loanMotgacltalctrctinfsgmtService.getLoanMotgacltalctrctinfsgmtListByCondition(condition);
		PageInfo<LoanMotgacltalctrctinfsgmt> page = new PageInfo<LoanMotgacltalctrctinfsgmt>(loanMotgacltalctrctinfsgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param loan_motgacltalctrctinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getLoanMotgacltalctrctinfsgmtById",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
public String getLoanMotgacltalctrctinfsgmtById(String loan_motgacltalctrctinfsgmt_id,HttpServletRequest request){
		LoanMotgacltalctrctinfsgmt loanMotgacltalctrctinfsgmt = loanMotgacltalctrctinfsgmtService.getLoanMotgacltalctrctinfsgmtById(loan_motgacltalctrctinfsgmt_id);
		return outDataStr2(loanMotgacltalctrctinfsgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param loan_motgacltalctrctinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addLoanMotgacltalctrctinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
public String addLoanMotgacltalctrctinfsgmt(LoanMotgacltalctrctinfsgmt loanMotgacltalctrctinfsgmt,HttpServletRequest request){
		int i = 0;
		if(null != loanMotgacltalctrctinfsgmt && !"".equals(loanMotgacltalctrctinfsgmt)){
			loanMotgacltalctrctinfsgmt.setLoan_motgacltalctrctinfsgmt_id(UUID.toUUID());
			i=loanMotgacltalctrctinfsgmtService.addLoanMotgacltalctrctinfsgmt(loanMotgacltalctrctinfsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param loan_motgacltalctrctinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateLoanMotgacltalctrctinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
public String updateLoanMotgacltalctrctinfsgmt(LoanMotgacltalctrctinfsgmt loanMotgacltalctrctinfsgmt,HttpServletRequest request){
		int i = 0;
		if(null != loanMotgacltalctrctinfsgmt && !"".equals(loanMotgacltalctrctinfsgmt)){
			i=loanMotgacltalctrctinfsgmtService.updateLoanMotgacltalctrctinfsgmt(loanMotgacltalctrctinfsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param loan_motgacltalctrctinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delLoanMotgacltalctrctinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
public String delLoanMotgacltalctrctinfsgmt(String loan_motgacltalctrctinfsgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != loan_motgacltalctrctinfsgmt_id && !"".equals(loan_motgacltalctrctinfsgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("loan_motgacltalctrctinfsgmt_id",loan_motgacltalctrctinfsgmt_id.split(","));
			i=loanMotgacltalctrctinfsgmtService.delLoanMotgacltalctrctinfsgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param loan_motgacltalctrctinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyLoanMotgacltalctrctinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
public String copyLoanMotgacltalctrctinfsgmt(String loan_motgacltalctrctinfsgmt_id,HttpServletRequest request){
		int i = 0;
		LoanMotgacltalctrctinfsgmt loanMotgacltalctrctinfsgmt = loanMotgacltalctrctinfsgmtService.getLoanMotgacltalctrctinfsgmtById(loan_motgacltalctrctinfsgmt_id);
		if(null != loanMotgacltalctrctinfsgmt && !"".equals(loanMotgacltalctrctinfsgmt)){
			loanMotgacltalctrctinfsgmt.setLoan_motgacltalctrctinfsgmt_id(UUID.toUUID());
			i=loanMotgacltalctrctinfsgmtService.addLoanMotgacltalctrctinfsgmt(loanMotgacltalctrctinfsgmt);
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
	@RequestMapping(value="/exportLoanMotgacltalctrctinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
public void exportLoanMotgacltalctrctinfsgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
