package ccredit.loanmodules.loanservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.loanmodules.loanservice.LoanRltrepymtinfsgmtService;
import ccredit.loanmodules.loandao.LoanRltrepymtinfsgmtDao;
import ccredit.loanmodules.loanmodel.LoanRltrepymtinfsgmt;

/**
* 相关还款责任人 
* 2018-04-27 16:25:40  yangzhou
*/
@Service("loanRltrepymtinfsgmtService")
public class LoanRltrepymtinfsgmtServiceImpl extends BaseService implements LoanRltrepymtinfsgmtService{
	@Autowired
	private LoanRltrepymtinfsgmtDao loanRltrepymtinfsgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<LoanRltrepymtinfsgmt> getLoanRltrepymtinfsgmtListByCondition(Map<String,Object> condition){
		try{
			return loanRltrepymtinfsgmtDao.getLoanRltrepymtinfsgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param loan_rltrepymtinfsgmt_id 
	* @return
	*/
	public LoanRltrepymtinfsgmt getLoanRltrepymtinfsgmtById(String loan_rltrepymtinfsgmt_id){
		try{
			LoanRltrepymtinfsgmt loanRltrepymtinfsgmt = loanRltrepymtinfsgmtDao.getLoanRltrepymtinfsgmtById(loan_rltrepymtinfsgmt_id);
			return loanRltrepymtinfsgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param loan_rltrepymtinfsgmt 
	* @return
	*/
	public int addLoanRltrepymtinfsgmt(LoanRltrepymtinfsgmt loanRltrepymtinfsgmt){
		int i = 0;
		try {
			i = loanRltrepymtinfsgmtDao.addLoanRltrepymtinfsgmt(loanRltrepymtinfsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param loan_rltrepymtinfsgmt 
	* @return
	*/
	public int updateLoanRltrepymtinfsgmt(LoanRltrepymtinfsgmt loanRltrepymtinfsgmt){
		int i = 0;
		try {
			i = loanRltrepymtinfsgmtDao.updateLoanRltrepymtinfsgmt(loanRltrepymtinfsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param loan_rltrepymtinfsgmt 
	* @return
	*/
	public int updateLoanRltrepymtinfsgmtBySelective(LoanRltrepymtinfsgmt loanRltrepymtinfsgmt){
		int i = 0;
		try {
			i = loanRltrepymtinfsgmtDao.updateLoanRltrepymtinfsgmtBySelective(loanRltrepymtinfsgmt);
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
	public int delLoanRltrepymtinfsgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = loanRltrepymtinfsgmtDao.delLoanRltrepymtinfsgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param loan_rltrepymtinfsgmtList 
	* @return
	*/
	public int addBatchLoanRltrepymtinfsgmt(List<LoanRltrepymtinfsgmt> loanRltrepymtinfsgmtList){
		int i = 0;
		try {
			i = loanRltrepymtinfsgmtDao.addBatchLoanRltrepymtinfsgmt(loanRltrepymtinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param loan_rltrepymtinfsgmtList 
	* @return
	*/
	public int updateBatchLoanRltrepymtinfsgmt(List<LoanRltrepymtinfsgmt> loanRltrepymtinfsgmtList){
		int i = 0;
		try {
			i = loanRltrepymtinfsgmtDao.updateBatchLoanRltrepymtinfsgmt(loanRltrepymtinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param loan_rltrepymtinfsgmtList 
	* @return
	*/
	public int updateBatchLoanRltrepymtinfsgmtBySelective(List<LoanRltrepymtinfsgmt> loanRltrepymtinfsgmtList){
		int i = 0;
		try {
			i = loanRltrepymtinfsgmtDao.updateBatchLoanRltrepymtinfsgmtBySelective(loanRltrepymtinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
