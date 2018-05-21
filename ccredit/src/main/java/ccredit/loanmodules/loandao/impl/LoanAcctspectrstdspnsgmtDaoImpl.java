package ccredit.loanmodules.loandao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.loanmodules.loandao.LoanAcctspectrstdspnsgmtDao;
import ccredit.loanmodules.loanmodel.LoanAcctspectrstdspnsgmt;

/**
* 特定交易说明 
* 2018-04-27 16:37:31  yangzhou
*/
@Repository("loanAcctspectrstdspnsgmtDao")
public class LoanAcctspectrstdspnsgmtDaoImpl  extends BaseDaoImpl implements LoanAcctspectrstdspnsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<LoanAcctspectrstdspnsgmt> getLoanAcctspectrstdspnsgmtListByCondition(Map<String,Object> condition){
		return (List<LoanAcctspectrstdspnsgmt>)this.getList("getLoanAcctspectrstdspnsgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param loan_acctspectrstdspnsgmt_id 
	* @return
	*/
	public LoanAcctspectrstdspnsgmt getLoanAcctspectrstdspnsgmtById(String loan_acctspectrstdspnsgmt_id){
		return (LoanAcctspectrstdspnsgmt)this.get("getLoanAcctspectrstdspnsgmtById", loan_acctspectrstdspnsgmt_id);
	}
	/**
	* 添加
	* @param loan_acctspectrstdspnsgmt 
	* @return
	*/
	public int addLoanAcctspectrstdspnsgmt(LoanAcctspectrstdspnsgmt loanAcctspectrstdspnsgmt){
		return this.add("addLoanAcctspectrstdspnsgmt", loanAcctspectrstdspnsgmt);
	}
	/**
	* 修改
	* @param loan_acctspectrstdspnsgmt 
	* @return
	*/
	public int updateLoanAcctspectrstdspnsgmt(LoanAcctspectrstdspnsgmt loanAcctspectrstdspnsgmt){
		return this.update("updateLoanAcctspectrstdspnsgmt", loanAcctspectrstdspnsgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param loan_acctspectrstdspnsgmt 
	* @return
	*/
	public int updateLoanAcctspectrstdspnsgmtBySelective(LoanAcctspectrstdspnsgmt loanAcctspectrstdspnsgmt){
		return this.update("updateLoanAcctspectrstdspnsgmtBySelective", loanAcctspectrstdspnsgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delLoanAcctspectrstdspnsgmt(Map<String,Object> condition){
		return this.del("delLoanAcctspectrstdspnsgmt", condition);
	}
	/**
	* 批量添加
	* @param loan_acctspectrstdspnsgmtList 
	* @return
	*/
	public int addBatchLoanAcctspectrstdspnsgmt(List<LoanAcctspectrstdspnsgmt> loanAcctspectrstdspnsgmtList){
		return this.add("addBatchLoanAcctspectrstdspnsgmt", loanAcctspectrstdspnsgmtList);
	}
	/**
	* 批量修改
	* @param loan_acctspectrstdspnsgmtList 
	* @return
	*/
	public int updateBatchLoanAcctspectrstdspnsgmt(List<LoanAcctspectrstdspnsgmt> loanAcctspectrstdspnsgmtList){
		return this.update("updateBatchLoanAcctspectrstdspnsgmt", loanAcctspectrstdspnsgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param loan_acctspectrstdspnsgmtList 
	* @return
	*/
	public int updateBatchLoanAcctspectrstdspnsgmtBySelective(List<LoanAcctspectrstdspnsgmt> loanAcctspectrstdspnsgmtList){
		return this.update("updateBatchLoanAcctspectrstdspnsgmtBySelective", loanAcctspectrstdspnsgmtList);
	}
}
