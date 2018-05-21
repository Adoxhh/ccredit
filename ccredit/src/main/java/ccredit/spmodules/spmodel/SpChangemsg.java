package ccredit.spmodules.spmodel;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;
import ccredit.xtmodules.xtcore.util.DateUtils;
import ccredit.util.DictionaryText;

/**
* sp_changemsg 变更类报文 
* 2018-05-02 09:39:48  孟贝贝
*/
public class SpChangemsg extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	/**主键**/
	private String changemsg_id;
	/**客户号**/
	private String customid;
	/**借据号**/
	private String serialno;
	/**信息记录类型**/
	private String infrectype;
	/**信息记录类型**/
	private String infrectypetext;
	/**原业务标识号/待更正业务标识**/
	private String odbnescode;
	/**新业务标识号**/
	private String nwbnescode;
	/**信息报告日期**/
	private Date rptdate;
	/**信息报告日期**/
	private String rptdatetext;
	/**待更正段段标**/
	private String mdfcsgmtcode;
	/**待更正段段标**/
	private String mdfcsgmtcodetext;
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
	private String status;
	private String statustext;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setChangemsg_id(String changemsg_id){
		this.changemsg_id=changemsg_id;
	}
	public String getChangemsg_id(){
		return changemsg_id;
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
			this.infrectypetext= DictionaryText.get("INFRECTYPECHG", this.infrectype);
		}
		return this.infrectypetext;
	}
	public void setInfrectype(String infrectype){
		this.infrectype=infrectype;
	}
	public String getInfrectype(){
		return infrectype;
	}
	public void setOdbnescode(String odbnescode){
		this.odbnescode=odbnescode;
	}
	public String getOdbnescode(){
		return odbnescode;
	}
	public void setNwbnescode(String nwbnescode){
		this.nwbnescode=nwbnescode;
	}
	public String getNwbnescode(){
		return nwbnescode;
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
	public void setMdfcsgmtcodetext( String mdfcsgmtcodetext) {
		this.mdfcsgmtcodetext = mdfcsgmtcodetext;
	}
	public String getMdfcsgmtcodetext() {
	    if(this.infrectype!=null&&this.mdfcsgmtcode!=null){
	    	if(this.infrectype.equals("412")){
	    		this.mdfcsgmtcodetext= DictionaryText.get("MDFCSGMTCODECODE1", this.mdfcsgmtcode);
	    	}
	    	if(this.infrectype.equals("432")){
	    		this.mdfcsgmtcodetext= DictionaryText.get("MDFCSGMTCODECODE2", this.mdfcsgmtcode);
	    	}
	    	if(this.infrectype.equals("522")){
	    		this.mdfcsgmtcodetext= DictionaryText.get("MDFCSGMTCODECODE3", this.mdfcsgmtcode);
	    	}
	    	if(this.infrectype.equals("442")){
	    		this.mdfcsgmtcodetext= DictionaryText.get("MDFCSGMTCODECODE4", this.mdfcsgmtcode);
	    	}
	    }

		return this.mdfcsgmtcodetext;
	}
	public void setMdfcsgmtcode(String mdfcsgmtcode){
		this.mdfcsgmtcode=mdfcsgmtcode;
	}
	public String getMdfcsgmtcode(){
		return mdfcsgmtcode;
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
	public String getStatustext() {
		if(this.status!=null){
			this.statustext= DictionaryText.get("SENDMSGSTATUS", this.status);
		}
		return this.statustext;
	}
	public void setStatustext(String statustext) {
		this.statustext = statustext;
	}
}
