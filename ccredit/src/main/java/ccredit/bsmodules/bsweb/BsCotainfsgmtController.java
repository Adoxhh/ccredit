package ccredit.bsmodules.bsweb;
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
import ccredit.bsmodules.bsmodel.BsCotainfsgmt;
import ccredit.bsmodules.bsservice.BsCotainfsgmtService;

/**
* 联系方式 
* 2018-04-26 14:44:28  mengbeibei
*/
@Controller
@RequestMapping("/bsCotainfsgmtController")
public class BsCotainfsgmtController extends BaseAction{
	@Autowired
	private BsCotainfsgmtService bsCotainfsgmtService;
	/**
	* 载入初始化页面
	* @param bs_cotainfsgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadBsCotainfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView loadBsCotainfsgmt(BsCotainfsgmt bsCotainfsgmt,HttpServletRequest request){
		return new ModelAndView("pc/bs-view/bs-cotainfsgmt/bs-cotainfsgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param bs_cotainfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getBsCotainfsgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	public String getBsCotainfsgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<BsCotainfsgmt> bsCotainfsgmtList = bsCotainfsgmtService.getBsCotainfsgmtListByCondition(condition);
		PageInfo<BsCotainfsgmt> page = new PageInfo<BsCotainfsgmt>(bsCotainfsgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param bs_cotainfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getBsCotainfsgmtById",method={RequestMethod.POST,RequestMethod.GET})
	public String getBsCotainfsgmtById(String bs_cotainfsgmt_id,HttpServletRequest request){
		BsCotainfsgmt bsCotainfsgmt = bsCotainfsgmtService.getBsCotainfsgmtById(bs_cotainfsgmt_id);
		return outDataStr2(bsCotainfsgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param bs_cotainfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addBsCotainfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String addBsCotainfsgmt(BsCotainfsgmt bsCotainfsgmt,HttpServletRequest request){
		int i = 0;
		if(null != bsCotainfsgmt && !"".equals(bsCotainfsgmt)){
			bsCotainfsgmt.setBs_cotainfsgmt_id(UUID.toUUID());
			bsCotainfsgmt.setChangeflag("1");
			bsCotainfsgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=bsCotainfsgmtService.addBsCotainfsgmt(bsCotainfsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param bs_cotainfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateBsCotainfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String updateBsCotainfsgmt(BsCotainfsgmt bsCotainfsgmt,HttpServletRequest request){
		int i = 0;
		if(null != bsCotainfsgmt && !"".equals(bsCotainfsgmt)){
			bsCotainfsgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=bsCotainfsgmtService.updateBsCotainfsgmt(bsCotainfsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param bs_cotainfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delBsCotainfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String delBsCotainfsgmt(String bs_cotainfsgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != bs_cotainfsgmt_id && !"".equals(bs_cotainfsgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("bs_cotainfsgmt_id",bs_cotainfsgmt_id.split(","));
			i=bsCotainfsgmtService.delBsCotainfsgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param bs_cotainfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyBsCotainfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String copyBsCotainfsgmt(String bs_cotainfsgmt_id,HttpServletRequest request){
		int i = 0;
		BsCotainfsgmt bsCotainfsgmt = bsCotainfsgmtService.getBsCotainfsgmtById(bs_cotainfsgmt_id);
		if(null != bsCotainfsgmt && !"".equals(bsCotainfsgmt)){
			bsCotainfsgmt.setBs_cotainfsgmt_id(UUID.toUUID());
			i=bsCotainfsgmtService.addBsCotainfsgmt(bsCotainfsgmt);
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
	@RequestMapping(value="/exportBsCotainfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public void exportBsCotainfsgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
