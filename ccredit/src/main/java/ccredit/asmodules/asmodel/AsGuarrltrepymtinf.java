package ccredit.asmodules.asmodel;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;
import ccredit.xtmodules.xtcore.util.DateUtils;
import ccredit.util.DictionaryText;

/**
* as_guarrltrepymtinf 企业担保账户在保责任信息段 
* 2018-04-28 15:46:18  mengbeibei
*/
public class AsGuarrltrepymtinf extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	/**主键**/
	private String guarrltrepymtinf_id;
	/**借据号**/
	private String serialno;
	/**客户号**/
	private String customid;
	/**账户状态**/
	private String acctstatus;
	/**账户状态**/
	private String acctstatustext;
	/**在保余额**/
	private String loanamt;
	/**余额变化日期**/
	private Date repayprd;
	/**余额变化日期**/
	private String repayprdtext;
	/**五级分类**/
	private String fivecate;
	/**五级分类**/
	private String fivecatetext;
	/**五级分类认定日期**/
	private Date fivecateadjdate;
	/**五级分类认定日期**/
	private String fivecateadjdatetext;
	/**风险敞口**/
	private String riex;
	/**代偿（垫款）标识**/
	private String compadvflag;
	/**代偿（垫款）标识**/
	private String compadvflagtext;
	/**账户关闭日期**/
	private Date closedate;
	/**账户关闭日期**/
	private String closedatetext;
	/**最后一次修改日期**/
	private Date lastdate;
	/**最后一次修改日期**/
	private String lastdatetext;
	/**状态位**/
	private String changeflag;
	/**状态位**/
	private String changeflagtext;
	public void setGuarrltrepymtinf_id(String guarrltrepymtinf_id){
		this.guarrltrepymtinf_id=guarrltrepymtinf_id;
	}
	public String getGuarrltrepymtinf_id(){
		return guarrltrepymtinf_id;
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
	public void setAcctstatustext( String acctstatustext) {
		this.acctstatustext = acctstatustext;
	}
	public String getAcctstatustext() {
		if(this.acctstatus!=null){
			this.acctstatustext= DictionaryText.get("ASACCTSTATUSCODE", this.acctstatus);
		}
		return this.acctstatustext;
	}
	public void setAcctstatus(String acctstatus){
		this.acctstatus=acctstatus;
	}
	public String getAcctstatus(){
		return acctstatus;
	}
	public void setLoanamt(String loanamt){
		this.loanamt=loanamt;
	}
	public String getLoanamt(){
		return loanamt;
	}
	public void setRepayprdtext(String repayprdtext) {
		this.repayprdtext = repayprdtext;
	}
	public String getRepayprdtext() {
		if(this.repayprd!=null){
			this.repayprdtext = DateUtils.formatDate(this.repayprd);
		}
		return this.repayprdtext;
	}
	public void setRepayprd(Date repayprd){
		this.repayprd=repayprd;
	}
	public Date getRepayprd(){
		return repayprd;
	}
	public void setFivecatetext( String fivecatetext) {
		this.fivecatetext = fivecatetext;
	}
	public String getFivecatetext() {
		if(this.fivecate!=null){
			this.fivecatetext= DictionaryText.get("FIVECATECODE", this.fivecate);
		}
		return this.fivecatetext;
	}
	public void setFivecate(String fivecate){
		this.fivecate=fivecate;
	}
	public String getFivecate(){
		return fivecate;
	}
	public void setFivecateadjdatetext(String fivecateadjdatetext) {
		this.fivecateadjdatetext = fivecateadjdatetext;
	}
	public String getFivecateadjdatetext() {
		if(this.fivecateadjdate!=null){
			this.fivecateadjdatetext = DateUtils.formatDate(this.fivecateadjdate);
		}
		return this.fivecateadjdatetext;
	}
	public void setFivecateadjdate(Date fivecateadjdate){
		this.fivecateadjdate=fivecateadjdate;
	}
	public Date getFivecateadjdate(){
		return fivecateadjdate;
	}
	public void setRiex(String riex){
		this.riex=riex;
	}
	public String getRiex(){
		return riex;
	}
	public void setCompadvflagtext( String compadvflagtext) {
		this.compadvflagtext = compadvflagtext;
	}
	public String getCompadvflagtext() {
		if(this.compadvflag!=null){
			this.compadvflagtext= DictionaryText.get("LIMLOOPFLGCODE", this.compadvflag);
		}
		return this.compadvflagtext;
	}
	public void setCompadvflag(String compadvflag){
		this.compadvflag=compadvflag;
	}
	public String getCompadvflag(){
		return compadvflag;
	}
	public void setClosedatetext(String closedatetext) {
		this.closedatetext = closedatetext;
	}
	public String getClosedatetext() {
		if(this.closedate!=null){
			this.closedatetext = DateUtils.formatDate(this.closedate);
		}
		return this.closedatetext;
	}
	public void setClosedate(Date closedate){
		this.closedate=closedate;
	}
	public Date getClosedate(){
		return closedate;
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
