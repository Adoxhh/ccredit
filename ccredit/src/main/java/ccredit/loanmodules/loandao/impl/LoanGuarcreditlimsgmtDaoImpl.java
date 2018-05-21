package ccredit.loanmodules.loandao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.loanmodules.loandao.LoanGuarcreditlimsgmtDao;
import ccredit.loanmodules.loanmodel.LoanGuarcreditlimsgmt;

/**
* 最高额额度信息 
* 2018-04-28 15:20:42  yangzhou
*/
@Repository("loanGuarcreditlimsgmtDao")
public class LoanGuarcreditlimsgmtDaoImpl  extends BaseDaoImpl implements LoanGuarcreditlimsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<LoanGuarcreditlimsgmt> getLoanGuarcreditlimsgmtListByCondition(Map<String,Object> condition){
		return (List<LoanGuarcreditlimsgmt>)this.getList("getLoanGuarcreditlimsgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param loan_guarcreditlimsgmt_id 
	* @return
	*/
	public LoanGuarcreditlimsgmt getLoanGuarcreditlimsgmtById(String loan_guarcreditlimsgmt_id){
		return (LoanGuarcreditlimsgmt)this.get("getLoanGuarcreditlimsgmtById", loan_guarcreditlimsgmt_id);
	}
	/**
	* 添加
	* @param loan_guarcreditlimsgmt 
	* @return
	*/
	public int addLoanGuarcreditlimsgmt(LoanGuarcreditlimsgmt loanGuarcreditlimsgmt){
		return this.add("addLoanGuarcreditlimsgmt", loanGuarcreditlimsgmt);
	}
	/**
	* 修改
	* @param loan_guarcreditlimsgmt 
	* @return
	*/
	public int updateLoanGuarcreditlimsgmt(LoanGuarcreditlimsgmt loanGuarcreditlimsgmt){
		return this.update("updateLoanGuarcreditlimsgmt", loanGuarcreditlimsgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param loan_guarcreditlimsgmt 
	* @return
	*/
	public int updateLoanGuarcreditlimsgmtBySelective(LoanGuarcreditlimsgmt loanGuarcreditlimsgmt){
		return this.update("updateLoanGuarcreditlimsgmtBySelective", loanGuarcreditlimsgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delLoanGuarcreditlimsgmt(Map<String,Object> condition){
		return this.del("delLoanGuarcreditlimsgmt", condition);
	}
	/**
	* 批量添加
	* @param loan_guarcreditlimsgmtList 
	* @return
	*/
	public int addBatchLoanGuarcreditlimsgmt(List<LoanGuarcreditlimsgmt> loanGuarcreditlimsgmtList){
		return this.add("addBatchLoanGuarcreditlimsgmt", loanGuarcreditlimsgmtList);
	}
	/**
	* 批量修改
	* @param loan_guarcreditlimsgmtList 
	* @return
	*/
	public int updateBatchLoanGuarcreditlimsgmt(List<LoanGuarcreditlimsgmt> loanGuarcreditlimsgmtList){
		return this.update("updateBatchLoanGuarcreditlimsgmt", loanGuarcreditlimsgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param loan_guarcreditlimsgmtList 
	* @return
	*/
	public int updateBatchLoanGuarcreditlimsgmtBySelective(List<LoanGuarcreditlimsgmt> loanGuarcreditlimsgmtList){
		return this.update("updateBatchLoanGuarcreditlimsgmtBySelective", loanGuarcreditlimsgmtList);
	}
}
