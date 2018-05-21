package ccredit.plmodules.plmodel;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;
import ccredit.xtmodules.xtcore.util.DateUtils;
import ccredit.util.DictionaryText;

/**
* pl_motgacltalctrctbssgmt 抵（质）押合同信息记录基础段 
* 2018-04-28 16:56:37  yangzhou
*/
public class PlMotgacltalctrctbssgmt extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	/**编号**/
	private String pl_motgacltalctrctbssgmt_id;
	/**信息记录类型**/
	private String infrectype;
	/**信息记录类型**/
	private String infrectypetext;
	/**抵（质）押合同标识码**/
	private String cccode;
	/**信息报告日期**/
	private Date rptdate;
	/**信息报告日期**/
	private String rptdatetext;
	/**报告时点说明代码**/
	private String rptdatecode;
	/**报告时点说明代码**/
	private String rptdatecodetext;
	/**债务人身份类别**/
	private String infoidtype;
	/**债务人身份类别**/
	private String infoidtypetext;
	/**债务人姓名**/
	private String name;
	/**债务人身份标识类型**/
	private String certtype;
	/**债务人身份标识类型**/
	private String certtypetext;
	/**债务人身份标识号码**/
	private String certnum;
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
	public void setPl_motgacltalctrctbssgmt_id(String pl_motgacltalctrctbssgmt_id){
		this.pl_motgacltalctrctbssgmt_id=pl_motgacltalctrctbssgmt_id;
	}
	public String getPl_motgacltalctrctbssgmt_id(){
		return pl_motgacltalctrctbssgmt_id;
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
	public void setCccode(String cccode){
		this.cccode=cccode;
	}
	public String getCccode(){
		return cccode;
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
			this.rptdatecodetext= DictionaryText.get("RPTDATECODEDZY", this.rptdatecode);
		}
		return this.rptdatecodetext;
	}
	public void setRptdatecode(String rptdatecode){
		this.rptdatecode=rptdatecode;
	}
	public String getRptdatecode(){
		return rptdatecode;
	}
	public void setInfoidtypetext( String infoidtypetext) {
		this.infoidtypetext = infoidtypetext;
	}
	public String getInfoidtypetext() {
		if(this.infoidtype!=null){
			this.infoidtypetext= DictionaryText.get("ARLPIDTYPECODE", this.infoidtype);
		}
		return this.infoidtypetext;
	}
	public void setInfoidtype(String infoidtype){
		this.infoidtype=infoidtype;
	}
	public String getInfoidtype(){
		return infoidtype;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setCerttypetext( String certtypetext) {
		this.certtypetext = certtypetext;
	}
	public String getCerttypetext() {
		if(this.certtype!=null){
			this.certtypetext= DictionaryText.get("IDTYPECODECODE", this.certtype);
		}
		return this.certtypetext;
	}
	public void setCerttype(String certtype){
		this.certtype=certtype;
	}
	public String getCerttype(){
		return certtype;
	}
	public void setCertnum(String certnum){
		this.certnum=certnum;
	}
	public String getCertnum(){
		return certnum;
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
