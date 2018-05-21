package ccredit.bsmodules.bsdao;
import java.util.List;
import java.util.Map;
import ccredit.bsmodules.bsmodel.BsCotainfsgmt;

/**
* 联系方式 
* 2018-04-26 14:44:28  mengbeibei
*/
public interface BsCotainfsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<BsCotainfsgmt> getBsCotainfsgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param bs_cotainfsgmt_id 
	* @return
	*/
	public BsCotainfsgmt getBsCotainfsgmtById(String bs_cotainfsgmt_id);
	/**
	* 添加
	* @param bs_cotainfsgmt 
	* @return
	*/
	public int addBsCotainfsgmt(BsCotainfsgmt bsCotainfsgmt);
	/**
	* 修改
	* @param bs_cotainfsgmt 
	* @return
	*/
	public int updateBsCotainfsgmt(BsCotainfsgmt bsCotainfsgmt);
	/**
	* 修改（根据动态条件）
	* @param bs_cotainfsgmt 
	* @return
	*/
	public int updateBsCotainfsgmtBySelective(BsCotainfsgmt bsCotainfsgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delBsCotainfsgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param bs_cotainfsgmtList 
	* @return
	*/
	public int addBatchBsCotainfsgmt(List<BsCotainfsgmt> bsCotainfsgmtList);
	/**
	* 批量修改
	* @param bs_cotainfsgmtList 
	* @return
	*/
	public int updateBatchBsCotainfsgmt(List<BsCotainfsgmt> bsCotainfsgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param bs_cotainfsgmtList 
	* @return
	*/
	public int updateBatchBsCotainfsgmtBySelective(List<BsCotainfsgmt> bsCotainfsgmtList);
}
