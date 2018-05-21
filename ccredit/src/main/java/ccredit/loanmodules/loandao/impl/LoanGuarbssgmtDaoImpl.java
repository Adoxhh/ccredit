package ccredit.loanmodules.loandao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.loanmodules.loandao.LoanGuarbssgmtDao;
import ccredit.loanmodules.loanmodel.LoanGuarbssgmt;

/**
* 最高额保证合同信息基础段 
* 2018-04-28 15:16:38  yangzhou
*/
@Repository("loanGuarbssgmtDao")
public class LoanGuarbssgmtDaoImpl  extends BaseDaoImpl implements LoanGuarbssgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<LoanGuarbssgmt> getLoanGuarbssgmtListByCondition(Map<String,Object> condition){
		return (List<LoanGuarbssgmt>)this.getList("getLoanGuarbssgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param loan_guarbssgmt_id 
	* @return
	*/
	public LoanGuarbssgmt getLoanGuarbssgmtById(String loan_guarbssgmt_id){
		return (LoanGuarbssgmt)this.get("getLoanGuarbssgmtById", loan_guarbssgmt_id);
	}
	/**
	* 添加
	* @param loan_guarbssgmt 
	* @return
	*/
	public int addLoanGuarbssgmt(LoanGuarbssgmt loanGuarbssgmt){
		return this.add("addLoanGuarbssgmt", loanGuarbssgmt);
	}
	/**
	* 修改
	* @param loan_guarbssgmt 
	* @return
	*/
	public int updateLoanGuarbssgmt(LoanGuarbssgmt loanGuarbssgmt){
		return this.update("updateLoanGuarbssgmt", loanGuarbssgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param loan_guarbssgmt 
	* @return
	*/
	public int updateLoanGuarbssgmtBySelective(LoanGuarbssgmt loanGuarbssgmt){
		return this.update("updateLoanGuarbssgmtBySelective", loanGuarbssgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delLoanGuarbssgmt(Map<String,Object> condition){
		return this.del("delLoanGuarbssgmt", condition);
	}
	/**
	* 批量添加
	* @param loan_guarbssgmtList 
	* @return
	*/
	public int addBatchLoanGuarbssgmt(List<LoanGuarbssgmt> loanGuarbssgmtList){
		return this.add("addBatchLoanGuarbssgmt", loanGuarbssgmtList);
	}
	/**
	* 批量修改
	* @param loan_guarbssgmtList 
	* @return
	*/
	public int updateBatchLoanGuarbssgmt(List<LoanGuarbssgmt> loanGuarbssgmtList){
		return this.update("updateBatchLoanGuarbssgmt", loanGuarbssgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param loan_guarbssgmtList 
	* @return
	*/
	public int updateBatchLoanGuarbssgmtBySelective(List<LoanGuarbssgmt> loanGuarbssgmtList){
		return this.update("updateBatchLoanGuarbssgmtBySelective", loanGuarbssgmtList);
	}
}
