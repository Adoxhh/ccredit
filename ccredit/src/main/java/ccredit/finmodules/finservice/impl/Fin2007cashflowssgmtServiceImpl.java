package ccredit.finmodules.finservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.finmodules.finservice.Fin2007cashflowssgmtService;
import ccredit.finmodules.findao.Fin2007cashflowssgmtDao;
import ccredit.finmodules.finmodel.Fin2007cashflowssgmt;

/**
* 2007版现金流量表 
* 2018-05-03 14:58:47  yangzhou
*/
@Service("fin2007cashflowssgmtService")
public class Fin2007cashflowssgmtServiceImpl extends BaseService implements Fin2007cashflowssgmtService{
	@Autowired
	private Fin2007cashflowssgmtDao fin2007cashflowssgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<Fin2007cashflowssgmt> getFin2007cashflowssgmtListByCondition(Map<String,Object> condition){
		try{
			return fin2007cashflowssgmtDao.getFin2007cashflowssgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param fin_2007cashflowssgmt_id 
	* @return
	*/
	public Fin2007cashflowssgmt getFin2007cashflowssgmtById(String fin_2007cashflowssgmt_id){
		try{
			Fin2007cashflowssgmt fin2007cashflowssgmt = fin2007cashflowssgmtDao.getFin2007cashflowssgmtById(fin_2007cashflowssgmt_id);
			return fin2007cashflowssgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param fin_2007cashflowssgmt 
	* @return
	*/
	public int addFin2007cashflowssgmt(Fin2007cashflowssgmt fin2007cashflowssgmt){
		int i = 0;
		try {
			i = fin2007cashflowssgmtDao.addFin2007cashflowssgmt(fin2007cashflowssgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param fin_2007cashflowssgmt 
	* @return
	*/
	public int updateFin2007cashflowssgmt(Fin2007cashflowssgmt fin2007cashflowssgmt){
		int i = 0;
		try {
			i = fin2007cashflowssgmtDao.updateFin2007cashflowssgmt(fin2007cashflowssgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param fin_2007cashflowssgmt 
	* @return
	*/
	public int updateFin2007cashflowssgmtBySelective(Fin2007cashflowssgmt fin2007cashflowssgmt){
		int i = 0;
		try {
			i = fin2007cashflowssgmtDao.updateFin2007cashflowssgmtBySelective(fin2007cashflowssgmt);
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
	public int delFin2007cashflowssgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = fin2007cashflowssgmtDao.delFin2007cashflowssgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param fin_2007cashflowssgmtList 
	* @return
	*/
	public int addBatchFin2007cashflowssgmt(List<Fin2007cashflowssgmt> fin2007cashflowssgmtList){
		int i = 0;
		try {
			i = fin2007cashflowssgmtDao.addBatchFin2007cashflowssgmt(fin2007cashflowssgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param fin_2007cashflowssgmtList 
	* @return
	*/
	public int updateBatchFin2007cashflowssgmt(List<Fin2007cashflowssgmt> fin2007cashflowssgmtList){
		int i = 0;
		try {
			i = fin2007cashflowssgmtDao.updateBatchFin2007cashflowssgmt(fin2007cashflowssgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param fin_2007cashflowssgmtList 
	* @return
	*/
	public int updateBatchFin2007cashflowssgmtBySelective(List<Fin2007cashflowssgmt> fin2007cashflowssgmtList){
		int i = 0;
		try {
			i = fin2007cashflowssgmtDao.updateBatchFin2007cashflowssgmtBySelective(fin2007cashflowssgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
