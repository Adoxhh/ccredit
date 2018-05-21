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
import ccredit.plmodules.plmodel.PlComrecinfsgmt;
import ccredit.plmodules.plservice.PlComrecinfsgmtService;

/**
* 抵(质)押合同共同债务人信息 
* 2018-04-28 17:01:31  yangzhou
*/
@Controller
@RequestMapping("/plComrecinfsgmtController")
public class PlComrecinfsgmtController extends BaseAction{
	@Autowired
	private PlComrecinfsgmtService plComrecinfsgmtService;
	/**
	* 载入初始化页面
	* @param pl_comrecinfsgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadPlComrecinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public ModelAndView loadPlComrecinfsgmt(PlComrecinfsgmt plComrecinfsgmt,HttpServletRequest request){
		return new ModelAndView("pc/pl/pl-comrecinfsgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param pl_comrecinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getPlComrecinfsgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getPlComrecinfsgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<PlComrecinfsgmt> plComrecinfsgmtList = plComrecinfsgmtService.getPlComrecinfsgmtListByCondition(condition);
		PageInfo<PlComrecinfsgmt> page = new PageInfo<PlComrecinfsgmt>(plComrecinfsgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param pl_comrecinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getPlComrecinfsgmtById",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getPlComrecinfsgmtById(String pl_comrecinfsgmt_id,HttpServletRequest request){
		PlComrecinfsgmt plComrecinfsgmt = plComrecinfsgmtService.getPlComrecinfsgmtById(pl_comrecinfsgmt_id);
		return outDataStr2(plComrecinfsgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param pl_comrecinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addPlComrecinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String addPlComrecinfsgmt(PlComrecinfsgmt plComrecinfsgmt,HttpServletRequest request){
		int i = 0;
		if(null != plComrecinfsgmt && !"".equals(plComrecinfsgmt)){
			plComrecinfsgmt.setPl_comrecinfsgmt_id(UUID.toUUID());
			plComrecinfsgmt.setLastdate(new Date(System.currentTimeMillis()));
			plComrecinfsgmt.setChangeflag("1");
			i=plComrecinfsgmtService.addPlComrecinfsgmt(plComrecinfsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param pl_comrecinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updatePlComrecinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String updatePlComrecinfsgmt(PlComrecinfsgmt plComrecinfsgmt,HttpServletRequest request){
		int i = 0;
		if(null != plComrecinfsgmt && !"".equals(plComrecinfsgmt)){
			plComrecinfsgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=plComrecinfsgmtService.updatePlComrecinfsgmt(plComrecinfsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param pl_comrecinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delPlComrecinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String delPlComrecinfsgmt(String pl_comrecinfsgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != pl_comrecinfsgmt_id && !"".equals(pl_comrecinfsgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("pl_comrecinfsgmt_id",pl_comrecinfsgmt_id.split(","));
			i=plComrecinfsgmtService.delPlComrecinfsgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param pl_comrecinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyPlComrecinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String copyPlComrecinfsgmt(String pl_comrecinfsgmt_id,HttpServletRequest request){
		int i = 0;
		PlComrecinfsgmt plComrecinfsgmt = plComrecinfsgmtService.getPlComrecinfsgmtById(pl_comrecinfsgmt_id);
		if(null != plComrecinfsgmt && !"".equals(plComrecinfsgmt)){
			plComrecinfsgmt.setPl_comrecinfsgmt_id(UUID.toUUID());
			i=plComrecinfsgmtService.addPlComrecinfsgmt(plComrecinfsgmt);
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
	@RequestMapping(value="/exportPlComrecinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public void exportPlComrecinfsgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
