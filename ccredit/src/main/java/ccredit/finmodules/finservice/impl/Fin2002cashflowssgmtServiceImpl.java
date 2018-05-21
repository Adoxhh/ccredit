package ccredit.finmodules.finservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.finmodules.finservice.Fin2002cashflowssgmtService;
import ccredit.finmodules.findao.Fin2002cashflowssgmtDao;
import ccredit.finmodules.finmodel.Fin2002cashflowssgmt;

/**
* 2002版现金流量表 
* 2018-05-03 14:54:38  yangzhou
*/
@Service("fin2002cashflowssgmtService")
public class Fin2002cashflowssgmtServiceImpl extends BaseService implements Fin2002cashflowssgmtService{
	@Autowired
	private Fin2002cashflowssgmtDao fin2002cashflowssgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<Fin2002cashflowssgmt> getFin2002cashflowssgmtListByCondition(Map<String,Object> condition){
		try{
			return fin2002cashflowssgmtDao.getFin2002cashflowssgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param fin_2002cashflowssgmt_id 
	* @return
	*/
	public Fin2002cashflowssgmt getFin2002cashflowssgmtById(String fin_2002cashflowssgmt_id){
		try{
			Fin2002cashflowssgmt fin2002cashflowssgmt = fin2002cashflowssgmtDao.getFin2002cashflowssgmtById(fin_2002cashflowssgmt_id);
			return fin2002cashflowssgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param fin_2002cashflowssgmt 
	* @return
	*/
	public int addFin2002cashflowssgmt(Fin2002cashflowssgmt fin2002cashflowssgmt){
		int i = 0;
		try {
			i = fin2002cashflowssgmtDao.addFin2002cashflowssgmt(fin2002cashflowssgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param fin_2002cashflowssgmt 
	* @return
	*/
	public int updateFin2002cashflowssgmt(Fin2002cashflowssgmt fin2002cashflowssgmt){
		int i = 0;
		try {
			i = fin2002cashflowssgmtDao.updateFin2002cashflowssgmt(fin2002cashflowssgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param fin_2002cashflowssgmt 
	* @return
	*/
	public int updateFin2002cashflowssgmtBySelective(Fin2002cashflowssgmt fin2002cashflowssgmt){
		int i = 0;
		try {
			i = fin2002cashflowssgmtDao.updateFin2002cashflowssgmtBySelective(fin2002cashflowssgmt);
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
	public int delFin2002cashflowssgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = fin2002cashflowssgmtDao.delFin2002cashflowssgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param fin_2002cashflowssgmtList 
	* @return
	*/
	public int addBatchFin2002cashflowssgmt(List<Fin2002cashflowssgmt> fin2002cashflowssgmtList){
		int i = 0;
		try {
			i = fin2002cashflowssgmtDao.addBatchFin2002cashflowssgmt(fin2002cashflowssgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param fin_2002cashflowssgmtList 
	* @return
	*/
	public int updateBatchFin2002cashflowssgmt(List<Fin2002cashflowssgmt> fin2002cashflowssgmtList){
		int i = 0;
		try {
			i = fin2002cashflowssgmtDao.updateBatchFin2002cashflowssgmt(fin2002cashflowssgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param fin_2002cashflowssgmtList 
	* @return
	*/
	public int updateBatchFin2002cashflowssgmtBySelective(List<Fin2002cashflowssgmt> fin2002cashflowssgmtList){
		int i = 0;
		try {
			i = fin2002cashflowssgmtDao.updateBatchFin2002cashflowssgmtBySelective(fin2002cashflowssgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
