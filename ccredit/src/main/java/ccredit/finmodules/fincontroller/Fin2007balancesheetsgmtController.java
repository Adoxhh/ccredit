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
import ccredit.finmodules.finmodel.Fin2007balancesheetsgmt;
import ccredit.finmodules.finservice.Fin2007balancesheetsgmtService;

/**
* 2007版资产负债表 
* 2018-05-03 14:56:53  yangzhou
*/
@Controller
@RequestMapping("/fin2007balancesheetsgmtController")
public class Fin2007balancesheetsgmtController extends BaseAction{
	@Autowired
	private Fin2007balancesheetsgmtService fin2007balancesheetsgmtService;
	/**
	* 载入初始化页面
	* @param fin_2007balancesheetsgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadFin2007balancesheetsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public ModelAndView loadFin2007balancesheetsgmt(Fin2007balancesheetsgmt fin2007balancesheetsgmt,HttpServletRequest request){
		return new ModelAndView("pc/fin/fin-2007balancesheetsgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param fin_2007balancesheetsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getFin2007balancesheetsgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getFin2007balancesheetsgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<Fin2007balancesheetsgmt> fin2007balancesheetsgmtList = fin2007balancesheetsgmtService.getFin2007balancesheetsgmtListByCondition(condition);
		PageInfo<Fin2007balancesheetsgmt> page = new PageInfo<Fin2007balancesheetsgmt>(fin2007balancesheetsgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param fin_2007balancesheetsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getFin2007balancesheetsgmtById",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getFin2007balancesheetsgmtById(String fin_2007balancesheetsgmt_id,HttpServletRequest request){
		Fin2007balancesheetsgmt fin2007balancesheetsgmt = fin2007balancesheetsgmtService.getFin2007balancesheetsgmtById(fin_2007balancesheetsgmt_id);
		return outDataStr2(fin2007balancesheetsgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param fin_2007balancesheetsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addFin2007balancesheetsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String addFin2007balancesheetsgmt(Fin2007balancesheetsgmt fin2007balancesheetsgmt,HttpServletRequest request){
		int i = 0;
		if(null != fin2007balancesheetsgmt && !"".equals(fin2007balancesheetsgmt)){
			fin2007balancesheetsgmt.setFin_2007balancesheetsgmt_id(UUID.toUUID());
			fin2007balancesheetsgmt.setLastdate(new Date(System.currentTimeMillis()));
			fin2007balancesheetsgmt.setChangeflag("1");
			i=fin2007balancesheetsgmtService.addFin2007balancesheetsgmt(fin2007balancesheetsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param fin_2007balancesheetsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateFin2007balancesheetsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String updateFin2007balancesheetsgmt(Fin2007balancesheetsgmt fin2007balancesheetsgmt,HttpServletRequest request){
		int i = 0;
		if(null != fin2007balancesheetsgmt && !"".equals(fin2007balancesheetsgmt)){
			fin2007balancesheetsgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=fin2007balancesheetsgmtService.updateFin2007balancesheetsgmt(fin2007balancesheetsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param fin_2007balancesheetsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delFin2007balancesheetsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String delFin2007balancesheetsgmt(String fin_2007balancesheetsgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != fin_2007balancesheetsgmt_id && !"".equals(fin_2007balancesheetsgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("fin_2007balancesheetsgmt_id",fin_2007balancesheetsgmt_id.split(","));
			i=fin2007balancesheetsgmtService.delFin2007balancesheetsgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param fin_2007balancesheetsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyFin2007balancesheetsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String copyFin2007balancesheetsgmt(String fin_2007balancesheetsgmt_id,HttpServletRequest request){
		int i = 0;
		Fin2007balancesheetsgmt fin2007balancesheetsgmt = fin2007balancesheetsgmtService.getFin2007balancesheetsgmtById(fin_2007balancesheetsgmt_id);
		if(null != fin2007balancesheetsgmt && !"".equals(fin2007balancesheetsgmt)){
			fin2007balancesheetsgmt.setFin_2007balancesheetsgmt_id(UUID.toUUID());
			i=fin2007balancesheetsgmtService.addFin2007balancesheetsgmt(fin2007balancesheetsgmt);
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
	@RequestMapping(value="/exportFin2007balancesheetsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public void exportFin2007balancesheetsgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
