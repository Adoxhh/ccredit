package ccredit.finmodules.findao;
import java.util.List;
import java.util.Map;
import ccredit.finmodules.finmodel.FinInstitutionbalancesheetsgmt;

/**
* 事业单位资产负债表 
* 2018-05-03 15:05:22  yangzhou
*/
public interface FinInstitutionbalancesheetsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<FinInstitutionbalancesheetsgmt> getFinInstitutionbalancesheetsgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param fin_institutionbalancesheetsgmt_id 
	* @return
	*/
	public FinInstitutionbalancesheetsgmt getFinInstitutionbalancesheetsgmtById(String fin_institutionbalancesheetsgmt_id);
	/**
	* 添加
	* @param fin_institutionbalancesheetsgmt 
	* @return
	*/
	public int addFinInstitutionbalancesheetsgmt(FinInstitutionbalancesheetsgmt finInstitutionbalancesheetsgmt);
	/**
	* 修改
	* @param fin_institutionbalancesheetsgmt 
	* @return
	*/
	public int updateFinInstitutionbalancesheetsgmt(FinInstitutionbalancesheetsgmt finInstitutionbalancesheetsgmt);
	/**
	* 修改（根据动态条件）
	* @param fin_institutionbalancesheetsgmt 
	* @return
	*/
	public int updateFinInstitutionbalancesheetsgmtBySelective(FinInstitutionbalancesheetsgmt finInstitutionbalancesheetsgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delFinInstitutionbalancesheetsgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param fin_institutionbalancesheetsgmtList 
	* @return
	*/
	public int addBatchFinInstitutionbalancesheetsgmt(List<FinInstitutionbalancesheetsgmt> finInstitutionbalancesheetsgmtList);
	/**
	* 批量修改
	* @param fin_institutionbalancesheetsgmtList 
	* @return
	*/
	public int updateBatchFinInstitutionbalancesheetsgmt(List<FinInstitutionbalancesheetsgmt> finInstitutionbalancesheetsgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param fin_institutionbalancesheetsgmtList 
	* @return
	*/
	public int updateBatchFinInstitutionbalancesheetsgmtBySelective(List<FinInstitutionbalancesheetsgmt> finInstitutionbalancesheetsgmtList);
}
