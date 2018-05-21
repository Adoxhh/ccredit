package ccredit.finmodules.finmodel;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import ccredit.xtmodules.xtcore.util.DateUtils;
import ccredit.util.DictionaryText;

/**
* fin_institutionbalancesheetsgmt 事业单位资产负债表 
* 2018-05-03 15:05:22  yangzhou
*/
public class FinInstitutionbalancesheetsgmt extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	/**编号**/
	private String fin_institutionbalancesheetsgmt_id;
	/**货币资金**/
	private BigDecimal currencyfunds;
	/**短期投资**/
	private BigDecimal shortterminvestments;
	/**财政应返还额度**/
	private BigDecimal amountoffinancialreturn;
	/**应收票据**/
	private BigDecimal notesreceivable;
	/**应收账款**/
	private BigDecimal accountsreceivable;
	/**预付账款**/
	private BigDecimal prepayments;
	/**其他应收款**/
	private BigDecimal otherreceivables;
	/**存货**/
	private BigDecimal inventories;
	/**其他流动资产**/
	private BigDecimal othercurrentassets;
	/**流动资产合计**/
	private BigDecimal totalcurrentassets;
	/**长期投资**/
	private BigDecimal longterminvestment;
	/**固定资产**/
	private BigDecimal fixedassets;
	/**固定资产原价**/
	private BigDecimal originalcostoffixedasset;
	/**累计折旧**/
	private BigDecimal fixedassetaccumulateddepreciation;
	/**在建工程**/
	private BigDecimal constructioninprocess;
	/**无形资产**/
	private BigDecimal intangibleassets;
	/**无形资产原价**/
	private BigDecimal originalpriceofintangibleassets;
	/**累计摊销**/
	private BigDecimal accumulatedamortization;
	/**待处置资产损溢**/
	private BigDecimal assetstobeprocessedpendingtheprofit;
	/**非流动资产合计**/
	private BigDecimal totalnoncurrentassets;
	/**资产总计**/
	private BigDecimal totalassets;
	/**短期借款**/
	private BigDecimal shorttermborrowings;
	/**应缴税费**/
	private BigDecimal taxpayable;
	/**应缴国库款**/
	private BigDecimal treasurypayable;
	/**应缴财政专户款**/
	private BigDecimal payablefinancialspecialaccount;
	/**应付职工薪酬**/
	private BigDecimal employeebenefitspayable;
	/**应付票据**/
	private BigDecimal notespayable;
	/**应付账款**/
	private BigDecimal accountspayab1e;
	/**预收账款**/
	private BigDecimal receiptsinadvance;
	/**其他应付款**/
	private BigDecimal otherpayables;
	/**其他流动负债**/
	private BigDecimal othercurrentliabilities;
	/**流动负债合计**/
	private BigDecimal totalcurrentliabilities;
	/**长期借款**/
	private BigDecimal longtermborrowings;
	/**长期应付款**/
	private BigDecimal longtermpayables;
	/**非流动负债合计**/
	private BigDecimal totalnoncurrentliabilities;
	/**负债合计**/
	private BigDecimal totalliabilities;
	/**事业基金**/
	private BigDecimal enterprisefund;
	/**非流动资产基金**/
	private BigDecimal noncurrentassetsfund;
	/**专用基金**/
	private BigDecimal specialpurposefunds;
	/**财政补助结转**/
	private BigDecimal financialaidcarriedover;
	/**财政补助结余**/
	private BigDecimal financialaidbalance;
	/**非财政补助结转**/
	private BigDecimal nonfinancialaidcarriedover;
	/**非财政补助结余**/
	private BigDecimal nonfinancialaidbalance;
	/**事业结余**/
	private BigDecimal undertakingsbalance;
	/**经营结余**/
	private BigDecimal operatingbalance;
	/**净资产合计**/
	private BigDecimal totalnetassets;
	/**负债和净资产总计**/
	private BigDecimal totalliabilitiesandnetassets;
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
	public void setFin_institutionbalancesheetsgmt_id(String fin_institutionbalancesheetsgmt_id){
		this.fin_institutionbalancesheetsgmt_id=fin_institutionbalancesheetsgmt_id;
	}
	public String getFin_institutionbalancesheetsgmt_id(){
		return fin_institutionbalancesheetsgmt_id;
	}
	public void setCurrencyfunds(BigDecimal currencyfunds){
		this.currencyfunds=currencyfunds;
	}
	public BigDecimal getCurrencyfunds(){
		return currencyfunds;
	}
	public void setShortterminvestments(BigDecimal shortterminvestments){
		this.shortterminvestments=shortterminvestments;
	}
	public BigDecimal getShortterminvestments(){
		return shortterminvestments;
	}
	public void setAmountoffinancialreturn(BigDecimal amountoffinancialreturn){
		this.amountoffinancialreturn=amountoffinancialreturn;
	}
	public BigDecimal getAmountoffinancialreturn(){
		return amountoffinancialreturn;
	}
	public void setNotesreceivable(BigDecimal notesreceivable){
		this.notesreceivable=notesreceivable;
	}
	public BigDecimal getNotesreceivable(){
		return notesreceivable;
	}
	public void setAccountsreceivable(BigDecimal accountsreceivable){
		this.accountsreceivable=accountsreceivable;
	}
	public BigDecimal getAccountsreceivable(){
		return accountsreceivable;
	}
	public void setPrepayments(BigDecimal prepayments){
		this.prepayments=prepayments;
	}
	public BigDecimal getPrepayments(){
		return prepayments;
	}
	public void setOtherreceivables(BigDecimal otherreceivables){
		this.otherreceivables=otherreceivables;
	}
	public BigDecimal getOtherreceivables(){
		return otherreceivables;
	}
	public void setInventories(BigDecimal inventories){
		this.inventories=inventories;
	}
	public BigDecimal getInventories(){
		return inventories;
	}
	public void setOthercurrentassets(BigDecimal othercurrentassets){
		this.othercurrentassets=othercurrentassets;
	}
	public BigDecimal getOthercurrentassets(){
		return othercurrentassets;
	}
	public void setTotalcurrentassets(BigDecimal totalcurrentassets){
		this.totalcurrentassets=totalcurrentassets;
	}
	public BigDecimal getTotalcurrentassets(){
		return totalcurrentassets;
	}
	public void setLongterminvestment(BigDecimal longterminvestment){
		this.longterminvestment=longterminvestment;
	}
	public BigDecimal getLongterminvestment(){
		return longterminvestment;
	}
	public void setFixedassets(BigDecimal fixedassets){
		this.fixedassets=fixedassets;
	}
	public BigDecimal getFixedassets(){
		return fixedassets;
	}
	public void setOriginalcostoffixedasset(BigDecimal originalcostoffixedasset){
		this.originalcostoffixedasset=originalcostoffixedasset;
	}
	public BigDecimal getOriginalcostoffixedasset(){
		return originalcostoffixedasset;
	}
	public void setFixedassetaccumulateddepreciation(BigDecimal fixedassetaccumulateddepreciation){
		this.fixedassetaccumulateddepreciation=fixedassetaccumulateddepreciation;
	}
	public BigDecimal getFixedassetaccumulateddepreciation(){
		return fixedassetaccumulateddepreciation;
	}
	public void setConstructioninprocess(BigDecimal constructioninprocess){
		this.constructioninprocess=constructioninprocess;
	}
	public BigDecimal getConstructioninprocess(){
		return constructioninprocess;
	}
	public void setIntangibleassets(BigDecimal intangibleassets){
		this.intangibleassets=intangibleassets;
	}
	public BigDecimal getIntangibleassets(){
		return intangibleassets;
	}
	public void setOriginalpriceofintangibleassets(BigDecimal originalpriceofintangibleassets){
		this.originalpriceofintangibleassets=originalpriceofintangibleassets;
	}
	public BigDecimal getOriginalpriceofintangibleassets(){
		return originalpriceofintangibleassets;
	}
	public void setAccumulatedamortization(BigDecimal accumulatedamortization){
		this.accumulatedamortization=accumulatedamortization;
	}
	public BigDecimal getAccumulatedamortization(){
		return accumulatedamortization;
	}
	public void setAssetstobeprocessedpendingtheprofit(BigDecimal assetstobeprocessedpendingtheprofit){
		this.assetstobeprocessedpendingtheprofit=assetstobeprocessedpendingtheprofit;
	}
	public BigDecimal getAssetstobeprocessedpendingtheprofit(){
		return assetstobeprocessedpendingtheprofit;
	}
	public void setTotalnoncurrentassets(BigDecimal totalnoncurrentassets){
		this.totalnoncurrentassets=totalnoncurrentassets;
	}
	public BigDecimal getTotalnoncurrentassets(){
		return totalnoncurrentassets;
	}
	public void setTotalassets(BigDecimal totalassets){
		this.totalassets=totalassets;
	}
	public BigDecimal getTotalassets(){
		return totalassets;
	}
	public void setShorttermborrowings(BigDecimal shorttermborrowings){
		this.shorttermborrowings=shorttermborrowings;
	}
	public BigDecimal getShorttermborrowings(){
		return shorttermborrowings;
	}
	public void setTaxpayable(BigDecimal taxpayable){
		this.taxpayable=taxpayable;
	}
	public BigDecimal getTaxpayable(){
		return taxpayable;
	}
	public void setTreasurypayable(BigDecimal treasurypayable){
		this.treasurypayable=treasurypayable;
	}
	public BigDecimal getTreasurypayable(){
		return treasurypayable;
	}
	public void setPayablefinancialspecialaccount(BigDecimal payablefinancialspecialaccount){
		this.payablefinancialspecialaccount=payablefinancialspecialaccount;
	}
	public BigDecimal getPayablefinancialspecialaccount(){
		return payablefinancialspecialaccount;
	}
	public void setEmployeebenefitspayable(BigDecimal employeebenefitspayable){
		this.employeebenefitspayable=employeebenefitspayable;
	}
	public BigDecimal getEmployeebenefitspayable(){
		return employeebenefitspayable;
	}
	public void setNotespayable(BigDecimal notespayable){
		this.notespayable=notespayable;
	}
	public BigDecimal getNotespayable(){
		return notespayable;
	}
	public void setAccountspayab1e(BigDecimal accountspayab1e){
		this.accountspayab1e=accountspayab1e;
	}
	public BigDecimal getAccountspayab1e(){
		return accountspayab1e;
	}
	public void setReceiptsinadvance(BigDecimal receiptsinadvance){
		this.receiptsinadvance=receiptsinadvance;
	}
	public BigDecimal getReceiptsinadvance(){
		return receiptsinadvance;
	}
	public void setOtherpayables(BigDecimal otherpayables){
		this.otherpayables=otherpayables;
	}
	public BigDecimal getOtherpayables(){
		return otherpayables;
	}
	public void setOthercurrentliabilities(BigDecimal othercurrentliabilities){
		this.othercurrentliabilities=othercurrentliabilities;
	}
	public BigDecimal getOthercurrentliabilities(){
		return othercurrentliabilities;
	}
	public void setTotalcurrentliabilities(BigDecimal totalcurrentliabilities){
		this.totalcurrentliabilities=totalcurrentliabilities;
	}
	public BigDecimal getTotalcurrentliabilities(){
		return totalcurrentliabilities;
	}
	public void setLongtermborrowings(BigDecimal longtermborrowings){
		this.longtermborrowings=longtermborrowings;
	}
	public BigDecimal getLongtermborrowings(){
		return longtermborrowings;
	}
	public void setLongtermpayables(BigDecimal longtermpayables){
		this.longtermpayables=longtermpayables;
	}
	public BigDecimal getLongtermpayables(){
		return longtermpayables;
	}
	public void setTotalnoncurrentliabilities(BigDecimal totalnoncurrentliabilities){
		this.totalnoncurrentliabilities=totalnoncurrentliabilities;
	}
	public BigDecimal getTotalnoncurrentliabilities(){
		return totalnoncurrentliabilities;
	}
	public void setTotalliabilities(BigDecimal totalliabilities){
		this.totalliabilities=totalliabilities;
	}
	public BigDecimal getTotalliabilities(){
		return totalliabilities;
	}
	public void setEnterprisefund(BigDecimal enterprisefund){
		this.enterprisefund=enterprisefund;
	}
	public BigDecimal getEnterprisefund(){
		return enterprisefund;
	}
	public void setNoncurrentassetsfund(BigDecimal noncurrentassetsfund){
		this.noncurrentassetsfund=noncurrentassetsfund;
	}
	public BigDecimal getNoncurrentassetsfund(){
		return noncurrentassetsfund;
	}
	public void setSpecialpurposefunds(BigDecimal specialpurposefunds){
		this.specialpurposefunds=specialpurposefunds;
	}
	public BigDecimal getSpecialpurposefunds(){
		return specialpurposefunds;
	}
	public void setFinancialaidcarriedover(BigDecimal financialaidcarriedover){
		this.financialaidcarriedover=financialaidcarriedover;
	}
	public BigDecimal getFinancialaidcarriedover(){
		return financialaidcarriedover;
	}
	public void setFinancialaidbalance(BigDecimal financialaidbalance){
		this.financialaidbalance=financialaidbalance;
	}
	public BigDecimal getFinancialaidbalance(){
		return financialaidbalance;
	}
	public void setNonfinancialaidcarriedover(BigDecimal nonfinancialaidcarriedover){
		this.nonfinancialaidcarriedover=nonfinancialaidcarriedover;
	}
	public BigDecimal getNonfinancialaidcarriedover(){
		return nonfinancialaidcarriedover;
	}
	public void setNonfinancialaidbalance(BigDecimal nonfinancialaidbalance){
		this.nonfinancialaidbalance=nonfinancialaidbalance;
	}
	public BigDecimal getNonfinancialaidbalance(){
		return nonfinancialaidbalance;
	}
	public void setUndertakingsbalance(BigDecimal undertakingsbalance){
		this.undertakingsbalance=undertakingsbalance;
	}
	public BigDecimal getUndertakingsbalance(){
		return undertakingsbalance;
	}
	public void setOperatingbalance(BigDecimal operatingbalance){
		this.operatingbalance=operatingbalance;
	}
	public BigDecimal getOperatingbalance(){
		return operatingbalance;
	}
	public void setTotalnetassets(BigDecimal totalnetassets){
		this.totalnetassets=totalnetassets;
	}
	public BigDecimal getTotalnetassets(){
		return totalnetassets;
	}
	public void setTotalliabilitiesandnetassets(BigDecimal totalliabilitiesandnetassets){
		this.totalliabilitiesandnetassets=totalliabilitiesandnetassets;
	}
	public BigDecimal getTotalliabilitiesandnetassets(){
		return totalliabilitiesandnetassets;
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
