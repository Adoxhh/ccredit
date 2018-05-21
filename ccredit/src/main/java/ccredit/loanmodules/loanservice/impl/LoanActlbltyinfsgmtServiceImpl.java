package ccredit.loanmodules.loanservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.loanmodules.loanservice.LoanActlbltyinfsgmtService;
import ccredit.loanmodules.loandao.LoanActlbltyinfsgmtDao;
import ccredit.loanmodules.loanmodel.LoanActlbltyinfsgmt;

/**
* 还款表现信息 
* 2018-04-27 16:35:45  yangzhou
*/
@Service("loanActlbltyinfsgmtService")
public class LoanActlbltyinfsgmtServiceImpl extends BaseService implements LoanActlbltyinfsgmtService{
	@Autowired
	private LoanActlbltyinfsgmtDao loanActlbltyinfsgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<LoanActlbltyinfsgmt> getLoanActlbltyinfsgmtListByCondition(Map<String,Object> condition){
		try{
			return loanActlbltyinfsgmtDao.getLoanActlbltyinfsgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param loan_actlbltyinfsgmt_id 
	* @return
	*/
	public LoanActlbltyinfsgmt getLoanActlbltyinfsgmtById(String loan_actlbltyinfsgmt_id){
		try{
			LoanActlbltyinfsgmt loanActlbltyinfsgmt = loanActlbltyinfsgmtDao.getLoanActlbltyinfsgmtById(loan_actlbltyinfsgmt_id);
			return loanActlbltyinfsgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param loan_actlbltyinfsgmt 
	* @return
	*/
	public int addLoanActlbltyinfsgmt(LoanActlbltyinfsgmt loanActlbltyinfsgmt){
		int i = 0;
		try {
			i = loanActlbltyinfsgmtDao.addLoanActlbltyinfsgmt(loanActlbltyinfsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param loan_actlbltyinfsgmt 
	* @return
	*/
	public int updateLoanActlbltyinfsgmt(LoanActlbltyinfsgmt loanActlbltyinfsgmt){
		int i = 0;
		try {
			i = loanActlbltyinfsgmtDao.updateLoanActlbltyinfsgmt(loanActlbltyinfsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param loan_actlbltyinfsgmt 
	* @return
	*/
	public int updateLoanActlbltyinfsgmtBySelective(LoanActlbltyinfsgmt loanActlbltyinfsgmt){
		int i = 0;
		try {
			i = loanActlbltyinfsgmtDao.updateLoanActlbltyinfsgmtBySelective(loanActlbltyinfsgmt);
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
	public int delLoanActlbltyinfsgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = loanActlbltyinfsgmtDao.delLoanActlbltyinfsgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param loan_actlbltyinfsgmtList 
	* @return
	*/
	public int addBatchLoanActlbltyinfsgmt(List<LoanActlbltyinfsgmt> loanActlbltyinfsgmtList){
		int i = 0;
		try {
			i = loanActlbltyinfsgmtDao.addBatchLoanActlbltyinfsgmt(loanActlbltyinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param loan_actlbltyinfsgmtList 
	* @return
	*/
	public int updateBatchLoanActlbltyinfsgmt(List<LoanActlbltyinfsgmt> loanActlbltyinfsgmtList){
		int i = 0;
		try {
			i = loanActlbltyinfsgmtDao.updateBatchLoanActlbltyinfsgmt(loanActlbltyinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param loan_actlbltyinfsgmtList 
	* @return
	*/
	public int updateBatchLoanActlbltyinfsgmtBySelective(List<LoanActlbltyinfsgmt> loanActlbltyinfsgmtList){
		int i = 0;
		try {
			i = loanActlbltyinfsgmtDao.updateBatchLoanActlbltyinfsgmtBySelective(loanActlbltyinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
