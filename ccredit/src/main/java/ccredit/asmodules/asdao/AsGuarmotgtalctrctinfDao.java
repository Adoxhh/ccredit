package ccredit.asmodules.asdao;
import java.util.List;
import java.util.Map;
import ccredit.asmodules.asmodel.AsGuarmotgtalctrctinf;

/**
* 企业担保账户抵质押物信息段 
* 2018-04-28 15:41:50  mengbeibei
*/
public interface AsGuarmotgtalctrctinfDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<AsGuarmotgtalctrctinf> getAsGuarmotgtalctrctinfListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param guarmotgtalctrctinf_id 
	* @return
	*/
	public AsGuarmotgtalctrctinf getAsGuarmotgtalctrctinfById(String guarmotgtalctrctinf_id);
	/**
	* 添加
	* @param as_guarmotgtalctrctinf 
	* @return
	*/
	public int addAsGuarmotgtalctrctinf(AsGuarmotgtalctrctinf asGuarmotgtalctrctinf);
	/**
	* 修改
	* @param as_guarmotgtalctrctinf 
	* @return
	*/
	public int updateAsGuarmotgtalctrctinf(AsGuarmotgtalctrctinf asGuarmotgtalctrctinf);
	/**
	* 修改（根据动态条件）
	* @param as_guarmotgtalctrctinf 
	* @return
	*/
	public int updateAsGuarmotgtalctrctinfBySelective(AsGuarmotgtalctrctinf asGuarmotgtalctrctinf);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delAsGuarmotgtalctrctinf(Map<String,Object> condition);
	/**
	* 批量添加
	* @param as_guarmotgtalctrctinfList 
	* @return
	*/
	public int addBatchAsGuarmotgtalctrctinf(List<AsGuarmotgtalctrctinf> asGuarmotgtalctrctinfList);
	/**
	* 批量修改
	* @param as_guarmotgtalctrctinfList 
	* @return
	*/
	public int updateBatchAsGuarmotgtalctrctinf(List<AsGuarmotgtalctrctinf> asGuarmotgtalctrctinfList);
	/**
	* 批量修改（根据动态条件）
	* @param as_guarmotgtalctrctinfList 
	* @return
	*/
	public int updateBatchAsGuarmotgtalctrctinfBySelective(List<AsGuarmotgtalctrctinf> asGuarmotgtalctrctinfList);
}
