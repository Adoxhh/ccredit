package ccredit.finmodules.finservice;
import java.util.List;
import java.util.Map;
import ccredit.finmodules.finmodel.FinFinancebssgmt;

/**
* 财务报表信息记录基础段 
* 2018-05-03 15:02:51  yangzhou
*/
public interface FinFinancebssgmtService{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<FinFinancebssgmt> getFinFinancebssgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param fin_financebssgmt_id 
	* @return
	*/
	public FinFinancebssgmt getFinFinancebssgmtById(String fin_financebssgmt_id);
	/**
	* 添加
	* @param fin_financebssgmt 
	* @return
	*/
	public int addFinFinancebssgmt(FinFinancebssgmt finFinancebssgmt);
	/**
	* 修改
	* @param fin_financebssgmt 
	* @return
	*/
	public int updateFinFinancebssgmt(FinFinancebssgmt finFinancebssgmt);
	/**
	* 修改（根据动态条件）
	* @param fin_financebssgmt 
	* @return
	*/
	public int updateFinFinancebssgmtBySelective(FinFinancebssgmt finFinancebssgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delFinFinancebssgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param fin_financebssgmtList 
	* @return
	*/
	public int addBatchFinFinancebssgmt(List<FinFinancebssgmt> finFinancebssgmtList);
	/**
	* 批量修改
	* @param fin_financebssgmtList 
	* @return
	*/
	public int updateBatchFinFinancebssgmt(List<FinFinancebssgmt> finFinancebssgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param fin_financebssgmtList 
	* @return
	*/
	public int updateBatchFinFinancebssgmtBySelective(List<FinFinancebssgmt> finFinancebssgmtList);
}
