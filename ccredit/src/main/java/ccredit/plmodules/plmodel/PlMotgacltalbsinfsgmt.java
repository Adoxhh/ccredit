package ccredit.plmodules.plmodel;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;
import ccredit.xtmodules.xtcore.util.DateUtils;
import ccredit.util.DictionaryText;

/**
* pl_motgacltalbsinfsgmt 抵（质）押合同基本信息段 
* 2018-04-28 16:59:38  yangzhou
*/
public class PlMotgacltalbsinfsgmt extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	/**编号**/
	private String pl_motgacltalbsinfsgmt_id;
	/**合同类型**/
	private String guartype;
	/**合同类型**/
	private String guartypetext;
	/**担保金额**/
	private String ccamt;
	/**币种**/
	private String cy;
	/**币种**/
	private String cytext;
	/**抵（质）押合同生效日期**/
	private Date ccvaldate;
	/**抵（质）押合同生效日期**/
	private String ccvaldatetext;
	/**抵（质）押合同到期日期**/
	private Date ccexpdate;
	/**抵（质）押合同到期日期**/
	private String ccexpdatetext;
	/**最高额担保标志**/
	private String maxguar;
	/**最高额担保标志**/
	private String maxguartext;
	/**抵（质）押合同状态**/
	private String ccstatus;
	/**抵（质）押合同状态**/
	private String ccstatustext;
	/**借据号**/
	private String serialno;
	/**客户号**/
	private String customid;
	/**最后一次修改日期**/
	private Date lastdate;
	/**最后一次修改日期**/
	private String lastdatetext;
	/**状态位**/
	private String changeflag;
	/**状态位**/
	private String changeflagtext;
	public void setPl_motgacltalbsinfsgmt_id(String pl_motgacltalbsinfsgmt_id){
		this.pl_motgacltalbsinfsgmt_id=pl_motgacltalbsinfsgmt_id;
	}
	public String getPl_motgacltalbsinfsgmt_id(){
		return pl_motgacltalbsinfsgmt_id;
	}
	public void setGuartypetext( String guartypetext) {
		this.guartypetext = guartypetext;
	}
	public String getGuartypetext() {
		if(this.guartype!=null){
			this.guartypetext= DictionaryText.get("GUARTYPECODE", this.guartype);
		}
		return this.guartypetext;
	}
	public void setGuartype(String guartype){
		this.guartype=guartype;
	}
	public String getGuartype(){
		return guartype;
	}
	public void setCcamt(String ccamt){
		this.ccamt=ccamt;
	}
	public String getCcamt(){
		return ccamt;
	}
	public void setCytext( String cytext) {
		this.cytext = cytext;
	}
	public String getCytext() {
		if(this.cy!=null){
			this.cytext= DictionaryText.get("CYCODE", this.cy);
		}
		return this.cytext;
	}
	public void setCy(String cy){
		this.cy=cy;
	}
	public String getCy(){
		return cy;
	}
	public void setCcvaldatetext(String ccvaldatetext) {
		this.ccvaldatetext = ccvaldatetext;
	}
	public String getCcvaldatetext() {
		if(this.ccvaldate!=null){
			this.ccvaldatetext = DateUtils.formatDate(this.ccvaldate);
		}
		return this.ccvaldatetext;
	}
	public void setCcvaldate(Date ccvaldate){
		this.ccvaldate=ccvaldate;
	}
	public Date getCcvaldate(){
		return ccvaldate;
	}
	public void setCcexpdatetext(String ccexpdatetext) {
		this.ccexpdatetext = ccexpdatetext;
	}
	public String getCcexpdatetext() {
		if(this.ccexpdate!=null){
			this.ccexpdatetext = DateUtils.formatDate(this.ccexpdate);
		}
		return this.ccexpdatetext;
	}
	public void setCcexpdate(Date ccexpdate){
		this.ccexpdate=ccexpdate;
	}
	public Date getCcexpdate(){
		return ccexpdate;
	}
	public void setMaxguartext( String maxguartext) {
		this.maxguartext = maxguartext;
	}
	public String getMaxguartext() {
		if(this.maxguar!=null){
			this.maxguartext= DictionaryText.get("LIMLOOPFLGCODE", this.maxguar);
		}
		return this.maxguartext;
	}
	public void setMaxguar(String maxguar){
		this.maxguar=maxguar;
	}
	public String getMaxguar(){
		return maxguar;
	}
	public void setCcstatustext( String ccstatustext) {
		this.ccstatustext = ccstatustext;
	}
	public String getCcstatustext() {
		if(this.ccstatus!=null){
			this.ccstatustext= DictionaryText.get("CONSTATUSCODE", this.ccstatus);
		}
		return this.ccstatustext;
	}
	public void setCcstatus(String ccstatus){
		this.ccstatus=ccstatus;
	}
	public String getCcstatus(){
		return ccstatus;
	}
	public void setSerialno(String serialno){
		this.serialno=serialno;
	}
	public String getSerialno(){
		return serialno;
	}
	public void setCustomid(String customid){
		this.customid=customid;
	}
	public String getCustomid(){
		return customid;
	}
	public void setLastdatetext(String lastdatetext) {
		this.lastdatetext = lastdatetext;
	}
	public String getLastdatetext() {
		if(this.lastdate!=null){
			this.lastdatetext = DateUtils.formatDate(this.lastdate);
		}
		return this.lastdatetext;
	}
	public void setLastdate(Date lastdate){
		this.lastdate=lastdate;
	}
	public Date getLastdate(){
		return lastdate;
	}
	public void setChangeflagtext( String changeflagtext) {
		this.changeflagtext = changeflagtext;
	}
	public String getChangeflagtext() {
		if(this.changeflag!=null){
			this.changeflagtext= DictionaryText.get("CHANGEFLAGCODE", this.changeflag);
		}
		return this.changeflagtext;
	}
	public void setChangeflag(String changeflag){
		this.changeflag=changeflag;
	}
	public String getChangeflag(){
		return changeflag;
	}
}
