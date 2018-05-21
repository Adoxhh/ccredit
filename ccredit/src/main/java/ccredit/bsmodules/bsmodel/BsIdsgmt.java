package ccredit.bsmodules.bsmodel;
import ccredit.util.DictionaryText;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import ccredit.xtmodules.xtcore.util.DateUtils;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

/**
* bs_idsgmt 其他标识表 
* 2018-04-26 10:26:44  mengbeibei
*/
public class BsIdsgmt extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	private String bs_idsgmt_id;/**编号**/
	private String idnm;/**其他标识个数**/
	private String othentcerttype;/**企业身份标识类型**/
	private String othentcerttypetext;/**企业身份标识类型**/
	private String othentcertnum;/**企业身份标识号码**/
	private Date idinfoupdate;/**信息更新日期**/
	private String idinfoupdatetext;/**信息更新日期**/
	private String customid;/**客户号**/
	private Date lastdate;/**最后一次修改日期**/
	private String changeflag;/**状态位**/
	public void setBs_idsgmt_id(String bs_idsgmt_id){
		this.bs_idsgmt_id=bs_idsgmt_id;
	}
	public String getBs_idsgmt_id(){
		return bs_idsgmt_id;
	}
	public void setIdnm(String idnm){
		this.idnm=idnm;
	}
	public String getIdnm(){
		return idnm;
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
	public void setIdinfoupdate(Date idinfoupdate){
		this.idinfoupdate=idinfoupdate;
	}
	public Date getIdinfoupdate(){
		return idinfoupdate;
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
	
	
	public String getOthentcerttypetext() {
		if(this.othentcerttype!=null){
			this.othentcerttypetext= DictionaryText.get("OTHENTCERTTYPECODE", this.othentcerttype);
		}
		return this.othentcerttypetext;
	}
	public void setOthentcerttypetext(String othentcerttypetext) {
		this.othentcerttypetext = othentcerttypetext;
	}
	public String getIdinfoupdatetext() {
		if(this.idinfoupdate!=null){
			this.idinfoupdatetext = DateUtils.formatDate(this.idinfoupdate);
		}
		return this.idinfoupdatetext;
	}
	public void setIdinfoupdatetext(String idinfoupdatetext) {
		this.idinfoupdatetext = idinfoupdatetext;
	}
}
