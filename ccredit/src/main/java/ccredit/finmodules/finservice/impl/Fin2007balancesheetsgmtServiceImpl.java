package ccredit.finmodules.finservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.finmodules.finservice.Fin2007balancesheetsgmtService;
import ccredit.finmodules.findao.Fin2007balancesheetsgmtDao;
import ccredit.finmodules.finmodel.Fin2007balancesheetsgmt;

/**
* 2007版资产负债表 
* 2018-05-03 14:56:53  yangzhou
*/
@Service("fin2007balancesheetsgmtService")
public class Fin2007balancesheetsgmtServiceImpl extends BaseService implements Fin2007balancesheetsgmtService{
	@Autowired
	private Fin2007balancesheetsgmtDao fin2007balancesheetsgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<Fin2007balancesheetsgmt> getFin2007balancesheetsgmtListByCondition(Map<String,Object> condition){
		try{
			return fin2007balancesheetsgmtDao.getFin2007balancesheetsgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param fin_2007BalanceSheetSgmt_id 
	* @return
	*/
	public Fin2007balancesheetsgmt getFin2007balancesheetsgmtById(String fin_2007BalanceSheetSgmt_id){
		try{
			Fin2007balancesheetsgmt fin2007balancesheetsgmt = fin2007balancesheetsgmtDao.getFin2007balancesheetsgmtById(fin_2007BalanceSheetSgmt_id);
			return fin2007balancesheetsgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param fin_2007balancesheetsgmt 
	* @return
	*/
	public int addFin2007balancesheetsgmt(Fin2007balancesheetsgmt fin2007balancesheetsgmt){
		int i = 0;
		try {
			i = fin2007balancesheetsgmtDao.addFin2007balancesheetsgmt(fin2007balancesheetsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param fin_2007balancesheetsgmt 
	* @return
	*/
	public int updateFin2007balancesheetsgmt(Fin2007balancesheetsgmt fin2007balancesheetsgmt){
		int i = 0;
		try {
			i = fin2007balancesheetsgmtDao.updateFin2007balancesheetsgmt(fin2007balancesheetsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param fin_2007balancesheetsgmt 
	* @return
	*/
	public int updateFin2007balancesheetsgmtBySelective(Fin2007balancesheetsgmt fin2007balancesheetsgmt){
		int i = 0;
		try {
			i = fin2007balancesheetsgmtDao.updateFin2007balancesheetsgmtBySelective(fin2007balancesheetsgmt);
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
	public int delFin2007balancesheetsgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = fin2007balancesheetsgmtDao.delFin2007balancesheetsgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param fin_2007balancesheetsgmtList 
	* @return
	*/
	public int addBatchFin2007balancesheetsgmt(List<Fin2007balancesheetsgmt> fin2007balancesheetsgmtList){
		int i = 0;
		try {
			i = fin2007balancesheetsgmtDao.addBatchFin2007balancesheetsgmt(fin2007balancesheetsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param fin_2007balancesheetsgmtList 
	* @return
	*/
	public int updateBatchFin2007balancesheetsgmt(List<Fin2007balancesheetsgmt> fin2007balancesheetsgmtList){
		int i = 0;
		try {
			i = fin2007balancesheetsgmtDao.updateBatchFin2007balancesheetsgmt(fin2007balancesheetsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param fin_2007balancesheetsgmtList 
	* @return
	*/
	public int updateBatchFin2007balancesheetsgmtBySelective(List<Fin2007balancesheetsgmt> fin2007balancesheetsgmtList){
		int i = 0;
		try {
			i = fin2007balancesheetsgmtDao.updateBatchFin2007balancesheetsgmtBySelective(fin2007balancesheetsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
