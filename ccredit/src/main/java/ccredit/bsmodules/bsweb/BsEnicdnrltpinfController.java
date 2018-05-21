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
import ccredit.bsmodules.bsmodel.BsEnicdnrltpinf;
import ccredit.bsmodules.bsservice.BsEnicdnrltpinfService;

/**
* 企业间关联关系信息记录 
* 2018-04-26 14:51:38  mengbeibei
*/
@Controller
@RequestMapping("/bsEnicdnrltpinfController")
public class BsEnicdnrltpinfController extends BaseAction{
	@Autowired
	private BsEnicdnrltpinfService bsEnicdnrltpinfService;
	/**
	* 载入初始化页面
	* @param bs_enicdnrltpinf 
	* @param request 
	* @return
	*/
	@RequestMapping(value="/loadBsEnicdnrltpinf",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView loadBsEnicdnrltpinf(BsEnicdnrltpinf bsEnicdnrltpinf,HttpServletRequest request){
		return new ModelAndView("pc/bs-view/bs-enicdnrltpinf/bs-enicdnrltpinf-list");
	}
	/**
	* 加载初始化列表数据并分页
	* @param bs_enicdnrltpinf 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getBsEnicdnrltpinfListByCondition",method={RequestMethod.POST,RequestMethod.GET})
	public String getBsEnicdnrltpinfListByCondition(BaseSearch baseSearch,HttpServletRequest request){
		Map<String, Object> condition = baseSearch.convert();
		commonHPager(condition,request);
		List<BsEnicdnrltpinf> bsEnicdnrltpinfList = bsEnicdnrltpinfService.getBsEnicdnrltpinfListByCondition(condition);
		PageInfo<BsEnicdnrltpinf> page = new PageInfo<BsEnicdnrltpinf>(bsEnicdnrltpinfList);
		return outPageStr(page,request);
	}
	/**
	* 获取对象
	* @param enicdnrltpinf_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/getBsEnicdnrltpinfById",method={RequestMethod.POST,RequestMethod.GET})
	public String getBsEnicdnrltpinfById(String enicdnrltpinf_id,HttpServletRequest request){
		BsEnicdnrltpinf bsEnicdnrltpinf = bsEnicdnrltpinfService.getBsEnicdnrltpinfById(enicdnrltpinf_id);
		return outDataStr2(bsEnicdnrltpinf,"yyyy-MM-dd");
	}
	/**
	* 添加
	* @param bs_enicdnrltpinf 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/addBsEnicdnrltpinf",method={RequestMethod.POST,RequestMethod.GET})
	public String addBsEnicdnrltpinf(BsEnicdnrltpinf bsEnicdnrltpinf,HttpServletRequest request){
		int i = 0;
		if(null != bsEnicdnrltpinf && !"".equals(bsEnicdnrltpinf)){
			bsEnicdnrltpinf.setEnicdnrltpinf_id(UUID.toUUID());
			bsEnicdnrltpinf.setInfrectype("350");
			bsEnicdnrltpinf.setChangeflag("1");
			bsEnicdnrltpinf.setLastdate(new Date(System.currentTimeMillis()));
			i=bsEnicdnrltpinfService.addBsEnicdnrltpinf(bsEnicdnrltpinf);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 修改
	* @param bs_enicdnrltpinf 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/updateBsEnicdnrltpinf",method={RequestMethod.POST,RequestMethod.GET})
	public String updateBsEnicdnrltpinf(BsEnicdnrltpinf bsEnicdnrltpinf,HttpServletRequest request){
		int i = 0;
		if(null != bsEnicdnrltpinf && !"".equals(bsEnicdnrltpinf)){
			bsEnicdnrltpinf.setLastdate(new Date(System.currentTimeMillis()));
			i=bsEnicdnrltpinfService.updateBsEnicdnrltpinf(bsEnicdnrltpinf);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 删除
	* @param enicdnrltpinf_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/delBsEnicdnrltpinf",method={RequestMethod.POST,RequestMethod.GET})
	public String delBsEnicdnrltpinf(String enicdnrltpinf_id,HttpServletRequest request){
		int i = 0;
		if(null != enicdnrltpinf_id && !"".equals(enicdnrltpinf_id)){
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("enicdnrltpinf_id",enicdnrltpinf_id.split(","));
			i=bsEnicdnrltpinfService.delBsEnicdnrltpinf(condition);
		}
		if(i>0){
			return outAudStr(true);
		}else{
			return outAudStr(false);
		}
	}
	/**
	* 复制一行并生成记录
	* @param enicdnrltpinf_id 
	* @param request 
	*/
	@ResponseBody
	@RequestMapping(value="/copyBsEnicdnrltpinf",method={RequestMethod.POST,RequestMethod.GET})
	public String copyBsEnicdnrltpinf(String enicdnrltpinf_id,HttpServletRequest request){
		int i = 0;
		BsEnicdnrltpinf bsEnicdnrltpinf = bsEnicdnrltpinfService.getBsEnicdnrltpinfById(enicdnrltpinf_id);
		if(null != bsEnicdnrltpinf && !"".equals(bsEnicdnrltpinf)){
			bsEnicdnrltpinf.setEnicdnrltpinf_id(UUID.toUUID());
			i=bsEnicdnrltpinfService.addBsEnicdnrltpinf(bsEnicdnrltpinf);
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
	@RequestMapping(value="/exportBsEnicdnrltpinf",method={RequestMethod.POST,RequestMethod.GET})
	public void exportBsEnicdnrltpinf(String excleData,String excleHeader,String excleText,HttpServletRequest request,HttpServletResponse response){
		ExportExcel exportExcel = new ExportExcel();
		exportExcel.exportExcel(excleData, excleHeader,excleText,response);
	}
}
