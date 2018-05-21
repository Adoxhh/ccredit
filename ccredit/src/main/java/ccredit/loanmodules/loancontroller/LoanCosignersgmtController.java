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
import ccredit.loanmodules.loanmodel.LoanCosignersgmt;
import ccredit.loanmodules.loanservice.LoanCosignersgmtService;

/**
* 联保人信息 
* 2018-04-28 15:18:11  yangzhou
*/
@Controller
@RequestMapping("/loanCosignersgmtController")
public class LoanCosignersgmtController extends BaseAction{
	@Autowired
	private LoanCosignersgmtService loanCosignersgmtService;
	/**
	* 载入初始化页面
	* @param loan_cosignersgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadLoanCosignersgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public ModelAndView loadLoanCosignersgmt(LoanCosignersgmt loanCosignersgmt,HttpServletRequest request){
		return new ModelAndView("pc/loan/loan-cosignersgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param loan_cosignersgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getLoanCosignersgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getLoanCosignersgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<LoanCosignersgmt> loanCosignersgmtList = loanCosignersgmtService.getLoanCosignersgmtListByCondition(condition);
		PageInfo<LoanCosignersgmt> page = new PageInfo<LoanCosignersgmt>(loanCosignersgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param loan_cosignersgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getLoanCosignersgmtById",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getLoanCosignersgmtById(String loan_cosignersgmt_id,HttpServletRequest request){
		LoanCosignersgmt loanCosignersgmt = loanCosignersgmtService.getLoanCosignersgmtById(loan_cosignersgmt_id);
		return outDataStr2(loanCosignersgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param loan_cosignersgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addLoanCosignersgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String addLoanCosignersgmt(LoanCosignersgmt loanCosignersgmt,HttpServletRequest request){
		int i = 0;
		if(null != loanCosignersgmt && !"".equals(loanCosignersgmt)){
			loanCosignersgmt.setLoan_cosignersgmt_id(UUID.toUUID());
			loanCosignersgmt.setLastdate(new Date(System.currentTimeMillis()));
			loanCosignersgmt.setChangeflag("1");
			i=loanCosignersgmtService.addLoanCosignersgmt(loanCosignersgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param loan_cosignersgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateLoanCosignersgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String updateLoanCosignersgmt(LoanCosignersgmt loanCosignersgmt,HttpServletRequest request){
		int i = 0;
		if(null != loanCosignersgmt && !"".equals(loanCosignersgmt)){
			loanCosignersgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=loanCosignersgmtService.updateLoanCosignersgmt(loanCosignersgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param loan_cosignersgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delLoanCosignersgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String delLoanCosignersgmt(String loan_cosignersgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != loan_cosignersgmt_id && !"".equals(loan_cosignersgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("loan_cosignersgmt_id",loan_cosignersgmt_id.split(","));
			i=loanCosignersgmtService.delLoanCosignersgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param loan_cosignersgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyLoanCosignersgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String copyLoanCosignersgmt(String loan_cosignersgmt_id,HttpServletRequest request){
		int i = 0;
		LoanCosignersgmt loanCosignersgmt = loanCosignersgmtService.getLoanCosignersgmtById(loan_cosignersgmt_id);
		if(null != loanCosignersgmt && !"".equals(loanCosignersgmt)){
			loanCosignersgmt.setLoan_cosignersgmt_id(UUID.toUUID());
			i=loanCosignersgmtService.addLoanCosignersgmt(loanCosignersgmt);
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
	@RequestMapping(value="/exportLoanCosignersgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public void exportLoanCosignersgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
