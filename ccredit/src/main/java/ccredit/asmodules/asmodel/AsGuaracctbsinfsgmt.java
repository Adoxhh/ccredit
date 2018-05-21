package ccredit.asmodules.asmodel;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;
import ccredit.xtmodules.xtcore.util.DateUtils;
import ccredit.util.DictionaryText;

/**
* as_guaracctbsinfsgmt 企业担保账户基本信息段 
* 2018-04-28 15:37:03  mengbeibei
*/
public class AsGuaracctbsinfsgmt extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	/**主键**/
	private String guaracctbsinfsgmt_id;
	/**借据号**/
	private String serialno;
	/**客户号**/
	private String customid;
	/**担保业务大类**/
	private String busilines;
	/**担保业务大类**/
	private String busilinestext;
	/**担保业务种类细分**/
	private String busidtillines;
	/**担保业务种类细分**/
	private String busidtillinestext;
	/**开户日期**/
	private Date opendate;
	/**开户日期**/
	private String opendatetext;
	/**担保金额**/
	private String guaramt;
	/**币种**/
	private String cy;
	/**币种**/
	private String cytext;
	/**到期日期**/
	private Date duedate;
	/**到期日期**/
	private String duedatetext;
	/**反担保方式**/
	private String guarmode;
	/**反担保方式**/
	private String guarmodetext;
	/**其他还款保证方式**/
	private String othrepyguarway;
	/**其他还款保证方式**/
	private String othrepyguarwaytext;
	/**保证金百分比**/
	private String secdep;
	/**担保合同文本编号**/
	private String ctrcttxtcode;
	/**最后一次修改日期**/
	private Date lastdate;
	/**最后一次修改日期**/
	private String lastdatetext;
	/**状态位**/
	private String changeflag;
	/**状态位**/
	private String changeflagtext;
	public void setGuaracctbsinfsgmt_id(String guaracctbsinfsgmt_id){
		this.guaracctbsinfsgmt_id=guaracctbsinfsgmt_id;
	}
	public String getGuaracctbsinfsgmt_id(){
		return guaracctbsinfsgmt_id;
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
	public void setBusilinestext( String busilinestext) {
		this.busilinestext = busilinestext;
	}
	public String getBusilinestext() {
		if(this.busilines!=null){
			this.busilinestext= DictionaryText.get("ASBUSILINESCODE", this.busilines);
		}
		return this.busilinestext;
	}
	public void setBusilines(String busilines){
		this.busilines=busilines;
	}
	public String getBusilines(){
		return busilines;
	}
	public void setBusidtillinestext( String busidtillinestext) {
		this.busidtillinestext = busidtillinestext;
	}
	public String getBusidtillinestext() {
		if(this.busidtillines!=null){
			this.busidtillinestext= DictionaryText.get("ASBUSIDTILLINESCODE", this.busidtillines);
		}
		return this.busidtillinestext;
	}
	public void setBusidtillines(String busidtillines){
		this.busidtillines=busidtillines;
	}
	public String getBusidtillines(){
		return busidtillines;
	}
	public void setOpendatetext(String opendatetext) {
		this.opendatetext = opendatetext;
	}
	public String getOpendatetext() {
		if(this.opendate!=null){
			this.opendatetext = DateUtils.formatDate(this.opendate);
		}
		return this.opendatetext;
	}
	public void setOpendate(Date opendate){
		this.opendate=opendate;
	}
	public Date getOpendate(){
		return opendate;
	}
	public void setGuaramt(String guaramt){
		this.guaramt=guaramt;
	}
	public String getGuaramt(){
		return guaramt;
	}
	public void setCytext( String cytext) {
		this.cytext = cytext;
	}
	public String getCytext() {
		if(this.cy!=null){
			this.cytext= DictionaryText.get("CYCODE", this.cy);
		}
		return this.cytext;
	}
	public void setCy(String cy){
		this.cy=cy;
	}
	public String getCy(){
		return cy;
	}
	public void setDuedatetext(String duedatetext) {
		this.duedatetext = duedatetext;
	}
	public String getDuedatetext() {
		if(this.duedate!=null){
			this.duedatetext = DateUtils.formatDate(this.duedate);
		}
		return this.duedatetext;
	}
	public void setDuedate(Date duedate){
		this.duedate=duedate;
	}
	public Date getDuedate(){
		return duedate;
	}
	public void setGuarmodetext( String guarmodetext) {
		this.guarmodetext = guarmodetext;
	}
	public String getGuarmodetext() {
		if(this.guarmode!=null){
			this.guarmodetext= DictionaryText.get("ASGUARMODECODE", this.guarmode);
		}
		return this.guarmodetext;
	}
	public void setGuarmode(String guarmode){
		this.guarmode=guarmode;
	}
	public String getGuarmode(){
		return guarmode;
	}
	public void setOthrepyguarwaytext( String othrepyguarwaytext) {
		this.othrepyguarwaytext = othrepyguarwaytext;
	}
	public String getOthrepyguarwaytext() {
		if(this.othrepyguarway!=null){
			this.othrepyguarwaytext= DictionaryText.get("ASOTHREPYGUARWAYCODE", this.othrepyguarway);
		}
		return this.othrepyguarwaytext;
	}
	public void setOthrepyguarway(String othrepyguarway){
		this.othrepyguarway=othrepyguarway;
	}
	public String getOthrepyguarway(){
		return othrepyguarway;
	}
	public void setSecdep(String secdep){
		this.secdep=secdep;
	}
	public String getSecdep(){
		return secdep;
	}
	public void setCtrcttxtcode(String ctrcttxtcode){
		this.ctrcttxtcode=ctrcttxtcode;
	}
	public String getCtrcttxtcode(){
		return ctrcttxtcode;
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
