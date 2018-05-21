package ccredit.loanmodules.loanmodel;
import ccredit.util.DictionaryText;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import ccredit.xtmodules.xtcore.util.DateUtils;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

/**
* loan_acctbssgmt 企业借贷信息基础段 
* 2018-04-26 14:53:04  yangzhou
*/
public class LoanAcctbssgmt extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	private String loan_acctbssgmt_id;/**编号**/
	private String infrectype;/**信息记录类型**/
	private String infrectypetext;/**信息记录类型**/
	private String acctcode;/**账户标识码**/
	private String accttype;/**账户类型**/
	private String accttypetext;/**账户类型**/
	private Date rptdate;/**信息报告日期**/
	private String rptdatetext;/**信息报告日期**/
	private String rptdatecode;/**报告时点说明代码**/
	private String rptdatecodetext;/**报告时点说明代码**/
	private String name;/**借款人名称**/
	private String idtype;/**借款人身份标识类型**/
	private String idtypetext;/**借款人身份标识类型**/
	private String idnum;/**借款人身份标识号码**/
	private String mngmtorgcode;/**业务管理机构代码**/
	private String serialno;/**借据号**/
	private String customid;/**客户号**/
	private Date lastdate;/**最后一次修改日期**/
	private String lastdatetext;/**最后一次修改日期**/
	private String changeflag;/**状态位**/
	private String changeflagtext;/**状态位**/
	
	
	public void setLoan_acctbssgmt_id(String loan_acctbssgmt_id){
		this.loan_acctbssgmt_id=loan_acctbssgmt_id;
	}
	public String getInfrectypetext() {
		if(this.infrectype!=null){
			this.infrectypetext= DictionaryText.get("INFRECTYPECODE", this.infrectype);
		}
		return this.infrectypetext;
	}
	public void setInfrectypetext(String infrectypetext) {
		this.infrectypetext = infrectypetext;
	}
	public String getLastdatetext() {
		if(this.lastdate!=null){
			this.lastdatetext = DateUtils.formatDate(this.lastdate);
		}
		return this.lastdatetext;
	}
	public void setLastdatetext(String lastdatetext) {
		this.lastdatetext = lastdatetext;
	}
	public String getChangeflagtext() {
		if(this.changeflag!=null){
			this.changeflagtext = DictionaryText.get("CHANGEFLAGCODE", this.changeflag);
		}
		return this.changeflagtext;
	}
	public void setChangeflagtext(String changeflagtext) {
		this.changeflagtext = changeflagtext;
	}
	public String getAccttypetext() {
		if(this.accttype!=null){
			this.accttypetext = DictionaryText.get("ACCTTYPE", this.accttype);
		}
		return this.accttypetext;
	}
	public void setAccttypetext(String accttypetext) {
		this.accttypetext = accttypetext;
	}
	public String getRptdatetext() {
		if(this.rptdate!=null){
			this.rptdatetext = DateUtils.formatDate(this.rptdate);
		}
		return this.rptdatetext;
	}
	public void setRptdatetext(String rptdatetext) {
		this.rptdatetext = rptdatetext;
	}
	public String getRptdatecodetext() {
		if(this.rptdatecode!=null){
			this.rptdatecodetext = DictionaryText.get("RPTDATECODECODE", this.rptdatecode);
		}
		return this.rptdatecodetext;
	}
	public void setRptdatecodetext(String rptdatecodetext) {
		this.rptdatecodetext = rptdatecodetext;
	}
	public String getIdtypetext() {
		if(this.idtype!=null){
			this.idtypetext = DictionaryText.get("IDTYPECODECODE", this.idtype);
		}
		return this.idtypetext;
	}
	public void setIdtypetext(String idtypetext) {
		this.idtypetext = idtypetext;
	}
	public String getLoan_acctbssgmt_id(){
		return loan_acctbssgmt_id;
	}
	public void setInfrectype(String infrectype){
		this.infrectype=infrectype;
	}
	public String getInfrectype(){
		return infrectype;
	}
	public void setAcctcode(String acctcode){
		this.acctcode=acctcode;
	}
	public String getAcctcode(){
		return acctcode;
	}
	public void setAccttype(String accttype){
		this.accttype=accttype;
	}
	public String getAccttype(){
		return accttype;
	}
	public void setRptdate(Date rptdate){
		this.rptdate=rptdate;
	}
	public Date getRptdate(){
		return rptdate;
	}
	public void setRptdatecode(String rptdatecode){
		this.rptdatecode=rptdatecode;
	}
	public String getRptdatecode(){
		return rptdatecode;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setIdtype(String idtype){
		this.idtype=idtype;
	}
	public String getIdtype(){
		return idtype;
	}
	public void setIdnum(String idnum){
		this.idnum=idnum;
	}
	public String getIdnum(){
		return idnum;
	}
	public void setMngmtorgcode(String mngmtorgcode){
		this.mngmtorgcode=mngmtorgcode;
	}
	public String getMngmtorgcode(){
		return mngmtorgcode;
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
}
