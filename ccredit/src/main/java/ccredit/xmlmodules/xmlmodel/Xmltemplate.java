package ccredit.xmlmodules.xmlmodel;

import java.io.Serializable;
import java.util.Date;

import ccredit.xtmodules.xtcore.base.BaseEntity;

/**
* xmltemplate xmltemplate 
* 2018-04-08 14:29:28  孟贝贝
*/
public class Xmltemplate extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id;/**编号**/
	private String templatename;/**模板名称**/
	private String templatecode;/**模板code**/
	private String bigtypecode;/**大类**/
	private String middletypecode;/**中类**/
	private String infreptype;/**信息记录类型**/
	private String rptdatecode;/**报告时点说明**/
	private String status;/**状态**/
	private String description;/**描述**/
	private String tag;/****/
	private Date createtime;/****/
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return id;
	}
	
	public String getTemplatename() {
		return templatename;
	}
	public void setTemplatename(String templatename) {
		this.templatename = templatename;
	}
	public void setTemplatecode(String templatecode){
		this.templatecode=templatecode;
	}
	public String getTemplatecode(){
		return templatecode;
	}
	public void setBigtypecode(String bigtypecode){
		this.bigtypecode=bigtypecode;
	}
	public String getBigtypecode(){
		return bigtypecode;
	}
	public void setMiddletypecode(String middletypecode){
		this.middletypecode=middletypecode;
	}
	public String getMiddletypecode(){
		return middletypecode;
	}
	public void setInfreptype(String infreptype){
		this.infreptype=infreptype;
	}
	public String getInfreptype(){
		return infreptype;
	}
	public void setRptdatecode(String rptdatecode){
		this.rptdatecode=rptdatecode;
	}
	public String getRptdatecode(){
		return rptdatecode;
	}
	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return status;
	}
	public void setDescription(String description){
		this.description=description;
	}
	public String getDescription(){
		return description;
	}
	public void setTag(String tag){
		this.tag=tag;
	}
	public String getTag(){
		return tag;
	}
	public void setCreatetime(Date createtime){
		this.createtime=createtime;
	}
	public Date getCreatetime(){
		return createtime;
	}
}
