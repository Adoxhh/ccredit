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
import ccredit.bsmodules.bsmodel.BsFcsinfsgmt;
import ccredit.bsmodules.bsservice.BsFcsinfsgmtService;

/**
* 基本概况信息 
* 2018-04-26 10:57:16  mengbeibei
*/
@Controller
@RequestMapping("/bsFcsinfsgmtController")
public class BsFcsinfsgmtController extends BaseAction{
	@Autowired
	private BsFcsinfsgmtService bsFcsinfsgmtService;
	/**
	* 载入初始化页面
	* @param bs_fcsinfsgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadBsFcsinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView loadBsFcsinfsgmt(BsFcsinfsgmt bsFcsinfsgmt,HttpServletRequest request){
		return new ModelAndView("pc/bs-view/bs-fcsinfsgmt/bs-fcsinfsgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param bs_fcsinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getBsFcsinfsgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	public String getBsFcsinfsgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<BsFcsinfsgmt> bsFcsinfsgmtList = bsFcsinfsgmtService.getBsFcsinfsgmtListByCondition(condition);
		PageInfo<BsFcsinfsgmt> page = new PageInfo<BsFcsinfsgmt>(bsFcsinfsgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param bs_fcsinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getBsFcsinfsgmtById",method={RequestMethod.POST,RequestMethod.GET})
	public String getBsFcsinfsgmtById(String bs_fcsinfsgmt_id,HttpServletRequest request){
		BsFcsinfsgmt bsFcsinfsgmt = bsFcsinfsgmtService.getBsFcsinfsgmtById(bs_fcsinfsgmt_id);
		return outDataStr2(bsFcsinfsgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param bs_fcsinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addBsFcsinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String addBsFcsinfsgmt(BsFcsinfsgmt bsFcsinfsgmt,HttpServletRequest request){
		int i = 0;
		if(null != bsFcsinfsgmt && !"".equals(bsFcsinfsgmt)){
			bsFcsinfsgmt.setBs_fcsinfsgmt_id(UUID.toUUID());
			bsFcsinfsgmt.setChangeflag("1");
			bsFcsinfsgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=bsFcsinfsgmtService.addBsFcsinfsgmt(bsFcsinfsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param bs_fcsinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateBsFcsinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String updateBsFcsinfsgmt(BsFcsinfsgmt bsFcsinfsgmt,HttpServletRequest request){
		int i = 0;
		if(null != bsFcsinfsgmt && !"".equals(bsFcsinfsgmt)){
			bsFcsinfsgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=bsFcsinfsgmtService.updateBsFcsinfsgmt(bsFcsinfsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param bs_fcsinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delBsFcsinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String delBsFcsinfsgmt(String bs_fcsinfsgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != bs_fcsinfsgmt_id && !"".equals(bs_fcsinfsgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("bs_fcsinfsgmt_id",bs_fcsinfsgmt_id.split(","));
			i=bsFcsinfsgmtService.delBsFcsinfsgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param bs_fcsinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyBsFcsinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String copyBsFcsinfsgmt(String bs_fcsinfsgmt_id,HttpServletRequest request){
		int i = 0;
		BsFcsinfsgmt bsFcsinfsgmt = bsFcsinfsgmtService.getBsFcsinfsgmtById(bs_fcsinfsgmt_id);
		if(null != bsFcsinfsgmt && !"".equals(bsFcsinfsgmt)){
			bsFcsinfsgmt.setBs_fcsinfsgmt_id(UUID.toUUID());
			i=bsFcsinfsgmtService.addBsFcsinfsgmt(bsFcsinfsgmt);
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
	@RequestMapping(value="/exportBsFcsinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public void exportBsFcsinfsgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
