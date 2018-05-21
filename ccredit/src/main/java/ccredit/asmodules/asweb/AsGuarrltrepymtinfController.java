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
import ccredit.asmodules.asmodel.AsGuarrltrepymtinf;
import ccredit.asmodules.asservice.AsGuarrltrepymtinfService;

/**
* 企业担保账户在保责任信息段 
* 2018-04-28 15:46:18  mengbeibei
*/
@Controller
@RequestMapping("/asGuarrltrepymtinfController")
public class AsGuarrltrepymtinfController extends BaseAction{
	@Autowired
	private AsGuarrltrepymtinfService asGuarrltrepymtinfService;
	/**
	* 载入初始化页面
	* @param as_guarrltrepymtinf 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadAsGuarrltrepymtinf",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView loadAsGuarrltrepymtinf(AsGuarrltrepymtinf asGuarrltrepymtinf,HttpServletRequest request){
		return new ModelAndView("pc/as-view/as-guarrltrepymtinf/as-guarrltrepymtinf-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param as_guarrltrepymtinf 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getAsGuarrltrepymtinfListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	public String getAsGuarrltrepymtinfListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<AsGuarrltrepymtinf> asGuarrltrepymtinfList = asGuarrltrepymtinfService.getAsGuarrltrepymtinfListByCondition(condition);
		PageInfo<AsGuarrltrepymtinf> page = new PageInfo<AsGuarrltrepymtinf>(asGuarrltrepymtinfList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param guarrltrepymtinf_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getAsGuarrltrepymtinfById",method={RequestMethod.POST,RequestMethod.GET})
	public String getAsGuarrltrepymtinfById(String guarrltrepymtinf_id,HttpServletRequest request){
		AsGuarrltrepymtinf asGuarrltrepymtinf = asGuarrltrepymtinfService.getAsGuarrltrepymtinfById(guarrltrepymtinf_id);
		return outDataStr2(asGuarrltrepymtinf,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param as_guarrltrepymtinf 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addAsGuarrltrepymtinf",method={RequestMethod.POST,RequestMethod.GET})
	public String addAsGuarrltrepymtinf(AsGuarrltrepymtinf asGuarrltrepymtinf,HttpServletRequest request){
		int i = 0;
		if(null != asGuarrltrepymtinf && !"".equals(asGuarrltrepymtinf)){
			asGuarrltrepymtinf.setGuarrltrepymtinf_id(UUID.toUUID());
			asGuarrltrepymtinf.setChangeflag("1");
			asGuarrltrepymtinf.setLastdate(new Date(System.currentTimeMillis()));
			i=asGuarrltrepymtinfService.addAsGuarrltrepymtinf(asGuarrltrepymtinf);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param as_guarrltrepymtinf 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateAsGuarrltrepymtinf",method={RequestMethod.POST,RequestMethod.GET})
	public String updateAsGuarrltrepymtinf(AsGuarrltrepymtinf asGuarrltrepymtinf,HttpServletRequest request){
		int i = 0;
		if(null != asGuarrltrepymtinf && !"".equals(asGuarrltrepymtinf)){
			asGuarrltrepymtinf.setLastdate(new Date(System.currentTimeMillis()));
			i=asGuarrltrepymtinfService.updateAsGuarrltrepymtinf(asGuarrltrepymtinf);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param guarrltrepymtinf_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delAsGuarrltrepymtinf",method={RequestMethod.POST,RequestMethod.GET})
	public String delAsGuarrltrepymtinf(String guarrltrepymtinf_id,HttpServletRequest request){
		int i = 0;
		if(null != guarrltrepymtinf_id && !"".equals(guarrltrepymtinf_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("guarrltrepymtinf_id",guarrltrepymtinf_id.split(","));
			i=asGuarrltrepymtinfService.delAsGuarrltrepymtinf(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param guarrltrepymtinf_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyAsGuarrltrepymtinf",method={RequestMethod.POST,RequestMethod.GET})
	public String copyAsGuarrltrepymtinf(String guarrltrepymtinf_id,HttpServletRequest request){
		int i = 0;
		AsGuarrltrepymtinf asGuarrltrepymtinf = asGuarrltrepymtinfService.getAsGuarrltrepymtinfById(guarrltrepymtinf_id);
		if(null != asGuarrltrepymtinf && !"".equals(asGuarrltrepymtinf)){
			asGuarrltrepymtinf.setGuarrltrepymtinf_id(UUID.toUUID());
			i=asGuarrltrepymtinfService.addAsGuarrltrepymtinf(asGuarrltrepymtinf);
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
	@RequestMapping(value="/exportAsGuarrltrepymtinf",method={RequestMethod.POST,RequestMethod.GET})
	public void exportAsGuarrltrepymtinf(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
