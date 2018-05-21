package ccredit.loanmodules.loandao;
import java.util.List;
import java.util.Map;
import ccredit.loanmodules.loanmodel.LoanCosignersgmt;

/**
* 联保人信息 
* 2018-04-28 15:18:11  yangzhou
*/
public interface LoanCosignersgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<LoanCosignersgmt> getLoanCosignersgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param loan_cosignersgmt_id 
	* @return
	*/
	public LoanCosignersgmt getLoanCosignersgmtById(String loan_cosignersgmt_id);
	/**
	* 添加
	* @param loan_cosignersgmt 
	* @return
	*/
	public int addLoanCosignersgmt(LoanCosignersgmt loanCosignersgmt);
	/**
	* 修改
	* @param loan_cosignersgmt 
	* @return
	*/
	public int updateLoanCosignersgmt(LoanCosignersgmt loanCosignersgmt);
	/**
	* 修改（根据动态条件）
	* @param loan_cosignersgmt 
	* @return
	*/
	public int updateLoanCosignersgmtBySelective(LoanCosignersgmt loanCosignersgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delLoanCosignersgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param loan_cosignersgmtList 
	* @return
	*/
	public int addBatchLoanCosignersgmt(List<LoanCosignersgmt> loanCosignersgmtList);
	/**
	* 批量修改
	* @param loan_cosignersgmtList 
	* @return
	*/
	public int updateBatchLoanCosignersgmt(List<LoanCosignersgmt> loanCosignersgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param loan_cosignersgmtList 
	* @return
	*/
	public int updateBatchLoanCosignersgmtBySelective(List<LoanCosignersgmt> loanCosignersgmtList);
}
