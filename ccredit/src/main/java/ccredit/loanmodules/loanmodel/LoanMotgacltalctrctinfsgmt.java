package ccredit.loanmodules.loanmodel;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;
import ccredit.xtmodules.xtcore.util.DateUtils;
import ccredit.util.DictionaryText;

/**
* loan_motgacltalctrctinfsgmt 抵质押物信息 
* 2018-04-27 16:27:40  yangzhou
*/
public class LoanMotgacltalctrctinfsgmt extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	/**编号**/
	private String loan_motgacltalctrctinfsgmt_id;
	/**抵质押合同个数**/
	private String ccnm;
	/**抵(质)押合同标识码**/
	private String ccc;
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
	public void setLoan_motgacltalctrctinfsgmt_id(String loan_motgacltalctrctinfsgmt_id){
		this.loan_motgacltalctrctinfsgmt_id=loan_motgacltalctrctinfsgmt_id;
	}
	public String getLoan_motgacltalctrctinfsgmt_id(){
		return loan_motgacltalctrctinfsgmt_id;
	}
	public void setCcnm(String ccnm){
		this.ccnm=ccnm;
	}
	public String getCcnm(){
		return ccnm;
	}
	public void setCcc(String ccc){
		this.ccc=ccc;
	}
	public String getCcc(){
		return ccc;
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
