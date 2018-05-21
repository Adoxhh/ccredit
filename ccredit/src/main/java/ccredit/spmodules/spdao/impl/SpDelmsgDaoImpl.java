package ccredit.spmodules.spdao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.spmodules.spdao.SpDelmsgDao;
import ccredit.spmodules.spmodel.SpDelmsg;

/**
* sp_delmsg 
* 2018-05-03 10:33:05  mengbeibei
*/
@Repository("spDelmsgDao")
public class SpDelmsgDaoImpl  extends BaseDaoImpl implements SpDelmsgDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<SpDelmsg> getSpDelmsgListByCondition(Map<String,Object> condition){
		return (List<SpDelmsg>)this.getList("getSpDelmsgListByCondition",condition);
	}
	/**
	* 查询对象
	* @param delmsg_id 
	* @return
	*/
	public SpDelmsg getSpDelmsgById(String delmsg_id){
		return (SpDelmsg)this.get("getSpDelmsgById", delmsg_id);
	}
	/**
	* 添加
	* @param sp_delmsg 
	* @return
	*/
	public int addSpDelmsg(SpDelmsg spDelmsg){
		return this.add("addSpDelmsg", spDelmsg);
	}
	/**
	* 修改
	* @param sp_delmsg 
	* @return
	*/
	public int updateSpDelmsg(SpDelmsg spDelmsg){
		return this.update("updateSpDelmsg", spDelmsg);
	}
	/**
	* 修改（根据动态条件）
	* @param sp_delmsg 
	* @return
	*/
	public int updateSpDelmsgBySelective(SpDelmsg spDelmsg){
		return this.update("updateSpDelmsgBySelective", spDelmsg);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delSpDelmsg(Map<String,Object> condition){
		return this.del("delSpDelmsg", condition);
	}
	/**
	* 批量添加
	* @param sp_delmsgList 
	* @return
	*/
	public int addBatchSpDelmsg(List<SpDelmsg> spDelmsgList){
		return this.add("addBatchSpDelmsg", spDelmsgList);
	}
	/**
	* 批量修改
	* @param sp_delmsgList 
	* @return
	*/
	public int updateBatchSpDelmsg(List<SpDelmsg> spDelmsgList){
		return this.update("updateBatchSpDelmsg", spDelmsgList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param sp_delmsgList 
	* @return
	*/
	public int updateBatchSpDelmsgBySelective(List<SpDelmsg> spDelmsgList){
		return this.update("updateBatchSpDelmsgBySelective", spDelmsgList);
	}
}
