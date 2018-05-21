package ccredit.plmodules.plmodel;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;
import ccredit.xtmodules.xtcore.util.DateUtils;
import ccredit.util.DictionaryText;

/**
* pl_motgaproptinfsgmt 抵押物信息 
* 2018-04-28 17:06:08  yangzhou
*/
public class PlMotgaproptinfsgmt extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	/**编号**/
	private String pl_motgaproptinfsgmt_id;
	/**抵押物个数**/
	private String plenm;
	/**抵押物种类**/
	private String pletype;
	/**抵押物种类**/
	private String pletypetext;
	/**抵押物识别号类型**/
	private String motgaproptidtype;
	/**抵押物识别号类型**/
	private String motgaproptidtypetext;
	/**抵押物唯一识别号**/
	private String plecertid;
	/**抵押物位置所在地行政区划**/
	private String pledistr;
	/**抵押物位置所在地行政区划**/
	private String pledistrtext;
	/**抵押物评估价值**/
	private String plevalue;
	/**评估机构类型**/
	private String valorgtype;
	/**评估机构类型**/
	private String valorgtypetext;
	/**抵押物评估日期**/
	private Date valdate;
	/**抵押物评估日期**/
	private String valdatetext;
	/**抵押人类型**/
	private String pledgortype;
	/**抵押人类型**/
	private String pledgortypetext;
	/**抵押人姓名**/
	private String pledgorname;
	/**抵押人身份标识类型**/
	private String pleorcerttype;
	/**抵押人身份标识类型**/
	private String pleorcerttypetext;
	/**抵押人身份标识号码**/
	private String pleorcertnum;
	/**抵押物说明**/
	private String pledesc;
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
	public void setPl_motgaproptinfsgmt_id(String pl_motgaproptinfsgmt_id){
		this.pl_motgaproptinfsgmt_id=pl_motgaproptinfsgmt_id;
	}
	public String getPl_motgaproptinfsgmt_id(){
		return pl_motgaproptinfsgmt_id;
	}
	public void setPlenm(String plenm){
		this.plenm=plenm;
	}
	public String getPlenm(){
		return plenm;
	}
	public void setPletypetext( String pletypetext) {
		this.pletypetext = pletypetext;
	}
	public String getPletypetext() {
		if(this.pletype!=null){
			this.pletypetext= DictionaryText.get("PLETYPECODE", this.pletype);
		}
		return this.pletypetext;
	}
	public void setPletype(String pletype){
		this.pletype=pletype;
	}
	public String getPletype(){
		return pletype;
	}
	public void setMotgaproptidtypetext( String motgaproptidtypetext) {
		this.motgaproptidtypetext = motgaproptidtypetext;
	}
	public String getMotgaproptidtypetext() {
		if(this.motgaproptidtype!=null){
			this.motgaproptidtypetext= DictionaryText.get("MOTGAPROPTIDTYPECODE", this.motgaproptidtype);
		}
		return this.motgaproptidtypetext;
	}
	public void setMotgaproptidtype(String motgaproptidtype){
		this.motgaproptidtype=motgaproptidtype;
	}
	public String getMotgaproptidtype(){
		return motgaproptidtype;
	}
	public void setPlecertid(String plecertid){
		this.plecertid=plecertid;
	}
	public String getPlecertid(){
		return plecertid;
	}
	public void setPledistrtext( String pledistrtext) {
		this.pledistrtext = pledistrtext;
	}
	public String getPledistrtext() {
		if(this.pledistr!=null){
			this.pledistrtext= DictionaryText.get("ADMDIVOFREGCODE", this.pledistr);
		}
		return this.pledistrtext;
	}
	public void setPledistr(String pledistr){
		this.pledistr=pledistr;
	}
	public String getPledistr(){
		return pledistr;
	}
	public void setPlevalue(String plevalue){
		this.plevalue=plevalue;
	}
	public String getPlevalue(){
		return plevalue;
	}
	public void setValorgtypetext( String valorgtypetext) {
		this.valorgtypetext = valorgtypetext;
	}
	public String getValorgtypetext() {
		if(this.valorgtype!=null){
			this.valorgtypetext= DictionaryText.get("VALORGTYPECODE", this.valorgtype);
		}
		return this.valorgtypetext;
	}
	public void setValorgtype(String valorgtype){
		this.valorgtype=valorgtype;
	}
	public String getValorgtype(){
		return valorgtype;
	}
	public void setValdatetext(String valdatetext) {
		this.valdatetext = valdatetext;
	}
	public String getValdatetext() {
		if(this.valdate!=null){
			this.valdatetext = DateUtils.formatDate(this.valdate);
		}
		return this.valdatetext;
	}
	public void setValdate(Date valdate){
		this.valdate=valdate;
	}
	public Date getValdate(){
		return valdate;
	}
	public void setPledgortypetext( String pledgortypetext) {
		this.pledgortypetext = pledgortypetext;
	}
	public String getPledgortypetext() {
		if(this.pledgortype!=null){
			this.pledgortypetext= DictionaryText.get("ARLPIDTYPECODE", this.pledgortype);
		}
		return this.pledgortypetext;
	}
	public void setPledgortype(String pledgortype){
		this.pledgortype=pledgortype;
	}
	public String getPledgortype(){
		return pledgortype;
	}
	public void setPledgorname(String pledgorname){
		this.pledgorname=pledgorname;
	}
	public String getPledgorname(){
		return pledgorname;
	}
	public void setPleorcerttypetext( String pleorcerttypetext) {
		this.pleorcerttypetext = pleorcerttypetext;
	}
	public String getPleorcerttypetext() {
		if(this.pleorcerttype!=null){
			this.pleorcerttypetext= DictionaryText.get("IDTYPECODECODE", this.pleorcerttype);
		}
		return this.pleorcerttypetext;
	}
	public void setPleorcerttype(String pleorcerttype){
		this.pleorcerttype=pleorcerttype;
	}
	public String getPleorcerttype(){
		return pleorcerttype;
	}
	public void setPleorcertnum(String pleorcertnum){
		this.pleorcertnum=pleorcertnum;
	}
	public String getPleorcertnum(){
		return pleorcertnum;
	}
	public void setPledesc(String pledesc){
		this.pledesc=pledesc;
	}
	public String getPledesc(){
		return pledesc;
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
