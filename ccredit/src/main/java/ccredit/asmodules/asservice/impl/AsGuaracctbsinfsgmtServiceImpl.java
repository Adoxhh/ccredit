package ccredit.asmodules.asservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.asmodules.asservice.AsGuaracctbsinfsgmtService;
import ccredit.asmodules.asdao.AsGuaracctbsinfsgmtDao;
import ccredit.asmodules.asmodel.AsGuaracctbsinfsgmt;

/**
* 企业担保账户基本信息段 
* 2018-04-28 15:37:03  mengbeibei
*/
@Service("asGuaracctbsinfsgmtService")
public class AsGuaracctbsinfsgmtServiceImpl extends BaseService implements AsGuaracctbsinfsgmtService{
	@Autowired
	private AsGuaracctbsinfsgmtDao asGuaracctbsinfsgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<AsGuaracctbsinfsgmt> getAsGuaracctbsinfsgmtListByCondition(Map<String,Object> condition){
		try{
			return asGuaracctbsinfsgmtDao.getAsGuaracctbsinfsgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param guaracctbsinfsgmt_id 
	* @return
	*/
	public AsGuaracctbsinfsgmt getAsGuaracctbsinfsgmtById(String guaracctbsinfsgmt_id){
		try{
			AsGuaracctbsinfsgmt asGuaracctbsinfsgmt = asGuaracctbsinfsgmtDao.getAsGuaracctbsinfsgmtById(guaracctbsinfsgmt_id);
			return asGuaracctbsinfsgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param as_guaracctbsinfsgmt 
	* @return
	*/
	public int addAsGuaracctbsinfsgmt(AsGuaracctbsinfsgmt asGuaracctbsinfsgmt){
		int i = 0;
		try {
			i = asGuaracctbsinfsgmtDao.addAsGuaracctbsinfsgmt(asGuaracctbsinfsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param as_guaracctbsinfsgmt 
	* @return
	*/
	public int updateAsGuaracctbsinfsgmt(AsGuaracctbsinfsgmt asGuaracctbsinfsgmt){
		int i = 0;
		try {
			i = asGuaracctbsinfsgmtDao.updateAsGuaracctbsinfsgmt(asGuaracctbsinfsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param as_guaracctbsinfsgmt 
	* @return
	*/
	public int updateAsGuaracctbsinfsgmtBySelective(AsGuaracctbsinfsgmt asGuaracctbsinfsgmt){
		int i = 0;
		try {
			i = asGuaracctbsinfsgmtDao.updateAsGuaracctbsinfsgmtBySelective(asGuaracctbsinfsgmt);
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
	public int delAsGuaracctbsinfsgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = asGuaracctbsinfsgmtDao.delAsGuaracctbsinfsgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param as_guaracctbsinfsgmtList 
	* @return
	*/
	public int addBatchAsGuaracctbsinfsgmt(List<AsGuaracctbsinfsgmt> asGuaracctbsinfsgmtList){
		int i = 0;
		try {
			i = asGuaracctbsinfsgmtDao.addBatchAsGuaracctbsinfsgmt(asGuaracctbsinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param as_guaracctbsinfsgmtList 
	* @return
	*/
	public int updateBatchAsGuaracctbsinfsgmt(List<AsGuaracctbsinfsgmt> asGuaracctbsinfsgmtList){
		int i = 0;
		try {
			i = asGuaracctbsinfsgmtDao.updateBatchAsGuaracctbsinfsgmt(asGuaracctbsinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param as_guaracctbsinfsgmtList 
	* @return
	*/
	public int updateBatchAsGuaracctbsinfsgmtBySelective(List<AsGuaracctbsinfsgmt> asGuaracctbsinfsgmtList){
		int i = 0;
		try {
			i = asGuaracctbsinfsgmtDao.updateBatchAsGuaracctbsinfsgmtBySelective(asGuaracctbsinfsgmtList);
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
	public List<?> getHisAsListByCondition(Map<String,Object> condition){
		try{
			return (List<?>)asGuaracctbsinfsgmtDao.getHisAsListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
}
