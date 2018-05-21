package ccredit.loanmodules.loanservice;
import java.util.List;
import java.util.Map;
import ccredit.loanmodules.loanmodel.LoanMotgacltalctrctinfsgmt;

/**
* 抵质押物信息 
* 2018-04-27 16:27:40  yangzhou
*/
public interface LoanMotgacltalctrctinfsgmtService{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<LoanMotgacltalctrctinfsgmt> getLoanMotgacltalctrctinfsgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param loan_motgacltalctrctinfsgmt_id 
	* @return
	*/
	public LoanMotgacltalctrctinfsgmt getLoanMotgacltalctrctinfsgmtById(String loan_motgacltalctrctinfsgmt_id);
	/**
	* 添加
	* @param loan_motgacltalctrctinfsgmt 
	* @return
	*/
	public int addLoanMotgacltalctrctinfsgmt(LoanMotgacltalctrctinfsgmt loanMotgacltalctrctinfsgmt);
	/**
	* 修改
	* @param loan_motgacltalctrctinfsgmt 
	* @return
	*/
	public int updateLoanMotgacltalctrctinfsgmt(LoanMotgacltalctrctinfsgmt loanMotgacltalctrctinfsgmt);
	/**
	* 修改（根据动态条件）
	* @param loan_motgacltalctrctinfsgmt 
	* @return
	*/
	public int updateLoanMotgacltalctrctinfsgmtBySelective(LoanMotgacltalctrctinfsgmt loanMotgacltalctrctinfsgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delLoanMotgacltalctrctinfsgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param loan_motgacltalctrctinfsgmtList 
	* @return
	*/
	public int addBatchLoanMotgacltalctrctinfsgmt(List<LoanMotgacltalctrctinfsgmt> loanMotgacltalctrctinfsgmtList);
	/**
	* 批量修改
	* @param loan_motgacltalctrctinfsgmtList 
	* @return
	*/
	public int updateBatchLoanMotgacltalctrctinfsgmt(List<LoanMotgacltalctrctinfsgmt> loanMotgacltalctrctinfsgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param loan_motgacltalctrctinfsgmtList 
	* @return
	*/
	public int updateBatchLoanMotgacltalctrctinfsgmtBySelective(List<LoanMotgacltalctrctinfsgmt> loanMotgacltalctrctinfsgmtList);
}
