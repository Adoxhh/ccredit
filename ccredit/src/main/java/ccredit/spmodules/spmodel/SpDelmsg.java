package ccredit.spmodules.spmodel;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;
import ccredit.xtmodules.xtcore.util.DateUtils;
import ccredit.util.DictionaryText;

/**
* sp_delmsg sp_delmsg 
* 2018-05-03 10:33:04  mengbeibei
*/
public class SpDelmsg extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	/**主键**/
	private String delmsg_id;
	/**客户号**/
	private String customid;
	/**借据号**/
	private String serialno;
	/**信息记录类型**/
	private String infrectype;
	/**信息记录类型**/
	private String infrectypetext;
	/**信息来源编码**/
	private String infsurccode;
	/**企业名称**/
	private String entname;
	/**企业身份标识类型**/
	private String entcerttype;
	/**企业身份标识类型**/
	private String entcerttypetext;
	/**企业身份标识号码**/
	private String entcertnum;
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
	/**待删除业务标识**/
	private String delreccode;
	/**待删除段段标**/
	private String delsgmtcode;
	/**待删除段段标**/
	private String delsgmtcodetext;
	/**待删除起始日期**/
	private Date delstartdate;
	/**待删除起始日期**/
	private String delstartdatetext;
	/**待删除结束日期**/
	private Date delenddate;
	/**待删除结束日期**/
	private String delenddatetext;
	/**原因**/
	private String reason;
	/**申请人**/
	private String applyman;
	/**审批人**/
	private String auditman;
	/**生成时间**/
	private Date credittime;
	/**生成时间**/
	private String credittimetext;
	/**报送时间**/
	private Date sendtime;
	/**报送时间**/
	private String sendtimetext;
	/**xml的id**/
	private String xml;
	/**xml文件名**/
	private String filename;
	/**状态**/
	private String status;
	/**状态**/
	private String statustext;
	public void setDelmsg_id(String delmsg_id){
		this.delmsg_id=delmsg_id;
	}
	public String getDelmsg_id(){
		return delmsg_id;
	}
	public void setCustomid(String customid){
		this.customid=customid;
	}
	public String getCustomid(){
		return customid;
	}
	public void setSerialno(String serialno){
		this.serialno=serialno;
	}
	public String getSerialno(){
		return serialno;
	}
	public void setInfrectypetext( String infrectypetext) {
		this.infrectypetext = infrectypetext;
	}
	public String getInfrectypetext() {
		if(this.infrectype!=null){
			this.infrectypetext= DictionaryText.get("INFRECTYPEDEL", this.infrectype);
		}
		return this.infrectypetext;
	}
	public void setInfrectype(String infrectype){
		this.infrectype=infrectype;
	}
	public String getInfrectype(){
		return infrectype;
	}
	public void setInfsurccode(String infsurccode){
		this.infsurccode=infsurccode;
	}
	public String getInfsurccode(){
		return infsurccode;
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
			this.entcerttypetext= DictionaryText.get("OTHENTCERTTYPECODE", this.entcerttype);
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
	public void setDelreccode(String delreccode){
		this.delreccode=delreccode;
	}
	public String getDelreccode(){
		return delreccode;
	}
	public void setDelsgmtcodetext( String delsgmtcodetext) {
		this.delsgmtcodetext = delsgmtcodetext;
	}
	public String getDelsgmtcodetext() {
		if(this.infrectype!=null&&this.delsgmtcode!=null){
			if(this.infrectype.equals("413")){//企业借贷账户按段删除请求记录
				this.delsgmtcodetext= DictionaryText.get("MDFCSGMTCODE1", this.delsgmtcode);
			}
			if(this.infrectype.equals("423")){
				this.delsgmtcodetext= DictionaryText.get("MDFCSGMTCODE2", this.delsgmtcode);
			}
			if(this.infrectype.equals("433")){
				this.delsgmtcodetext= DictionaryText.get("MDFCSGMTCODE3", this.delsgmtcode);
			}
			if(this.infrectype.equals("443")){
				this.delsgmtcodetext= DictionaryText.get("MDFCSGMTCODE4", this.delsgmtcode);
			}		
		}

		return this.delsgmtcodetext;
	}
	public void setDelsgmtcode(String delsgmtcode){
		this.delsgmtcode=delsgmtcode;
	}
	public String getDelsgmtcode(){
		return delsgmtcode;
	}
	public void setDelstartdatetext(String delstartdatetext) {
		this.delstartdatetext = delstartdatetext;
	}
	public String getDelstartdatetext() {
		if(this.delstartdate!=null){
			this.delstartdatetext = DateUtils.formatDate(this.delstartdate);
		}
		return this.delstartdatetext;
	}
	public void setDelstartdate(Date delstartdate){
		this.delstartdate=delstartdate;
	}
	public Date getDelstartdate(){
		return delstartdate;
	}
	public void setDelenddatetext(String delenddatetext) {
		this.delenddatetext = delenddatetext;
	}
	public String getDelenddatetext() {
		if(this.delenddate!=null){
			this.delenddatetext = DateUtils.formatDate(this.delenddate);
		}
		return this.delenddatetext;
	}
	public void setDelenddate(Date delenddate){
		this.delenddate=delenddate;
	}
	public Date getDelenddate(){
		return delenddate;
	}
	public void setReason(String reason){
		this.reason=reason;
	}
	public String getReason(){
		return reason;
	}
	public void setApplyman(String applyman){
		this.applyman=applyman;
	}
	public String getApplyman(){
		return applyman;
	}
	public void setAuditman(String auditman){
		this.auditman=auditman;
	}
	public String getAuditman(){
		return auditman;
	}
	public void setCredittimetext(String credittimetext) {
		this.credittimetext = credittimetext;
	}
	public String getCredittimetext() {
		if(this.credittime!=null){
			this.credittimetext = DateUtils.formatDate(this.credittime);
		}
		return this.credittimetext;
	}
	public void setCredittime(Date credittime){
		this.credittime=credittime;
	}
	public Date getCredittime(){
		return credittime;
	}
	public void setSendtimetext(String sendtimetext) {
		this.sendtimetext = sendtimetext;
	}
	public String getSendtimetext() {
		if(this.sendtime!=null){
			this.sendtimetext = DateUtils.formatDate(this.sendtime);
		}
		return this.sendtimetext;
	}
	public void setSendtime(Date sendtime){
		this.sendtime=sendtime;
	}
	public Date getSendtime(){
		return sendtime;
	}
	public void setXml(String xml){
		this.xml=xml;
	}
	public String getXml(){
		return xml;
	}
	public void setFilename(String filename){
		this.filename=filename;
	}
	public String getFilename(){
		return filename;
	}
	public void setStatustext( String statustext) {
		this.statustext = statustext;
	}
	public String getStatustext() {
		if(this.status!=null){
			this.statustext= DictionaryText.get("SENDMSGSTATUS", this.status);
		}
		return this.statustext;
	}
	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return status;
	}
}
