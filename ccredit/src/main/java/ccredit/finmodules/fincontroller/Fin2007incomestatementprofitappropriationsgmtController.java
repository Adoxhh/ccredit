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
import ccredit.finmodules.finmodel.Fin2007incomestatementprofitappropriationsgmt;
import ccredit.finmodules.finservice.Fin2007incomestatementprofitappropriationsgmtService;

/**
* 2007版利润及利润分配表 
* 2018-05-03 15:00:09  yangzhou
*/
@Controller
@RequestMapping("/fin2007incomestatementprofitappropriationsgmtController")
public class Fin2007incomestatementprofitappropriationsgmtController extends BaseAction{
	@Autowired
	private Fin2007incomestatementprofitappropriationsgmtService fin2007incomestatementprofitappropriationsgmtService;
	/**
	* 载入初始化页面
	* @param fin_2007incomestatementprofitappropriationsgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadFin2007incomestatementprofitappropriationsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public ModelAndView loadFin2007incomestatementprofitappropriationsgmt(Fin2007incomestatementprofitappropriationsgmt fin2007incomestatementprofitappropriationsgmt,HttpServletRequest request){
		return new ModelAndView("pc/fin/fin-2007incomestatementprofitappropriationsgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param fin_2007incomestatementprofitappropriationsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getFin2007incomestatementprofitappropriationsgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getFin2007incomestatementprofitappropriationsgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<Fin2007incomestatementprofitappropriationsgmt> fin2007incomestatementprofitappropriationsgmtList = fin2007incomestatementprofitappropriationsgmtService.getFin2007incomestatementprofitappropriationsgmtListByCondition(condition);
		PageInfo<Fin2007incomestatementprofitappropriationsgmt> page = new PageInfo<Fin2007incomestatementprofitappropriationsgmt>(fin2007incomestatementprofitappropriationsgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param fin_2007incomestatementprofitappropriationsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getFin2007incomestatementprofitappropriationsgmtById",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getFin2007incomestatementprofitappropriationsgmtById(String fin_2007incomestatementprofitappropriationsgmt_id,HttpServletRequest request){
		Fin2007incomestatementprofitappropriationsgmt fin2007incomestatementprofitappropriationsgmt = fin2007incomestatementprofitappropriationsgmtService.getFin2007incomestatementprofitappropriationsgmtById(fin_2007incomestatementprofitappropriationsgmt_id);
		return outDataStr2(fin2007incomestatementprofitappropriationsgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param fin_2007incomestatementprofitappropriationsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addFin2007incomestatementprofitappropriationsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String addFin2007incomestatementprofitappropriationsgmt(Fin2007incomestatementprofitappropriationsgmt fin2007incomestatementprofitappropriationsgmt,HttpServletRequest request){
		int i = 0;
		if(null != fin2007incomestatementprofitappropriationsgmt && !"".equals(fin2007incomestatementprofitappropriationsgmt)){
			fin2007incomestatementprofitappropriationsgmt.setFin_2007incomestatementprofitappropriationsgmt_id(UUID.toUUID());
			fin2007incomestatementprofitappropriationsgmt.setLastdate(new Date(System.currentTimeMillis()));
			fin2007incomestatementprofitappropriationsgmt.setChangeflag("1");
			i=fin2007incomestatementprofitappropriationsgmtService.addFin2007incomestatementprofitappropriationsgmt(fin2007incomestatementprofitappropriationsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param fin_2007incomestatementprofitappropriationsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateFin2007incomestatementprofitappropriationsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String updateFin2007incomestatementprofitappropriationsgmt(Fin2007incomestatementprofitappropriationsgmt fin2007incomestatementprofitappropriationsgmt,HttpServletRequest request){
		int i = 0;
		if(null != fin2007incomestatementprofitappropriationsgmt && !"".equals(fin2007incomestatementprofitappropriationsgmt)){
			fin2007incomestatementprofitappropriationsgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=fin2007incomestatementprofitappropriationsgmtService.updateFin2007incomestatementprofitappropriationsgmt(fin2007incomestatementprofitappropriationsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param fin_2007incomestatementprofitappropriationsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delFin2007incomestatementprofitappropriationsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String delFin2007incomestatementprofitappropriationsgmt(String fin_2007incomestatementprofitappropriationsgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != fin_2007incomestatementprofitappropriationsgmt_id && !"".equals(fin_2007incomestatementprofitappropriationsgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("fin_2007incomestatementprofitappropriationsgmt_id",fin_2007incomestatementprofitappropriationsgmt_id.split(","));
			i=fin2007incomestatementprofitappropriationsgmtService.delFin2007incomestatementprofitappropriationsgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param fin_2007incomestatementprofitappropriationsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyFin2007incomestatementprofitappropriationsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String copyFin2007incomestatementprofitappropriationsgmt(String fin_2007incomestatementprofitappropriationsgmt_id,HttpServletRequest request){
		int i = 0;
		Fin2007incomestatementprofitappropriationsgmt fin2007incomestatementprofitappropriationsgmt = fin2007incomestatementprofitappropriationsgmtService.getFin2007incomestatementprofitappropriationsgmtById(fin_2007incomestatementprofitappropriationsgmt_id);
		if(null != fin2007incomestatementprofitappropriationsgmt && !"".equals(fin2007incomestatementprofitappropriationsgmt)){
			fin2007incomestatementprofitappropriationsgmt.setFin_2007incomestatementprofitappropriationsgmt_id(UUID.toUUID());
			i=fin2007incomestatementprofitappropriationsgmtService.addFin2007incomestatementprofitappropriationsgmt(fin2007incomestatementprofitappropriationsgmt);
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
	@RequestMapping(value="/exportFin2007incomestatementprofitappropriationsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public void exportFin2007incomestatementprofitappropriationsgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
