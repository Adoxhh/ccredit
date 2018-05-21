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
import ccredit.plmodules.plmodel.PlCltalinfsgmt;
import ccredit.plmodules.plservice.PlCltalinfsgmtService;

/**
* 质物信息 
* 2018-04-28 17:08:53  yangzhou
*/
@Controller
@RequestMapping("/plCltalinfsgmtController")
public class PlCltalinfsgmtController extends BaseAction{
	@Autowired
	private PlCltalinfsgmtService plCltalinfsgmtService;
	/**
	* 载入初始化页面
	* @param pl_cltalinfsgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadPlCltalinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public ModelAndView loadPlCltalinfsgmt(PlCltalinfsgmt plCltalinfsgmt,HttpServletRequest request){
		return new ModelAndView("pc/pl/pl-cltalinfsgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param pl_cltalinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getPlCltalinfsgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getPlCltalinfsgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<PlCltalinfsgmt> plCltalinfsgmtList = plCltalinfsgmtService.getPlCltalinfsgmtListByCondition(condition);
		PageInfo<PlCltalinfsgmt> page = new PageInfo<PlCltalinfsgmt>(plCltalinfsgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param pl_cltalinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getPlCltalinfsgmtById",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getPlCltalinfsgmtById(String pl_cltalinfsgmt_id,HttpServletRequest request){
		PlCltalinfsgmt plCltalinfsgmt = plCltalinfsgmtService.getPlCltalinfsgmtById(pl_cltalinfsgmt_id);
		return outDataStr2(plCltalinfsgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param pl_cltalinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addPlCltalinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String addPlCltalinfsgmt(PlCltalinfsgmt plCltalinfsgmt,HttpServletRequest request){
		int i = 0;
		if(null != plCltalinfsgmt && !"".equals(plCltalinfsgmt)){
			plCltalinfsgmt.setPl_cltalinfsgmt_id(UUID.toUUID());
			plCltalinfsgmt.setLastdate(new Date(System.currentTimeMillis()));
			plCltalinfsgmt.setChangeflag("1");
			i=plCltalinfsgmtService.addPlCltalinfsgmt(plCltalinfsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param pl_cltalinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updatePlCltalinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String updatePlCltalinfsgmt(PlCltalinfsgmt plCltalinfsgmt,HttpServletRequest request){
		int i = 0;
		if(null != plCltalinfsgmt && !"".equals(plCltalinfsgmt)){
			plCltalinfsgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=plCltalinfsgmtService.updatePlCltalinfsgmt(plCltalinfsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param pl_cltalinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delPlCltalinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String delPlCltalinfsgmt(String pl_cltalinfsgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != pl_cltalinfsgmt_id && !"".equals(pl_cltalinfsgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("pl_cltalinfsgmt_id",pl_cltalinfsgmt_id.split(","));
			i=plCltalinfsgmtService.delPlCltalinfsgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param pl_cltalinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyPlCltalinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String copyPlCltalinfsgmt(String pl_cltalinfsgmt_id,HttpServletRequest request){
		int i = 0;
		PlCltalinfsgmt plCltalinfsgmt = plCltalinfsgmtService.getPlCltalinfsgmtById(pl_cltalinfsgmt_id);
		if(null != plCltalinfsgmt && !"".equals(plCltalinfsgmt)){
			plCltalinfsgmt.setPl_cltalinfsgmt_id(UUID.toUUID());
			i=plCltalinfsgmtService.addPlCltalinfsgmt(plCltalinfsgmt);
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
	@RequestMapping(value="/exportPlCltalinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public void exportPlCltalinfsgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
