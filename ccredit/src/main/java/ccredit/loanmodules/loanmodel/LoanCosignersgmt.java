package ccredit.loanmodules.loanmodel;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;
import ccredit.xtmodules.xtcore.util.DateUtils;
import ccredit.util.DictionaryText;

/**
* loan_cosignersgmt 联保人信息 
* 2018-04-28 15:18:11  yangzhou
*/
public class LoanCosignersgmt extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	/**编号**/
	private String loan_cosignersgmt_id;
	/**联保人个数**/
	private String cosignersnm;
	/**联保人身份类别**/
	private String cosignerstype;
	/**联保人身份类别**/
	private String cosignerstypetext;
	/**联保人名称**/
	private String cosignersname;
	/**联保人身份标识类型**/
	private String cosignersidtype;
	/**联保人身份标识类型**/
	private String cosignersidtypetext;
	/**联保人身份标识号码**/
	private String cosignersidnum;
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
	public void setLoan_cosignersgmt_id(String loan_cosignersgmt_id){
		this.loan_cosignersgmt_id=loan_cosignersgmt_id;
	}
	public String getLoan_cosignersgmt_id(){
		return loan_cosignersgmt_id;
	}
	public void setCosignersnm(String cosignersnm){
		this.cosignersnm=cosignersnm;
	}
	public String getCosignersnm(){
		return cosignersnm;
	}
	public void setCosignerstypetext( String cosignerstypetext) {
		this.cosignerstypetext = cosignerstypetext;
	}
	public String getCosignerstypetext() {
		if(this.cosignerstype!=null){
			this.cosignerstypetext= DictionaryText.get("ARLPIDTYPECODE", this.cosignerstype);
		}
		return this.cosignerstypetext;
	}
	public void setCosignerstype(String cosignerstype){
		this.cosignerstype=cosignerstype;
	}
	public String getCosignerstype(){
		return cosignerstype;
	}
	public void setCosignersname(String cosignersname){
		this.cosignersname=cosignersname;
	}
	public String getCosignersname(){
		return cosignersname;
	}
	public void setCosignersidtypetext( String cosignersidtypetext) {
		this.cosignersidtypetext = cosignersidtypetext;
	}
	public String getCosignersidtypetext() {
		if(this.cosignersidtype!=null){
			this.cosignersidtypetext= DictionaryText.get("IDTYPECODECODE", this.cosignersidtype);
		}
		return this.cosignersidtypetext;
	}
	public void setCosignersidtype(String cosignersidtype){
		this.cosignersidtype=cosignersidtype;
	}
	public String getCosignersidtype(){
		return cosignersidtype;
	}
	public void setCosignersidnum(String cosignersidnum){
		this.cosignersidnum=cosignersidnum;
	}
	public String getCosignersidnum(){
		return cosignersidnum;
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
