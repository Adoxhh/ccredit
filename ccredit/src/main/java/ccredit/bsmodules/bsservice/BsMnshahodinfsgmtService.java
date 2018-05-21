package ccredit.bsmodules.bsservice;
import java.util.List;
import java.util.Map;
import ccredit.bsmodules.bsmodel.BsMnshahodinfsgmt;

/**
* 注册资本及主要出资人 
* 2018-04-26 11:28:45  mengbeibei
*/
public interface BsMnshahodinfsgmtService{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<BsMnshahodinfsgmt> getBsMnshahodinfsgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param bs_mnshahodinfsgmt_id 
	* @return
	*/
	public BsMnshahodinfsgmt getBsMnshahodinfsgmtById(String bs_mnshahodinfsgmt_id);
	/**
	* 添加
	* @param bs_mnshahodinfsgmt 
	* @return
	*/
	public int addBsMnshahodinfsgmt(BsMnshahodinfsgmt bsMnshahodinfsgmt);
	/**
	* 修改
	* @param bs_mnshahodinfsgmt 
	* @return
	*/
	public int updateBsMnshahodinfsgmt(BsMnshahodinfsgmt bsMnshahodinfsgmt);
	/**
	* 修改（根据动态条件）
	* @param bs_mnshahodinfsgmt 
	* @return
	*/
	public int updateBsMnshahodinfsgmtBySelective(BsMnshahodinfsgmt bsMnshahodinfsgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delBsMnshahodinfsgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param bs_mnshahodinfsgmtList 
	* @return
	*/
	public int addBatchBsMnshahodinfsgmt(List<BsMnshahodinfsgmt> bsMnshahodinfsgmtList);
	/**
	* 批量修改
	* @param bs_mnshahodinfsgmtList 
	* @return
	*/
	public int updateBatchBsMnshahodinfsgmt(List<BsMnshahodinfsgmt> bsMnshahodinfsgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param bs_mnshahodinfsgmtList 
	* @return
	*/
	public int updateBatchBsMnshahodinfsgmtBySelective(List<BsMnshahodinfsgmt> bsMnshahodinfsgmtList);
}
