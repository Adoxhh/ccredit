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
import ccredit.bsmodules.bsmodel.BsIdsgmt;
import ccredit.bsmodules.bsservice.BsIdsgmtService;

/**
* 其他标识表 
* 2018-04-26 10:26:44  mengbeibei
*/
@Controller
@RequestMapping("/bsIdsgmtController")
public class BsIdsgmtController extends BaseAction{
	@Autowired
	private BsIdsgmtService bsIdsgmtService;
	/**
	* 载入初始化页面
	* @param bs_idsgmt 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadBsIdsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView loadBsIdsgmt(BsIdsgmt bsIdsgmt,HttpServletRequest request){
		return new ModelAndView("pc/bs-view/bs-idsgmt/bs-idsgmt-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param bs_idsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getBsIdsgmtListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	public String getBsIdsgmtListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<BsIdsgmt> bsIdsgmtList = bsIdsgmtService.getBsIdsgmtListByCondition(condition);
		PageInfo<BsIdsgmt> page = new PageInfo<BsIdsgmt>(bsIdsgmtList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param bs_idsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getBsIdsgmtById",method={RequestMethod.POST,RequestMethod.GET})
	public String getBsIdsgmtById(String bs_idsgmt_id,HttpServletRequest request){
		BsIdsgmt bsIdsgmt = bsIdsgmtService.getBsIdsgmtById(bs_idsgmt_id);
		return outDataStr2(bsIdsgmt,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param bs_idsgmt 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addBsIdsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String addBsIdsgmt(BsIdsgmt bsIdsgmt,HttpServletRequest request){
		int i = 0;
		if(null != bsIdsgmt && !"".equals(bsIdsgmt)){
			bsIdsgmt.setBs_idsgmt_id(UUID.toUUID());
			bsIdsgmt.setChangeflag("1");
			bsIdsgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=bsIdsgmtService.addBsIdsgmt(bsIdsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param bs_idsgmt 
	* @param request 
	*/
	@ResponseBody     
	@RequestMapping(value="/updateBsIdsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String updateBsIdsgmt(BsIdsgmt bsIdsgmt,HttpServletRequest request){
		int i = 0;
		if(null != bsIdsgmt && !"".equals(bsIdsgmt)){
			bsIdsgmt.setLastdate(new Date(System.currentTimeMillis()));
			i=bsIdsgmtService.updateBsIdsgmt(bsIdsgmt);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param bs_idsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delBsIdsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String delBsIdsgmt(String bs_idsgmt_id,HttpServletRequest request){
		int i = 0;
		if(null != bs_idsgmt_id && !"".equals(bs_idsgmt_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("bs_idsgmt_id",bs_idsgmt_id.split(","));
			i=bsIdsgmtService.delBsIdsgmt(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param bs_idsgmt_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyBsIdsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public String copyBsIdsgmt(String bs_idsgmt_id,HttpServletRequest request){
		int i = 0;
		BsIdsgmt bsIdsgmt = bsIdsgmtService.getBsIdsgmtById(bs_idsgmt_id);
		if(null != bsIdsgmt && !"".equals(bsIdsgmt)){
			bsIdsgmt.setBs_idsgmt_id(UUID.toUUID());
			i=bsIdsgmtService.addBsIdsgmt(bsIdsgmt);
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
	@RequestMapping(value="/exportBsIdsgmt",method={RequestMethod.POST,RequestMethod.GET})
	public void exportBsIdsgmt(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
