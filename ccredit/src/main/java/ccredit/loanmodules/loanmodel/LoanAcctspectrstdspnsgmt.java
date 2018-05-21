package ccredit.loanmodules.loanmodel;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;
import ccredit.xtmodules.xtcore.util.DateUtils;
import ccredit.util.DictionaryText;

/**
* loan_acctspectrstdspnsgmt 特定交易说明 
* 2018-04-27 16:37:31  yangzhou
*/
public class LoanAcctspectrstdspnsgmt extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	/**编号**/
	private String loan_acctspectrstdspnsgmt_id;
	/**交易个数**/
	private String cagoftrdnm;
	/**交易类型**/
	private String chantrantype;
	/**交易类型**/
	private String chantrantypetext;
	/**交易日期**/
	private Date trandate;
	/**交易日期**/
	private String trandatetext;
	/**交易金额**/
	private String tranamt;
	/**到期日期变更月数**/
	private String duetranmon;
	/**交易明细信息**/
	private String detinfo;
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
	public void setLoan_acctspectrstdspnsgmt_id(String loan_acctspectrstdspnsgmt_id){
		this.loan_acctspectrstdspnsgmt_id=loan_acctspectrstdspnsgmt_id;
	}
	public String getLoan_acctspectrstdspnsgmt_id(){
		return loan_acctspectrstdspnsgmt_id;
	}
	public void setCagoftrdnm(String cagoftrdnm){
		this.cagoftrdnm=cagoftrdnm;
	}
	public String getCagoftrdnm(){
		return cagoftrdnm;
	}
	public void setChantrantypetext( String chantrantypetext) {
		this.chantrantypetext = chantrantypetext;
	}
	public String getChantrantypetext() {
		if(this.chantrantype!=null){
			this.chantrantypetext= DictionaryText.get("CHANTRANTYPECODE", this.chantrantype);
		}
		return this.chantrantypetext;
	}
	public void setChantrantype(String chantrantype){
		this.chantrantype=chantrantype;
	}
	public String getChantrantype(){
		return chantrantype;
	}
	public void setTrandatetext(String trandatetext) {
		this.trandatetext = trandatetext;
	}
	public String getTrandatetext() {
		if(this.trandate!=null){
			this.trandatetext = DateUtils.formatDate(this.trandate);
		}
		return this.trandatetext;
	}
	public void setTrandate(Date trandate){
		this.trandate=trandate;
	}
	public Date getTrandate(){
		return trandate;
	}
	public void setTranamt(String tranamt){
		this.tranamt=tranamt;
	}
	public String getTranamt(){
		return tranamt;
	}
	public void setDuetranmon(String duetranmon){
		this.duetranmon=duetranmon;
	}
	public String getDuetranmon(){
		return duetranmon;
	}
	public void setDetinfo(String detinfo){
		this.detinfo=detinfo;
	}
	public String getDetinfo(){
		return detinfo;
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
