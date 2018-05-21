package ccredit.spmodules.spdao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.spmodules.spdao.SpChangemsgDao;
import ccredit.spmodules.spmodel.SpChangemsg;

/**
* 变更类报文 
* 2018-05-02 09:39:48  孟贝贝
*/
@Repository("spChangemsgDao")
public class SpChangemsgDaoImpl  extends BaseDaoImpl implements SpChangemsgDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<SpChangemsg> getSpChangemsgListByCondition(Map<String,Object> condition){
		return (List<SpChangemsg>)this.getList("getSpChangemsgListByCondition",condition);
	}
	/**
	* 查询对象
	* @param changemsg_id 
	* @return
	*/
	public SpChangemsg getSpChangemsgById(String changemsg_id){
		return (SpChangemsg)this.get("getSpChangemsgById", changemsg_id);
	}
	/**
	* 添加
	* @param sp_changemsg 
	* @return
	*/
	public int addSpChangemsg(SpChangemsg spChangemsg){
		return this.add("addSpChangemsg", spChangemsg);
	}
	/**
	* 修改
	* @param sp_changemsg 
	* @return
	*/
	public int updateSpChangemsg(SpChangemsg spChangemsg){
		return this.update("updateSpChangemsg", spChangemsg);
	}
	/**
	* 修改（根据动态条件）
	* @param sp_changemsg 
	* @return
	*/
	public int updateSpChangemsgBySelective(SpChangemsg spChangemsg){
		return this.update("updateSpChangemsgBySelective", spChangemsg);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delSpChangemsg(Map<String,Object> condition){
		return this.del("delSpChangemsg", condition);
	}
	/**
	* 批量添加
	* @param sp_changemsgList 
	* @return
	*/
	public int addBatchSpChangemsg(List<SpChangemsg> spChangemsgList){
		return this.add("addBatchSpChangemsg", spChangemsgList);
	}
	/**
	* 批量修改
	* @param sp_changemsgList 
	* @return
	*/
	public int updateBatchSpChangemsg(List<SpChangemsg> spChangemsgList){
		return this.update("updateBatchSpChangemsg", spChangemsgList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param sp_changemsgList 
	* @return
	*/
	public int updateBatchSpChangemsgBySelective(List<SpChangemsg> spChangemsgList){
		return this.update("updateBatchSpChangemsgBySelective", spChangemsgList);
	}
}
