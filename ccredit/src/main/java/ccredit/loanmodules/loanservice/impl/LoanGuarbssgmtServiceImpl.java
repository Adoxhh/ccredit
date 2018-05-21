package ccredit.loanmodules.loanservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.loanmodules.loanservice.LoanGuarbssgmtService;
import ccredit.loanmodules.loandao.LoanGuarbssgmtDao;
import ccredit.loanmodules.loanmodel.LoanGuarbssgmt;

/**
* 最高额保证合同信息基础段 
* 2018-04-28 15:16:38  yangzhou
*/
@Service("loanGuarbssgmtService")
public class LoanGuarbssgmtServiceImpl extends BaseService implements LoanGuarbssgmtService{
	@Autowired
	private LoanGuarbssgmtDao loanGuarbssgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<LoanGuarbssgmt> getLoanGuarbssgmtListByCondition(Map<String,Object> condition){
		try{
			return loanGuarbssgmtDao.getLoanGuarbssgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param loan_guarbssgmt_id 
	* @return
	*/
	public LoanGuarbssgmt getLoanGuarbssgmtById(String loan_guarbssgmt_id){
		try{
			LoanGuarbssgmt loanGuarbssgmt = loanGuarbssgmtDao.getLoanGuarbssgmtById(loan_guarbssgmt_id);
			return loanGuarbssgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param loan_guarbssgmt 
	* @return
	*/
	public int addLoanGuarbssgmt(LoanGuarbssgmt loanGuarbssgmt){
		int i = 0;
		try {
			i = loanGuarbssgmtDao.addLoanGuarbssgmt(loanGuarbssgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param loan_guarbssgmt 
	* @return
	*/
	public int updateLoanGuarbssgmt(LoanGuarbssgmt loanGuarbssgmt){
		int i = 0;
		try {
			i = loanGuarbssgmtDao.updateLoanGuarbssgmt(loanGuarbssgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param loan_guarbssgmt 
	* @return
	*/
	public int updateLoanGuarbssgmtBySelective(LoanGuarbssgmt loanGuarbssgmt){
		int i = 0;
		try {
			i = loanGuarbssgmtDao.updateLoanGuarbssgmtBySelective(loanGuarbssgmt);
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
	public int delLoanGuarbssgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = loanGuarbssgmtDao.delLoanGuarbssgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param loan_guarbssgmtList 
	* @return
	*/
	public int addBatchLoanGuarbssgmt(List<LoanGuarbssgmt> loanGuarbssgmtList){
		int i = 0;
		try {
			i = loanGuarbssgmtDao.addBatchLoanGuarbssgmt(loanGuarbssgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param loan_guarbssgmtList 
	* @return
	*/
	public int updateBatchLoanGuarbssgmt(List<LoanGuarbssgmt> loanGuarbssgmtList){
		int i = 0;
		try {
			i = loanGuarbssgmtDao.updateBatchLoanGuarbssgmt(loanGuarbssgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param loan_guarbssgmtList 
	* @return
	*/
	public int updateBatchLoanGuarbssgmtBySelective(List<LoanGuarbssgmt> loanGuarbssgmtList){
		int i = 0;
		try {
			i = loanGuarbssgmtDao.updateBatchLoanGuarbssgmtBySelective(loanGuarbssgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
