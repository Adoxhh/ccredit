package ccredit.loanmodules.loanmodel;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;
import ccredit.xtmodules.xtcore.util.DateUtils;
import ccredit.util.DictionaryText;

/**
* loan_ctrctbssgmt 企业授信协议信息基础段 
* 2018-04-28 09:51:22  yangzhou
*/
public class LoanCtrctbssgmt extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	/**编号**/
	private String loan_ctrctbssgmt_id;
	/**信息记录类型**/
	private String infrectype;
	/**信息记录类型**/
	private String infrectypetext;
	/**授信协议标识码**/
	private String contractcode;
	/**信息报告日期**/
	private Date rptdate;
	/**信息报告日期**/
	private String rptdatetext;
	/**报告时点说明代码**/
	private String rptdatecode;
	/**报告时点说明代码**/
	private String rptdatecodetext;
	/**受信人名称**/
	private String name;
	/**受信人身份标识类型**/
	private String idtype;
	/**受信人身份标识类型**/
	private String idtypetext;
	/**受信人身份标识号码**/
	private String idnum;
	/**业务管理机构代码**/
	private String mngmtorgcode;
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
	public void setLoan_ctrctbssgmt_id(String loan_ctrctbssgmt_id){
		this.loan_ctrctbssgmt_id=loan_ctrctbssgmt_id;
	}
	public String getLoan_ctrctbssgmt_id(){
		return loan_ctrctbssgmt_id;
	}
	public void setInfrectypetext( String infrectypetext) {
		this.infrectypetext = infrectypetext;
	}
	public String getInfrectypetext() {
		if(this.infrectype!=null){
			this.infrectypetext= DictionaryText.get("INFRECTYPECODE", this.infrectype);
		}
		return this.infrectypetext;
	}
	public void setInfrectype(String infrectype){
		this.infrectype=infrectype;
	}
	public String getInfrectype(){
		return infrectype;
	}
	public void setContractcode(String contractcode){
		this.contractcode=contractcode;
	}
	public String getContractcode(){
		return contractcode;
	}
	public void setRptdatetext(String rptdatetext) {
		this.rptdatetext = rptdatetext;
	}
	public String getRptdatetext() {
		if(this.rptdate!=null){
			this.rptdatetext = DateUtils.formatDate(this.rptdate);
		}
		return this.rptdatetext;
	}
	public void setRptdate(Date rptdate){
		this.rptdate=rptdate;
	}
	public Date getRptdate(){
		return rptdate;
	}
	public void setRptdatecodetext( String rptdatecodetext) {
		this.rptdatecodetext = rptdatecodetext;
	}
	public String getRptdatecodetext() {
		if(this.rptdatecode!=null){
			this.rptdatecodetext= DictionaryText.get("RPTDATECODECODE2", this.rptdatecode);
		}
		return this.rptdatecodetext;
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
	public void setIdtypetext( String idtypetext) {
		this.idtypetext = idtypetext;
	}
	public String getIdtypetext() {
		if(this.idtype!=null){
			this.idtypetext= DictionaryText.get("IDTYPECODECODE", this.idtype);
		}
		return this.idtypetext;
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
