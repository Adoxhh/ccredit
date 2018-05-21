package ccredit.finmodules.finservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.finmodules.finservice.Fin2007incomestatementprofitappropriationsgmtService;
import ccredit.finmodules.findao.Fin2007incomestatementprofitappropriationsgmtDao;
import ccredit.finmodules.finmodel.Fin2007incomestatementprofitappropriationsgmt;

/**
* 2007版利润及利润分配表 
* 2018-05-03 15:00:09  yangzhou
*/
@Service("fin2007incomestatementprofitappropriationsgmtService")
public class Fin2007incomestatementprofitappropriationsgmtServiceImpl extends BaseService implements Fin2007incomestatementprofitappropriationsgmtService{
	@Autowired
	private Fin2007incomestatementprofitappropriationsgmtDao fin2007incomestatementprofitappropriationsgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<Fin2007incomestatementprofitappropriationsgmt> getFin2007incomestatementprofitappropriationsgmtListByCondition(Map<String,Object> condition){
		try{
			return fin2007incomestatementprofitappropriationsgmtDao.getFin2007incomestatementprofitappropriationsgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param fin_2007incomestatementprofitappropriationsgmt_id 
	* @return
	*/
	public Fin2007incomestatementprofitappropriationsgmt getFin2007incomestatementprofitappropriationsgmtById(String fin_2007incomestatementprofitappropriationsgmt_id){
		try{
			Fin2007incomestatementprofitappropriationsgmt fin2007incomestatementprofitappropriationsgmt = fin2007incomestatementprofitappropriationsgmtDao.getFin2007incomestatementprofitappropriationsgmtById(fin_2007incomestatementprofitappropriationsgmt_id);
			return fin2007incomestatementprofitappropriationsgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param fin_2007incomestatementprofitappropriationsgmt 
	* @return
	*/
	public int addFin2007incomestatementprofitappropriationsgmt(Fin2007incomestatementprofitappropriationsgmt fin2007incomestatementprofitappropriationsgmt){
		int i = 0;
		try {
			i = fin2007incomestatementprofitappropriationsgmtDao.addFin2007incomestatementprofitappropriationsgmt(fin2007incomestatementprofitappropriationsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param fin_2007incomestatementprofitappropriationsgmt 
	* @return
	*/
	public int updateFin2007incomestatementprofitappropriationsgmt(Fin2007incomestatementprofitappropriationsgmt fin2007incomestatementprofitappropriationsgmt){
		int i = 0;
		try {
			i = fin2007incomestatementprofitappropriationsgmtDao.updateFin2007incomestatementprofitappropriationsgmt(fin2007incomestatementprofitappropriationsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param fin_2007incomestatementprofitappropriationsgmt 
	* @return
	*/
	public int updateFin2007incomestatementprofitappropriationsgmtBySelective(Fin2007incomestatementprofitappropriationsgmt fin2007incomestatementprofitappropriationsgmt){
		int i = 0;
		try {
			i = fin2007incomestatementprofitappropriationsgmtDao.updateFin2007incomestatementprofitappropriationsgmtBySelective(fin2007incomestatementprofitappropriationsgmt);
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
	public int delFin2007incomestatementprofitappropriationsgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = fin2007incomestatementprofitappropriationsgmtDao.delFin2007incomestatementprofitappropriationsgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param fin_2007incomestatementprofitappropriationsgmtList 
	* @return
	*/
	public int addBatchFin2007incomestatementprofitappropriationsgmt(List<Fin2007incomestatementprofitappropriationsgmt> fin2007incomestatementprofitappropriationsgmtList){
		int i = 0;
		try {
			i = fin2007incomestatementprofitappropriationsgmtDao.addBatchFin2007incomestatementprofitappropriationsgmt(fin2007incomestatementprofitappropriationsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param fin_2007incomestatementprofitappropriationsgmtList 
	* @return
	*/
	public int updateBatchFin2007incomestatementprofitappropriationsgmt(List<Fin2007incomestatementprofitappropriationsgmt> fin2007incomestatementprofitappropriationsgmtList){
		int i = 0;
		try {
			i = fin2007incomestatementprofitappropriationsgmtDao.updateBatchFin2007incomestatementprofitappropriationsgmt(fin2007incomestatementprofitappropriationsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param fin_2007incomestatementprofitappropriationsgmtList 
	* @return
	*/
	public int updateBatchFin2007incomestatementprofitappropriationsgmtBySelective(List<Fin2007incomestatementprofitappropriationsgmt> fin2007incomestatementprofitappropriationsgmtList){
		int i = 0;
		try {
			i = fin2007incomestatementprofitappropriationsgmtDao.updateBatchFin2007incomestatementprofitappropriationsgmtBySelective(fin2007incomestatementprofitappropriationsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
