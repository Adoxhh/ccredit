package ccredit.spmodules.spservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.spmodules.spservice.SpObjectionmsgService;
import ccredit.spmodules.spdao.SpObjectionmsgDao;
import ccredit.spmodules.spmodel.SpObjectionmsg;

/**
* 异议申请 
* 2018-05-03 10:27:23  mengbeibei
*/
@Service("spObjectionmsgService")
public class SpObjectionmsgServiceImpl extends BaseService implements SpObjectionmsgService{
	@Autowired
	private SpObjectionmsgDao spObjectionmsgDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<SpObjectionmsg> getSpObjectionmsgListByCondition(Map<String,Object> condition){
		try{
			return spObjectionmsgDao.getSpObjectionmsgListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param objectionmsg_id 
	* @return
	*/
	public SpObjectionmsg getSpObjectionmsgById(String objectionmsg_id){
		try{
			SpObjectionmsg spObjectionmsg = spObjectionmsgDao.getSpObjectionmsgById(objectionmsg_id);
			return spObjectionmsg;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param sp_objectionmsg 
	* @return
	*/
	public int addSpObjectionmsg(SpObjectionmsg spObjectionmsg){
		int i = 0;
		try {
			i = spObjectionmsgDao.addSpObjectionmsg(spObjectionmsg);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param sp_objectionmsg 
	* @return
	*/
	public int updateSpObjectionmsg(SpObjectionmsg spObjectionmsg){
		int i = 0;
		try {
			i = spObjectionmsgDao.updateSpObjectionmsg(spObjectionmsg);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param sp_objectionmsg 
	* @return
	*/
	public int updateSpObjectionmsgBySelective(SpObjectionmsg spObjectionmsg){
		int i = 0;
		try {
			i = spObjectionmsgDao.updateSpObjectionmsgBySelective(spObjectionmsg);
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
	public int delSpObjectionmsg(Map<String,Object> condition){
		int i = 0;
		try {
			i = spObjectionmsgDao.delSpObjectionmsg(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param sp_objectionmsgList 
	* @return
	*/
	public int addBatchSpObjectionmsg(List<SpObjectionmsg> spObjectionmsgList){
		int i = 0;
		try {
			i = spObjectionmsgDao.addBatchSpObjectionmsg(spObjectionmsgList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param sp_objectionmsgList 
	* @return
	*/
	public int updateBatchSpObjectionmsg(List<SpObjectionmsg> spObjectionmsgList){
		int i = 0;
		try {
			i = spObjectionmsgDao.updateBatchSpObjectionmsg(spObjectionmsgList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param sp_objectionmsgList 
	* @return
	*/
	public int updateBatchSpObjectionmsgBySelective(List<SpObjectionmsg> spObjectionmsgList){
		int i = 0;
		try {
			i = spObjectionmsgDao.updateBatchSpObjectionmsgBySelective(spObjectionmsgList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
