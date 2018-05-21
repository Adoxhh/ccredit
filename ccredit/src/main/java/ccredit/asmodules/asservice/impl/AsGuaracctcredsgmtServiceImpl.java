package ccredit.asmodules.asservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.asmodules.asservice.AsGuaracctcredsgmtService;
import ccredit.asmodules.asdao.AsGuaracctcredsgmtDao;
import ccredit.asmodules.asmodel.AsGuaracctcredsgmt;

/**
* 企业担保账户授信额度息段 
* 2018-04-28 15:43:06  mengbeibei
*/
@Service("asGuaracctcredsgmtService")
public class AsGuaracctcredsgmtServiceImpl extends BaseService implements AsGuaracctcredsgmtService{
	@Autowired
	private AsGuaracctcredsgmtDao asGuaracctcredsgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<AsGuaracctcredsgmt> getAsGuaracctcredsgmtListByCondition(Map<String,Object> condition){
		try{
			return asGuaracctcredsgmtDao.getAsGuaracctcredsgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param guaracctcredsgmt_id 
	* @return
	*/
	public AsGuaracctcredsgmt getAsGuaracctcredsgmtById(String guaracctcredsgmt_id){
		try{
			AsGuaracctcredsgmt asGuaracctcredsgmt = asGuaracctcredsgmtDao.getAsGuaracctcredsgmtById(guaracctcredsgmt_id);
			return asGuaracctcredsgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param as_guaracctcredsgmt 
	* @return
	*/
	public int addAsGuaracctcredsgmt(AsGuaracctcredsgmt asGuaracctcredsgmt){
		int i = 0;
		try {
			i = asGuaracctcredsgmtDao.addAsGuaracctcredsgmt(asGuaracctcredsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param as_guaracctcredsgmt 
	* @return
	*/
	public int updateAsGuaracctcredsgmt(AsGuaracctcredsgmt asGuaracctcredsgmt){
		int i = 0;
		try {
			i = asGuaracctcredsgmtDao.updateAsGuaracctcredsgmt(asGuaracctcredsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param as_guaracctcredsgmt 
	* @return
	*/
	public int updateAsGuaracctcredsgmtBySelective(AsGuaracctcredsgmt asGuaracctcredsgmt){
		int i = 0;
		try {
			i = asGuaracctcredsgmtDao.updateAsGuaracctcredsgmtBySelective(asGuaracctcredsgmt);
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
	public int delAsGuaracctcredsgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = asGuaracctcredsgmtDao.delAsGuaracctcredsgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param as_guaracctcredsgmtList 
	* @return
	*/
	public int addBatchAsGuaracctcredsgmt(List<AsGuaracctcredsgmt> asGuaracctcredsgmtList){
		int i = 0;
		try {
			i = asGuaracctcredsgmtDao.addBatchAsGuaracctcredsgmt(asGuaracctcredsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param as_guaracctcredsgmtList 
	* @return
	*/
	public int updateBatchAsGuaracctcredsgmt(List<AsGuaracctcredsgmt> asGuaracctcredsgmtList){
		int i = 0;
		try {
			i = asGuaracctcredsgmtDao.updateBatchAsGuaracctcredsgmt(asGuaracctcredsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param as_guaracctcredsgmtList 
	* @return
	*/
	public int updateBatchAsGuaracctcredsgmtBySelective(List<AsGuaracctcredsgmt> asGuaracctcredsgmtList){
		int i = 0;
		try {
			i = asGuaracctcredsgmtDao.updateBatchAsGuaracctcredsgmtBySelective(asGuaracctcredsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
