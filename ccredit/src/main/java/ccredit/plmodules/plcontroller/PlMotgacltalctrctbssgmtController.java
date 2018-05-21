package ccredit.plmodules.plcontroller;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
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

import ccredit.plmodules.plmodel.PlCltalinfsgmt;
import ccredit.plmodules.plmodel.PlComrecinfsgmt;
import ccredit.plmodules.plmodel.PlMotgacltalbsinfsgmt;
import ccredit.plmodules.plmodel.PlMotgacltalctrctbssgmt;
import ccredit.plmodules.plmodel.PlMotgaproptinfsgmt;
import ccredit.plmodules.plservice.PlMotgacltalctrctbssgmtService;
import ccredit.util.HtmlToPdf;
import ccredit.xtmodules.xtcore.annotation.AuthUneedLogin;
import ccredit.xtmodules.xtcore.base.BaseAction;
import ccredit.xtmodules.xtcore.base.BaseSearch;
import ccredit.xtmodules.xtcore.util.UUID;
import ccredit.xtmodules.xtcore.util.excel.poi.ExportExcel;

/**
* 抵（质）押合同信息记录基础段 
* 2018-04-28 16:56:37  yangzhou
*/
@Controller
@RequestMapping("/plMotgacltalctrctbssgmtController")
public class PlMotgacltalctrctbssgmtController extends BaseAction{
	@Autowired
	private PlMotgacltalctrctbssgmtService plMotgacltalctrctbssgmtService;
	/**
	* 载入初始化页面
	* @param pl_motgacltalctrctbssgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadPlMotgacltalctrctbssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public ModelAndView loadPlMotgacltalctrctbssgmt(PlMotgacltalctrctbssgmt plMotgacltalctrctbssgmt,HttpServletRequest request){
		return new ModelAndView("pc/pl/pl-motgacltalctrctbssgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param pl_motgacltalctrctbssgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getPlMotgacltalctrctbssgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getPlMotgacltalctrctbssgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<PlMotgacltalctrctbssgmt> plMotgacltalctrctbssgmtList = plMotgacltalctrctbssgmtService.getPlMotgacltalctrctbssgmtListByCondition(condition);
		PageInfo<PlMotgacltalctrctbssgmt> page = new PageInfo<PlMotgacltalctrctbssgmt>(plMotgacltalctrctbssgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param pl_motgacltalctrctbssgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getPlMotgacltalctrctbssgmtById",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getPlMotgacltalctrctbssgmtById(String pl_motgacltalctrctbssgmt_id,HttpServletRequest request){
		PlMotgacltalctrctbssgmt plMotgacltalctrctbssgmt = plMotgacltalctrctbssgmtService.getPlMotgacltalctrctbssgmtById(pl_motgacltalctrctbssgmt_id);
		return outDataStr2(plMotgacltalctrctbssgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param pl_motgacltalctrctbssgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addPlMotgacltalctrctbssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String addPlMotgacltalctrctbssgmt(PlMotgacltalctrctbssgmt plMotgacltalctrctbssgmt,HttpServletRequest request){
		int i = 0;
		if(null != plMotgacltalctrctbssgmt && !"".equals(plMotgacltalctrctbssgmt)){
			plMotgacltalctrctbssgmt.setPl_motgacltalctrctbssgmt_id(UUID.toUUID());
			plMotgacltalctrctbssgmt.setLastdate(new Date(System.currentTimeMillis()));
			plMotgacltalctrctbssgmt.setChangeflag("1");
			i=plMotgacltalctrctbssgmtService.addPlMotgacltalctrctbssgmt(plMotgacltalctrctbssgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param pl_motgacltalctrctbssgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updatePlMotgacltalctrctbssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String updatePlMotgacltalctrctbssgmt(PlMotgacltalctrctbssgmt plMotgacltalctrctbssgmt,HttpServletRequest request){
		int i = 0;
		if(null != plMotgacltalctrctbssgmt && !"".equals(plMotgacltalctrctbssgmt)){
			plMotgacltalctrctbssgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=plMotgacltalctrctbssgmtService.updatePlMotgacltalctrctbssgmt(plMotgacltalctrctbssgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param pl_motgacltalctrctbssgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delPlMotgacltalctrctbssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String delPlMotgacltalctrctbssgmt(String pl_motgacltalctrctbssgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != pl_motgacltalctrctbssgmt_id && !"".equals(pl_motgacltalctrctbssgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("pl_motgacltalctrctbssgmt_id",pl_motgacltalctrctbssgmt_id.split(","));
			i=plMotgacltalctrctbssgmtService.delPlMotgacltalctrctbssgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param pl_motgacltalctrctbssgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyPlMotgacltalctrctbssgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String copyPlMotgacltalctrctbssgmt(String pl_motgacltalctrctbssgmt_id,HttpServletRequest request){
		int i = 0;
		PlMotgacltalctrctbssgmt plMotgacltalctrctbssgmt = plMotgacltalctrctbssgmtService.getPlMotgacltalctrctbssgmtById(pl_motgacltalctrctbssgmt_id);
		if(null != plMotgacltalctrctbssgmt && !"".equals(plMotgacltalctrctbssgmt)){
			plMotgacltalctrctbssgmt.setPl_motgacltalctrctbssgmt_id(UUID.toUUID());
			i=plMotgacltalctrctbssgmtService.addPlMotgacltalctrctbssgmt(plMotgacltalctrctbssgmt);
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
	@RequestMapping(value="/exportPlMotgacltalctrctbssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public void exportPlMotgacltalctrctbssgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
	
	
	
	/**
	* 历史信息查询
	*/
	@RequestMapping(value="/quereyPlbssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public ModelAndView quereyPlbssgmt(PlMotgacltalctrctbssgmt plMotgacltalctrctbssgmt,HttpServletRequest request){
		return new ModelAndView("pc/pl/pl-query");
	}
	
	/**
	* 加载历史信息
	*/
	@ResponseBody
	@RequestMapping(value="/getHisPlListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public String getHisPlListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		condition.put("table","his_pl_motgacltalctrctbssgmt");	
		List<PlMotgacltalctrctbssgmt> plMotgacltalctrctbssgmtList = (List<PlMotgacltalctrctbssgmt>) plMotgacltalctrctbssgmtService.getHisPlListByCondition(condition);
		PageInfo<PlMotgacltalctrctbssgmt> page = new PageInfo<PlMotgacltalctrctbssgmt>(plMotgacltalctrctbssgmtList);
		return outPageStr(page,request);
	}
	
	/**
     * 跳转到详细信息页面
     */
	@AuthUneedLogin
    @RequestMapping(value="/plToPDF",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView plToPDF(String serialno ,HttpServletRequest request){
		if(serialno==""||serialno==null) {
			serialno = request.getParameter("serialno");
		}
		Map<String, Object> condition = new HashMap<String, Object>();
    	condition.put("serialno",serialno);    
    	
    	//抵(质)押合同信息记录基础段 PlMotgacltalctrctbssgmt	
    	condition.put("table","his_pl_motgacltalctrctbssgmt");	
    	List<PlMotgacltalctrctbssgmt> loanAcctspectrstdspnsgmtList  = (List<PlMotgacltalctrctbssgmt>) plMotgacltalctrctbssgmtService.getHisPlListByCondition(condition);
    	
    	//抵(质)押合同基本信息段 PlMotgacltalbsinfsgmt	
    	condition.put("table","his_pl_motgacltalbsinfsgmt");	
    	List<PlMotgacltalbsinfsgmt> loanAcctcredsgmtList  = (List<PlMotgacltalbsinfsgmt>) plMotgacltalctrctbssgmtService.getHisPlListByCondition(condition);
    	
    	//抵(质)押合同共同债务人信息 PlComrecinfsgmt	
    	condition.put("table","his_pl_comrecinfsgmt");	
    	List<PlComrecinfsgmt> loanAcctbssgmtList  = (List<PlComrecinfsgmt>) plMotgacltalctrctbssgmtService.getHisPlListByCondition(condition);
    	
    	//抵押物信息 PlMotgaproptinfsgmt	
    	condition.put("table","his_pl_motgaproptinfsgmt");	
    	List<PlMotgaproptinfsgmt> loanActlbltyinfsgmtList  = (List<PlMotgaproptinfsgmt>) plMotgacltalctrctbssgmtService.getHisPlListByCondition(condition);

    	//质物信息 PlCltalinfsgmt	
    	condition.put("table","his_pl_cltalinfsgmt");	
    	List<PlCltalinfsgmt> loanAcctbsinfsgmtList  = (List<PlCltalinfsgmt>) plMotgacltalctrctbssgmtService.getHisPlListByCondition(condition);
    	
    	ModelAndView modelAndView = new ModelAndView("pc/pl/pl-pdf");
    	modelAndView.addObject("serialno", serialno);
    	
    	modelAndView.addObject("PlCltalinfsgmt",loanAcctbsinfsgmtList);
    	modelAndView.addObject("PlComrecinfsgmt",loanAcctbssgmtList);
    	modelAndView.addObject("PlMotgacltalbsinfsgmt",loanAcctcredsgmtList);
    	modelAndView.addObject("PlMotgacltalctrctbssgmt",loanAcctspectrstdspnsgmtList);
    	modelAndView.addObject("PlMotgaproptinfsgmt",loanActlbltyinfsgmtList);

    	return modelAndView;
	}
	
	/**
	* 导出PDF
	*/
	@AuthUneedLogin
    @RequestMapping(value = "exportPlPDF")
    public ModelAndView exportPlPDF(HttpServletRequest request,HttpServletResponse response){
    	try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e2) {
			e2.printStackTrace();
		}
    	String h = request.getParameter("htmlContent");
    	String pPath=HtmlToPdf.writeHtmlToFile(h, "企业抵质押信息查询");
    	HtmlToPdf.convert(pPath+"\\企业抵质押信息查询.html", pPath+"\\企业抵质押信息查询.pdf");
    	HtmlToPdf.exportPDF("企业抵质押信息查询",pPath, response);
		return null;
    }
	
}
