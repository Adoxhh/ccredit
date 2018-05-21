package ccredit.xmlmodules.xmlmodel;

import java.io.Serializable;

import ccredit.xtmodules.xtcore.base.BaseEntity;

/**
* xmlsegment xmlsegment 
* 2018-04-08 14:31:32  孟贝贝
*/
public class Xmlsegment extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id;/**编号**/
	private String segmentname;/**信息段名称 **/
	private String segmentcode;/****/
	private String tablename;/****/
	private String templateid;/**模板编号**/
	private String property;/**属性**/
	private int sortno;/****/
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return id;
	}
	public void setSegmentname(String segmentname){
		this.segmentname=segmentname;
	}
	public String getSegmentname(){
		return segmentname;
	}
	public void setSegmentcode(String segmentcode){
		this.segmentcode=segmentcode;
	}
	public String getSegmentcode(){
		return segmentcode;
	}
	public void setTablename(String tablename){
		this.tablename=tablename;
	}
	public String getTablename(){
		return tablename;
	}
	public void setTemplateid(String templateid){
		this.templateid=templateid;
	}
	public String getTemplateid(){
		return templateid;
	}
	public void setProperty(String property){
		this.property=property;
	}
	public String getProperty(){
		return property;
	}
	public void setSortno(int sortno){
		this.sortno=sortno;
	}
	public int getSortno(){
		return sortno;
	}
}
