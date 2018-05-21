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

import ccredit.xmlmodules.xmlmodel.Xmlnode;
import ccredit.xmlmodules.xmlservice.XmlnodeService;
import ccredit.xtmodules.xtcore.annotation.AuthUneedLogin;
import ccredit.xtmodules.xtcore.base.BaseAction;
import ccredit.xtmodules.xtcore.base.BaseSearch;
import ccredit.xtmodules.xtcore.util.UUID;
import ccredit.xtmodules.xtcore.util.excel.poi.ExportExcel;



/**
* xmlnode 
* 2018-04-08 14:33:21  孟贝贝
*/
@Controller
@RequestMapping("/xmlnodeController")
public class XmlnodeController extends BaseAction{
	@Autowired
	private XmlnodeService xmlnodeService;
	/**
	* 载入初始化页面
	* @param xmlnode 
	* @param request 
	* @return
	*/
	@AuthUneedLogin
	@RequestMapping(value="/loadXmlnode",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView loadXmlnode(Xmlnode xmlnode,HttpServletRequest request){
		return new ModelAndView("pc/xml-view/xmlnode/xmlnode-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param xmlnode 
	* @param request 
	*/
	@ResponseBody
	@AuthUneedLogin
	@RequestMapping(value="/getXmlnodeListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	public String getXmlnodeListByCondition(BaseSearch baseSearch,String segmentid,String nodename,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		if(StringUtils.isNotBlank(segmentid)){
			condition.put("segmentid", segmentid);
		}
		if(StringUtils.isNotBlank(nodename)){
			condition.put("nodename", nodename);
		}
		commonHPager(condition,request);
		List<Xmlnode> xmlnodeList = xmlnodeService.getXmlnodeListByCondition(condition);
		PageInfo<Xmlnode> page = new PageInfo<Xmlnode>(xmlnodeList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param id 
	* @param request 
	*/
	@ResponseBody
	@AuthUneedLogin
	@RequestMapping(value="/getXmlnodeById",method={RequestMethod.POST,RequestMethod.GET})
	public String getXmlnodeById(String id,HttpServletRequest request){
		Xmlnode xmlnode = xmlnodeService.getXmlnodeById(id);
		return outDataStr2(xmlnode,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param xmlnode 
	* @param request 
	*/
	@ResponseBody
	@AuthUneedLogin
	@RequestMapping(value="/addXmlnode",method={RequestMethod.POST,RequestMethod.GET})
	public String addXmlnode(Xmlnode xmlnode,HttpServletRequest request){
		int i = 0;
		if(null != xmlnode && !"".equals(xmlnode)){
			xmlnode.setId(UUID.toUUID());
			String parentid=xmlnode.getParentid()==null?"":xmlnode.getParentid().trim();
	    	String segmentid=xmlnode.getSegmentid();
	    	String nodeid=getMenuIdGenerator(parentid,segmentid);
	    	xmlnode.setNodeid(nodeid);
			i=xmlnodeService.addXmlnode(xmlnode);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	
    public String getMenuIdGenerator(String pParentid,String segmentid){
		String maxSubMenuId = xmlnodeService.findmaxSubMenuId(pParentid,segmentid);
		String menuId = null;
		if(maxSubMenuId==null){
			menuId = "01";
		}else{
			int length = maxSubMenuId.length();
			String temp = maxSubMenuId.substring(length-2, length);
			int intMenuId = Integer.valueOf(temp).intValue() + 1;
			if(intMenuId > 0 && intMenuId < 10){
				menuId = "0" + String.valueOf(intMenuId);
			}else if(10 <= intMenuId && intMenuId <= 99){
				menuId = String.valueOf(intMenuId);
			}else if(intMenuId > 99){
				//logger.error( "生成菜单编号越界了.同级兄弟节点编号为[01-99]\n请和您的系统管理员联系!");
			}else{
				//logger.error("生成菜单编号发生未知错误,请和开发人员联系!");
			}
		}
		return pParentid + menuId;
	}
	/**
	* 修改
	* @param xmlnode 
	* @param request 
	*/
	@ResponseBody
	@AuthUneedLogin
	@RequestMapping(value="/updateXmlnode",method={RequestMethod.POST,RequestMethod.GET})
	public String updateXmlnode(Xmlnode xmlnode,HttpServletRequest request){
		int i = 0;
		if(null != xmlnode && !"".equals(xmlnode)){
			i=xmlnodeService.updateXmlnode(xmlnode);
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
	@RequestMapping(value="/delXmlnode",method={RequestMethod.POST,RequestMethod.GET})
	public String delXmlnode(String id,HttpServletRequest request){
		int i = 0;
		if(null != id && !"".equals(id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("id",id.split(","));
			i=xmlnodeService.delXmlnode(condition);
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
	@RequestMapping(value="/copyXmlnode",method={RequestMethod.POST,RequestMethod.GET})
	public String copyXmlnode(String id,HttpServletRequest request){
		int i = 0;
		Xmlnode xmlnode = xmlnodeService.getXmlnodeById(id);
		if(null != xmlnode && !"".equals(xmlnode)){
			xmlnode.setId(UUID.toUUID());
			i=xmlnodeService.addXmlnode(xmlnode);
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
	@RequestMapping(value="/exportXmlnode",method={RequestMethod.POST,RequestMethod.GET})
	public void exportXmlnode(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
