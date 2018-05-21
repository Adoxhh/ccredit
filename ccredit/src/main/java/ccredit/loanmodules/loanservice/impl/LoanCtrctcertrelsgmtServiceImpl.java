package ccredit.loanmodules.loanservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.loanmodules.loanservice.LoanCtrctcertrelsgmtService;
import ccredit.loanmodules.loandao.LoanCtrctcertrelsgmtDao;
import ccredit.loanmodules.loanmodel.LoanCtrctcertrelsgmt;

/**
* 共同受信人信息 
* 2018-04-28 11:02:26  yangzhou
*/
@Service("loanCtrctcertrelsgmtService")
public class LoanCtrctcertrelsgmtServiceImpl extends BaseService implements LoanCtrctcertrelsgmtService{
	@Autowired
	private LoanCtrctcertrelsgmtDao loanCtrctcertrelsgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<LoanCtrctcertrelsgmt> getLoanCtrctcertrelsgmtListByCondition(Map<String,Object> condition){
		try{
			return loanCtrctcertrelsgmtDao.getLoanCtrctcertrelsgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param loan_ctrctcertrelsgmt_id 
	* @return
	*/
	public LoanCtrctcertrelsgmt getLoanCtrctcertrelsgmtById(String loan_ctrctcertrelsgmt_id){
		try{
			LoanCtrctcertrelsgmt loanCtrctcertrelsgmt = loanCtrctcertrelsgmtDao.getLoanCtrctcertrelsgmtById(loan_ctrctcertrelsgmt_id);
			return loanCtrctcertrelsgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param loan_ctrctcertrelsgmt 
	* @return
	*/
	public int addLoanCtrctcertrelsgmt(LoanCtrctcertrelsgmt loanCtrctcertrelsgmt){
		int i = 0;
		try {
			i = loanCtrctcertrelsgmtDao.addLoanCtrctcertrelsgmt(loanCtrctcertrelsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param loan_ctrctcertrelsgmt 
	* @return
	*/
	public int updateLoanCtrctcertrelsgmt(LoanCtrctcertrelsgmt loanCtrctcertrelsgmt){
		int i = 0;
		try {
			i = loanCtrctcertrelsgmtDao.updateLoanCtrctcertrelsgmt(loanCtrctcertrelsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param loan_ctrctcertrelsgmt 
	* @return
	*/
	public int updateLoanCtrctcertrelsgmtBySelective(LoanCtrctcertrelsgmt loanCtrctcertrelsgmt){
		int i = 0;
		try {
			i = loanCtrctcertrelsgmtDao.updateLoanCtrctcertrelsgmtBySelective(loanCtrctcertrelsgmt);
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
	public int delLoanCtrctcertrelsgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = loanCtrctcertrelsgmtDao.delLoanCtrctcertrelsgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param loan_ctrctcertrelsgmtList 
	* @return
	*/
	public int addBatchLoanCtrctcertrelsgmt(List<LoanCtrctcertrelsgmt> loanCtrctcertrelsgmtList){
		int i = 0;
		try {
			i = loanCtrctcertrelsgmtDao.addBatchLoanCtrctcertrelsgmt(loanCtrctcertrelsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param loan_ctrctcertrelsgmtList 
	* @return
	*/
	public int updateBatchLoanCtrctcertrelsgmt(List<LoanCtrctcertrelsgmt> loanCtrctcertrelsgmtList){
		int i = 0;
		try {
			i = loanCtrctcertrelsgmtDao.updateBatchLoanCtrctcertrelsgmt(loanCtrctcertrelsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param loan_ctrctcertrelsgmtList 
	* @return
	*/
	public int updateBatchLoanCtrctcertrelsgmtBySelective(List<LoanCtrctcertrelsgmt> loanCtrctcertrelsgmtList){
		int i = 0;
		try {
			i = loanCtrctcertrelsgmtDao.updateBatchLoanCtrctcertrelsgmtBySelective(loanCtrctcertrelsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
