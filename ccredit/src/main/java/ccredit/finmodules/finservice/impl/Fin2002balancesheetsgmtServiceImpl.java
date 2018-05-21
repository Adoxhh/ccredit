package ccredit.finmodules.finservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.finmodules.finservice.Fin2002balancesheetsgmtService;
import ccredit.finmodules.findao.Fin2002balancesheetsgmtDao;
import ccredit.finmodules.finmodel.Fin2002balancesheetsgmt;

/**
* 2002版资产负债表 
* 2018-05-03 14:53:26  yangzhou
*/
@Service("fin2002balancesheetsgmtService")
public class Fin2002balancesheetsgmtServiceImpl extends BaseService implements Fin2002balancesheetsgmtService{
	@Autowired
	private Fin2002balancesheetsgmtDao fin2002balancesheetsgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<Fin2002balancesheetsgmt> getFin2002balancesheetsgmtListByCondition(Map<String,Object> condition){
		try{
			return fin2002balancesheetsgmtDao.getFin2002balancesheetsgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param fin_2002BalanceSheetSgmt_id 
	* @return
	*/
	public Fin2002balancesheetsgmt getFin2002balancesheetsgmtById(String fin_2002BalanceSheetSgmt_id){
		try{
			Fin2002balancesheetsgmt fin2002balancesheetsgmt = fin2002balancesheetsgmtDao.getFin2002balancesheetsgmtById(fin_2002BalanceSheetSgmt_id);
			return fin2002balancesheetsgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param fin_2002balancesheetsgmt 
	* @return
	*/
	public int addFin2002balancesheetsgmt(Fin2002balancesheetsgmt fin2002balancesheetsgmt){
		int i = 0;
		try {
			i = fin2002balancesheetsgmtDao.addFin2002balancesheetsgmt(fin2002balancesheetsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param fin_2002balancesheetsgmt 
	* @return
	*/
	public int updateFin2002balancesheetsgmt(Fin2002balancesheetsgmt fin2002balancesheetsgmt){
		int i = 0;
		try {
			i = fin2002balancesheetsgmtDao.updateFin2002balancesheetsgmt(fin2002balancesheetsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param fin_2002balancesheetsgmt 
	* @return
	*/
	public int updateFin2002balancesheetsgmtBySelective(Fin2002balancesheetsgmt fin2002balancesheetsgmt){
		int i = 0;
		try {
			i = fin2002balancesheetsgmtDao.updateFin2002balancesheetsgmtBySelective(fin2002balancesheetsgmt);
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
	public int delFin2002balancesheetsgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = fin2002balancesheetsgmtDao.delFin2002balancesheetsgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param fin_2002balancesheetsgmtList 
	* @return
	*/
	public int addBatchFin2002balancesheetsgmt(List<Fin2002balancesheetsgmt> fin2002balancesheetsgmtList){
		int i = 0;
		try {
			i = fin2002balancesheetsgmtDao.addBatchFin2002balancesheetsgmt(fin2002balancesheetsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param fin_2002balancesheetsgmtList 
	* @return
	*/
	public int updateBatchFin2002balancesheetsgmt(List<Fin2002balancesheetsgmt> fin2002balancesheetsgmtList){
		int i = 0;
		try {
			i = fin2002balancesheetsgmtDao.updateBatchFin2002balancesheetsgmt(fin2002balancesheetsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param fin_2002balancesheetsgmtList 
	* @return
	*/
	public int updateBatchFin2002balancesheetsgmtBySelective(List<Fin2002balancesheetsgmt> fin2002balancesheetsgmtList){
		int i = 0;
		try {
			i = fin2002balancesheetsgmtDao.updateBatchFin2002balancesheetsgmtBySelective(fin2002balancesheetsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
