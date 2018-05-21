package ccredit.asmodules.asdao;
import java.util.List;
import java.util.Map;
import ccredit.asmodules.asmodel.AsGuarrltrepymtinf;

/**
* 企业担保账户在保责任信息段 
* 2018-04-28 15:46:18  mengbeibei
*/
public interface AsGuarrltrepymtinfDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<AsGuarrltrepymtinf> getAsGuarrltrepymtinfListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param guarrltrepymtinf_id 
	* @return
	*/
	public AsGuarrltrepymtinf getAsGuarrltrepymtinfById(String guarrltrepymtinf_id);
	/**
	* 添加
	* @param as_guarrltrepymtinf 
	* @return
	*/
	public int addAsGuarrltrepymtinf(AsGuarrltrepymtinf asGuarrltrepymtinf);
	/**
	* 修改
	* @param as_guarrltrepymtinf 
	* @return
	*/
	public int updateAsGuarrltrepymtinf(AsGuarrltrepymtinf asGuarrltrepymtinf);
	/**
	* 修改（根据动态条件）
	* @param as_guarrltrepymtinf 
	* @return
	*/
	public int updateAsGuarrltrepymtinfBySelective(AsGuarrltrepymtinf asGuarrltrepymtinf);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delAsGuarrltrepymtinf(Map<String,Object> condition);
	/**
	* 批量添加
	* @param as_guarrltrepymtinfList 
	* @return
	*/
	public int addBatchAsGuarrltrepymtinf(List<AsGuarrltrepymtinf> asGuarrltrepymtinfList);
	/**
	* 批量修改
	* @param as_guarrltrepymtinfList 
	* @return
	*/
	public int updateBatchAsGuarrltrepymtinf(List<AsGuarrltrepymtinf> asGuarrltrepymtinfList);
	/**
	* 批量修改（根据动态条件）
	* @param as_guarrltrepymtinfList 
	* @return
	*/
	public int updateBatchAsGuarrltrepymtinfBySelective(List<AsGuarrltrepymtinf> asGuarrltrepymtinfList);
}
