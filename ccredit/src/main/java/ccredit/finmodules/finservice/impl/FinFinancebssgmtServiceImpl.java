package ccredit.finmodules.finservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.finmodules.finservice.FinFinancebssgmtService;
import ccredit.finmodules.findao.FinFinancebssgmtDao;
import ccredit.finmodules.finmodel.FinFinancebssgmt;

/**
* 财务报表信息记录基础段 
* 2018-05-03 15:02:51  yangzhou
*/
@Service("finFinancebssgmtService")
public class FinFinancebssgmtServiceImpl extends BaseService implements FinFinancebssgmtService{
	@Autowired
	private FinFinancebssgmtDao finFinancebssgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<FinFinancebssgmt> getFinFinancebssgmtListByCondition(Map<String,Object> condition){
		try{
			return finFinancebssgmtDao.getFinFinancebssgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param fin_financebssgmt_id 
	* @return
	*/
	public FinFinancebssgmt getFinFinancebssgmtById(String fin_financebssgmt_id){
		try{
			FinFinancebssgmt finFinancebssgmt = finFinancebssgmtDao.getFinFinancebssgmtById(fin_financebssgmt_id);
			return finFinancebssgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param fin_financebssgmt 
	* @return
	*/
	public int addFinFinancebssgmt(FinFinancebssgmt finFinancebssgmt){
		int i = 0;
		try {
			i = finFinancebssgmtDao.addFinFinancebssgmt(finFinancebssgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param fin_financebssgmt 
	* @return
	*/
	public int updateFinFinancebssgmt(FinFinancebssgmt finFinancebssgmt){
		int i = 0;
		try {
			i = finFinancebssgmtDao.updateFinFinancebssgmt(finFinancebssgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param fin_financebssgmt 
	* @return
	*/
	public int updateFinFinancebssgmtBySelective(FinFinancebssgmt finFinancebssgmt){
		int i = 0;
		try {
			i = finFinancebssgmtDao.updateFinFinancebssgmtBySelective(finFinancebssgmt);
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
	public int delFinFinancebssgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = finFinancebssgmtDao.delFinFinancebssgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param fin_financebssgmtList 
	* @return
	*/
	public int addBatchFinFinancebssgmt(List<FinFinancebssgmt> finFinancebssgmtList){
		int i = 0;
		try {
			i = finFinancebssgmtDao.addBatchFinFinancebssgmt(finFinancebssgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param fin_financebssgmtList 
	* @return
	*/
	public int updateBatchFinFinancebssgmt(List<FinFinancebssgmt> finFinancebssgmtList){
		int i = 0;
		try {
			i = finFinancebssgmtDao.updateBatchFinFinancebssgmt(finFinancebssgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param fin_financebssgmtList 
	* @return
	*/
	public int updateBatchFinFinancebssgmtBySelective(List<FinFinancebssgmt> finFinancebssgmtList){
		int i = 0;
		try {
			i = finFinancebssgmtDao.updateBatchFinFinancebssgmtBySelective(finFinancebssgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
