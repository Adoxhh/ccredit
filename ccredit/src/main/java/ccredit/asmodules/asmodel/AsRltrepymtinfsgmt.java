package ccredit.asmodules.asmodel;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;
import ccredit.xtmodules.xtcore.util.DateUtils;
import ccredit.util.DictionaryText;

/**
* as_rltrepymtinfsgmt 企业担保账户相关还款责任人信息段 
* 2018-04-28 15:39:48  mengbeibei
*/
public class AsRltrepymtinfsgmt extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	/**主键**/
	private String rltrepymtinfsgmt_id;
	/**借据号**/
	private String serialno;
	/**客户号**/
	private String customid;
	/**相关还款责任人个数**/
	private String rltrepymtnm;
	/**身份类别**/
	private String infoidtype;
	/**身份类别**/
	private String infoidtypetext;
	/**相关还款责任人名称**/
	private String arlpname;
	/**相关还款责任人身份标识类型**/
	private String arlpcerttype;
	/**相关还款责任人身份标识类型**/
	private String arlpcerttypetext;
	/**相关还款责任人身份标识号码**/
	private String arlpcertnum;
	/**还款责任人类型**/
	private String arlptype;
	/**还款责任人类型**/
	private String arlptypetext;
	/**还款责任金额**/
	private String arlpamt;
	/**最后一次修改日期**/
	private Date lastdate;
	/**最后一次修改日期**/
	private String lastdatetext;
	/**状态位**/
	private String changeflag;
	/**状态位**/
	private String changeflagtext;
	public void setRltrepymtinfsgmt_id(String rltrepymtinfsgmt_id){
		this.rltrepymtinfsgmt_id=rltrepymtinfsgmt_id;
	}
	public String getRltrepymtinfsgmt_id(){
		return rltrepymtinfsgmt_id;
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
	public void setRltrepymtnm(String rltrepymtnm){
		this.rltrepymtnm=rltrepymtnm;
	}
	public String getRltrepymtnm(){
		return rltrepymtnm;
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
	public void setArlpname(String arlpname){
		this.arlpname=arlpname;
	}
	public String getArlpname(){
		return arlpname;
	}
	public void setArlpcerttypetext( String arlpcerttypetext) {
		this.arlpcerttypetext = arlpcerttypetext;
	}
	public String getArlpcerttypetext() {
		if(this.arlpcerttype!=null){
			if(this.infoidtype!=null&&this.infoidtype.equals("1")){
				this.arlpcerttypetext= DictionaryText.get("IDTYPECODE", this.arlpcerttype);
			}
			if(this.infoidtype!=null&&this.infoidtype.equals("2")){
				this.arlpcerttypetext= DictionaryText.get("OTHENTCERTTYPECODE", this.arlpcerttype);
			}
			
		}
		return this.arlpcerttypetext;
	}
	public void setArlpcerttype(String arlpcerttype){
		this.arlpcerttype=arlpcerttype;
	}
	public String getArlpcerttype(){
		return arlpcerttype;
	}
	public void setArlpcertnum(String arlpcertnum){
		this.arlpcertnum=arlpcertnum;
	}
	public String getArlpcertnum(){
		return arlpcertnum;
	}
	public void setArlptypetext( String arlptypetext) {
		this.arlptypetext = arlptypetext;
	}
	public String getArlptypetext() {
		if(this.arlptype!=null){
			this.arlptypetext= DictionaryText.get("ASARLPTYPECODE", this.arlptype);
		}
		return this.arlptypetext;
	}
	public void setArlptype(String arlptype){
		this.arlptype=arlptype;
	}
	public String getArlptype(){
		return arlptype;
	}
	public void setArlpamt(String arlpamt){
		this.arlpamt=arlpamt;
	}
	public String getArlpamt(){
		return arlpamt;
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
