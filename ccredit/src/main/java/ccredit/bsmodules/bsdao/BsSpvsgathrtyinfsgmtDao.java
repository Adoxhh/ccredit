package ccredit.bsmodules.bsdao;
import java.util.List;
import java.util.Map;
import ccredit.bsmodules.bsmodel.BsSpvsgathrtyinfsgmt;

/**
* 上级机构 
* 2018-04-26 14:42:34  mengbeibei
*/
public interface BsSpvsgathrtyinfsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<BsSpvsgathrtyinfsgmt> getBsSpvsgathrtyinfsgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param bs_spvsgathrtyinfsgmt_id 
	* @return
	*/
	public BsSpvsgathrtyinfsgmt getBsSpvsgathrtyinfsgmtById(String bs_spvsgathrtyinfsgmt_id);
	/**
	* 添加
	* @param bs_spvsgathrtyinfsgmt 
	* @return
	*/
	public int addBsSpvsgathrtyinfsgmt(BsSpvsgathrtyinfsgmt bsSpvsgathrtyinfsgmt);
	/**
	* 修改
	* @param bs_spvsgathrtyinfsgmt 
	* @return
	*/
	public int updateBsSpvsgathrtyinfsgmt(BsSpvsgathrtyinfsgmt bsSpvsgathrtyinfsgmt);
	/**
	* 修改（根据动态条件）
	* @param bs_spvsgathrtyinfsgmt 
	* @return
	*/
	public int updateBsSpvsgathrtyinfsgmtBySelective(BsSpvsgathrtyinfsgmt bsSpvsgathrtyinfsgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delBsSpvsgathrtyinfsgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param bs_spvsgathrtyinfsgmtList 
	* @return
	*/
	public int addBatchBsSpvsgathrtyinfsgmt(List<BsSpvsgathrtyinfsgmt> bsSpvsgathrtyinfsgmtList);
	/**
	* 批量修改
	* @param bs_spvsgathrtyinfsgmtList 
	* @return
	*/
	public int updateBatchBsSpvsgathrtyinfsgmt(List<BsSpvsgathrtyinfsgmt> bsSpvsgathrtyinfsgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param bs_spvsgathrtyinfsgmtList 
	* @return
	*/
	public int updateBatchBsSpvsgathrtyinfsgmtBySelective(List<BsSpvsgathrtyinfsgmt> bsSpvsgathrtyinfsgmtList);
}
