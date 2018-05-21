package ccredit.loanmodules.loanmodel;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;
import ccredit.xtmodules.xtcore.util.DateUtils;
import ccredit.util.DictionaryText;

/**
* loan_origcreditorinfsgmt 初始债权说明 
* 2018-04-27 16:32:12  yangzhou
*/
public class LoanOrigcreditorinfsgmt extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	/**编号**/
	private String loan_origcreditorinfsgmt_id;
	/**初始债权人名称**/
	private String initcredname;
	/**初始债权人机构代码**/
	private String initcedorgcode;
	/**原债务种类**/
	private String origdbtcate;
	/**原债务种类**/
	private String origdbtcatetext;
	/**债权转移时的还款状态**/
	private String initrpysts;
	/**债权转移时的还款状态**/
	private String initrpyststext;
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
	public void setLoan_origcreditorinfsgmt_id(String loan_origcreditorinfsgmt_id){
		this.loan_origcreditorinfsgmt_id=loan_origcreditorinfsgmt_id;
	}
	public String getLoan_origcreditorinfsgmt_id(){
		return loan_origcreditorinfsgmt_id;
	}
	public void setInitcredname(String initcredname){
		this.initcredname=initcredname;
	}
	public String getInitcredname(){
		return initcredname;
	}
	public void setInitcedorgcode(String initcedorgcode){
		this.initcedorgcode=initcedorgcode;
	}
	public String getInitcedorgcode(){
		return initcedorgcode;
	}
	public void setOrigdbtcatetext( String origdbtcatetext) {
		this.origdbtcatetext = origdbtcatetext;
	}
	public String getOrigdbtcatetext() {
		if(this.origdbtcate!=null){
			this.origdbtcatetext= DictionaryText.get("ORIGDBTCATECODE", this.origdbtcate);
		}
		return this.origdbtcatetext;
	}
	public void setOrigdbtcate(String origdbtcate){
		this.origdbtcate=origdbtcate;
	}
	public String getOrigdbtcate(){
		return origdbtcate;
	}
	public void setInitrpyststext( String initrpyststext) {
		this.initrpyststext = initrpyststext;
	}
	public String getInitrpyststext() {
		if(this.initrpysts!=null){
			this.initrpyststext= DictionaryText.get("INITRPYSTSCODE", this.initrpysts);
		}
		return this.initrpyststext;
	}
	public void setInitrpysts(String initrpysts){
		this.initrpysts=initrpysts;
	}
	public String getInitrpysts(){
		return initrpysts;
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
