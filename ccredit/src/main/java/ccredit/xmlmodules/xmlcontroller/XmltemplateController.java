package ccredit.xmlmodules.xmlcontroller;
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

import ccredit.xmlmodules.xmlmodel.Xmltemplate;
import ccredit.xmlmodules.xmlservice.XmltemplateService;
import ccredit.xtmodules.xtcore.annotation.AuthUneedLogin;
import ccredit.xtmodules.xtcore.base.BaseAction;
import ccredit.xtmodules.xtcore.base.BaseSearch;
import ccredit.xtmodules.xtcore.util.UUID;
import ccredit.xtmodules.xtcore.util.excel.poi.ExportExcel;



/**
* xmltemplate 
* 2018-04-08 14:29:28  孟贝贝
*/
@Controller
@RequestMapping("/xmltemplateController")
public class XmltemplateController extends BaseAction{
	@Autowired
	private XmltemplateService xmltemplateService;
	/**
	* 载入初始化页面
	* @param xmltemplate 
	* @param request 
	* @return
	*/
	@AuthUneedLogin
	@RequestMapping(value="/loadXmltemplate",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView loadXmltemplate(Xmltemplate xmltemplate,HttpServletRequest request){
		return new ModelAndView("pc/xml-view/xmltemplate/xmltemplate-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param xmltemplate 
	* @param request 
	*/
	@ResponseBody
	@AuthUneedLogin
	@RequestMapping(value="/getXmltemplateListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	public String getXmltemplateListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<Xmltemplate> xmltemplateList = xmltemplateService.getXmltemplateListByCondition(condition);
		PageInfo<Xmltemplate> page = new PageInfo<Xmltemplate>(xmltemplateList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param id 
	* @param request 
	*/
	@ResponseBody
	@AuthUneedLogin
	@RequestMapping(value="/getXmltemplateById",method={RequestMethod.POST,RequestMethod.GET})
	public String getXmltemplateById(String id,HttpServletRequest request){
		Xmltemplate xmltemplate = xmltemplateService.getXmltemplateById(id);
		
		return outDataStr2(xmltemplate,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param xmltemplate 
	* @param request 
	*/
	@ResponseBody
	@AuthUneedLogin
	@RequestMapping(value="/addXmltemplate",method={RequestMethod.POST,RequestMethod.GET})
	public String addXmltemplate(Xmltemplate xmltemplate,HttpServletRequest request){
		int i = 0;
		if(null != xmltemplate && !"".equals(xmltemplate)){
			xmltemplate.setId(UUID.toUUID());
			xmltemplate.setCreatetime(new Date(System.currentTimeMillis()));
			i=xmltemplateService.addXmltemplate(xmltemplate);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param xmltemplate 
	* @param request 
	*/
	@ResponseBody
	@AuthUneedLogin
	@RequestMapping(value="/updateXmltemplate",method={RequestMethod.POST,RequestMethod.GET})
	public String updateXmltemplate(Xmltemplate xmltemplate,HttpServletRequest request){
		int i = 0;
		if(null != xmltemplate && !"".equals(xmltemplate)){
			i=xmltemplateService.updateXmltemplate(xmltemplate);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param id 
	* @param request 
	*/
	@ResponseBody
	@AuthUneedLogin
	@RequestMapping(value="/delXmltemplate",method={RequestMethod.POST,RequestMethod.GET})
	public String delXmltemplate(String id,HttpServletRequest request){
		int i = 0;
		if(null != id && !"".equals(id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("id",id.split(","));
			i=xmltemplateService.delXmltemplate(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param id 
	* @param request 
	*/
	@ResponseBody
	@AuthUneedLogin
	@RequestMapping(value="/copyXmltemplate",method={RequestMethod.POST,RequestMethod.GET})
	public String copyXmltemplate(String id,HttpServletRequest request){
		int i = 0;
		Xmltemplate xmltemplate = xmltemplateService.getXmltemplateById(id);
		if(null != xmltemplate && !"".equals(xmltemplate)){
			xmltemplate.setId(UUID.toUUID());
			i=xmltemplateService.addXmltemplate(xmltemplate);
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
	@AuthUneedLogin
	@RequestMapping(value="/exportXmltemplate",method={RequestMethod.POST,RequestMethod.GET})
	public void exportXmltemplate(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
