package ccredit.loanmodules.loanservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.loanmodules.loanservice.LoanAcctcredsgmtService;
import ccredit.loanmodules.loandao.LoanAcctcredsgmtDao;
import ccredit.loanmodules.loanmodel.LoanAcctcredsgmt;

/**
* 授信额度信息 
* 2018-04-27 16:30:17  yangzhou
*/
@Service("loanAcctcredsgmtService")
public class LoanAcctcredsgmtServiceImpl extends BaseService implements LoanAcctcredsgmtService{
	@Autowired
	private LoanAcctcredsgmtDao loanAcctcredsgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<LoanAcctcredsgmt> getLoanAcctcredsgmtListByCondition(Map<String,Object> condition){
		try{
			return loanAcctcredsgmtDao.getLoanAcctcredsgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param loan_acctcredsgmt_id 
	* @return
	*/
	public LoanAcctcredsgmt getLoanAcctcredsgmtById(String loan_acctcredsgmt_id){
		try{
			LoanAcctcredsgmt loanAcctcredsgmt = loanAcctcredsgmtDao.getLoanAcctcredsgmtById(loan_acctcredsgmt_id);
			return loanAcctcredsgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param loan_acctcredsgmt 
	* @return
	*/
	public int addLoanAcctcredsgmt(LoanAcctcredsgmt loanAcctcredsgmt){
		int i = 0;
		try {
			i = loanAcctcredsgmtDao.addLoanAcctcredsgmt(loanAcctcredsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param loan_acctcredsgmt 
	* @return
	*/
	public int updateLoanAcctcredsgmt(LoanAcctcredsgmt loanAcctcredsgmt){
		int i = 0;
		try {
			i = loanAcctcredsgmtDao.updateLoanAcctcredsgmt(loanAcctcredsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param loan_acctcredsgmt 
	* @return
	*/
	public int updateLoanAcctcredsgmtBySelective(LoanAcctcredsgmt loanAcctcredsgmt){
		int i = 0;
		try {
			i = loanAcctcredsgmtDao.updateLoanAcctcredsgmtBySelective(loanAcctcredsgmt);
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
	public int delLoanAcctcredsgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = loanAcctcredsgmtDao.delLoanAcctcredsgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param loan_acctcredsgmtList 
	* @return
	*/
	public int addBatchLoanAcctcredsgmt(List<LoanAcctcredsgmt> loanAcctcredsgmtList){
		int i = 0;
		try {
			i = loanAcctcredsgmtDao.addBatchLoanAcctcredsgmt(loanAcctcredsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param loan_acctcredsgmtList 
	* @return
	*/
	public int updateBatchLoanAcctcredsgmt(List<LoanAcctcredsgmt> loanAcctcredsgmtList){
		int i = 0;
		try {
			i = loanAcctcredsgmtDao.updateBatchLoanAcctcredsgmt(loanAcctcredsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param loan_acctcredsgmtList 
	* @return
	*/
	public int updateBatchLoanAcctcredsgmtBySelective(List<LoanAcctcredsgmt> loanAcctcredsgmtList){
		int i = 0;
		try {
			i = loanAcctcredsgmtDao.updateBatchLoanAcctcredsgmtBySelective(loanAcctcredsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
