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
import ccredit.bsmodules.bsmodel.BsEnctfitginf;
import ccredit.bsmodules.bsservice.BsEnctfitginfService;

/**
* 身份标识整合信息记录 
* 2018-04-26 14:47:45  mengbeibei
*/
@Controller
@RequestMapping("/bsEnctfitginfController")
public class BsEnctfitginfController extends BaseAction{
	@Autowired
	private BsEnctfitginfService bsEnctfitginfService;
	/**
	* 载入初始化页面
	* @param bs_enctfitginf 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadBsEnctfitginf",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView loadBsEnctfitginf(BsEnctfitginf bsEnctfitginf,HttpServletRequest request){
		return new ModelAndView("pc/bs-view/bs-enctfitginf/bs-enctfitginf-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param bs_enctfitginf 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getBsEnctfitginfListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	public String getBsEnctfitginfListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<BsEnctfitginf> bsEnctfitginfList = bsEnctfitginfService.getBsEnctfitginfListByCondition(condition);
		PageInfo<BsEnctfitginf> page = new PageInfo<BsEnctfitginf>(bsEnctfitginfList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param enctfitginf_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getBsEnctfitginfById",method={RequestMethod.POST,RequestMethod.GET})
	public String getBsEnctfitginfById(String enctfitginf_id,HttpServletRequest request){
		BsEnctfitginf bsEnctfitginf = bsEnctfitginfService.getBsEnctfitginfById(enctfitginf_id);
		return outDataStr2(bsEnctfitginf,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param bs_enctfitginf 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addBsEnctfitginf",method={RequestMethod.POST,RequestMethod.GET})
	public String addBsEnctfitginf(BsEnctfitginf bsEnctfitginf,HttpServletRequest request){
		int i = 0;
		if(null != bsEnctfitginf && !"".equals(bsEnctfitginf)){
			bsEnctfitginf.setEnctfitginf_id(UUID.toUUID());
			bsEnctfitginf.setInfrectype("340");
			bsEnctfitginf.setChangeflag("1");
			bsEnctfitginf.setLastdate(new Date(System.currentTimeMillis()));
			i=bsEnctfitginfService.addBsEnctfitginf(bsEnctfitginf);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param bs_enctfitginf 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateBsEnctfitginf",method={RequestMethod.POST,RequestMethod.GET})
	public String updateBsEnctfitginf(BsEnctfitginf bsEnctfitginf,HttpServletRequest request){
		int i = 0;
		if(null != bsEnctfitginf && !"".equals(bsEnctfitginf)){
			bsEnctfitginf.setLastdate(new Date(System.currentTimeMillis()));
			i=bsEnctfitginfService.updateBsEnctfitginf(bsEnctfitginf);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param enctfitginf_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delBsEnctfitginf",method={RequestMethod.POST,RequestMethod.GET})
	public String delBsEnctfitginf(String enctfitginf_id,HttpServletRequest request){
		int i = 0;
		if(null != enctfitginf_id && !"".equals(enctfitginf_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("enctfitginf_id",enctfitginf_id.split(","));
			i=bsEnctfitginfService.delBsEnctfitginf(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param enctfitginf_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyBsEnctfitginf",method={RequestMethod.POST,RequestMethod.GET})
	public String copyBsEnctfitginf(String enctfitginf_id,HttpServletRequest request){
		int i = 0;
		BsEnctfitginf bsEnctfitginf = bsEnctfitginfService.getBsEnctfitginfById(enctfitginf_id);
		if(null != bsEnctfitginf && !"".equals(bsEnctfitginf)){
			bsEnctfitginf.setEnctfitginf_id(UUID.toUUID());
			i=bsEnctfitginfService.addBsEnctfitginf(bsEnctfitginf);
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
	@RequestMapping(value="/exportBsEnctfitginf",method={RequestMethod.POST,RequestMethod.GET})
	public void exportBsEnctfitginf(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
