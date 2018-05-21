package ccredit.plmodules.plservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.plmodules.plservice.PlMotgacltalbsinfsgmtService;
import ccredit.plmodules.pldao.PlMotgacltalbsinfsgmtDao;
import ccredit.plmodules.plmodel.PlMotgacltalbsinfsgmt;

/**
* 抵（质）押合同基本信息段 
* 2018-04-28 16:59:38  yangzhou
*/
@Service("plMotgacltalbsinfsgmtService")
public class PlMotgacltalbsinfsgmtServiceImpl extends BaseService implements PlMotgacltalbsinfsgmtService{
	@Autowired
	private PlMotgacltalbsinfsgmtDao plMotgacltalbsinfsgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<PlMotgacltalbsinfsgmt> getPlMotgacltalbsinfsgmtListByCondition(Map<String,Object> condition){
		try{
			return plMotgacltalbsinfsgmtDao.getPlMotgacltalbsinfsgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param pl_motgacltalbsinfsgmt_id 
	* @return
	*/
	public PlMotgacltalbsinfsgmt getPlMotgacltalbsinfsgmtById(String pl_motgacltalbsinfsgmt_id){
		try{
			PlMotgacltalbsinfsgmt plMotgacltalbsinfsgmt = plMotgacltalbsinfsgmtDao.getPlMotgacltalbsinfsgmtById(pl_motgacltalbsinfsgmt_id);
			return plMotgacltalbsinfsgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param pl_motgacltalbsinfsgmt 
	* @return
	*/
	public int addPlMotgacltalbsinfsgmt(PlMotgacltalbsinfsgmt plMotgacltalbsinfsgmt){
		int i = 0;
		try {
			i = plMotgacltalbsinfsgmtDao.addPlMotgacltalbsinfsgmt(plMotgacltalbsinfsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param pl_motgacltalbsinfsgmt 
	* @return
	*/
	public int updatePlMotgacltalbsinfsgmt(PlMotgacltalbsinfsgmt plMotgacltalbsinfsgmt){
		int i = 0;
		try {
			i = plMotgacltalbsinfsgmtDao.updatePlMotgacltalbsinfsgmt(plMotgacltalbsinfsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param pl_motgacltalbsinfsgmt 
	* @return
	*/
	public int updatePlMotgacltalbsinfsgmtBySelective(PlMotgacltalbsinfsgmt plMotgacltalbsinfsgmt){
		int i = 0;
		try {
			i = plMotgacltalbsinfsgmtDao.updatePlMotgacltalbsinfsgmtBySelective(plMotgacltalbsinfsgmt);
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
	public int delPlMotgacltalbsinfsgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = plMotgacltalbsinfsgmtDao.delPlMotgacltalbsinfsgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param pl_motgacltalbsinfsgmtList 
	* @return
	*/
	public int addBatchPlMotgacltalbsinfsgmt(List<PlMotgacltalbsinfsgmt> plMotgacltalbsinfsgmtList){
		int i = 0;
		try {
			i = plMotgacltalbsinfsgmtDao.addBatchPlMotgacltalbsinfsgmt(plMotgacltalbsinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param pl_motgacltalbsinfsgmtList 
	* @return
	*/
	public int updateBatchPlMotgacltalbsinfsgmt(List<PlMotgacltalbsinfsgmt> plMotgacltalbsinfsgmtList){
		int i = 0;
		try {
			i = plMotgacltalbsinfsgmtDao.updateBatchPlMotgacltalbsinfsgmt(plMotgacltalbsinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param pl_motgacltalbsinfsgmtList 
	* @return
	*/
	public int updateBatchPlMotgacltalbsinfsgmtBySelective(List<PlMotgacltalbsinfsgmt> plMotgacltalbsinfsgmtList){
		int i = 0;
		try {
			i = plMotgacltalbsinfsgmtDao.updateBatchPlMotgacltalbsinfsgmtBySelective(plMotgacltalbsinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
