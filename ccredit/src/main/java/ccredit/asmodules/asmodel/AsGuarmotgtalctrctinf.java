package ccredit.asmodules.asmodel;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;
import ccredit.xtmodules.xtcore.util.DateUtils;
import ccredit.util.DictionaryText;

/**
* as_guarmotgtalctrctinf 企业担保账户抵质押物信息段 
* 2018-04-28 15:41:50  mengbeibei
*/
public class AsGuarmotgtalctrctinf extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	/**主键**/
	private String guarmotgtalctrctinf_id;
	/**借据号**/
	private String serialno;
	/**客户号**/
	private String customid;
	/**抵质押合同个数**/
	private String ccnm;
	/**抵(质)押合同标识号**/
	private String ccc;
	/**最后一次修改日期**/
	private Date lastdate;
	/**最后一次修改日期**/
	private String lastdatetext;
	/**状态位**/
	private String changeflag;
	/**状态位**/
	private String changeflagtext;
	public void setGuarmotgtalctrctinf_id(String guarmotgtalctrctinf_id){
		this.guarmotgtalctrctinf_id=guarmotgtalctrctinf_id;
	}
	public String getGuarmotgtalctrctinf_id(){
		return guarmotgtalctrctinf_id;
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
	public void setCcnm(String ccnm){
		this.ccnm=ccnm;
	}
	public String getCcnm(){
		return ccnm;
	}
	public void setCcc(String ccc){
		this.ccc=ccc;
	}
	public String getCcc(){
		return ccc;
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
