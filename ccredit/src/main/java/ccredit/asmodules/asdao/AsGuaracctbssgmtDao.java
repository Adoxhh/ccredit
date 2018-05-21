package ccredit.asmodules.asdao;
import java.util.List;
import java.util.Map;
import ccredit.asmodules.asmodel.AsGuaracctbssgmt;

/**
* as_guaracctbssgmt 
* 2018-04-27 15:41:57  mengbeibei
*/
public interface AsGuaracctbssgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<AsGuaracctbssgmt> getAsGuaracctbssgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param guaracctbssgmt_id 
	* @return
	*/
	public AsGuaracctbssgmt getAsGuaracctbssgmtById(String guaracctbssgmt_id);
	/**
	* 添加
	* @param as_guaracctbssgmt 
	* @return
	*/
	public int addAsGuaracctbssgmt(AsGuaracctbssgmt asGuaracctbssgmt);
	/**
	* 修改
	* @param as_guaracctbssgmt 
	* @return
	*/
	public int updateAsGuaracctbssgmt(AsGuaracctbssgmt asGuaracctbssgmt);
	/**
	* 修改（根据动态条件）
	* @param as_guaracctbssgmt 
	* @return
	*/
	public int updateAsGuaracctbssgmtBySelective(AsGuaracctbssgmt asGuaracctbssgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delAsGuaracctbssgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param as_guaracctbssgmtList 
	* @return
	*/
	public int addBatchAsGuaracctbssgmt(List<AsGuaracctbssgmt> asGuaracctbssgmtList);
	/**
	* 批量修改
	* @param as_guaracctbssgmtList 
	* @return
	*/
	public int updateBatchAsGuaracctbssgmt(List<AsGuaracctbssgmt> asGuaracctbssgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param as_guaracctbssgmtList 
	* @return
	*/
	public int updateBatchAsGuaracctbssgmtBySelective(List<AsGuaracctbssgmt> asGuaracctbssgmtList);
}
