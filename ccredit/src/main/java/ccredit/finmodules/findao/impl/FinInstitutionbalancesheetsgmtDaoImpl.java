package ccredit.finmodules.findao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.finmodules.findao.FinInstitutionbalancesheetsgmtDao;
import ccredit.finmodules.finmodel.FinInstitutionbalancesheetsgmt;

/**
* 事业单位资产负债表 
* 2018-05-03 15:05:22  yangzhou
*/
@Repository("finInstitutionbalancesheetsgmtDao")
public class FinInstitutionbalancesheetsgmtDaoImpl  extends BaseDaoImpl implements FinInstitutionbalancesheetsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<FinInstitutionbalancesheetsgmt> getFinInstitutionbalancesheetsgmtListByCondition(Map<String,Object> condition){
		return (List<FinInstitutionbalancesheetsgmt>)this.getList("getFinInstitutionbalancesheetsgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param fin_institutionbalancesheetsgmt_id 
	* @return
	*/
	public FinInstitutionbalancesheetsgmt getFinInstitutionbalancesheetsgmtById(String fin_institutionbalancesheetsgmt_id){
		return (FinInstitutionbalancesheetsgmt)this.get("getFinInstitutionbalancesheetsgmtById", fin_institutionbalancesheetsgmt_id);
	}
	/**
	* 添加
	* @param fin_institutionbalancesheetsgmt 
	* @return
	*/
	public int addFinInstitutionbalancesheetsgmt(FinInstitutionbalancesheetsgmt finInstitutionbalancesheetsgmt){
		return this.add("addFinInstitutionbalancesheetsgmt", finInstitutionbalancesheetsgmt);
	}
	/**
	* 修改
	* @param fin_institutionbalancesheetsgmt 
	* @return
	*/
	public int updateFinInstitutionbalancesheetsgmt(FinInstitutionbalancesheetsgmt finInstitutionbalancesheetsgmt){
		return this.update("updateFinInstitutionbalancesheetsgmt", finInstitutionbalancesheetsgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param fin_institutionbalancesheetsgmt 
	* @return
	*/
	public int updateFinInstitutionbalancesheetsgmtBySelective(FinInstitutionbalancesheetsgmt finInstitutionbalancesheetsgmt){
		return this.update("updateFinInstitutionbalancesheetsgmtBySelective", finInstitutionbalancesheetsgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delFinInstitutionbalancesheetsgmt(Map<String,Object> condition){
		return this.del("delFinInstitutionbalancesheetsgmt", condition);
	}
	/**
	* 批量添加
	* @param fin_institutionbalancesheetsgmtList 
	* @return
	*/
	public int addBatchFinInstitutionbalancesheetsgmt(List<FinInstitutionbalancesheetsgmt> finInstitutionbalancesheetsgmtList){
		return this.add("addBatchFinInstitutionbalancesheetsgmt", finInstitutionbalancesheetsgmtList);
	}
	/**
	* 批量修改
	* @param fin_institutionbalancesheetsgmtList 
	* @return
	*/
	public int updateBatchFinInstitutionbalancesheetsgmt(List<FinInstitutionbalancesheetsgmt> finInstitutionbalancesheetsgmtList){
		return this.update("updateBatchFinInstitutionbalancesheetsgmt", finInstitutionbalancesheetsgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param fin_institutionbalancesheetsgmtList 
	* @return
	*/
	public int updateBatchFinInstitutionbalancesheetsgmtBySelective(List<FinInstitutionbalancesheetsgmt> finInstitutionbalancesheetsgmtList){
		return this.update("updateBatchFinInstitutionbalancesheetsgmtBySelective", finInstitutionbalancesheetsgmtList);
	}
}
