package ccredit.bsmodules.bsdao;
import java.util.List;
import java.util.Map;
import ccredit.bsmodules.bsmodel.BsEnctfitginf;

/**
* 身份标识整合信息记录 
* 2018-04-26 14:47:45  mengbeibei
*/
public interface BsEnctfitginfDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<BsEnctfitginf> getBsEnctfitginfListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param enctfitginf_id 
	* @return
	*/
	public BsEnctfitginf getBsEnctfitginfById(String enctfitginf_id);
	/**
	* 添加
	* @param bs_enctfitginf 
	* @return
	*/
	public int addBsEnctfitginf(BsEnctfitginf bsEnctfitginf);
	/**
	* 修改
	* @param bs_enctfitginf 
	* @return
	*/
	public int updateBsEnctfitginf(BsEnctfitginf bsEnctfitginf);
	/**
	* 修改（根据动态条件）
	* @param bs_enctfitginf 
	* @return
	*/
	public int updateBsEnctfitginfBySelective(BsEnctfitginf bsEnctfitginf);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delBsEnctfitginf(Map<String,Object> condition);
	/**
	* 批量添加
	* @param bs_enctfitginfList 
	* @return
	*/
	public int addBatchBsEnctfitginf(List<BsEnctfitginf> bsEnctfitginfList);
	/**
	* 批量修改
	* @param bs_enctfitginfList 
	* @return
	*/
	public int updateBatchBsEnctfitginf(List<BsEnctfitginf> bsEnctfitginfList);
	/**
	* 批量修改（根据动态条件）
	* @param bs_enctfitginfList 
	* @return
	*/
	public int updateBatchBsEnctfitginfBySelective(List<BsEnctfitginf> bsEnctfitginfList);
}
