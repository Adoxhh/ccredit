package ccredit.plmodules.plcontroller;
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
import ccredit.xtmodules.xtcore.util.UUID;
import ccredit.xtmodules.xtcore.annotation.AuthUneedLogin;
import ccredit.plmodules.plmodel.PlMotgacltalbsinfsgmt;
import ccredit.plmodules.plservice.PlMotgacltalbsinfsgmtService;

/**
* 抵（质）押合同基本信息段 
* 2018-04-28 16:59:38  yangzhou
*/
@Controller
@RequestMapping("/plMotgacltalbsinfsgmtController")
public class PlMotgacltalbsinfsgmtController extends BaseAction{
	@Autowired
	private PlMotgacltalbsinfsgmtService plMotgacltalbsinfsgmtService;
	/**
	* 载入初始化页面
	* @param pl_motgacltalbsinfsgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadPlMotgacltalbsinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public ModelAndView loadPlMotgacltalbsinfsgmt(PlMotgacltalbsinfsgmt plMotgacltalbsinfsgmt,HttpServletRequest request){
		return new ModelAndView("pc/pl/pl-motgacltalbsinfsgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param pl_motgacltalbsinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getPlMotgacltalbsinfsgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getPlMotgacltalbsinfsgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<PlMotgacltalbsinfsgmt> plMotgacltalbsinfsgmtList = plMotgacltalbsinfsgmtService.getPlMotgacltalbsinfsgmtListByCondition(condition);
		PageInfo<PlMotgacltalbsinfsgmt> page = new PageInfo<PlMotgacltalbsinfsgmt>(plMotgacltalbsinfsgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param pl_motgacltalbsinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getPlMotgacltalbsinfsgmtById",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getPlMotgacltalbsinfsgmtById(String pl_motgacltalbsinfsgmt_id,HttpServletRequest request){
		PlMotgacltalbsinfsgmt plMotgacltalbsinfsgmt = plMotgacltalbsinfsgmtService.getPlMotgacltalbsinfsgmtById(pl_motgacltalbsinfsgmt_id);
		return outDataStr2(plMotgacltalbsinfsgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param pl_motgacltalbsinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addPlMotgacltalbsinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String addPlMotgacltalbsinfsgmt(PlMotgacltalbsinfsgmt plMotgacltalbsinfsgmt,HttpServletRequest request){
		int i = 0;
		if(null != plMotgacltalbsinfsgmt && !"".equals(plMotgacltalbsinfsgmt)){
			plMotgacltalbsinfsgmt.setPl_motgacltalbsinfsgmt_id(UUID.toUUID());
			plMotgacltalbsinfsgmt.setLastdate(new Date(System.currentTimeMillis()));
			plMotgacltalbsinfsgmt.setChangeflag("1");
			i=plMotgacltalbsinfsgmtService.addPlMotgacltalbsinfsgmt(plMotgacltalbsinfsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param pl_motgacltalbsinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updatePlMotgacltalbsinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String updatePlMotgacltalbsinfsgmt(PlMotgacltalbsinfsgmt plMotgacltalbsinfsgmt,HttpServletRequest request){
		int i = 0;
		if(null != plMotgacltalbsinfsgmt && !"".equals(plMotgacltalbsinfsgmt)){
			plMotgacltalbsinfsgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=plMotgacltalbsinfsgmtService.updatePlMotgacltalbsinfsgmt(plMotgacltalbsinfsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param pl_motgacltalbsinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delPlMotgacltalbsinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String delPlMotgacltalbsinfsgmt(String pl_motgacltalbsinfsgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != pl_motgacltalbsinfsgmt_id && !"".equals(pl_motgacltalbsinfsgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("pl_motgacltalbsinfsgmt_id",pl_motgacltalbsinfsgmt_id.split(","));
			i=plMotgacltalbsinfsgmtService.delPlMotgacltalbsinfsgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param pl_motgacltalbsinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyPlMotgacltalbsinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String copyPlMotgacltalbsinfsgmt(String pl_motgacltalbsinfsgmt_id,HttpServletRequest request){
		int i = 0;
		PlMotgacltalbsinfsgmt plMotgacltalbsinfsgmt = plMotgacltalbsinfsgmtService.getPlMotgacltalbsinfsgmtById(pl_motgacltalbsinfsgmt_id);
		if(null != plMotgacltalbsinfsgmt && !"".equals(plMotgacltalbsinfsgmt)){
			plMotgacltalbsinfsgmt.setPl_motgacltalbsinfsgmt_id(UUID.toUUID());
			i=plMotgacltalbsinfsgmtService.addPlMotgacltalbsinfsgmt(plMotgacltalbsinfsgmt);
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
	@RequestMapping(value="/exportPlMotgacltalbsinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public void exportPlMotgacltalbsinfsgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
