package ccredit.finmodules.finmodel;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import ccredit.xtmodules.xtcore.util.DateUtils;
import ccredit.util.DictionaryText;

/**
* fin_2002balancesheetsgmt 2002版资产负债表 
* 2018-05-03 14:53:26  yangzhou
*/
public class Fin2002balancesheetsgmt extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	/**编号**/
	private String fin_2002balancesheetsgmt_id;
	/**货币资金**/
	private BigDecimal currencyfunds;
	/**短期投资**/
	private BigDecimal shortterminvestments;
	/**应收票据**/
	private BigDecimal notesreceivable;
	/**应收股利**/
	private BigDecimal dividendsreceivable;
	/**应收利息**/
	private BigDecimal interestreceivable;
	/**应收账款**/
	private BigDecimal accountsreceivable;
	/**其他应收款**/
	private BigDecimal otherreceivables;
	/**预付账款**/
	private BigDecimal prepayments;
	/**期货保证金**/
	private BigDecimal futureguarantee;
	/**应收补贴款**/
	private BigDecimal allowancereceivable;
	/**应收出口退税**/
	private BigDecimal exportdrawbackreceivable;
	/**存货**/
	private BigDecimal inventories;
	/**存货原材料**/
	private BigDecimal rawmaterials;
	/**存货产成品**/
	private BigDecimal finishedproducts;
	/**待摊费用**/
	private BigDecimal deferredexpenses;
	/**待处理流动资产净损失**/
	private BigDecimal unsettledgloncurrentassets;
	/**一年内到期的长期债权投资**/
	private BigDecimal longtermdebentureinvestmentfallingdueinayear;
	/**其他流动资产**/
	private BigDecimal othercurrentassets;
	/**流动资产合计**/
	private BigDecimal totalcurrentassets;
	/**长期投资**/
	private BigDecimal longterminvestment;
	/**长期股权投资**/
	private BigDecimal longtermequityinvestment;
	/**长期债权投资**/
	private BigDecimal longtermsecuritiesinvestment;
	/**合并价差**/
	private BigDecimal incorporatingpricedifference;
	/**长期投资合计**/
	private BigDecimal totallongterminvestment;
	/**固定资产原价**/
	private BigDecimal originalcostoffixedasset;
	/**累计折旧**/
	private BigDecimal fixedassetaccumulateddepreciation;
	/**固定资产净值**/
	private BigDecimal fixedassetsnetvalue;
	/**固定资产值减值准备**/
	private BigDecimal provisionforimpairmentoffixedassets;
	/**固定资产净额**/
	private BigDecimal netvalueoffixedassets;
	/**固定资产清理**/
	private BigDecimal fixedassetspendingfordisposal;
	/**工程物资**/
	private BigDecimal constructionmaterials;
	/**在建工程**/
	private BigDecimal constructioninprogress;
	/**待处理固定资产净损失**/
	private BigDecimal unsettledglonfixedassets;
	/**固定资产合计**/
	private BigDecimal totalfixedassets;
	/**无形资产**/
	private BigDecimal intangibleassets;
	/**(无形资产科目下)土地使用权**/
	private BigDecimal landuserights;
	/**递延资产**/
	private BigDecimal deferredassets;
	/**(递延资产科目下)固定资产修理**/
	private BigDecimal includingfixedassetsrepair;
	/**(递延资产科目下)固定资产改良支出**/
	private BigDecimal improvementexpenditureoffixedassets;
	/**其他长期资产**/
	private BigDecimal otherlongtermassets;
	/**(其他长期资产科目下)特准储备物资**/
	private BigDecimal amongitspeciallyapprovedreservingmaterials;
	/**无形及其他资产合计**/
	private BigDecimal totalintangibleassetsandotherassets;
	/**递延税款借项**/
	private BigDecimal deferredassetsdebits;
	/**资产总计**/
	private BigDecimal totalassets;
	/**短期借款**/
	private BigDecimal shorttermborrowings;
	/**应付票据**/
	private BigDecimal notespayable;
	/**应付账款**/
	private BigDecimal accountspayab1e;
	/**预收账款**/
	private BigDecimal receiptsinadvance;
	/**应付工资**/
	private BigDecimal wagesorsalariespayables;
	/**应付福利费**/
	private BigDecimal employeebenefits;
	/**应付利润**/
	private BigDecimal incomepayab1e;
	/**应交税金**/
	private BigDecimal taxespayable;
	/**其他应交款**/
	private BigDecimal otherpayabletogovernment;
	/**其他应付款**/
	private BigDecimal otherpayable;
	/**预提费用**/
	private BigDecimal provisionforexpenses;
	/**预计负债**/
	private BigDecimal provisions;
	/**一年内到期的长期负债**/
	private BigDecimal longtermliabilitiesduewithinoneyear;
	/**其他流动负债**/
	private BigDecimal othercurrentliabilities;
	/**流动负债合计**/
	private BigDecimal totalcurrentliabilities;
	/**长期借款**/
	private BigDecimal longtermborrowings;
	/**应付债券**/
	private BigDecimal bondspayable;
	/**长期应付款**/
	private BigDecimal longtermpayables;
	/**专项应付款**/
	private BigDecimal grantspayable;
	/**其他长期负债**/
	private BigDecimal otherlongtermliabilities;
	/**(其他长期负债科目下)特准储备基金**/
	private BigDecimal specialreservefund;
	/**长期负债合计**/
	private BigDecimal totallongtermliabilities;
	/**递延税款贷项**/
	private BigDecimal deferredtaxationcredit;
	/**负债合计**/
	private BigDecimal totalliabilities;
	/**少数股东权益**/
	private BigDecimal minorityinterest;
	/**实收资本**/
	private BigDecimal paidincapital;
	/**国家资本**/
	private BigDecimal nationalcapital;
	/**集体资本**/
	private BigDecimal collectivecapital;
	/**法人资本**/
	private BigDecimal legalpersonscapital;
	/**(法人资本科目下)国有法人资本**/
	private BigDecimal stateownedlegalpersonscapital;
	/**(法人资本科目下)集体法人资本**/
	private BigDecimal collectivelegalpersonscapital;
	/**个人资本**/
	private BigDecimal personalcapital;
	/**外商资本**/
	private BigDecimal foreignbusinessmenscapital;
	/**资本公积**/
	private BigDecimal capitalrrserve;
	/**盈余公积**/
	private BigDecimal surplusreserve;
	/**(盈余公积科目下)法定盈余公积**/
	private BigDecimal statutorysurplusreserve;
	/**(盈余公积科目下)公益金**/
	private BigDecimal publicwelfarefund;
	/**(盈余公积科目下)补充流动资本**/
	private BigDecimal supplermentarycurrentcapital;
	/**未确认的投资损失**/
	private BigDecimal unaffirmedinvestmentloss;
	/**未分配利润**/
	private BigDecimal unappropriatedprofit;
	/**外币报表折算差额**/
	private BigDecimal differenceontranslationofforeigncurrencyfinancialstatement;
	/**所有者权益合计**/
	private BigDecimal totalequity;
	/**负债和所有者权益总计**/
	private BigDecimal aandliabilities;
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
	public void setFin_2002balancesheetsgmt_id(String fin_2002balancesheetsgmt_id){
		this.fin_2002balancesheetsgmt_id=fin_2002balancesheetsgmt_id;
	}
	public String getFin_2002balancesheetsgmt_id(){
		return fin_2002balancesheetsgmt_id;
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
	public void setNotesreceivable(BigDecimal notesreceivable){
		this.notesreceivable=notesreceivable;
	}
	public BigDecimal getNotesreceivable(){
		return notesreceivable;
	}
	public void setDividendsreceivable(BigDecimal dividendsreceivable){
		this.dividendsreceivable=dividendsreceivable;
	}
	public BigDecimal getDividendsreceivable(){
		return dividendsreceivable;
	}
	public void setInterestreceivable(BigDecimal interestreceivable){
		this.interestreceivable=interestreceivable;
	}
	public BigDecimal getInterestreceivable(){
		return interestreceivable;
	}
	public void setAccountsreceivable(BigDecimal accountsreceivable){
		this.accountsreceivable=accountsreceivable;
	}
	public BigDecimal getAccountsreceivable(){
		return accountsreceivable;
	}
	public void setOtherreceivables(BigDecimal otherreceivables){
		this.otherreceivables=otherreceivables;
	}
	public BigDecimal getOtherreceivables(){
		return otherreceivables;
	}
	public void setPrepayments(BigDecimal prepayments){
		this.prepayments=prepayments;
	}
	public BigDecimal getPrepayments(){
		return prepayments;
	}
	public void setFutureguarantee(BigDecimal futureguarantee){
		this.futureguarantee=futureguarantee;
	}
	public BigDecimal getFutureguarantee(){
		return futureguarantee;
	}
	public void setAllowancereceivable(BigDecimal allowancereceivable){
		this.allowancereceivable=allowancereceivable;
	}
	public BigDecimal getAllowancereceivable(){
		return allowancereceivable;
	}
	public void setExportdrawbackreceivable(BigDecimal exportdrawbackreceivable){
		this.exportdrawbackreceivable=exportdrawbackreceivable;
	}
	public BigDecimal getExportdrawbackreceivable(){
		return exportdrawbackreceivable;
	}
	public void setInventories(BigDecimal inventories){
		this.inventories=inventories;
	}
	public BigDecimal getInventories(){
		return inventories;
	}
	public void setRawmaterials(BigDecimal rawmaterials){
		this.rawmaterials=rawmaterials;
	}
	public BigDecimal getRawmaterials(){
		return rawmaterials;
	}
	public void setFinishedproducts(BigDecimal finishedproducts){
		this.finishedproducts=finishedproducts;
	}
	public BigDecimal getFinishedproducts(){
		return finishedproducts;
	}
	public void setDeferredexpenses(BigDecimal deferredexpenses){
		this.deferredexpenses=deferredexpenses;
	}
	public BigDecimal getDeferredexpenses(){
		return deferredexpenses;
	}
	public void setUnsettledgloncurrentassets(BigDecimal unsettledgloncurrentassets){
		this.unsettledgloncurrentassets=unsettledgloncurrentassets;
	}
	public BigDecimal getUnsettledgloncurrentassets(){
		return unsettledgloncurrentassets;
	}
	public void setLongtermdebentureinvestmentfallingdueinayear(BigDecimal longtermdebentureinvestmentfallingdueinayear){
		this.longtermdebentureinvestmentfallingdueinayear=longtermdebentureinvestmentfallingdueinayear;
	}
	public BigDecimal getLongtermdebentureinvestmentfallingdueinayear(){
		return longtermdebentureinvestmentfallingdueinayear;
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
	public void setLongtermequityinvestment(BigDecimal longtermequityinvestment){
		this.longtermequityinvestment=longtermequityinvestment;
	}
	public BigDecimal getLongtermequityinvestment(){
		return longtermequityinvestment;
	}
	public void setLongtermsecuritiesinvestment(BigDecimal longtermsecuritiesinvestment){
		this.longtermsecuritiesinvestment=longtermsecuritiesinvestment;
	}
	public BigDecimal getLongtermsecuritiesinvestment(){
		return longtermsecuritiesinvestment;
	}
	public void setIncorporatingpricedifference(BigDecimal incorporatingpricedifference){
		this.incorporatingpricedifference=incorporatingpricedifference;
	}
	public BigDecimal getIncorporatingpricedifference(){
		return incorporatingpricedifference;
	}
	public void setTotallongterminvestment(BigDecimal totallongterminvestment){
		this.totallongterminvestment=totallongterminvestment;
	}
	public BigDecimal getTotallongterminvestment(){
		return totallongterminvestment;
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
	public void setFixedassetsnetvalue(BigDecimal fixedassetsnetvalue){
		this.fixedassetsnetvalue=fixedassetsnetvalue;
	}
	public BigDecimal getFixedassetsnetvalue(){
		return fixedassetsnetvalue;
	}
	public void setProvisionforimpairmentoffixedassets(BigDecimal provisionforimpairmentoffixedassets){
		this.provisionforimpairmentoffixedassets=provisionforimpairmentoffixedassets;
	}
	public BigDecimal getProvisionforimpairmentoffixedassets(){
		return provisionforimpairmentoffixedassets;
	}
	public void setNetvalueoffixedassets(BigDecimal netvalueoffixedassets){
		this.netvalueoffixedassets=netvalueoffixedassets;
	}
	public BigDecimal getNetvalueoffixedassets(){
		return netvalueoffixedassets;
	}
	public void setFixedassetspendingfordisposal(BigDecimal fixedassetspendingfordisposal){
		this.fixedassetspendingfordisposal=fixedassetspendingfordisposal;
	}
	public BigDecimal getFixedassetspendingfordisposal(){
		return fixedassetspendingfordisposal;
	}
	public void setConstructionmaterials(BigDecimal constructionmaterials){
		this.constructionmaterials=constructionmaterials;
	}
	public BigDecimal getConstructionmaterials(){
		return constructionmaterials;
	}
	public void setConstructioninprogress(BigDecimal constructioninprogress){
		this.constructioninprogress=constructioninprogress;
	}
	public BigDecimal getConstructioninprogress(){
		return constructioninprogress;
	}
	public void setUnsettledglonfixedassets(BigDecimal unsettledglonfixedassets){
		this.unsettledglonfixedassets=unsettledglonfixedassets;
	}
	public BigDecimal getUnsettledglonfixedassets(){
		return unsettledglonfixedassets;
	}
	public void setTotalfixedassets(BigDecimal totalfixedassets){
		this.totalfixedassets=totalfixedassets;
	}
	public BigDecimal getTotalfixedassets(){
		return totalfixedassets;
	}
	public void setIntangibleassets(BigDecimal intangibleassets){
		this.intangibleassets=intangibleassets;
	}
	public BigDecimal getIntangibleassets(){
		return intangibleassets;
	}
	public void setLanduserights(BigDecimal landuserights){
		this.landuserights=landuserights;
	}
	public BigDecimal getLanduserights(){
		return landuserights;
	}
	public void setDeferredassets(BigDecimal deferredassets){
		this.deferredassets=deferredassets;
	}
	public BigDecimal getDeferredassets(){
		return deferredassets;
	}
	public void setIncludingfixedassetsrepair(BigDecimal includingfixedassetsrepair){
		this.includingfixedassetsrepair=includingfixedassetsrepair;
	}
	public BigDecimal getIncludingfixedassetsrepair(){
		return includingfixedassetsrepair;
	}
	public void setImprovementexpenditureoffixedassets(BigDecimal improvementexpenditureoffixedassets){
		this.improvementexpenditureoffixedassets=improvementexpenditureoffixedassets;
	}
	public BigDecimal getImprovementexpenditureoffixedassets(){
		return improvementexpenditureoffixedassets;
	}
	public void setOtherlongtermassets(BigDecimal otherlongtermassets){
		this.otherlongtermassets=otherlongtermassets;
	}
	public BigDecimal getOtherlongtermassets(){
		return otherlongtermassets;
	}
	public void setAmongitspeciallyapprovedreservingmaterials(BigDecimal amongitspeciallyapprovedreservingmaterials){
		this.amongitspeciallyapprovedreservingmaterials=amongitspeciallyapprovedreservingmaterials;
	}
	public BigDecimal getAmongitspeciallyapprovedreservingmaterials(){
		return amongitspeciallyapprovedreservingmaterials;
	}
	public void setTotalintangibleassetsandotherassets(BigDecimal totalintangibleassetsandotherassets){
		this.totalintangibleassetsandotherassets=totalintangibleassetsandotherassets;
	}
	public BigDecimal getTotalintangibleassetsandotherassets(){
		return totalintangibleassetsandotherassets;
	}
	public void setDeferredassetsdebits(BigDecimal deferredassetsdebits){
		this.deferredassetsdebits=deferredassetsdebits;
	}
	public BigDecimal getDeferredassetsdebits(){
		return deferredassetsdebits;
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
	public void setWagesorsalariespayables(BigDecimal wagesorsalariespayables){
		this.wagesorsalariespayables=wagesorsalariespayables;
	}
	public BigDecimal getWagesorsalariespayables(){
		return wagesorsalariespayables;
	}
	public void setEmployeebenefits(BigDecimal employeebenefits){
		this.employeebenefits=employeebenefits;
	}
	public BigDecimal getEmployeebenefits(){
		return employeebenefits;
	}
	public void setIncomepayab1e(BigDecimal incomepayab1e){
		this.incomepayab1e=incomepayab1e;
	}
	public BigDecimal getIncomepayab1e(){
		return incomepayab1e;
	}
	public void setTaxespayable(BigDecimal taxespayable){
		this.taxespayable=taxespayable;
	}
	public BigDecimal getTaxespayable(){
		return taxespayable;
	}
	public void setOtherpayabletogovernment(BigDecimal otherpayabletogovernment){
		this.otherpayabletogovernment=otherpayabletogovernment;
	}
	public BigDecimal getOtherpayabletogovernment(){
		return otherpayabletogovernment;
	}
	public void setOtherpayable(BigDecimal otherpayable){
		this.otherpayable=otherpayable;
	}
	public BigDecimal getOtherpayable(){
		return otherpayable;
	}
	public void setProvisionforexpenses(BigDecimal provisionforexpenses){
		this.provisionforexpenses=provisionforexpenses;
	}
	public BigDecimal getProvisionforexpenses(){
		return provisionforexpenses;
	}
	public void setProvisions(BigDecimal provisions){
		this.provisions=provisions;
	}
	public BigDecimal getProvisions(){
		return provisions;
	}
	public void setLongtermliabilitiesduewithinoneyear(BigDecimal longtermliabilitiesduewithinoneyear){
		this.longtermliabilitiesduewithinoneyear=longtermliabilitiesduewithinoneyear;
	}
	public BigDecimal getLongtermliabilitiesduewithinoneyear(){
		return longtermliabilitiesduewithinoneyear;
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
	public void setBondspayable(BigDecimal bondspayable){
		this.bondspayable=bondspayable;
	}
	public BigDecimal getBondspayable(){
		return bondspayable;
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
	public void setOtherlongtermliabilities(BigDecimal otherlongtermliabilities){
		this.otherlongtermliabilities=otherlongtermliabilities;
	}
	public BigDecimal getOtherlongtermliabilities(){
		return otherlongtermliabilities;
	}
	public void setSpecialreservefund(BigDecimal specialreservefund){
		this.specialreservefund=specialreservefund;
	}
	public BigDecimal getSpecialreservefund(){
		return specialreservefund;
	}
	public void setTotallongtermliabilities(BigDecimal totallongtermliabilities){
		this.totallongtermliabilities=totallongtermliabilities;
	}
	public BigDecimal getTotallongtermliabilities(){
		return totallongtermliabilities;
	}
	public void setDeferredtaxationcredit(BigDecimal deferredtaxationcredit){
		this.deferredtaxationcredit=deferredtaxationcredit;
	}
	public BigDecimal getDeferredtaxationcredit(){
		return deferredtaxationcredit;
	}
	public void setTotalliabilities(BigDecimal totalliabilities){
		this.totalliabilities=totalliabilities;
	}
	public BigDecimal getTotalliabilities(){
		return totalliabilities;
	}
	public void setMinorityinterest(BigDecimal minorityinterest){
		this.minorityinterest=minorityinterest;
	}
	public BigDecimal getMinorityinterest(){
		return minorityinterest;
	}
	public void setPaidincapital(BigDecimal paidincapital){
		this.paidincapital=paidincapital;
	}
	public BigDecimal getPaidincapital(){
		return paidincapital;
	}
	public void setNationalcapital(BigDecimal nationalcapital){
		this.nationalcapital=nationalcapital;
	}
	public BigDecimal getNationalcapital(){
		return nationalcapital;
	}
	public void setCollectivecapital(BigDecimal collectivecapital){
		this.collectivecapital=collectivecapital;
	}
	public BigDecimal getCollectivecapital(){
		return collectivecapital;
	}
	public void setLegalpersonscapital(BigDecimal legalpersonscapital){
		this.legalpersonscapital=legalpersonscapital;
	}
	public BigDecimal getLegalpersonscapital(){
		return legalpersonscapital;
	}
	public void setStateownedlegalpersonscapital(BigDecimal stateownedlegalpersonscapital){
		this.stateownedlegalpersonscapital=stateownedlegalpersonscapital;
	}
	public BigDecimal getStateownedlegalpersonscapital(){
		return stateownedlegalpersonscapital;
	}
	public void setCollectivelegalpersonscapital(BigDecimal collectivelegalpersonscapital){
		this.collectivelegalpersonscapital=collectivelegalpersonscapital;
	}
	public BigDecimal getCollectivelegalpersonscapital(){
		return collectivelegalpersonscapital;
	}
	public void setPersonalcapital(BigDecimal personalcapital){
		this.personalcapital=personalcapital;
	}
	public BigDecimal getPersonalcapital(){
		return personalcapital;
	}
	public void setForeignbusinessmenscapital(BigDecimal foreignbusinessmenscapital){
		this.foreignbusinessmenscapital=foreignbusinessmenscapital;
	}
	public BigDecimal getForeignbusinessmenscapital(){
		return foreignbusinessmenscapital;
	}
	public void setCapitalrrserve(BigDecimal capitalrrserve){
		this.capitalrrserve=capitalrrserve;
	}
	public BigDecimal getCapitalrrserve(){
		return capitalrrserve;
	}
	public void setSurplusreserve(BigDecimal surplusreserve){
		this.surplusreserve=surplusreserve;
	}
	public BigDecimal getSurplusreserve(){
		return surplusreserve;
	}
	public void setStatutorysurplusreserve(BigDecimal statutorysurplusreserve){
		this.statutorysurplusreserve=statutorysurplusreserve;
	}
	public BigDecimal getStatutorysurplusreserve(){
		return statutorysurplusreserve;
	}
	public void setPublicwelfarefund(BigDecimal publicwelfarefund){
		this.publicwelfarefund=publicwelfarefund;
	}
	public BigDecimal getPublicwelfarefund(){
		return publicwelfarefund;
	}
	public void setSupplermentarycurrentcapital(BigDecimal supplermentarycurrentcapital){
		this.supplermentarycurrentcapital=supplermentarycurrentcapital;
	}
	public BigDecimal getSupplermentarycurrentcapital(){
		return supplermentarycurrentcapital;
	}
	public void setUnaffirmedinvestmentloss(BigDecimal unaffirmedinvestmentloss){
		this.unaffirmedinvestmentloss=unaffirmedinvestmentloss;
	}
	public BigDecimal getUnaffirmedinvestmentloss(){
		return unaffirmedinvestmentloss;
	}
	public void setUnappropriatedprofit(BigDecimal unappropriatedprofit){
		this.unappropriatedprofit=unappropriatedprofit;
	}
	public BigDecimal getUnappropriatedprofit(){
		return unappropriatedprofit;
	}
	public void setDifferenceontranslationofforeigncurrencyfinancialstatement(BigDecimal differenceontranslationofforeigncurrencyfinancialstatement){
		this.differenceontranslationofforeigncurrencyfinancialstatement=differenceontranslationofforeigncurrencyfinancialstatement;
	}
	public BigDecimal getDifferenceontranslationofforeigncurrencyfinancialstatement(){
		return differenceontranslationofforeigncurrencyfinancialstatement;
	}
	public void setTotalequity(BigDecimal totalequity){
		this.totalequity=totalequity;
	}
	public BigDecimal getTotalequity(){
		return totalequity;
	}
	public void setAandliabilities(BigDecimal aandliabilities){
		this.aandliabilities=aandliabilities;
	}
	public BigDecimal getAandliabilities(){
		return aandliabilities;
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
