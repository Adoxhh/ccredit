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
import ccredit.finmodules.finmodel.Fin2002incomestatementprofitappropriationsgmt;
import ccredit.finmodules.finservice.Fin2002incomestatementprofitappropriationsgmtService;

/**
* 2002版利润及利润分配表 
* 2018-05-03 14:55:47  yangzhou
*/
@Controller
@RequestMapping("/fin2002incomestatementprofitappropriationsgmtController")
public class Fin2002incomestatementprofitappropriationsgmtController extends BaseAction{
	@Autowired
	private Fin2002incomestatementprofitappropriationsgmtService fin2002incomestatementprofitappropriationsgmtService;
	/**
	* 载入初始化页面
	* @param fin_2002incomestatementprofitappropriationsgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadFin2002incomestatementprofitappropriationsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public ModelAndView loadFin2002incomestatementprofitappropriationsgmt(Fin2002incomestatementprofitappropriationsgmt fin2002incomestatementprofitappropriationsgmt,HttpServletRequest request){
		return new ModelAndView("pc/fin/fin-2002incomestatementprofitappropriationsgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param fin_2002incomestatementprofitappropriationsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getFin2002incomestatementprofitappropriationsgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getFin2002incomestatementprofitappropriationsgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<Fin2002incomestatementprofitappropriationsgmt> fin2002incomestatementprofitappropriationsgmtList = fin2002incomestatementprofitappropriationsgmtService.getFin2002incomestatementprofitappropriationsgmtListByCondition(condition);
		PageInfo<Fin2002incomestatementprofitappropriationsgmt> page = new PageInfo<Fin2002incomestatementprofitappropriationsgmt>(fin2002incomestatementprofitappropriationsgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param fin_2002incomestatementprofitappropriationsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getFin2002incomestatementprofitappropriationsgmtById",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getFin2002incomestatementprofitappropriationsgmtById(String fin_2002incomestatementprofitappropriationsgmt_id,HttpServletRequest request){
		Fin2002incomestatementprofitappropriationsgmt fin2002incomestatementprofitappropriationsgmt = fin2002incomestatementprofitappropriationsgmtService.getFin2002incomestatementprofitappropriationsgmtById(fin_2002incomestatementprofitappropriationsgmt_id);
		return outDataStr2(fin2002incomestatementprofitappropriationsgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param fin_2002incomestatementprofitappropriationsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addFin2002incomestatementprofitappropriationsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String addFin2002incomestatementprofitappropriationsgmt(Fin2002incomestatementprofitappropriationsgmt fin2002incomestatementprofitappropriationsgmt,HttpServletRequest request){
		int i = 0;
		if(null != fin2002incomestatementprofitappropriationsgmt && !"".equals(fin2002incomestatementprofitappropriationsgmt)){
			fin2002incomestatementprofitappropriationsgmt.setFin_2002incomestatementprofitappropriationsgmt_id(UUID.toUUID());
			fin2002incomestatementprofitappropriationsgmt.setLastdate(new Date(System.currentTimeMillis()));
			fin2002incomestatementprofitappropriationsgmt.setChangeflag("1");
			i=fin2002incomestatementprofitappropriationsgmtService.addFin2002incomestatementprofitappropriationsgmt(fin2002incomestatementprofitappropriationsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param fin_2002incomestatementprofitappropriationsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateFin2002incomestatementprofitappropriationsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String updateFin2002incomestatementprofitappropriationsgmt(Fin2002incomestatementprofitappropriationsgmt fin2002incomestatementprofitappropriationsgmt,HttpServletRequest request){
		int i = 0;
		if(null != fin2002incomestatementprofitappropriationsgmt && !"".equals(fin2002incomestatementprofitappropriationsgmt)){
			fin2002incomestatementprofitappropriationsgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=fin2002incomestatementprofitappropriationsgmtService.updateFin2002incomestatementprofitappropriationsgmt(fin2002incomestatementprofitappropriationsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param fin_2002incomestatementprofitappropriationsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delFin2002incomestatementprofitappropriationsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String delFin2002incomestatementprofitappropriationsgmt(String fin_2002incomestatementprofitappropriationsgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != fin_2002incomestatementprofitappropriationsgmt_id && !"".equals(fin_2002incomestatementprofitappropriationsgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("fin_2002incomestatementprofitappropriationsgmt_id",fin_2002incomestatementprofitappropriationsgmt_id.split(","));
			i=fin2002incomestatementprofitappropriationsgmtService.delFin2002incomestatementprofitappropriationsgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param fin_2002incomestatementprofitappropriationsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyFin2002incomestatementprofitappropriationsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String copyFin2002incomestatementprofitappropriationsgmt(String fin_2002incomestatementprofitappropriationsgmt_id,HttpServletRequest request){
		int i = 0;
		Fin2002incomestatementprofitappropriationsgmt fin2002incomestatementprofitappropriationsgmt = fin2002incomestatementprofitappropriationsgmtService.getFin2002incomestatementprofitappropriationsgmtById(fin_2002incomestatementprofitappropriationsgmt_id);
		if(null != fin2002incomestatementprofitappropriationsgmt && !"".equals(fin2002incomestatementprofitappropriationsgmt)){
			fin2002incomestatementprofitappropriationsgmt.setFin_2002incomestatementprofitappropriationsgmt_id(UUID.toUUID());
			i=fin2002incomestatementprofitappropriationsgmtService.addFin2002incomestatementprofitappropriationsgmt(fin2002incomestatementprofitappropriationsgmt);
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
	@RequestMapping(value="/exportFin2002incomestatementprofitappropriationsgmt",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public void exportFin2002incomestatementprofitappropriationsgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
