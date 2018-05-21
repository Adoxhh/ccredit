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
import ccredit.bsmodules.bsmodel.BsMnmmbinfsgmt;
import ccredit.bsmodules.bsservice.BsMnmmbinfsgmtService;

/**
* 主要组成人员 
* 2018-04-26 11:18:18  mengbeibei
*/
@Controller
@RequestMapping("/bsMnmmbinfsgmtController")
public class BsMnmmbinfsgmtController extends BaseAction{
	@Autowired
	private BsMnmmbinfsgmtService bsMnmmbinfsgmtService;
	/**
	* 载入初始化页面
	* @param bs_mnmmbinfsgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadBsMnmmbinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView loadBsMnmmbinfsgmt(BsMnmmbinfsgmt bsMnmmbinfsgmt,HttpServletRequest request){
		return new ModelAndView("pc/bs-view/bs-mnmmbinfsgmt/bs-mnmmbinfsgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param bs_mnmmbinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getBsMnmmbinfsgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	public String getBsMnmmbinfsgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<BsMnmmbinfsgmt> bsMnmmbinfsgmtList = bsMnmmbinfsgmtService.getBsMnmmbinfsgmtListByCondition(condition);
		PageInfo<BsMnmmbinfsgmt> page = new PageInfo<BsMnmmbinfsgmt>(bsMnmmbinfsgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param bs_mnmmbinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getBsMnmmbinfsgmtById",method={RequestMethod.POST,RequestMethod.GET})
	public String getBsMnmmbinfsgmtById(String bs_mnmmbinfsgmt_id,HttpServletRequest request){
		BsMnmmbinfsgmt bsMnmmbinfsgmt = bsMnmmbinfsgmtService.getBsMnmmbinfsgmtById(bs_mnmmbinfsgmt_id);
		return outDataStr2(bsMnmmbinfsgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param bs_mnmmbinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addBsMnmmbinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String addBsMnmmbinfsgmt(BsMnmmbinfsgmt bsMnmmbinfsgmt,HttpServletRequest request){
		int i = 0;
		if(null != bsMnmmbinfsgmt && !"".equals(bsMnmmbinfsgmt)){
			bsMnmmbinfsgmt.setBs_mnmmbinfsgmt_id(UUID.toUUID());
			bsMnmmbinfsgmt.setChangeflag("1");
			bsMnmmbinfsgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=bsMnmmbinfsgmtService.addBsMnmmbinfsgmt(bsMnmmbinfsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param bs_mnmmbinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateBsMnmmbinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String updateBsMnmmbinfsgmt(BsMnmmbinfsgmt bsMnmmbinfsgmt,HttpServletRequest request){
		int i = 0;
		if(null != bsMnmmbinfsgmt && !"".equals(bsMnmmbinfsgmt)){
			bsMnmmbinfsgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=bsMnmmbinfsgmtService.updateBsMnmmbinfsgmt(bsMnmmbinfsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param bs_mnmmbinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delBsMnmmbinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String delBsMnmmbinfsgmt(String bs_mnmmbinfsgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != bs_mnmmbinfsgmt_id && !"".equals(bs_mnmmbinfsgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("bs_mnmmbinfsgmt_id",bs_mnmmbinfsgmt_id.split(","));
			i=bsMnmmbinfsgmtService.delBsMnmmbinfsgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param bs_mnmmbinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyBsMnmmbinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String copyBsMnmmbinfsgmt(String bs_mnmmbinfsgmt_id,HttpServletRequest request){
		int i = 0;
		BsMnmmbinfsgmt bsMnmmbinfsgmt = bsMnmmbinfsgmtService.getBsMnmmbinfsgmtById(bs_mnmmbinfsgmt_id);
		if(null != bsMnmmbinfsgmt && !"".equals(bsMnmmbinfsgmt)){
			bsMnmmbinfsgmt.setBs_mnmmbinfsgmt_id(UUID.toUUID());
			i=bsMnmmbinfsgmtService.addBsMnmmbinfsgmt(bsMnmmbinfsgmt);
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
	@RequestMapping(value="/exportBsMnmmbinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public void exportBsMnmmbinfsgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
