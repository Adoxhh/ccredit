package ccredit.loanmodules.loandao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.loanmodules.loandao.LoanCtrctbssgmtDao;
import ccredit.loanmodules.loanmodel.LoanCtrctbssgmt;

/**
* 企业授信协议信息基础段 
* 2018-04-28 09:51:22  yangzhou
*/
@Repository("loanCtrctbssgmtDao")
public class LoanCtrctbssgmtDaoImpl  extends BaseDaoImpl implements LoanCtrctbssgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<LoanCtrctbssgmt> getLoanCtrctbssgmtListByCondition(Map<String,Object> condition){
		return (List<LoanCtrctbssgmt>)this.getList("getLoanCtrctbssgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param loan_ctrctbssgmt_id 
	* @return
	*/
	public LoanCtrctbssgmt getLoanCtrctbssgmtById(String loan_ctrctbssgmt_id){
		return (LoanCtrctbssgmt)this.get("getLoanCtrctbssgmtById", loan_ctrctbssgmt_id);
	}
	/**
	* 添加
	* @param loan_ctrctbssgmt 
	* @return
	*/
	public int addLoanCtrctbssgmt(LoanCtrctbssgmt loanCtrctbssgmt){
		return this.add("addLoanCtrctbssgmt", loanCtrctbssgmt);
	}
	/**
	* 修改
	* @param loan_ctrctbssgmt 
	* @return
	*/
	public int updateLoanCtrctbssgmt(LoanCtrctbssgmt loanCtrctbssgmt){
		return this.update("updateLoanCtrctbssgmt", loanCtrctbssgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param loan_ctrctbssgmt 
	* @return
	*/
	public int updateLoanCtrctbssgmtBySelective(LoanCtrctbssgmt loanCtrctbssgmt){
		return this.update("updateLoanCtrctbssgmtBySelective", loanCtrctbssgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delLoanCtrctbssgmt(Map<String,Object> condition){
		return this.del("delLoanCtrctbssgmt", condition);
	}
	/**
	* 批量添加
	* @param loan_ctrctbssgmtList 
	* @return
	*/
	public int addBatchLoanCtrctbssgmt(List<LoanCtrctbssgmt> loanCtrctbssgmtList){
		return this.add("addBatchLoanCtrctbssgmt", loanCtrctbssgmtList);
	}
	/**
	* 批量修改
	* @param loan_ctrctbssgmtList 
	* @return
	*/
	public int updateBatchLoanCtrctbssgmt(List<LoanCtrctbssgmt> loanCtrctbssgmtList){
		return this.update("updateBatchLoanCtrctbssgmt", loanCtrctbssgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param loan_ctrctbssgmtList 
	* @return
	*/
	public int updateBatchLoanCtrctbssgmtBySelective(List<LoanCtrctbssgmt> loanCtrctbssgmtList){
		return this.update("updateBatchLoanCtrctbssgmtBySelective", loanCtrctbssgmtList);
	}
}
