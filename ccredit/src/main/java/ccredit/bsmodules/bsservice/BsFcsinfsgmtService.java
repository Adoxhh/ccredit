package ccredit.bsmodules.bsservice;
import java.util.List;
import java.util.Map;
import ccredit.bsmodules.bsmodel.BsFcsinfsgmt;

/**
* 基本概况信息 
* 2018-04-26 10:57:16  mengbeibei
*/
public interface BsFcsinfsgmtService{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<BsFcsinfsgmt> getBsFcsinfsgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param bs_fcsinfsgmt_id 
	* @return
	*/
	public BsFcsinfsgmt getBsFcsinfsgmtById(String bs_fcsinfsgmt_id);
	/**
	* 添加
	* @param bs_fcsinfsgmt 
	* @return
	*/
	public int addBsFcsinfsgmt(BsFcsinfsgmt bsFcsinfsgmt);
	/**
	* 修改
	* @param bs_fcsinfsgmt 
	* @return
	*/
	public int updateBsFcsinfsgmt(BsFcsinfsgmt bsFcsinfsgmt);
	/**
	* 修改（根据动态条件）
	* @param bs_fcsinfsgmt 
	* @return
	*/
	public int updateBsFcsinfsgmtBySelective(BsFcsinfsgmt bsFcsinfsgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delBsFcsinfsgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param bs_fcsinfsgmtList 
	* @return
	*/
	public int addBatchBsFcsinfsgmt(List<BsFcsinfsgmt> bsFcsinfsgmtList);
	/**
	* 批量修改
	* @param bs_fcsinfsgmtList 
	* @return
	*/
	public int updateBatchBsFcsinfsgmt(List<BsFcsinfsgmt> bsFcsinfsgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param bs_fcsinfsgmtList 
	* @return
	*/
	public int updateBatchBsFcsinfsgmtBySelective(List<BsFcsinfsgmt> bsFcsinfsgmtList);
}
