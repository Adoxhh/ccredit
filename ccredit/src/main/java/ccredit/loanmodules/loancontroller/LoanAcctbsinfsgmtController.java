package ccredit.loanmodules.loancontroller;
import java.util.List;
import java.io.UnsupportedEncodingException;
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
import ccredit.loanmodules.loanmodel.LoanAcctbsinfsgmt;
import ccredit.loanmodules.loanmodel.LoanAcctbssgmt;
import ccredit.loanmodules.loanmodel.LoanAcctcredsgmt;
import ccredit.loanmodules.loanmodel.LoanAcctspectrstdspnsgmt;
import ccredit.loanmodules.loanmodel.LoanActlbltyinfsgmt;
import ccredit.loanmodules.loanmodel.LoanCosignersgmt;
import ccredit.loanmodules.loanmodel.LoanCreditlimsgmt;
import ccredit.loanmodules.loanmodel.LoanCtrctbssgmt;
import ccredit.loanmodules.loanmodel.LoanCtrctcertrelsgmt;
import ccredit.loanmodules.loanmodel.LoanGuarbssgmt;
import ccredit.loanmodules.loanmodel.LoanGuarcreditlimsgmt;
import ccredit.loanmodules.loanmodel.LoanMotgacltalctrctinfsgmt;
import ccredit.loanmodules.loanmodel.LoanOrigcreditorinfsgmt;
import ccredit.loanmodules.loanmodel.LoanRltrepymtinfsgmt;
import ccredit.loanmodules.loanservice.LoanAcctbsinfsgmtService;
import ccredit.util.HtmlToPdf;

/**
* 借贷基本信息段 
* 2018-04-27 15:42:33  yangzhou
*/
@Controller
@RequestMapping("/loanAcctbsinfsgmtController")
public class LoanAcctbsinfsgmtController extends BaseAction{
	@Autowired
	private LoanAcctbsinfsgmtService loanAcctbsinfsgmtService;
	/**
	* 载入初始化页面
	* @param loan_acctbsinfsgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadLoanAcctbsinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public ModelAndView loadLoanAcctbsinfsgmt(LoanAcctbsinfsgmt loanAcctbsinfsgmt,HttpServletRequest request){
		return new ModelAndView("pc/loan/loan-acctbsinfsgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param loan_acctbsinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getLoanAcctbsinfsgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public String getLoanAcctbsinfsgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<LoanAcctbsinfsgmt> loanAcctbsinfsgmtList = loanAcctbsinfsgmtService.getLoanAcctbsinfsgmtListByCondition(condition);
		PageInfo<LoanAcctbsinfsgmt> page = new PageInfo<LoanAcctbsinfsgmt>(loanAcctbsinfsgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param loan_acctbsinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getLoanAcctbsinfsgmtById",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public String getLoanAcctbsinfsgmtById(String loan_acctbsinfsgmt_id,HttpServletRequest request){
		LoanAcctbsinfsgmt loanAcctbsinfsgmt = loanAcctbsinfsgmtService.getLoanAcctbsinfsgmtById(loan_acctbsinfsgmt_id);
		return outDataStr2(loanAcctbsinfsgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param loan_acctbsinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addLoanAcctbsinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public String addLoanAcctbsinfsgmt(LoanAcctbsinfsgmt loanAcctbsinfsgmt,HttpServletRequest request){
		int i = 0;
		if(null != loanAcctbsinfsgmt && !"".equals(loanAcctbsinfsgmt)){
			loanAcctbsinfsgmt.setLoan_acctbsinfsgmt_id(UUID.toUUID());
			i=loanAcctbsinfsgmtService.addLoanAcctbsinfsgmt(loanAcctbsinfsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param loan_acctbsinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateLoanAcctbsinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public String updateLoanAcctbsinfsgmt(LoanAcctbsinfsgmt loanAcctbsinfsgmt,HttpServletRequest request){
		int i = 0;
		if(null != loanAcctbsinfsgmt && !"".equals(loanAcctbsinfsgmt)){
			i=loanAcctbsinfsgmtService.updateLoanAcctbsinfsgmt(loanAcctbsinfsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param loan_acctbsinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delLoanAcctbsinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public String delLoanAcctbsinfsgmt(String loan_acctbsinfsgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != loan_acctbsinfsgmt_id && !"".equals(loan_acctbsinfsgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("loan_acctbsinfsgmt_id",loan_acctbsinfsgmt_id.split(","));
			i=loanAcctbsinfsgmtService.delLoanAcctbsinfsgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param loan_acctbsinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyLoanAcctbsinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String copyLoanAcctbsinfsgmt(String loan_acctbsinfsgmt_id,HttpServletRequest request){
		int i = 0;
		LoanAcctbsinfsgmt loanAcctbsinfsgmt = loanAcctbsinfsgmtService.getLoanAcctbsinfsgmtById(loan_acctbsinfsgmt_id);
		if(null != loanAcctbsinfsgmt && !"".equals(loanAcctbsinfsgmt)){
			loanAcctbsinfsgmt.setLoan_acctbsinfsgmt_id(UUID.toUUID());
			i=loanAcctbsinfsgmtService.addLoanAcctbsinfsgmt(loanAcctbsinfsgmt);
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
	@RequestMapping(value="/exportLoanAcctbsinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public void exportLoanAcctbsinfsgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
	
   /**
	* 历史信息查询
	*/
	@RequestMapping(value="/quereyLoanAcctbsinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public ModelAndView quereyLoanAcctbsinfsgmt(LoanAcctbsinfsgmt loanAcctbsinfsgmt,HttpServletRequest request){
		return new ModelAndView("pc/loan/loan-query");
	}
	
	/**
	* 加载历史信息
	*/
	@ResponseBody
	@RequestMapping(value="/getHisLoanAcctbsinfsgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public String getHisLoanAcctbsinfsgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		condition.put("table","HisLoanAcctbsinfsgmt");	
		List<LoanAcctbsinfsgmt> loanAcctbsinfsgmtList = (List<LoanAcctbsinfsgmt>) loanAcctbsinfsgmtService.getHisLoanListByCondition(condition);
		PageInfo<LoanAcctbsinfsgmt> page = new PageInfo<LoanAcctbsinfsgmt>(loanAcctbsinfsgmtList);
		return outPageStr(page,request);
	}
	/**
     * 跳转到详细信息页面
     */
	@AuthUneedLogin
    @RequestMapping(value="/loanToPDF",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView loanToPDF(String serialno ,HttpServletRequest request){
		if(serialno==""||serialno==null) {
			serialno = request.getParameter("serialno");
		}
		Map<String, Object> condition = new HashMap<String, Object>();
    	condition.put("serialno",serialno);    
    	//借贷基本信息段 LoanAcctbsinfsgmt	
    	condition.put("table","HisLoanAcctbsinfsgmt");	
    	List<LoanAcctbsinfsgmt> loanAcctbsinfsgmtList = (List<LoanAcctbsinfsgmt>) loanAcctbsinfsgmtService.getHisLoanListByCondition(condition);
    	//企业借贷信息基础段 LoanAcctbssgmt	
    	condition.put("table","HisLoanAcctbssgmt");	
    	List<LoanAcctbssgmt> loanAcctbssgmtList = (List<LoanAcctbssgmt>) loanAcctbsinfsgmtService.getHisLoanListByCondition(condition);
    	//相关还款责任人 LoanRltrepymtinfsgmt	
    	condition.put("table","HisLoanRltrepymtinfsgmt");	
    	List<LoanRltrepymtinfsgmt> loanRltrepymtinfsgmtList = (List<LoanRltrepymtinfsgmt>) loanAcctbsinfsgmtService.getHisLoanListByCondition(condition);

    	//借贷授信额度信息 LoanAcctcredsgmt	
    	condition.put("table","HisLoanAcctcredsgmt");	
    	List<LoanAcctcredsgmt> loanAcctcredsgmtList = (List<LoanAcctcredsgmt>) loanAcctbsinfsgmtService.getHisLoanListByCondition(condition);
    	//特定交易说明 LoanAcctspectrstdspnsgmt	
    	condition.put("table","HisLoanAcctspectrstdspnsgmt");	
    	List<LoanAcctspectrstdspnsgmt> loanAcctspectrstdspnsgmtList = (List<LoanAcctspectrstdspnsgmt>) loanAcctbsinfsgmtService.getHisLoanListByCondition(condition);
    	//还款表现信息 LoanActlbltyinfsgmt	
    	condition.put("table","HisLoanActlbltyinfsgmt");	
    	List<LoanActlbltyinfsgmt> loanActlbltyinfsgmtList = (List<LoanActlbltyinfsgmt>) loanAcctbsinfsgmtService.getHisLoanListByCondition(condition);
    	//联保人信息 LoanCosignersgmt	
    	condition.put("table","HisLoanCosignersgmt");	
    	List<LoanCosignersgmt> loanCosignersgmtList = (List<LoanCosignersgmt>) loanAcctbsinfsgmtService.getHisLoanListByCondition(condition);
    	//授信额度信息 LoanCreditlimsgmt	
    	condition.put("table","HisLoanCreditlimsgmt");	
    	List<LoanCreditlimsgmt> loanCreditlimsgmtList = (List<LoanCreditlimsgmt>) loanAcctbsinfsgmtService.getHisLoanListByCondition(condition);
    	//企业授信协议信息基础段 LoanCtrctbssgmt	
    	condition.put("table","HisLoanCtrctbssgmt");	
    	List<LoanCtrctbssgmt> loanCtrctbssgmtList = (List<LoanCtrctbssgmt>) loanAcctbsinfsgmtService.getHisLoanListByCondition(condition);
    	//共同受信人信息 LoanCtrctcertrelsgmt	
    	condition.put("table","HisLoanCtrctcertrelsgmt");	
    	List<LoanCtrctcertrelsgmt> loanCtrctcertrelsgmtList = (List<LoanCtrctcertrelsgmt>) loanAcctbsinfsgmtService.getHisLoanListByCondition(condition);
    	//最高额保证合同信息基础段 LoanGuarbssgmt	
    	condition.put("table","HisLoanGuarbssgmt");	
    	List<LoanGuarbssgmt> loanGuarbssgmtList = (List<LoanGuarbssgmt>) loanAcctbsinfsgmtService.getHisLoanListByCondition(condition);
    	//最高额额度信息 LoanGuarcreditlimsgmt	
    	condition.put("table","HisLoanGuarcreditlimsgmt");	
    	List<LoanGuarcreditlimsgmt> loanGuarcreditlimsgmtList = (List<LoanGuarcreditlimsgmt>) loanAcctbsinfsgmtService.getHisLoanListByCondition(condition);
    	//抵质押物信息 LoanMotgacltalctrctinfsgmt	
    	condition.put("table","HisLoanMotgacltalctrctinfsgmt");	
    	List<LoanMotgacltalctrctinfsgmt> loanMotgacltalctrctinfsgmtList = (List<LoanMotgacltalctrctinfsgmt>) loanAcctbsinfsgmtService.getHisLoanListByCondition(condition);
    	//初始债权说明 LoanOrigcreditorinfsgmt	
    	condition.put("table","HisLoanOrigcreditorinfsgmt");	
    	List<LoanOrigcreditorinfsgmt> loanOrigcreditorinfsgmtList = (List<LoanOrigcreditorinfsgmt>) loanAcctbsinfsgmtService.getHisLoanListByCondition(condition);
    	

    	ModelAndView modelAndView = new ModelAndView("pc/loan/loan-pdf");
    	modelAndView.addObject("serialno", serialno);
    	modelAndView.addObject("LoanAcctbsinfsgmt",loanAcctbsinfsgmtList);
    	modelAndView.addObject("LoanAcctbssgmt",loanAcctbssgmtList);
    	modelAndView.addObject("LoanAcctcredsgmt",loanAcctcredsgmtList);
    	modelAndView.addObject("LoanAcctspectrstdspnsgmt",loanAcctspectrstdspnsgmtList);
    	modelAndView.addObject("LoanActlbltyinfsgmt",loanActlbltyinfsgmtList);
    	modelAndView.addObject("LoanCosignersgmt",loanCosignersgmtList);
    	modelAndView.addObject("LoanCreditlimsgmt",loanCreditlimsgmtList);
    	modelAndView.addObject("LoanCtrctbssgmt",loanCtrctbssgmtList);
    	modelAndView.addObject("LoanCtrctcertrelsgmt",loanCtrctcertrelsgmtList);
    	modelAndView.addObject("LoanGuarbssgmt",loanGuarbssgmtList);
    	modelAndView.addObject("LoanGuarcreditlimsgmt",loanGuarcreditlimsgmtList);
    	modelAndView.addObject("LoanMotgacltalctrctinfsgmt",loanMotgacltalctrctinfsgmtList);
    	modelAndView.addObject("LoanOrigcreditorinfsgmt",loanOrigcreditorinfsgmtList);
    	modelAndView.addObject("LoanRltrepymtinfsgmt",loanRltrepymtinfsgmtList);
 
    	
    	return modelAndView;
	}
	
	 /**
     * 导出PDF
     */
	@AuthUneedLogin
    @RequestMapping(value = "exportLoanPDF")
    public ModelAndView exportAccthistoryPDF(HttpServletRequest request,HttpServletResponse response){
    	try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e2) {
			e2.printStackTrace();
		}
    	String h = request.getParameter("htmlContent");
    	String pPath=HtmlToPdf.writeHtmlToFile(h, "企业借贷信息查询统计");
    	HtmlToPdf.convert(pPath+"\\企业借贷信息查询统计.html", pPath+"\\企业借贷信息查询统计.pdf");
    	HtmlToPdf.exportPDF("企业借贷信息查询统计",pPath, response);
		return null;
    }
}
