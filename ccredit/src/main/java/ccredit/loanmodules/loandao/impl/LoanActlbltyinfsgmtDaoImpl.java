package ccredit.loanmodules.loandao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.loanmodules.loandao.LoanActlbltyinfsgmtDao;
import ccredit.loanmodules.loanmodel.LoanActlbltyinfsgmt;

/**
* 还款表现信息 
* 2018-04-27 16:35:45  yangzhou
*/
@Repository("loanActlbltyinfsgmtDao")
public class LoanActlbltyinfsgmtDaoImpl  extends BaseDaoImpl implements LoanActlbltyinfsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<LoanActlbltyinfsgmt> getLoanActlbltyinfsgmtListByCondition(Map<String,Object> condition){
		return (List<LoanActlbltyinfsgmt>)this.getList("getLoanActlbltyinfsgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param loan_actlbltyinfsgmt_id 
	* @return
	*/
	public LoanActlbltyinfsgmt getLoanActlbltyinfsgmtById(String loan_actlbltyinfsgmt_id){
		return (LoanActlbltyinfsgmt)this.get("getLoanActlbltyinfsgmtById", loan_actlbltyinfsgmt_id);
	}
	/**
	* 添加
	* @param loan_actlbltyinfsgmt 
	* @return
	*/
	public int addLoanActlbltyinfsgmt(LoanActlbltyinfsgmt loanActlbltyinfsgmt){
		return this.add("addLoanActlbltyinfsgmt", loanActlbltyinfsgmt);
	}
	/**
	* 修改
	* @param loan_actlbltyinfsgmt 
	* @return
	*/
	public int updateLoanActlbltyinfsgmt(LoanActlbltyinfsgmt loanActlbltyinfsgmt){
		return this.update("updateLoanActlbltyinfsgmt", loanActlbltyinfsgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param loan_actlbltyinfsgmt 
	* @return
	*/
	public int updateLoanActlbltyinfsgmtBySelective(LoanActlbltyinfsgmt loanActlbltyinfsgmt){
		return this.update("updateLoanActlbltyinfsgmtBySelective", loanActlbltyinfsgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delLoanActlbltyinfsgmt(Map<String,Object> condition){
		return this.del("delLoanActlbltyinfsgmt", condition);
	}
	/**
	* 批量添加
	* @param loan_actlbltyinfsgmtList 
	* @return
	*/
	public int addBatchLoanActlbltyinfsgmt(List<LoanActlbltyinfsgmt> loanActlbltyinfsgmtList){
		return this.add("addBatchLoanActlbltyinfsgmt", loanActlbltyinfsgmtList);
	}
	/**
	* 批量修改
	* @param loan_actlbltyinfsgmtList 
	* @return
	*/
	public int updateBatchLoanActlbltyinfsgmt(List<LoanActlbltyinfsgmt> loanActlbltyinfsgmtList){
		return this.update("updateBatchLoanActlbltyinfsgmt", loanActlbltyinfsgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param loan_actlbltyinfsgmtList 
	* @return
	*/
	public int updateBatchLoanActlbltyinfsgmtBySelective(List<LoanActlbltyinfsgmt> loanActlbltyinfsgmtList){
		return this.update("updateBatchLoanActlbltyinfsgmtBySelective", loanActlbltyinfsgmtList);
	}
}
