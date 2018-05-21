package ccredit.loanmodules.loandao;
import java.util.List;
import java.util.Map;
import ccredit.loanmodules.loanmodel.LoanAcctbsinfsgmt;

/**
* 借贷基本信息段 
* 2018-04-27 15:42:33  yangzhou
*/
public interface LoanAcctbsinfsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<LoanAcctbsinfsgmt> getLoanAcctbsinfsgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param loan_acctbsinfsgmt_id 
	* @return
	*/
	public LoanAcctbsinfsgmt getLoanAcctbsinfsgmtById(String loan_acctbsinfsgmt_id);
	/**
	* 添加
	* @param loan_acctbsinfsgmt 
	* @return
	*/
	public int addLoanAcctbsinfsgmt(LoanAcctbsinfsgmt loanAcctbsinfsgmt);
	/**
	* 修改
	* @param loan_acctbsinfsgmt 
	* @return
	*/
	public int updateLoanAcctbsinfsgmt(LoanAcctbsinfsgmt loanAcctbsinfsgmt);
	/**
	* 修改（根据动态条件）
	* @param loan_acctbsinfsgmt 
	* @return
	*/
	public int updateLoanAcctbsinfsgmtBySelective(LoanAcctbsinfsgmt loanAcctbsinfsgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delLoanAcctbsinfsgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param loan_acctbsinfsgmtList 
	* @return
	*/
	public int addBatchLoanAcctbsinfsgmt(List<LoanAcctbsinfsgmt> loanAcctbsinfsgmtList);
	/**
	* 批量修改
	* @param loan_acctbsinfsgmtList 
	* @return
	*/
	public int updateBatchLoanAcctbsinfsgmt(List<LoanAcctbsinfsgmt> loanAcctbsinfsgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param loan_acctbsinfsgmtList 
	* @return
	*/
	public int updateBatchLoanAcctbsinfsgmtBySelective(List<LoanAcctbsinfsgmt> loanAcctbsinfsgmtList);
	
	
	/**
	* 查询历史信息
	*/
	public List<?>  getHisLoanListByCondition(Map<String,Object> condition);
}
