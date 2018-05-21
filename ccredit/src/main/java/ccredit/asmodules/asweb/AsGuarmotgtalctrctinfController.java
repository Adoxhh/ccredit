package ccredit.asmodules.asweb;
import java.util.List;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
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
import ccredit.asmodules.asmodel.AsGuarmotgtalctrctinf;
import ccredit.asmodules.asservice.AsGuarmotgtalctrctinfService;

/**
* 企业担保账户抵质押物信息段 
* 2018-04-28 15:41:50  mengbeibei
*/
@Controller
@RequestMapping("/asGuarmotgtalctrctinfController")
public class AsGuarmotgtalctrctinfController extends BaseAction{
	@Autowired
	private AsGuarmotgtalctrctinfService asGuarmotgtalctrctinfService;
	/**
	* 载入初始化页面
	* @param as_guarmotgtalctrctinf 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadAsGuarmotgtalctrctinf",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView loadAsGuarmotgtalctrctinf(AsGuarmotgtalctrctinf asGuarmotgtalctrctinf,HttpServletRequest request){
		return new ModelAndView("pc/as-view/as-guarmotgtalctrctinf/as-guarmotgtalctrctinf-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param as_guarmotgtalctrctinf 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getAsGuarmotgtalctrctinfListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	public String getAsGuarmotgtalctrctinfListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<AsGuarmotgtalctrctinf> asGuarmotgtalctrctinfList = asGuarmotgtalctrctinfService.getAsGuarmotgtalctrctinfListByCondition(condition);
		PageInfo<AsGuarmotgtalctrctinf> page = new PageInfo<AsGuarmotgtalctrctinf>(asGuarmotgtalctrctinfList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param guarmotgtalctrctinf_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getAsGuarmotgtalctrctinfById",method={RequestMethod.POST,RequestMethod.GET})
	public String getAsGuarmotgtalctrctinfById(String guarmotgtalctrctinf_id,HttpServletRequest request){
		AsGuarmotgtalctrctinf asGuarmotgtalctrctinf = asGuarmotgtalctrctinfService.getAsGuarmotgtalctrctinfById(guarmotgtalctrctinf_id);
		return outDataStr2(asGuarmotgtalctrctinf,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param as_guarmotgtalctrctinf 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addAsGuarmotgtalctrctinf",method={RequestMethod.POST,RequestMethod.GET})
	public String addAsGuarmotgtalctrctinf(AsGuarmotgtalctrctinf asGuarmotgtalctrctinf,HttpServletRequest request){
		int i = 0;
		if(null != asGuarmotgtalctrctinf && !"".equals(asGuarmotgtalctrctinf)){
			asGuarmotgtalctrctinf.setGuarmotgtalctrctinf_id(UUID.toUUID());
			asGuarmotgtalctrctinf.setChangeflag("1");
			asGuarmotgtalctrctinf.setLastdate(new Date(System.currentTimeMillis()));
			i=asGuarmotgtalctrctinfService.addAsGuarmotgtalctrctinf(asGuarmotgtalctrctinf);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param as_guarmotgtalctrctinf 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateAsGuarmotgtalctrctinf",method={RequestMethod.POST,RequestMethod.GET})
	public String updateAsGuarmotgtalctrctinf(AsGuarmotgtalctrctinf asGuarmotgtalctrctinf,HttpServletRequest request){
		int i = 0;
		if(null != asGuarmotgtalctrctinf && !"".equals(asGuarmotgtalctrctinf)){
			asGuarmotgtalctrctinf.setLastdate(new Date(System.currentTimeMillis()));
			i=asGuarmotgtalctrctinfService.updateAsGuarmotgtalctrctinf(asGuarmotgtalctrctinf);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param guarmotgtalctrctinf_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delAsGuarmotgtalctrctinf",method={RequestMethod.POST,RequestMethod.GET})
	public String delAsGuarmotgtalctrctinf(String guarmotgtalctrctinf_id,HttpServletRequest request){
		int i = 0;
		if(null != guarmotgtalctrctinf_id && !"".equals(guarmotgtalctrctinf_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("guarmotgtalctrctinf_id",guarmotgtalctrctinf_id.split(","));
			i=asGuarmotgtalctrctinfService.delAsGuarmotgtalctrctinf(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param guarmotgtalctrctinf_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyAsGuarmotgtalctrctinf",method={RequestMethod.POST,RequestMethod.GET})
	public String copyAsGuarmotgtalctrctinf(String guarmotgtalctrctinf_id,HttpServletRequest request){
		int i = 0;
		AsGuarmotgtalctrctinf asGuarmotgtalctrctinf = asGuarmotgtalctrctinfService.getAsGuarmotgtalctrctinfById(guarmotgtalctrctinf_id);
		if(null != asGuarmotgtalctrctinf && !"".equals(asGuarmotgtalctrctinf)){
			asGuarmotgtalctrctinf.setGuarmotgtalctrctinf_id(UUID.toUUID());
			i=asGuarmotgtalctrctinfService.addAsGuarmotgtalctrctinf(asGuarmotgtalctrctinf);
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
	@RequestMapping(value="/exportAsGuarmotgtalctrctinf",method={RequestMethod.POST,RequestMethod.GET})
	public void exportAsGuarmotgtalctrctinf(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
