package ccredit.xmlmodules.xmlmodel;

import java.io.Serializable;

import ccredit.xtmodules.xtcore.base.BaseEntity;

/**
* xmlnode xmlnode 
* 2018-04-08 14:33:21  孟贝贝
*/
public class Xmlnode extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id;/****/
	private String nodeid;/**编号**/
	private String parentid;/**父节点编号**/
	private String nodename;/**节点名称**/
	private String nodecode;/**节点码**/
	private int sortno;/**排序**/
	private String segmentid;/**信息段编号**/
	private String remark;/**备注**/
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return id;
	}
	public void setNodeid(String nodeid){
		this.nodeid=nodeid;
	}
	public String getNodeid(){
		return nodeid;
	}
	public void setParentid(String parentid){
		this.parentid=parentid;
	}
	public String getParentid(){
		return parentid;
	}
	public void setNodename(String nodename){
		this.nodename=nodename;
	}
	public String getNodename(){
		return nodename;
	}
	public void setNodecode(String nodecode){
		this.nodecode=nodecode;
	}
	public String getNodecode(){
		return nodecode;
	}
	public void setSortno(int sortno){
		this.sortno=sortno;
	}
	public int getSortno(){
		return sortno;
	}
	public void setSegmentid(String segmentid){
		this.segmentid=segmentid;
	}
	public String getSegmentid(){
		return segmentid;
	}
	public void setRemark(String remark){
		this.remark=remark;
	}
	public String getRemark(){
		return remark;
	}
}
