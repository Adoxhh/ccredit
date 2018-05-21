package ccredit.finmodules.finservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.finmodules.finservice.FinIncomeandexpensestatementsgmtService;
import ccredit.finmodules.findao.FinIncomeandexpensestatementsgmtDao;
import ccredit.finmodules.finmodel.FinIncomeandexpensestatementsgmt;

/**
* 事业单位收入支出表 
* 2018-05-03 15:04:06  yangzhou
*/
@Service("finIncomeandexpensestatementsgmtService")
public class FinIncomeandexpensestatementsgmtServiceImpl extends BaseService implements FinIncomeandexpensestatementsgmtService{
	@Autowired
	private FinIncomeandexpensestatementsgmtDao finIncomeandexpensestatementsgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<FinIncomeandexpensestatementsgmt> getFinIncomeandexpensestatementsgmtListByCondition(Map<String,Object> condition){
		try{
			return finIncomeandexpensestatementsgmtDao.getFinIncomeandexpensestatementsgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param fin_incomeandexpensestatementsgmt_id 
	* @return
	*/
	public FinIncomeandexpensestatementsgmt getFinIncomeandexpensestatementsgmtById(String fin_incomeandexpensestatementsgmt_id){
		try{
			FinIncomeandexpensestatementsgmt finIncomeandexpensestatementsgmt = finIncomeandexpensestatementsgmtDao.getFinIncomeandexpensestatementsgmtById(fin_incomeandexpensestatementsgmt_id);
			return finIncomeandexpensestatementsgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param fin_incomeandexpensestatementsgmt 
	* @return
	*/
	public int addFinIncomeandexpensestatementsgmt(FinIncomeandexpensestatementsgmt finIncomeandexpensestatementsgmt){
		int i = 0;
		try {
			i = finIncomeandexpensestatementsgmtDao.addFinIncomeandexpensestatementsgmt(finIncomeandexpensestatementsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param fin_incomeandexpensestatementsgmt 
	* @return
	*/
	public int updateFinIncomeandexpensestatementsgmt(FinIncomeandexpensestatementsgmt finIncomeandexpensestatementsgmt){
		int i = 0;
		try {
			i = finIncomeandexpensestatementsgmtDao.updateFinIncomeandexpensestatementsgmt(finIncomeandexpensestatementsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param fin_incomeandexpensestatementsgmt 
	* @return
	*/
	public int updateFinIncomeandexpensestatementsgmtBySelective(FinIncomeandexpensestatementsgmt finIncomeandexpensestatementsgmt){
		int i = 0;
		try {
			i = finIncomeandexpensestatementsgmtDao.updateFinIncomeandexpensestatementsgmtBySelective(finIncomeandexpensestatementsgmt);
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
	public int delFinIncomeandexpensestatementsgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = finIncomeandexpensestatementsgmtDao.delFinIncomeandexpensestatementsgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param fin_incomeandexpensestatementsgmtList 
	* @return
	*/
	public int addBatchFinIncomeandexpensestatementsgmt(List<FinIncomeandexpensestatementsgmt> finIncomeandexpensestatementsgmtList){
		int i = 0;
		try {
			i = finIncomeandexpensestatementsgmtDao.addBatchFinIncomeandexpensestatementsgmt(finIncomeandexpensestatementsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param fin_incomeandexpensestatementsgmtList 
	* @return
	*/
	public int updateBatchFinIncomeandexpensestatementsgmt(List<FinIncomeandexpensestatementsgmt> finIncomeandexpensestatementsgmtList){
		int i = 0;
		try {
			i = finIncomeandexpensestatementsgmtDao.updateBatchFinIncomeandexpensestatementsgmt(finIncomeandexpensestatementsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param fin_incomeandexpensestatementsgmtList 
	* @return
	*/
	public int updateBatchFinIncomeandexpensestatementsgmtBySelective(List<FinIncomeandexpensestatementsgmt> finIncomeandexpensestatementsgmtList){
		int i = 0;
		try {
			i = finIncomeandexpensestatementsgmtDao.updateBatchFinIncomeandexpensestatementsgmtBySelective(finIncomeandexpensestatementsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
