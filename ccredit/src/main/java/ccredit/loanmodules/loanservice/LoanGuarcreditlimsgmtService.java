package ccredit.loanmodules.loanservice;
import java.util.List;
import java.util.Map;
import ccredit.loanmodules.loanmodel.LoanGuarcreditlimsgmt;

/**
* 最高额额度信息 
* 2018-04-28 15:20:42  yangzhou
*/
public interface LoanGuarcreditlimsgmtService{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<LoanGuarcreditlimsgmt> getLoanGuarcreditlimsgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param loan_guarcreditlimsgmt_id 
	* @return
	*/
	public LoanGuarcreditlimsgmt getLoanGuarcreditlimsgmtById(String loan_guarcreditlimsgmt_id);
	/**
	* 添加
	* @param loan_guarcreditlimsgmt 
	* @return
	*/
	public int addLoanGuarcreditlimsgmt(LoanGuarcreditlimsgmt loanGuarcreditlimsgmt);
	/**
	* 修改
	* @param loan_guarcreditlimsgmt 
	* @return
	*/
	public int updateLoanGuarcreditlimsgmt(LoanGuarcreditlimsgmt loanGuarcreditlimsgmt);
	/**
	* 修改（根据动态条件）
	* @param loan_guarcreditlimsgmt 
	* @return
	*/
	public int updateLoanGuarcreditlimsgmtBySelective(LoanGuarcreditlimsgmt loanGuarcreditlimsgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delLoanGuarcreditlimsgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param loan_guarcreditlimsgmtList 
	* @return
	*/
	public int addBatchLoanGuarcreditlimsgmt(List<LoanGuarcreditlimsgmt> loanGuarcreditlimsgmtList);
	/**
	* 批量修改
	* @param loan_guarcreditlimsgmtList 
	* @return
	*/
	public int updateBatchLoanGuarcreditlimsgmt(List<LoanGuarcreditlimsgmt> loanGuarcreditlimsgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param loan_guarcreditlimsgmtList 
	* @return
	*/
	public int updateBatchLoanGuarcreditlimsgmtBySelective(List<LoanGuarcreditlimsgmt> loanGuarcreditlimsgmtList);
}
