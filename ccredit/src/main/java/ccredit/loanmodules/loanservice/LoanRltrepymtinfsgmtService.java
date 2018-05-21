package ccredit.loanmodules.loanservice;
import java.util.List;
import java.util.Map;
import ccredit.loanmodules.loanmodel.LoanRltrepymtinfsgmt;

/**
* 相关还款责任人 
* 2018-04-27 16:25:40  yangzhou
*/
public interface LoanRltrepymtinfsgmtService{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<LoanRltrepymtinfsgmt> getLoanRltrepymtinfsgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param loan_rltrepymtinfsgmt_id 
	* @return
	*/
	public LoanRltrepymtinfsgmt getLoanRltrepymtinfsgmtById(String loan_rltrepymtinfsgmt_id);
	/**
	* 添加
	* @param loan_rltrepymtinfsgmt 
	* @return
	*/
	public int addLoanRltrepymtinfsgmt(LoanRltrepymtinfsgmt loanRltrepymtinfsgmt);
	/**
	* 修改
	* @param loan_rltrepymtinfsgmt 
	* @return
	*/
	public int updateLoanRltrepymtinfsgmt(LoanRltrepymtinfsgmt loanRltrepymtinfsgmt);
	/**
	* 修改（根据动态条件）
	* @param loan_rltrepymtinfsgmt 
	* @return
	*/
	public int updateLoanRltrepymtinfsgmtBySelective(LoanRltrepymtinfsgmt loanRltrepymtinfsgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delLoanRltrepymtinfsgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param loan_rltrepymtinfsgmtList 
	* @return
	*/
	public int addBatchLoanRltrepymtinfsgmt(List<LoanRltrepymtinfsgmt> loanRltrepymtinfsgmtList);
	/**
	* 批量修改
	* @param loan_rltrepymtinfsgmtList 
	* @return
	*/
	public int updateBatchLoanRltrepymtinfsgmt(List<LoanRltrepymtinfsgmt> loanRltrepymtinfsgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param loan_rltrepymtinfsgmtList 
	* @return
	*/
	public int updateBatchLoanRltrepymtinfsgmtBySelective(List<LoanRltrepymtinfsgmt> loanRltrepymtinfsgmtList);
}
