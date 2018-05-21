package ccredit.loanmodules.loanmodel;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;
import ccredit.xtmodules.xtcore.util.DateUtils;
import ccredit.util.DictionaryText;

/**
* loan_creditlimsgmt 授信额度信息 
* 2018-04-28 11:05:34  yangzhou
*/
public class LoanCreditlimsgmt extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	/**编号**/
	private String loan_creditlimsgmt_id;
	/**授信额度类型**/
	private String creditlimtype;
	/**授信额度类型**/
	private String creditlimtypetext;
	/**额度循环标志**/
	private String limloopflg;
	/**额度循环标志**/
	private String limloopflgtext;
	/**授信额度**/
	private String creditlim;
	/**币种**/
	private String cy;
	/**币种**/
	private String cytext;
	/**额度生效日期**/
	private Date coneffdate;
	/**额度生效日期**/
	private String coneffdatetext;
	/**额度到期日期**/
	private Date conexpdate;
	/**额度到期日期**/
	private String conexpdatetext;
	/**额度状态**/
	private String constatus;
	/**额度状态**/
	private String constatustext;
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
	public void setLoan_creditlimsgmt_id(String loan_creditlimsgmt_id){
		this.loan_creditlimsgmt_id=loan_creditlimsgmt_id;
	}
	public String getLoan_creditlimsgmt_id(){
		return loan_creditlimsgmt_id;
	}
	public void setCreditlimtypetext( String creditlimtypetext) {
		this.creditlimtypetext = creditlimtypetext;
	}
	public String getCreditlimtypetext() {
		if(this.creditlimtype!=null){
			this.creditlimtypetext= DictionaryText.get("CREDITLIMTYPECODE", this.creditlimtype);
		}
		return this.creditlimtypetext;
	}
	public void setCreditlimtype(String creditlimtype){
		this.creditlimtype=creditlimtype;
	}
	public String getCreditlimtype(){
		return creditlimtype;
	}
	public void setLimloopflgtext( String limloopflgtext) {
		this.limloopflgtext = limloopflgtext;
	}
	public String getLimloopflgtext() {
		if(this.limloopflg!=null){
			this.limloopflgtext= DictionaryText.get("LIMLOOPFLGCODE", this.limloopflg);
		}
		return this.limloopflgtext;
	}
	public void setLimloopflg(String limloopflg){
		this.limloopflg=limloopflg;
	}
	public String getLimloopflg(){
		return limloopflg;
	}
	public void setCreditlim(String creditlim){
		this.creditlim=creditlim;
	}
	public String getCreditlim(){
		return creditlim;
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
	public void setConeffdatetext(String coneffdatetext) {
		this.coneffdatetext = coneffdatetext;
	}
	public String getConeffdatetext() {
		if(this.coneffdate!=null){
			this.coneffdatetext = DateUtils.formatDate(this.coneffdate);
		}
		return this.coneffdatetext;
	}
	public void setConeffdate(Date coneffdate){
		this.coneffdate=coneffdate;
	}
	public Date getConeffdate(){
		return coneffdate;
	}
	public void setConexpdatetext(String conexpdatetext) {
		this.conexpdatetext = conexpdatetext;
	}
	public String getConexpdatetext() {
		if(this.conexpdate!=null){
			this.conexpdatetext = DateUtils.formatDate(this.conexpdate);
		}
		return this.conexpdatetext;
	}
	public void setConexpdate(Date conexpdate){
		this.conexpdate=conexpdate;
	}
	public Date getConexpdate(){
		return conexpdate;
	}
	public void setConstatustext( String constatustext) {
		this.constatustext = constatustext;
	}
	public String getConstatustext() {
		if(this.constatus!=null){
			this.constatustext= DictionaryText.get("CONSTATUSCODE", this.constatus);
		}
		return this.constatustext;
	}
	public void setConstatus(String constatus){
		this.constatus=constatus;
	}
	public String getConstatus(){
		return constatus;
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
