package ccredit.bsmodules.bsmodel;
import ccredit.util.DictionaryText;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import ccredit.xtmodules.xtcore.util.DateUtils;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

/**
* bs_enctfitginf 身份标识整合信息记录 
* 2018-04-26 14:47:45  mengbeibei
*/
public class BsEnctfitginf extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	private String enctfitginf_id;/**主键**/
	private String customid;/**客户号**/
	private String infrectype;/**信息记录类型**/
	private String infrectypetext;/**信息记录类型**/
	private String entname;/**企业名称**/
	private String entcerttype;/**企业身份标识类型**/
	private String entcerttypetext;/**企业身份标识类型**/
	private String entcertnum;/**企业身份标识号码**/
	private String othentcerttype;/**企业其他身份标识类型**/
	private String othentcerttypetext;/**企业其他身份标识类型**/
	private String othentcertnum;/**企业其他身份标识号码**/
	private String certassflg;/**身份标识关联标志**/
	private String certassflgtext;/**身份标识关联标志**/
	private Date rptdate;/**信息报告日期**/
	private String rptdatetext;/**信息报告日期**/
	private Date lastdate;/**最后一次修改日期**/
	private String changeflag;/**状态位**/
	public void setEnctfitginf_id(String enctfitginf_id){
		this.enctfitginf_id=enctfitginf_id;
	}
	public String getEnctfitginf_id(){
		return enctfitginf_id;
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
	public void setEntname(String entname){
		this.entname=entname;
	}
	public String getEntname(){
		return entname;
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
	public void setOthentcerttype(String othentcerttype){
		this.othentcerttype=othentcerttype;
	}
	public String getOthentcerttype(){
		return othentcerttype;
	}
	public void setOthentcertnum(String othentcertnum){
		this.othentcertnum=othentcertnum;
	}
	public String getOthentcertnum(){
		return othentcertnum;
	}
	public void setCertassflg(String certassflg){
		this.certassflg=certassflg;
	}
	public String getCertassflg(){
		return certassflg;
	}
	public void setRptdate(Date rptdate){
		this.rptdate=rptdate;
	}
	public Date getRptdate(){
		return rptdate;
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
	
	public String getInfrectypetext() {
		if(this.infrectype!=null){
			this.infrectypetext= DictionaryText.get("ASINFRECTYPECODE", this.infrectype);
		}
		return this.infrectypetext;
	}
	public void setInfrectypetext(String infrectypetext) {
		this.infrectypetext = infrectypetext;
	}
	public String getEntcerttypetext() {
		if(this.entcerttype!=null){
			this.entcerttypetext= DictionaryText.get("OTHENTCERTTYPECODE", this.entcerttype);
		}
		return this.entcerttypetext;
	}
	public void setEntcerttypetext(String entcerttypetext) {
		this.entcerttypetext = entcerttypetext;
	}
	public String getOthentcerttypetext() {
		if(this.othentcerttype!=null){
			this.othentcerttypetext= DictionaryText.get("OTHENTCERTTYPECODE", this.othentcerttype);
		}
		return this.othentcerttypetext;
	}
	public void setOthentcerttypetext(String othentcerttypetext) {
		this.othentcerttypetext = othentcerttypetext;
	}
	public String getCertassflgtext() {
		if(this.certassflg!=null){
			this.certassflgtext= DictionaryText.get("CERTASSFLGCODE", this.certassflg);
		}
		return this.certassflgtext;
	}
	public void setCertassflgtext(String certassflgtext) {
		this.certassflgtext = certassflgtext;
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
}
