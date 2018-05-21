package ccredit.bsmodules.bsmodel;
import ccredit.util.DictionaryText;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import ccredit.xtmodules.xtcore.util.DateUtils;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

/**
* bs_mnshahodinfsgmt 注册资本及主要出资人 
* 2018-04-26 11:28:45  mengbeibei
*/
public class BsMnshahodinfsgmt extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	private String bs_mnshahodinfsgmt_id;/**编号**/
	private String regcapcurrency;/**注册资本币种**/
	private String regcapcurrencytext;/**注册资本币种**/
	private String regcap;/**注册资本**/
	private String mnsharhodnm;/**主要出资人个数**/
	private String sharhodtype;/**出资人类型**/
	private String sharhodtypetext;/**出资人类型**/
	private String sharhodidtype1;/**出资人身份类别**/
	private String sharhodidtype1text;/**出资人身份类别**/
	private String sharhodname;/**出资人名称**/
	private String sharhodidtype2;/**出资人身份标识类型**/
	private String sharhodidtype2text;/**出资人身份标识类型**/
	private String sharhodidnum;/**出资人身份标识号码**/
	private String invratio;/**出资比例**/
	private Date mnshahodinfoupdate;/**信息更新日期**/
	private String mnshahodinfoupdatetext;/**信息更新日期**/
	private String customid;/**客户号**/
	private Date lastdate;/**最后一次修改日期**/
	private String changeflag;/**状态位**/
	public void setBs_mnshahodinfsgmt_id(String bs_mnshahodinfsgmt_id){
		this.bs_mnshahodinfsgmt_id=bs_mnshahodinfsgmt_id;
	}
	public String getBs_mnshahodinfsgmt_id(){
		return bs_mnshahodinfsgmt_id;
	}
	public void setRegcapcurrency(String regcapcurrency){
		this.regcapcurrency=regcapcurrency;
	}
	public String getRegcapcurrency(){
		return regcapcurrency;
	}
	public void setRegcap(String regcap){
		this.regcap=regcap;
	}
	public String getRegcap(){
		return regcap;
	}
	public void setMnsharhodnm(String mnsharhodnm){
		this.mnsharhodnm=mnsharhodnm;
	}
	public String getMnsharhodnm(){
		return mnsharhodnm;
	}
	public void setSharhodtype(String sharhodtype){
		this.sharhodtype=sharhodtype;
	}
	public String getSharhodtype(){
		return sharhodtype;
	}
	public void setSharhodidtype1(String sharhodidtype1){
		this.sharhodidtype1=sharhodidtype1;
	}
	public String getSharhodidtype1(){
		return sharhodidtype1;
	}
	public void setSharhodname(String sharhodname){
		this.sharhodname=sharhodname;
	}
	public String getSharhodname(){
		return sharhodname;
	}
	public void setSharhodidtype2(String sharhodidtype2){
		this.sharhodidtype2=sharhodidtype2;
	}
	public String getSharhodidtype2(){
		return sharhodidtype2;
	}
	public void setSharhodidnum(String sharhodidnum){
		this.sharhodidnum=sharhodidnum;
	}
	public String getSharhodidnum(){
		return sharhodidnum;
	}
	public void setInvratio(String invratio){
		this.invratio=invratio;
	}
	public String getInvratio(){
		return invratio;
	}
	public void setMnshahodinfoupdate(Date mnshahodinfoupdate){
		this.mnshahodinfoupdate=mnshahodinfoupdate;
	}
	public Date getMnshahodinfoupdate(){
		return mnshahodinfoupdate;
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
	
	
	public String getRegcapcurrencytext() {
		if(this.regcapcurrency!=null){
			this.regcapcurrencytext= DictionaryText.get("CYCODE", this.regcapcurrency);
		}
		return this.regcapcurrencytext;
	}
	public void setRegcapcurrencytext(String regcapcurrencytext) {
		this.regcapcurrencytext = regcapcurrencytext;
	}
	public String getSharhodtypetext() {
		if(this.sharhodtype!=null){
			this.sharhodtypetext= DictionaryText.get("SHARHODTYPECODE", this.sharhodtype);
		}
		return this.sharhodtypetext;
	}
	public void setSharhodtypetext(String sharhodtypetext) {
		this.sharhodtypetext = sharhodtypetext;
	}
	public String getSharhodidtype1text() {
		if(this.sharhodidtype1!=null){
			this.sharhodidtype1text= DictionaryText.get("ARLPIDTYPECODE", this.sharhodidtype1);
		}
		return this.sharhodidtype1text;
	}
	public void setSharhodidtype1text(String sharhodidtype1text) {
		this.sharhodidtype1text = sharhodidtype1text;
	}
	public String getSharhodidtype2text() {
		if(this.sharhodidtype2!=null){
			this.sharhodidtype2text= DictionaryText.get("OTHENTCERTTYPECODE", this.sharhodidtype2);
		}
		return this.sharhodidtype2text;
	}
	public void setSharhodidtype2text(String sharhodidtype2text) {
		this.sharhodidtype2text = sharhodidtype2text;
	}
	public String getMnshahodinfoupdatetext() {
		if(this.mnshahodinfoupdate!=null){
			this.mnshahodinfoupdatetext = DateUtils.formatDate(this.mnshahodinfoupdate);
		}
		return this.mnshahodinfoupdatetext;
	}
	public void setMnshahodinfoupdatetext(String mnshahodinfoupdatetext) {
		this.mnshahodinfoupdatetext = mnshahodinfoupdatetext;
	}
}
