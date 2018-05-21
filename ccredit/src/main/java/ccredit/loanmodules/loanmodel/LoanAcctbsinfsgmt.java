package ccredit.loanmodules.loanmodel;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;
import ccredit.xtmodules.xtcore.util.DateUtils;
import ccredit.util.DictionaryText;

/**
* loan_acctbsinfsgmt 借贷基本信息段 
* 2018-04-27 15:42:33  yangzhou
*/
public class LoanAcctbsinfsgmt extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	/**编号**/
	private String loan_acctbsinfsgmt_id;
	/**借贷业务大类**/
	private String busilines;
	/**借贷业务大类**/
	private String busilinestext;
	/**借贷业务种类细分**/
	private String busidtllines;
	/**借贷业务种类细分**/
	private String busidtllinestext;
	/**开户日期**/
	private Date opendate;
	/**开户日期**/
	private String opendatetext;
	/**币种**/
	private String cy;
	/**币种**/
	private String cytext;
	/**信用额度**/
	private String acctcredline;
	/**借款金额**/
	private String loanamt;
	/**分次放款标志**/
	private String flag;
	/**分次放款标志**/
	private String flagtext;
	/**到期日期**/
	private Date duedate;
	/**到期日期**/
	private String duedatetext;
	/**还款方式**/
	private String repaymode;
	/**还款方式**/
	private String repaymodetext;
	/**还款频率**/
	private String repayfreqcy;
	/**还款频率**/
	private String repayfreqcytext;
	/**业务申请地行政区划代码**/
	private String applybusidist;
	/**担保方式**/
	private String guarmode;
	/**担保方式**/
	private String guarmodetext;
	/**其他还款保证方式**/
	private String othrepyguarway;
	/**其他还款保证方式**/
	private String othrepyguarwaytext;
	/**借款期限分类**/
	private String loantimelimcat;
	/**借款期限分类**/
	private String loantimelimcattext;
	/**贷款发放形式**/
	private String loafrm;
	/**贷款发放形式**/
	private String loafrmtext;
	/**贷款实际投向**/
	private String actinvest;
	/**贷款实际投向**/
	private String actinvesttext;
	/**资金来源**/
	private String fundsou;
	/**资金来源**/
	private String fundsoutext;
	/**资产转让标志**/
	private String assettrandflag;
	/**资产转让标志**/
	private String assettrandflagtext;
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
	public void setLoan_acctbsinfsgmt_id(String loan_acctbsinfsgmt_id){
		this.loan_acctbsinfsgmt_id=loan_acctbsinfsgmt_id;
	}
	public String getLoan_acctbsinfsgmt_id(){
		return loan_acctbsinfsgmt_id;
	}
	public void setBusilinestext( String busilinestext) {
		this.busilinestext = busilinestext;
	}
	public String getBusilinestext() {
		if(this.busilines!=null){
			this.busilinestext= DictionaryText.get("BUSILINESCODE", this.busilines);
		}
		return this.busilinestext;
	}
	public void setBusilines(String busilines){
		this.busilines=busilines;
	}
	public String getBusilines(){
		return busilines;
	}
	public void setBusidtllinestext( String busidtllinestext) {
		this.busidtllinestext = busidtllinestext;
	}
	public String getBusidtllinestext() {
		if(this.busidtllines!=null){
			this.busidtllinestext= DictionaryText.get("BUSIDTLLINESCODE10", this.busidtllines);
		}
		return this.busidtllinestext;
	}
	public void setBusidtllines(String busidtllines){
		this.busidtllines=busidtllines;
	}
	public String getBusidtllines(){
		return busidtllines;
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
	public void setAcctcredline(String acctcredline){
		this.acctcredline=acctcredline;
	}
	public String getAcctcredline(){
		return acctcredline;
	}
	public void setLoanamt(String loanamt){
		this.loanamt=loanamt;
	}
	public String getLoanamt(){
		return loanamt;
	}
	public void setFlagtext( String flagtext) {
		this.flagtext = flagtext;
	}
	public String getFlagtext() {
		if(this.flag!=null){
			this.flagtext= DictionaryText.get("FLAGCODE", this.flag);
		}
		return this.flagtext;
	}
	public void setFlag(String flag){
		this.flag=flag;
	}
	public String getFlag(){
		return flag;
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
	public void setRepaymodetext( String repaymodetext) {
		this.repaymodetext = repaymodetext;
	}
	public String getRepaymodetext() {
		if(this.repaymode!=null){
			this.repaymodetext= DictionaryText.get("REPAYMODECODE1", this.repaymode);
		}
		return this.repaymodetext;
	}
	public void setRepaymode(String repaymode){
		this.repaymode=repaymode;
	}
	public String getRepaymode(){
		return repaymode;
	}
	public void setRepayfreqcytext( String repayfreqcytext) {
		this.repayfreqcytext = repayfreqcytext;
	}
	public String getRepayfreqcytext() {
		if(this.repayfreqcy!=null){
			this.repayfreqcytext= DictionaryText.get("REPAYFREQCYCODE", this.repayfreqcy);
		}
		return this.repayfreqcytext;
	}
	public void setRepayfreqcy(String repayfreqcy){
		this.repayfreqcy=repayfreqcy;
	}
	public String getRepayfreqcy(){
		return repayfreqcy;
	}
	public void setApplybusidist(String applybusidist){
		this.applybusidist=applybusidist;
	}
	public String getApplybusidist(){
		return applybusidist;
	}
	public void setGuarmodetext( String guarmodetext) {
		this.guarmodetext = guarmodetext;
	}
	public String getGuarmodetext() {
		if(this.guarmode!=null){
			this.guarmodetext= DictionaryText.get("GUARMODECODE", this.guarmode);
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
			this.othrepyguarwaytext= DictionaryText.get("OTHREPYGUARWAYCODE", this.othrepyguarway);
		}
		return this.othrepyguarwaytext;
	}
	public void setOthrepyguarway(String othrepyguarway){
		this.othrepyguarway=othrepyguarway;
	}
	public String getOthrepyguarway(){
		return othrepyguarway;
	}
	public void setLoantimelimcattext( String loantimelimcattext) {
		this.loantimelimcattext = loantimelimcattext;
	}
	public String getLoantimelimcattext() {
		if(this.loantimelimcat!=null){
			this.loantimelimcattext= DictionaryText.get("LOANTIMELIMCATCODE", this.loantimelimcat);
		}
		return this.loantimelimcattext;
	}
	public void setLoantimelimcat(String loantimelimcat){
		this.loantimelimcat=loantimelimcat;
	}
	public String getLoantimelimcat(){
		return loantimelimcat;
	}
	public void setLoafrmtext( String loafrmtext) {
		this.loafrmtext = loafrmtext;
	}
	public String getLoafrmtext() {
		if(this.loafrm!=null){
			this.loafrmtext= DictionaryText.get("LOAFRMCODE", this.loafrm);
		}
		return this.loafrmtext;
	}
	public void setLoafrm(String loafrm){
		this.loafrm=loafrm;
	}
	public String getLoafrm(){
		return loafrm;
	}
	public void setActinvesttext( String actinvesttext) {
		this.actinvesttext = actinvesttext;
	}
	public String getActinvesttext() {
		if(this.actinvest!=null){
			this.actinvesttext= DictionaryText.get("ACTINVESTCODE", this.actinvest);
		}
		return this.actinvesttext;
	}
	public void setActinvest(String actinvest){
		this.actinvest=actinvest;
	}
	public String getActinvest(){
		return actinvest;
	}
	public void setFundsoutext( String fundsoutext) {
		this.fundsoutext = fundsoutext;
	}
	public String getFundsoutext() {
		if(this.fundsou!=null){
			this.fundsoutext= DictionaryText.get("FUNDSOUCODE", this.fundsou);
		}
		return this.fundsoutext;
	}
	public void setFundsou(String fundsou){
		this.fundsou=fundsou;
	}
	public String getFundsou(){
		return fundsou;
	}
	public void setAssettrandflagtext( String assettrandflagtext) {
		this.assettrandflagtext = assettrandflagtext;
	}
	public String getAssettrandflagtext() {
		if(this.assettrandflag!=null){
			this.assettrandflagtext= DictionaryText.get("ASSETTRANDFLAGCODE", this.assettrandflag);
		}
		return this.assettrandflagtext;
	}
	public void setAssettrandflag(String assettrandflag){
		this.assettrandflag=assettrandflag;
	}
	public String getAssettrandflag(){
		return assettrandflag;
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
