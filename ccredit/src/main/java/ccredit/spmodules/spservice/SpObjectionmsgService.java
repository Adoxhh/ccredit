package ccredit.spmodules.spservice;
import java.util.List;
import java.util.Map;
import ccredit.spmodules.spmodel.SpObjectionmsg;

/**
* 异议申请 
* 2018-05-03 10:27:23  mengbeibei
*/
public interface SpObjectionmsgService{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<SpObjectionmsg> getSpObjectionmsgListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param objectionmsg_id 
	* @return
	*/
	public SpObjectionmsg getSpObjectionmsgById(String objectionmsg_id);
	/**
	* 添加
	* @param sp_objectionmsg 
	* @return
	*/
	public int addSpObjectionmsg(SpObjectionmsg spObjectionmsg);
	/**
	* 修改
	* @param sp_objectionmsg 
	* @return
	*/
	public int updateSpObjectionmsg(SpObjectionmsg spObjectionmsg);
	/**
	* 修改（根据动态条件）
	* @param sp_objectionmsg 
	* @return
	*/
	public int updateSpObjectionmsgBySelective(SpObjectionmsg spObjectionmsg);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delSpObjectionmsg(Map<String,Object> condition);
	/**
	* 批量添加
	* @param sp_objectionmsgList 
	* @return
	*/
	public int addBatchSpObjectionmsg(List<SpObjectionmsg> spObjectionmsgList);
	/**
	* 批量修改
	* @param sp_objectionmsgList 
	* @return
	*/
	public int updateBatchSpObjectionmsg(List<SpObjectionmsg> spObjectionmsgList);
	/**
	* 批量修改（根据动态条件）
	* @param sp_objectionmsgList 
	* @return
	*/
	public int updateBatchSpObjectionmsgBySelective(List<SpObjectionmsg> spObjectionmsgList);
}
