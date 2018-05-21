package ccredit.asmodules.asservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.asmodules.asservice.AsGuaracctbssgmtService;
import ccredit.asmodules.asdao.AsGuaracctbssgmtDao;
import ccredit.asmodules.asmodel.AsGuaracctbssgmt;

/**
* as_guaracctbssgmt 
* 2018-04-27 15:41:57  mengbeibei
*/
@Service("asGuaracctbssgmtService")
public class AsGuaracctbssgmtServiceImpl extends BaseService implements AsGuaracctbssgmtService{
	@Autowired
	private AsGuaracctbssgmtDao asGuaracctbssgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<AsGuaracctbssgmt> getAsGuaracctbssgmtListByCondition(Map<String,Object> condition){
		try{
			return asGuaracctbssgmtDao.getAsGuaracctbssgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param guaracctbssgmt_id 
	* @return
	*/
	public AsGuaracctbssgmt getAsGuaracctbssgmtById(String guaracctbssgmt_id){
		try{
			AsGuaracctbssgmt asGuaracctbssgmt = asGuaracctbssgmtDao.getAsGuaracctbssgmtById(guaracctbssgmt_id);
			return asGuaracctbssgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param as_guaracctbssgmt 
	* @return
	*/
	public int addAsGuaracctbssgmt(AsGuaracctbssgmt asGuaracctbssgmt){
		int i = 0;
		try {
			i = asGuaracctbssgmtDao.addAsGuaracctbssgmt(asGuaracctbssgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param as_guaracctbssgmt 
	* @return
	*/
	public int updateAsGuaracctbssgmt(AsGuaracctbssgmt asGuaracctbssgmt){
		int i = 0;
		try {
			i = asGuaracctbssgmtDao.updateAsGuaracctbssgmt(asGuaracctbssgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param as_guaracctbssgmt 
	* @return
	*/
	public int updateAsGuaracctbssgmtBySelective(AsGuaracctbssgmt asGuaracctbssgmt){
		int i = 0;
		try {
			i = asGuaracctbssgmtDao.updateAsGuaracctbssgmtBySelective(asGuaracctbssgmt);
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
	public int delAsGuaracctbssgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = asGuaracctbssgmtDao.delAsGuaracctbssgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param as_guaracctbssgmtList 
	* @return
	*/
	public int addBatchAsGuaracctbssgmt(List<AsGuaracctbssgmt> asGuaracctbssgmtList){
		int i = 0;
		try {
			i = asGuaracctbssgmtDao.addBatchAsGuaracctbssgmt(asGuaracctbssgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param as_guaracctbssgmtList 
	* @return
	*/
	public int updateBatchAsGuaracctbssgmt(List<AsGuaracctbssgmt> asGuaracctbssgmtList){
		int i = 0;
		try {
			i = asGuaracctbssgmtDao.updateBatchAsGuaracctbssgmt(asGuaracctbssgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param as_guaracctbssgmtList 
	* @return
	*/
	public int updateBatchAsGuaracctbssgmtBySelective(List<AsGuaracctbssgmt> asGuaracctbssgmtList){
		int i = 0;
		try {
			i = asGuaracctbssgmtDao.updateBatchAsGuaracctbssgmtBySelective(asGuaracctbssgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
