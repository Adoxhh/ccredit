package ccredit.asmodules.asservice;
import java.util.List;
import java.util.Map;
import ccredit.asmodules.asmodel.AsRltrepymtinfsgmt;

/**
* 企业担保账户相关还款责任人信息段 
* 2018-04-28 15:39:48  mengbeibei
*/
public interface AsRltrepymtinfsgmtService{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<AsRltrepymtinfsgmt> getAsRltrepymtinfsgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param rltrepymtinfsgmt_id 
	* @return
	*/
	public AsRltrepymtinfsgmt getAsRltrepymtinfsgmtById(String rltrepymtinfsgmt_id);
	/**
	* 添加
	* @param as_rltrepymtinfsgmt 
	* @return
	*/
	public int addAsRltrepymtinfsgmt(AsRltrepymtinfsgmt asRltrepymtinfsgmt);
	/**
	* 修改
	* @param as_rltrepymtinfsgmt 
	* @return
	*/
	public int updateAsRltrepymtinfsgmt(AsRltrepymtinfsgmt asRltrepymtinfsgmt);
	/**
	* 修改（根据动态条件）
	* @param as_rltrepymtinfsgmt 
	* @return
	*/
	public int updateAsRltrepymtinfsgmtBySelective(AsRltrepymtinfsgmt asRltrepymtinfsgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delAsRltrepymtinfsgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param as_rltrepymtinfsgmtList 
	* @return
	*/
	public int addBatchAsRltrepymtinfsgmt(List<AsRltrepymtinfsgmt> asRltrepymtinfsgmtList);
	/**
	* 批量修改
	* @param as_rltrepymtinfsgmtList 
	* @return
	*/
	public int updateBatchAsRltrepymtinfsgmt(List<AsRltrepymtinfsgmt> asRltrepymtinfsgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param as_rltrepymtinfsgmtList 
	* @return
	*/
	public int updateBatchAsRltrepymtinfsgmtBySelective(List<AsRltrepymtinfsgmt> asRltrepymtinfsgmtList);
}
