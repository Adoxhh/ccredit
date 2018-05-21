package ccredit.bsmodules.bsdao;
import java.util.List;
import java.util.Map;
import ccredit.bsmodules.bsmodel.BsBssgmt;

/**
* 企业基本信息基础段 
* 2018-04-26 09:58:53  mengbeibei
*/
public interface BsBssgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<BsBssgmt> getBsBssgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param bssgmt_id 
	* @return
	*/
	public BsBssgmt getBsBssgmtById(String bssgmt_id);
	/**
	* 添加
	* @param bs_bssgmt 
	* @return
	*/
	public int addBsBssgmt(BsBssgmt bsBssgmt);
	/**
	* 修改
	* @param bs_bssgmt 
	* @return
	*/
	public int updateBsBssgmt(BsBssgmt bsBssgmt);
	/**
	* 修改（根据动态条件）
	* @param bs_bssgmt 
	* @return
	*/
	public int updateBsBssgmtBySelective(BsBssgmt bsBssgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delBsBssgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param bs_bssgmtList 
	* @return
	*/
	public int addBatchBsBssgmt(List<BsBssgmt> bsBssgmtList);
	/**
	* 批量修改
	* @param bs_bssgmtList 
	* @return
	*/
	public int updateBatchBsBssgmt(List<BsBssgmt> bsBssgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param bs_bssgmtList 
	* @return
	*/
	public int updateBatchBsBssgmtBySelective(List<BsBssgmt> bsBssgmtList);
	
	/**
	* 查询历史信息
	*/
	public List<?>  getHisBsListByCondition(Map<String,Object> condition);
}
