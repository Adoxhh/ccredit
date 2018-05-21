package ccredit.xmlmodules.xmlcontroller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;

import ccredit.xmlmodules.xmlmodel.Xmlsegment;
import ccredit.xmlmodules.xmlservice.XmlsegmentService;
import ccredit.xtmodules.xtcore.annotation.AuthUneedLogin;
import ccredit.xtmodules.xtcore.base.BaseAction;
import ccredit.xtmodules.xtcore.base.BaseSearch;
import ccredit.xtmodules.xtcore.util.UUID;
import ccredit.xtmodules.xtcore.util.excel.poi.ExportExcel;



/**
* xmlsegment 
* 2018-04-08 14:31:32  孟贝贝
*/
@Controller
@RequestMapping("/xmlsegmentController")
public class XmlsegmentController extends BaseAction{
	@Autowired
	private XmlsegmentService xmlsegmentService;
	/**
	* 载入初始化页面
	* @param xmlsegment 
	* @param request 
	* @return
	*/
	@AuthUneedLogin
	@RequestMapping(value="/loadXmlsegment",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView loadXmlsegment(Xmlsegment xmlsegment,String id,HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView("pc/xml-view/xmlsegment/xmlsegment-list");
		modelAndView.addObject("templateid",id);		
        return modelAndView;
	}
	/**
	* 加载初始化列表数据并分页
	* @param xmlsegment 
	* @param request 
	*/
	@ResponseBody
	@AuthUneedLogin
	@RequestMapping(value="/getXmlsegmentListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	public String getXmlsegmentListByCondition(BaseSearch baseSearch,String templateid,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		if(StringUtils.isNotBlank(templateid)){
			condition.put("templateid", templateid);
		}		
		commonHPager(condition,request);
		List<Xmlsegment> xmlsegmentList = xmlsegmentService.getXmlsegmentListByCondition(condition);
		PageInfo<Xmlsegment> page = new PageInfo<Xmlsegment>(xmlsegmentList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param id 
	* @param request 
	*/
	@ResponseBody
	@AuthUneedLogin
	@RequestMapping(value="/getXmlsegmentById",method={RequestMethod.POST,RequestMethod.GET})
	public String getXmlsegmentById(String id,HttpServletRequest request){
		Xmlsegment xmlsegment = xmlsegmentService.getXmlsegmentById(id);
		return outDataStr2(xmlsegment,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param xmlsegment 
	* @param request 
	*/
	@ResponseBody
	@AuthUneedLogin
	@RequestMapping(value="/addXmlsegment",method={RequestMethod.POST,RequestMethod.GET})
	public String addXmlsegment(Xmlsegment xmlsegment,HttpServletRequest request){
		int i = 0;
		if(null != xmlsegment && !"".equals(xmlsegment)){
			xmlsegment.setId(UUID.toUUID());
			i=xmlsegmentService.addXmlsegment(xmlsegment);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param xmlsegment 
	* @param request 
	*/
	@ResponseBody
	@AuthUneedLogin
	@RequestMapping(value="/updateXmlsegment",method={RequestMethod.POST,RequestMethod.GET})
	public String updateXmlsegment(Xmlsegment xmlsegment,HttpServletRequest request){
		int i = 0;
		if(null != xmlsegment && !"".equals(xmlsegment)){
			i=xmlsegmentService.updateXmlsegment(xmlsegment);
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
	@RequestMapping(value="/delXmlsegment",method={RequestMethod.POST,RequestMethod.GET})
	public String delXmlsegment(String id,HttpServletRequest request){
		int i = 0;
		if(null != id && !"".equals(id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("id",id.split(","));
			i=xmlsegmentService.delXmlsegment(condition);
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
	@RequestMapping(value="/copyXmlsegment",method={RequestMethod.POST,RequestMethod.GET})
	public String copyXmlsegment(String id,HttpServletRequest request){
		int i = 0;
		Xmlsegment xmlsegment = xmlsegmentService.getXmlsegmentById(id);
		if(null != xmlsegment && !"".equals(xmlsegment)){
			xmlsegment.setId(UUID.toUUID());
			i=xmlsegmentService.addXmlsegment(xmlsegment);
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
	@RequestMapping(value="/exportXmlsegment",method={RequestMethod.POST,RequestMethod.GET})
	public void exportXmlsegment(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
