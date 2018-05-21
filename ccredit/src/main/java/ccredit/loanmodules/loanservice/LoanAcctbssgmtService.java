package ccredit.loanmodules.loanservice;
import java.util.List;
import java.util.Map;
import ccredit.loanmodules.loanmodel.LoanAcctbssgmt;

/**
* 企业借贷信息基础段 
* 2018-04-26 14:53:04  yangzhou
*/
public interface LoanAcctbssgmtService{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<LoanAcctbssgmt> getLoanAcctbssgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param loan_acctbssgmt_id 
	* @return
	*/
	public LoanAcctbssgmt getLoanAcctbssgmtById(String loan_acctbssgmt_id);
	/**
	* 添加
	* @param loan_acctbssgmt 
	* @return
	*/
	public int addLoanAcctbssgmt(LoanAcctbssgmt loanAcctbssgmt);
	/**
	* 修改
	* @param loan_acctbssgmt 
	* @return
	*/
	public int updateLoanAcctbssgmt(LoanAcctbssgmt loanAcctbssgmt);
	/**
	* 修改（根据动态条件）
	* @param loan_acctbssgmt 
	* @return
	*/
	public int updateLoanAcctbssgmtBySelective(LoanAcctbssgmt loanAcctbssgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delLoanAcctbssgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param loan_acctbssgmtList 
	* @return
	*/
	public int addBatchLoanAcctbssgmt(List<LoanAcctbssgmt> loanAcctbssgmtList);
	/**
	* 批量修改
	* @param loan_acctbssgmtList 
	* @return
	*/
	public int updateBatchLoanAcctbssgmt(List<LoanAcctbssgmt> loanAcctbssgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param loan_acctbssgmtList 
	* @return
	*/
	public int updateBatchLoanAcctbssgmtBySelective(List<LoanAcctbssgmt> loanAcctbssgmtList);
}
