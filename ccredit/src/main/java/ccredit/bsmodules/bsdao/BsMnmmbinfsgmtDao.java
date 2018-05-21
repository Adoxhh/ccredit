package ccredit.bsmodules.bsdao;
import java.util.List;
import java.util.Map;
import ccredit.bsmodules.bsmodel.BsMnmmbinfsgmt;

/**
* 主要组成人员 
* 2018-04-26 11:18:18  mengbeibei
*/
public interface BsMnmmbinfsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<BsMnmmbinfsgmt> getBsMnmmbinfsgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param bs_mnmmbinfsgmt_id 
	* @return
	*/
	public BsMnmmbinfsgmt getBsMnmmbinfsgmtById(String bs_mnmmbinfsgmt_id);
	/**
	* 添加
	* @param bs_mnmmbinfsgmt 
	* @return
	*/
	public int addBsMnmmbinfsgmt(BsMnmmbinfsgmt bsMnmmbinfsgmt);
	/**
	* 修改
	* @param bs_mnmmbinfsgmt 
	* @return
	*/
	public int updateBsMnmmbinfsgmt(BsMnmmbinfsgmt bsMnmmbinfsgmt);
	/**
	* 修改（根据动态条件）
	* @param bs_mnmmbinfsgmt 
	* @return
	*/
	public int updateBsMnmmbinfsgmtBySelective(BsMnmmbinfsgmt bsMnmmbinfsgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delBsMnmmbinfsgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param bs_mnmmbinfsgmtList 
	* @return
	*/
	public int addBatchBsMnmmbinfsgmt(List<BsMnmmbinfsgmt> bsMnmmbinfsgmtList);
	/**
	* 批量修改
	* @param bs_mnmmbinfsgmtList 
	* @return
	*/
	public int updateBatchBsMnmmbinfsgmt(List<BsMnmmbinfsgmt> bsMnmmbinfsgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param bs_mnmmbinfsgmtList 
	* @return
	*/
	public int updateBatchBsMnmmbinfsgmtBySelective(List<BsMnmmbinfsgmt> bsMnmmbinfsgmtList);
}
