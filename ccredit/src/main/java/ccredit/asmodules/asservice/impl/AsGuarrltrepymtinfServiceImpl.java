package ccredit.asmodules.asservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.asmodules.asservice.AsGuarrltrepymtinfService;
import ccredit.asmodules.asdao.AsGuarrltrepymtinfDao;
import ccredit.asmodules.asmodel.AsGuarrltrepymtinf;

/**
* 企业担保账户在保责任信息段 
* 2018-04-28 15:46:18  mengbeibei
*/
@Service("asGuarrltrepymtinfService")
public class AsGuarrltrepymtinfServiceImpl extends BaseService implements AsGuarrltrepymtinfService{
	@Autowired
	private AsGuarrltrepymtinfDao asGuarrltrepymtinfDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<AsGuarrltrepymtinf> getAsGuarrltrepymtinfListByCondition(Map<String,Object> condition){
		try{
			return asGuarrltrepymtinfDao.getAsGuarrltrepymtinfListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param guarrltrepymtinf_id 
	* @return
	*/
	public AsGuarrltrepymtinf getAsGuarrltrepymtinfById(String guarrltrepymtinf_id){
		try{
			AsGuarrltrepymtinf asGuarrltrepymtinf = asGuarrltrepymtinfDao.getAsGuarrltrepymtinfById(guarrltrepymtinf_id);
			return asGuarrltrepymtinf;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param as_guarrltrepymtinf 
	* @return
	*/
	public int addAsGuarrltrepymtinf(AsGuarrltrepymtinf asGuarrltrepymtinf){
		int i = 0;
		try {
			i = asGuarrltrepymtinfDao.addAsGuarrltrepymtinf(asGuarrltrepymtinf);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param as_guarrltrepymtinf 
	* @return
	*/
	public int updateAsGuarrltrepymtinf(AsGuarrltrepymtinf asGuarrltrepymtinf){
		int i = 0;
		try {
			i = asGuarrltrepymtinfDao.updateAsGuarrltrepymtinf(asGuarrltrepymtinf);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param as_guarrltrepymtinf 
	* @return
	*/
	public int updateAsGuarrltrepymtinfBySelective(AsGuarrltrepymtinf asGuarrltrepymtinf){
		int i = 0;
		try {
			i = asGuarrltrepymtinfDao.updateAsGuarrltrepymtinfBySelective(asGuarrltrepymtinf);
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
	public int delAsGuarrltrepymtinf(Map<String,Object> condition){
		int i = 0;
		try {
			i = asGuarrltrepymtinfDao.delAsGuarrltrepymtinf(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param as_guarrltrepymtinfList 
	* @return
	*/
	public int addBatchAsGuarrltrepymtinf(List<AsGuarrltrepymtinf> asGuarrltrepymtinfList){
		int i = 0;
		try {
			i = asGuarrltrepymtinfDao.addBatchAsGuarrltrepymtinf(asGuarrltrepymtinfList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param as_guarrltrepymtinfList 
	* @return
	*/
	public int updateBatchAsGuarrltrepymtinf(List<AsGuarrltrepymtinf> asGuarrltrepymtinfList){
		int i = 0;
		try {
			i = asGuarrltrepymtinfDao.updateBatchAsGuarrltrepymtinf(asGuarrltrepymtinfList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param as_guarrltrepymtinfList 
	* @return
	*/
	public int updateBatchAsGuarrltrepymtinfBySelective(List<AsGuarrltrepymtinf> asGuarrltrepymtinfList){
		int i = 0;
		try {
			i = asGuarrltrepymtinfDao.updateBatchAsGuarrltrepymtinfBySelective(asGuarrltrepymtinfList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
