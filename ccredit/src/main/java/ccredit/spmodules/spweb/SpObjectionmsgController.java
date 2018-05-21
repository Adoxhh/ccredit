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
import ccredit.spmodules.spmodel.SpObjectionmsg;
import ccredit.spmodules.spservice.SpObjectionmsgService;

/**
* 异议申请 
* 2018-05-03 10:27:23  mengbeibei
*/
@Controller
@RequestMapping("/spObjectionmsgController")
public class SpObjectionmsgController extends BaseAction{
	@Autowired
	private SpObjectionmsgService spObjectionmsgService;
	/**
	* 载入初始化页面
	* @param sp_objectionmsg 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadSpObjectionmsg",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public ModelAndView loadSpObjectionmsg(SpObjectionmsg spObjectionmsg,HttpServletRequest request){
		return new ModelAndView("pc/sp-view/sp-objectionmsg/sp-objectionmsg-list");
	}
	
	/**
	* 载入申请页面
	* @param sp_changemsg 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/initApply",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public ModelAndView initApply(SpObjectionmsg spObjectionmsg,HttpServletRequest request){
		return new ModelAndView("pc/sp-view/sp-objectionmsg/sp-objectionmsg-apply");
	}
	/**
	* 载入audit页面
	* @param sp_changemsg 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/initAudit",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public ModelAndView initAudit(SpObjectionmsg spObjectionmsg,HttpServletRequest request){
		return new ModelAndView("pc/sp-view/sp-objectionmsg/sp-objectionmsg-audit");
	}
	/**
	* 加载初始化列表数据并分页
	* @param sp_objectionmsg 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getSpObjectionmsgListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getSpObjectionmsgListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<SpObjectionmsg> spObjectionmsgList = spObjectionmsgService.getSpObjectionmsgListByCondition(condition);
		PageInfo<SpObjectionmsg> page = new PageInfo<SpObjectionmsg>(spObjectionmsgList);
		return outPageStr(page,request);
	}
	/**
	* 加载初始化列表数据并分页
	* @param sp_objectionmsg 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getAuditSpObjectionmsgListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getAuditSpObjectionmsgListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		condition.put("status", "1");
		List<SpObjectionmsg> spObjectionmsgList = spObjectionmsgService.getSpObjectionmsgListByCondition(condition);
		PageInfo<SpObjectionmsg> page = new PageInfo<SpObjectionmsg>(spObjectionmsgList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param objectionmsg_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getSpObjectionmsgById",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getSpObjectionmsgById(String objectionmsg_id,HttpServletRequest request){
		SpObjectionmsg spObjectionmsg = spObjectionmsgService.getSpObjectionmsgById(objectionmsg_id);
		return outDataStr2(spObjectionmsg,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param sp_objectionmsg 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addSpObjectionmsg",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String addSpObjectionmsg(SpObjectionmsg spObjectionmsg,HttpServletRequest request){
		int i = 0;
		if(null != spObjectionmsg && !"".equals(spObjectionmsg)){
			spObjectionmsg.setObjectionmsg_id(UUID.toUUID());
			i=spObjectionmsgService.addSpObjectionmsg(spObjectionmsg);
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
	@RequestMapping(value="/applySpObjectionmsg",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String applySpObjectionmsg(SpObjectionmsg spObjectionmsg,HttpServletRequest request){
		int i = 0;
		XtUserinfo xtUserinfo = CommonUtils.getXtU();
		if(null != spObjectionmsg && !"".equals(spObjectionmsg)){
			spObjectionmsg.setObjectionmsg_id(UUID.toUUID());
			spObjectionmsg.setRegperson(xtUserinfo.getXt_userinfo_id());
			spObjectionmsg.setApplytime(new Date(System.currentTimeMillis()));
			spObjectionmsg.setStatus("1");//已申请
			i=spObjectionmsgService.addSpObjectionmsg(spObjectionmsg);
		}
		if(i>0){
			return outAudStr(true,"申请成功");
		}else{
			return outAudStr(false,"申请失败");
		}
	}
	/**
	* 修改
	* @param sp_objectionmsg 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateSpObjectionmsg",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String updateSpObjectionmsg(SpObjectionmsg spObjectionmsg,HttpServletRequest request){
		int i = 0;
		if(null != spObjectionmsg && !"".equals(spObjectionmsg)){
			i=spObjectionmsgService.updateSpObjectionmsg(spObjectionmsg);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param objectionmsg_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delSpObjectionmsg",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String delSpObjectionmsg(String objectionmsg_id,HttpServletRequest request){
		int i = 0;
		if(null != objectionmsg_id && !"".equals(objectionmsg_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("objectionmsg_id",objectionmsg_id.split(","));
			i=spObjectionmsgService.delSpObjectionmsg(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param objectionmsg_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copySpObjectionmsg",method={RequestMethod.POST,RequestMethod.GET})
	public String copySpObjectionmsg(String objectionmsg_id,HttpServletRequest request){
		int i = 0;
		SpObjectionmsg spObjectionmsg = spObjectionmsgService.getSpObjectionmsgById(objectionmsg_id);
		if(null != spObjectionmsg && !"".equals(spObjectionmsg)){
			spObjectionmsg.setObjectionmsg_id(UUID.toUUID());
			i=spObjectionmsgService.addSpObjectionmsg(spObjectionmsg);
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
	@RequestMapping(value="/exportSpObjectionmsg",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public void exportSpObjectionmsg(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
	/**
	* 审批
	*/
	@ResponseBody
	@AuthUneedLogin
	@RequestMapping(value="/auditSpObjectionmsg",method={RequestMethod.POST,RequestMethod.GET})
	public String auditSpObjectionmsg(String id,String isAgree,HttpServletRequest request){
		XtUserinfo xtUserinfo = CommonUtils.getXtU();
		int i = 0;
		if(null != id && !"".equals(id)){
			SpObjectionmsg objectionmsg=spObjectionmsgService.getSpObjectionmsgById(id);
			objectionmsg.setCheckperson(xtUserinfo.getXt_userinfo_realName());
			if(isAgree.equals("T")){
				objectionmsg.setStatus("2"); //审核通过
			}else{
				objectionmsg.setStatus("N"); //审核不通过
			}			
			i=spObjectionmsgService.updateSpObjectionmsg(objectionmsg);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	
	/**
	* 异议历史信息查询页面
	*/
	@AuthUneedLogin
	@RequestMapping(value="/queryObjectmsg",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView queryObjectmsg(SpObjectionmsg spObjectionmsg,HttpServletRequest request){
		return new ModelAndView("pc/sp-view/sp-objectionmsg/sp-objectionmsg-query");
	}
	
}
