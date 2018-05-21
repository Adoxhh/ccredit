package ccredit.spmodules.spweb;
import java.util.ArrayList;
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

import ccredit.asmodules.asmodel.AsGuaracctbssgmt;
import ccredit.asmodules.asservice.AsGuaracctbssgmtService;
import ccredit.loanmodules.loanmodel.LoanAcctbssgmt;
import ccredit.loanmodules.loanmodel.LoanCtrctbssgmt;
import ccredit.loanmodules.loanmodel.LoanGuarbssgmt;
import ccredit.loanmodules.loanservice.LoanAcctbssgmtService;
import ccredit.loanmodules.loanservice.LoanCtrctbssgmtService;
import ccredit.loanmodules.loanservice.LoanGuarbssgmtService;
import ccredit.plmodules.plmodel.PlMotgacltalctrctbssgmt;
import ccredit.plmodules.plservice.PlMotgacltalctrctbssgmtService;
import ccredit.spmodules.spmodel.SpChangemsg;
import ccredit.spmodules.spservice.SpChangemsgService;
import ccredit.xtmodules.xtcore.annotation.AuthUneedLogin;
import ccredit.xtmodules.xtcore.base.BaseAction;
import ccredit.xtmodules.xtcore.base.BaseSearch;
import ccredit.xtmodules.xtcore.util.CommonUtils;
import ccredit.xtmodules.xtcore.util.UUID;
import ccredit.xtmodules.xtcore.util.excel.poi.ExportExcel;
import ccredit.xtmodules.xtmodel.XtUserinfo;

/**
* 变更类报文 
* 2018-05-02 09:39:48  孟贝贝
*/
@Controller
@RequestMapping("/spChangemsgController")
public class SpChangemsgController extends BaseAction{
	@Autowired
	private SpChangemsgService spChangemsgService;
	@Autowired
	private LoanAcctbssgmtService loanAcctbssgmtService;
	@Autowired
	private LoanCtrctbssgmtService loanCtrctbssgmtService;
	@Autowired
	private LoanGuarbssgmtService loanGuarbssgmtService;
	@Autowired
	private AsGuaracctbssgmtService asGuaracctbssgmtService;
	@Autowired
	private PlMotgacltalctrctbssgmtService plMotgacltalctrctbssgmtService;
	/**
	* 载入初始化页面
	* @param sp_changemsg 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadSpChangemsg",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public ModelAndView loadSpChangemsg(SpChangemsg spChangemsg,HttpServletRequest request){
		return new ModelAndView("pc/sp-view/sp-changemsg/sp-changemsg-list");
	}
	/**
	* 载入申请页面
	* @param sp_changemsg 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/initApply",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public ModelAndView initApply(SpChangemsg spChangemsg,HttpServletRequest request){
		return new ModelAndView("pc/sp-view/sp-changemsg/sp-changemsg-apply");
	}
	/**
	* 载入审批页面
	* @param sp_changemsg 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/initAudit",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public ModelAndView initAudit(SpChangemsg spChangemsg,HttpServletRequest request){
		return new ModelAndView("pc/sp-view/sp-changemsg/sp-changemsg-audit");
	}

	/**
	* 加载初始化列表数据并分页
	* @param sp_changemsg 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getSpChangemsgListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getSpChangemsgListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<SpChangemsg> spChangemsgList = spChangemsgService.getSpChangemsgListByCondition(condition);
		PageInfo<SpChangemsg> page = new PageInfo<SpChangemsg>(spChangemsgList);
		return outPageStr(page,request);
	}
	/**
	* 加载初始化列表数据并分页
	* @param sp_changemsg 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getAuditSpChangemsgListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getAuditSpChangemsgListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		condition.put("status", "1");
		List<SpChangemsg> spChangemsgList = spChangemsgService.getSpChangemsgListByCondition(condition);
		PageInfo<SpChangemsg> page = new PageInfo<SpChangemsg>(spChangemsgList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param changemsg_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getSpChangemsgById",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getSpChangemsgById(String changemsg_id,HttpServletRequest request){
		SpChangemsg spChangemsg = spChangemsgService.getSpChangemsgById(changemsg_id);
		return outDataStr2(spChangemsg,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param sp_changemsg 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addSpChangemsg",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String addSpChangemsg(SpChangemsg spChangemsg,HttpServletRequest request){
		int i = 0;
		if(null != spChangemsg && !"".equals(spChangemsg)){
			spChangemsg.setChangemsg_id(UUID.toUUID());
			i=spChangemsgService.addSpChangemsg(spChangemsg);
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
	@RequestMapping(value="/applySpChangemsg",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String applySpChangemsg(SpChangemsg spChangemsg,HttpServletRequest request){
		int i = 0;
		XtUserinfo xtUserinfo = CommonUtils.getXtU();
		if(null != spChangemsg && !"".equals(spChangemsg)){
			spChangemsg.setChangemsg_id(UUID.toUUID());
			//spChangemsg.setOdbnescode(spChangemsg.getOdbnescode().replace(",", ""));
			spChangemsg.setApplyman(xtUserinfo.getXt_userinfo_id());
			spChangemsg.setCredittime(new Date(System.currentTimeMillis()));
			spChangemsg.setStatus("1");//已申请
			i=spChangemsgService.addSpChangemsg(spChangemsg);
		}
		if(i>0){
			return outAudStr(true,"申请成功");
		}else{
			return outAudStr(false,"申请失败");
		}
	}
	/**
	* 修改
	* @param sp_changemsg 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateSpChangemsg",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String updateSpChangemsg(SpChangemsg spChangemsg,HttpServletRequest request){
		int i = 0;
		if(null != spChangemsg && !"".equals(spChangemsg)){
			i=spChangemsgService.updateSpChangemsg(spChangemsg);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param changemsg_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delSpChangemsg",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String delSpChangemsg(String changemsg_id,HttpServletRequest request){
		int i = 0;
		if(null != changemsg_id && !"".equals(changemsg_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("changemsg_id",changemsg_id.split(","));
			i=spChangemsgService.delSpChangemsg(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param changemsg_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copySpChangemsg",method={RequestMethod.POST,RequestMethod.GET})
	public String copySpChangemsg(String changemsg_id,HttpServletRequest request){
		int i = 0;
		SpChangemsg spChangemsg = spChangemsgService.getSpChangemsgById(changemsg_id);
		if(null != spChangemsg && !"".equals(spChangemsg)){
			spChangemsg.setChangemsg_id(UUID.toUUID());
			i=spChangemsgService.addSpChangemsg(spChangemsg);
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
	@RequestMapping(value="/exportSpChangemsg",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public void exportSpChangemsg(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
	
	/**
	* 加载初始化业务标识
	* @param sp_changemsg 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getRecCode",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getRecCode(String infrectype,BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = new HashMap<>();
		List codeList = new ArrayList<>();
		if(infrectype.equals("411")||infrectype.equals("412")||infrectype.equals("413")||infrectype.equals("414")){
			List<LoanAcctbssgmt> list=loanAcctbssgmtService.getLoanAcctbssgmtListByCondition(condition);
			Map<String, Object> reccode = new HashMap<>();
			for(LoanAcctbssgmt acctbssgmt:list){
				reccode.put("code", acctbssgmt.getAcctcode());
				reccode.put("name", acctbssgmt.getName());
				reccode.put("idtype", acctbssgmt.getIdtypetext());
				reccode.put("idnum", acctbssgmt.getIdnum());
				codeList.add(reccode);
			}
		}		
		if(infrectype.equals("421")||infrectype.equals("432")||infrectype.equals("423")||infrectype.equals("424")){
			List<LoanCtrctbssgmt> list=loanCtrctbssgmtService.getLoanCtrctbssgmtListByCondition(condition);
			Map<String, Object> reccode = new HashMap<>();
			for(LoanCtrctbssgmt ctrct:list){
				reccode.put("code", ctrct.getContractcode());
				reccode.put("name", ctrct.getName());
				reccode.put("idtype", ctrct.getIdtypetext());
				reccode.put("idnum", ctrct.getIdnum());
				codeList.add(reccode);
			}
		}
		
		if(infrectype.equals("431")||infrectype.equals("522")||infrectype.equals("433")||infrectype.equals("434")){
			List<LoanGuarbssgmt> list=loanGuarbssgmtService.getLoanGuarbssgmtListByCondition(condition);
			Map<String, Object> reccode = new HashMap<>();
			for(LoanGuarbssgmt guar:list){
				reccode.put("code", guar.getGuarmccode());
				reccode.put("name", guar.getName());
				reccode.put("idtype", guar.getIdtypetext());
				reccode.put("idnum", guar.getIdnum());
				codeList.add(reccode);
			}
		}
		
		if(infrectype.equals("441")||infrectype.equals("442")||infrectype.equals("443")||infrectype.equals("444")){
			List<AsGuaracctbssgmt> list=asGuaracctbssgmtService.getAsGuaracctbssgmtListByCondition(condition);
			Map<String, Object> reccode = new HashMap<>();
			for(AsGuaracctbssgmt asguar:list){
				reccode.put("code", asguar.getAcctcode());
				reccode.put("name", asguar.getName());
				reccode.put("idtype", asguar.getIdtypetext());
				reccode.put("idnum", asguar.getIdnum());
				codeList.add(reccode);
			}
		}
		if(infrectype.equals("514")){
			List<PlMotgacltalctrctbssgmt> list=plMotgacltalctrctbssgmtService.getPlMotgacltalctrctbssgmtListByCondition(condition);
			Map<String, Object> reccode = new HashMap<>();
			for(PlMotgacltalctrctbssgmt pl:list){
				reccode.put("code", pl.getCccode());
				reccode.put("name", pl.getName());
				reccode.put("idtype", pl.getCerttypetext());
				reccode.put("idnum", pl.getCertnum());
				codeList.add(reccode);
			}
		}
		PageInfo page = new PageInfo(codeList);
		return outPageStr(page,request);
	}
	/**
	* 审批
	* @param id 
	* @param request 
	*/
	@ResponseBody
	@AuthUneedLogin
	@RequestMapping(value="/auditSpChangemsg",method={RequestMethod.POST,RequestMethod.GET})
	public String auditSpChangemsg(String id,String isAgree,HttpServletRequest request){
		XtUserinfo xtUserinfo = CommonUtils.getXtU();
		int i = 0;
		if(null != id && !"".equals(id)){
			SpChangemsg changemsg=spChangemsgService.getSpChangemsgById(id);
			changemsg.setAuditman(xtUserinfo.getXt_userinfo_id());
			if(isAgree.equals("T")){
				changemsg.setStatus("2"); //审核通过 
			}else{                               
				changemsg.setStatus("N"); //审核不通过
			}			
			i=spChangemsgService.updateSpChangemsg(changemsg);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	
	
	
   /**
	* 变更类报文历史信息查询页面
	*/
	@AuthUneedLogin
	@RequestMapping(value="/queryChangemsg",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView queryChangemsg(SpChangemsg spChangemsg,HttpServletRequest request){
		return new ModelAndView("pc/sp-view/sp-changemsg/sp-changemsg-query");
	}
}
