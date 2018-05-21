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
import ccredit.bsmodules.bsmodel.BsSpvsgathrtyinfsgmt;
import ccredit.bsmodules.bsservice.BsSpvsgathrtyinfsgmtService;

/**
* 上级机构 
* 2018-04-26 14:42:34  mengbeibei
*/
@Controller
@RequestMapping("/bsSpvsgathrtyinfsgmtController")
public class BsSpvsgathrtyinfsgmtController extends BaseAction{
	@Autowired
	private BsSpvsgathrtyinfsgmtService bsSpvsgathrtyinfsgmtService;
	/**
	* 载入初始化页面
	* @param bs_spvsgathrtyinfsgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadBsSpvsgathrtyinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView loadBsSpvsgathrtyinfsgmt(BsSpvsgathrtyinfsgmt bsSpvsgathrtyinfsgmt,HttpServletRequest request){
		return new ModelAndView("pc/bs-view/bs-spvsgathrtyinfsgmt/bs-spvsgathrtyinfsgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param bs_spvsgathrtyinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getBsSpvsgathrtyinfsgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	public String getBsSpvsgathrtyinfsgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<BsSpvsgathrtyinfsgmt> bsSpvsgathrtyinfsgmtList = bsSpvsgathrtyinfsgmtService.getBsSpvsgathrtyinfsgmtListByCondition(condition);
		PageInfo<BsSpvsgathrtyinfsgmt> page = new PageInfo<BsSpvsgathrtyinfsgmt>(bsSpvsgathrtyinfsgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param bs_spvsgathrtyinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getBsSpvsgathrtyinfsgmtById",method={RequestMethod.POST,RequestMethod.GET})
	public String getBsSpvsgathrtyinfsgmtById(String bs_spvsgathrtyinfsgmt_id,HttpServletRequest request){
		BsSpvsgathrtyinfsgmt bsSpvsgathrtyinfsgmt = bsSpvsgathrtyinfsgmtService.getBsSpvsgathrtyinfsgmtById(bs_spvsgathrtyinfsgmt_id);
		return outDataStr2(bsSpvsgathrtyinfsgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param bs_spvsgathrtyinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addBsSpvsgathrtyinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String addBsSpvsgathrtyinfsgmt(BsSpvsgathrtyinfsgmt bsSpvsgathrtyinfsgmt,HttpServletRequest request){
		int i = 0;
		if(null != bsSpvsgathrtyinfsgmt && !"".equals(bsSpvsgathrtyinfsgmt)){
			bsSpvsgathrtyinfsgmt.setBs_spvsgathrtyinfsgmt_id(UUID.toUUID());
			bsSpvsgathrtyinfsgmt.setChangeflag("1");
			bsSpvsgathrtyinfsgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=bsSpvsgathrtyinfsgmtService.addBsSpvsgathrtyinfsgmt(bsSpvsgathrtyinfsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param bs_spvsgathrtyinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateBsSpvsgathrtyinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String updateBsSpvsgathrtyinfsgmt(BsSpvsgathrtyinfsgmt bsSpvsgathrtyinfsgmt,HttpServletRequest request){
		int i = 0;
		if(null != bsSpvsgathrtyinfsgmt && !"".equals(bsSpvsgathrtyinfsgmt)){
			bsSpvsgathrtyinfsgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=bsSpvsgathrtyinfsgmtService.updateBsSpvsgathrtyinfsgmt(bsSpvsgathrtyinfsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param bs_spvsgathrtyinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delBsSpvsgathrtyinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String delBsSpvsgathrtyinfsgmt(String bs_spvsgathrtyinfsgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != bs_spvsgathrtyinfsgmt_id && !"".equals(bs_spvsgathrtyinfsgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("bs_spvsgathrtyinfsgmt_id",bs_spvsgathrtyinfsgmt_id.split(","));
			i=bsSpvsgathrtyinfsgmtService.delBsSpvsgathrtyinfsgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param bs_spvsgathrtyinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyBsSpvsgathrtyinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String copyBsSpvsgathrtyinfsgmt(String bs_spvsgathrtyinfsgmt_id,HttpServletRequest request){
		int i = 0;
		BsSpvsgathrtyinfsgmt bsSpvsgathrtyinfsgmt = bsSpvsgathrtyinfsgmtService.getBsSpvsgathrtyinfsgmtById(bs_spvsgathrtyinfsgmt_id);
		if(null != bsSpvsgathrtyinfsgmt && !"".equals(bsSpvsgathrtyinfsgmt)){
			bsSpvsgathrtyinfsgmt.setBs_spvsgathrtyinfsgmt_id(UUID.toUUID());
			i=bsSpvsgathrtyinfsgmtService.addBsSpvsgathrtyinfsgmt(bsSpvsgathrtyinfsgmt);
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
	@RequestMapping(value="/exportBsSpvsgathrtyinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public void exportBsSpvsgathrtyinfsgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
