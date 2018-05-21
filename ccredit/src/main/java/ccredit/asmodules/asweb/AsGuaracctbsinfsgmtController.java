package ccredit.asmodules.asweb;
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
import ccredit.asmodules.asmodel.AsGuaracctbsinfsgmt;
import ccredit.asmodules.asmodel.AsGuaracctbssgmt;
import ccredit.asmodules.asmodel.AsGuaracctcredsgmt;
import ccredit.asmodules.asmodel.AsGuarmotgtalctrctinf;
import ccredit.asmodules.asmodel.AsGuarrltrepymtinf;
import ccredit.asmodules.asmodel.AsRltrepymtinfsgmt;
import ccredit.asmodules.asservice.AsGuaracctbsinfsgmtService;
import ccredit.util.HtmlToPdf;

/**
* 企业担保账户基本信息段 
* 2018-04-28 15:37:03  mengbeibei
*/
@Controller
@RequestMapping("/asGuaracctbsinfsgmtController")
public class AsGuaracctbsinfsgmtController extends BaseAction{
	@Autowired
	private AsGuaracctbsinfsgmtService asGuaracctbsinfsgmtService;
	/**
	* 载入初始化页面
	* @param as_guaracctbsinfsgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadAsGuaracctbsinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView loadAsGuaracctbsinfsgmt(AsGuaracctbsinfsgmt asGuaracctbsinfsgmt,HttpServletRequest request){
		return new ModelAndView("pc/as-view/as-guaracctbsinfsgmt/as-guaracctbsinfsgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param as_guaracctbsinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getAsGuaracctbsinfsgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	public String getAsGuaracctbsinfsgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<AsGuaracctbsinfsgmt> asGuaracctbsinfsgmtList = asGuaracctbsinfsgmtService.getAsGuaracctbsinfsgmtListByCondition(condition);
		PageInfo<AsGuaracctbsinfsgmt> page = new PageInfo<AsGuaracctbsinfsgmt>(asGuaracctbsinfsgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param guaracctbsinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getAsGuaracctbsinfsgmtById",method={RequestMethod.POST,RequestMethod.GET})
	public String getAsGuaracctbsinfsgmtById(String guaracctbsinfsgmt_id,HttpServletRequest request){
		AsGuaracctbsinfsgmt asGuaracctbsinfsgmt = asGuaracctbsinfsgmtService.getAsGuaracctbsinfsgmtById(guaracctbsinfsgmt_id);
		return outDataStr2(asGuaracctbsinfsgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param as_guaracctbsinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addAsGuaracctbsinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String addAsGuaracctbsinfsgmt(AsGuaracctbsinfsgmt asGuaracctbsinfsgmt,HttpServletRequest request){
		int i = 0;
		if(null != asGuaracctbsinfsgmt && !"".equals(asGuaracctbsinfsgmt)){
			asGuaracctbsinfsgmt.setGuaracctbsinfsgmt_id(UUID.toUUID());
			asGuaracctbsinfsgmt.setChangeflag("1");
			asGuaracctbsinfsgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=asGuaracctbsinfsgmtService.addAsGuaracctbsinfsgmt(asGuaracctbsinfsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param as_guaracctbsinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateAsGuaracctbsinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String updateAsGuaracctbsinfsgmt(AsGuaracctbsinfsgmt asGuaracctbsinfsgmt,HttpServletRequest request){
		int i = 0;
		if(null != asGuaracctbsinfsgmt && !"".equals(asGuaracctbsinfsgmt)){
			asGuaracctbsinfsgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=asGuaracctbsinfsgmtService.updateAsGuaracctbsinfsgmt(asGuaracctbsinfsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param guaracctbsinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delAsGuaracctbsinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String delAsGuaracctbsinfsgmt(String guaracctbsinfsgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != guaracctbsinfsgmt_id && !"".equals(guaracctbsinfsgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("guaracctbsinfsgmt_id",guaracctbsinfsgmt_id.split(","));
			i=asGuaracctbsinfsgmtService.delAsGuaracctbsinfsgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param guaracctbsinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyAsGuaracctbsinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String copyAsGuaracctbsinfsgmt(String guaracctbsinfsgmt_id,HttpServletRequest request){
		int i = 0;
		AsGuaracctbsinfsgmt asGuaracctbsinfsgmt = asGuaracctbsinfsgmtService.getAsGuaracctbsinfsgmtById(guaracctbsinfsgmt_id);
		if(null != asGuaracctbsinfsgmt && !"".equals(asGuaracctbsinfsgmt)){
			asGuaracctbsinfsgmt.setGuaracctbsinfsgmt_id(UUID.toUUID());
			i=asGuaracctbsinfsgmtService.addAsGuaracctbsinfsgmt(asGuaracctbsinfsgmt);
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
	@RequestMapping(value="/exportAsGuaracctbsinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public void exportAsGuaracctbsinfsgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
	
	

	/**
	* 历史信息查询
	*/
	@RequestMapping(value="/quereyAssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public ModelAndView quereyAssgmt(AsGuaracctbsinfsgmt asGuaracctbsinfsgmt,HttpServletRequest request){
		return new ModelAndView("pc/as-view/as-query");
	}
	
	/**
	* 加载历史信息
	*/
	@ResponseBody
	@RequestMapping(value="/getHisAsListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin	
	public String getHisAsListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		condition.put("table","his_as_guaracctbsinfsgmt");	
		List<AsGuaracctbsinfsgmt> asGuaracctbsinfsgmtList = (List<AsGuaracctbsinfsgmt>) asGuaracctbsinfsgmtService.getHisAsListByCondition(condition);
		PageInfo<AsGuaracctbsinfsgmt> page = new PageInfo<AsGuaracctbsinfsgmt>(asGuaracctbsinfsgmtList);
		return outPageStr(page,request);
	}
	
	/**
     * 跳转到详细信息页面
     */
	@AuthUneedLogin
    @RequestMapping(value="/asToPDF",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView asToPDF(String serialno ,HttpServletRequest request){
		if(serialno==""||serialno==null) {
			serialno = request.getParameter("serialno");
		}
		Map<String, Object> condition = new HashMap<String, Object>();
    	condition.put("serialno",serialno);    
    	//企业担保账户基本信息段 Guaracctbsinfsgmt
    	condition.put("table","his_as_guaracctbsinfsgmt");
    	List<AsGuaracctbsinfsgmt> asGuaracctbsinfsgmtList  = (List<AsGuaracctbsinfsgmt>) asGuaracctbsinfsgmtService.getHisAsListByCondition(condition);
    	
    	//企业担保账户记录 Guaracctbssgmt
    	condition.put("table","his_as_guaracctbssgmt");
    	List<AsGuaracctbssgmt> asGuaracctbssgmtList  = (List<AsGuaracctbssgmt>) asGuaracctbsinfsgmtService.getHisAsListByCondition(condition);
    	
    	//企业担保账户授信额度息段 Guaracctcredsgmt
    	condition.put("table","his_as_guaracctcredsgmt");
    	List<AsGuaracctcredsgmt> asGuaracctcredsgmtList  = (List<AsGuaracctcredsgmt>) asGuaracctbsinfsgmtService.getHisAsListByCondition(condition);
    	
    	//企业担保账户抵质押物信息段 Guarmotgtalctrctinf
    	condition.put("table","his_as_guarmotgtalctrctinf");
    	List<AsGuarmotgtalctrctinf> asGuarmotgtalctrctinfList  = (List<AsGuarmotgtalctrctinf>) asGuaracctbsinfsgmtService.getHisAsListByCondition(condition);
    	
    	//企业担保账户在保责任信息段 Guarrltrepymtinf
    	condition.put("table","his_as_guarrltrepymtinf");
    	List<AsGuarrltrepymtinf> asGuarrltrepymtinfList  = (List<AsGuarrltrepymtinf>) asGuaracctbsinfsgmtService.getHisAsListByCondition(condition);
    	
    	//企业担保账户相关还款责任人信息段 Rltrepymtinfsgmt
    	condition.put("table","his_as_rltrepymtinfsgmt");
    	List<AsRltrepymtinfsgmt> asRltrepymtinfsgmtList  = (List<AsRltrepymtinfsgmt>) asGuaracctbsinfsgmtService.getHisAsListByCondition(condition);
    	
    	ModelAndView modelAndView = new ModelAndView("pc/as-view/as-pdf");
    	modelAndView.addObject("serialno", serialno);
    	
    	modelAndView.addObject("AsGuaracctbsinfsgmt",asGuaracctbsinfsgmtList);
    	modelAndView.addObject("AsGuaracctbssgmt",asGuaracctbssgmtList);
    	modelAndView.addObject("AsGuaracctcredsgmt",asGuaracctcredsgmtList);
    	modelAndView.addObject("AsGuarmotgtalctrctinf",asGuarmotgtalctrctinfList);
    	modelAndView.addObject("AsGuarrltrepymtinf",asGuarrltrepymtinfList);
    	modelAndView.addObject("AsRltrepymtinfsgmt",asRltrepymtinfsgmtList);

    	return modelAndView;
	}
	
   /**
	* 导出PDF
	*/
	@AuthUneedLogin
    @RequestMapping(value = "exportAsPDF")
    public ModelAndView exportAsPDF(HttpServletRequest request,HttpServletResponse response){
    	try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e2) {
			e2.printStackTrace();
		}
    	String h = request.getParameter("htmlContent");
    	String pPath=HtmlToPdf.writeHtmlToFile(h, "企业担保信息查询");
    	HtmlToPdf.convert(pPath+"\\企业担保信息查询.html", pPath+"\\企业担保信息查询.pdf");
    	HtmlToPdf.exportPDF("企业担保信息查询",pPath, response);
		return null;
    }
	
}
