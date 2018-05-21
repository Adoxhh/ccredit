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
import ccredit.finmodules.finmodel.Fin2007cashflowssgmt;
import ccredit.finmodules.finservice.Fin2007cashflowssgmtService;

/**
* 2007版现金流量表 
* 2018-05-03 14:58:47  yangzhou
*/
@Controller
@RequestMapping("/fin2007cashflowssgmtController")
public class Fin2007cashflowssgmtController extends BaseAction{
	@Autowired
	private Fin2007cashflowssgmtService fin2007cashflowssgmtService;
	/**
	* 载入初始化页面
	* @param fin_2007cashflowssgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadFin2007cashflowssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public ModelAndView loadFin2007cashflowssgmt(Fin2007cashflowssgmt fin2007cashflowssgmt,HttpServletRequest request){
		return new ModelAndView("pc/fin/fin-2007cashflowssgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param fin_2007cashflowssgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getFin2007cashflowssgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getFin2007cashflowssgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<Fin2007cashflowssgmt> fin2007cashflowssgmtList = fin2007cashflowssgmtService.getFin2007cashflowssgmtListByCondition(condition);
		PageInfo<Fin2007cashflowssgmt> page = new PageInfo<Fin2007cashflowssgmt>(fin2007cashflowssgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param fin_2007cashflowssgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getFin2007cashflowssgmtById",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getFin2007cashflowssgmtById(String fin_2007cashflowssgmt_id,HttpServletRequest request){
		Fin2007cashflowssgmt fin2007cashflowssgmt = fin2007cashflowssgmtService.getFin2007cashflowssgmtById(fin_2007cashflowssgmt_id);
		return outDataStr2(fin2007cashflowssgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param fin_2007cashflowssgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addFin2007cashflowssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String addFin2007cashflowssgmt(Fin2007cashflowssgmt fin2007cashflowssgmt,HttpServletRequest request){
		int i = 0;
		if(null != fin2007cashflowssgmt && !"".equals(fin2007cashflowssgmt)){
			fin2007cashflowssgmt.setFin_2007cashflowssgmt_id(UUID.toUUID());
			fin2007cashflowssgmt.setLastdate(new Date(System.currentTimeMillis()));
			fin2007cashflowssgmt.setChangeflag("1");
			i=fin2007cashflowssgmtService.addFin2007cashflowssgmt(fin2007cashflowssgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param fin_2007cashflowssgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateFin2007cashflowssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String updateFin2007cashflowssgmt(Fin2007cashflowssgmt fin2007cashflowssgmt,HttpServletRequest request){
		int i = 0;
		if(null != fin2007cashflowssgmt && !"".equals(fin2007cashflowssgmt)){
			fin2007cashflowssgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=fin2007cashflowssgmtService.updateFin2007cashflowssgmt(fin2007cashflowssgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param fin_2007cashflowssgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delFin2007cashflowssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String delFin2007cashflowssgmt(String fin_2007cashflowssgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != fin_2007cashflowssgmt_id && !"".equals(fin_2007cashflowssgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("fin_2007cashflowssgmt_id",fin_2007cashflowssgmt_id.split(","));
			i=fin2007cashflowssgmtService.delFin2007cashflowssgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param fin_2007cashflowssgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyFin2007cashflowssgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String copyFin2007cashflowssgmt(String fin_2007cashflowssgmt_id,HttpServletRequest request){
		int i = 0;
		Fin2007cashflowssgmt fin2007cashflowssgmt = fin2007cashflowssgmtService.getFin2007cashflowssgmtById(fin_2007cashflowssgmt_id);
		if(null != fin2007cashflowssgmt && !"".equals(fin2007cashflowssgmt)){
			fin2007cashflowssgmt.setFin_2007cashflowssgmt_id(UUID.toUUID());
			i=fin2007cashflowssgmtService.addFin2007cashflowssgmt(fin2007cashflowssgmt);
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
	@RequestMapping(value="/exportFin2007cashflowssgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public void exportFin2007cashflowssgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
