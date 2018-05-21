package ccredit.plmodules.plservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.plmodules.plservice.PlMotgacltalctrctbssgmtService;
import ccredit.plmodules.pldao.PlMotgacltalctrctbssgmtDao;
import ccredit.plmodules.plmodel.PlMotgacltalctrctbssgmt;

/**
* 抵（质）押合同信息记录基础段 
* 2018-04-28 16:56:37  yangzhou
*/
@Service("plMotgacltalctrctbssgmtService")
public class PlMotgacltalctrctbssgmtServiceImpl extends BaseService implements PlMotgacltalctrctbssgmtService{
	@Autowired
	private PlMotgacltalctrctbssgmtDao plMotgacltalctrctbssgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<PlMotgacltalctrctbssgmt> getPlMotgacltalctrctbssgmtListByCondition(Map<String,Object> condition){
		try{
			return plMotgacltalctrctbssgmtDao.getPlMotgacltalctrctbssgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param pl_motgacltalctrctbssgmt_id 
	* @return
	*/
	public PlMotgacltalctrctbssgmt getPlMotgacltalctrctbssgmtById(String pl_motgacltalctrctbssgmt_id){
		try{
			PlMotgacltalctrctbssgmt plMotgacltalctrctbssgmt = plMotgacltalctrctbssgmtDao.getPlMotgacltalctrctbssgmtById(pl_motgacltalctrctbssgmt_id);
			return plMotgacltalctrctbssgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param pl_motgacltalctrctbssgmt 
	* @return
	*/
	public int addPlMotgacltalctrctbssgmt(PlMotgacltalctrctbssgmt plMotgacltalctrctbssgmt){
		int i = 0;
		try {
			i = plMotgacltalctrctbssgmtDao.addPlMotgacltalctrctbssgmt(plMotgacltalctrctbssgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param pl_motgacltalctrctbssgmt 
	* @return
	*/
	public int updatePlMotgacltalctrctbssgmt(PlMotgacltalctrctbssgmt plMotgacltalctrctbssgmt){
		int i = 0;
		try {
			i = plMotgacltalctrctbssgmtDao.updatePlMotgacltalctrctbssgmt(plMotgacltalctrctbssgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param pl_motgacltalctrctbssgmt 
	* @return
	*/
	public int updatePlMotgacltalctrctbssgmtBySelective(PlMotgacltalctrctbssgmt plMotgacltalctrctbssgmt){
		int i = 0;
		try {
			i = plMotgacltalctrctbssgmtDao.updatePlMotgacltalctrctbssgmtBySelective(plMotgacltalctrctbssgmt);
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
	public int delPlMotgacltalctrctbssgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = plMotgacltalctrctbssgmtDao.delPlMotgacltalctrctbssgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param pl_motgacltalctrctbssgmtList 
	* @return
	*/
	public int addBatchPlMotgacltalctrctbssgmt(List<PlMotgacltalctrctbssgmt> plMotgacltalctrctbssgmtList){
		int i = 0;
		try {
			i = plMotgacltalctrctbssgmtDao.addBatchPlMotgacltalctrctbssgmt(plMotgacltalctrctbssgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param pl_motgacltalctrctbssgmtList 
	* @return
	*/
	public int updateBatchPlMotgacltalctrctbssgmt(List<PlMotgacltalctrctbssgmt> plMotgacltalctrctbssgmtList){
		int i = 0;
		try {
			i = plMotgacltalctrctbssgmtDao.updateBatchPlMotgacltalctrctbssgmt(plMotgacltalctrctbssgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param pl_motgacltalctrctbssgmtList 
	* @return
	*/
	public int updateBatchPlMotgacltalctrctbssgmtBySelective(List<PlMotgacltalctrctbssgmt> plMotgacltalctrctbssgmtList){
		int i = 0;
		try {
			i = plMotgacltalctrctbssgmtDao.updateBatchPlMotgacltalctrctbssgmtBySelective(plMotgacltalctrctbssgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	
	/**
	* 查询历史信息
	*/
	public List<?> getHisPlListByCondition(Map<String,Object> condition){
		try{
			return (List<?>)plMotgacltalctrctbssgmtDao.getHisPlListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
}
