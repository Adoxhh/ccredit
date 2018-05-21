package ccredit.finmodules.finmodel;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import ccredit.xtmodules.xtcore.util.DateUtils;
import ccredit.util.DictionaryText;

/**
* fin_2007balancesheetsgmt 2007版资产负债表 
* 2018-05-03 14:56:53  yangzhou
*/
public class Fin2007balancesheetsgmt extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	/**编号**/
	private String fin_2007balancesheetsgmt_id;
	/**货币资金**/
	private BigDecimal currencyfunds;
	/**交易性金融资产**/
	private BigDecimal financialassetsheldfortrading;
	/**应收票据**/
	private BigDecimal notesreceivable;
	/**应收账款**/
	private BigDecimal accountsreceivable;
	/**预付账款**/
	private BigDecimal prepayments;
	/**应收利息**/
	private BigDecimal interestreceivable;
	/**应收股利**/
	private BigDecimal dividendsreceivable;
	/**其他应收款**/
	private BigDecimal otherreceivables;
	/**存货**/
	private BigDecimal inventories;
	/**一年内到期的非流动资产**/
	private BigDecimal currentportionofnoncurrentassets;
	/**其他流动资产**/
	private BigDecimal othercurrentassets;
	/**流动资产合计**/
	private BigDecimal totalcurrentassets;
	/**可供出售的金融资产**/
	private BigDecimal financialassetsavailableforsale;
	/**持有至到期投资**/
	private BigDecimal heldtomaturityinvestments;
	/**长期股权投资**/
	private BigDecimal longtermequityinvestment;
	/**长期应收款**/
	private BigDecimal longtermreceivables;
	/**投资性房地产**/
	private BigDecimal investmentproperties;
	/**固定资产**/
	private BigDecimal fixedassets;
	/**在建工程**/
	private BigDecimal constructioninprogress;
	/**工程物资**/
	private BigDecimal constructionmaterials;
	/**固定资产清理**/
	private BigDecimal fixedassetspendingfordisposal;
	/**生产性生物资产**/
	private BigDecimal noncurrentbiologicalassets;
	/**油气资产**/
	private BigDecimal oilandgasassets;
	/**无形资产**/
	private BigDecimal intangibleassets;
	/**开发支出**/
	private BigDecimal developmentdisbursements;
	/**商誉**/
	private BigDecimal goodwill;
	/**长期待摊费用**/
	private BigDecimal longtermdeferredexpenses;
	/**递延所得税资产**/
	private BigDecimal deferredtaxassets;
	/**其他非流动资产**/
	private BigDecimal othernoncurrentassets;
	/**非流动资产合计**/
	private BigDecimal totalnoncurrentassets;
	/**资产总计**/
	private BigDecimal totalassets;
	/**短期借款**/
	private BigDecimal shorttermborrowings;
	/**交易性金融负债**/
	private BigDecimal financialliabilitiesheldfortrading;
	/**应付票据**/
	private BigDecimal notespayable;
	/**应付账款**/
	private BigDecimal accountspayab1e;
	/**预收账款**/
	private BigDecimal receiptsinadvance;
	/**应付利息**/
	private BigDecimal interestpayable;
	/**应付职工薪酬**/
	private BigDecimal employeebenefitspayable;
	/**应交税费**/
	private BigDecimal taxspayable;
	/**应付股利**/
	private BigDecimal dividendspayable;
	/**其他应付款**/
	private BigDecimal otherpayables;
	/**一年内到期的非流动负债**/
	private BigDecimal currentportionoflongtermliabilities;
	/**其他流动负债**/
	private BigDecimal othercurrentliabilities;
	/**流动负债合计**/
	private BigDecimal totalcurrentliabilities;
	/**长期借款**/
	private BigDecimal longtermborrowings;
	/**应付债券**/
	private BigDecimal bondspayables;
	/**长期应付款**/
	private BigDecimal longtermpayables;
	/**专项应付款**/
	private BigDecimal grantspayable;
	/**预计负债**/
	private BigDecimal provisions;
	/**递延所得税负债**/
	private BigDecimal deferredtaxliabilities;
	/**其他非流动负债**/
	private BigDecimal othernoncurrentliabilities;
	/**非流动负债合计**/
	private BigDecimal totalnoncurrentliabilities;
	/**负债合计**/
	private BigDecimal totalliabilities;
	/**实收资本(或股本)**/
	private BigDecimal paidincapitalorsharecapital;
	/**资本公积**/
	private BigDecimal capitalrrserve;
	/**减：库存股**/
	private BigDecimal lesstreasurystocks;
	/**盈余公积**/
	private BigDecimal surplusreserve;
	/**未分配利润**/
	private BigDecimal unappropriatedprofit;
	/**所有者权益合计**/
	private BigDecimal totalequity;
	/**负债和所有者权益合计**/
	private BigDecimal totalequityandliabilities;
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
	public void setFin_2007balancesheetsgmt_id(String fin_2007balancesheetsgmt_id){
		this.fin_2007balancesheetsgmt_id=fin_2007balancesheetsgmt_id;
	}
	public String getFin_2007balancesheetsgmt_id(){
		return fin_2007balancesheetsgmt_id;
	}
	public void setCurrencyfunds(BigDecimal currencyfunds){
		this.currencyfunds=currencyfunds;
	}
	public BigDecimal getCurrencyfunds(){
		return currencyfunds;
	}
	public void setFinancialassetsheldfortrading(BigDecimal financialassetsheldfortrading){
		this.financialassetsheldfortrading=financialassetsheldfortrading;
	}
	public BigDecimal getFinancialassetsheldfortrading(){
		return financialassetsheldfortrading;
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
	public void setInterestreceivable(BigDecimal interestreceivable){
		this.interestreceivable=interestreceivable;
	}
	public BigDecimal getInterestreceivable(){
		return interestreceivable;
	}
	public void setDividendsreceivable(BigDecimal dividendsreceivable){
		this.dividendsreceivable=dividendsreceivable;
	}
	public BigDecimal getDividendsreceivable(){
		return dividendsreceivable;
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
	public void setCurrentportionofnoncurrentassets(BigDecimal currentportionofnoncurrentassets){
		this.currentportionofnoncurrentassets=currentportionofnoncurrentassets;
	}
	public BigDecimal getCurrentportionofnoncurrentassets(){
		return currentportionofnoncurrentassets;
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
	public void setFinancialassetsavailableforsale(BigDecimal financialassetsavailableforsale){
		this.financialassetsavailableforsale=financialassetsavailableforsale;
	}
	public BigDecimal getFinancialassetsavailableforsale(){
		return financialassetsavailableforsale;
	}
	public void setHeldtomaturityinvestments(BigDecimal heldtomaturityinvestments){
		this.heldtomaturityinvestments=heldtomaturityinvestments;
	}
	public BigDecimal getHeldtomaturityinvestments(){
		return heldtomaturityinvestments;
	}
	public void setLongtermequityinvestment(BigDecimal longtermequityinvestment){
		this.longtermequityinvestment=longtermequityinvestment;
	}
	public BigDecimal getLongtermequityinvestment(){
		return longtermequityinvestment;
	}
	public void setLongtermreceivables(BigDecimal longtermreceivables){
		this.longtermreceivables=longtermreceivables;
	}
	public BigDecimal getLongtermreceivables(){
		return longtermreceivables;
	}
	public void setInvestmentproperties(BigDecimal investmentproperties){
		this.investmentproperties=investmentproperties;
	}
	public BigDecimal getInvestmentproperties(){
		return investmentproperties;
	}
	public void setFixedassets(BigDecimal fixedassets){
		this.fixedassets=fixedassets;
	}
	public BigDecimal getFixedassets(){
		return fixedassets;
	}
	public void setConstructioninprogress(BigDecimal constructioninprogress){
		this.constructioninprogress=constructioninprogress;
	}
	public BigDecimal getConstructioninprogress(){
		return constructioninprogress;
	}
	public void setConstructionmaterials(BigDecimal constructionmaterials){
		this.constructionmaterials=constructionmaterials;
	}
	public BigDecimal getConstructionmaterials(){
		return constructionmaterials;
	}
	public void setFixedassetspendingfordisposal(BigDecimal fixedassetspendingfordisposal){
		this.fixedassetspendingfordisposal=fixedassetspendingfordisposal;
	}
	public BigDecimal getFixedassetspendingfordisposal(){
		return fixedassetspendingfordisposal;
	}
	public void setNoncurrentbiologicalassets(BigDecimal noncurrentbiologicalassets){
		this.noncurrentbiologicalassets=noncurrentbiologicalassets;
	}
	public BigDecimal getNoncurrentbiologicalassets(){
		return noncurrentbiologicalassets;
	}
	public void setOilandgasassets(BigDecimal oilandgasassets){
		this.oilandgasassets=oilandgasassets;
	}
	public BigDecimal getOilandgasassets(){
		return oilandgasassets;
	}
	public void setIntangibleassets(BigDecimal intangibleassets){
		this.intangibleassets=intangibleassets;
	}
	public BigDecimal getIntangibleassets(){
		return intangibleassets;
	}
	public void setDevelopmentdisbursements(BigDecimal developmentdisbursements){
		this.developmentdisbursements=developmentdisbursements;
	}
	public BigDecimal getDevelopmentdisbursements(){
		return developmentdisbursements;
	}
	public void setGoodwill(BigDecimal goodwill){
		this.goodwill=goodwill;
	}
	public BigDecimal getGoodwill(){
		return goodwill;
	}
	public void setLongtermdeferredexpenses(BigDecimal longtermdeferredexpenses){
		this.longtermdeferredexpenses=longtermdeferredexpenses;
	}
	public BigDecimal getLongtermdeferredexpenses(){
		return longtermdeferredexpenses;
	}
	public void setDeferredtaxassets(BigDecimal deferredtaxassets){
		this.deferredtaxassets=deferredtaxassets;
	}
	public BigDecimal getDeferredtaxassets(){
		return deferredtaxassets;
	}
	public void setOthernoncurrentassets(BigDecimal othernoncurrentassets){
		this.othernoncurrentassets=othernoncurrentassets;
	}
	public BigDecimal getOthernoncurrentassets(){
		return othernoncurrentassets;
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
	public void setFinancialliabilitiesheldfortrading(BigDecimal financialliabilitiesheldfortrading){
		this.financialliabilitiesheldfortrading=financialliabilitiesheldfortrading;
	}
	public BigDecimal getFinancialliabilitiesheldfortrading(){
		return financialliabilitiesheldfortrading;
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
	public void setInterestpayable(BigDecimal interestpayable){
		this.interestpayable=interestpayable;
	}
	public BigDecimal getInterestpayable(){
		return interestpayable;
	}
	public void setEmployeebenefitspayable(BigDecimal employeebenefitspayable){
		this.employeebenefitspayable=employeebenefitspayable;
	}
	public BigDecimal getEmployeebenefitspayable(){
		return employeebenefitspayable;
	}
	public void setTaxspayable(BigDecimal taxspayable){
		this.taxspayable=taxspayable;
	}
	public BigDecimal getTaxspayable(){
		return taxspayable;
	}
	public void setDividendspayable(BigDecimal dividendspayable){
		this.dividendspayable=dividendspayable;
	}
	public BigDecimal getDividendspayable(){
		return dividendspayable;
	}
	public void setOtherpayables(BigDecimal otherpayables){
		this.otherpayables=otherpayables;
	}
	public BigDecimal getOtherpayables(){
		return otherpayables;
	}
	public void setCurrentportionoflongtermliabilities(BigDecimal currentportionoflongtermliabilities){
		this.currentportionoflongtermliabilities=currentportionoflongtermliabilities;
	}
	public BigDecimal getCurrentportionoflongtermliabilities(){
		return currentportionoflongtermliabilities;
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
	public void setBondspayables(BigDecimal bondspayables){
		this.bondspayables=bondspayables;
	}
	public BigDecimal getBondspayables(){
		return bondspayables;
	}
	public void setLongtermpayables(BigDecimal longtermpayables){
		this.longtermpayables=longtermpayables;
	}
	public BigDecimal getLongtermpayables(){
		return longtermpayables;
	}
	public void setGrantspayable(BigDecimal grantspayable){
		this.grantspayable=grantspayable;
	}
	public BigDecimal getGrantspayable(){
		return grantspayable;
	}
	public void setProvisions(BigDecimal provisions){
		this.provisions=provisions;
	}
	public BigDecimal getProvisions(){
		return provisions;
	}
	public void setDeferredtaxliabilities(BigDecimal deferredtaxliabilities){
		this.deferredtaxliabilities=deferredtaxliabilities;
	}
	public BigDecimal getDeferredtaxliabilities(){
		return deferredtaxliabilities;
	}
	public void setOthernoncurrentliabilities(BigDecimal othernoncurrentliabilities){
		this.othernoncurrentliabilities=othernoncurrentliabilities;
	}
	public BigDecimal getOthernoncurrentliabilities(){
		return othernoncurrentliabilities;
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
	public void setPaidincapitalorsharecapital(BigDecimal paidincapitalorsharecapital){
		this.paidincapitalorsharecapital=paidincapitalorsharecapital;
	}
	public BigDecimal getPaidincapitalorsharecapital(){
		return paidincapitalorsharecapital;
	}
	public void setCapitalrrserve(BigDecimal capitalrrserve){
		this.capitalrrserve=capitalrrserve;
	}
	public BigDecimal getCapitalrrserve(){
		return capitalrrserve;
	}
	public void setLesstreasurystocks(BigDecimal lesstreasurystocks){
		this.lesstreasurystocks=lesstreasurystocks;
	}
	public BigDecimal getLesstreasurystocks(){
		return lesstreasurystocks;
	}
	public void setSurplusreserve(BigDecimal surplusreserve){
		this.surplusreserve=surplusreserve;
	}
	public BigDecimal getSurplusreserve(){
		return surplusreserve;
	}
	public void setUnappropriatedprofit(BigDecimal unappropriatedprofit){
		this.unappropriatedprofit=unappropriatedprofit;
	}
	public BigDecimal getUnappropriatedprofit(){
		return unappropriatedprofit;
	}
	public void setTotalequity(BigDecimal totalequity){
		this.totalequity=totalequity;
	}
	public BigDecimal getTotalequity(){
		return totalequity;
	}
	public void setTotalequityandliabilities(BigDecimal totalequityandliabilities){
		this.totalequityandliabilities=totalequityandliabilities;
	}
	public BigDecimal getTotalequityandliabilities(){
		return totalequityandliabilities;
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
