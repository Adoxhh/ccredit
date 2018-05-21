package ccredit.finmodules.finmodel;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import ccredit.xtmodules.xtcore.util.DateUtils;
import ccredit.util.DictionaryText;

/**
* fin_2007incomestatementprofitappropriationsgmt 2007版利润及利润分配表 
* 2018-05-03 15:00:09  yangzhou
*/
public class Fin2007incomestatementprofitappropriationsgmt extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	/**编号**/
	private String fin_2007incomestatementprofitappropriationsgmt_id;
	/**营业收入 **/
	private BigDecimal revenueofsales;
	/**营业成本**/
	private BigDecimal costofsales;
	/**营业税金及附加**/
	private BigDecimal businessandothertaxes;
	/**销售费用**/
	private BigDecimal sellingexpenses;
	/**管理费用**/
	private BigDecimal generalandadministrativeexpenses;
	/**财务费用**/
	private BigDecimal financialexpense;
	/**资产减值损失**/
	private BigDecimal impairmentlossofassets;
	/**公允价值变动净收益**/
	private BigDecimal profitorlossarisingfromchangesinfairvalue;
	/**投资净收益**/
	private BigDecimal investmentincome;
	/**对联营企业和合营企业的投资收益**/
	private BigDecimal investmentincomefbaenterprise;
	/**营业利润**/
	private BigDecimal operatingprofits;
	/**营业外收入**/
	private BigDecimal nonoperatingincome;
	/**营业外支出**/
	private BigDecimal nonoperatingexpenses;
	/**非流动资产损失(其中：非流动资产处置损失)**/
	private BigDecimal noncurrentassets;
	/**利润总额**/
	private BigDecimal profitbeforetax;
	/**所得税费用**/
	private BigDecimal incometaxexpense;
	/**净利润**/
	private BigDecimal netprofit;
	/**基本每股收益**/
	private BigDecimal basicearningspershare;
	/**稀释每股收益**/
	private BigDecimal dilutedearningspershare;
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
	public void setFin_2007incomestatementprofitappropriationsgmt_id(String fin_2007incomestatementprofitappropriationsgmt_id){
		this.fin_2007incomestatementprofitappropriationsgmt_id=fin_2007incomestatementprofitappropriationsgmt_id;
	}
	public String getFin_2007incomestatementprofitappropriationsgmt_id(){
		return fin_2007incomestatementprofitappropriationsgmt_id;
	}
	public void setRevenueofsales(BigDecimal revenueofsales){
		this.revenueofsales=revenueofsales;
	}
	public BigDecimal getRevenueofsales(){
		return revenueofsales;
	}
	public void setCostofsales(BigDecimal costofsales){
		this.costofsales=costofsales;
	}
	public BigDecimal getCostofsales(){
		return costofsales;
	}
	public void setBusinessandothertaxes(BigDecimal businessandothertaxes){
		this.businessandothertaxes=businessandothertaxes;
	}
	public BigDecimal getBusinessandothertaxes(){
		return businessandothertaxes;
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
	public void setFinancialexpense(BigDecimal financialexpense){
		this.financialexpense=financialexpense;
	}
	public BigDecimal getFinancialexpense(){
		return financialexpense;
	}
	public void setImpairmentlossofassets(BigDecimal impairmentlossofassets){
		this.impairmentlossofassets=impairmentlossofassets;
	}
	public BigDecimal getImpairmentlossofassets(){
		return impairmentlossofassets;
	}
	public void setProfitorlossarisingfromchangesinfairvalue(BigDecimal profitorlossarisingfromchangesinfairvalue){
		this.profitorlossarisingfromchangesinfairvalue=profitorlossarisingfromchangesinfairvalue;
	}
	public BigDecimal getProfitorlossarisingfromchangesinfairvalue(){
		return profitorlossarisingfromchangesinfairvalue;
	}
	public void setInvestmentincome(BigDecimal investmentincome){
		this.investmentincome=investmentincome;
	}
	public BigDecimal getInvestmentincome(){
		return investmentincome;
	}
	public void setInvestmentincomefbaenterprise(BigDecimal investmentincomefbaenterprise){
		this.investmentincomefbaenterprise=investmentincomefbaenterprise;
	}
	public BigDecimal getInvestmentincomefbaenterprise(){
		return investmentincomefbaenterprise;
	}
	public void setOperatingprofits(BigDecimal operatingprofits){
		this.operatingprofits=operatingprofits;
	}
	public BigDecimal getOperatingprofits(){
		return operatingprofits;
	}
	public void setNonoperatingincome(BigDecimal nonoperatingincome){
		this.nonoperatingincome=nonoperatingincome;
	}
	public BigDecimal getNonoperatingincome(){
		return nonoperatingincome;
	}
	public void setNonoperatingexpenses(BigDecimal nonoperatingexpenses){
		this.nonoperatingexpenses=nonoperatingexpenses;
	}
	public BigDecimal getNonoperatingexpenses(){
		return nonoperatingexpenses;
	}
	public void setNoncurrentassets(BigDecimal noncurrentassets){
		this.noncurrentassets=noncurrentassets;
	}
	public BigDecimal getNoncurrentassets(){
		return noncurrentassets;
	}
	public void setProfitbeforetax(BigDecimal profitbeforetax){
		this.profitbeforetax=profitbeforetax;
	}
	public BigDecimal getProfitbeforetax(){
		return profitbeforetax;
	}
	public void setIncometaxexpense(BigDecimal incometaxexpense){
		this.incometaxexpense=incometaxexpense;
	}
	public BigDecimal getIncometaxexpense(){
		return incometaxexpense;
	}
	public void setNetprofit(BigDecimal netprofit){
		this.netprofit=netprofit;
	}
	public BigDecimal getNetprofit(){
		return netprofit;
	}
	public void setBasicearningspershare(BigDecimal basicearningspershare){
		this.basicearningspershare=basicearningspershare;
	}
	public BigDecimal getBasicearningspershare(){
		return basicearningspershare;
	}
	public void setDilutedearningspershare(BigDecimal dilutedearningspershare){
		this.dilutedearningspershare=dilutedearningspershare;
	}
	public BigDecimal getDilutedearningspershare(){
		return dilutedearningspershare;
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
