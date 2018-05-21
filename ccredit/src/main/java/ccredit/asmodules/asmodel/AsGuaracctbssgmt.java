package ccredit.asmodules.asmodel;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;
import ccredit.xtmodules.xtcore.util.DateUtils;
import ccredit.util.DictionaryText;

/**
* as_guaracctbssgmt as_guaracctbssgmt 
* 2018-04-27 15:41:57  mengbeibei
*/
public class AsGuaracctbssgmt extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	/**主键**/
	private String guaracctbssgmt_id;
	/**借据号**/
	private String serialno;
	/**客户号**/
	private String customid;
	/**信息记录类型**/
	private String infrectype;
	/**信息记录类型**/
	private String infrectypetext;
	/**账户类型**/
	private String accttype;
	/**账户类型**/
	private String accttypetext;
	/**账户标识码**/
	private String acctcode;
	/**信息报告日期**/
	private Date rptdate;
	/**信息报告日期**/
	private String rptdatetext;
	/**报告时点说明代码**/
	private String rptdatecode;
	/**报告时点说明代码**/
	private String rptdatecodetext;
	/**债务人名称**/
	private String name;
	/**债务人身份标识类型**/
	private String idtype;
	/**债务人身份标识类型**/
	private String idtypetext;
	/**债务人身份标识号码**/
	private String idnum;
	/**业务管理机构代码**/
	private String mngmtorgcode;
	/**最后一次修改日期**/
	private Date lastdate;
	/**最后一次修改日期**/
	private String lastdatetext;
	/**状态位**/
	private String changeflag;
	/**状态位**/
	private String changeflagtext;
	
	
	public String getInfrectypetext() {
		if(this.infrectype!=null){
			this.infrectypetext= DictionaryText.get("ASINFRECTYPECODE", this.infrectype);
		}
		return this.infrectypetext;
	}
	public void setInfrectypetext(String infrectypetext) {
		this.infrectypetext = infrectypetext;
	}
	public void setGuaracctbssgmt_id(String guaracctbssgmt_id){
		this.guaracctbssgmt_id=guaracctbssgmt_id;
	}
	public String getGuaracctbssgmt_id(){
		return guaracctbssgmt_id;
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
	public void setInfrectype(String infrectype){
		this.infrectype=infrectype;
	}
	public String getInfrectype(){
		return infrectype;
	}
	public void setAccttypetext( String accttypetext) {
		this.accttypetext = accttypetext;
	}
	public String getAccttypetext() {
		if(this.accttype!=null){
			this.accttypetext= DictionaryText.get("ASACCTTYPECODE", this.accttype);
		}
		return this.accttypetext;
	}
	public void setAccttype(String accttype){
		this.accttype=accttype;
	}
	public String getAccttype(){
		return accttype;
	}
	public void setAcctcode(String acctcode){
		this.acctcode=acctcode;
	}
	public String getAcctcode(){
		return acctcode;
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
			this.rptdatecodetext= DictionaryText.get("ASRPTDATECODE", this.rptdatecode);
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
			this.idtypetext= DictionaryText.get("OTHENTCERTTYPECODE", this.idtype);
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
