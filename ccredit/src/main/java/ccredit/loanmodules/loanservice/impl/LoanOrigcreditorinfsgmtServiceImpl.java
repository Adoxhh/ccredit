package ccredit.loanmodules.loanservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.loanmodules.loanservice.LoanOrigcreditorinfsgmtService;
import ccredit.loanmodules.loandao.LoanOrigcreditorinfsgmtDao;
import ccredit.loanmodules.loanmodel.LoanOrigcreditorinfsgmt;

/**
* 初始债权说明 
* 2018-04-27 16:32:12  yangzhou
*/
@Service("loanOrigcreditorinfsgmtService")
public class LoanOrigcreditorinfsgmtServiceImpl extends BaseService implements LoanOrigcreditorinfsgmtService{
	@Autowired
	private LoanOrigcreditorinfsgmtDao loanOrigcreditorinfsgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<LoanOrigcreditorinfsgmt> getLoanOrigcreditorinfsgmtListByCondition(Map<String,Object> condition){
		try{
			return loanOrigcreditorinfsgmtDao.getLoanOrigcreditorinfsgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param loan_origcreditorinfsgmt_id 
	* @return
	*/
	public LoanOrigcreditorinfsgmt getLoanOrigcreditorinfsgmtById(String loan_origcreditorinfsgmt_id){
		try{
			LoanOrigcreditorinfsgmt loanOrigcreditorinfsgmt = loanOrigcreditorinfsgmtDao.getLoanOrigcreditorinfsgmtById(loan_origcreditorinfsgmt_id);
			return loanOrigcreditorinfsgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param loan_origcreditorinfsgmt 
	* @return
	*/
	public int addLoanOrigcreditorinfsgmt(LoanOrigcreditorinfsgmt loanOrigcreditorinfsgmt){
		int i = 0;
		try {
			i = loanOrigcreditorinfsgmtDao.addLoanOrigcreditorinfsgmt(loanOrigcreditorinfsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param loan_origcreditorinfsgmt 
	* @return
	*/
	public int updateLoanOrigcreditorinfsgmt(LoanOrigcreditorinfsgmt loanOrigcreditorinfsgmt){
		int i = 0;
		try {
			i = loanOrigcreditorinfsgmtDao.updateLoanOrigcreditorinfsgmt(loanOrigcreditorinfsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param loan_origcreditorinfsgmt 
	* @return
	*/
	public int updateLoanOrigcreditorinfsgmtBySelective(LoanOrigcreditorinfsgmt loanOrigcreditorinfsgmt){
		int i = 0;
		try {
			i = loanOrigcreditorinfsgmtDao.updateLoanOrigcreditorinfsgmtBySelective(loanOrigcreditorinfsgmt);
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
	public int delLoanOrigcreditorinfsgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = loanOrigcreditorinfsgmtDao.delLoanOrigcreditorinfsgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param loan_origcreditorinfsgmtList 
	* @return
	*/
	public int addBatchLoanOrigcreditorinfsgmt(List<LoanOrigcreditorinfsgmt> loanOrigcreditorinfsgmtList){
		int i = 0;
		try {
			i = loanOrigcreditorinfsgmtDao.addBatchLoanOrigcreditorinfsgmt(loanOrigcreditorinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param loan_origcreditorinfsgmtList 
	* @return
	*/
	public int updateBatchLoanOrigcreditorinfsgmt(List<LoanOrigcreditorinfsgmt> loanOrigcreditorinfsgmtList){
		int i = 0;
		try {
			i = loanOrigcreditorinfsgmtDao.updateBatchLoanOrigcreditorinfsgmt(loanOrigcreditorinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param loan_origcreditorinfsgmtList 
	* @return
	*/
	public int updateBatchLoanOrigcreditorinfsgmtBySelective(List<LoanOrigcreditorinfsgmt> loanOrigcreditorinfsgmtList){
		int i = 0;
		try {
			i = loanOrigcreditorinfsgmtDao.updateBatchLoanOrigcreditorinfsgmtBySelective(loanOrigcreditorinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
