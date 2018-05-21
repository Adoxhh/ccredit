package ccredit.xtmodules.xtweb;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ccredit.xtmodules.xtcore.allutils.file.FileEntity;
import ccredit.xtmodules.xtcore.allutils.file.FileUtil;
import ccredit.xtmodules.xtcore.annotation.AuthUneedLogin;
import ccredit.xtmodules.xtcore.base.BaseAction;
import ccredit.xtmodules.xtcore.base.BaseJson;
import ccredit.xtmodules.xtcore.util.CommonUtils;
import ccredit.xtmodules.xtmodel.XtAttachment;
import ccredit.xtmodules.xtmodel.XtDataDictionary;
import ccredit.xtmodules.xtmodel.XtDepartinfo;
import ccredit.xtmodules.xtmodel.XtPost;
import ccredit.xtmodules.xtservice.XtAttachmentService;
import ccredit.xtmodules.xtservice.XtDepartinfoService;
import ccredit.xtmodules.xtservice.XtPostService;
import net.sf.json.JSONArray;
/**
 * 通用
 * @author邓纯杰
 *
 */
@Controller
@RequestMapping("/xtCommonController")
@Scope("prototype")
public class XtCommonController extends BaseAction{
	@Autowired
	private XtDepartinfoService xtDepartinfoService;
	@Autowired
	private XtPostService xtPostService;
	@Autowired
	private XtAttachmentService xtAttachmentService;
	
	/**
	 * 组织机构树列表
	 * @param id
	 * @param type
	 * @param request
	 * @throws UnsupportedEncodingException 
	 */
	@ResponseBody
	@RequestMapping(value="/getXtOrgTree",method={RequestMethod.POST,RequestMethod.GET})
	public String getXtOrgTree(String id,String type,HttpServletRequest request) throws UnsupportedEncodingException{
		type = URLDecoder.decode(type, "UTF-8");
		StringBuffer jsonStr = new StringBuffer("");  
		if(null != id && !"".equals(id) && "0".equals(id)){
			jsonStr.append("[");
			List<XtDepartinfo> xtDepartinfoList = xtDepartinfoService.getXtDepartinfoList();
			for(int i = 0; i < xtDepartinfoList.size(); i++){
				XtDepartinfo xtDepartinfo = xtDepartinfoList.get(i);
				if(i==(xtDepartinfoList.size()-1)){
					jsonStr.append("{id:'"+xtDepartinfo.getXt_departinfo_id()+"',text:'"+xtDepartinfo.getXt_departinfo_name()+"',icon:'../deng/images/icons/depart.png',xt_departinfo_parentId:'"+xtDepartinfo.getXt_departinfo_parentId()+"',type:'部门',remark:'"+xtDepartinfo.getXt_departinfo_desc()+"'}");  
				}else{
					jsonStr.append("{id:'"+xtDepartinfo.getXt_departinfo_id()+"',text:'"+xtDepartinfo.getXt_departinfo_name()+"',icon:'../deng/images/icons/depart.png',xt_departinfo_parentId:'"+xtDepartinfo.getXt_departinfo_parentId()+"',type:'部门',remark:'"+xtDepartinfo.getXt_departinfo_desc()+"'},");
				}
			}
			jsonStr.append("]");
		}else{
			//1查找部门
			jsonStr.append("[");
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("xt_departinfo_parentId", id);
			List<XtDepartinfo> xtDepartinfoList = xtDepartinfoService.getXtDepartinfoListChild(condition);
			for(int i = 0; i < xtDepartinfoList.size(); i++){
				XtDepartinfo xtDepartinfo = xtDepartinfoList.get(i);
				String leaf = "false";
				if(i==(xtDepartinfoList.size()-1)){
					if(xtDepartinfo.getXt_departinfo_leaf() == 0){
						leaf = "false";
					}else{
						leaf = "true";
					}
					jsonStr.append("{id:'"+xtDepartinfo.getXt_departinfo_id()+"',text:'"+xtDepartinfo.getXt_departinfo_name()+"',leaf:"+leaf+",icon:'../deng/images/icons/depart.png',xt_departinfo_parentId:'"+xtDepartinfo.getXt_departinfo_parentId()+"',type:'部门',remark:'"+xtDepartinfo.getXt_departinfo_desc()+"'}");  
				}else{
					if(xtDepartinfo.getXt_departinfo_leaf() == 0){
						leaf = "false";
					}else{
						leaf = "true";
					}
					jsonStr.append("{id:'"+xtDepartinfo.getXt_departinfo_id()+"',text:'"+xtDepartinfo.getXt_departinfo_name()+"',leaf:"+leaf+",icon:'../deng/images/icons/depart.png',xt_departinfo_parentId:'"+xtDepartinfo.getXt_departinfo_parentId()+"',type:'部门',remark:'"+xtDepartinfo.getXt_departinfo_desc()+"'},");  
				}
			}
			//2查找部门下面一级岗位
			String xtPostStr = xtPostStr(id,type);
			if(null != xtPostStr && !"".equals(xtPostStr) && !"[".equals(jsonStr.toString())){
				jsonStr.append(","+xtPostStr);
			}else{
				jsonStr.append(xtPostStr);
			}
			jsonStr.append("]");
		}
		return outStr(jsonStr.toString());
	}
	
	/**
	 * 返回岗位字符串
	 * @param id
	 * @return
	 */
	public String xtPostStr(String id,String type){
		//如果类型:部门 则查出所有部门下的一级岗位
		StringBuffer jsonStr = new StringBuffer(); 
		Map<String, Object> condition = new HashMap<String, Object>();
		if(null != type && !"".equals(type) && "部门".equals(type)){
			condition.put("xt_departinfo_id", id);
			List<XtPost> xtPostList = xtPostService.getXtPostinfoList(condition);
			//拼接字符串
			for(int i = 0; i < xtPostList.size(); i++){
				XtPost xtPost = xtPostList.get(i);
				if(i==(xtPostList.size()-1)){
					jsonStr.append("{id:'"+xtPost.getXt_post_id()+"',text:'"+xtPost.getXt_post_name()+"',icon:'../deng/images/icons/users.png',xt_post_parentId:'"+xtPost.getXt_post_parentId()+"',type:'岗位',remark:'"+xtPost.getXt_post_desc()+"',xt_departinfo_id:'"+xtPost.getXt_departinfo_id()+"',xt_departinfo_name:'"+xtPost.getXt_departinfo_name()+"'}");  
				}else{
					jsonStr.append("{id:'"+xtPost.getXt_post_id()+"',text:'"+xtPost.getXt_post_name()+"',icon:'../deng/images/icons/users.png',xt_post_parentId:'"+xtPost.getXt_post_parentId()+"',type:'岗位',remark:'"+xtPost.getXt_post_desc()+"',xt_departinfo_id:'"+xtPost.getXt_departinfo_id()+"',xt_departinfo_name:'"+xtPost.getXt_departinfo_name()+"'},");
				}
			}
		}
		return jsonStr.toString();
	}
	

	/**
	 * 上传
	 * @param validateparameter 校验类型
	 * @param validateSize 校验大小
	 * @param xt_path_absolutek 绝对路径键（自定义）
	 * @param xt_path_relativek相对路径键（自定义）
	 * @param xt_path_urlk 基础路径URL（自定义）
	 * @param request
	 * @param response
	 * @return
	 */
	@AuthUneedLogin
	@ResponseBody
	@RequestMapping(value="/upload",method={RequestMethod.POST,RequestMethod.GET})
	public String upload(String validateparameter,String validateSize,String xt_path_absolutek,String xt_path_relativek,String xt_path_urlk,HttpServletRequest request,HttpServletResponse response){
		BaseJson baseJson = new BaseJson();
		try {
			//默认绝对路径
			String path = CommonUtils.getXtPathCache("xt_sources_default_path").get(0).getXt_path();
			//相对路径
			String relative_path = CommonUtils.getXtPathCache("xt_sources_default_relative_path").get(0).getXt_path();
			//校验xt_path_absolutek
			if(!StringUtils.isEmpty(xt_path_absolutek)){
				if(!StringUtils.isEmpty(CommonUtils.getXtPathCache(xt_path_absolutek).get(0).getXt_path())){
					path = CommonUtils.getXtPathCache(xt_path_absolutek).get(0).getXt_path();
				}
			}
			//校验xt_path_relativek
			if(!StringUtils.isEmpty(xt_path_relativek)){
				if(!StringUtils.isEmpty(CommonUtils.getXtPathCache(xt_path_relativek).get(0).getXt_path())){
					relative_path = CommonUtils.getXtPathCache(xt_path_relativek).get(0).getXt_path();
				}
			}
			FileUtil.initPath(request, path);
			List<XtAttachment> xtAttachmentList = CommonUtils.upLoad(request, path,relative_path,validateparameter,validateSize,xt_path_absolutek,xt_path_relativek,xt_path_urlk);
			int i = xtAttachmentService.addXtAttachment(xtAttachmentList.get(0));
			if(i > 0){
				baseJson.setJsonID(xtAttachmentList.get(0).getXt_attachment_id());
				baseJson.setMsg("上传成功");
				baseJson.setFileType(xtAttachmentList.get(0).getXt_attachmentType());
				if(null != xtAttachmentList.get(0).getXt_attachmentType() && !"".equals(xtAttachmentList.get(0).getXt_attachmentType())){
					if("image/jpeg".equals(xtAttachmentList.get(0).getXt_attachmentType())|| 
					   "image/png".equals(xtAttachmentList.get(0).getXt_attachmentType())||
					   "image/gif".equals(xtAttachmentList.get(0).getXt_attachmentType())||
					   "image/bmp".equals(xtAttachmentList.get(0).getXt_attachmentType())){
						//校验是否为自定义路径
						if(!StringUtils.isEmpty(xt_path_urlk)){
							baseJson.setJsonValue(CommonUtils.getXtPathCache(xt_path_urlk).get(0).getXt_path()+ xtAttachmentList.get(0).getXt_attachmentPath());
						}else{
							baseJson.setJsonValue(CommonUtils.getXtPathCache("jehcsources_base_url").get(0).getXt_path()+ xtAttachmentList.get(0).getXt_attachmentPath());
						}
					}else{
						//非图片格式让其显示成功图标即可
						baseJson.setJsonValue(CommonUtils.getXtPathCache("jehc_upload_sucess").get(0).getXt_path());
					}
				}else{
					baseJson.setJsonValue(CommonUtils.getXtPathCache("jehc_upload_fail").get(0).getXt_path());
				}
			}else{
				baseJson.setJsonValue(CommonUtils.getXtPathCache("jehc_upload_fail").get(0).getXt_path());
				baseJson.setMsg("上传失败");
			}
			return outDataStr(baseJson);
        } catch (Exception e) {
        	baseJson.setMsg("上传失败、失败原因:"+e.getMessage());
        	baseJson.setJsonID("0");
        	return outDataStr(baseJson);
        }
	}
	
	/**
	 * 按条件获取附件所有相关字段信息 并且与相关附件字段匹配
	 * @param field_name字段名称 
	 * @param xt_attachment_id
	 * field_name与xt_attachment_id必须满足的规则是如parameter={field_name:'field1,field2,field3',xt_attachment_id:'1,2,3'}一一对应
	 * @param request
	 * @param response
	 */
	@AuthUneedLogin
	@ResponseBody
	@RequestMapping(value="/getAttachmentPathPP",method={RequestMethod.POST,RequestMethod.GET})
	public String getAttachmentPathPP(String xt_attachment_id,String field_name, HttpServletRequest request,HttpServletResponse response){
		Map<String, Object> condition = new HashMap<String, Object>();
		JSONArray jsonArray = new JSONArray();  
		String path = CommonUtils.getXtPathCache("jehcsources_base_url").get(0).getXt_path();
		Map<String, Object> model = new HashMap<String, Object>();
		if(null != xt_attachment_id && !"".equals(xt_attachment_id) && null != field_name && !"".equals(field_name)){
			if(xt_attachment_id.split(",").length>0){
				String[] xt_attachment_id_array= xt_attachment_id.split(",");
				condition.put("xt_attachment_id", xt_attachment_id.split(","));
				if(null != xt_attachment_id_array){
					for(int i = 0; i < xt_attachment_id_array.length; i++){
						XtAttachment xtAttachment = xtAttachmentService.getXtAttachmentById(xt_attachment_id_array[i]);
						//判断该附件是否使用自定义xt_path_urlk
						if(null != xtAttachment && !StringUtils.isEmpty(xtAttachment.getXt_path_urlk())){
							 path = CommonUtils.getXtPathCache(xtAttachment.getXt_path_urlk()).get(0).getXt_path();
						}
						if(null != xtAttachment){
							model.put("xt_attachment_id", xtAttachment.getXt_attachment_id());
							model.put("xt_attachmentType", xtAttachment.getXt_attachmentType());
							model.put("xt_attachmentCtime", xtAttachment.getXt_attachmentCtime());
							model.put("xt_attachmentSize", xtAttachment.getXt_attachmentSize());
							//附件字段名称（即表单中附件字段）
							model.put("field_name", field_name.split(",")[i]);
							if("image/jpeg".equals(xtAttachment.getXt_attachmentType())|| 
							   "image/png".equals(xtAttachment.getXt_attachmentType())||
							   "image/gif".equals(xtAttachment.getXt_attachmentType())||
							   "image/bmp".equals(xtAttachment.getXt_attachmentType())){
								model.put("xt_attachmentPath", path+xtAttachment.getXt_attachmentPath());
							}else{
								//非图片格式让其显示成功图标即可
								model.put("xt_attachmentPath", CommonUtils.getXtPathCache("jehc_upload_sucess").get(0).getXt_path());
							}
							model.put("xt_all_url", path+xtAttachment.getXt_attachmentPath());
							model.put("xt_attachmentIsDelete", xtAttachment.getXt_attachmentIsDelete());
							model.put("xt_attachmentName", xtAttachment.getXt_attachmentName());
							model.put("xt_userinfo_id", xtAttachment.getXt_userinfo_id());
							model.put("xt_modules_id", xtAttachment.getXt_modules_id());
							model.put("xt_modules_order", xtAttachment.getXt_modules_order());
							model.put("xt_attachmentTitle", xtAttachment.getXt_attachmentTitle());
							jsonArray.add(model);
						}
					}
					return outItemsStr(jsonArray);
				}else{
					XtAttachment xtAttachment = new XtAttachment();
					return outItemsStr(xtAttachment);
				}
			}else{
				XtAttachment xtAttachment = new XtAttachment();
				return outItemsStr(xtAttachment);
			}
		}else{
			XtAttachment xtAttachment = new XtAttachment();
			return outItemsStr(xtAttachment);
		}
	}
	
	/**
	 * 按条件获取附件所有相关字段信息 
	 * @param xt_attachment_id
	 * @param request
	 * @param response
	 */
	@AuthUneedLogin
	@ResponseBody
	@RequestMapping(value="/getAttachmentPath",method={RequestMethod.POST,RequestMethod.GET})
	public String getAttachmentPath(String xt_attachment_id, HttpServletRequest request,HttpServletResponse response){
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("xt_attachment_id", xt_attachment_id.split(","));
		List<XtAttachment> xtAttachmentList = xtAttachmentService.getXtAttachmentList(condition);
		return outItemsStr(xtAttachmentList);
	}
	
	/**
	 * 下载文件
	 * @return
	 * @throws IOException 
	 */
	@AuthUneedLogin
	@RequestMapping(value="/downFile",method={RequestMethod.POST,RequestMethod.GET})
	public void downFile(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String xt_attachment_id = request.getParameter("xt_attachment_id");
		if(!StringUtils.isEmpty(xt_attachment_id)){
			XtAttachment xtAttachment = xtAttachmentService.getXtAttachmentById(xt_attachment_id);
			String path = CommonUtils.getXtPathCache("xt_sources_default_path").get(0).getXt_path();
			//判断该附件是否使用自定义xt_path_absolutek（自定义绝对路径K）
			if(null != xtAttachment && !StringUtils.isEmpty(xtAttachment.getXt_path_absolutek())){
				 path = CommonUtils.getXtPathCache(xtAttachment.getXt_path_absolutek()).get(0).getXt_path();
			}
			response.setContentType("text/html;charset=utf-8");  
			File file = new File(path+xtAttachment.getXt_attachmentName()); 
			String xt_attachment_name=xtAttachment.getXt_attachmentTitle();
			if(!file.exists()){
				response.getWriter().println("<script type='text/javascript'>top.window.parent.toastrBoot(4,'<font color=red>您访问的文件已经不存在，请联系管理员！</font>');</script>");
			}else{
				int len=0;
				byte []buffers = new byte[1024];
				BufferedInputStream br = null; 
		        OutputStream ut = null;  
				response.reset();
				response.setContentType("application/x-msdownload");
				response.setHeader("Content-Disposition","attachment;filename=" +java.net.URLEncoder.encode(xt_attachment_name,"UTF-8"));
				br = new BufferedInputStream(new FileInputStream(file));  
		        ut = response.getOutputStream();  
		        while((len=br.read(buffers))!=-1){  
		            ut.write(buffers, 0, len);  
		        } 
		        ut.flush();
		        ut.close();
		        br.close();
			}
		}else{
			response.getWriter().println("<script type='text/javascript'>top.window.parent.toastrBoot(4,'<font color=red>您访问的文件已经不存在，请联系管理员！</font>');</script>");
		}
	}
	
/*	
	*//**
	 * 下载文件（网络批量）
	 * @return
	 * @throws IOException 
	 *//*
	@AuthUneedLogin
	@RequestMapping(value="/downBatchFileByUrl",method={RequestMethod.POST,RequestMethod.GET})
	public void downBatchFileByUrl(String[] pathList,HttpServletRequest request,HttpServletResponse response) throws IOException{
		String downloadFilename = "开源平台压缩文件.zip";//文件的名称
		downloadFilename = URLEncoder.encode(downloadFilename, "UTF-8");//转换中文否则可能会产生乱码
		response.setContentType("application/octet-stream");// 指明response的返回对象是文件流
        response.setHeader("Content-Disposition", "attachment;filename=" + downloadFilename);// 设置在下载框默认显示的文件名
        ZipOutputStream zos = new ZipOutputStream(response.getOutputStream());
        for (int i=0;i<pathList.length;i++) {
           URL url = new URL(pathList[i]);
           zos.putNextEntry(new ZipEntry(pathList[i]));
           InputStream fis = url.openConnection().getInputStream();  
           byte[] buffer = new byte[1024];    
           int r = 0;    
           while ((r = fis.read(buffer)) != -1) {    
               zos.write(buffer, 0, r);    
           }    
           fis.close();  
          } 
        zos.flush();    
        zos.close();
	}
	*/
	
	/**
	 * 下载文件（非网络批量）
	 * @return
	 * @throws IOException 
	 */
	@AuthUneedLogin
	@RequestMapping(value="/downBatchFile",method={RequestMethod.POST,RequestMethod.GET})
	public void downBatchFile(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String xt_attachment_id = request.getParameter("xt_attachment_id");
		if(!StringUtils.isEmpty(xt_attachment_id)){
			String[] xt_attachment_ids = xt_attachment_id.split(",");
			List<String> paths = new ArrayList<String>();
			List<String> oldNames = new ArrayList<String>();
			for(String xt_attachment_id_:xt_attachment_ids){
				String path = CommonUtils.getXtPathCache("xt_sources_default_path").get(0).getXt_path();
				XtAttachment xtAttachment = xtAttachmentService.getXtAttachmentById(xt_attachment_id_);
				//判断该附件是否使用自定义xt_path_absolutek（自定义绝对路径K）
				if(null != xtAttachment && !StringUtils.isEmpty(xtAttachment.getXt_path_absolutek())){
					path = CommonUtils.getXtPathCache(xtAttachment.getXt_path_absolutek()).get(0).getXt_path();
					
				}
				if(path.substring(path.length()-2, path.length()-1).equals("/")){
					path = path+xtAttachment.getXt_attachmentName();
				}else {
					path = path+"/"+xtAttachment.getXt_attachmentName();
				}
				oldNames.add(xtAttachment.getXt_attachmentTitle());
				paths.add(path);
			}
			FileUtil fileUtil = new FileUtil();
			FileEntity fileEntity = new FileEntity(paths,oldNames,"D://","开源.zip");
			fileUtil.callZipFilePath(fileEntity);
		}else{
			response.getWriter().println("<script type='text/javascript'>top.window.parent.toastrBoot(4,'<font color=red>您访问的文件已经不存在，请联系管理员！</font>');</script>");
		}
	}
	
	/**
	 * 获取字典集合（根据ckey）
	 * @param ckey
	 * @return
	 */
	@AuthUneedLogin
	@ResponseBody
	@RequestMapping(value="/getXtDataDictionaryList",method={RequestMethod.POST,RequestMethod.GET})
	public List<XtDataDictionary> getXtDataDictionaryList(String ckey){
		return CommonUtils.getXtDataDictionaryCache(ckey);
	}
	/**
	 * 获取字典集合（根据ckey）
	 * @param ckey
	 * @return
	 */
	@AuthUneedLogin
	@ResponseBody
	@RequestMapping(value="/getXtDataDictionary",method={RequestMethod.POST,RequestMethod.GET})
	public List<XtDataDictionary> getXtDataDictionary(String ckey){
		List<XtDataDictionary> list= CommonUtils.getXtDataDictionaryCache(ckey);
		List dictList=new ArrayList<>();
		for(XtDataDictionary dataDict:list){
			Map dict=new HashMap();
			dict.put("value", dataDict.getXt_data_dictionary_value());
			dict.put("text", dataDict.getXt_data_dictionary_name());
			dictList.add(dict);
		}
		return dictList;
	}
	
	
	
	/** 根据数据字典value 获取text */
	@ResponseBody
	@RequestMapping(value="/getDictionaryText",method={RequestMethod.POST,RequestMethod.GET})
	@AuthUneedLogin
	public String getDictionaryText(String ckey,String value ,HttpServletRequest request){
		List<XtDataDictionary> list= CommonUtils.getXtDataDictionaryCache(ckey);
		String text="";
		for(XtDataDictionary datadict:list){
			if(datadict.getXt_data_dictionary_value().equals(value)){
				text=datadict.getXt_data_dictionary_name();				
			}
		}
		return text;
	}
}
