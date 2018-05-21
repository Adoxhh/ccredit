package ccredit.asmodules.asservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.asmodules.asservice.AsGuarmotgtalctrctinfService;
import ccredit.asmodules.asdao.AsGuarmotgtalctrctinfDao;
import ccredit.asmodules.asmodel.AsGuarmotgtalctrctinf;

/**
* 企业担保账户抵质押物信息段 
* 2018-04-28 15:41:50  mengbeibei
*/
@Service("asGuarmotgtalctrctinfService")
public class AsGuarmotgtalctrctinfServiceImpl extends BaseService implements AsGuarmotgtalctrctinfService{
	@Autowired
	private AsGuarmotgtalctrctinfDao asGuarmotgtalctrctinfDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<AsGuarmotgtalctrctinf> getAsGuarmotgtalctrctinfListByCondition(Map<String,Object> condition){
		try{
			return asGuarmotgtalctrctinfDao.getAsGuarmotgtalctrctinfListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param guarmotgtalctrctinf_id 
	* @return
	*/
	public AsGuarmotgtalctrctinf getAsGuarmotgtalctrctinfById(String guarmotgtalctrctinf_id){
		try{
			AsGuarmotgtalctrctinf asGuarmotgtalctrctinf = asGuarmotgtalctrctinfDao.getAsGuarmotgtalctrctinfById(guarmotgtalctrctinf_id);
			return asGuarmotgtalctrctinf;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param as_guarmotgtalctrctinf 
	* @return
	*/
	public int addAsGuarmotgtalctrctinf(AsGuarmotgtalctrctinf asGuarmotgtalctrctinf){
		int i = 0;
		try {
			i = asGuarmotgtalctrctinfDao.addAsGuarmotgtalctrctinf(asGuarmotgtalctrctinf);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param as_guarmotgtalctrctinf 
	* @return
	*/
	public int updateAsGuarmotgtalctrctinf(AsGuarmotgtalctrctinf asGuarmotgtalctrctinf){
		int i = 0;
		try {
			i = asGuarmotgtalctrctinfDao.updateAsGuarmotgtalctrctinf(asGuarmotgtalctrctinf);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param as_guarmotgtalctrctinf 
	* @return
	*/
	public int updateAsGuarmotgtalctrctinfBySelective(AsGuarmotgtalctrctinf asGuarmotgtalctrctinf){
		int i = 0;
		try {
			i = asGuarmotgtalctrctinfDao.updateAsGuarmotgtalctrctinfBySelective(asGuarmotgtalctrctinf);
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
	public int delAsGuarmotgtalctrctinf(Map<String,Object> condition){
		int i = 0;
		try {
			i = asGuarmotgtalctrctinfDao.delAsGuarmotgtalctrctinf(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param as_guarmotgtalctrctinfList 
	* @return
	*/
	public int addBatchAsGuarmotgtalctrctinf(List<AsGuarmotgtalctrctinf> asGuarmotgtalctrctinfList){
		int i = 0;
		try {
			i = asGuarmotgtalctrctinfDao.addBatchAsGuarmotgtalctrctinf(asGuarmotgtalctrctinfList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param as_guarmotgtalctrctinfList 
	* @return
	*/
	public int updateBatchAsGuarmotgtalctrctinf(List<AsGuarmotgtalctrctinf> asGuarmotgtalctrctinfList){
		int i = 0;
		try {
			i = asGuarmotgtalctrctinfDao.updateBatchAsGuarmotgtalctrctinf(asGuarmotgtalctrctinfList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param as_guarmotgtalctrctinfList 
	* @return
	*/
	public int updateBatchAsGuarmotgtalctrctinfBySelective(List<AsGuarmotgtalctrctinf> asGuarmotgtalctrctinfList){
		int i = 0;
		try {
			i = asGuarmotgtalctrctinfDao.updateBatchAsGuarmotgtalctrctinfBySelective(asGuarmotgtalctrctinfList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
