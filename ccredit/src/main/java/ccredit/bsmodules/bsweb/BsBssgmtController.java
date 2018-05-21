package ccredit.bsmodules.bsweb;
import java.util.List;
import java.io.UnsupportedEncodingException;
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
import ccredit.bsmodules.bsmodel.BsActucotrlinfsgmt;
import ccredit.bsmodules.bsmodel.BsBssgmt;
import ccredit.bsmodules.bsmodel.BsCotainfsgmt;
import ccredit.bsmodules.bsmodel.BsEnctfitginf;
import ccredit.bsmodules.bsmodel.BsEnicdnrltpinf;
import ccredit.bsmodules.bsmodel.BsFcsinfsgmt;
import ccredit.bsmodules.bsmodel.BsIdsgmt;
import ccredit.bsmodules.bsmodel.BsMnmmbinfsgmt;
import ccredit.bsmodules.bsmodel.BsMnshahodinfsgmt;
import ccredit.bsmodules.bsmodel.BsSpvsgathrtyinfsgmt;
import ccredit.bsmodules.bsservice.BsBssgmtService;
import ccredit.util.HtmlToPdf;

/**
* 企业基本信息基础段 
* 2018-04-26 09:58:53  mengbeibei
*/
@Controller
@RequestMapping("/bsBssgmtController")
public class BsBssgmtController extends BaseAction{
	@Autowired
	private BsBssgmtService bsBssgmtService;
	/**
	* 载入初始化页面
	* @param bs_bssgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadBsBssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public ModelAndView loadBsBssgmt(BsBssgmt bsBssgmt,HttpServletRequest request){
		return new ModelAndView("pc/bs-view/bs-bssgmt/bs-bssgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param bs_bssgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getBsBssgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getBsBssgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<BsBssgmt> bsBssgmtList = bsBssgmtService.getBsBssgmtListByCondition(condition);
		PageInfo<BsBssgmt> page = new PageInfo<BsBssgmt>(bsBssgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param bssgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getBsBssgmtById",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getBsBssgmtById(String bssgmt_id,HttpServletRequest request){
		BsBssgmt bsBssgmt = bsBssgmtService.getBsBssgmtById(bssgmt_id);
		return outDataStr2(bsBssgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param bs_bssgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addBsBssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String addBsBssgmt(BsBssgmt bsBssgmt,HttpServletRequest request){
		int i = 0;
		if(null != bsBssgmt && !"".equals(bsBssgmt)){
			bsBssgmt.setBssgmt_id(UUID.toUUID());
			bsBssgmt.setChangeflag("1");
			bsBssgmt.setInfrectype("310");
			bsBssgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=bsBssgmtService.addBsBssgmt(bsBssgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param bs_bssgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateBsBssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String updateBsBssgmt(BsBssgmt bsBssgmt,HttpServletRequest request){
		int i = 0;
		if(null != bsBssgmt && !"".equals(bsBssgmt)){
			bsBssgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=bsBssgmtService.updateBsBssgmt(bsBssgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param bssgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delBsBssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String delBsBssgmt(String bssgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != bssgmt_id && !"".equals(bssgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("bssgmt_id",bssgmt_id.split(","));
			i=bsBssgmtService.delBsBssgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param bssgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyBsBssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String copyBsBssgmt(String bssgmt_id,HttpServletRequest request){
		int i = 0;
		BsBssgmt bsBssgmt = bsBssgmtService.getBsBssgmtById(bssgmt_id);
		if(null != bsBssgmt && !"".equals(bsBssgmt)){
			bsBssgmt.setBssgmt_id(UUID.toUUID());
			i=bsBssgmtService.addBsBssgmt(bsBssgmt);
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
	@RequestMapping(value="/exportBsBssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public void exportBsBssgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
	
	
	

	/**
	* 历史信息查询
	*/
	@RequestMapping(value="/quereyBssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public ModelAndView quereyBssgmt(BsBssgmt bsBssgmt,HttpServletRequest request){
		return new ModelAndView("pc/bs-view/bs-query");
	}
	
   /**
	* 加载历史信息
	*/
	@ResponseBody
	@RequestMapping(value="/getHisBsListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public String getHisBsListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		condition.put("table","his_bs_bssgmt");	
		List<BsBssgmt> bsBssgmtList = (List<BsBssgmt>) bsBssgmtService.getHisBsListByCondition(condition);
		PageInfo<BsBssgmt> page = new PageInfo<BsBssgmt>(bsBssgmtList);
		return outPageStr(page,request);
		
	}
	
	/**
     * 跳转到详细信息页面
     */
	@AuthUneedLogin
    @RequestMapping(value="/bsToPDF",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView bsToPDF(String customid ,HttpServletRequest request){
		if(customid==""||customid==null) {
			customid = request.getParameter("customid");
		}
		Map<String, Object> condition = new HashMap<String, Object>();
    	condition.put("customid",customid);    
    	
    	//实际控制人 BsActucotrlinfsgmt
    	condition.put("table","his_bs_actucotrlinfsgmt");
    	List<BsActucotrlinfsgmt> bsActucotrlinfsgmtList  = (List<BsActucotrlinfsgmt>) bsBssgmtService.getHisBsListByCondition(condition);
    	
    	//企业基本信息基础段 bssgmt
    	condition.put("table","his_bs_bssgmt");
    	List<BsBssgmt> bsBssgmtList  = (List<BsBssgmt>) bsBssgmtService.getHisBsListByCondition(condition);
    	
    	//联系方式 BsCotainfsgmt
    	condition.put("table","his_bs_cotainfsgmt");
    	List<BsCotainfsgmt> bsCotainfsgmtList  = (List<BsCotainfsgmt>) bsBssgmtService.getHisBsListByCondition(condition);
    	
    	//身份标识整合信息记录 BsEnctfitginf
    	condition.put("table","his_bs_enctfitginf");
		List<BsEnctfitginf> bsEnctfitginfList  = (List<BsEnctfitginf>) bsBssgmtService.getHisBsListByCondition(condition);
    	
    	//企业间关联关系信息记录 BsEnicdnrltpinf
    	condition.put("table","his_bs_enicdnrltpinf");
    	List<BsEnicdnrltpinf> bsEnicdnrltpinfList  = (List<BsEnicdnrltpinf>) bsBssgmtService.getHisBsListByCondition(condition);
    	
    	//基本概况信息 BsFcsinfsgmt
    	condition.put("table","his_bs_fcsinfsgmt");
    	List<BsFcsinfsgmt> bsFcsinfsgmtList  = (List<BsFcsinfsgmt>) bsBssgmtService.getHisBsListByCondition(condition);
    	
    	//其他标识表 BsIdsgmt
    	condition.put("table","his_bs_idsgmt");
    	List<BsIdsgmt> bsIdsgmtList  = (List<BsIdsgmt>) bsBssgmtService.getHisBsListByCondition(condition);
    	
    	//主要组成人员 BsMnmmbinfsgmt
    	condition.put("table","his_bs_mnmmbinfsgmt");
    	List<BsMnmmbinfsgmt> bsMnmmbinfsgmtList  = (List<BsMnmmbinfsgmt>) bsBssgmtService.getHisBsListByCondition(condition);
    	
    	//注册资本及主要出资人 BsMnshahodinfsgmt
    	condition.put("table","his_bs_mnshahodinfsgmt");
    	List<BsMnshahodinfsgmt> bsMnshahodinfsgmtList  = (List<BsMnshahodinfsgmt>) bsBssgmtService.getHisBsListByCondition(condition);
    	
    	//上级机构 BsSpvsgathrtyinfsgmt
    	condition.put("table","his_bs_spvsgathrtyinfsgmt");
    	List<BsSpvsgathrtyinfsgmt> bsSpvsgathrtyinfsgmtList  = (List<BsSpvsgathrtyinfsgmt>) bsBssgmtService.getHisBsListByCondition(condition);

    	ModelAndView modelAndView = new ModelAndView("pc/bs-view/bs-pdf");
    	modelAndView.addObject("customid", customid);
    	
    	modelAndView.addObject("BsActucotrlinfsgmt",bsActucotrlinfsgmtList);
    	modelAndView.addObject("BsBssgmt",bsBssgmtList);
    	modelAndView.addObject("BsCotainfsgmt",bsCotainfsgmtList);
    	modelAndView.addObject("BsEnctfitginf",bsEnctfitginfList);
    	modelAndView.addObject("BsEnicdnrltpinf",bsEnicdnrltpinfList);
    	modelAndView.addObject("BsFcsinfsgmt",bsFcsinfsgmtList);
    	modelAndView.addObject("BsIdsgmt",bsIdsgmtList);
    	modelAndView.addObject("BsMnmmbinfsgmt",bsMnmmbinfsgmtList);
    	modelAndView.addObject("BsMnshahodinfsgmt",bsMnshahodinfsgmtList);
    	modelAndView.addObject("BsSpvsgathrtyinfsgmt",bsSpvsgathrtyinfsgmtList);

    	return modelAndView;
	}
	
   /**
	* 导出PDF
	*/
	@AuthUneedLogin
    @RequestMapping(value = "exportBsPDF")
    public ModelAndView exportBsPDF(HttpServletRequest request,HttpServletResponse response){
    	try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e2) {
			e2.printStackTrace();
		}
    	String h = request.getParameter("htmlContent");
    	String pPath=HtmlToPdf.writeHtmlToFile(h, "企业基本信息查询");
    	HtmlToPdf.convert(pPath+"\\企业基本信息查询.html", pPath+"\\企业基本信息查询.pdf");
    	HtmlToPdf.exportPDF("企业基本信息查询",pPath, response);
		return null;
    }
}
