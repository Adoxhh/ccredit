package ccredit.bsmodules.bsmodel;
import ccredit.util.DictionaryText;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import ccredit.xtmodules.xtcore.util.DateUtils;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

/**
* bs_fcsinfsgmt 基本概况信息 
* 2018-04-26 10:57:16  mengbeibei
*/
public class BsFcsinfsgmt extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	private String bs_fcsinfsgmt_id;/**编号**/
	private String nationality;/**国别代码**/
	private String nationalitytext;/**国别代码**/
	private String regadd;/**登记地址**/
	private String admdivofreg;/**登记地行政区划代码**/
	private String admdivofregtext;/**登记地行政区划代码**/
	private Date establishdate;/**成立日期**/
	private String establishdatetext;/**成立日期**/
	private Date bizenddate;/**营业许可证到期日**/
	private String bizenddatetext;/**营业许可证到期日**/
	private String bizrange;/**业务范围**/
	private String ecoinduscate;/**行业分类代码**/
	private String ecoinduscatetext;/**行业分类代码**/
	private String ecotype;/**经济类型代码**/
	private String ecotypetext;/**经济类型代码**/
	private String entscale;/**企业规模**/
	private String entscaletext;/**企业规模**/
	private Date fcsinfoupdate;/**信息更新日期**/
	private String fcsinfoupdatetext;/**信息更新日期**/
	private String customid;/**客户号**/
	private Date lastdate;/**最后一次修改日期**/
	private String changeflag;/**状态位**/
	public void setBs_fcsinfsgmt_id(String bs_fcsinfsgmt_id){
		this.bs_fcsinfsgmt_id=bs_fcsinfsgmt_id;
	}
	public String getBs_fcsinfsgmt_id(){
		return bs_fcsinfsgmt_id;
	}
	public void setNationality(String nationality){
		this.nationality=nationality;
	}
	public String getNationality(){
		return nationality;
	}
	public void setRegadd(String regadd){
		this.regadd=regadd;
	}
	public String getRegadd(){
		return regadd;
	}
	public void setAdmdivofreg(String admdivofreg){
		this.admdivofreg=admdivofreg;
	}
	public String getAdmdivofreg(){
		return admdivofreg;
	}
	public void setEstablishdate(Date establishdate){
		this.establishdate=establishdate;
	}
	public Date getEstablishdate(){
		return establishdate;
	}
	public void setBizenddate(Date bizenddate){
		this.bizenddate=bizenddate;
	}
	public Date getBizenddate(){
		return bizenddate;
	}
	public void setBizrange(String bizrange){
		this.bizrange=bizrange;
	}
	public String getBizrange(){
		return bizrange;
	}
	public void setEcoinduscate(String ecoinduscate){
		this.ecoinduscate=ecoinduscate;
	}
	public String getEcoinduscate(){
		return ecoinduscate;
	}
	public void setEcotype(String ecotype){
		this.ecotype=ecotype;
	}
	public String getEcotype(){
		return ecotype;
	}
	public void setEntscale(String entscale){
		this.entscale=entscale;
	}
	public String getEntscale(){
		return entscale;
	}
	public void setFcsinfoupdate(Date fcsinfoupdate){
		this.fcsinfoupdate=fcsinfoupdate;
	}
	public Date getFcsinfoupdate(){
		return fcsinfoupdate;
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
	
	
	
	public String getNationalitytext() {
		if(this.nationality!=null){
			this.nationalitytext= DictionaryText.get("NATIONALITYCODE", this.nationality);
		}
		return this.nationalitytext;
	}
	public void setNationalitytext(String nationalitytext) {
		this.nationalitytext = nationalitytext;
	}
	public String getAdmdivofregtext() {
		if(this.admdivofreg!=null){
			this.admdivofregtext= DictionaryText.get("ADMDIVOFREGCODE", this.admdivofreg);
		}
		return this.admdivofregtext;
	}
	public void setAdmdivofregtext(String admdivofregtext) {
		this.admdivofregtext = admdivofregtext;
	}
	public String getEstablishdatetext() {
		if(this.establishdate!=null){
			this.establishdatetext = DateUtils.formatDate(this.establishdate);
		}
		return this.establishdatetext;
	}
	public void setEstablishdatetext(String establishdatetext) {
		this.establishdatetext = establishdatetext;
	}
	public String getBizenddatetext() {
		if(this.bizenddate!=null){
			this.bizenddatetext = DateUtils.formatDate(this.bizenddate);
		}
		return this.bizenddatetext;
	}
	public void setBizenddatetext(String bizenddatetext) {
		this.bizenddatetext = bizenddatetext;
	}
	public String getEcoinduscatetext() {
		if(this.ecoinduscate!=null){
			this.ecoinduscatetext= DictionaryText.get("ACTINVESTCODE", this.ecoinduscate);
		}
		return this.ecoinduscatetext;
	}
	public void setEcoinduscatetext(String ecoinduscatetext) {
		this.ecoinduscatetext = ecoinduscatetext;
	}
	public String getEcotypetext() {
		if(this.ecotype!=null){
			this.ecotypetext= DictionaryText.get("ECOTYPECODE", this.ecotype);
		}
		return this.ecotypetext;
	}
	public void setEcotypetext(String ecotypetext) {
		this.ecotypetext = ecotypetext;
	}
	public String getEntscaletext() {
		if(this.entscale!=null){
			this.entscaletext= DictionaryText.get("ENTSCALECODE", this.entscale);
		}
		return this.entscaletext;
	}
	public void setEntscaletext(String entscaletext) {
		this.entscaletext = entscaletext;
	}
	public String getFcsinfoupdatetext() {
		if(this.fcsinfoupdate!=null){
			this.fcsinfoupdatetext = DateUtils.formatDate(this.fcsinfoupdate);
		}
		return this.fcsinfoupdatetext;
	}
	public void setFcsinfoupdatetext(String fcsinfoupdatetext) {
		this.fcsinfoupdatetext = fcsinfoupdatetext;
	}
}
