package ccredit.loanmodules.loandao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.loanmodules.loandao.LoanAcctcredsgmtDao;
import ccredit.loanmodules.loanmodel.LoanAcctcredsgmt;

/**
* 授信额度信息 
* 2018-04-27 16:30:17  yangzhou
*/
@Repository("loanAcctcredsgmtDao")
public class LoanAcctcredsgmtDaoImpl  extends BaseDaoImpl implements LoanAcctcredsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<LoanAcctcredsgmt> getLoanAcctcredsgmtListByCondition(Map<String,Object> condition){
		return (List<LoanAcctcredsgmt>)this.getList("getLoanAcctcredsgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param loan_acctcredsgmt_id 
	* @return
	*/
	public LoanAcctcredsgmt getLoanAcctcredsgmtById(String loan_acctcredsgmt_id){
		return (LoanAcctcredsgmt)this.get("getLoanAcctcredsgmtById", loan_acctcredsgmt_id);
	}
	/**
	* 添加
	* @param loan_acctcredsgmt 
	* @return
	*/
	public int addLoanAcctcredsgmt(LoanAcctcredsgmt loanAcctcredsgmt){
		return this.add("addLoanAcctcredsgmt", loanAcctcredsgmt);
	}
	/**
	* 修改
	* @param loan_acctcredsgmt 
	* @return
	*/
	public int updateLoanAcctcredsgmt(LoanAcctcredsgmt loanAcctcredsgmt){
		return this.update("updateLoanAcctcredsgmt", loanAcctcredsgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param loan_acctcredsgmt 
	* @return
	*/
	public int updateLoanAcctcredsgmtBySelective(LoanAcctcredsgmt loanAcctcredsgmt){
		return this.update("updateLoanAcctcredsgmtBySelective", loanAcctcredsgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delLoanAcctcredsgmt(Map<String,Object> condition){
		return this.del("delLoanAcctcredsgmt", condition);
	}
	/**
	* 批量添加
	* @param loan_acctcredsgmtList 
	* @return
	*/
	public int addBatchLoanAcctcredsgmt(List<LoanAcctcredsgmt> loanAcctcredsgmtList){
		return this.add("addBatchLoanAcctcredsgmt", loanAcctcredsgmtList);
	}
	/**
	* 批量修改
	* @param loan_acctcredsgmtList 
	* @return
	*/
	public int updateBatchLoanAcctcredsgmt(List<LoanAcctcredsgmt> loanAcctcredsgmtList){
		return this.update("updateBatchLoanAcctcredsgmt", loanAcctcredsgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param loan_acctcredsgmtList 
	* @return
	*/
	public int updateBatchLoanAcctcredsgmtBySelective(List<LoanAcctcredsgmt> loanAcctcredsgmtList){
		return this.update("updateBatchLoanAcctcredsgmtBySelective", loanAcctcredsgmtList);
	}
}
