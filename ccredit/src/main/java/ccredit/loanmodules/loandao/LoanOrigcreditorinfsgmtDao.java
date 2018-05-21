package ccredit.loanmodules.loandao;
import java.util.List;
import java.util.Map;
import ccredit.loanmodules.loanmodel.LoanOrigcreditorinfsgmt;

/**
* 初始债权说明 
* 2018-04-27 16:32:12  yangzhou
*/
public interface LoanOrigcreditorinfsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<LoanOrigcreditorinfsgmt> getLoanOrigcreditorinfsgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param loan_origcreditorinfsgmt_id 
	* @return
	*/
	public LoanOrigcreditorinfsgmt getLoanOrigcreditorinfsgmtById(String loan_origcreditorinfsgmt_id);
	/**
	* 添加
	* @param loan_origcreditorinfsgmt 
	* @return
	*/
	public int addLoanOrigcreditorinfsgmt(LoanOrigcreditorinfsgmt loanOrigcreditorinfsgmt);
	/**
	* 修改
	* @param loan_origcreditorinfsgmt 
	* @return
	*/
	public int updateLoanOrigcreditorinfsgmt(LoanOrigcreditorinfsgmt loanOrigcreditorinfsgmt);
	/**
	* 修改（根据动态条件）
	* @param loan_origcreditorinfsgmt 
	* @return
	*/
	public int updateLoanOrigcreditorinfsgmtBySelective(LoanOrigcreditorinfsgmt loanOrigcreditorinfsgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delLoanOrigcreditorinfsgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param loan_origcreditorinfsgmtList 
	* @return
	*/
	public int addBatchLoanOrigcreditorinfsgmt(List<LoanOrigcreditorinfsgmt> loanOrigcreditorinfsgmtList);
	/**
	* 批量修改
	* @param loan_origcreditorinfsgmtList 
	* @return
	*/
	public int updateBatchLoanOrigcreditorinfsgmt(List<LoanOrigcreditorinfsgmt> loanOrigcreditorinfsgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param loan_origcreditorinfsgmtList 
	* @return
	*/
	public int updateBatchLoanOrigcreditorinfsgmtBySelective(List<LoanOrigcreditorinfsgmt> loanOrigcreditorinfsgmtList);
}
