package ccredit.loanmodules.loanservice;
import java.util.List;
import java.util.Map;
import ccredit.loanmodules.loanmodel.LoanGuarbssgmt;

/**
* 最高额保证合同信息基础段 
* 2018-04-28 15:16:38  yangzhou
*/
public interface LoanGuarbssgmtService{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<LoanGuarbssgmt> getLoanGuarbssgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param loan_guarbssgmt_id 
	* @return
	*/
	public LoanGuarbssgmt getLoanGuarbssgmtById(String loan_guarbssgmt_id);
	/**
	* 添加
	* @param loan_guarbssgmt 
	* @return
	*/
	public int addLoanGuarbssgmt(LoanGuarbssgmt loanGuarbssgmt);
	/**
	* 修改
	* @param loan_guarbssgmt 
	* @return
	*/
	public int updateLoanGuarbssgmt(LoanGuarbssgmt loanGuarbssgmt);
	/**
	* 修改（根据动态条件）
	* @param loan_guarbssgmt 
	* @return
	*/
	public int updateLoanGuarbssgmtBySelective(LoanGuarbssgmt loanGuarbssgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delLoanGuarbssgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param loan_guarbssgmtList 
	* @return
	*/
	public int addBatchLoanGuarbssgmt(List<LoanGuarbssgmt> loanGuarbssgmtList);
	/**
	* 批量修改
	* @param loan_guarbssgmtList 
	* @return
	*/
	public int updateBatchLoanGuarbssgmt(List<LoanGuarbssgmt> loanGuarbssgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param loan_guarbssgmtList 
	* @return
	*/
	public int updateBatchLoanGuarbssgmtBySelective(List<LoanGuarbssgmt> loanGuarbssgmtList);
}
