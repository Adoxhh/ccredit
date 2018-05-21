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
import ccredit.finmodules.finmodel.Fin2002balancesheetsgmt;
import ccredit.finmodules.finservice.Fin2002balancesheetsgmtService;

/**
* 2002版资产负债表 
* 2018-05-03 14:53:26  yangzhou
*/
@Controller
@RequestMapping("/fin2002balancesheetsgmtController")
public class Fin2002balancesheetsgmtController extends BaseAction{
	@Autowired
	private Fin2002balancesheetsgmtService fin2002balancesheetsgmtService;
	/**
	* 载入初始化页面
	* @param fin_2002balancesheetsgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadFin2002balancesheetsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public ModelAndView loadFin2002balancesheetsgmt(Fin2002balancesheetsgmt fin2002balancesheetsgmt,HttpServletRequest request){
		return new ModelAndView("pc/fin/fin-2002balancesheetsgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param fin_2002balancesheetsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getFin2002balancesheetsgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getFin2002balancesheetsgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<Fin2002balancesheetsgmt> fin2002balancesheetsgmtList = fin2002balancesheetsgmtService.getFin2002balancesheetsgmtListByCondition(condition);
		PageInfo<Fin2002balancesheetsgmt> page = new PageInfo<Fin2002balancesheetsgmt>(fin2002balancesheetsgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param fin_2002balancesheetsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getFin2002balancesheetsgmtById",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getFin2002balancesheetsgmtById(String fin_2002balancesheetsgmt_id,HttpServletRequest request){
		Fin2002balancesheetsgmt fin2002balancesheetsgmt = fin2002balancesheetsgmtService.getFin2002balancesheetsgmtById(fin_2002balancesheetsgmt_id);
		return outDataStr2(fin2002balancesheetsgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param fin_2002balancesheetsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addFin2002balancesheetsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String addFin2002balancesheetsgmt(Fin2002balancesheetsgmt fin2002balancesheetsgmt,HttpServletRequest request){
		int i = 0;
		if(null != fin2002balancesheetsgmt && !"".equals(fin2002balancesheetsgmt)){
			fin2002balancesheetsgmt.setFin_2002balancesheetsgmt_id(UUID.toUUID());
			fin2002balancesheetsgmt.setLastdate(new Date(System.currentTimeMillis()));
			fin2002balancesheetsgmt.setChangeflag("1");
			i=fin2002balancesheetsgmtService.addFin2002balancesheetsgmt(fin2002balancesheetsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param fin_2002balancesheetsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateFin2002balancesheetsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String updateFin2002balancesheetsgmt(Fin2002balancesheetsgmt fin2002balancesheetsgmt,HttpServletRequest request){
		int i = 0;
		if(null != fin2002balancesheetsgmt && !"".equals(fin2002balancesheetsgmt)){
			fin2002balancesheetsgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=fin2002balancesheetsgmtService.updateFin2002balancesheetsgmt(fin2002balancesheetsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param fin_2002balancesheetsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delFin2002balancesheetsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String delFin2002balancesheetsgmt(String fin_2002balancesheetsgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != fin_2002balancesheetsgmt_id && !"".equals(fin_2002balancesheetsgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("fin_2002balancesheetsgmt_id",fin_2002balancesheetsgmt_id.split(","));
			i=fin2002balancesheetsgmtService.delFin2002balancesheetsgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param fin_2002balancesheetsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyFin2002balancesheetsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String copyFin2002balancesheetsgmt(String fin_2002balancesheetsgmt_id,HttpServletRequest request){
		int i = 0;
		Fin2002balancesheetsgmt fin2002balancesheetsgmt = fin2002balancesheetsgmtService.getFin2002balancesheetsgmtById(fin_2002balancesheetsgmt_id);
		if(null != fin2002balancesheetsgmt && !"".equals(fin2002balancesheetsgmt)){
			fin2002balancesheetsgmt.setFin_2002balancesheetsgmt_id(UUID.toUUID());
			i=fin2002balancesheetsgmtService.addFin2002balancesheetsgmt(fin2002balancesheetsgmt);
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
	@RequestMapping(value="/exportFin2002balancesheetsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public void exportFin2002balancesheetsgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
