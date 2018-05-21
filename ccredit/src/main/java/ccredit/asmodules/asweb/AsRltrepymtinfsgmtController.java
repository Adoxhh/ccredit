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
import ccredit.asmodules.asmodel.AsRltrepymtinfsgmt;
import ccredit.asmodules.asservice.AsRltrepymtinfsgmtService;

/**
* 企业担保账户相关还款责任人信息段 
* 2018-04-28 15:39:48  mengbeibei
*/
@Controller
@RequestMapping("/asRltrepymtinfsgmtController")
public class AsRltrepymtinfsgmtController extends BaseAction{
	@Autowired
	private AsRltrepymtinfsgmtService asRltrepymtinfsgmtService;
	/**
	* 载入初始化页面
	* @param as_rltrepymtinfsgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadAsRltrepymtinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView loadAsRltrepymtinfsgmt(AsRltrepymtinfsgmt asRltrepymtinfsgmt,HttpServletRequest request){
		return new ModelAndView("pc/as-view/as-rltrepymtinfsgmt/as-rltrepymtinfsgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param as_rltrepymtinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getAsRltrepymtinfsgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	public String getAsRltrepymtinfsgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<AsRltrepymtinfsgmt> asRltrepymtinfsgmtList = asRltrepymtinfsgmtService.getAsRltrepymtinfsgmtListByCondition(condition);
		PageInfo<AsRltrepymtinfsgmt> page = new PageInfo<AsRltrepymtinfsgmt>(asRltrepymtinfsgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param rltrepymtinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getAsRltrepymtinfsgmtById",method={RequestMethod.POST,RequestMethod.GET})
	public String getAsRltrepymtinfsgmtById(String rltrepymtinfsgmt_id,HttpServletRequest request){
		AsRltrepymtinfsgmt asRltrepymtinfsgmt = asRltrepymtinfsgmtService.getAsRltrepymtinfsgmtById(rltrepymtinfsgmt_id);
		return outDataStr2(asRltrepymtinfsgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param as_rltrepymtinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addAsRltrepymtinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String addAsRltrepymtinfsgmt(AsRltrepymtinfsgmt asRltrepymtinfsgmt,HttpServletRequest request){
		int i = 0;
		if(null != asRltrepymtinfsgmt && !"".equals(asRltrepymtinfsgmt)){
			asRltrepymtinfsgmt.setRltrepymtinfsgmt_id(UUID.toUUID());
			asRltrepymtinfsgmt.setChangeflag("1");
			asRltrepymtinfsgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=asRltrepymtinfsgmtService.addAsRltrepymtinfsgmt(asRltrepymtinfsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param as_rltrepymtinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateAsRltrepymtinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String updateAsRltrepymtinfsgmt(AsRltrepymtinfsgmt asRltrepymtinfsgmt,HttpServletRequest request){
		int i = 0;
		if(null != asRltrepymtinfsgmt && !"".equals(asRltrepymtinfsgmt)){
			asRltrepymtinfsgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=asRltrepymtinfsgmtService.updateAsRltrepymtinfsgmt(asRltrepymtinfsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param rltrepymtinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delAsRltrepymtinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String delAsRltrepymtinfsgmt(String rltrepymtinfsgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != rltrepymtinfsgmt_id && !"".equals(rltrepymtinfsgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("rltrepymtinfsgmt_id",rltrepymtinfsgmt_id.split(","));
			i=asRltrepymtinfsgmtService.delAsRltrepymtinfsgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param rltrepymtinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyAsRltrepymtinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String copyAsRltrepymtinfsgmt(String rltrepymtinfsgmt_id,HttpServletRequest request){
		int i = 0;
		AsRltrepymtinfsgmt asRltrepymtinfsgmt = asRltrepymtinfsgmtService.getAsRltrepymtinfsgmtById(rltrepymtinfsgmt_id);
		if(null != asRltrepymtinfsgmt && !"".equals(asRltrepymtinfsgmt)){
			asRltrepymtinfsgmt.setRltrepymtinfsgmt_id(UUID.toUUID());
			i=asRltrepymtinfsgmtService.addAsRltrepymtinfsgmt(asRltrepymtinfsgmt);
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
	@RequestMapping(value="/exportAsRltrepymtinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public void exportAsRltrepymtinfsgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
