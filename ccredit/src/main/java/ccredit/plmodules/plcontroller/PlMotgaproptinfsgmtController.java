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
import ccredit.plmodules.plmodel.PlMotgaproptinfsgmt;
import ccredit.plmodules.plservice.PlMotgaproptinfsgmtService;

/**
* 抵押物信息 
* 2018-04-28 17:06:08  yangzhou
*/
@Controller
@RequestMapping("/plMotgaproptinfsgmtController")
public class PlMotgaproptinfsgmtController extends BaseAction{
	@Autowired
	private PlMotgaproptinfsgmtService plMotgaproptinfsgmtService;
	/**
	* 载入初始化页面
	* @param pl_motgaproptinfsgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadPlMotgaproptinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public ModelAndView loadPlMotgaproptinfsgmt(PlMotgaproptinfsgmt plMotgaproptinfsgmt,HttpServletRequest request){
		return new ModelAndView("pc/pl/pl-motgaproptinfsgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param pl_motgaproptinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getPlMotgaproptinfsgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getPlMotgaproptinfsgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<PlMotgaproptinfsgmt> plMotgaproptinfsgmtList = plMotgaproptinfsgmtService.getPlMotgaproptinfsgmtListByCondition(condition);
		PageInfo<PlMotgaproptinfsgmt> page = new PageInfo<PlMotgaproptinfsgmt>(plMotgaproptinfsgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param pl_motgaproptinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getPlMotgaproptinfsgmtById",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getPlMotgaproptinfsgmtById(String pl_motgaproptinfsgmt_id,HttpServletRequest request){
		PlMotgaproptinfsgmt plMotgaproptinfsgmt = plMotgaproptinfsgmtService.getPlMotgaproptinfsgmtById(pl_motgaproptinfsgmt_id);
		return outDataStr2(plMotgaproptinfsgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param pl_motgaproptinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addPlMotgaproptinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String addPlMotgaproptinfsgmt(PlMotgaproptinfsgmt plMotgaproptinfsgmt,HttpServletRequest request){
		int i = 0;
		if(null != plMotgaproptinfsgmt && !"".equals(plMotgaproptinfsgmt)){
			plMotgaproptinfsgmt.setPl_motgaproptinfsgmt_id(UUID.toUUID());
			plMotgaproptinfsgmt.setLastdate(new Date(System.currentTimeMillis()));
			plMotgaproptinfsgmt.setChangeflag("1");
			i=plMotgaproptinfsgmtService.addPlMotgaproptinfsgmt(plMotgaproptinfsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param pl_motgaproptinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updatePlMotgaproptinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String updatePlMotgaproptinfsgmt(PlMotgaproptinfsgmt plMotgaproptinfsgmt,HttpServletRequest request){
		int i = 0;
		if(null != plMotgaproptinfsgmt && !"".equals(plMotgaproptinfsgmt)){
			plMotgaproptinfsgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=plMotgaproptinfsgmtService.updatePlMotgaproptinfsgmt(plMotgaproptinfsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param pl_motgaproptinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delPlMotgaproptinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String delPlMotgaproptinfsgmt(String pl_motgaproptinfsgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != pl_motgaproptinfsgmt_id && !"".equals(pl_motgaproptinfsgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("pl_motgaproptinfsgmt_id",pl_motgaproptinfsgmt_id.split(","));
			i=plMotgaproptinfsgmtService.delPlMotgaproptinfsgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param pl_motgaproptinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyPlMotgaproptinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String copyPlMotgaproptinfsgmt(String pl_motgaproptinfsgmt_id,HttpServletRequest request){
		int i = 0;
		PlMotgaproptinfsgmt plMotgaproptinfsgmt = plMotgaproptinfsgmtService.getPlMotgaproptinfsgmtById(pl_motgaproptinfsgmt_id);
		if(null != plMotgaproptinfsgmt && !"".equals(plMotgaproptinfsgmt)){
			plMotgaproptinfsgmt.setPl_motgaproptinfsgmt_id(UUID.toUUID());
			i=plMotgaproptinfsgmtService.addPlMotgaproptinfsgmt(plMotgaproptinfsgmt);
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
	@RequestMapping(value="/exportPlMotgaproptinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public void exportPlMotgaproptinfsgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
