package ccredit.loanmodules.loandao;
import java.util.List;
import java.util.Map;
import ccredit.loanmodules.loanmodel.LoanAcctspectrstdspnsgmt;

/**
* 特定交易说明 
* 2018-04-27 16:37:31  yangzhou
*/
public interface LoanAcctspectrstdspnsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<LoanAcctspectrstdspnsgmt> getLoanAcctspectrstdspnsgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param loan_acctspectrstdspnsgmt_id 
	* @return
	*/
	public LoanAcctspectrstdspnsgmt getLoanAcctspectrstdspnsgmtById(String loan_acctspectrstdspnsgmt_id);
	/**
	* 添加
	* @param loan_acctspectrstdspnsgmt 
	* @return
	*/
	public int addLoanAcctspectrstdspnsgmt(LoanAcctspectrstdspnsgmt loanAcctspectrstdspnsgmt);
	/**
	* 修改
	* @param loan_acctspectrstdspnsgmt 
	* @return
	*/
	public int updateLoanAcctspectrstdspnsgmt(LoanAcctspectrstdspnsgmt loanAcctspectrstdspnsgmt);
	/**
	* 修改（根据动态条件）
	* @param loan_acctspectrstdspnsgmt 
	* @return
	*/
	public int updateLoanAcctspectrstdspnsgmtBySelective(LoanAcctspectrstdspnsgmt loanAcctspectrstdspnsgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delLoanAcctspectrstdspnsgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param loan_acctspectrstdspnsgmtList 
	* @return
	*/
	public int addBatchLoanAcctspectrstdspnsgmt(List<LoanAcctspectrstdspnsgmt> loanAcctspectrstdspnsgmtList);
	/**
	* 批量修改
	* @param loan_acctspectrstdspnsgmtList 
	* @return
	*/
	public int updateBatchLoanAcctspectrstdspnsgmt(List<LoanAcctspectrstdspnsgmt> loanAcctspectrstdspnsgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param loan_acctspectrstdspnsgmtList 
	* @return
	*/
	public int updateBatchLoanAcctspectrstdspnsgmtBySelective(List<LoanAcctspectrstdspnsgmt> loanAcctspectrstdspnsgmtList);
}
