package ccredit.loanmodules.loandao;
import java.util.List;
import java.util.Map;
import ccredit.loanmodules.loanmodel.LoanActlbltyinfsgmt;

/**
* 还款表现信息 
* 2018-04-27 16:35:45  yangzhou
*/
public interface LoanActlbltyinfsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<LoanActlbltyinfsgmt> getLoanActlbltyinfsgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param loan_actlbltyinfsgmt_id 
	* @return
	*/
	public LoanActlbltyinfsgmt getLoanActlbltyinfsgmtById(String loan_actlbltyinfsgmt_id);
	/**
	* 添加
	* @param loan_actlbltyinfsgmt 
	* @return
	*/
	public int addLoanActlbltyinfsgmt(LoanActlbltyinfsgmt loanActlbltyinfsgmt);
	/**
	* 修改
	* @param loan_actlbltyinfsgmt 
	* @return
	*/
	public int updateLoanActlbltyinfsgmt(LoanActlbltyinfsgmt loanActlbltyinfsgmt);
	/**
	* 修改（根据动态条件）
	* @param loan_actlbltyinfsgmt 
	* @return
	*/
	public int updateLoanActlbltyinfsgmtBySelective(LoanActlbltyinfsgmt loanActlbltyinfsgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delLoanActlbltyinfsgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param loan_actlbltyinfsgmtList 
	* @return
	*/
	public int addBatchLoanActlbltyinfsgmt(List<LoanActlbltyinfsgmt> loanActlbltyinfsgmtList);
	/**
	* 批量修改
	* @param loan_actlbltyinfsgmtList 
	* @return
	*/
	public int updateBatchLoanActlbltyinfsgmt(List<LoanActlbltyinfsgmt> loanActlbltyinfsgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param loan_actlbltyinfsgmtList 
	* @return
	*/
	public int updateBatchLoanActlbltyinfsgmtBySelective(List<LoanActlbltyinfsgmt> loanActlbltyinfsgmtList);
}
