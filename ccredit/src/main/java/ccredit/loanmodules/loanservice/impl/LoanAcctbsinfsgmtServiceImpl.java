package ccredit.loanmodules.loanservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.loanmodules.loanservice.LoanAcctbsinfsgmtService;
import ccredit.loanmodules.loandao.LoanAcctbsinfsgmtDao;
import ccredit.loanmodules.loanmodel.LoanAcctbsinfsgmt;

/**
* 借贷基本信息段 
* 2018-04-27 15:42:33  yangzhou
*/
@Service("loanAcctbsinfsgmtService")
public class LoanAcctbsinfsgmtServiceImpl extends BaseService implements LoanAcctbsinfsgmtService{
	@Autowired
	private LoanAcctbsinfsgmtDao loanAcctbsinfsgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<LoanAcctbsinfsgmt> getLoanAcctbsinfsgmtListByCondition(Map<String,Object> condition){
		try{
			return loanAcctbsinfsgmtDao.getLoanAcctbsinfsgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param loan_acctbsinfsgmt_id 
	* @return
	*/
	public LoanAcctbsinfsgmt getLoanAcctbsinfsgmtById(String loan_acctbsinfsgmt_id){
		try{
			LoanAcctbsinfsgmt loanAcctbsinfsgmt = loanAcctbsinfsgmtDao.getLoanAcctbsinfsgmtById(loan_acctbsinfsgmt_id);
			return loanAcctbsinfsgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param loan_acctbsinfsgmt 
	* @return
	*/
	public int addLoanAcctbsinfsgmt(LoanAcctbsinfsgmt loanAcctbsinfsgmt){
		int i = 0;
		try {
			i = loanAcctbsinfsgmtDao.addLoanAcctbsinfsgmt(loanAcctbsinfsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param loan_acctbsinfsgmt 
	* @return
	*/
	public int updateLoanAcctbsinfsgmt(LoanAcctbsinfsgmt loanAcctbsinfsgmt){
		int i = 0;
		try {
			i = loanAcctbsinfsgmtDao.updateLoanAcctbsinfsgmt(loanAcctbsinfsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param loan_acctbsinfsgmt 
	* @return
	*/
	public int updateLoanAcctbsinfsgmtBySelective(LoanAcctbsinfsgmt loanAcctbsinfsgmt){
		int i = 0;
		try {
			i = loanAcctbsinfsgmtDao.updateLoanAcctbsinfsgmtBySelective(loanAcctbsinfsgmt);
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
	public int delLoanAcctbsinfsgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = loanAcctbsinfsgmtDao.delLoanAcctbsinfsgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param loan_acctbsinfsgmtList 
	* @return
	*/
	public int addBatchLoanAcctbsinfsgmt(List<LoanAcctbsinfsgmt> loanAcctbsinfsgmtList){
		int i = 0;
		try {
			i = loanAcctbsinfsgmtDao.addBatchLoanAcctbsinfsgmt(loanAcctbsinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param loan_acctbsinfsgmtList 
	* @return
	*/
	public int updateBatchLoanAcctbsinfsgmt(List<LoanAcctbsinfsgmt> loanAcctbsinfsgmtList){
		int i = 0;
		try {
			i = loanAcctbsinfsgmtDao.updateBatchLoanAcctbsinfsgmt(loanAcctbsinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param loan_acctbsinfsgmtList 
	* @return
	*/
	public int updateBatchLoanAcctbsinfsgmtBySelective(List<LoanAcctbsinfsgmt> loanAcctbsinfsgmtList){
		int i = 0;
		try {
			i = loanAcctbsinfsgmtDao.updateBatchLoanAcctbsinfsgmtBySelective(loanAcctbsinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	
	/**
	* 查询历史信息
	*/
	public List<?> getHisLoanListByCondition(Map<String,Object> condition){
		try{
			return (List<?>)loanAcctbsinfsgmtDao.getHisLoanListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	
}
