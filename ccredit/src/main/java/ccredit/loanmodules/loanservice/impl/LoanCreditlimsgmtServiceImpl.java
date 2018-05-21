package ccredit.loanmodules.loanservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.loanmodules.loanservice.LoanCreditlimsgmtService;
import ccredit.loanmodules.loandao.LoanCreditlimsgmtDao;
import ccredit.loanmodules.loanmodel.LoanCreditlimsgmt;

/**
* 授信额度信息 
* 2018-04-28 11:05:34  yangzhou
*/
@Service("loanCreditlimsgmtService")
public class LoanCreditlimsgmtServiceImpl extends BaseService implements LoanCreditlimsgmtService{
	@Autowired
	private LoanCreditlimsgmtDao loanCreditlimsgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<LoanCreditlimsgmt> getLoanCreditlimsgmtListByCondition(Map<String,Object> condition){
		try{
			return loanCreditlimsgmtDao.getLoanCreditlimsgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param loan_creditlimsgmt_id 
	* @return
	*/
	public LoanCreditlimsgmt getLoanCreditlimsgmtById(String loan_creditlimsgmt_id){
		try{
			LoanCreditlimsgmt loanCreditlimsgmt = loanCreditlimsgmtDao.getLoanCreditlimsgmtById(loan_creditlimsgmt_id);
			return loanCreditlimsgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param loan_creditlimsgmt 
	* @return
	*/
	public int addLoanCreditlimsgmt(LoanCreditlimsgmt loanCreditlimsgmt){
		int i = 0;
		try {
			i = loanCreditlimsgmtDao.addLoanCreditlimsgmt(loanCreditlimsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param loan_creditlimsgmt 
	* @return
	*/
	public int updateLoanCreditlimsgmt(LoanCreditlimsgmt loanCreditlimsgmt){
		int i = 0;
		try {
			i = loanCreditlimsgmtDao.updateLoanCreditlimsgmt(loanCreditlimsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param loan_creditlimsgmt 
	* @return
	*/
	public int updateLoanCreditlimsgmtBySelective(LoanCreditlimsgmt loanCreditlimsgmt){
		int i = 0;
		try {
			i = loanCreditlimsgmtDao.updateLoanCreditlimsgmtBySelective(loanCreditlimsgmt);
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
	public int delLoanCreditlimsgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = loanCreditlimsgmtDao.delLoanCreditlimsgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param loan_creditlimsgmtList 
	* @return
	*/
	public int addBatchLoanCreditlimsgmt(List<LoanCreditlimsgmt> loanCreditlimsgmtList){
		int i = 0;
		try {
			i = loanCreditlimsgmtDao.addBatchLoanCreditlimsgmt(loanCreditlimsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param loan_creditlimsgmtList 
	* @return
	*/
	public int updateBatchLoanCreditlimsgmt(List<LoanCreditlimsgmt> loanCreditlimsgmtList){
		int i = 0;
		try {
			i = loanCreditlimsgmtDao.updateBatchLoanCreditlimsgmt(loanCreditlimsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param loan_creditlimsgmtList 
	* @return
	*/
	public int updateBatchLoanCreditlimsgmtBySelective(List<LoanCreditlimsgmt> loanCreditlimsgmtList){
		int i = 0;
		try {
			i = loanCreditlimsgmtDao.updateBatchLoanCreditlimsgmtBySelective(loanCreditlimsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
