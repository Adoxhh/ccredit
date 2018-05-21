package ccredit.bsmodules.bsservice;
import java.util.List;
import java.util.Map;
import ccredit.bsmodules.bsmodel.BsIdsgmt;

/**
* 其他标识表 
* 2018-04-26 10:26:44  mengbeibei
*/
public interface BsIdsgmtService{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<BsIdsgmt> getBsIdsgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param bs_idsgmt_id 
	* @return
	*/
	public BsIdsgmt getBsIdsgmtById(String bs_idsgmt_id);
	/**
	* 添加
	* @param bs_idsgmt 
	* @return
	*/
	public int addBsIdsgmt(BsIdsgmt bsIdsgmt);
	/**
	* 修改
	* @param bs_idsgmt 
	* @return
	*/
	public int updateBsIdsgmt(BsIdsgmt bsIdsgmt);
	/**
	* 修改（根据动态条件）
	* @param bs_idsgmt 
	* @return
	*/
	public int updateBsIdsgmtBySelective(BsIdsgmt bsIdsgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delBsIdsgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param bs_idsgmtList 
	* @return
	*/
	public int addBatchBsIdsgmt(List<BsIdsgmt> bsIdsgmtList);
	/**
	* 批量修改
	* @param bs_idsgmtList 
	* @return
	*/
	public int updateBatchBsIdsgmt(List<BsIdsgmt> bsIdsgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param bs_idsgmtList 
	* @return
	*/
	public int updateBatchBsIdsgmtBySelective(List<BsIdsgmt> bsIdsgmtList);
}
