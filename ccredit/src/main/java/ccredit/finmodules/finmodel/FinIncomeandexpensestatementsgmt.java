package ccredit.finmodules.finmodel;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import ccredit.xtmodules.xtcore.util.DateUtils;
import ccredit.util.DictionaryText;

/**
* fin_incomeandexpensestatementsgmt 事业单位收入支出表 
* 2018-05-03 15:04:06  yangzhou
*/
public class FinIncomeandexpensestatementsgmt extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	/**编号**/
	private String fin_incomeandexpensestatementsgmt_id;
	/**本期财政补助结转结余**/
	private BigDecimal currentfinancialsubsidycarriedoverbalance;
	/**财政补助收入**/
	private BigDecimal financialsubsidyrevenue;
	/**事业支出(财政补助支出)**/
	private BigDecimal undertakingsexpenditurefinancialsubsidyexpenditure;
	/**本期事业结转结余**/
	private BigDecimal currentundertakingscarriedoverbalance;
	/**事业类收入**/
	private BigDecimal undertakingsclassrevenue;
	/**事业收入**/
	private BigDecimal undertakingsrevenue;
	/**上级补助收入**/
	private BigDecimal superiorsubsidyrevenue;
	/**附属单位上缴收入**/
	private BigDecimal revenueturnedoverbysubsidiaryunit;
	/**其他收入**/
	private BigDecimal otherrevenue;
	/**(其他收入科目下)捐赠收入**/
	private BigDecimal donationincome;
	/**事业类支出**/
	private BigDecimal undertakingsclassexpenditure;
	/**事业支出(非财政补助支出)**/
	private BigDecimal undertakingsexpenditurenonfinancialsubsidyexpenditure;
	/**上缴上级支出**/
	private BigDecimal paymenttothehigherauthority;
	/**对附属单位补助支出**/
	private BigDecimal granttotheauxiliaryorganization;
	/**其他支出**/
	private BigDecimal otherexpenditure;
	/**本期经营结余**/
	private BigDecimal currentoperatingbalance;
	/**经营收入**/
	private BigDecimal operatingrevenue;
	/**经营支出**/
	private BigDecimal operatingexpenditure;
	/**弥补以前年度亏损后的经营结余**/
	private BigDecimal operatingbalancemadeupforofthepreviousyearsoperatingloss;
	/**本年非财政补助结转结余**/
	private BigDecimal nonfinancialsubsidycarriedoverbalancethisyear;
	/**非财政补助结转**/
	private BigDecimal nonfinancialaidcarriedover;
	/**本年非财政补助结余**/
	private BigDecimal nonfinancialaidbalancethisyear;
	/**应缴企业所得税**/
	private BigDecimal enterpriseincometaxpayable;
	/**提取专用基金**/
	private BigDecimal specialfundstoextract;
	/**转入事业基金**/
	private BigDecimal publicfundturnedinto;
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
	public void setFin_incomeandexpensestatementsgmt_id(String fin_incomeandexpensestatementsgmt_id){
		this.fin_incomeandexpensestatementsgmt_id=fin_incomeandexpensestatementsgmt_id;
	}
	public String getFin_incomeandexpensestatementsgmt_id(){
		return fin_incomeandexpensestatementsgmt_id;
	}
	public void setCurrentfinancialsubsidycarriedoverbalance(BigDecimal currentfinancialsubsidycarriedoverbalance){
		this.currentfinancialsubsidycarriedoverbalance=currentfinancialsubsidycarriedoverbalance;
	}
	public BigDecimal getCurrentfinancialsubsidycarriedoverbalance(){
		return currentfinancialsubsidycarriedoverbalance;
	}
	public void setFinancialsubsidyrevenue(BigDecimal financialsubsidyrevenue){
		this.financialsubsidyrevenue=financialsubsidyrevenue;
	}
	public BigDecimal getFinancialsubsidyrevenue(){
		return financialsubsidyrevenue;
	}
	public void setUndertakingsexpenditurefinancialsubsidyexpenditure(BigDecimal undertakingsexpenditurefinancialsubsidyexpenditure){
		this.undertakingsexpenditurefinancialsubsidyexpenditure=undertakingsexpenditurefinancialsubsidyexpenditure;
	}
	public BigDecimal getUndertakingsexpenditurefinancialsubsidyexpenditure(){
		return undertakingsexpenditurefinancialsubsidyexpenditure;
	}
	public void setCurrentundertakingscarriedoverbalance(BigDecimal currentundertakingscarriedoverbalance){
		this.currentundertakingscarriedoverbalance=currentundertakingscarriedoverbalance;
	}
	public BigDecimal getCurrentundertakingscarriedoverbalance(){
		return currentundertakingscarriedoverbalance;
	}
	public void setUndertakingsclassrevenue(BigDecimal undertakingsclassrevenue){
		this.undertakingsclassrevenue=undertakingsclassrevenue;
	}
	public BigDecimal getUndertakingsclassrevenue(){
		return undertakingsclassrevenue;
	}
	public void setUndertakingsrevenue(BigDecimal undertakingsrevenue){
		this.undertakingsrevenue=undertakingsrevenue;
	}
	public BigDecimal getUndertakingsrevenue(){
		return undertakingsrevenue;
	}
	public void setSuperiorsubsidyrevenue(BigDecimal superiorsubsidyrevenue){
		this.superiorsubsidyrevenue=superiorsubsidyrevenue;
	}
	public BigDecimal getSuperiorsubsidyrevenue(){
		return superiorsubsidyrevenue;
	}
	public void setRevenueturnedoverbysubsidiaryunit(BigDecimal revenueturnedoverbysubsidiaryunit){
		this.revenueturnedoverbysubsidiaryunit=revenueturnedoverbysubsidiaryunit;
	}
	public BigDecimal getRevenueturnedoverbysubsidiaryunit(){
		return revenueturnedoverbysubsidiaryunit;
	}
	public void setOtherrevenue(BigDecimal otherrevenue){
		this.otherrevenue=otherrevenue;
	}
	public BigDecimal getOtherrevenue(){
		return otherrevenue;
	}
	public void setDonationincome(BigDecimal donationincome){
		this.donationincome=donationincome;
	}
	public BigDecimal getDonationincome(){
		return donationincome;
	}
	public void setUndertakingsclassexpenditure(BigDecimal undertakingsclassexpenditure){
		this.undertakingsclassexpenditure=undertakingsclassexpenditure;
	}
	public BigDecimal getUndertakingsclassexpenditure(){
		return undertakingsclassexpenditure;
	}
	public void setUndertakingsexpenditurenonfinancialsubsidyexpenditure(BigDecimal undertakingsexpenditurenonfinancialsubsidyexpenditure){
		this.undertakingsexpenditurenonfinancialsubsidyexpenditure=undertakingsexpenditurenonfinancialsubsidyexpenditure;
	}
	public BigDecimal getUndertakingsexpenditurenonfinancialsubsidyexpenditure(){
		return undertakingsexpenditurenonfinancialsubsidyexpenditure;
	}
	public void setPaymenttothehigherauthority(BigDecimal paymenttothehigherauthority){
		this.paymenttothehigherauthority=paymenttothehigherauthority;
	}
	public BigDecimal getPaymenttothehigherauthority(){
		return paymenttothehigherauthority;
	}
	public void setGranttotheauxiliaryorganization(BigDecimal granttotheauxiliaryorganization){
		this.granttotheauxiliaryorganization=granttotheauxiliaryorganization;
	}
	public BigDecimal getGranttotheauxiliaryorganization(){
		return granttotheauxiliaryorganization;
	}
	public void setOtherexpenditure(BigDecimal otherexpenditure){
		this.otherexpenditure=otherexpenditure;
	}
	public BigDecimal getOtherexpenditure(){
		return otherexpenditure;
	}
	public void setCurrentoperatingbalance(BigDecimal currentoperatingbalance){
		this.currentoperatingbalance=currentoperatingbalance;
	}
	public BigDecimal getCurrentoperatingbalance(){
		return currentoperatingbalance;
	}
	public void setOperatingrevenue(BigDecimal operatingrevenue){
		this.operatingrevenue=operatingrevenue;
	}
	public BigDecimal getOperatingrevenue(){
		return operatingrevenue;
	}
	public void setOperatingexpenditure(BigDecimal operatingexpenditure){
		this.operatingexpenditure=operatingexpenditure;
	}
	public BigDecimal getOperatingexpenditure(){
		return operatingexpenditure;
	}
	public void setOperatingbalancemadeupforofthepreviousyearsoperatingloss(BigDecimal operatingbalancemadeupforofthepreviousyearsoperatingloss){
		this.operatingbalancemadeupforofthepreviousyearsoperatingloss=operatingbalancemadeupforofthepreviousyearsoperatingloss;
	}
	public BigDecimal getOperatingbalancemadeupforofthepreviousyearsoperatingloss(){
		return operatingbalancemadeupforofthepreviousyearsoperatingloss;
	}
	public void setNonfinancialsubsidycarriedoverbalancethisyear(BigDecimal nonfinancialsubsidycarriedoverbalancethisyear){
		this.nonfinancialsubsidycarriedoverbalancethisyear=nonfinancialsubsidycarriedoverbalancethisyear;
	}
	public BigDecimal getNonfinancialsubsidycarriedoverbalancethisyear(){
		return nonfinancialsubsidycarriedoverbalancethisyear;
	}
	public void setNonfinancialaidcarriedover(BigDecimal nonfinancialaidcarriedover){
		this.nonfinancialaidcarriedover=nonfinancialaidcarriedover;
	}
	public BigDecimal getNonfinancialaidcarriedover(){
		return nonfinancialaidcarriedover;
	}
	public void setNonfinancialaidbalancethisyear(BigDecimal nonfinancialaidbalancethisyear){
		this.nonfinancialaidbalancethisyear=nonfinancialaidbalancethisyear;
	}
	public BigDecimal getNonfinancialaidbalancethisyear(){
		return nonfinancialaidbalancethisyear;
	}
	public void setEnterpriseincometaxpayable(BigDecimal enterpriseincometaxpayable){
		this.enterpriseincometaxpayable=enterpriseincometaxpayable;
	}
	public BigDecimal getEnterpriseincometaxpayable(){
		return enterpriseincometaxpayable;
	}
	public void setSpecialfundstoextract(BigDecimal specialfundstoextract){
		this.specialfundstoextract=specialfundstoextract;
	}
	public BigDecimal getSpecialfundstoextract(){
		return specialfundstoextract;
	}
	public void setPublicfundturnedinto(BigDecimal publicfundturnedinto){
		this.publicfundturnedinto=publicfundturnedinto;
	}
	public BigDecimal getPublicfundturnedinto(){
		return publicfundturnedinto;
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
