package ccredit.bsmodules.bsmodel;
import ccredit.util.DictionaryText;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import ccredit.xtmodules.xtcore.util.DateUtils;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

/**
* bs_enicdnrltpinf 企业间关联关系信息记录 
* 2018-04-26 14:51:38  mengbeibei
*/
public class BsEnicdnrltpinf extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	private String enicdnrltpinf_id;/**主键**/
	private String infrectype;/**信息记录类型**/
	private String infrectypetext;/**信息记录类型**/
	private String customid;/**A客户号**/
	private String entname;/**A 企业名称**/
	private String entcerttype;/**A 企业身份标识类型**/
	private String entcerttypetext;/**A 企业身份标识类型**/
	private String entcertnum;/**A 企业身份标识号码**/
	private String bcustomid;/**B企业客户号**/
	private String assoentname;/**B 企业名称**/
	private String assoentcerttype;/**B 企业身份标识类型**/
	private String assoentcerttypetext;/**B 企业身份标识类型**/
	private String assoentcertnum;/**B 企业身份标识号码**/
	private String assotype;/**关联关系类型**/
	private String assotypetext;/**关联关系类型**/
	private String assosign;/**关联标志**/
	private String assosigntext;/**关联标志**/
	private Date rptdate;/**信息报告日期**/
	private String rptdatetext;/**信息报告日期**/
	private Date lastdate;/**最后一次修改日期**/
	private String changeflag;/**状态位**/
	public void setEnicdnrltpinf_id(String enicdnrltpinf_id){
		this.enicdnrltpinf_id=enicdnrltpinf_id;
	}
	public String getEnicdnrltpinf_id(){
		return enicdnrltpinf_id;
	}
	public void setInfrectype(String infrectype){
		this.infrectype=infrectype;
	}
	public String getInfrectype(){
		return infrectype;
	}
	public void setCustomid(String customid){
		this.customid=customid;
	}
	public String getCustomid(){
		return customid;
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
	public void setBcustomid(String bcustomid){
		this.bcustomid=bcustomid;
	}
	public String getBcustomid(){
		return bcustomid;
	}
	public void setAssoentname(String assoentname){
		this.assoentname=assoentname;
	}
	public String getAssoentname(){
		return assoentname;
	}
	public void setAssoentcerttype(String assoentcerttype){
		this.assoentcerttype=assoentcerttype;
	}
	public String getAssoentcerttype(){
		return assoentcerttype;
	}
	public void setAssoentcertnum(String assoentcertnum){
		this.assoentcertnum=assoentcertnum;
	}
	public String getAssoentcertnum(){
		return assoentcertnum;
	}
	public void setAssotype(String assotype){
		this.assotype=assotype;
	}
	public String getAssotype(){
		return assotype;
	}
	public void setAssosign(String assosign){
		this.assosign=assosign;
	}
	public String getAssosign(){
		return assosign;
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
	public String getAssoentcerttypetext() {
		if(this.assoentcerttype!=null){
			this.assoentcerttypetext= DictionaryText.get("OTHENTCERTTYPECODE", this.assoentcerttype);
		}
		return this.assoentcerttypetext;
	}
	public void setAssoentcerttypetext(String assoentcerttypetext) {
		this.assoentcerttypetext = assoentcerttypetext;
	}
	public String getAssotypetext() {
		if(this.assotype!=null){
			this.assotypetext= DictionaryText.get("ASSOTYPECODE", this.assotype);
		}
		return this.assotypetext;
	}
	public void setAssotypetext(String assotypetext) {
		this.assotypetext = assotypetext;
	}
	public String getAssosigntext() {
		if(this.assosign!=null){
			this.assosigntext= DictionaryText.get("CERTASSFLGCODE", this.assosign);
		}
		return this.assosigntext;
	}
	public void setAssosigntext(String assosigntext) {
		this.assosigntext = assosigntext;
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
