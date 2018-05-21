package ccredit.loanmodules.loanservice;
import java.util.List;
import java.util.Map;
import ccredit.loanmodules.loanmodel.LoanCtrctbssgmt;

/**
* 企业授信协议信息基础段 
* 2018-04-28 09:51:22  yangzhou
*/
public interface LoanCtrctbssgmtService{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<LoanCtrctbssgmt> getLoanCtrctbssgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param loan_ctrctbssgmt_id 
	* @return
	*/
	public LoanCtrctbssgmt getLoanCtrctbssgmtById(String loan_ctrctbssgmt_id);
	/**
	* 添加
	* @param loan_ctrctbssgmt 
	* @return
	*/
	public int addLoanCtrctbssgmt(LoanCtrctbssgmt loanCtrctbssgmt);
	/**
	* 修改
	* @param loan_ctrctbssgmt 
	* @return
	*/
	public int updateLoanCtrctbssgmt(LoanCtrctbssgmt loanCtrctbssgmt);
	/**
	* 修改（根据动态条件）
	* @param loan_ctrctbssgmt 
	* @return
	*/
	public int updateLoanCtrctbssgmtBySelective(LoanCtrctbssgmt loanCtrctbssgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delLoanCtrctbssgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param loan_ctrctbssgmtList 
	* @return
	*/
	public int addBatchLoanCtrctbssgmt(List<LoanCtrctbssgmt> loanCtrctbssgmtList);
	/**
	* 批量修改
	* @param loan_ctrctbssgmtList 
	* @return
	*/
	public int updateBatchLoanCtrctbssgmt(List<LoanCtrctbssgmt> loanCtrctbssgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param loan_ctrctbssgmtList 
	* @return
	*/
	public int updateBatchLoanCtrctbssgmtBySelective(List<LoanCtrctbssgmt> loanCtrctbssgmtList);
}
