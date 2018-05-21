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
import ccredit.asmodules.asmodel.AsGuaracctbssgmt;
import ccredit.asmodules.asservice.AsGuaracctbssgmtService;

/**
* as_guaracctbssgmt 
* 2018-04-27 15:41:57  mengbeibei
*/
@Controller
@RequestMapping("/asGuaracctbssgmtController")
public class AsGuaracctbssgmtController extends BaseAction{
	@Autowired
	private AsGuaracctbssgmtService asGuaracctbssgmtService;
	/**
	* 载入初始化页面
	* @param as_guaracctbssgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadAsGuaracctbssgmt",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView loadAsGuaracctbssgmt(AsGuaracctbssgmt asGuaracctbssgmt,HttpServletRequest request){
		return new ModelAndView("pc/as-view/as-guaracctbssgmt/as-guaracctbssgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param as_guaracctbssgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getAsGuaracctbssgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	public String getAsGuaracctbssgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<AsGuaracctbssgmt> asGuaracctbssgmtList = asGuaracctbssgmtService.getAsGuaracctbssgmtListByCondition(condition);
		PageInfo<AsGuaracctbssgmt> page = new PageInfo<AsGuaracctbssgmt>(asGuaracctbssgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param guaracctbssgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getAsGuaracctbssgmtById",method={RequestMethod.POST,RequestMethod.GET})
	public String getAsGuaracctbssgmtById(String guaracctbssgmt_id,HttpServletRequest request){
		AsGuaracctbssgmt asGuaracctbssgmt = asGuaracctbssgmtService.getAsGuaracctbssgmtById(guaracctbssgmt_id);
		return outDataStr2(asGuaracctbssgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param as_guaracctbssgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addAsGuaracctbssgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String addAsGuaracctbssgmt(AsGuaracctbssgmt asGuaracctbssgmt,HttpServletRequest request){
		int i = 0;
		if(null != asGuaracctbssgmt && !"".equals(asGuaracctbssgmt)){
			asGuaracctbssgmt.setGuaracctbssgmt_id(UUID.toUUID());
			asGuaracctbssgmt.setChangeflag("1");
			asGuaracctbssgmt.setInfrectype("440");
			asGuaracctbssgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=asGuaracctbssgmtService.addAsGuaracctbssgmt(asGuaracctbssgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param as_guaracctbssgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateAsGuaracctbssgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String updateAsGuaracctbssgmt(AsGuaracctbssgmt asGuaracctbssgmt,HttpServletRequest request){
		int i = 0;
		if(null != asGuaracctbssgmt && !"".equals(asGuaracctbssgmt)){
			asGuaracctbssgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=asGuaracctbssgmtService.updateAsGuaracctbssgmt(asGuaracctbssgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param guaracctbssgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delAsGuaracctbssgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String delAsGuaracctbssgmt(String guaracctbssgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != guaracctbssgmt_id && !"".equals(guaracctbssgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("guaracctbssgmt_id",guaracctbssgmt_id.split(","));
			i=asGuaracctbssgmtService.delAsGuaracctbssgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param guaracctbssgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyAsGuaracctbssgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String copyAsGuaracctbssgmt(String guaracctbssgmt_id,HttpServletRequest request){
		int i = 0;
		AsGuaracctbssgmt asGuaracctbssgmt = asGuaracctbssgmtService.getAsGuaracctbssgmtById(guaracctbssgmt_id);
		if(null != asGuaracctbssgmt && !"".equals(asGuaracctbssgmt)){
			asGuaracctbssgmt.setGuaracctbssgmt_id(UUID.toUUID());
			i=asGuaracctbssgmtService.addAsGuaracctbssgmt(asGuaracctbssgmt);
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
	@RequestMapping(value="/exportAsGuaracctbssgmt",method={RequestMethod.POST,RequestMethod.GET})
	public void exportAsGuaracctbssgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
