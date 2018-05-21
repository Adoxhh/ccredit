package ccredit.loanmodules.loanservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.loanmodules.loanservice.LoanAcctbssgmtService;
import ccredit.loanmodules.loandao.LoanAcctbssgmtDao;
import ccredit.loanmodules.loanmodel.LoanAcctbssgmt;

/**
* 企业借贷信息基础段 
* 2018-04-26 14:53:04  yangzhou
*/
@Service("loanAcctbssgmtService")
public class LoanAcctbssgmtServiceImpl extends BaseService implements LoanAcctbssgmtService{
	@Autowired
	private LoanAcctbssgmtDao loanAcctbssgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<LoanAcctbssgmt> getLoanAcctbssgmtListByCondition(Map<String,Object> condition){
		try{
			return loanAcctbssgmtDao.getLoanAcctbssgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param loan_acctbssgmt_id 
	* @return
	*/
	public LoanAcctbssgmt getLoanAcctbssgmtById(String loan_acctbssgmt_id){
		try{
			LoanAcctbssgmt loanAcctbssgmt = loanAcctbssgmtDao.getLoanAcctbssgmtById(loan_acctbssgmt_id);
			return loanAcctbssgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param loan_acctbssgmt 
	* @return
	*/
	public int addLoanAcctbssgmt(LoanAcctbssgmt loanAcctbssgmt){
		int i = 0;
		try {
			i = loanAcctbssgmtDao.addLoanAcctbssgmt(loanAcctbssgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param loan_acctbssgmt 
	* @return
	*/
	public int updateLoanAcctbssgmt(LoanAcctbssgmt loanAcctbssgmt){
		int i = 0;
		try {
			i = loanAcctbssgmtDao.updateLoanAcctbssgmt(loanAcctbssgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param loan_acctbssgmt 
	* @return
	*/
	public int updateLoanAcctbssgmtBySelective(LoanAcctbssgmt loanAcctbssgmt){
		int i = 0;
		try {
			i = loanAcctbssgmtDao.updateLoanAcctbssgmtBySelective(loanAcctbssgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delLoanAcctbssgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = loanAcctbssgmtDao.delLoanAcctbssgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param loan_acctbssgmtList 
	* @return
	*/
	public int addBatchLoanAcctbssgmt(List<LoanAcctbssgmt> loanAcctbssgmtList){
		int i = 0;
		try {
			i = loanAcctbssgmtDao.addBatchLoanAcctbssgmt(loanAcctbssgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param loan_acctbssgmtList 
	* @return
	*/
	public int updateBatchLoanAcctbssgmt(List<LoanAcctbssgmt> loanAcctbssgmtList){
		int i = 0;
		try {
			i = loanAcctbssgmtDao.updateBatchLoanAcctbssgmt(loanAcctbssgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param loan_acctbssgmtList 
	* @return
	*/
	public int updateBatchLoanAcctbssgmtBySelective(List<LoanAcctbssgmt> loanAcctbssgmtList){
		int i = 0;
		try {
			i = loanAcctbssgmtDao.updateBatchLoanAcctbssgmtBySelective(loanAcctbssgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
