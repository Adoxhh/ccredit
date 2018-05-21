package ccredit.spmodules.spdao;
import java.util.List;
import java.util.Map;
import ccredit.spmodules.spmodel.SpChangemsg;

/**
* 变更类报文 
* 2018-05-02 09:39:48  孟贝贝
*/
public interface SpChangemsgDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<SpChangemsg> getSpChangemsgListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param changemsg_id 
	* @return
	*/
	public SpChangemsg getSpChangemsgById(String changemsg_id);
	/**
	* 添加
	* @param sp_changemsg 
	* @return
	*/
	public int addSpChangemsg(SpChangemsg spChangemsg);
	/**
	* 修改
	* @param sp_changemsg 
	* @return
	*/
	public int updateSpChangemsg(SpChangemsg spChangemsg);
	/**
	* 修改（根据动态条件）
	* @param sp_changemsg 
	* @return
	*/
	public int updateSpChangemsgBySelective(SpChangemsg spChangemsg);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delSpChangemsg(Map<String,Object> condition);
	/**
	* 批量添加
	* @param sp_changemsgList 
	* @return
	*/
	public int addBatchSpChangemsg(List<SpChangemsg> spChangemsgList);
	/**
	* 批量修改
	* @param sp_changemsgList 
	* @return
	*/
	public int updateBatchSpChangemsg(List<SpChangemsg> spChangemsgList);
	/**
	* 批量修改（根据动态条件）
	* @param sp_changemsgList 
	* @return
	*/
	public int updateBatchSpChangemsgBySelective(List<SpChangemsg> spChangemsgList);
}
