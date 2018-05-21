package ccredit.loanmodules.loandao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.loanmodules.loandao.LoanCosignersgmtDao;
import ccredit.loanmodules.loanmodel.LoanCosignersgmt;

/**
* 联保人信息 
* 2018-04-28 15:18:11  yangzhou
*/
@Repository("loanCosignersgmtDao")
public class LoanCosignersgmtDaoImpl  extends BaseDaoImpl implements LoanCosignersgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<LoanCosignersgmt> getLoanCosignersgmtListByCondition(Map<String,Object> condition){
		return (List<LoanCosignersgmt>)this.getList("getLoanCosignersgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param loan_cosignersgmt_id 
	* @return
	*/
	public LoanCosignersgmt getLoanCosignersgmtById(String loan_cosignersgmt_id){
		return (LoanCosignersgmt)this.get("getLoanCosignersgmtById", loan_cosignersgmt_id);
	}
	/**
	* 添加
	* @param loan_cosignersgmt 
	* @return
	*/
	public int addLoanCosignersgmt(LoanCosignersgmt loanCosignersgmt){
		return this.add("addLoanCosignersgmt", loanCosignersgmt);
	}
	/**
	* 修改
	* @param loan_cosignersgmt 
	* @return
	*/
	public int updateLoanCosignersgmt(LoanCosignersgmt loanCosignersgmt){
		return this.update("updateLoanCosignersgmt", loanCosignersgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param loan_cosignersgmt 
	* @return
	*/
	public int updateLoanCosignersgmtBySelective(LoanCosignersgmt loanCosignersgmt){
		return this.update("updateLoanCosignersgmtBySelective", loanCosignersgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delLoanCosignersgmt(Map<String,Object> condition){
		return this.del("delLoanCosignersgmt", condition);
	}
	/**
	* 批量添加
	* @param loan_cosignersgmtList 
	* @return
	*/
	public int addBatchLoanCosignersgmt(List<LoanCosignersgmt> loanCosignersgmtList){
		return this.add("addBatchLoanCosignersgmt", loanCosignersgmtList);
	}
	/**
	* 批量修改
	* @param loan_cosignersgmtList 
	* @return
	*/
	public int updateBatchLoanCosignersgmt(List<LoanCosignersgmt> loanCosignersgmtList){
		return this.update("updateBatchLoanCosignersgmt", loanCosignersgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param loan_cosignersgmtList 
	* @return
	*/
	public int updateBatchLoanCosignersgmtBySelective(List<LoanCosignersgmt> loanCosignersgmtList){
		return this.update("updateBatchLoanCosignersgmtBySelective", loanCosignersgmtList);
	}
}
