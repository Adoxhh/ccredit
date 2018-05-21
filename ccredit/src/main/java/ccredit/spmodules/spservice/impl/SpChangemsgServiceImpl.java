package ccredit.spmodules.spservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.spmodules.spservice.SpChangemsgService;
import ccredit.spmodules.spdao.SpChangemsgDao;
import ccredit.spmodules.spmodel.SpChangemsg;

/**
* 变更类报文 
* 2018-05-02 09:39:48  孟贝贝
*/
@Service("spChangemsgService")
public class SpChangemsgServiceImpl extends BaseService implements SpChangemsgService{
	@Autowired
	private SpChangemsgDao spChangemsgDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<SpChangemsg> getSpChangemsgListByCondition(Map<String,Object> condition){
		try{
			return spChangemsgDao.getSpChangemsgListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param changemsg_id 
	* @return
	*/
	public SpChangemsg getSpChangemsgById(String changemsg_id){
		try{
			SpChangemsg spChangemsg = spChangemsgDao.getSpChangemsgById(changemsg_id);
			return spChangemsg;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param sp_changemsg 
	* @return
	*/
	public int addSpChangemsg(SpChangemsg spChangemsg){
		int i = 0;
		try {
			i = spChangemsgDao.addSpChangemsg(spChangemsg);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param sp_changemsg 
	* @return
	*/
	public int updateSpChangemsg(SpChangemsg spChangemsg){
		int i = 0;
		try {
			i = spChangemsgDao.updateSpChangemsg(spChangemsg);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param sp_changemsg 
	* @return
	*/
	public int updateSpChangemsgBySelective(SpChangemsg spChangemsg){
		int i = 0;
		try {
			i = spChangemsgDao.updateSpChangemsgBySelective(spChangemsg);
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
	public int delSpChangemsg(Map<String,Object> condition){
		int i = 0;
		try {
			i = spChangemsgDao.delSpChangemsg(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param sp_changemsgList 
	* @return
	*/
	public int addBatchSpChangemsg(List<SpChangemsg> spChangemsgList){
		int i = 0;
		try {
			i = spChangemsgDao.addBatchSpChangemsg(spChangemsgList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param sp_changemsgList 
	* @return
	*/
	public int updateBatchSpChangemsg(List<SpChangemsg> spChangemsgList){
		int i = 0;
		try {
			i = spChangemsgDao.updateBatchSpChangemsg(spChangemsgList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param sp_changemsgList 
	* @return
	*/
	public int updateBatchSpChangemsgBySelective(List<SpChangemsg> spChangemsgList){
		int i = 0;
		try {
			i = spChangemsgDao.updateBatchSpChangemsgBySelective(spChangemsgList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
