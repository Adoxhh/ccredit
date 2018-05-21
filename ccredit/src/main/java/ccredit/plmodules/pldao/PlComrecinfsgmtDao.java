package ccredit.plmodules.pldao;
import java.util.List;
import java.util.Map;
import ccredit.plmodules.plmodel.PlComrecinfsgmt;

/**
* 抵(质)押合同共同债务人信息 
* 2018-04-28 17:01:31  yangzhou
*/
public interface PlComrecinfsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<PlComrecinfsgmt> getPlComrecinfsgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param pl_comrecinfsgmt_id 
	* @return
	*/
	public PlComrecinfsgmt getPlComrecinfsgmtById(String pl_comrecinfsgmt_id);
	/**
	* 添加
	* @param pl_comrecinfsgmt 
	* @return
	*/
	public int addPlComrecinfsgmt(PlComrecinfsgmt plComrecinfsgmt);
	/**
	* 修改
	* @param pl_comrecinfsgmt 
	* @return
	*/
	public int updatePlComrecinfsgmt(PlComrecinfsgmt plComrecinfsgmt);
	/**
	* 修改（根据动态条件）
	* @param pl_comrecinfsgmt 
	* @return
	*/
	public int updatePlComrecinfsgmtBySelective(PlComrecinfsgmt plComrecinfsgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delPlComrecinfsgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param pl_comrecinfsgmtList 
	* @return
	*/
	public int addBatchPlComrecinfsgmt(List<PlComrecinfsgmt> plComrecinfsgmtList);
	/**
	* 批量修改
	* @param pl_comrecinfsgmtList 
	* @return
	*/
	public int updateBatchPlComrecinfsgmt(List<PlComrecinfsgmt> plComrecinfsgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param pl_comrecinfsgmtList 
	* @return
	*/
	public int updateBatchPlComrecinfsgmtBySelective(List<PlComrecinfsgmt> plComrecinfsgmtList);
}
