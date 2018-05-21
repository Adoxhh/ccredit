package ccredit.plmodules.plmodel;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;
import ccredit.xtmodules.xtcore.util.DateUtils;
import ccredit.util.DictionaryText;

/**
* pl_comrecinfsgmt 抵(质)押合同共同债务人信息 
* 2018-04-28 17:01:31  yangzhou
*/
public class PlComrecinfsgmt extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	/**编号**/
	private String pl_comrecinfsgmt_id;
	/**共同债务人个数**/
	private String grtdnm;
	/**身份类别**/
	private String infoidtype;
	/**身份类别**/
	private String infoidtypetext;
	/**共同债务人名称**/
	private String guarname;
	/**共同债务人身份标识类型**/
	private String guarcerttype;
	/**共同债务人身份标识类型**/
	private String guarcerttypetext;
	/**共同债务人身份标识号码**/
	private String guarcertnum;
	/**借据号**/
	private String serialno;
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
	public void setPl_comrecinfsgmt_id(String pl_comrecinfsgmt_id){
		this.pl_comrecinfsgmt_id=pl_comrecinfsgmt_id;
	}
	public String getPl_comrecinfsgmt_id(){
		return pl_comrecinfsgmt_id;
	}
	public void setGrtdnm(String grtdnm){
		this.grtdnm=grtdnm;
	}
	public String getGrtdnm(){
		return grtdnm;
	}
	public void setInfoidtypetext( String infoidtypetext) {
		this.infoidtypetext = infoidtypetext;
	}
	public String getInfoidtypetext() {
		if(this.infoidtype!=null){
			this.infoidtypetext= DictionaryText.get("ARLPIDTYPECODE", this.infoidtype);
		}
		return this.infoidtypetext;
	}
	public void setInfoidtype(String infoidtype){
		this.infoidtype=infoidtype;
	}
	public String getInfoidtype(){
		return infoidtype;
	}
	public void setGuarname(String guarname){
		this.guarname=guarname;
	}
	public String getGuarname(){
		return guarname;
	}
	public void setGuarcerttypetext( String guarcerttypetext) {
		this.guarcerttypetext = guarcerttypetext;
	}
	public String getGuarcerttypetext() {
		if(this.guarcerttype!=null){
			this.guarcerttypetext= DictionaryText.get("IDTYPECODECODE", this.guarcerttype);
		}
		return this.guarcerttypetext;
	}
	public void setGuarcerttype(String guarcerttype){
		this.guarcerttype=guarcerttype;
	}
	public String getGuarcerttype(){
		return guarcerttype;
	}
	public void setGuarcertnum(String guarcertnum){
		this.guarcertnum=guarcertnum;
	}
	public String getGuarcertnum(){
		return guarcertnum;
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
