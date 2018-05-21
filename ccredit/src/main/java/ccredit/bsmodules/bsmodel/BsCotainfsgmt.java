package ccredit.bsmodules.bsmodel;
import ccredit.util.DictionaryText;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import ccredit.xtmodules.xtcore.util.DateUtils;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

/**
* bs_cotainfsgmt 联系方式 
* 2018-04-26 14:44:28  mengbeibei
*/
public class BsCotainfsgmt extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	private String bs_cotainfsgmt_id;/**编号**/
	private String conadddistrictcode;/**联系地址行政区划代码**/
	private String conadddistrictcodetext;/**联系地址行政区划代码**/
	private String conadd;/**联系地址**/
	private String conphone;/**联系电话**/
	private String finconphone;/**财务部门联系电话**/
	private Date cotainfoupdate;/**信息更新日期**/
	private String cotainfoupdatetext;/**信息更新日期**/
	private String customid;/**客户号**/
	private Date lastdate;/**最后一次修改日期**/
	private String changeflag;/**状态位**/
	public void setBs_cotainfsgmt_id(String bs_cotainfsgmt_id){
		this.bs_cotainfsgmt_id=bs_cotainfsgmt_id;
	}
	public String getBs_cotainfsgmt_id(){
		return bs_cotainfsgmt_id;
	}
	public void setConadddistrictcode(String conadddistrictcode){
		this.conadddistrictcode=conadddistrictcode;
	}
	public String getConadddistrictcode(){
		return conadddistrictcode;
	}
	public void setConadd(String conadd){
		this.conadd=conadd;
	}
	public String getConadd(){
		return conadd;
	}
	public void setConphone(String conphone){
		this.conphone=conphone;
	}
	public String getConphone(){
		return conphone;
	}
	public void setFinconphone(String finconphone){
		this.finconphone=finconphone;
	}
	public String getFinconphone(){
		return finconphone;
	}
	public void setCotainfoupdate(Date cotainfoupdate){
		this.cotainfoupdate=cotainfoupdate;
	}
	public Date getCotainfoupdate(){
		return cotainfoupdate;
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
	
	
	public String getConadddistrictcodetext() {
		if(this.conadddistrictcode!=null){
			this.conadddistrictcodetext= DictionaryText.get("ADMDIVOFREGCODE", this.conadddistrictcode);
		}
		return this.conadddistrictcodetext;
	}
	public void setConadddistrictcodetext(String conadddistrictcodetext) {
		this.conadddistrictcodetext = conadddistrictcodetext;
	}
	public String getCotainfoupdatetext() {
		if(this.cotainfoupdate!=null){
			this.cotainfoupdatetext = DateUtils.formatDate(this.cotainfoupdate);
		}
		return this.cotainfoupdatetext;
	}
	public void setCotainfoupdatetext(String cotainfoupdatetext) {
		this.cotainfoupdatetext = cotainfoupdatetext;
	}
}
