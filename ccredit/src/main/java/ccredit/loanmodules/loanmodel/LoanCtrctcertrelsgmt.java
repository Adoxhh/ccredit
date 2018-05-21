package ccredit.loanmodules.loanmodel;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;
import ccredit.xtmodules.xtcore.util.DateUtils;
import ccredit.util.DictionaryText;

/**
* loan_ctrctcertrelsgmt 共同受信人信息 
* 2018-04-28 11:02:26  yangzhou
*/
public class LoanCtrctcertrelsgmt extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	/**编号**/
	private String loan_ctrctcertrelsgmt_id;
	/**共同受信人个数**/
	private String brernm;
	/**共同受信人身份类别**/
	private String brertype;
	/**共同受信人身份类别**/
	private String brertypetext;
	/**共同受信人名称**/
	private String certrelname;
	/**共同受信人身份标识类型**/
	private String certrelidtype;
	/**共同受信人身份标识类型**/
	private String certrelidtypetext;
	/**共同受信人身份标识号码**/
	private String certrelidnum;
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
	public void setLoan_ctrctcertrelsgmt_id(String loan_ctrctcertrelsgmt_id){
		this.loan_ctrctcertrelsgmt_id=loan_ctrctcertrelsgmt_id;
	}
	public String getLoan_ctrctcertrelsgmt_id(){
		return loan_ctrctcertrelsgmt_id;
	}
	public void setBrernm(String brernm){
		this.brernm=brernm;
	}
	public String getBrernm(){
		return brernm;
	}
	public void setBrertypetext( String brertypetext) {
		this.brertypetext = brertypetext;
	}
	public String getBrertypetext() {
		if(this.brertype!=null){
			this.brertypetext= DictionaryText.get("ARLPIDTYPECODE", this.brertype);
		}
		return this.brertypetext;
	}
	public void setBrertype(String brertype){
		this.brertype=brertype;
	}
	public String getBrertype(){
		return brertype;
	}
	public void setCertrelname(String certrelname){
		this.certrelname=certrelname;
	}
	public String getCertrelname(){
		return certrelname;
	}
	public void setCertrelidtypetext( String certrelidtypetext) {
		this.certrelidtypetext = certrelidtypetext;
	}
	public String getCertrelidtypetext() {
		if(this.certrelidtype!=null){
			this.certrelidtypetext= DictionaryText.get("IDTYPECODECODE", this.certrelidtype);
		}
		return this.certrelidtypetext;
	}
	public void setCertrelidtype(String certrelidtype){
		this.certrelidtype=certrelidtype;
	}
	public String getCertrelidtype(){
		return certrelidtype;
	}
	public void setCertrelidnum(String certrelidnum){
		this.certrelidnum=certrelidnum;
	}
	public String getCertrelidnum(){
		return certrelidnum;
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
