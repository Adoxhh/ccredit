package ccredit.spmodules.spservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.spmodules.spservice.SpDelmsgService;
import ccredit.spmodules.spdao.SpDelmsgDao;
import ccredit.spmodules.spmodel.SpDelmsg;

/**
* sp_delmsg 
* 2018-05-03 10:33:05  mengbeibei
*/
@Service("spDelmsgService")
public class SpDelmsgServiceImpl extends BaseService implements SpDelmsgService{
	@Autowired
	private SpDelmsgDao spDelmsgDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<SpDelmsg> getSpDelmsgListByCondition(Map<String,Object> condition){
		try{
			return spDelmsgDao.getSpDelmsgListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param delmsg_id 
	* @return
	*/
	public SpDelmsg getSpDelmsgById(String delmsg_id){
		try{
			SpDelmsg spDelmsg = spDelmsgDao.getSpDelmsgById(delmsg_id);
			return spDelmsg;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param sp_delmsg 
	* @return
	*/
	public int addSpDelmsg(SpDelmsg spDelmsg){
		int i = 0;
		try {
			i = spDelmsgDao.addSpDelmsg(spDelmsg);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param sp_delmsg 
	* @return
	*/
	public int updateSpDelmsg(SpDelmsg spDelmsg){
		int i = 0;
		try {
			i = spDelmsgDao.updateSpDelmsg(spDelmsg);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param sp_delmsg 
	* @return
	*/
	public int updateSpDelmsgBySelective(SpDelmsg spDelmsg){
		int i = 0;
		try {
			i = spDelmsgDao.updateSpDelmsgBySelective(spDelmsg);
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
	public int delSpDelmsg(Map<String,Object> condition){
		int i = 0;
		try {
			i = spDelmsgDao.delSpDelmsg(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param sp_delmsgList 
	* @return
	*/
	public int addBatchSpDelmsg(List<SpDelmsg> spDelmsgList){
		int i = 0;
		try {
			i = spDelmsgDao.addBatchSpDelmsg(spDelmsgList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param sp_delmsgList 
	* @return
	*/
	public int updateBatchSpDelmsg(List<SpDelmsg> spDelmsgList){
		int i = 0;
		try {
			i = spDelmsgDao.updateBatchSpDelmsg(spDelmsgList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param sp_delmsgList 
	* @return
	*/
	public int updateBatchSpDelmsgBySelective(List<SpDelmsg> spDelmsgList){
		int i = 0;
		try {
			i = spDelmsgDao.updateBatchSpDelmsgBySelective(spDelmsgList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
