package ccredit.loanmodules.loanservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.loanmodules.loanservice.LoanGuarcreditlimsgmtService;
import ccredit.loanmodules.loandao.LoanGuarcreditlimsgmtDao;
import ccredit.loanmodules.loanmodel.LoanGuarcreditlimsgmt;

/**
* 最高额额度信息 
* 2018-04-28 15:20:42  yangzhou
*/
@Service("loanGuarcreditlimsgmtService")
public class LoanGuarcreditlimsgmtServiceImpl extends BaseService implements LoanGuarcreditlimsgmtService{
	@Autowired
	private LoanGuarcreditlimsgmtDao loanGuarcreditlimsgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<LoanGuarcreditlimsgmt> getLoanGuarcreditlimsgmtListByCondition(Map<String,Object> condition){
		try{
			return loanGuarcreditlimsgmtDao.getLoanGuarcreditlimsgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param loan_guarcreditlimsgmt_id 
	* @return
	*/
	public LoanGuarcreditlimsgmt getLoanGuarcreditlimsgmtById(String loan_guarcreditlimsgmt_id){
		try{
			LoanGuarcreditlimsgmt loanGuarcreditlimsgmt = loanGuarcreditlimsgmtDao.getLoanGuarcreditlimsgmtById(loan_guarcreditlimsgmt_id);
			return loanGuarcreditlimsgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param loan_guarcreditlimsgmt 
	* @return
	*/
	public int addLoanGuarcreditlimsgmt(LoanGuarcreditlimsgmt loanGuarcreditlimsgmt){
		int i = 0;
		try {
			i = loanGuarcreditlimsgmtDao.addLoanGuarcreditlimsgmt(loanGuarcreditlimsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param loan_guarcreditlimsgmt 
	* @return
	*/
	public int updateLoanGuarcreditlimsgmt(LoanGuarcreditlimsgmt loanGuarcreditlimsgmt){
		int i = 0;
		try {
			i = loanGuarcreditlimsgmtDao.updateLoanGuarcreditlimsgmt(loanGuarcreditlimsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param loan_guarcreditlimsgmt 
	* @return
	*/
	public int updateLoanGuarcreditlimsgmtBySelective(LoanGuarcreditlimsgmt loanGuarcreditlimsgmt){
		int i = 0;
		try {
			i = loanGuarcreditlimsgmtDao.updateLoanGuarcreditlimsgmtBySelective(loanGuarcreditlimsgmt);
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
	public int delLoanGuarcreditlimsgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = loanGuarcreditlimsgmtDao.delLoanGuarcreditlimsgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param loan_guarcreditlimsgmtList 
	* @return
	*/
	public int addBatchLoanGuarcreditlimsgmt(List<LoanGuarcreditlimsgmt> loanGuarcreditlimsgmtList){
		int i = 0;
		try {
			i = loanGuarcreditlimsgmtDao.addBatchLoanGuarcreditlimsgmt(loanGuarcreditlimsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param loan_guarcreditlimsgmtList 
	* @return
	*/
	public int updateBatchLoanGuarcreditlimsgmt(List<LoanGuarcreditlimsgmt> loanGuarcreditlimsgmtList){
		int i = 0;
		try {
			i = loanGuarcreditlimsgmtDao.updateBatchLoanGuarcreditlimsgmt(loanGuarcreditlimsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param loan_guarcreditlimsgmtList 
	* @return
	*/
	public int updateBatchLoanGuarcreditlimsgmtBySelective(List<LoanGuarcreditlimsgmt> loanGuarcreditlimsgmtList){
		int i = 0;
		try {
			i = loanGuarcreditlimsgmtDao.updateBatchLoanGuarcreditlimsgmtBySelective(loanGuarcreditlimsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
