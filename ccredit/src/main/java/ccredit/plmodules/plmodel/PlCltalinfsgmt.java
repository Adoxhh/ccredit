package ccredit.plmodules.plmodel;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;
import ccredit.xtmodules.xtcore.util.DateUtils;
import ccredit.util.DictionaryText;

/**
* pl_cltalinfsgmt 质物信息 
* 2018-04-28 17:08:53  yangzhou
*/
public class PlCltalinfsgmt extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	/**编号**/
	private String pl_cltalinfsgmt_id;
	/**质物种类个数**/
	private String impnm;
	/**质物种类**/
	private String imptype;
	/**质物种类**/
	private String imptypetext;
	/**质物价值**/
	private String impval;
	/**出质人类型**/
	private String ippc;
	/**出质人类型**/
	private String ippctext;
	/**出质人名称**/
	private String pawnname;
	/**出质人身份标识类型**/
	private String pawncerttype;
	/**出质人身份标识类型**/
	private String pawncerttypetext;
	/**出质人身份标识号码**/
	private String pawncertnum;
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
	public void setPl_cltalinfsgmt_id(String pl_cltalinfsgmt_id){
		this.pl_cltalinfsgmt_id=pl_cltalinfsgmt_id;
	}
	public String getPl_cltalinfsgmt_id(){
		return pl_cltalinfsgmt_id;
	}
	public void setImpnm(String impnm){
		this.impnm=impnm;
	}
	public String getImpnm(){
		return impnm;
	}
	public void setImptypetext( String imptypetext) {
		this.imptypetext = imptypetext;
	}
	public String getImptypetext() {
		if(this.imptype!=null){
			this.imptypetext= DictionaryText.get("IMPTYPECODE", this.imptype);
		}
		return this.imptypetext;
	}
	public void setImptype(String imptype){
		this.imptype=imptype;
	}
	public String getImptype(){
		return imptype;
	}
	public void setImpval(String impval){
		this.impval=impval;
	}
	public String getImpval(){
		return impval;
	}
	public void setIppctext( String ippctext) {
		this.ippctext = ippctext;
	}
	public String getIppctext() {
		if(this.ippc!=null){
			this.ippctext= DictionaryText.get("ARLPIDTYPECODE", this.ippc);
		}
		return this.ippctext;
	}
	public void setIppc(String ippc){
		this.ippc=ippc;
	}
	public String getIppc(){
		return ippc;
	}
	public void setPawnname(String pawnname){
		this.pawnname=pawnname;
	}
	public String getPawnname(){
		return pawnname;
	}
	public void setPawncerttypetext( String pawncerttypetext) {
		this.pawncerttypetext = pawncerttypetext;
	}
	public String getPawncerttypetext() {
		if(this.pawncerttype!=null){
			this.pawncerttypetext= DictionaryText.get("IDTYPECODECODE", this.pawncerttype);
		}
		return this.pawncerttypetext;
	}
	public void setPawncerttype(String pawncerttype){
		this.pawncerttype=pawncerttype;
	}
	public String getPawncerttype(){
		return pawncerttype;
	}
	public void setPawncertnum(String pawncertnum){
		this.pawncertnum=pawncertnum;
	}
	public String getPawncertnum(){
		return pawncertnum;
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
