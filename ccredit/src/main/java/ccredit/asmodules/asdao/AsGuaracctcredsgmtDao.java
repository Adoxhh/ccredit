package ccredit.asmodules.asdao;
import java.util.List;
import java.util.Map;
import ccredit.asmodules.asmodel.AsGuaracctcredsgmt;

/**
* 企业担保账户授信额度息段 
* 2018-04-28 15:43:06  mengbeibei
*/
public interface AsGuaracctcredsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<AsGuaracctcredsgmt> getAsGuaracctcredsgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param guaracctcredsgmt_id 
	* @return
	*/
	public AsGuaracctcredsgmt getAsGuaracctcredsgmtById(String guaracctcredsgmt_id);
	/**
	* 添加
	* @param as_guaracctcredsgmt 
	* @return
	*/
	public int addAsGuaracctcredsgmt(AsGuaracctcredsgmt asGuaracctcredsgmt);
	/**
	* 修改
	* @param as_guaracctcredsgmt 
	* @return
	*/
	public int updateAsGuaracctcredsgmt(AsGuaracctcredsgmt asGuaracctcredsgmt);
	/**
	* 修改（根据动态条件）
	* @param as_guaracctcredsgmt 
	* @return
	*/
	public int updateAsGuaracctcredsgmtBySelective(AsGuaracctcredsgmt asGuaracctcredsgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delAsGuaracctcredsgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param as_guaracctcredsgmtList 
	* @return
	*/
	public int addBatchAsGuaracctcredsgmt(List<AsGuaracctcredsgmt> asGuaracctcredsgmtList);
	/**
	* 批量修改
	* @param as_guaracctcredsgmtList 
	* @return
	*/
	public int updateBatchAsGuaracctcredsgmt(List<AsGuaracctcredsgmt> asGuaracctcredsgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param as_guaracctcredsgmtList 
	* @return
	*/
	public int updateBatchAsGuaracctcredsgmtBySelective(List<AsGuaracctcredsgmt> asGuaracctcredsgmtList);
}
