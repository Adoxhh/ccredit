package ccredit.spmodules.spservice;
import java.util.List;
import java.util.Map;
import ccredit.spmodules.spmodel.SpDelmsg;

/**
* sp_delmsg 
* 2018-05-03 10:33:05  mengbeibei
*/
public interface SpDelmsgService{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<SpDelmsg> getSpDelmsgListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param delmsg_id 
	* @return
	*/
	public SpDelmsg getSpDelmsgById(String delmsg_id);
	/**
	* 添加
	* @param sp_delmsg 
	* @return
	*/
	public int addSpDelmsg(SpDelmsg spDelmsg);
	/**
	* 修改
	* @param sp_delmsg 
	* @return
	*/
	public int updateSpDelmsg(SpDelmsg spDelmsg);
	/**
	* 修改（根据动态条件）
	* @param sp_delmsg 
	* @return
	*/
	public int updateSpDelmsgBySelective(SpDelmsg spDelmsg);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delSpDelmsg(Map<String,Object> condition);
	/**
	* 批量添加
	* @param sp_delmsgList 
	* @return
	*/
	public int addBatchSpDelmsg(List<SpDelmsg> spDelmsgList);
	/**
	* 批量修改
	* @param sp_delmsgList 
	* @return
	*/
	public int updateBatchSpDelmsg(List<SpDelmsg> spDelmsgList);
	/**
	* 批量修改（根据动态条件）
	* @param sp_delmsgList 
	* @return
	*/
	public int updateBatchSpDelmsgBySelective(List<SpDelmsg> spDelmsgList);
}
