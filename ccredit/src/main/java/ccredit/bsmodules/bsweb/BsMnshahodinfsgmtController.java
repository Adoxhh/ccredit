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
import ccredit.bsmodules.bsmodel.BsMnshahodinfsgmt;
import ccredit.bsmodules.bsservice.BsMnshahodinfsgmtService;

/**
* 注册资本及主要出资人 
* 2018-04-26 11:28:45  mengbeibei
*/
@Controller
@RequestMapping("/bsMnshahodinfsgmtController")
public class BsMnshahodinfsgmtController extends BaseAction{
	@Autowired
	private BsMnshahodinfsgmtService bsMnshahodinfsgmtService;
	/**
	* 载入初始化页面
	* @param bs_mnshahodinfsgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadBsMnshahodinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView loadBsMnshahodinfsgmt(BsMnshahodinfsgmt bsMnshahodinfsgmt,HttpServletRequest request){
		return new ModelAndView("pc/bs-view/bs-mnshahodinfsgmt/bs-mnshahodinfsgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param bs_mnshahodinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getBsMnshahodinfsgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	public String getBsMnshahodinfsgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<BsMnshahodinfsgmt> bsMnshahodinfsgmtList = bsMnshahodinfsgmtService.getBsMnshahodinfsgmtListByCondition(condition);
		PageInfo<BsMnshahodinfsgmt> page = new PageInfo<BsMnshahodinfsgmt>(bsMnshahodinfsgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param bs_mnshahodinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getBsMnshahodinfsgmtById",method={RequestMethod.POST,RequestMethod.GET})
	public String getBsMnshahodinfsgmtById(String bs_mnshahodinfsgmt_id,HttpServletRequest request){
		BsMnshahodinfsgmt bsMnshahodinfsgmt = bsMnshahodinfsgmtService.getBsMnshahodinfsgmtById(bs_mnshahodinfsgmt_id);
		return outDataStr2(bsMnshahodinfsgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param bs_mnshahodinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addBsMnshahodinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String addBsMnshahodinfsgmt(BsMnshahodinfsgmt bsMnshahodinfsgmt,HttpServletRequest request){
		int i = 0;
		if(null != bsMnshahodinfsgmt && !"".equals(bsMnshahodinfsgmt)){
			bsMnshahodinfsgmt.setBs_mnshahodinfsgmt_id(UUID.toUUID());
			bsMnshahodinfsgmt.setChangeflag("1");
			bsMnshahodinfsgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=bsMnshahodinfsgmtService.addBsMnshahodinfsgmt(bsMnshahodinfsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param bs_mnshahodinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateBsMnshahodinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String updateBsMnshahodinfsgmt(BsMnshahodinfsgmt bsMnshahodinfsgmt,HttpServletRequest request){
		int i = 0;
		if(null != bsMnshahodinfsgmt && !"".equals(bsMnshahodinfsgmt)){
			bsMnshahodinfsgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=bsMnshahodinfsgmtService.updateBsMnshahodinfsgmt(bsMnshahodinfsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param bs_mnshahodinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delBsMnshahodinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String delBsMnshahodinfsgmt(String bs_mnshahodinfsgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != bs_mnshahodinfsgmt_id && !"".equals(bs_mnshahodinfsgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("bs_mnshahodinfsgmt_id",bs_mnshahodinfsgmt_id.split(","));
			i=bsMnshahodinfsgmtService.delBsMnshahodinfsgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param bs_mnshahodinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyBsMnshahodinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String copyBsMnshahodinfsgmt(String bs_mnshahodinfsgmt_id,HttpServletRequest request){
		int i = 0;
		BsMnshahodinfsgmt bsMnshahodinfsgmt = bsMnshahodinfsgmtService.getBsMnshahodinfsgmtById(bs_mnshahodinfsgmt_id);
		if(null != bsMnshahodinfsgmt && !"".equals(bsMnshahodinfsgmt)){
			bsMnshahodinfsgmt.setBs_mnshahodinfsgmt_id(UUID.toUUID());
			i=bsMnshahodinfsgmtService.addBsMnshahodinfsgmt(bsMnshahodinfsgmt);
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
	@RequestMapping(value="/exportBsMnshahodinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public void exportBsMnshahodinfsgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
