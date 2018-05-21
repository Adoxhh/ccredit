package ccredit.spmodules.spweb;
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
import ccredit.xtmodules.xtmodel.XtUserinfo;
import ccredit.xtmodules.xtcore.util.CommonUtils;
import ccredit.xtmodules.xtcore.util.UUID;
import ccredit.xtmodules.xtcore.annotation.AuthUneedLogin;
import ccredit.spmodules.spmodel.SpChangemsg;
import ccredit.spmodules.spmodel.SpDelmsg;
import ccredit.spmodules.spservice.SpDelmsgService;

/**
* sp_delmsg 
* 2018-05-03 10:33:05  mengbeibei
*/
@Controller
@RequestMapping("/spDelmsgController")
public class SpDelmsgController extends BaseAction{
	@Autowired
	private SpDelmsgService spDelmsgService;
	/**
	* 载入初始化页面
	* @param sp_delmsg 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadSpDelmsg",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public ModelAndView loadSpDelmsg(SpDelmsg spDelmsg,HttpServletRequest request){
		return new ModelAndView("pc/sp-view/sp-delmsg/sp-delmsg-list");
	}
	/**
	* 载入申请页面
	* @param sp_changemsg 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/initApply",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public ModelAndView initApply(SpDelmsg spDelmsg,HttpServletRequest request){
		return new ModelAndView("pc/sp-view/sp-delmsg/sp-delmsg-apply");
	}
	/**
	* 载入audit页面
	* @param sp_changemsg 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/initAudit",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public ModelAndView initAudit(SpDelmsg spDelmsg,HttpServletRequest request){
		return new ModelAndView("pc/sp-view/sp-delmsg/sp-delmsg-audit");
	}
	
	/**
	* 加载初始化列表数据并分页
	* @param sp_delmsg 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getSpDelmsgListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getSpDelmsgListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<SpDelmsg> spDelmsgList = spDelmsgService.getSpDelmsgListByCondition(condition);
		PageInfo<SpDelmsg> page = new PageInfo<SpDelmsg>(spDelmsgList);
		return outPageStr(page,request);
	}
	/**
	* 加载初始化列表数据并分页
	* @param sp_delmsg 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getAuditSpDelmsgListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getAuditSpDelmsgListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		condition.put("status", "1");
		List<SpDelmsg> spDelmsgList = spDelmsgService.getSpDelmsgListByCondition(condition);
		PageInfo<SpDelmsg> page = new PageInfo<SpDelmsg>(spDelmsgList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param delmsg_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getSpDelmsgById",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getSpDelmsgById(String delmsg_id,HttpServletRequest request){
		SpDelmsg spDelmsg = spDelmsgService.getSpDelmsgById(delmsg_id);
		return outDataStr2(spDelmsg,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param sp_delmsg 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addSpDelmsg",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String addSpDelmsg(SpDelmsg spDelmsg,HttpServletRequest request){
		int i = 0;
		if(null != spDelmsg && !"".equals(spDelmsg)){
			spDelmsg.setDelmsg_id(UUID.toUUID());
			i=spDelmsgService.addSpDelmsg(spDelmsg);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 申请
	* @param sp_changemsg 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/applySpDelmsg",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String applySpDelmsg(SpDelmsg spDelmsg,HttpServletRequest request){
		int i = 0;
		XtUserinfo xtUserinfo = CommonUtils.getXtU();
		if(null != spDelmsg && !"".equals(spDelmsg)){
			spDelmsg.setDelmsg_id(UUID.toUUID());
			spDelmsg.setApplyman(xtUserinfo.getXt_userinfo_id());
			spDelmsg.setCredittime(new Date(System.currentTimeMillis()));
			spDelmsg.setStatus("1");//已申请
			i=spDelmsgService.addSpDelmsg(spDelmsg);
		}
		if(i>0){
			return outAudStr(true,"申请成功");
		}else{
			return outAudStr(false,"申请失败");
		}
	}
	/**
	* 修改
	* @param sp_delmsg 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateSpDelmsg",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String updateSpDelmsg(SpDelmsg spDelmsg,HttpServletRequest request){
		int i = 0;
		if(null != spDelmsg && !"".equals(spDelmsg)){
			i=spDelmsgService.updateSpDelmsg(spDelmsg);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param delmsg_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delSpDelmsg",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String delSpDelmsg(String delmsg_id,HttpServletRequest request){
		int i = 0;
		if(null != delmsg_id && !"".equals(delmsg_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("delmsg_id",delmsg_id.split(","));
			i=spDelmsgService.delSpDelmsg(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param delmsg_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copySpDelmsg",method={RequestMethod.POST,RequestMethod.GET})
	public String copySpDelmsg(String delmsg_id,HttpServletRequest request){
		int i = 0;
		SpDelmsg spDelmsg = spDelmsgService.getSpDelmsgById(delmsg_id);
		if(null != spDelmsg && !"".equals(spDelmsg)){
			spDelmsg.setDelmsg_id(UUID.toUUID());
			i=spDelmsgService.addSpDelmsg(spDelmsg);
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
	@RequestMapping(value="/exportSpDelmsg",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public void exportSpDelmsg(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
	/**
	* 删除报文审批
	*/
	@ResponseBody
	@AuthUneedLogin
	@RequestMapping(value="/auditSpDelmsg",method={RequestMethod.POST,RequestMethod.GET})
	public String auditSpDelmsg(String id,String isAgree,HttpServletRequest request){
		XtUserinfo xtUserinfo = CommonUtils.getXtU();
		int i = 0;
		if(null != id && !"".equals(id)){
			SpDelmsg delmsg=spDelmsgService.getSpDelmsgById(id);
			delmsg.setAuditman(xtUserinfo.getXt_userinfo_realName());
			if(isAgree.equals("T")){
				delmsg.setStatus("2"); //审核通过
			}else{
				delmsg.setStatus("N"); //审核不通过
			}			
			i=spDelmsgService.updateSpDelmsg(delmsg);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	
	/**
	* 删除类报文历史信息查询页面
	*/
	@AuthUneedLogin
	@RequestMapping(value="/queryDelmsg",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView queryDelmsg(SpDelmsg spDelmsg,HttpServletRequest request){
		return new ModelAndView("pc/sp-view/sp-delmsg/sp-delmsg-query");
	}
}
