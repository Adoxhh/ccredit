package ccredit.bsmodules.bsmodel;
import ccredit.util.DictionaryText;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import ccredit.xtmodules.xtcore.util.DateUtils;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

/**
* bs_spvsgathrtyinfsgmt 上级机构 
* 2018-04-26 14:42:34  mengbeibei
*/
public class BsSpvsgathrtyinfsgmt extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	private String bs_spvsgathrtyinfsgmt_id;/**编号**/
	private String suporgtype;/**上级机构类型**/
	private String suporgtypetext;/**上级机构类型**/
	private String suporgname;/**上级机构名称**/
	private String suporgcerttype;/**上级机构身份标识类型**/
	private String suporgcerttypetext;/**上级机构身份标识类型**/
	private String suporgcertnum;/**上级机构身份标识号码**/
	private Date suporginfoupdate;/**信息更新日期**/
	private String suporginfoupdatetext;/**信息更新日期**/
	private String customid;/**客户号**/
	private Date lastdate;/**最后一次修改日期**/
	private String changeflag;/**状态位**/
	
	
	public void setBs_spvsgathrtyinfsgmt_id(String bs_spvsgathrtyinfsgmt_id){
		this.bs_spvsgathrtyinfsgmt_id=bs_spvsgathrtyinfsgmt_id;
	}
	public String getBs_spvsgathrtyinfsgmt_id(){
		return bs_spvsgathrtyinfsgmt_id;
	}
	public void setSuporgtype(String suporgtype){
		this.suporgtype=suporgtype;
	}
	public String getSuporgtype(){
		return suporgtype;
	}
	public void setSuporgname(String suporgname){
		this.suporgname=suporgname;
	}
	public String getSuporgname(){
		return suporgname;
	}
	public void setSuporgcerttype(String suporgcerttype){
		this.suporgcerttype=suporgcerttype;
	}
	public String getSuporgcerttype(){
		return suporgcerttype;
	}
	public void setSuporgcertnum(String suporgcertnum){
		this.suporgcertnum=suporgcertnum;
	}
	public String getSuporgcertnum(){
		return suporgcertnum;
	}
	public void setSuporginfoupdate(Date suporginfoupdate){
		this.suporginfoupdate=suporginfoupdate;
	}
	public Date getSuporginfoupdate(){
		return suporginfoupdate;
	}
	public void setCustomid(String customid){
		this.customid=customid;
	}
	public String getCustomid(){
		return customid;
	}
	public void setLastdate(Date lastdate){
		this.lastdate=lastdate;
	}
	public Date getLastdate(){
		return lastdate;
	}
	public void setChangeflag(String changeflag){
		this.changeflag=changeflag;
	}
	public String getChangeflag(){
		return changeflag;
	}
	
	
	public String getSuporgtypetext() {
		if(this.suporgtype!=null){
			this.suporgtypetext= DictionaryText.get("SUPORGTYPECODE", this.suporgtype);
		}
		return this.suporgtypetext;
	}
	public void setSuporgtypetext(String suporgtypetext) {
		this.suporgtypetext = suporgtypetext;
	}
	public String getSuporgcerttypetext() {
		if(this.suporgcerttype!=null){
			this.suporgcerttypetext= DictionaryText.get("OTHENTCERTTYPECODE", this.suporgcerttype);
		}
		return this.suporgcerttypetext;
	}
	public void setSuporgcerttypetext(String suporgcerttypetext) {
		this.suporgcerttypetext = suporgcerttypetext;
	}
	public String getSuporginfoupdatetext() {
		if(this.suporginfoupdate!=null){
			this.suporginfoupdatetext = DateUtils.formatDate(this.suporginfoupdate);
		}
		return this.suporginfoupdatetext;
	}
	public void setSuporginfoupdatetext(String suporginfoupdatetext) {
		this.suporginfoupdatetext = suporginfoupdatetext;
	}
	
	
	
}
