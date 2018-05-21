package ccredit.loanmodules.loanmodel;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;
import ccredit.xtmodules.xtcore.util.DateUtils;
import ccredit.util.DictionaryText;

/**
* loan_actlbltyinfsgmt 还款表现信息 
* 2018-04-27 16:35:45  yangzhou
*/
public class LoanActlbltyinfsgmt extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	/**编号**/
	private String loan_actlbltyinfsgmt_id;
	/**账户状态**/
	private String acctstatus;
	/**账户状态**/
	private String acctstatustext;
	/**余额**/
	private String acctbal;
	/**余额变化日期**/
	private Date balchgdate;
	/**余额变化日期**/
	private String balchgdatetext;
	/**五级分类**/
	private String fivecate;
	/**五级分类**/
	private String fivecatetext;
	/**五级分类认定日期**/
	private Date fivecateadjdate;
	/**五级分类认定日期**/
	private String fivecateadjdatetext;
	/**剩余还款月数**/
	private String pymtprd;
	/**当前逾期总额**/
	private String totoverd;
	/**当前逾期本金**/
	private String overdprinc;
	/**当前逾期天数**/
	private String overddy;
	/**最近一次实际还款日期**/
	private Date latrpydate;
	/**最近一次实际还款日期**/
	private String latrpydatetext;
	/**最近一次实际还款金额**/
	private String latrpyamt;
	/**最近一次实际归还本金**/
	private String latrpypri;
	/**还款形式**/
	private String rpmttype;
	/**还款形式**/
	private String rpmttypetext;
	/**最近一次约定还款日**/
	private Date latagrrrpydate;
	/**最近一次约定还款日**/
	private String latagrrrpydatetext;
	/**最近一次约定还款金额**/
	private String latagrrrpyamt;
	/**下一次约定还款日期**/
	private Date nxtagrrrpydate;
	/**下一次约定还款日期**/
	private String nxtagrrrpydatetext;
	/**账户关闭日期**/
	private Date closedate;
	/**账户关闭日期**/
	private String closedatetext;
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
	public void setLoan_actlbltyinfsgmt_id(String loan_actlbltyinfsgmt_id){
		this.loan_actlbltyinfsgmt_id=loan_actlbltyinfsgmt_id;
	}
	public String getLoan_actlbltyinfsgmt_id(){
		return loan_actlbltyinfsgmt_id;
	}
	public void setAcctstatustext( String acctstatustext) {
		this.acctstatustext = acctstatustext;
	}
	public String getAcctstatustext() {
		if(this.acctstatus!=null){
			this.acctstatustext= DictionaryText.get("ACCTSTATUSCODE", this.acctstatus);
		}
		return this.acctstatustext;
	}
	public void setAcctstatus(String acctstatus){
		this.acctstatus=acctstatus;
	}
	public String getAcctstatus(){
		return acctstatus;
	}
	public void setAcctbal(String acctbal){
		this.acctbal=acctbal;
	}
	public String getAcctbal(){
		return acctbal;
	}
	public void setBalchgdatetext(String balchgdatetext) {
		this.balchgdatetext = balchgdatetext;
	}
	public String getBalchgdatetext() {
		if(this.balchgdate!=null){
			this.balchgdatetext = DateUtils.formatDate(this.balchgdate);
		}
		return this.balchgdatetext;
	}
	public void setBalchgdate(Date balchgdate){
		this.balchgdate=balchgdate;
	}
	public Date getBalchgdate(){
		return balchgdate;
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
	public void setPymtprd(String pymtprd){
		this.pymtprd=pymtprd;
	}
	public String getPymtprd(){
		return pymtprd;
	}
	public void setTotoverd(String totoverd){
		this.totoverd=totoverd;
	}
	public String getTotoverd(){
		return totoverd;
	}
	public void setOverdprinc(String overdprinc){
		this.overdprinc=overdprinc;
	}
	public String getOverdprinc(){
		return overdprinc;
	}
	public void setOverddy(String overddy){
		this.overddy=overddy;
	}
	public String getOverddy(){
		return overddy;
	}
	public void setLatrpydatetext(String latrpydatetext) {
		this.latrpydatetext = latrpydatetext;
	}
	public String getLatrpydatetext() {
		if(this.latrpydate!=null){
			this.latrpydatetext = DateUtils.formatDate(this.latrpydate);
		}
		return this.latrpydatetext;
	}
	public void setLatrpydate(Date latrpydate){
		this.latrpydate=latrpydate;
	}
	public Date getLatrpydate(){
		return latrpydate;
	}
	public void setLatrpyamt(String latrpyamt){
		this.latrpyamt=latrpyamt;
	}
	public String getLatrpyamt(){
		return latrpyamt;
	}
	public void setLatrpypri(String latrpypri){
		this.latrpypri=latrpypri;
	}
	public String getLatrpypri(){
		return latrpypri;
	}
	public void setRpmttypetext( String rpmttypetext) {
		this.rpmttypetext = rpmttypetext;
	}
	public String getRpmttypetext() {
		if(this.rpmttype!=null){
			this.rpmttypetext= DictionaryText.get("RPMTTYPECODE", this.rpmttype);
		}
		return this.rpmttypetext;
	}
	public void setRpmttype(String rpmttype){
		this.rpmttype=rpmttype;
	}
	public String getRpmttype(){
		return rpmttype;
	}
	public void setLatagrrrpydatetext(String latagrrrpydatetext) {
		this.latagrrrpydatetext = latagrrrpydatetext;
	}
	public String getLatagrrrpydatetext() {
		if(this.latagrrrpydate!=null){
			this.latagrrrpydatetext = DateUtils.formatDate(this.latagrrrpydate);
		}
		return this.latagrrrpydatetext;
	}
	public void setLatagrrrpydate(Date latagrrrpydate){
		this.latagrrrpydate=latagrrrpydate;
	}
	public Date getLatagrrrpydate(){
		return latagrrrpydate;
	}
	public void setLatagrrrpyamt(String latagrrrpyamt){
		this.latagrrrpyamt=latagrrrpyamt;
	}
	public String getLatagrrrpyamt(){
		return latagrrrpyamt;
	}
	public void setNxtagrrrpydatetext(String nxtagrrrpydatetext) {
		this.nxtagrrrpydatetext = nxtagrrrpydatetext;
	}
	public String getNxtagrrrpydatetext() {
		if(this.nxtagrrrpydate!=null){
			this.nxtagrrrpydatetext = DateUtils.formatDate(this.nxtagrrrpydate);
		}
		return this.nxtagrrrpydatetext;
	}
	public void setNxtagrrrpydate(Date nxtagrrrpydate){
		this.nxtagrrrpydate=nxtagrrrpydate;
	}
	public Date getNxtagrrrpydate(){
		return nxtagrrrpydate;
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
