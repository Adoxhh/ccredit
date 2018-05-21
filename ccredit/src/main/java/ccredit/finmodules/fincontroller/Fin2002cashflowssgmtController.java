package ccredit.finmodules.fincontroller;
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
import ccredit.finmodules.finmodel.Fin2002cashflowssgmt;
import ccredit.finmodules.finservice.Fin2002cashflowssgmtService;

/**
* 2002版现金流量表 
* 2018-05-03 14:54:38  yangzhou
*/
@Controller
@RequestMapping("/fin2002cashflowssgmtController")
public class Fin2002cashflowssgmtController extends BaseAction{
	@Autowired
	private Fin2002cashflowssgmtService fin2002cashflowssgmtService;
	/**
	* 载入初始化页面
	* @param fin_2002cashflowssgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadFin2002cashflowssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public ModelAndView loadFin2002cashflowssgmt(Fin2002cashflowssgmt fin2002cashflowssgmt,HttpServletRequest request){
		return new ModelAndView("pc/fin/fin-2002cashflowssgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param fin_2002cashflowssgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getFin2002cashflowssgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getFin2002cashflowssgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<Fin2002cashflowssgmt> fin2002cashflowssgmtList = fin2002cashflowssgmtService.getFin2002cashflowssgmtListByCondition(condition);
		PageInfo<Fin2002cashflowssgmt> page = new PageInfo<Fin2002cashflowssgmt>(fin2002cashflowssgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param fin_2002cashflowssgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getFin2002cashflowssgmtById",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getFin2002cashflowssgmtById(String fin_2002cashflowssgmt_id,HttpServletRequest request){
		Fin2002cashflowssgmt fin2002cashflowssgmt = fin2002cashflowssgmtService.getFin2002cashflowssgmtById(fin_2002cashflowssgmt_id);
		return outDataStr2(fin2002cashflowssgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param fin_2002cashflowssgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addFin2002cashflowssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String addFin2002cashflowssgmt(Fin2002cashflowssgmt fin2002cashflowssgmt,HttpServletRequest request){
		int i = 0;
		if(null != fin2002cashflowssgmt && !"".equals(fin2002cashflowssgmt)){
			fin2002cashflowssgmt.setFin_2002cashflowssgmt_id(UUID.toUUID());
			fin2002cashflowssgmt.setLastdate(new Date(System.currentTimeMillis()));
			fin2002cashflowssgmt.setChangeflag("1");
			i=fin2002cashflowssgmtService.addFin2002cashflowssgmt(fin2002cashflowssgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param fin_2002cashflowssgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateFin2002cashflowssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String updateFin2002cashflowssgmt(Fin2002cashflowssgmt fin2002cashflowssgmt,HttpServletRequest request){
		int i = 0;
		if(null != fin2002cashflowssgmt && !"".equals(fin2002cashflowssgmt)){
			fin2002cashflowssgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=fin2002cashflowssgmtService.updateFin2002cashflowssgmt(fin2002cashflowssgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param fin_2002cashflowssgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delFin2002cashflowssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String delFin2002cashflowssgmt(String fin_2002cashflowssgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != fin_2002cashflowssgmt_id && !"".equals(fin_2002cashflowssgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("fin_2002cashflowssgmt_id",fin_2002cashflowssgmt_id.split(","));
			i=fin2002cashflowssgmtService.delFin2002cashflowssgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param fin_2002cashflowssgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyFin2002cashflowssgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String copyFin2002cashflowssgmt(String fin_2002cashflowssgmt_id,HttpServletRequest request){
		int i = 0;
		Fin2002cashflowssgmt fin2002cashflowssgmt = fin2002cashflowssgmtService.getFin2002cashflowssgmtById(fin_2002cashflowssgmt_id);
		if(null != fin2002cashflowssgmt && !"".equals(fin2002cashflowssgmt)){
			fin2002cashflowssgmt.setFin_2002cashflowssgmt_id(UUID.toUUID());
			i=fin2002cashflowssgmtService.addFin2002cashflowssgmt(fin2002cashflowssgmt);
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
	@RequestMapping(value="/exportFin2002cashflowssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public void exportFin2002cashflowssgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
