package ccredit.finmodules.finservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.finmodules.finservice.Fin2002incomestatementprofitappropriationsgmtService;
import ccredit.finmodules.findao.Fin2002incomestatementprofitappropriationsgmtDao;
import ccredit.finmodules.finmodel.Fin2002incomestatementprofitappropriationsgmt;

/**
* 2002版利润及利润分配表 
* 2018-05-03 14:55:47  yangzhou
*/
@Service("fin2002incomestatementprofitappropriationsgmtService")
public class Fin2002incomestatementprofitappropriationsgmtServiceImpl extends BaseService implements Fin2002incomestatementprofitappropriationsgmtService{
	@Autowired
	private Fin2002incomestatementprofitappropriationsgmtDao fin2002incomestatementprofitappropriationsgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<Fin2002incomestatementprofitappropriationsgmt> getFin2002incomestatementprofitappropriationsgmtListByCondition(Map<String,Object> condition){
		try{
			return fin2002incomestatementprofitappropriationsgmtDao.getFin2002incomestatementprofitappropriationsgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param fin_2002incomestatementprofitappropriationsgmt_id 
	* @return
	*/
	public Fin2002incomestatementprofitappropriationsgmt getFin2002incomestatementprofitappropriationsgmtById(String fin_2002incomestatementprofitappropriationsgmt_id){
		try{
			Fin2002incomestatementprofitappropriationsgmt fin2002incomestatementprofitappropriationsgmt = fin2002incomestatementprofitappropriationsgmtDao.getFin2002incomestatementprofitappropriationsgmtById(fin_2002incomestatementprofitappropriationsgmt_id);
			return fin2002incomestatementprofitappropriationsgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param fin_2002incomestatementprofitappropriationsgmt 
	* @return
	*/
	public int addFin2002incomestatementprofitappropriationsgmt(Fin2002incomestatementprofitappropriationsgmt fin2002incomestatementprofitappropriationsgmt){
		int i = 0;
		try {
			i = fin2002incomestatementprofitappropriationsgmtDao.addFin2002incomestatementprofitappropriationsgmt(fin2002incomestatementprofitappropriationsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param fin_2002incomestatementprofitappropriationsgmt 
	* @return
	*/
	public int updateFin2002incomestatementprofitappropriationsgmt(Fin2002incomestatementprofitappropriationsgmt fin2002incomestatementprofitappropriationsgmt){
		int i = 0;
		try {
			i = fin2002incomestatementprofitappropriationsgmtDao.updateFin2002incomestatementprofitappropriationsgmt(fin2002incomestatementprofitappropriationsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param fin_2002incomestatementprofitappropriationsgmt 
	* @return
	*/
	public int updateFin2002incomestatementprofitappropriationsgmtBySelective(Fin2002incomestatementprofitappropriationsgmt fin2002incomestatementprofitappropriationsgmt){
		int i = 0;
		try {
			i = fin2002incomestatementprofitappropriationsgmtDao.updateFin2002incomestatementprofitappropriationsgmtBySelective(fin2002incomestatementprofitappropriationsgmt);
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
	public int delFin2002incomestatementprofitappropriationsgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = fin2002incomestatementprofitappropriationsgmtDao.delFin2002incomestatementprofitappropriationsgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param fin_2002incomestatementprofitappropriationsgmtList 
	* @return
	*/
	public int addBatchFin2002incomestatementprofitappropriationsgmt(List<Fin2002incomestatementprofitappropriationsgmt> fin2002incomestatementprofitappropriationsgmtList){
		int i = 0;
		try {
			i = fin2002incomestatementprofitappropriationsgmtDao.addBatchFin2002incomestatementprofitappropriationsgmt(fin2002incomestatementprofitappropriationsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param fin_2002incomestatementprofitappropriationsgmtList 
	* @return
	*/
	public int updateBatchFin2002incomestatementprofitappropriationsgmt(List<Fin2002incomestatementprofitappropriationsgmt> fin2002incomestatementprofitappropriationsgmtList){
		int i = 0;
		try {
			i = fin2002incomestatementprofitappropriationsgmtDao.updateBatchFin2002incomestatementprofitappropriationsgmt(fin2002incomestatementprofitappropriationsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param fin_2002incomestatementprofitappropriationsgmtList 
	* @return
	*/
	public int updateBatchFin2002incomestatementprofitappropriationsgmtBySelective(List<Fin2002incomestatementprofitappropriationsgmt> fin2002incomestatementprofitappropriationsgmtList){
		int i = 0;
		try {
			i = fin2002incomestatementprofitappropriationsgmtDao.updateBatchFin2002incomestatementprofitappropriationsgmtBySelective(fin2002incomestatementprofitappropriationsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
