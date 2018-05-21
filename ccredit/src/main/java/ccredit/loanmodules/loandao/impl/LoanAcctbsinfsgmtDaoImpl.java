package ccredit.loanmodules.loandao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.loanmodules.loandao.LoanAcctbsinfsgmtDao;
import ccredit.loanmodules.loanmodel.LoanAcctbsinfsgmt;

/**
* 借贷基本信息段 
* 2018-04-27 15:42:33  yangzhou
*/
@Repository("loanAcctbsinfsgmtDao")
public class LoanAcctbsinfsgmtDaoImpl  extends BaseDaoImpl implements LoanAcctbsinfsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<LoanAcctbsinfsgmt> getLoanAcctbsinfsgmtListByCondition(Map<String,Object> condition){
		return (List<LoanAcctbsinfsgmt>)this.getList("getLoanAcctbsinfsgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param loan_acctbsinfsgmt_id 
	* @return
	*/
	public LoanAcctbsinfsgmt getLoanAcctbsinfsgmtById(String loan_acctbsinfsgmt_id){
		return (LoanAcctbsinfsgmt)this.get("getLoanAcctbsinfsgmtById", loan_acctbsinfsgmt_id);
	}
	/**
	* 添加
	* @param loan_acctbsinfsgmt 
	* @return
	*/
	public int addLoanAcctbsinfsgmt(LoanAcctbsinfsgmt loanAcctbsinfsgmt){
		return this.add("addLoanAcctbsinfsgmt", loanAcctbsinfsgmt);
	}
	/**
	* 修改
	* @param loan_acctbsinfsgmt 
	* @return
	*/
	public int updateLoanAcctbsinfsgmt(LoanAcctbsinfsgmt loanAcctbsinfsgmt){
		return this.update("updateLoanAcctbsinfsgmt", loanAcctbsinfsgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param loan_acctbsinfsgmt 
	* @return
	*/
	public int updateLoanAcctbsinfsgmtBySelective(LoanAcctbsinfsgmt loanAcctbsinfsgmt){
		return this.update("updateLoanAcctbsinfsgmtBySelective", loanAcctbsinfsgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delLoanAcctbsinfsgmt(Map<String,Object> condition){
		return this.del("delLoanAcctbsinfsgmt", condition);
	}
	/**
	* 批量添加
	* @param loan_acctbsinfsgmtList 
	* @return
	*/
	public int addBatchLoanAcctbsinfsgmt(List<LoanAcctbsinfsgmt> loanAcctbsinfsgmtList){
		return this.add("addBatchLoanAcctbsinfsgmt", loanAcctbsinfsgmtList);
	}
	/**
	* 批量修改
	* @param loan_acctbsinfsgmtList 
	* @return
	*/
	public int updateBatchLoanAcctbsinfsgmt(List<LoanAcctbsinfsgmt> loanAcctbsinfsgmtList){
		return this.update("updateBatchLoanAcctbsinfsgmt", loanAcctbsinfsgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param loan_acctbsinfsgmtList 
	* @return
	*/
	public int updateBatchLoanAcctbsinfsgmtBySelective(List<LoanAcctbsinfsgmt> loanAcctbsinfsgmtList){
		return this.update("updateBatchLoanAcctbsinfsgmtBySelective", loanAcctbsinfsgmtList);
	}
	
	/**
	 * 查询历史信息
	 */
	public  List<?> getHisLoanListByCondition(Map<String,Object> condition){
		String tablename = (String) condition.get("table");
		return (List<?>)this.getList(tablename,condition);
	}
	
}
