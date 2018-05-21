package ccredit.loanmodules.loancontroller;
import java.util.List;
import java.util.Date;
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
import ccredit.loanmodules.loanmodel.LoanCtrctbssgmt;
import ccredit.loanmodules.loanservice.LoanCtrctbssgmtService;

/**
* 企业授信协议信息基础段 
* 2018-04-28 09:51:22  yangzhou
*/
@Controller
@RequestMapping("/loanCtrctbssgmtController")
public class LoanCtrctbssgmtController extends BaseAction{
	@Autowired
	private LoanCtrctbssgmtService loanCtrctbssgmtService;
	/**
	* 载入初始化页面
	* @param loan_ctrctbssgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadLoanCtrctbssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public ModelAndView loadLoanCtrctbssgmt(LoanCtrctbssgmt loanCtrctbssgmt,HttpServletRequest request){
		return new ModelAndView("pc/loan/loan-ctrctbssgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param loan_ctrctbssgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getLoanCtrctbssgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public String getLoanCtrctbssgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<LoanCtrctbssgmt> loanCtrctbssgmtList = loanCtrctbssgmtService.getLoanCtrctbssgmtListByCondition(condition);
		PageInfo<LoanCtrctbssgmt> page = new PageInfo<LoanCtrctbssgmt>(loanCtrctbssgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param loan_ctrctbssgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getLoanCtrctbssgmtById",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public String getLoanCtrctbssgmtById(String loan_ctrctbssgmt_id,HttpServletRequest request){
		LoanCtrctbssgmt loanCtrctbssgmt = loanCtrctbssgmtService.getLoanCtrctbssgmtById(loan_ctrctbssgmt_id);
		return outDataStr2(loanCtrctbssgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param loan_ctrctbssgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addLoanCtrctbssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public String addLoanCtrctbssgmt(LoanCtrctbssgmt loanCtrctbssgmt,HttpServletRequest request){
		int i = 0;
		if(null != loanCtrctbssgmt && !"".equals(loanCtrctbssgmt)){
			loanCtrctbssgmt.setLoan_ctrctbssgmt_id(UUID.toUUID());
			loanCtrctbssgmt.setLastdate(new Date(System.currentTimeMillis()));
			loanCtrctbssgmt.setChangeflag("1");
			i=loanCtrctbssgmtService.addLoanCtrctbssgmt(loanCtrctbssgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param loan_ctrctbssgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateLoanCtrctbssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public String updateLoanCtrctbssgmt(LoanCtrctbssgmt loanCtrctbssgmt,HttpServletRequest request){
		int i = 0;
		if(null != loanCtrctbssgmt && !"".equals(loanCtrctbssgmt)){
			loanCtrctbssgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=loanCtrctbssgmtService.updateLoanCtrctbssgmt(loanCtrctbssgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param loan_ctrctbssgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delLoanCtrctbssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public String delLoanCtrctbssgmt(String loan_ctrctbssgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != loan_ctrctbssgmt_id && !"".equals(loan_ctrctbssgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("loan_ctrctbssgmt_id",loan_ctrctbssgmt_id.split(","));
			i=loanCtrctbssgmtService.delLoanCtrctbssgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param loan_ctrctbssgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyLoanCtrctbssgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String copyLoanCtrctbssgmt(String loan_ctrctbssgmt_id,HttpServletRequest request){
		int i = 0;
		LoanCtrctbssgmt loanCtrctbssgmt = loanCtrctbssgmtService.getLoanCtrctbssgmtById(loan_ctrctbssgmt_id);
		if(null != loanCtrctbssgmt && !"".equals(loanCtrctbssgmt)){
			loanCtrctbssgmt.setLoan_ctrctbssgmt_id(UUID.toUUID());
			i=loanCtrctbssgmtService.addLoanCtrctbssgmt(loanCtrctbssgmt);
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
	@RequestMapping(value="/exportLoanCtrctbssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public void exportLoanCtrctbssgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
