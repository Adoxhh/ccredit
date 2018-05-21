package ccredit.bsmodules.bsmodel;
import ccredit.util.DictionaryText;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import ccredit.xtmodules.xtcore.util.DateUtils;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

/**
* bs_mnmmbinfsgmt 主要组成人员 
* 2018-04-26 11:18:18  mengbeibei
*/
public class BsMnmmbinfsgmt extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	private String bs_mnmmbinfsgmt_id;/**编号**/
	private String mmbnm;/**主要组成人员个数**/
	private String mmbalias;/**组成人员姓名**/
	private String mmbidtype;/**组成人员证件类型**/
	private String mmbidtypetext;/**组成人员证件类型**/
	private String mmbidnum;/**组成人员证件号码**/
	private String mmbpstn;/**组成人员职位**/
	private String mmbpstntext;/**组成人员职位**/
	private Date mnmmbinfoupdate;/**信息更新日期**/
	private String mnmmbinfoupdatetext;/**信息更新日期**/
	private String customid;/**客户号**/
	private Date lastdate;/**最后一次修改日期**/
	private String changeflag;/**状态位**/
	public void setBs_mnmmbinfsgmt_id(String bs_mnmmbinfsgmt_id){
		this.bs_mnmmbinfsgmt_id=bs_mnmmbinfsgmt_id;
	}
	public String getBs_mnmmbinfsgmt_id(){
		return bs_mnmmbinfsgmt_id;
	}
	public void setMmbnm(String mmbnm){
		this.mmbnm=mmbnm;
	}
	public String getMmbnm(){
		return mmbnm;
	}
	public void setMmbalias(String mmbalias){
		this.mmbalias=mmbalias;
	}
	public String getMmbalias(){
		return mmbalias;
	}
	public void setMmbidtype(String mmbidtype){
		this.mmbidtype=mmbidtype;
	}
	public String getMmbidtype(){
		return mmbidtype;
	}
	public void setMmbidnum(String mmbidnum){
		this.mmbidnum=mmbidnum;
	}
	public String getMmbidnum(){
		return mmbidnum;
	}
	public void setMmbpstn(String mmbpstn){
		this.mmbpstn=mmbpstn;
	}
	public String getMmbpstn(){
		return mmbpstn;
	}
	public void setMnmmbinfoupdate(Date mnmmbinfoupdate){
		this.mnmmbinfoupdate=mnmmbinfoupdate;
	}
	public Date getMnmmbinfoupdate(){
		return mnmmbinfoupdate;
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
	
	
	
	public String getMmbidtypetext() {
		if(this.mmbidtype!=null){
			this.mmbidtypetext= DictionaryText.get("IDTYPECODE", this.mmbidtype);
		}
		return this.mmbidtypetext;
	}
	public void setMmbidtypetext(String mmbidtypetext) {
		this.mmbidtypetext = mmbidtypetext;
	}
	public String getMmbpstntext() {
		if(this.mmbpstn!=null){
			this.mmbpstntext= DictionaryText.get("MMBPSTNCODE", this.mmbpstn);
		}
		return this.mmbpstntext;
	}
	public void setMmbpstntext(String mmbpstntext) {
		this.mmbpstntext = mmbpstntext;
	}
	public String getMnmmbinfoupdatetext() {
		if(this.mnmmbinfoupdate!=null){
			this.mnmmbinfoupdatetext = DateUtils.formatDate(this.mnmmbinfoupdate);
		}
		return this.mnmmbinfoupdatetext;
	}
	public void setMnmmbinfoupdatetext(String mnmmbinfoupdatetext) {
		this.mnmmbinfoupdatetext = mnmmbinfoupdatetext;
	}
	
}
