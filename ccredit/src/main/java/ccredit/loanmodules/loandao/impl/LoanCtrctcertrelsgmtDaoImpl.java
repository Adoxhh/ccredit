package ccredit.loanmodules.loandao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.loanmodules.loandao.LoanCtrctcertrelsgmtDao;
import ccredit.loanmodules.loanmodel.LoanCtrctcertrelsgmt;

/**
* 共同受信人信息 
* 2018-04-28 11:02:26  yangzhou
*/
@Repository("loanCtrctcertrelsgmtDao")
public class LoanCtrctcertrelsgmtDaoImpl  extends BaseDaoImpl implements LoanCtrctcertrelsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<LoanCtrctcertrelsgmt> getLoanCtrctcertrelsgmtListByCondition(Map<String,Object> condition){
		return (List<LoanCtrctcertrelsgmt>)this.getList("getLoanCtrctcertrelsgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param loan_ctrctcertrelsgmt_id 
	* @return
	*/
	public LoanCtrctcertrelsgmt getLoanCtrctcertrelsgmtById(String loan_ctrctcertrelsgmt_id){
		return (LoanCtrctcertrelsgmt)this.get("getLoanCtrctcertrelsgmtById", loan_ctrctcertrelsgmt_id);
	}
	/**
	* 添加
	* @param loan_ctrctcertrelsgmt 
	* @return
	*/
	public int addLoanCtrctcertrelsgmt(LoanCtrctcertrelsgmt loanCtrctcertrelsgmt){
		return this.add("addLoanCtrctcertrelsgmt", loanCtrctcertrelsgmt);
	}
	/**
	* 修改
	* @param loan_ctrctcertrelsgmt 
	* @return
	*/
	public int updateLoanCtrctcertrelsgmt(LoanCtrctcertrelsgmt loanCtrctcertrelsgmt){
		return this.update("updateLoanCtrctcertrelsgmt", loanCtrctcertrelsgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param loan_ctrctcertrelsgmt 
	* @return
	*/
	public int updateLoanCtrctcertrelsgmtBySelective(LoanCtrctcertrelsgmt loanCtrctcertrelsgmt){
		return this.update("updateLoanCtrctcertrelsgmtBySelective", loanCtrctcertrelsgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delLoanCtrctcertrelsgmt(Map<String,Object> condition){
		return this.del("delLoanCtrctcertrelsgmt", condition);
	}
	/**
	* 批量添加
	* @param loan_ctrctcertrelsgmtList 
	* @return
	*/
	public int addBatchLoanCtrctcertrelsgmt(List<LoanCtrctcertrelsgmt> loanCtrctcertrelsgmtList){
		return this.add("addBatchLoanCtrctcertrelsgmt", loanCtrctcertrelsgmtList);
	}
	/**
	* 批量修改
	* @param loan_ctrctcertrelsgmtList 
	* @return
	*/
	public int updateBatchLoanCtrctcertrelsgmt(List<LoanCtrctcertrelsgmt> loanCtrctcertrelsgmtList){
		return this.update("updateBatchLoanCtrctcertrelsgmt", loanCtrctcertrelsgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param loan_ctrctcertrelsgmtList 
	* @return
	*/
	public int updateBatchLoanCtrctcertrelsgmtBySelective(List<LoanCtrctcertrelsgmt> loanCtrctcertrelsgmtList){
		return this.update("updateBatchLoanCtrctcertrelsgmtBySelective", loanCtrctcertrelsgmtList);
	}
}
