package ccredit.finmodules.finmodel;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;
import ccredit.xtmodules.xtcore.util.DateUtils;
import ccredit.util.DictionaryText;

/**
* fin_financebssgmt 财务报表信息记录基础段 
* 2018-05-03 15:02:51  yangzhou
*/
public class FinFinancebssgmt extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	/**编号**/
	private String fin_financebssgmt_id;
	/**信息记录类型**/
	private String infrectype;
	/**信息记录类型**/
	private String infrectypetext;
	/**企业名称**/
	private String entname;
	/**企业身份标识类型**/
	private String entcerttype;
	/**企业身份标识类型**/
	private String entcerttypetext;
	/**企业身份标识号码**/
	private String entcertnum;
	/**信息报告日期**/
	private Date rptdate;
	/**信息报告日期**/
	private String rptdatetext;
	/**报表年份**/
	private String sheetyear;
	/**报表类型**/
	private String sheettype;
	/**报表类型**/
	private String sheettypetext;
	/**报表类型细分**/
	private String sheettypedivide;
	/**报表类型细分**/
	private String sheettypedividetext;
	/**审计事务所名称**/
	private String auditfirmname;
	/**审计人员名称**/
	private String auditorname;
	/**审计时间**/
	private String audittime;
	/**客户资料维护机构代码**/
	private String cimoc;
	/**报告时点说明代码**/
	private String rptdatecode;
	/**报告时点说明代码**/
	private String rptdatecodetext;
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
	public void setFin_financebssgmt_id(String fin_financebssgmt_id){
		this.fin_financebssgmt_id=fin_financebssgmt_id;
	}
	public String getFin_financebssgmt_id(){
		return fin_financebssgmt_id;
	}
	public void setInfrectypetext( String infrectypetext) {
		this.infrectypetext = infrectypetext;
	}
	public String getInfrectypetext() {
		if(this.infrectype!=null){
			this.infrectypetext= DictionaryText.get("INFRECTYPECODEFIN", this.infrectype);
		}
		return this.infrectypetext;
	}
	public void setInfrectype(String infrectype){
		this.infrectype=infrectype;
	}
	public String getInfrectype(){
		return infrectype;
	}
	public void setEntname(String entname){
		this.entname=entname;
	}
	public String getEntname(){
		return entname;
	}
	public void setEntcerttypetext( String entcerttypetext) {
		this.entcerttypetext = entcerttypetext;
	}
	public String getEntcerttypetext() {
		if(this.entcerttype!=null){
			this.entcerttypetext= DictionaryText.get("IDTYPECODECODE", this.entcerttype);
		}
		return this.entcerttypetext;
	}
	public void setEntcerttype(String entcerttype){
		this.entcerttype=entcerttype;
	}
	public String getEntcerttype(){
		return entcerttype;
	}
	public void setEntcertnum(String entcertnum){
		this.entcertnum=entcertnum;
	}
	public String getEntcertnum(){
		return entcertnum;
	}
	public void setRptdate(Date rptdate){
		this.rptdate=rptdate;
	}
	public Date getRptdate(){
		return rptdate;
	}
	public void setSheetyear(String sheetyear){
		this.sheetyear=sheetyear;
	}
	public String getSheetyear(){
		return sheetyear;
	}
	public void setSheettypetext( String sheettypetext) {
		this.sheettypetext = sheettypetext;
	}
	public String getSheettypetext() {
		if(this.sheettype!=null){
			this.sheettypetext= DictionaryText.get("SHEETTYPECODE", this.sheettype);
		}
		return this.sheettypetext;
	}
	public void setSheettype(String sheettype){
		this.sheettype=sheettype;
	}
	public String getSheettype(){
		return sheettype;
	}
	public void setSheettypedividetext( String sheettypedividetext) {
		this.sheettypedividetext = sheettypedividetext;
	}
	public String getSheettypedividetext() {
		if(this.sheettypedivide!=null){
			this.sheettypedividetext= DictionaryText.get("SHEETTYPEDIVIDECODE", this.sheettypedivide);
		}
		return this.sheettypedividetext;
	}
	public void setSheettypedivide(String sheettypedivide){
		this.sheettypedivide=sheettypedivide;
	}
	public String getSheettypedivide(){
		return sheettypedivide;
	}
	public void setAuditfirmname(String auditfirmname){
		this.auditfirmname=auditfirmname;
	}
	public String getAuditfirmname(){
		return auditfirmname;
	}
	public void setAuditorname(String auditorname){
		this.auditorname=auditorname;
	}
	public String getAuditorname(){
		return auditorname;
	}
	public void setAudittime(String audittime){
		this.audittime=audittime;
	}
	public String getAudittime(){
		return audittime;
	}
	public void setCimoc(String cimoc){
		this.cimoc=cimoc;
	}
	public String getCimoc(){
		return cimoc;
	}
	public void setRptdatecodetext( String rptdatecodetext) {
		this.rptdatecodetext = rptdatecodetext;
	}
	public String getRptdatecodetext() {
		if(this.rptdatecode!=null){
			this.rptdatecodetext= DictionaryText.get("RPTDATECODEFIN", this.rptdatecode);
		}
		return this.rptdatecodetext;
	}
	public void setRptdatecode(String rptdatecode){
		this.rptdatecode=rptdatecode;
	}
	public String getRptdatecode(){
		return rptdatecode;
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
	
	
	public void setRptdatetext(String rptdatetext) {
		this.rptdatetext = rptdatetext;
	}
	public String getRptdatetext() {
		if(this.rptdate!=null){
			this.rptdatetext = DateUtils.formatDate(this.rptdate);
		}
		return this.rptdatetext;
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
