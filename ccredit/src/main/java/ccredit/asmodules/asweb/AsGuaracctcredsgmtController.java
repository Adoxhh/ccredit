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
import ccredit.asmodules.asmodel.AsGuaracctcredsgmt;
import ccredit.asmodules.asservice.AsGuaracctcredsgmtService;

/**
* 企业担保账户授信额度息段 
* 2018-04-28 15:43:06  mengbeibei
*/
@Controller
@RequestMapping("/asGuaracctcredsgmtController")
public class AsGuaracctcredsgmtController extends BaseAction{
	@Autowired
	private AsGuaracctcredsgmtService asGuaracctcredsgmtService;
	/**
	* 载入初始化页面
	* @param as_guaracctcredsgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadAsGuaracctcredsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView loadAsGuaracctcredsgmt(AsGuaracctcredsgmt asGuaracctcredsgmt,HttpServletRequest request){
		return new ModelAndView("pc/as-view/as-guaracctcredsgmt/as-guaracctcredsgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param as_guaracctcredsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getAsGuaracctcredsgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	public String getAsGuaracctcredsgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<AsGuaracctcredsgmt> asGuaracctcredsgmtList = asGuaracctcredsgmtService.getAsGuaracctcredsgmtListByCondition(condition);
		PageInfo<AsGuaracctcredsgmt> page = new PageInfo<AsGuaracctcredsgmt>(asGuaracctcredsgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param guaracctcredsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getAsGuaracctcredsgmtById",method={RequestMethod.POST,RequestMethod.GET})
	public String getAsGuaracctcredsgmtById(String guaracctcredsgmt_id,HttpServletRequest request){
		AsGuaracctcredsgmt asGuaracctcredsgmt = asGuaracctcredsgmtService.getAsGuaracctcredsgmtById(guaracctcredsgmt_id);
		return outDataStr2(asGuaracctcredsgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param as_guaracctcredsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addAsGuaracctcredsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String addAsGuaracctcredsgmt(AsGuaracctcredsgmt asGuaracctcredsgmt,HttpServletRequest request){
		int i = 0;
		if(null != asGuaracctcredsgmt && !"".equals(asGuaracctcredsgmt)){
			asGuaracctcredsgmt.setGuaracctcredsgmt_id(UUID.toUUID());
			asGuaracctcredsgmt.setChangeflag("1");
			asGuaracctcredsgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=asGuaracctcredsgmtService.addAsGuaracctcredsgmt(asGuaracctcredsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param as_guaracctcredsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateAsGuaracctcredsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String updateAsGuaracctcredsgmt(AsGuaracctcredsgmt asGuaracctcredsgmt,HttpServletRequest request){
		int i = 0;
		if(null != asGuaracctcredsgmt && !"".equals(asGuaracctcredsgmt)){
			asGuaracctcredsgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=asGuaracctcredsgmtService.updateAsGuaracctcredsgmt(asGuaracctcredsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param guaracctcredsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delAsGuaracctcredsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String delAsGuaracctcredsgmt(String guaracctcredsgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != guaracctcredsgmt_id && !"".equals(guaracctcredsgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("guaracctcredsgmt_id",guaracctcredsgmt_id.split(","));
			i=asGuaracctcredsgmtService.delAsGuaracctcredsgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param guaracctcredsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyAsGuaracctcredsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String copyAsGuaracctcredsgmt(String guaracctcredsgmt_id,HttpServletRequest request){
		int i = 0;
		AsGuaracctcredsgmt asGuaracctcredsgmt = asGuaracctcredsgmtService.getAsGuaracctcredsgmtById(guaracctcredsgmt_id);
		if(null != asGuaracctcredsgmt && !"".equals(asGuaracctcredsgmt)){
			asGuaracctcredsgmt.setGuaracctcredsgmt_id(UUID.toUUID());
			i=asGuaracctcredsgmtService.addAsGuaracctcredsgmt(asGuaracctcredsgmt);
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
	@RequestMapping(value="/exportAsGuaracctcredsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public void exportAsGuaracctcredsgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
