package ccredit.loanmodules.loandao;
import java.util.List;
import java.util.Map;
import ccredit.loanmodules.loanmodel.LoanAcctcredsgmt;

/**
* 授信额度信息 
* 2018-04-27 16:30:17  yangzhou
*/
public interface LoanAcctcredsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<LoanAcctcredsgmt> getLoanAcctcredsgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param loan_acctcredsgmt_id 
	* @return
	*/
	public LoanAcctcredsgmt getLoanAcctcredsgmtById(String loan_acctcredsgmt_id);
	/**
	* 添加
	* @param loan_acctcredsgmt 
	* @return
	*/
	public int addLoanAcctcredsgmt(LoanAcctcredsgmt loanAcctcredsgmt);
	/**
	* 修改
	* @param loan_acctcredsgmt 
	* @return
	*/
	public int updateLoanAcctcredsgmt(LoanAcctcredsgmt loanAcctcredsgmt);
	/**
	* 修改（根据动态条件）
	* @param loan_acctcredsgmt 
	* @return
	*/
	public int updateLoanAcctcredsgmtBySelective(LoanAcctcredsgmt loanAcctcredsgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delLoanAcctcredsgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param loan_acctcredsgmtList 
	* @return
	*/
	public int addBatchLoanAcctcredsgmt(List<LoanAcctcredsgmt> loanAcctcredsgmtList);
	/**
	* 批量修改
	* @param loan_acctcredsgmtList 
	* @return
	*/
	public int updateBatchLoanAcctcredsgmt(List<LoanAcctcredsgmt> loanAcctcredsgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param loan_acctcredsgmtList 
	* @return
	*/
	public int updateBatchLoanAcctcredsgmtBySelective(List<LoanAcctcredsgmt> loanAcctcredsgmtList);
}
