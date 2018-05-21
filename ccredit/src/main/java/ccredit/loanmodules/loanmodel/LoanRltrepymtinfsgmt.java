package ccredit.loanmodules.loanmodel;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;
import ccredit.xtmodules.xtcore.util.DateUtils;
import ccredit.util.DictionaryText;

/**
* loan_rltrepymtinfsgmt 相关还款责任人 
* 2018-04-27 16:25:40  yangzhou
*/
public class LoanRltrepymtinfsgmt extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	/**编号**/
	private String loan_rltrepymtinfsgmt_id;
	/**责任人个数**/
	private String rltrepymtnm;
	/**身份类别**/
	private String arlpidtype;
	/**身份类别**/
	private String arlpidtypetext;
	/**责任人名称**/
	private String arlpname;
	/**责任人身份标识类型**/
	private String arlpcerttype;
	/**责任人身份标识类型**/
	private String arlpcerttypetext;
	/**责任人身份标识号码**/
	private String arlpcertnum;
	/**还款责任人类型**/
	private String arlptype;
	/**还款责任人类型**/
	private String arlptypetext;
	/**还款责任金额**/
	private String arlpamt;
	/**联保标志**/
	private String wartysign;
	/**联保标志**/
	private String wartysigntext;
	/**最高额保证合同标识码**/
	private String maxguarmcc;
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
	public void setLoan_rltrepymtinfsgmt_id(String loan_rltrepymtinfsgmt_id){
		this.loan_rltrepymtinfsgmt_id=loan_rltrepymtinfsgmt_id;
	}
	public String getLoan_rltrepymtinfsgmt_id(){
		return loan_rltrepymtinfsgmt_id;
	}
	public void setRltrepymtnm(String rltrepymtnm){
		this.rltrepymtnm=rltrepymtnm;
	}
	public String getRltrepymtnm(){
		return rltrepymtnm;
	}
	public void setArlpidtypetext( String arlpidtypetext) {
		this.arlpidtypetext = arlpidtypetext;
	}
	public String getArlpidtypetext() {
		if(this.arlpidtype!=null){
			this.arlpidtypetext= DictionaryText.get("ARLPIDTYPECODE", this.arlpidtype);
		}
		return this.arlpidtypetext;
	}
	public void setArlpidtype(String arlpidtype){
		this.arlpidtype=arlpidtype;
	}
	public String getArlpidtype(){
		return arlpidtype;
	}
	public void setArlpname(String arlpname){
		this.arlpname=arlpname;
	}
	public String getArlpname(){
		return arlpname;
	}
	public void setArlpcerttypetext( String arlpcerttypetext) {
		this.arlpcerttypetext = arlpcerttypetext;
	}
	public String getArlpcerttypetext() {
		if(this.arlpcerttype!=null){
			this.arlpcerttypetext= DictionaryText.get("IDTYPECODECODE", this.arlpcerttype);
		}
		return this.arlpcerttypetext;
	}
	public void setArlpcerttype(String arlpcerttype){
		this.arlpcerttype=arlpcerttype;
	}
	public String getArlpcerttype(){
		return arlpcerttype;
	}
	public void setArlpcertnum(String arlpcertnum){
		this.arlpcertnum=arlpcertnum;
	}
	public String getArlpcertnum(){
		return arlpcertnum;
	}
	public void setArlptypetext( String arlptypetext) {
		this.arlptypetext = arlptypetext;
	}
	public String getArlptypetext() {
		if(this.arlptype!=null){
			this.arlptypetext= DictionaryText.get("ARLPTYPECODE", this.arlptype);
		}
		return this.arlptypetext;
	}
	public void setArlptype(String arlptype){
		this.arlptype=arlptype;
	}
	public String getArlptype(){
		return arlptype;
	}
	public void setArlpamt(String arlpamt){
		this.arlpamt=arlpamt;
	}
	public String getArlpamt(){
		return arlpamt;
	}
	public void setWartysigntext( String wartysigntext) {
		this.wartysigntext = wartysigntext;
	}
	public String getWartysigntext() {
		if(this.wartysign!=null){
			this.wartysigntext= DictionaryText.get("WARTYSIGNCODE", this.wartysign);
		}
		return this.wartysigntext;
	}
	public void setWartysign(String wartysign){
		this.wartysign=wartysign;
	}
	public String getWartysign(){
		return wartysign;
	}
	public void setMaxguarmcc(String maxguarmcc){
		this.maxguarmcc=maxguarmcc;
	}
	public String getMaxguarmcc(){
		return maxguarmcc;
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
