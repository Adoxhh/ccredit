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
import ccredit.bsmodules.bsmodel.BsActucotrlinfsgmt;
import ccredit.bsmodules.bsservice.BsActucotrlinfsgmtService;

/**
* 实际控制人 
* 2018-04-26 14:38:51  mengbeibei
*/
@Controller
@RequestMapping("/bsActucotrlinfsgmtController")
public class BsActucotrlinfsgmtController extends BaseAction{
	@Autowired
	private BsActucotrlinfsgmtService bsActucotrlinfsgmtService;
	/**
	* 载入初始化页面
	* @param bs_actucotrlinfsgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadBsActucotrlinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView loadBsActucotrlinfsgmt(BsActucotrlinfsgmt bsActucotrlinfsgmt,HttpServletRequest request){
		return new ModelAndView("pc/bs-view/bs-actucotrlinfsgmt/bs-actucotrlinfsgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param bs_actucotrlinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getBsActucotrlinfsgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	public String getBsActucotrlinfsgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<BsActucotrlinfsgmt> bsActucotrlinfsgmtList = bsActucotrlinfsgmtService.getBsActucotrlinfsgmtListByCondition(condition);
		PageInfo<BsActucotrlinfsgmt> page = new PageInfo<BsActucotrlinfsgmt>(bsActucotrlinfsgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param bs_actucotrlinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getBsActucotrlinfsgmtById",method={RequestMethod.POST,RequestMethod.GET})
	public String getBsActucotrlinfsgmtById(String bs_actucotrlinfsgmt_id,HttpServletRequest request){
		BsActucotrlinfsgmt bsActucotrlinfsgmt = bsActucotrlinfsgmtService.getBsActucotrlinfsgmtById(bs_actucotrlinfsgmt_id);
		return outDataStr2(bsActucotrlinfsgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param bs_actucotrlinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addBsActucotrlinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String addBsActucotrlinfsgmt(BsActucotrlinfsgmt bsActucotrlinfsgmt,HttpServletRequest request){
		int i = 0;
		if(null != bsActucotrlinfsgmt && !"".equals(bsActucotrlinfsgmt)){
			bsActucotrlinfsgmt.setBs_actucotrlinfsgmt_id(UUID.toUUID());
			bsActucotrlinfsgmt.setChangeflag("1");
			bsActucotrlinfsgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=bsActucotrlinfsgmtService.addBsActucotrlinfsgmt(bsActucotrlinfsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param bs_actucotrlinfsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateBsActucotrlinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String updateBsActucotrlinfsgmt(BsActucotrlinfsgmt bsActucotrlinfsgmt,HttpServletRequest request){
		int i = 0;
		if(null != bsActucotrlinfsgmt && !"".equals(bsActucotrlinfsgmt)){
			bsActucotrlinfsgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=bsActucotrlinfsgmtService.updateBsActucotrlinfsgmt(bsActucotrlinfsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param bs_actucotrlinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delBsActucotrlinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String delBsActucotrlinfsgmt(String bs_actucotrlinfsgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != bs_actucotrlinfsgmt_id && !"".equals(bs_actucotrlinfsgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("bs_actucotrlinfsgmt_id",bs_actucotrlinfsgmt_id.split(","));
			i=bsActucotrlinfsgmtService.delBsActucotrlinfsgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param bs_actucotrlinfsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyBsActucotrlinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String copyBsActucotrlinfsgmt(String bs_actucotrlinfsgmt_id,HttpServletRequest request){
		int i = 0;
		BsActucotrlinfsgmt bsActucotrlinfsgmt = bsActucotrlinfsgmtService.getBsActucotrlinfsgmtById(bs_actucotrlinfsgmt_id);
		if(null != bsActucotrlinfsgmt && !"".equals(bsActucotrlinfsgmt)){
			bsActucotrlinfsgmt.setBs_actucotrlinfsgmt_id(UUID.toUUID());
			i=bsActucotrlinfsgmtService.addBsActucotrlinfsgmt(bsActucotrlinfsgmt);
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
	@RequestMapping(value="/exportBsActucotrlinfsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public void exportBsActucotrlinfsgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
