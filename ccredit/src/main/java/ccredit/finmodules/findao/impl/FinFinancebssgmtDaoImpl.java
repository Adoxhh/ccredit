package ccredit.finmodules.findao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.finmodules.findao.FinFinancebssgmtDao;
import ccredit.finmodules.finmodel.FinFinancebssgmt;

/**
* 财务报表信息记录基础段 
* 2018-05-03 15:02:51  yangzhou
*/
@Repository("finFinancebssgmtDao")
public class FinFinancebssgmtDaoImpl  extends BaseDaoImpl implements FinFinancebssgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<FinFinancebssgmt> getFinFinancebssgmtListByCondition(Map<String,Object> condition){
		return (List<FinFinancebssgmt>)this.getList("getFinFinancebssgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param fin_financebssgmt_id 
	* @return
	*/
	public FinFinancebssgmt getFinFinancebssgmtById(String fin_financebssgmt_id){
		return (FinFinancebssgmt)this.get("getFinFinancebssgmtById", fin_financebssgmt_id);
	}
	/**
	* 添加
	* @param fin_financebssgmt 
	* @return
	*/
	public int addFinFinancebssgmt(FinFinancebssgmt finFinancebssgmt){
		return this.add("addFinFinancebssgmt", finFinancebssgmt);
	}
	/**
	* 修改
	* @param fin_financebssgmt 
	* @return
	*/
	public int updateFinFinancebssgmt(FinFinancebssgmt finFinancebssgmt){
		return this.update("updateFinFinancebssgmt", finFinancebssgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param fin_financebssgmt 
	* @return
	*/
	public int updateFinFinancebssgmtBySelective(FinFinancebssgmt finFinancebssgmt){
		return this.update("updateFinFinancebssgmtBySelective", finFinancebssgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delFinFinancebssgmt(Map<String,Object> condition){
		return this.del("delFinFinancebssgmt", condition);
	}
	/**
	* 批量添加
	* @param fin_financebssgmtList 
	* @return
	*/
	public int addBatchFinFinancebssgmt(List<FinFinancebssgmt> finFinancebssgmtList){
		return this.add("addBatchFinFinancebssgmt", finFinancebssgmtList);
	}
	/**
	* 批量修改
	* @param fin_financebssgmtList 
	* @return
	*/
	public int updateBatchFinFinancebssgmt(List<FinFinancebssgmt> finFinancebssgmtList){
		return this.update("updateBatchFinFinancebssgmt", finFinancebssgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param fin_financebssgmtList 
	* @return
	*/
	public int updateBatchFinFinancebssgmtBySelective(List<FinFinancebssgmt> finFinancebssgmtList){
		return this.update("updateBatchFinFinancebssgmtBySelective", finFinancebssgmtList);
	}
}
