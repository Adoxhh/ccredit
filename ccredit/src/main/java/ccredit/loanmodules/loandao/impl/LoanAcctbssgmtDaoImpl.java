package ccredit.loanmodules.loandao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.loanmodules.loandao.LoanAcctbssgmtDao;
import ccredit.loanmodules.loanmodel.LoanAcctbssgmt;

/**
* 企业借贷信息基础段 
* 2018-04-26 14:53:04  yangzhou
*/
@Repository("loanAcctbssgmtDao")
public class LoanAcctbssgmtDaoImpl  extends BaseDaoImpl implements LoanAcctbssgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<LoanAcctbssgmt> getLoanAcctbssgmtListByCondition(Map<String,Object> condition){
		return (List<LoanAcctbssgmt>)this.getList("getLoanAcctbssgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param loan_acctbssgmt_id 
	* @return
	*/
	public LoanAcctbssgmt getLoanAcctbssgmtById(String loan_acctbssgmt_id){
		return (LoanAcctbssgmt)this.get("getLoanAcctbssgmtById", loan_acctbssgmt_id);
	}
	/**
	* 添加
	* @param loan_acctbssgmt 
	* @return
	*/
	public int addLoanAcctbssgmt(LoanAcctbssgmt loanAcctbssgmt){
		return this.add("addLoanAcctbssgmt", loanAcctbssgmt);
	}
	/**
	* 修改
	* @param loan_acctbssgmt 
	* @return
	*/
	public int updateLoanAcctbssgmt(LoanAcctbssgmt loanAcctbssgmt){
		return this.update("updateLoanAcctbssgmt", loanAcctbssgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param loan_acctbssgmt 
	* @return
	*/
	public int updateLoanAcctbssgmtBySelective(LoanAcctbssgmt loanAcctbssgmt){
		return this.update("updateLoanAcctbssgmtBySelective", loanAcctbssgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delLoanAcctbssgmt(Map<String,Object> condition){
		return this.del("delLoanAcctbssgmt", condition);
	}
	/**
	* 批量添加
	* @param loan_acctbssgmtList 
	* @return
	*/
	public int addBatchLoanAcctbssgmt(List<LoanAcctbssgmt> loanAcctbssgmtList){
		return this.add("addBatchLoanAcctbssgmt", loanAcctbssgmtList);
	}
	/**
	* 批量修改
	* @param loan_acctbssgmtList 
	* @return
	*/
	public int updateBatchLoanAcctbssgmt(List<LoanAcctbssgmt> loanAcctbssgmtList){
		return this.update("updateBatchLoanAcctbssgmt", loanAcctbssgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param loan_acctbssgmtList 
	* @return
	*/
	public int updateBatchLoanAcctbssgmtBySelective(List<LoanAcctbssgmt> loanAcctbssgmtList){
		return this.update("updateBatchLoanAcctbssgmtBySelective", loanAcctbssgmtList);
	}
}
