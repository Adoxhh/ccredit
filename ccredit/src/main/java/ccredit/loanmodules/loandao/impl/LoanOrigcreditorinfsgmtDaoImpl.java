package ccredit.loanmodules.loandao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.loanmodules.loandao.LoanOrigcreditorinfsgmtDao;
import ccredit.loanmodules.loanmodel.LoanOrigcreditorinfsgmt;

/**
* 初始债权说明 
* 2018-04-27 16:32:12  yangzhou
*/
@Repository("loanOrigcreditorinfsgmtDao")
public class LoanOrigcreditorinfsgmtDaoImpl  extends BaseDaoImpl implements LoanOrigcreditorinfsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<LoanOrigcreditorinfsgmt> getLoanOrigcreditorinfsgmtListByCondition(Map<String,Object> condition){
		return (List<LoanOrigcreditorinfsgmt>)this.getList("getLoanOrigcreditorinfsgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param loan_origcreditorinfsgmt_id 
	* @return
	*/
	public LoanOrigcreditorinfsgmt getLoanOrigcreditorinfsgmtById(String loan_origcreditorinfsgmt_id){
		return (LoanOrigcreditorinfsgmt)this.get("getLoanOrigcreditorinfsgmtById", loan_origcreditorinfsgmt_id);
	}
	/**
	* 添加
	* @param loan_origcreditorinfsgmt 
	* @return
	*/
	public int addLoanOrigcreditorinfsgmt(LoanOrigcreditorinfsgmt loanOrigcreditorinfsgmt){
		return this.add("addLoanOrigcreditorinfsgmt", loanOrigcreditorinfsgmt);
	}
	/**
	* 修改
	* @param loan_origcreditorinfsgmt 
	* @return
	*/
	public int updateLoanOrigcreditorinfsgmt(LoanOrigcreditorinfsgmt loanOrigcreditorinfsgmt){
		return this.update("updateLoanOrigcreditorinfsgmt", loanOrigcreditorinfsgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param loan_origcreditorinfsgmt 
	* @return
	*/
	public int updateLoanOrigcreditorinfsgmtBySelective(LoanOrigcreditorinfsgmt loanOrigcreditorinfsgmt){
		return this.update("updateLoanOrigcreditorinfsgmtBySelective", loanOrigcreditorinfsgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delLoanOrigcreditorinfsgmt(Map<String,Object> condition){
		return this.del("delLoanOrigcreditorinfsgmt", condition);
	}
	/**
	* 批量添加
	* @param loan_origcreditorinfsgmtList 
	* @return
	*/
	public int addBatchLoanOrigcreditorinfsgmt(List<LoanOrigcreditorinfsgmt> loanOrigcreditorinfsgmtList){
		return this.add("addBatchLoanOrigcreditorinfsgmt", loanOrigcreditorinfsgmtList);
	}
	/**
	* 批量修改
	* @param loan_origcreditorinfsgmtList 
	* @return
	*/
	public int updateBatchLoanOrigcreditorinfsgmt(List<LoanOrigcreditorinfsgmt> loanOrigcreditorinfsgmtList){
		return this.update("updateBatchLoanOrigcreditorinfsgmt", loanOrigcreditorinfsgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param loan_origcreditorinfsgmtList 
	* @return
	*/
	public int updateBatchLoanOrigcreditorinfsgmtBySelective(List<LoanOrigcreditorinfsgmt> loanOrigcreditorinfsgmtList){
		return this.update("updateBatchLoanOrigcreditorinfsgmtBySelective", loanOrigcreditorinfsgmtList);
	}
}
