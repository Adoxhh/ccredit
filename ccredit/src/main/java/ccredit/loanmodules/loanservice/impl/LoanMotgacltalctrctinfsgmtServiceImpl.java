package ccredit.loanmodules.loanservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.loanmodules.loanservice.LoanMotgacltalctrctinfsgmtService;
import ccredit.loanmodules.loandao.LoanMotgacltalctrctinfsgmtDao;
import ccredit.loanmodules.loanmodel.LoanMotgacltalctrctinfsgmt;

/**
* 抵质押物信息 
* 2018-04-27 16:27:40  yangzhou
*/
@Service("loanMotgacltalctrctinfsgmtService")
public class LoanMotgacltalctrctinfsgmtServiceImpl extends BaseService implements LoanMotgacltalctrctinfsgmtService{
	@Autowired
	private LoanMotgacltalctrctinfsgmtDao loanMotgacltalctrctinfsgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<LoanMotgacltalctrctinfsgmt> getLoanMotgacltalctrctinfsgmtListByCondition(Map<String,Object> condition){
		try{
			return loanMotgacltalctrctinfsgmtDao.getLoanMotgacltalctrctinfsgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param loan_motgacltalctrctinfsgmt_id 
	* @return
	*/
	public LoanMotgacltalctrctinfsgmt getLoanMotgacltalctrctinfsgmtById(String loan_motgacltalctrctinfsgmt_id){
		try{
			LoanMotgacltalctrctinfsgmt loanMotgacltalctrctinfsgmt = loanMotgacltalctrctinfsgmtDao.getLoanMotgacltalctrctinfsgmtById(loan_motgacltalctrctinfsgmt_id);
			return loanMotgacltalctrctinfsgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param loan_motgacltalctrctinfsgmt 
	* @return
	*/
	public int addLoanMotgacltalctrctinfsgmt(LoanMotgacltalctrctinfsgmt loanMotgacltalctrctinfsgmt){
		int i = 0;
		try {
			i = loanMotgacltalctrctinfsgmtDao.addLoanMotgacltalctrctinfsgmt(loanMotgacltalctrctinfsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param loan_motgacltalctrctinfsgmt 
	* @return
	*/
	public int updateLoanMotgacltalctrctinfsgmt(LoanMotgacltalctrctinfsgmt loanMotgacltalctrctinfsgmt){
		int i = 0;
		try {
			i = loanMotgacltalctrctinfsgmtDao.updateLoanMotgacltalctrctinfsgmt(loanMotgacltalctrctinfsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param loan_motgacltalctrctinfsgmt 
	* @return
	*/
	public int updateLoanMotgacltalctrctinfsgmtBySelective(LoanMotgacltalctrctinfsgmt loanMotgacltalctrctinfsgmt){
		int i = 0;
		try {
			i = loanMotgacltalctrctinfsgmtDao.updateLoanMotgacltalctrctinfsgmtBySelective(loanMotgacltalctrctinfsgmt);
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
	public int delLoanMotgacltalctrctinfsgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = loanMotgacltalctrctinfsgmtDao.delLoanMotgacltalctrctinfsgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param loan_motgacltalctrctinfsgmtList 
	* @return
	*/
	public int addBatchLoanMotgacltalctrctinfsgmt(List<LoanMotgacltalctrctinfsgmt> loanMotgacltalctrctinfsgmtList){
		int i = 0;
		try {
			i = loanMotgacltalctrctinfsgmtDao.addBatchLoanMotgacltalctrctinfsgmt(loanMotgacltalctrctinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param loan_motgacltalctrctinfsgmtList 
	* @return
	*/
	public int updateBatchLoanMotgacltalctrctinfsgmt(List<LoanMotgacltalctrctinfsgmt> loanMotgacltalctrctinfsgmtList){
		int i = 0;
		try {
			i = loanMotgacltalctrctinfsgmtDao.updateBatchLoanMotgacltalctrctinfsgmt(loanMotgacltalctrctinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param loan_motgacltalctrctinfsgmtList 
	* @return
	*/
	public int updateBatchLoanMotgacltalctrctinfsgmtBySelective(List<LoanMotgacltalctrctinfsgmt> loanMotgacltalctrctinfsgmtList){
		int i = 0;
		try {
			i = loanMotgacltalctrctinfsgmtDao.updateBatchLoanMotgacltalctrctinfsgmtBySelective(loanMotgacltalctrctinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
