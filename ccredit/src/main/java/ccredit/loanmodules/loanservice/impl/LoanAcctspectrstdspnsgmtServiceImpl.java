package ccredit.loanmodules.loanservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.loanmodules.loanservice.LoanAcctspectrstdspnsgmtService;
import ccredit.loanmodules.loandao.LoanAcctspectrstdspnsgmtDao;
import ccredit.loanmodules.loanmodel.LoanAcctspectrstdspnsgmt;

/**
* 特定交易说明 
* 2018-04-27 16:37:31  yangzhou
*/
@Service("loanAcctspectrstdspnsgmtService")
public class LoanAcctspectrstdspnsgmtServiceImpl extends BaseService implements LoanAcctspectrstdspnsgmtService{
	@Autowired
	private LoanAcctspectrstdspnsgmtDao loanAcctspectrstdspnsgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<LoanAcctspectrstdspnsgmt> getLoanAcctspectrstdspnsgmtListByCondition(Map<String,Object> condition){
		try{
			return loanAcctspectrstdspnsgmtDao.getLoanAcctspectrstdspnsgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param loan_acctspectrstdspnsgmt_id 
	* @return
	*/
	public LoanAcctspectrstdspnsgmt getLoanAcctspectrstdspnsgmtById(String loan_acctspectrstdspnsgmt_id){
		try{
			LoanAcctspectrstdspnsgmt loanAcctspectrstdspnsgmt = loanAcctspectrstdspnsgmtDao.getLoanAcctspectrstdspnsgmtById(loan_acctspectrstdspnsgmt_id);
			return loanAcctspectrstdspnsgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param loan_acctspectrstdspnsgmt 
	* @return
	*/
	public int addLoanAcctspectrstdspnsgmt(LoanAcctspectrstdspnsgmt loanAcctspectrstdspnsgmt){
		int i = 0;
		try {
			i = loanAcctspectrstdspnsgmtDao.addLoanAcctspectrstdspnsgmt(loanAcctspectrstdspnsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param loan_acctspectrstdspnsgmt 
	* @return
	*/
	public int updateLoanAcctspectrstdspnsgmt(LoanAcctspectrstdspnsgmt loanAcctspectrstdspnsgmt){
		int i = 0;
		try {
			i = loanAcctspectrstdspnsgmtDao.updateLoanAcctspectrstdspnsgmt(loanAcctspectrstdspnsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param loan_acctspectrstdspnsgmt 
	* @return
	*/
	public int updateLoanAcctspectrstdspnsgmtBySelective(LoanAcctspectrstdspnsgmt loanAcctspectrstdspnsgmt){
		int i = 0;
		try {
			i = loanAcctspectrstdspnsgmtDao.updateLoanAcctspectrstdspnsgmtBySelective(loanAcctspectrstdspnsgmt);
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
	public int delLoanAcctspectrstdspnsgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = loanAcctspectrstdspnsgmtDao.delLoanAcctspectrstdspnsgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param loan_acctspectrstdspnsgmtList 
	* @return
	*/
	public int addBatchLoanAcctspectrstdspnsgmt(List<LoanAcctspectrstdspnsgmt> loanAcctspectrstdspnsgmtList){
		int i = 0;
		try {
			i = loanAcctspectrstdspnsgmtDao.addBatchLoanAcctspectrstdspnsgmt(loanAcctspectrstdspnsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param loan_acctspectrstdspnsgmtList 
	* @return
	*/
	public int updateBatchLoanAcctspectrstdspnsgmt(List<LoanAcctspectrstdspnsgmt> loanAcctspectrstdspnsgmtList){
		int i = 0;
		try {
			i = loanAcctspectrstdspnsgmtDao.updateBatchLoanAcctspectrstdspnsgmt(loanAcctspectrstdspnsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param loan_acctspectrstdspnsgmtList 
	* @return
	*/
	public int updateBatchLoanAcctspectrstdspnsgmtBySelective(List<LoanAcctspectrstdspnsgmt> loanAcctspectrstdspnsgmtList){
		int i = 0;
		try {
			i = loanAcctspectrstdspnsgmtDao.updateBatchLoanAcctspectrstdspnsgmtBySelective(loanAcctspectrstdspnsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
