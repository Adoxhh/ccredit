package ccredit.finmodules.finmodel;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import ccredit.xtmodules.xtcore.util.DateUtils;
import ccredit.util.DictionaryText;

/**
* fin_2002cashflowssgmt 2002版现金流量表 
* 2018-05-03 14:54:38  yangzhou
*/
public class Fin2002cashflowssgmt extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	/**编号**/
	private String fin_2002cashflowssgmt_id;
	/**销售商品和提供劳务收到的现金**/
	private BigDecimal cashreceivedfromsalesofgoodsorrendingofservices;
	/**收到的税费返还**/
	private BigDecimal taxrefunds;
	/**收到的其他与经营活动有关的现金**/
	private BigDecimal othercashreceivedrelatingtooperatingactivities;
	/**经营活动现金流入小计**/
	private BigDecimal totalcashinflowsfromoperatingactivities;
	/**购买商品、接受劳务支付的现金**/
	private BigDecimal cashpaidforgoodsandservices;
	/**支付给职工以及为职工支付的现金**/
	private BigDecimal cashpaidtoandonbehalfofemployees;
	/**支付的各项税费**/
	private BigDecimal paymentsofalltypesoftaxes;
	/**支付的其他与经营活动有关的现金**/
	private BigDecimal othercashpaymentsfromoperatingactivities;
	/**经营活动现金流出小计**/
	private BigDecimal totalcashoutflowsfromoperatingactivities;
	/**经营活动产生的现金流量净额**/
	private BigDecimal netcashflowsfromoperatingactivities;
	/**收回投资所收到的现金**/
	private BigDecimal cashreceivedfromreturnofinvestment;
	/**取得投资收益所收到的现金**/
	private BigDecimal cashreceivedfromonvestments;
	/**处置固定资产无形资产和其他长期资产所收回的现金净额**/
	private BigDecimal netcashreceivedfdfiaaoltassets;
	/**收到的其他与投资活动有关的现金**/
	private BigDecimal cashreceivedrelatingtootherinvestingactivities;
	/**投资活动现金流入小计**/
	private BigDecimal totalcashinflowsfrominvestingactivities;
	/**购建固定资产无形资产和其他长期资产所支付的现金**/
	private BigDecimal cashpaidtoacquirefiaaoltassents;
	/**投资所支付的现金**/
	private BigDecimal cashpaymentsforinvestments;
	/**支付的其他与投资活动有关的现金**/
	private BigDecimal cashpaymentsrelatedtootherinvestingactivities;
	/**投资活动现金流出小计**/
	private BigDecimal totalcashoutflowsfrominvestingactivities;
	/**投资活动产生的现金流量净额**/
	private BigDecimal netcashflowsfrominvestingactivities;
	/**吸收投资所收到的现金**/
	private BigDecimal cashreceivedfrominvestors;
	/**借款所收到的现金**/
	private BigDecimal cashfromborrowings;
	/**收到的其他与筹资活动有关的现金**/
	private BigDecimal othercashreceivedrelatingtofinancingactivities;
	/**筹资活动现金流入小计**/
	private BigDecimal totalcashinflowsfromfinancingactivities;
	/**偿还债务所支付的现金**/
	private BigDecimal cashrepaymentsfordebts;
	/**分配股利、利润或偿付利息所支付的现金**/
	private BigDecimal cashpaymentsexpenses;
	/**支付的其他与筹资活动有关的现金**/
	private BigDecimal cashpaymentsrelatedtootherfinancingactivities;
	/**筹资活动现金流出小计**/
	private BigDecimal totalcashoutflowsfromfinancingactivities;
	/**筹集活动产生的现金流量净额**/
	private BigDecimal netcashflowsfromfinancingactivities;
	/**汇率变动对现金的影响**/
	private BigDecimal effectofexchangratechangesoncash;
	/**现金及现金等价物净增加额**/
	private BigDecimal netincreaseincashandcashequivalents;
	/**净利润**/
	private BigDecimal netprofit;
	/**计提的资产减值准备**/
	private BigDecimal provisionforassets;
	/**固定资产拆旧**/
	private BigDecimal depreciationoffixedassets;
	/**无形资产摊销**/
	private BigDecimal amortisationofintangibleassets;
	/**长期待摊费用摊销**/
	private BigDecimal longtermdeferredexpensesamortization;
	/**待摊费用减少**/
	private BigDecimal decreaseofdefferedexpenses;
	/**预提费用增加**/
	private BigDecimal additionofaccuedexpense;
	/**处置固定资产无形资产和其他长期资产的损失**/
	private BigDecimal lossesonditermassets;
	/**固定资产报废损失**/
	private BigDecimal lossesonscrappingoffixedassets;
	/**财务费用**/
	private BigDecimal financeexpense;
	/**投资损失**/
	private BigDecimal lossesarsingfrominvestment;
	/**递延税款贷项**/
	private BigDecimal deferredtaxcredit;
	/**存货的减少**/
	private BigDecimal decreaseininventories;
	/**经营性应收项目的减少**/
	private BigDecimal decreaseinoperatingreceivables;
	/**经营性应付项目的增加**/
	private BigDecimal increaseinoperatingreceivables;
	/**(净利润调节为经营活动现金流量科目下)其他**/
	private BigDecimal others;
	/**经营活动产生的现金流量净额**/
	private BigDecimal netcashflowsfromoperatingactivities2;
	/**债务转为资本**/
	private BigDecimal debtstransfertocapital;
	/**一年内到期的可转换公司债券**/
	private BigDecimal oneyeardueconvertiblebonds;
	/**融资租入固定资产**/
	private BigDecimal financingrenttothefixedasset;
	/**(不涉及现金收支的投资和筹资活动科目下)其他**/
	private BigDecimal others2;
	/**现金的期末余额**/
	private BigDecimal cashattheendofperiod;
	/**现金的期初余额**/
	private BigDecimal cashatthebeginningoftheperiod;
	/**现金等价物的期末余额**/
	private BigDecimal cashequivalentsattheendoftheperiod;
	/**现金等价物的期初余额**/
	private BigDecimal cashrquivalentsatthebeginningoftheperiod;
	/**现金及现金等价物净增加额**/
	private BigDecimal netincreaseincashandcashequivalents2;
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
	public void setFin_2002cashflowssgmt_id(String fin_2002cashflowssgmt_id){
		this.fin_2002cashflowssgmt_id=fin_2002cashflowssgmt_id;
	}
	public String getFin_2002cashflowssgmt_id(){
		return fin_2002cashflowssgmt_id;
	}
	public void setCashreceivedfromsalesofgoodsorrendingofservices(BigDecimal cashreceivedfromsalesofgoodsorrendingofservices){
		this.cashreceivedfromsalesofgoodsorrendingofservices=cashreceivedfromsalesofgoodsorrendingofservices;
	}
	public BigDecimal getCashreceivedfromsalesofgoodsorrendingofservices(){
		return cashreceivedfromsalesofgoodsorrendingofservices;
	}
	public void setTaxrefunds(BigDecimal taxrefunds){
		this.taxrefunds=taxrefunds;
	}
	public BigDecimal getTaxrefunds(){
		return taxrefunds;
	}
	public void setOthercashreceivedrelatingtooperatingactivities(BigDecimal othercashreceivedrelatingtooperatingactivities){
		this.othercashreceivedrelatingtooperatingactivities=othercashreceivedrelatingtooperatingactivities;
	}
	public BigDecimal getOthercashreceivedrelatingtooperatingactivities(){
		return othercashreceivedrelatingtooperatingactivities;
	}
	public void setTotalcashinflowsfromoperatingactivities(BigDecimal totalcashinflowsfromoperatingactivities){
		this.totalcashinflowsfromoperatingactivities=totalcashinflowsfromoperatingactivities;
	}
	public BigDecimal getTotalcashinflowsfromoperatingactivities(){
		return totalcashinflowsfromoperatingactivities;
	}
	public void setCashpaidforgoodsandservices(BigDecimal cashpaidforgoodsandservices){
		this.cashpaidforgoodsandservices=cashpaidforgoodsandservices;
	}
	public BigDecimal getCashpaidforgoodsandservices(){
		return cashpaidforgoodsandservices;
	}
	public void setCashpaidtoandonbehalfofemployees(BigDecimal cashpaidtoandonbehalfofemployees){
		this.cashpaidtoandonbehalfofemployees=cashpaidtoandonbehalfofemployees;
	}
	public BigDecimal getCashpaidtoandonbehalfofemployees(){
		return cashpaidtoandonbehalfofemployees;
	}
	public void setPaymentsofalltypesoftaxes(BigDecimal paymentsofalltypesoftaxes){
		this.paymentsofalltypesoftaxes=paymentsofalltypesoftaxes;
	}
	public BigDecimal getPaymentsofalltypesoftaxes(){
		return paymentsofalltypesoftaxes;
	}
	public void setOthercashpaymentsfromoperatingactivities(BigDecimal othercashpaymentsfromoperatingactivities){
		this.othercashpaymentsfromoperatingactivities=othercashpaymentsfromoperatingactivities;
	}
	public BigDecimal getOthercashpaymentsfromoperatingactivities(){
		return othercashpaymentsfromoperatingactivities;
	}
	public void setTotalcashoutflowsfromoperatingactivities(BigDecimal totalcashoutflowsfromoperatingactivities){
		this.totalcashoutflowsfromoperatingactivities=totalcashoutflowsfromoperatingactivities;
	}
	public BigDecimal getTotalcashoutflowsfromoperatingactivities(){
		return totalcashoutflowsfromoperatingactivities;
	}
	public void setNetcashflowsfromoperatingactivities(BigDecimal netcashflowsfromoperatingactivities){
		this.netcashflowsfromoperatingactivities=netcashflowsfromoperatingactivities;
	}
	public BigDecimal getNetcashflowsfromoperatingactivities(){
		return netcashflowsfromoperatingactivities;
	}
	public void setCashreceivedfromreturnofinvestment(BigDecimal cashreceivedfromreturnofinvestment){
		this.cashreceivedfromreturnofinvestment=cashreceivedfromreturnofinvestment;
	}
	public BigDecimal getCashreceivedfromreturnofinvestment(){
		return cashreceivedfromreturnofinvestment;
	}
	public void setCashreceivedfromonvestments(BigDecimal cashreceivedfromonvestments){
		this.cashreceivedfromonvestments=cashreceivedfromonvestments;
	}
	public BigDecimal getCashreceivedfromonvestments(){
		return cashreceivedfromonvestments;
	}
	public void setNetcashreceivedfdfiaaoltassets(BigDecimal netcashreceivedfdfiaaoltassets){
		this.netcashreceivedfdfiaaoltassets=netcashreceivedfdfiaaoltassets;
	}
	public BigDecimal getNetcashreceivedfdfiaaoltassets(){
		return netcashreceivedfdfiaaoltassets;
	}
	public void setCashreceivedrelatingtootherinvestingactivities(BigDecimal cashreceivedrelatingtootherinvestingactivities){
		this.cashreceivedrelatingtootherinvestingactivities=cashreceivedrelatingtootherinvestingactivities;
	}
	public BigDecimal getCashreceivedrelatingtootherinvestingactivities(){
		return cashreceivedrelatingtootherinvestingactivities;
	}
	public void setTotalcashinflowsfrominvestingactivities(BigDecimal totalcashinflowsfrominvestingactivities){
		this.totalcashinflowsfrominvestingactivities=totalcashinflowsfrominvestingactivities;
	}
	public BigDecimal getTotalcashinflowsfrominvestingactivities(){
		return totalcashinflowsfrominvestingactivities;
	}
	public void setCashpaidtoacquirefiaaoltassents(BigDecimal cashpaidtoacquirefiaaoltassents){
		this.cashpaidtoacquirefiaaoltassents=cashpaidtoacquirefiaaoltassents;
	}
	public BigDecimal getCashpaidtoacquirefiaaoltassents(){
		return cashpaidtoacquirefiaaoltassents;
	}
	public void setCashpaymentsforinvestments(BigDecimal cashpaymentsforinvestments){
		this.cashpaymentsforinvestments=cashpaymentsforinvestments;
	}
	public BigDecimal getCashpaymentsforinvestments(){
		return cashpaymentsforinvestments;
	}
	public void setCashpaymentsrelatedtootherinvestingactivities(BigDecimal cashpaymentsrelatedtootherinvestingactivities){
		this.cashpaymentsrelatedtootherinvestingactivities=cashpaymentsrelatedtootherinvestingactivities;
	}
	public BigDecimal getCashpaymentsrelatedtootherinvestingactivities(){
		return cashpaymentsrelatedtootherinvestingactivities;
	}
	public void setTotalcashoutflowsfrominvestingactivities(BigDecimal totalcashoutflowsfrominvestingactivities){
		this.totalcashoutflowsfrominvestingactivities=totalcashoutflowsfrominvestingactivities;
	}
	public BigDecimal getTotalcashoutflowsfrominvestingactivities(){
		return totalcashoutflowsfrominvestingactivities;
	}
	public void setNetcashflowsfrominvestingactivities(BigDecimal netcashflowsfrominvestingactivities){
		this.netcashflowsfrominvestingactivities=netcashflowsfrominvestingactivities;
	}
	public BigDecimal getNetcashflowsfrominvestingactivities(){
		return netcashflowsfrominvestingactivities;
	}
	public void setCashreceivedfrominvestors(BigDecimal cashreceivedfrominvestors){
		this.cashreceivedfrominvestors=cashreceivedfrominvestors;
	}
	public BigDecimal getCashreceivedfrominvestors(){
		return cashreceivedfrominvestors;
	}
	public void setCashfromborrowings(BigDecimal cashfromborrowings){
		this.cashfromborrowings=cashfromborrowings;
	}
	public BigDecimal getCashfromborrowings(){
		return cashfromborrowings;
	}
	public void setOthercashreceivedrelatingtofinancingactivities(BigDecimal othercashreceivedrelatingtofinancingactivities){
		this.othercashreceivedrelatingtofinancingactivities=othercashreceivedrelatingtofinancingactivities;
	}
	public BigDecimal getOthercashreceivedrelatingtofinancingactivities(){
		return othercashreceivedrelatingtofinancingactivities;
	}
	public void setTotalcashinflowsfromfinancingactivities(BigDecimal totalcashinflowsfromfinancingactivities){
		this.totalcashinflowsfromfinancingactivities=totalcashinflowsfromfinancingactivities;
	}
	public BigDecimal getTotalcashinflowsfromfinancingactivities(){
		return totalcashinflowsfromfinancingactivities;
	}
	public void setCashrepaymentsfordebts(BigDecimal cashrepaymentsfordebts){
		this.cashrepaymentsfordebts=cashrepaymentsfordebts;
	}
	public BigDecimal getCashrepaymentsfordebts(){
		return cashrepaymentsfordebts;
	}
	public void setCashpaymentsexpenses(BigDecimal cashpaymentsexpenses){
		this.cashpaymentsexpenses=cashpaymentsexpenses;
	}
	public BigDecimal getCashpaymentsexpenses(){
		return cashpaymentsexpenses;
	}
	public void setCashpaymentsrelatedtootherfinancingactivities(BigDecimal cashpaymentsrelatedtootherfinancingactivities){
		this.cashpaymentsrelatedtootherfinancingactivities=cashpaymentsrelatedtootherfinancingactivities;
	}
	public BigDecimal getCashpaymentsrelatedtootherfinancingactivities(){
		return cashpaymentsrelatedtootherfinancingactivities;
	}
	public void setTotalcashoutflowsfromfinancingactivities(BigDecimal totalcashoutflowsfromfinancingactivities){
		this.totalcashoutflowsfromfinancingactivities=totalcashoutflowsfromfinancingactivities;
	}
	public BigDecimal getTotalcashoutflowsfromfinancingactivities(){
		return totalcashoutflowsfromfinancingactivities;
	}
	public void setNetcashflowsfromfinancingactivities(BigDecimal netcashflowsfromfinancingactivities){
		this.netcashflowsfromfinancingactivities=netcashflowsfromfinancingactivities;
	}
	public BigDecimal getNetcashflowsfromfinancingactivities(){
		return netcashflowsfromfinancingactivities;
	}
	public void setEffectofexchangratechangesoncash(BigDecimal effectofexchangratechangesoncash){
		this.effectofexchangratechangesoncash=effectofexchangratechangesoncash;
	}
	public BigDecimal getEffectofexchangratechangesoncash(){
		return effectofexchangratechangesoncash;
	}
	public void setNetincreaseincashandcashequivalents(BigDecimal netincreaseincashandcashequivalents){
		this.netincreaseincashandcashequivalents=netincreaseincashandcashequivalents;
	}
	public BigDecimal getNetincreaseincashandcashequivalents(){
		return netincreaseincashandcashequivalents;
	}
	public void setNetprofit(BigDecimal netprofit){
		this.netprofit=netprofit;
	}
	public BigDecimal getNetprofit(){
		return netprofit;
	}
	public void setProvisionforassets(BigDecimal provisionforassets){
		this.provisionforassets=provisionforassets;
	}
	public BigDecimal getProvisionforassets(){
		return provisionforassets;
	}
	public void setDepreciationoffixedassets(BigDecimal depreciationoffixedassets){
		this.depreciationoffixedassets=depreciationoffixedassets;
	}
	public BigDecimal getDepreciationoffixedassets(){
		return depreciationoffixedassets;
	}
	public void setAmortisationofintangibleassets(BigDecimal amortisationofintangibleassets){
		this.amortisationofintangibleassets=amortisationofintangibleassets;
	}
	public BigDecimal getAmortisationofintangibleassets(){
		return amortisationofintangibleassets;
	}
	public void setLongtermdeferredexpensesamortization(BigDecimal longtermdeferredexpensesamortization){
		this.longtermdeferredexpensesamortization=longtermdeferredexpensesamortization;
	}
	public BigDecimal getLongtermdeferredexpensesamortization(){
		return longtermdeferredexpensesamortization;
	}
	public void setDecreaseofdefferedexpenses(BigDecimal decreaseofdefferedexpenses){
		this.decreaseofdefferedexpenses=decreaseofdefferedexpenses;
	}
	public BigDecimal getDecreaseofdefferedexpenses(){
		return decreaseofdefferedexpenses;
	}
	public void setAdditionofaccuedexpense(BigDecimal additionofaccuedexpense){
		this.additionofaccuedexpense=additionofaccuedexpense;
	}
	public BigDecimal getAdditionofaccuedexpense(){
		return additionofaccuedexpense;
	}
	public void setLossesonditermassets(BigDecimal lossesonditermassets){
		this.lossesonditermassets=lossesonditermassets;
	}
	public BigDecimal getLossesonditermassets(){
		return lossesonditermassets;
	}
	public void setLossesonscrappingoffixedassets(BigDecimal lossesonscrappingoffixedassets){
		this.lossesonscrappingoffixedassets=lossesonscrappingoffixedassets;
	}
	public BigDecimal getLossesonscrappingoffixedassets(){
		return lossesonscrappingoffixedassets;
	}
	public void setFinanceexpense(BigDecimal financeexpense){
		this.financeexpense=financeexpense;
	}
	public BigDecimal getFinanceexpense(){
		return financeexpense;
	}
	public void setLossesarsingfrominvestment(BigDecimal lossesarsingfrominvestment){
		this.lossesarsingfrominvestment=lossesarsingfrominvestment;
	}
	public BigDecimal getLossesarsingfrominvestment(){
		return lossesarsingfrominvestment;
	}
	public void setDeferredtaxcredit(BigDecimal deferredtaxcredit){
		this.deferredtaxcredit=deferredtaxcredit;
	}
	public BigDecimal getDeferredtaxcredit(){
		return deferredtaxcredit;
	}
	public void setDecreaseininventories(BigDecimal decreaseininventories){
		this.decreaseininventories=decreaseininventories;
	}
	public BigDecimal getDecreaseininventories(){
		return decreaseininventories;
	}
	public void setDecreaseinoperatingreceivables(BigDecimal decreaseinoperatingreceivables){
		this.decreaseinoperatingreceivables=decreaseinoperatingreceivables;
	}
	public BigDecimal getDecreaseinoperatingreceivables(){
		return decreaseinoperatingreceivables;
	}
	public void setIncreaseinoperatingreceivables(BigDecimal increaseinoperatingreceivables){
		this.increaseinoperatingreceivables=increaseinoperatingreceivables;
	}
	public BigDecimal getIncreaseinoperatingreceivables(){
		return increaseinoperatingreceivables;
	}
	public void setOthers(BigDecimal others){
		this.others=others;
	}
	public BigDecimal getOthers(){
		return others;
	}
	public void setNetcashflowsfromoperatingactivities2(BigDecimal netcashflowsfromoperatingactivities2){
		this.netcashflowsfromoperatingactivities2=netcashflowsfromoperatingactivities2;
	}
	public BigDecimal getNetcashflowsfromoperatingactivities2(){
		return netcashflowsfromoperatingactivities2;
	}
	public void setDebtstransfertocapital(BigDecimal debtstransfertocapital){
		this.debtstransfertocapital=debtstransfertocapital;
	}
	public BigDecimal getDebtstransfertocapital(){
		return debtstransfertocapital;
	}
	public void setOneyeardueconvertiblebonds(BigDecimal oneyeardueconvertiblebonds){
		this.oneyeardueconvertiblebonds=oneyeardueconvertiblebonds;
	}
	public BigDecimal getOneyeardueconvertiblebonds(){
		return oneyeardueconvertiblebonds;
	}
	public void setFinancingrenttothefixedasset(BigDecimal financingrenttothefixedasset){
		this.financingrenttothefixedasset=financingrenttothefixedasset;
	}
	public BigDecimal getFinancingrenttothefixedasset(){
		return financingrenttothefixedasset;
	}
	public void setOthers2(BigDecimal others2){
		this.others2=others2;
	}
	public BigDecimal getOthers2(){
		return others2;
	}
	public void setCashattheendofperiod(BigDecimal cashattheendofperiod){
		this.cashattheendofperiod=cashattheendofperiod;
	}
	public BigDecimal getCashattheendofperiod(){
		return cashattheendofperiod;
	}
	public void setCashatthebeginningoftheperiod(BigDecimal cashatthebeginningoftheperiod){
		this.cashatthebeginningoftheperiod=cashatthebeginningoftheperiod;
	}
	public BigDecimal getCashatthebeginningoftheperiod(){
		return cashatthebeginningoftheperiod;
	}
	public void setCashequivalentsattheendoftheperiod(BigDecimal cashequivalentsattheendoftheperiod){
		this.cashequivalentsattheendoftheperiod=cashequivalentsattheendoftheperiod;
	}
	public BigDecimal getCashequivalentsattheendoftheperiod(){
		return cashequivalentsattheendoftheperiod;
	}
	public void setCashrquivalentsatthebeginningoftheperiod(BigDecimal cashrquivalentsatthebeginningoftheperiod){
		this.cashrquivalentsatthebeginningoftheperiod=cashrquivalentsatthebeginningoftheperiod;
	}
	public BigDecimal getCashrquivalentsatthebeginningoftheperiod(){
		return cashrquivalentsatthebeginningoftheperiod;
	}
	public void setNetincreaseincashandcashequivalents2(BigDecimal netincreaseincashandcashequivalents2){
		this.netincreaseincashandcashequivalents2=netincreaseincashandcashequivalents2;
	}
	public BigDecimal getNetincreaseincashandcashequivalents2(){
		return netincreaseincashandcashequivalents2;
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
