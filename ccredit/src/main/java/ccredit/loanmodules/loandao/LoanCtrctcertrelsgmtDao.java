package ccredit.loanmodules.loandao;
import java.util.List;
import java.util.Map;
import ccredit.loanmodules.loanmodel.LoanCtrctcertrelsgmt;

/**
* 共同受信人信息 
* 2018-04-28 11:02:26  yangzhou
*/
public interface LoanCtrctcertrelsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<LoanCtrctcertrelsgmt> getLoanCtrctcertrelsgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param loan_ctrctcertrelsgmt_id 
	* @return
	*/
	public LoanCtrctcertrelsgmt getLoanCtrctcertrelsgmtById(String loan_ctrctcertrelsgmt_id);
	/**
	* 添加
	* @param loan_ctrctcertrelsgmt 
	* @return
	*/
	public int addLoanCtrctcertrelsgmt(LoanCtrctcertrelsgmt loanCtrctcertrelsgmt);
	/**
	* 修改
	* @param loan_ctrctcertrelsgmt 
	* @return
	*/
	public int updateLoanCtrctcertrelsgmt(LoanCtrctcertrelsgmt loanCtrctcertrelsgmt);
	/**
	* 修改（根据动态条件）
	* @param loan_ctrctcertrelsgmt 
	* @return
	*/
	public int updateLoanCtrctcertrelsgmtBySelective(LoanCtrctcertrelsgmt loanCtrctcertrelsgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delLoanCtrctcertrelsgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param loan_ctrctcertrelsgmtList 
	* @return
	*/
	public int addBatchLoanCtrctcertrelsgmt(List<LoanCtrctcertrelsgmt> loanCtrctcertrelsgmtList);
	/**
	* 批量修改
	* @param loan_ctrctcertrelsgmtList 
	* @return
	*/
	public int updateBatchLoanCtrctcertrelsgmt(List<LoanCtrctcertrelsgmt> loanCtrctcertrelsgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param loan_ctrctcertrelsgmtList 
	* @return
	*/
	public int updateBatchLoanCtrctcertrelsgmtBySelective(List<LoanCtrctcertrelsgmt> loanCtrctcertrelsgmtList);
}
