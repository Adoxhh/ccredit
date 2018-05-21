package ccredit.loanmodules.loanservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.loanmodules.loanservice.LoanCtrctbssgmtService;
import ccredit.loanmodules.loandao.LoanCtrctbssgmtDao;
import ccredit.loanmodules.loanmodel.LoanCtrctbssgmt;

/**
* 企业授信协议信息基础段 
* 2018-04-28 09:51:22  yangzhou
*/
@Service("loanCtrctbssgmtService")
public class LoanCtrctbssgmtServiceImpl extends BaseService implements LoanCtrctbssgmtService{
	@Autowired
	private LoanCtrctbssgmtDao loanCtrctbssgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<LoanCtrctbssgmt> getLoanCtrctbssgmtListByCondition(Map<String,Object> condition){
		try{
			return loanCtrctbssgmtDao.getLoanCtrctbssgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param loan_ctrctbssgmt_id 
	* @return
	*/
	public LoanCtrctbssgmt getLoanCtrctbssgmtById(String loan_ctrctbssgmt_id){
		try{
			LoanCtrctbssgmt loanCtrctbssgmt = loanCtrctbssgmtDao.getLoanCtrctbssgmtById(loan_ctrctbssgmt_id);
			return loanCtrctbssgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param loan_ctrctbssgmt 
	* @return
	*/
	public int addLoanCtrctbssgmt(LoanCtrctbssgmt loanCtrctbssgmt){
		int i = 0;
		try {
			i = loanCtrctbssgmtDao.addLoanCtrctbssgmt(loanCtrctbssgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param loan_ctrctbssgmt 
	* @return
	*/
	public int updateLoanCtrctbssgmt(LoanCtrctbssgmt loanCtrctbssgmt){
		int i = 0;
		try {
			i = loanCtrctbssgmtDao.updateLoanCtrctbssgmt(loanCtrctbssgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param loan_ctrctbssgmt 
	* @return
	*/
	public int updateLoanCtrctbssgmtBySelective(LoanCtrctbssgmt loanCtrctbssgmt){
		int i = 0;
		try {
			i = loanCtrctbssgmtDao.updateLoanCtrctbssgmtBySelective(loanCtrctbssgmt);
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
	public int delLoanCtrctbssgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = loanCtrctbssgmtDao.delLoanCtrctbssgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param loan_ctrctbssgmtList 
	* @return
	*/
	public int addBatchLoanCtrctbssgmt(List<LoanCtrctbssgmt> loanCtrctbssgmtList){
		int i = 0;
		try {
			i = loanCtrctbssgmtDao.addBatchLoanCtrctbssgmt(loanCtrctbssgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param loan_ctrctbssgmtList 
	* @return
	*/
	public int updateBatchLoanCtrctbssgmt(List<LoanCtrctbssgmt> loanCtrctbssgmtList){
		int i = 0;
		try {
			i = loanCtrctbssgmtDao.updateBatchLoanCtrctbssgmt(loanCtrctbssgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param loan_ctrctbssgmtList 
	* @return
	*/
	public int updateBatchLoanCtrctbssgmtBySelective(List<LoanCtrctbssgmt> loanCtrctbssgmtList){
		int i = 0;
		try {
			i = loanCtrctbssgmtDao.updateBatchLoanCtrctbssgmtBySelective(loanCtrctbssgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
