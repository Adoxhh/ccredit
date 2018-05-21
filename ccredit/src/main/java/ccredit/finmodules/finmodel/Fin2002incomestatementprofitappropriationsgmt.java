package ccredit.finmodules.finmodel;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import ccredit.xtmodules.xtcore.util.DateUtils;
import ccredit.util.DictionaryText;

/**
* fin_2002incomestatementprofitappropriationsgmt 2002版利润及利润分配表 
* 2018-05-03 14:55:47  yangzhou
*/
public class Fin2002incomestatementprofitappropriationsgmt extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	/**编号**/
	private String fin_2002incomestatementprofitappropriationsgmt_id;
	/**主营业务收入**/
	private BigDecimal mainrevenuefrevenue;
	/**(主营业务收入科目下)出口产品销售收入**/
	private BigDecimal salesincomeofexportgoodsproducts;
	/**(主营业务收入科目下)进口产品销售收入**/
	private BigDecimal salesincomeofimportgoodsproducts;
	/**销售折扣与折让**/
	private BigDecimal discountandallowance;
	/**主营业务收入净额**/
	private BigDecimal netamountofincomefrommainbusiness;
	/**主营业务成本**/
	private BigDecimal mainoperatingcost;
	/**(主营业务成本科目下)出口产品销售成本**/
	private BigDecimal salesincomeofexportproducts;
	/**主营业务税金及附加**/
	private BigDecimal principlebusinesstaxandextracharge;
	/**经营费用**/
	private BigDecimal operationexpense;
	/**其他(业务成本)**/
	private BigDecimal othersoperatingcost;
	/**递延收益**/
	private BigDecimal deferredincome;
	/**代购代销收入**/
	private BigDecimal incomefromsalesagency;
	/**其他(收入)**/
	private BigDecimal otheroperatingincome;
	/**主营业务利润**/
	private BigDecimal principlebusinessprofit;
	/**其他业务利润**/
	private BigDecimal otherbusinessprofit;
	/**营业费用**/
	private BigDecimal sellingexpenses;
	/**管理费用**/
	private BigDecimal generalandadministrativeexpenses;
	/**财务费用**/
	private BigDecimal financialexpenses;
	/**其他(费用)**/
	private BigDecimal othersexpenses;
	/**营业利润**/
	private BigDecimal operatingprofits;
	/**投资收益**/
	private BigDecimal investmentincome;
	/**期货收益**/
	private BigDecimal futuresincome;
	/**补贴收入**/
	private BigDecimal allowanceincome;
	/**(补贴收入科目下)补贴前亏损的企业补贴收入**/
	private BigDecimal allowanceincomebeforeallowance;
	/**营业外收入**/
	private BigDecimal nonoperatingincome;
	/**(营业外收入科目下)处置固定资产净收益**/
	private BigDecimal netgainondisposaloffixedassets;
	/**(营业外收入科目下)非货币性交易收益**/
	private BigDecimal incomefromnoncurrencytrade;
	/**(营业外收入科目下)出售无形资产收益**/
	private BigDecimal incomefromsalesofintangibleassets;
	/**(营业外收入科目下)罚款净收入**/
	private BigDecimal incomefrompenalty;
	/**其他(利润)**/
	private BigDecimal othersincome;
	/**(其他科目下)用以前年度含量工资节余弥补利润**/
	private BigDecimal calculatingfromthecontentsalarybefore;
	/**营业外支出**/
	private BigDecimal nonoperatingexpenses;
	/**(营业外支出科目下)处置固定资产净损失**/
	private BigDecimal lossfromdisposaloffixedassets;
	/**(营业外支出科目下)债务重组损失**/
	private BigDecimal exchangeofnonmonetaryassetsloss;
	/**(营业外支出科目下)罚款支出**/
	private BigDecimal lossoflawsuits;
	/**(营业外支出科目下)捐赠支出**/
	private BigDecimal paymentfordonation;
	/**其他支出**/
	private BigDecimal otherpayments;
	/**(其他支出)结转的含量工资包干节余**/
	private BigDecimal balanceofcontentsalary;
	/**利润总额**/
	private BigDecimal totalprofit;
	/**所得税**/
	private BigDecimal incometax;
	/**少数股东损益**/
	private BigDecimal imparimentloss;
	/**未确认的投资损失**/
	private BigDecimal unrealizedinvestmentlosses;
	/**净利润**/
	private BigDecimal netprofit;
	/**年初未分配利润**/
	private BigDecimal profitdistributionatbeginningofperiod;
	/**盈余公积补亏**/
	private BigDecimal compensationofsurplusreserve;
	/**其他调整因素**/
	private BigDecimal otheradjustmentfactors;
	/**可供分配的利润**/
	private BigDecimal profitavailablefordistribution;
	/**单项留用的利润**/
	private BigDecimal profitreservedforasingleitem;
	/**补充流动资本**/
	private BigDecimal supplementarycurrentcapital;
	/**提取法定盈余公积**/
	private BigDecimal appropriationofstatutorysurplusreserves;
	/**提取法定公益金**/
	private BigDecimal appropriationofstatutorywelfarefund;
	/**提取职工奖励及福利基金**/
	private BigDecimal appropriationofstaffincentiveandwelfarefund;
	/**提取储备基金**/
	private BigDecimal appropriationofreservefund;
	/**提取企业发展基金**/
	private BigDecimal appropriationofenterpriseexpansionfund;
	/**利润归还投资**/
	private BigDecimal profitscapitalizadon;
	/**(可供分配的利润科目下)其他**/
	private BigDecimal returnofinvestmentothers;
	/**可供投资者分配的利润**/
	private BigDecimal profitavailableforownersdistribution;
	/**应付优先股股利**/
	private BigDecimal preferredstockdividendspayable;
	/**提取任意盈余公积**/
	private BigDecimal withdrawalothercommonaccumulationfund;
	/**应付普通股股利**/
	private BigDecimal payabledividendsofcommonstock;
	/**转作资本的普通股股利**/
	private BigDecimal transferfromordinarysharesdividendtopaidincapitalorstock;
	/**(可供投资者分配的利润科目下)其他**/
	private BigDecimal others;
	/**未分配利润**/
	private BigDecimal unappropriatedprofit;
	/**(未分配利润科目下)应由以后年度税前利润弥补的亏损**/
	private BigDecimal losscompensatedbeforethetax;
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
	public void setFin_2002incomestatementprofitappropriationsgmt_id(String fin_2002incomestatementprofitappropriationsgmt_id){
		this.fin_2002incomestatementprofitappropriationsgmt_id=fin_2002incomestatementprofitappropriationsgmt_id;
	}
	public String getFin_2002incomestatementprofitappropriationsgmt_id(){
		return fin_2002incomestatementprofitappropriationsgmt_id;
	}
	public void setMainrevenuefrevenue(BigDecimal mainrevenuefrevenue){
		this.mainrevenuefrevenue=mainrevenuefrevenue;
	}
	public BigDecimal getMainrevenuefrevenue(){
		return mainrevenuefrevenue;
	}
	public void setSalesincomeofexportgoodsproducts(BigDecimal salesincomeofexportgoodsproducts){
		this.salesincomeofexportgoodsproducts=salesincomeofexportgoodsproducts;
	}
	public BigDecimal getSalesincomeofexportgoodsproducts(){
		return salesincomeofexportgoodsproducts;
	}
	public void setSalesincomeofimportgoodsproducts(BigDecimal salesincomeofimportgoodsproducts){
		this.salesincomeofimportgoodsproducts=salesincomeofimportgoodsproducts;
	}
	public BigDecimal getSalesincomeofimportgoodsproducts(){
		return salesincomeofimportgoodsproducts;
	}
	public void setDiscountandallowance(BigDecimal discountandallowance){
		this.discountandallowance=discountandallowance;
	}
	public BigDecimal getDiscountandallowance(){
		return discountandallowance;
	}
	public void setNetamountofincomefrommainbusiness(BigDecimal netamountofincomefrommainbusiness){
		this.netamountofincomefrommainbusiness=netamountofincomefrommainbusiness;
	}
	public BigDecimal getNetamountofincomefrommainbusiness(){
		return netamountofincomefrommainbusiness;
	}
	public void setMainoperatingcost(BigDecimal mainoperatingcost){
		this.mainoperatingcost=mainoperatingcost;
	}
	public BigDecimal getMainoperatingcost(){
		return mainoperatingcost;
	}
	public void setSalesincomeofexportproducts(BigDecimal salesincomeofexportproducts){
		this.salesincomeofexportproducts=salesincomeofexportproducts;
	}
	public BigDecimal getSalesincomeofexportproducts(){
		return salesincomeofexportproducts;
	}
	public void setPrinciplebusinesstaxandextracharge(BigDecimal principlebusinesstaxandextracharge){
		this.principlebusinesstaxandextracharge=principlebusinesstaxandextracharge;
	}
	public BigDecimal getPrinciplebusinesstaxandextracharge(){
		return principlebusinesstaxandextracharge;
	}
	public void setOperationexpense(BigDecimal operationexpense){
		this.operationexpense=operationexpense;
	}
	public BigDecimal getOperationexpense(){
		return operationexpense;
	}
	public void setOthersoperatingcost(BigDecimal othersoperatingcost){
		this.othersoperatingcost=othersoperatingcost;
	}
	public BigDecimal getOthersoperatingcost(){
		return othersoperatingcost;
	}
	public void setDeferredincome(BigDecimal deferredincome){
		this.deferredincome=deferredincome;
	}
	public BigDecimal getDeferredincome(){
		return deferredincome;
	}
	public void setIncomefromsalesagency(BigDecimal incomefromsalesagency){
		this.incomefromsalesagency=incomefromsalesagency;
	}
	public BigDecimal getIncomefromsalesagency(){
		return incomefromsalesagency;
	}
	public void setOtheroperatingincome(BigDecimal otheroperatingincome){
		this.otheroperatingincome=otheroperatingincome;
	}
	public BigDecimal getOtheroperatingincome(){
		return otheroperatingincome;
	}
	public void setPrinciplebusinessprofit(BigDecimal principlebusinessprofit){
		this.principlebusinessprofit=principlebusinessprofit;
	}
	public BigDecimal getPrinciplebusinessprofit(){
		return principlebusinessprofit;
	}
	public void setOtherbusinessprofit(BigDecimal otherbusinessprofit){
		this.otherbusinessprofit=otherbusinessprofit;
	}
	public BigDecimal getOtherbusinessprofit(){
		return otherbusinessprofit;
	}
	public void setSellingexpenses(BigDecimal sellingexpenses){
		this.sellingexpenses=sellingexpenses;
	}
	public BigDecimal getSellingexpenses(){
		return sellingexpenses;
	}
	public void setGeneralandadministrativeexpenses(BigDecimal generalandadministrativeexpenses){
		this.generalandadministrativeexpenses=generalandadministrativeexpenses;
	}
	public BigDecimal getGeneralandadministrativeexpenses(){
		return generalandadministrativeexpenses;
	}
	public void setFinancialexpenses(BigDecimal financialexpenses){
		this.financialexpenses=financialexpenses;
	}
	public BigDecimal getFinancialexpenses(){
		return financialexpenses;
	}
	public void setOthersexpenses(BigDecimal othersexpenses){
		this.othersexpenses=othersexpenses;
	}
	public BigDecimal getOthersexpenses(){
		return othersexpenses;
	}
	public void setOperatingprofits(BigDecimal operatingprofits){
		this.operatingprofits=operatingprofits;
	}
	public BigDecimal getOperatingprofits(){
		return operatingprofits;
	}
	public void setInvestmentincome(BigDecimal investmentincome){
		this.investmentincome=investmentincome;
	}
	public BigDecimal getInvestmentincome(){
		return investmentincome;
	}
	public void setFuturesincome(BigDecimal futuresincome){
		this.futuresincome=futuresincome;
	}
	public BigDecimal getFuturesincome(){
		return futuresincome;
	}
	public void setAllowanceincome(BigDecimal allowanceincome){
		this.allowanceincome=allowanceincome;
	}
	public BigDecimal getAllowanceincome(){
		return allowanceincome;
	}
	public void setAllowanceincomebeforeallowance(BigDecimal allowanceincomebeforeallowance){
		this.allowanceincomebeforeallowance=allowanceincomebeforeallowance;
	}
	public BigDecimal getAllowanceincomebeforeallowance(){
		return allowanceincomebeforeallowance;
	}
	public void setNonoperatingincome(BigDecimal nonoperatingincome){
		this.nonoperatingincome=nonoperatingincome;
	}
	public BigDecimal getNonoperatingincome(){
		return nonoperatingincome;
	}
	public void setNetgainondisposaloffixedassets(BigDecimal netgainondisposaloffixedassets){
		this.netgainondisposaloffixedassets=netgainondisposaloffixedassets;
	}
	public BigDecimal getNetgainondisposaloffixedassets(){
		return netgainondisposaloffixedassets;
	}
	public void setIncomefromnoncurrencytrade(BigDecimal incomefromnoncurrencytrade){
		this.incomefromnoncurrencytrade=incomefromnoncurrencytrade;
	}
	public BigDecimal getIncomefromnoncurrencytrade(){
		return incomefromnoncurrencytrade;
	}
	public void setIncomefromsalesofintangibleassets(BigDecimal incomefromsalesofintangibleassets){
		this.incomefromsalesofintangibleassets=incomefromsalesofintangibleassets;
	}
	public BigDecimal getIncomefromsalesofintangibleassets(){
		return incomefromsalesofintangibleassets;
	}
	public void setIncomefrompenalty(BigDecimal incomefrompenalty){
		this.incomefrompenalty=incomefrompenalty;
	}
	public BigDecimal getIncomefrompenalty(){
		return incomefrompenalty;
	}
	public void setOthersincome(BigDecimal othersincome){
		this.othersincome=othersincome;
	}
	public BigDecimal getOthersincome(){
		return othersincome;
	}
	public void setCalculatingfromthecontentsalarybefore(BigDecimal calculatingfromthecontentsalarybefore){
		this.calculatingfromthecontentsalarybefore=calculatingfromthecontentsalarybefore;
	}
	public BigDecimal getCalculatingfromthecontentsalarybefore(){
		return calculatingfromthecontentsalarybefore;
	}
	public void setNonoperatingexpenses(BigDecimal nonoperatingexpenses){
		this.nonoperatingexpenses=nonoperatingexpenses;
	}
	public BigDecimal getNonoperatingexpenses(){
		return nonoperatingexpenses;
	}
	public void setLossfromdisposaloffixedassets(BigDecimal lossfromdisposaloffixedassets){
		this.lossfromdisposaloffixedassets=lossfromdisposaloffixedassets;
	}
	public BigDecimal getLossfromdisposaloffixedassets(){
		return lossfromdisposaloffixedassets;
	}
	public void setExchangeofnonmonetaryassetsloss(BigDecimal exchangeofnonmonetaryassetsloss){
		this.exchangeofnonmonetaryassetsloss=exchangeofnonmonetaryassetsloss;
	}
	public BigDecimal getExchangeofnonmonetaryassetsloss(){
		return exchangeofnonmonetaryassetsloss;
	}
	public void setLossoflawsuits(BigDecimal lossoflawsuits){
		this.lossoflawsuits=lossoflawsuits;
	}
	public BigDecimal getLossoflawsuits(){
		return lossoflawsuits;
	}
	public void setPaymentfordonation(BigDecimal paymentfordonation){
		this.paymentfordonation=paymentfordonation;
	}
	public BigDecimal getPaymentfordonation(){
		return paymentfordonation;
	}
	public void setOtherpayments(BigDecimal otherpayments){
		this.otherpayments=otherpayments;
	}
	public BigDecimal getOtherpayments(){
		return otherpayments;
	}
	public void setBalanceofcontentsalary(BigDecimal balanceofcontentsalary){
		this.balanceofcontentsalary=balanceofcontentsalary;
	}
	public BigDecimal getBalanceofcontentsalary(){
		return balanceofcontentsalary;
	}
	public void setTotalprofit(BigDecimal totalprofit){
		this.totalprofit=totalprofit;
	}
	public BigDecimal getTotalprofit(){
		return totalprofit;
	}
	public void setIncometax(BigDecimal incometax){
		this.incometax=incometax;
	}
	public BigDecimal getIncometax(){
		return incometax;
	}
	public void setImparimentloss(BigDecimal imparimentloss){
		this.imparimentloss=imparimentloss;
	}
	public BigDecimal getImparimentloss(){
		return imparimentloss;
	}
	public void setUnrealizedinvestmentlosses(BigDecimal unrealizedinvestmentlosses){
		this.unrealizedinvestmentlosses=unrealizedinvestmentlosses;
	}
	public BigDecimal getUnrealizedinvestmentlosses(){
		return unrealizedinvestmentlosses;
	}
	public void setNetprofit(BigDecimal netprofit){
		this.netprofit=netprofit;
	}
	public BigDecimal getNetprofit(){
		return netprofit;
	}
	public void setProfitdistributionatbeginningofperiod(BigDecimal profitdistributionatbeginningofperiod){
		this.profitdistributionatbeginningofperiod=profitdistributionatbeginningofperiod;
	}
	public BigDecimal getProfitdistributionatbeginningofperiod(){
		return profitdistributionatbeginningofperiod;
	}
	public void setCompensationofsurplusreserve(BigDecimal compensationofsurplusreserve){
		this.compensationofsurplusreserve=compensationofsurplusreserve;
	}
	public BigDecimal getCompensationofsurplusreserve(){
		return compensationofsurplusreserve;
	}
	public void setOtheradjustmentfactors(BigDecimal otheradjustmentfactors){
		this.otheradjustmentfactors=otheradjustmentfactors;
	}
	public BigDecimal getOtheradjustmentfactors(){
		return otheradjustmentfactors;
	}
	public void setProfitavailablefordistribution(BigDecimal profitavailablefordistribution){
		this.profitavailablefordistribution=profitavailablefordistribution;
	}
	public BigDecimal getProfitavailablefordistribution(){
		return profitavailablefordistribution;
	}
	public void setProfitreservedforasingleitem(BigDecimal profitreservedforasingleitem){
		this.profitreservedforasingleitem=profitreservedforasingleitem;
	}
	public BigDecimal getProfitreservedforasingleitem(){
		return profitreservedforasingleitem;
	}
	public void setSupplementarycurrentcapital(BigDecimal supplementarycurrentcapital){
		this.supplementarycurrentcapital=supplementarycurrentcapital;
	}
	public BigDecimal getSupplementarycurrentcapital(){
		return supplementarycurrentcapital;
	}
	public void setAppropriationofstatutorysurplusreserves(BigDecimal appropriationofstatutorysurplusreserves){
		this.appropriationofstatutorysurplusreserves=appropriationofstatutorysurplusreserves;
	}
	public BigDecimal getAppropriationofstatutorysurplusreserves(){
		return appropriationofstatutorysurplusreserves;
	}
	public void setAppropriationofstatutorywelfarefund(BigDecimal appropriationofstatutorywelfarefund){
		this.appropriationofstatutorywelfarefund=appropriationofstatutorywelfarefund;
	}
	public BigDecimal getAppropriationofstatutorywelfarefund(){
		return appropriationofstatutorywelfarefund;
	}
	public void setAppropriationofstaffincentiveandwelfarefund(BigDecimal appropriationofstaffincentiveandwelfarefund){
		this.appropriationofstaffincentiveandwelfarefund=appropriationofstaffincentiveandwelfarefund;
	}
	public BigDecimal getAppropriationofstaffincentiveandwelfarefund(){
		return appropriationofstaffincentiveandwelfarefund;
	}
	public void setAppropriationofreservefund(BigDecimal appropriationofreservefund){
		this.appropriationofreservefund=appropriationofreservefund;
	}
	public BigDecimal getAppropriationofreservefund(){
		return appropriationofreservefund;
	}
	public void setAppropriationofenterpriseexpansionfund(BigDecimal appropriationofenterpriseexpansionfund){
		this.appropriationofenterpriseexpansionfund=appropriationofenterpriseexpansionfund;
	}
	public BigDecimal getAppropriationofenterpriseexpansionfund(){
		return appropriationofenterpriseexpansionfund;
	}
	public void setProfitscapitalizadon(BigDecimal profitscapitalizadon){
		this.profitscapitalizadon=profitscapitalizadon;
	}
	public BigDecimal getProfitscapitalizadon(){
		return profitscapitalizadon;
	}
	public void setReturnofinvestmentothers(BigDecimal returnofinvestmentothers){
		this.returnofinvestmentothers=returnofinvestmentothers;
	}
	public BigDecimal getReturnofinvestmentothers(){
		return returnofinvestmentothers;
	}
	public void setProfitavailableforownersdistribution(BigDecimal profitavailableforownersdistribution){
		this.profitavailableforownersdistribution=profitavailableforownersdistribution;
	}
	public BigDecimal getProfitavailableforownersdistribution(){
		return profitavailableforownersdistribution;
	}
	public void setPreferredstockdividendspayable(BigDecimal preferredstockdividendspayable){
		this.preferredstockdividendspayable=preferredstockdividendspayable;
	}
	public BigDecimal getPreferredstockdividendspayable(){
		return preferredstockdividendspayable;
	}
	public void setWithdrawalothercommonaccumulationfund(BigDecimal withdrawalothercommonaccumulationfund){
		this.withdrawalothercommonaccumulationfund=withdrawalothercommonaccumulationfund;
	}
	public BigDecimal getWithdrawalothercommonaccumulationfund(){
		return withdrawalothercommonaccumulationfund;
	}
	public void setPayabledividendsofcommonstock(BigDecimal payabledividendsofcommonstock){
		this.payabledividendsofcommonstock=payabledividendsofcommonstock;
	}
	public BigDecimal getPayabledividendsofcommonstock(){
		return payabledividendsofcommonstock;
	}
	public void setTransferfromordinarysharesdividendtopaidincapitalorstock(BigDecimal transferfromordinarysharesdividendtopaidincapitalorstock){
		this.transferfromordinarysharesdividendtopaidincapitalorstock=transferfromordinarysharesdividendtopaidincapitalorstock;
	}
	public BigDecimal getTransferfromordinarysharesdividendtopaidincapitalorstock(){
		return transferfromordinarysharesdividendtopaidincapitalorstock;
	}
	public void setOthers(BigDecimal others){
		this.others=others;
	}
	public BigDecimal getOthers(){
		return others;
	}
	public void setUnappropriatedprofit(BigDecimal unappropriatedprofit){
		this.unappropriatedprofit=unappropriatedprofit;
	}
	public BigDecimal getUnappropriatedprofit(){
		return unappropriatedprofit;
	}
	public void setLosscompensatedbeforethetax(BigDecimal losscompensatedbeforethetax){
		this.losscompensatedbeforethetax=losscompensatedbeforethetax;
	}
	public BigDecimal getLosscompensatedbeforethetax(){
		return losscompensatedbeforethetax;
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
