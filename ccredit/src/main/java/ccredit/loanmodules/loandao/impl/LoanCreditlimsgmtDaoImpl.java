package ccredit.loanmodules.loandao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.loanmodules.loandao.LoanCreditlimsgmtDao;
import ccredit.loanmodules.loanmodel.LoanCreditlimsgmt;

/**
* 授信额度信息 
* 2018-04-28 11:05:34  yangzhou
*/
@Repository("loanCreditlimsgmtDao")
public class LoanCreditlimsgmtDaoImpl  extends BaseDaoImpl implements LoanCreditlimsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<LoanCreditlimsgmt> getLoanCreditlimsgmtListByCondition(Map<String,Object> condition){
		return (List<LoanCreditlimsgmt>)this.getList("getLoanCreditlimsgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param loan_creditlimsgmt_id 
	* @return
	*/
	public LoanCreditlimsgmt getLoanCreditlimsgmtById(String loan_creditlimsgmt_id){
		return (LoanCreditlimsgmt)this.get("getLoanCreditlimsgmtById", loan_creditlimsgmt_id);
	}
	/**
	* 添加
	* @param loan_creditlimsgmt 
	* @return
	*/
	public int addLoanCreditlimsgmt(LoanCreditlimsgmt loanCreditlimsgmt){
		return this.add("addLoanCreditlimsgmt", loanCreditlimsgmt);
	}
	/**
	* 修改
	* @param loan_creditlimsgmt 
	* @return
	*/
	public int updateLoanCreditlimsgmt(LoanCreditlimsgmt loanCreditlimsgmt){
		return this.update("updateLoanCreditlimsgmt", loanCreditlimsgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param loan_creditlimsgmt 
	* @return
	*/
	public int updateLoanCreditlimsgmtBySelective(LoanCreditlimsgmt loanCreditlimsgmt){
		return this.update("updateLoanCreditlimsgmtBySelective", loanCreditlimsgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delLoanCreditlimsgmt(Map<String,Object> condition){
		return this.del("delLoanCreditlimsgmt", condition);
	}
	/**
	* 批量添加
	* @param loan_creditlimsgmtList 
	* @return
	*/
	public int addBatchLoanCreditlimsgmt(List<LoanCreditlimsgmt> loanCreditlimsgmtList){
		return this.add("addBatchLoanCreditlimsgmt", loanCreditlimsgmtList);
	}
	/**
	* 批量修改
	* @param loan_creditlimsgmtList 
	* @return
	*/
	public int updateBatchLoanCreditlimsgmt(List<LoanCreditlimsgmt> loanCreditlimsgmtList){
		return this.update("updateBatchLoanCreditlimsgmt", loanCreditlimsgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param loan_creditlimsgmtList 
	* @return
	*/
	public int updateBatchLoanCreditlimsgmtBySelective(List<LoanCreditlimsgmt> loanCreditlimsgmtList){
		return this.update("updateBatchLoanCreditlimsgmtBySelective", loanCreditlimsgmtList);
	}
}
