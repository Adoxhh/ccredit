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
import ccredit.loanmodules.loanmodel.LoanCtrctcertrelsgmt;
import ccredit.loanmodules.loanservice.LoanCtrctcertrelsgmtService;

/**
* 共同受信人信息 
* 2018-04-28 11:02:26  yangzhou
*/
@Controller
@RequestMapping("/loanCtrctcertrelsgmtController")
public class LoanCtrctcertrelsgmtController extends BaseAction{
	@Autowired
	private LoanCtrctcertrelsgmtService loanCtrctcertrelsgmtService;
	/**
	* 载入初始化页面
	* @param loan_ctrctcertrelsgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadLoanCtrctcertrelsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public ModelAndView loadLoanCtrctcertrelsgmt(LoanCtrctcertrelsgmt loanCtrctcertrelsgmt,HttpServletRequest request){
		return new ModelAndView("pc/loan/loan-ctrctcertrelsgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param loan_ctrctcertrelsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getLoanCtrctcertrelsgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getLoanCtrctcertrelsgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<LoanCtrctcertrelsgmt> loanCtrctcertrelsgmtList = loanCtrctcertrelsgmtService.getLoanCtrctcertrelsgmtListByCondition(condition);
		PageInfo<LoanCtrctcertrelsgmt> page = new PageInfo<LoanCtrctcertrelsgmt>(loanCtrctcertrelsgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param loan_ctrctcertrelsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getLoanCtrctcertrelsgmtById",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getLoanCtrctcertrelsgmtById(String loan_ctrctcertrelsgmt_id,HttpServletRequest request){
		LoanCtrctcertrelsgmt loanCtrctcertrelsgmt = loanCtrctcertrelsgmtService.getLoanCtrctcertrelsgmtById(loan_ctrctcertrelsgmt_id);
		return outDataStr2(loanCtrctcertrelsgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param loan_ctrctcertrelsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addLoanCtrctcertrelsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String addLoanCtrctcertrelsgmt(LoanCtrctcertrelsgmt loanCtrctcertrelsgmt,HttpServletRequest request){
		int i = 0;
		if(null != loanCtrctcertrelsgmt && !"".equals(loanCtrctcertrelsgmt)){
			loanCtrctcertrelsgmt.setLoan_ctrctcertrelsgmt_id(UUID.toUUID());
			loanCtrctcertrelsgmt.setLastdate(new Date(System.currentTimeMillis()));
			loanCtrctcertrelsgmt.setChangeflag("1");
			i=loanCtrctcertrelsgmtService.addLoanCtrctcertrelsgmt(loanCtrctcertrelsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param loan_ctrctcertrelsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateLoanCtrctcertrelsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String updateLoanCtrctcertrelsgmt(LoanCtrctcertrelsgmt loanCtrctcertrelsgmt,HttpServletRequest request){
		int i = 0;
		if(null != loanCtrctcertrelsgmt && !"".equals(loanCtrctcertrelsgmt)){
			loanCtrctcertrelsgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=loanCtrctcertrelsgmtService.updateLoanCtrctcertrelsgmt(loanCtrctcertrelsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param loan_ctrctcertrelsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delLoanCtrctcertrelsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String delLoanCtrctcertrelsgmt(String loan_ctrctcertrelsgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != loan_ctrctcertrelsgmt_id && !"".equals(loan_ctrctcertrelsgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("loan_ctrctcertrelsgmt_id",loan_ctrctcertrelsgmt_id.split(","));
			i=loanCtrctcertrelsgmtService.delLoanCtrctcertrelsgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param loan_ctrctcertrelsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyLoanCtrctcertrelsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String copyLoanCtrctcertrelsgmt(String loan_ctrctcertrelsgmt_id,HttpServletRequest request){
		int i = 0;
		LoanCtrctcertrelsgmt loanCtrctcertrelsgmt = loanCtrctcertrelsgmtService.getLoanCtrctcertrelsgmtById(loan_ctrctcertrelsgmt_id);
		if(null != loanCtrctcertrelsgmt && !"".equals(loanCtrctcertrelsgmt)){
			loanCtrctcertrelsgmt.setLoan_ctrctcertrelsgmt_id(UUID.toUUID());
			i=loanCtrctcertrelsgmtService.addLoanCtrctcertrelsgmt(loanCtrctcertrelsgmt);
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
	@RequestMapping(value="/exportLoanCtrctcertrelsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public void exportLoanCtrctcertrelsgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
