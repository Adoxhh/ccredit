package ccredit.bsmodules.bsdao;
import java.util.List;
import java.util.Map;
import ccredit.bsmodules.bsmodel.BsActucotrlinfsgmt;

/**
* 实际控制人 
* 2018-04-26 14:38:51  mengbeibei
*/
public interface BsActucotrlinfsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<BsActucotrlinfsgmt> getBsActucotrlinfsgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param bs_actucotrlinfsgmt_id 
	* @return
	*/
	public BsActucotrlinfsgmt getBsActucotrlinfsgmtById(String bs_actucotrlinfsgmt_id);
	/**
	* 添加
	* @param bs_actucotrlinfsgmt 
	* @return
	*/
	public int addBsActucotrlinfsgmt(BsActucotrlinfsgmt bsActucotrlinfsgmt);
	/**
	* 修改
	* @param bs_actucotrlinfsgmt 
	* @return
	*/
	public int updateBsActucotrlinfsgmt(BsActucotrlinfsgmt bsActucotrlinfsgmt);
	/**
	* 修改（根据动态条件）
	* @param bs_actucotrlinfsgmt 
	* @return
	*/
	public int updateBsActucotrlinfsgmtBySelective(BsActucotrlinfsgmt bsActucotrlinfsgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delBsActucotrlinfsgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param bs_actucotrlinfsgmtList 
	* @return
	*/
	public int addBatchBsActucotrlinfsgmt(List<BsActucotrlinfsgmt> bsActucotrlinfsgmtList);
	/**
	* 批量修改
	* @param bs_actucotrlinfsgmtList 
	* @return
	*/
	public int updateBatchBsActucotrlinfsgmt(List<BsActucotrlinfsgmt> bsActucotrlinfsgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param bs_actucotrlinfsgmtList 
	* @return
	*/
	public int updateBatchBsActucotrlinfsgmtBySelective(List<BsActucotrlinfsgmt> bsActucotrlinfsgmtList);
}
