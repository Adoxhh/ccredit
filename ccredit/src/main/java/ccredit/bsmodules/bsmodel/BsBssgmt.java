package ccredit.bsmodules.bsmodel;
import ccredit.util.DictionaryText;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import ccredit.xtmodules.xtcore.util.DateUtils;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

/**
* bs_bssgmt 企业基本信息基础段 
* 2018-04-26 09:58:53  mengbeibei
*/
public class BsBssgmt extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	private String bssgmt_id;/**编号**/
	private String infrectype;/**信息记录类型**/
	private String infrectypetext;/**信息记录类型**/
	private String entname;/**企业名称**/
	private String entcerttype;/**企业身份标识类型**/
	private String entcerttypetext;/**企业身份标识类型**/
	private String entcertnum;/**企业身份标识号码**/
	private Date rptdate;/**信息报告日期**/
	private String rptdatetext;/**信息报告日期**/
	private String rptdatecode;/**报告时点说明代码**/
	private String rptdatecodetext;/**报告时点说明代码**/
	private String infsurccode;/**信息来源编码**/
	private String cimoc;/**客户资料维护机构代码**/
	private String customertype;/**客户资料类型**/
	private String customertypetext;/**客户资料类型**/
	private String etpsts;/**存续状态**/
	private String etpststext;/**存续状态**/
	private String orgtype;/**组织机构类型**/
	private String orgtypetext;/**组织机构类型**/
	private String customid;/**客户号**/
	private Date lastdate;/**最后一次修改日期**/
	private String changeflag;/**状态位**/
	public void setBssgmt_id(String bssgmt_id){
		this.bssgmt_id=bssgmt_id;
	}
	public String getBssgmt_id(){
		return bssgmt_id;
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
	public void setInfsurccode(String infsurccode){
		this.infsurccode=infsurccode;
	}
	public String getInfsurccode(){
		return infsurccode;
	}
	public void setCimoc(String cimoc){
		this.cimoc=cimoc;
	}
	public String getCimoc(){
		return cimoc;
	}
	public void setCustomertype(String customertype){
		this.customertype=customertype;
	}
	public String getCustomertype(){
		return customertype;
	}
	public void setEtpsts(String etpsts){
		this.etpsts=etpsts;
	}
	public String getEtpsts(){
		return etpsts;
	}
	public void setOrgtype(String orgtype){
		this.orgtype=orgtype;
	}
	public String getOrgtype(){
		return orgtype;
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
	
	
	public String getInfrectypetext() {
		if(this.infrectype!=null){
			this.infrectypetext= DictionaryText.get("BSINFRECTYPECODE", this.infrectype);
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
			this.rptdatecodetext= DictionaryText.get("BSRPTDATECODE", this.rptdatecode);
		}
		return this.rptdatecodetext;
	}
	public void setRptdatecodetext(String rptdatecodetext) {
		this.rptdatecodetext = rptdatecodetext;
	}
	public String getCustomertypetext() {
		if(this.customertype!=null){
			this.customertypetext= DictionaryText.get("CUSTOMERTYPECODE", this.customertype);
		}
		return this.customertypetext;
	}
	public void setCustomertypetext(String customertypetext) {
		this.customertypetext = customertypetext;
	}
	public String getEtpststext() {
		if(this.etpsts!=null){
			this.etpststext= DictionaryText.get("ETPSTSCODE", this.etpsts);
		}
		return this.etpststext;
	}
	public void setEtpststext(String etpststext) {
		this.etpststext = etpststext;
	}
	public String getOrgtypetext() {
		if(this.orgtype!=null){
			this.orgtypetext= DictionaryText.get("ORGTYPECODE", this.orgtype);
		}
		return this.orgtypetext;
	}
	public void setOrgtypetext(String orgtypetext) {
		this.orgtypetext = orgtypetext;
	}
}
