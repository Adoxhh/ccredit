package ccredit.loanmodules.loanservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.loanmodules.loanservice.LoanCosignersgmtService;
import ccredit.loanmodules.loandao.LoanCosignersgmtDao;
import ccredit.loanmodules.loanmodel.LoanCosignersgmt;

/**
* 联保人信息 
* 2018-04-28 15:18:11  yangzhou
*/
@Service("loanCosignersgmtService")
public class LoanCosignersgmtServiceImpl extends BaseService implements LoanCosignersgmtService{
	@Autowired
	private LoanCosignersgmtDao loanCosignersgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<LoanCosignersgmt> getLoanCosignersgmtListByCondition(Map<String,Object> condition){
		try{
			return loanCosignersgmtDao.getLoanCosignersgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param loan_cosignersgmt_id 
	* @return
	*/
	public LoanCosignersgmt getLoanCosignersgmtById(String loan_cosignersgmt_id){
		try{
			LoanCosignersgmt loanCosignersgmt = loanCosignersgmtDao.getLoanCosignersgmtById(loan_cosignersgmt_id);
			return loanCosignersgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param loan_cosignersgmt 
	* @return
	*/
	public int addLoanCosignersgmt(LoanCosignersgmt loanCosignersgmt){
		int i = 0;
		try {
			i = loanCosignersgmtDao.addLoanCosignersgmt(loanCosignersgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param loan_cosignersgmt 
	* @return
	*/
	public int updateLoanCosignersgmt(LoanCosignersgmt loanCosignersgmt){
		int i = 0;
		try {
			i = loanCosignersgmtDao.updateLoanCosignersgmt(loanCosignersgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param loan_cosignersgmt 
	* @return
	*/
	public int updateLoanCosignersgmtBySelective(LoanCosignersgmt loanCosignersgmt){
		int i = 0;
		try {
			i = loanCosignersgmtDao.updateLoanCosignersgmtBySelective(loanCosignersgmt);
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
	public int delLoanCosignersgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = loanCosignersgmtDao.delLoanCosignersgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param loan_cosignersgmtList 
	* @return
	*/
	public int addBatchLoanCosignersgmt(List<LoanCosignersgmt> loanCosignersgmtList){
		int i = 0;
		try {
			i = loanCosignersgmtDao.addBatchLoanCosignersgmt(loanCosignersgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param loan_cosignersgmtList 
	* @return
	*/
	public int updateBatchLoanCosignersgmt(List<LoanCosignersgmt> loanCosignersgmtList){
		int i = 0;
		try {
			i = loanCosignersgmtDao.updateBatchLoanCosignersgmt(loanCosignersgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param loan_cosignersgmtList 
	* @return
	*/
	public int updateBatchLoanCosignersgmtBySelective(List<LoanCosignersgmt> loanCosignersgmtList){
		int i = 0;
		try {
			i = loanCosignersgmtDao.updateBatchLoanCosignersgmtBySelective(loanCosignersgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
