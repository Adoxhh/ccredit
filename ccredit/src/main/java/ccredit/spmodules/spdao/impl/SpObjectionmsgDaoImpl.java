package ccredit.spmodules.spdao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.spmodules.spdao.SpObjectionmsgDao;
import ccredit.spmodules.spmodel.SpObjectionmsg;

/**
* 异议申请 
* 2018-05-03 10:27:23  mengbeibei
*/
@Repository("spObjectionmsgDao")
public class SpObjectionmsgDaoImpl  extends BaseDaoImpl implements SpObjectionmsgDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<SpObjectionmsg> getSpObjectionmsgListByCondition(Map<String,Object> condition){
		return (List<SpObjectionmsg>)this.getList("getSpObjectionmsgListByCondition",condition);
	}
	/**
	* 查询对象
	* @param objectionmsg_id 
	* @return
	*/
	public SpObjectionmsg getSpObjectionmsgById(String objectionmsg_id){
		return (SpObjectionmsg)this.get("getSpObjectionmsgById", objectionmsg_id);
	}
	/**
	* 添加
	* @param sp_objectionmsg 
	* @return
	*/
	public int addSpObjectionmsg(SpObjectionmsg spObjectionmsg){
		return this.add("addSpObjectionmsg", spObjectionmsg);
	}
	/**
	* 修改
	* @param sp_objectionmsg 
	* @return
	*/
	public int updateSpObjectionmsg(SpObjectionmsg spObjectionmsg){
		return this.update("updateSpObjectionmsg", spObjectionmsg);
	}
	/**
	* 修改（根据动态条件）
	* @param sp_objectionmsg 
	* @return
	*/
	public int updateSpObjectionmsgBySelective(SpObjectionmsg spObjectionmsg){
		return this.update("updateSpObjectionmsgBySelective", spObjectionmsg);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delSpObjectionmsg(Map<String,Object> condition){
		return this.del("delSpObjectionmsg", condition);
	}
	/**
	* 批量添加
	* @param sp_objectionmsgList 
	* @return
	*/
	public int addBatchSpObjectionmsg(List<SpObjectionmsg> spObjectionmsgList){
		return this.add("addBatchSpObjectionmsg", spObjectionmsgList);
	}
	/**
	* 批量修改
	* @param sp_objectionmsgList 
	* @return
	*/
	public int updateBatchSpObjectionmsg(List<SpObjectionmsg> spObjectionmsgList){
		return this.update("updateBatchSpObjectionmsg", spObjectionmsgList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param sp_objectionmsgList 
	* @return
	*/
	public int updateBatchSpObjectionmsgBySelective(List<SpObjectionmsg> spObjectionmsgList){
		return this.update("updateBatchSpObjectionmsgBySelective", spObjectionmsgList);
	}
}
