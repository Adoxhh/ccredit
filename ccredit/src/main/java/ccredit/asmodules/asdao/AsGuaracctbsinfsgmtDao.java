package ccredit.asmodules.asdao;
import java.util.List;
import java.util.Map;
import ccredit.asmodules.asmodel.AsGuaracctbsinfsgmt;

/**
* 企业担保账户基本信息段 
* 2018-04-28 15:37:03  mengbeibei
*/
public interface AsGuaracctbsinfsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<AsGuaracctbsinfsgmt> getAsGuaracctbsinfsgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param guaracctbsinfsgmt_id 
	* @return
	*/
	public AsGuaracctbsinfsgmt getAsGuaracctbsinfsgmtById(String guaracctbsinfsgmt_id);
	/**
	* 添加
	* @param as_guaracctbsinfsgmt 
	* @return
	*/
	public int addAsGuaracctbsinfsgmt(AsGuaracctbsinfsgmt asGuaracctbsinfsgmt);
	
	
	/**
	* 修改
	* @param as_guaracctbsinfsgmt 
	* @return
	*/
	public int updateAsGuaracctbsinfsgmt(AsGuaracctbsinfsgmt asGuaracctbsinfsgmt);
	/**
	* 修改（根据动态条件）
	* @param as_guaracctbsinfsgmt 
	* @return
	*/
	public int updateAsGuaracctbsinfsgmtBySelective(AsGuaracctbsinfsgmt asGuaracctbsinfsgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delAsGuaracctbsinfsgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param as_guaracctbsinfsgmtList 
	* @return
	*/
	public int addBatchAsGuaracctbsinfsgmt(List<AsGuaracctbsinfsgmt> asGuaracctbsinfsgmtList);
	/**
	* 批量修改
	* @param as_guaracctbsinfsgmtList 
	* @return
	*/
	public int updateBatchAsGuaracctbsinfsgmt(List<AsGuaracctbsinfsgmt> asGuaracctbsinfsgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param as_guaracctbsinfsgmtList 
	* @return
	*/
	public int updateBatchAsGuaracctbsinfsgmtBySelective(List<AsGuaracctbsinfsgmt> asGuaracctbsinfsgmtList);
	
	
	/**
	* 查询历史信息
	*/
	public List<?>  getHisAsListByCondition(Map<String,Object> condition);
}
