package ccredit.loanmodules.loandao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.loanmodules.loandao.LoanRltrepymtinfsgmtDao;
import ccredit.loanmodules.loanmodel.LoanRltrepymtinfsgmt;

/**
* 相关还款责任人 
* 2018-04-27 16:25:40  yangzhou
*/
@Repository("loanRltrepymtinfsgmtDao")
public class LoanRltrepymtinfsgmtDaoImpl  extends BaseDaoImpl implements LoanRltrepymtinfsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<LoanRltrepymtinfsgmt> getLoanRltrepymtinfsgmtListByCondition(Map<String,Object> condition){
		return (List<LoanRltrepymtinfsgmt>)this.getList("getLoanRltrepymtinfsgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param loan_rltrepymtinfsgmt_id 
	* @return
	*/
	public LoanRltrepymtinfsgmt getLoanRltrepymtinfsgmtById(String loan_rltrepymtinfsgmt_id){
		return (LoanRltrepymtinfsgmt)this.get("getLoanRltrepymtinfsgmtById", loan_rltrepymtinfsgmt_id);
	}
	/**
	* 添加
	* @param loan_rltrepymtinfsgmt 
	* @return
	*/
	public int addLoanRltrepymtinfsgmt(LoanRltrepymtinfsgmt loanRltrepymtinfsgmt){
		return this.add("addLoanRltrepymtinfsgmt", loanRltrepymtinfsgmt);
	}
	/**
	* 修改
	* @param loan_rltrepymtinfsgmt 
	* @return
	*/
	public int updateLoanRltrepymtinfsgmt(LoanRltrepymtinfsgmt loanRltrepymtinfsgmt){
		return this.update("updateLoanRltrepymtinfsgmt", loanRltrepymtinfsgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param loan_rltrepymtinfsgmt 
	* @return
	*/
	public int updateLoanRltrepymtinfsgmtBySelective(LoanRltrepymtinfsgmt loanRltrepymtinfsgmt){
		return this.update("updateLoanRltrepymtinfsgmtBySelective", loanRltrepymtinfsgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delLoanRltrepymtinfsgmt(Map<String,Object> condition){
		return this.del("delLoanRltrepymtinfsgmt", condition);
	}
	/**
	* 批量添加
	* @param loan_rltrepymtinfsgmtList 
	* @return
	*/
	public int addBatchLoanRltrepymtinfsgmt(List<LoanRltrepymtinfsgmt> loanRltrepymtinfsgmtList){
		return this.add("addBatchLoanRltrepymtinfsgmt", loanRltrepymtinfsgmtList);
	}
	/**
	* 批量修改
	* @param loan_rltrepymtinfsgmtList 
	* @return
	*/
	public int updateBatchLoanRltrepymtinfsgmt(List<LoanRltrepymtinfsgmt> loanRltrepymtinfsgmtList){
		return this.update("updateBatchLoanRltrepymtinfsgmt", loanRltrepymtinfsgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param loan_rltrepymtinfsgmtList 
	* @return
	*/
	public int updateBatchLoanRltrepymtinfsgmtBySelective(List<LoanRltrepymtinfsgmt> loanRltrepymtinfsgmtList){
		return this.update("updateBatchLoanRltrepymtinfsgmtBySelective", loanRltrepymtinfsgmtList);
	}
}
