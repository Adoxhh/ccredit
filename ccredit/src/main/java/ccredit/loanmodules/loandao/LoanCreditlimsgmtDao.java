package ccredit.loanmodules.loandao;
import java.util.List;
import java.util.Map;
import ccredit.loanmodules.loanmodel.LoanCreditlimsgmt;

/**
* 授信额度信息 
* 2018-04-28 11:05:34  yangzhou
*/
public interface LoanCreditlimsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<LoanCreditlimsgmt> getLoanCreditlimsgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param loan_creditlimsgmt_id 
	* @return
	*/
	public LoanCreditlimsgmt getLoanCreditlimsgmtById(String loan_creditlimsgmt_id);
	/**
	* 添加
	* @param loan_creditlimsgmt 
	* @return
	*/
	public int addLoanCreditlimsgmt(LoanCreditlimsgmt loanCreditlimsgmt);
	/**
	* 修改
	* @param loan_creditlimsgmt 
	* @return
	*/
	public int updateLoanCreditlimsgmt(LoanCreditlimsgmt loanCreditlimsgmt);
	/**
	* 修改（根据动态条件）
	* @param loan_creditlimsgmt 
	* @return
	*/
	public int updateLoanCreditlimsgmtBySelective(LoanCreditlimsgmt loanCreditlimsgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delLoanCreditlimsgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param loan_creditlimsgmtList 
	* @return
	*/
	public int addBatchLoanCreditlimsgmt(List<LoanCreditlimsgmt> loanCreditlimsgmtList);
	/**
	* 批量修改
	* @param loan_creditlimsgmtList 
	* @return
	*/
	public int updateBatchLoanCreditlimsgmt(List<LoanCreditlimsgmt> loanCreditlimsgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param loan_creditlimsgmtList 
	* @return
	*/
	public int updateBatchLoanCreditlimsgmtBySelective(List<LoanCreditlimsgmt> loanCreditlimsgmtList);
}
