package ccredit.finmodules.findao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.finmodules.findao.FinIncomeandexpensestatementsgmtDao;
import ccredit.finmodules.finmodel.FinIncomeandexpensestatementsgmt;

/**
* 事业单位收入支出表 
* 2018-05-03 15:04:06  yangzhou
*/
@Repository("finIncomeandexpensestatementsgmtDao")
public class FinIncomeandexpensestatementsgmtDaoImpl  extends BaseDaoImpl implements FinIncomeandexpensestatementsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<FinIncomeandexpensestatementsgmt> getFinIncomeandexpensestatementsgmtListByCondition(Map<String,Object> condition){
		return (List<FinIncomeandexpensestatementsgmt>)this.getList("getFinIncomeandexpensestatementsgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param fin_incomeandexpensestatementsgmt_id 
	* @return
	*/
	public FinIncomeandexpensestatementsgmt getFinIncomeandexpensestatementsgmtById(String fin_incomeandexpensestatementsgmt_id){
		return (FinIncomeandexpensestatementsgmt)this.get("getFinIncomeandexpensestatementsgmtById", fin_incomeandexpensestatementsgmt_id);
	}
	/**
	* 添加
	* @param fin_incomeandexpensestatementsgmt 
	* @return
	*/
	public int addFinIncomeandexpensestatementsgmt(FinIncomeandexpensestatementsgmt finIncomeandexpensestatementsgmt){
		return this.add("addFinIncomeandexpensestatementsgmt", finIncomeandexpensestatementsgmt);
	}
	/**
	* 修改
	* @param fin_incomeandexpensestatementsgmt 
	* @return
	*/
	public int updateFinIncomeandexpensestatementsgmt(FinIncomeandexpensestatementsgmt finIncomeandexpensestatementsgmt){
		return this.update("updateFinIncomeandexpensestatementsgmt", finIncomeandexpensestatementsgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param fin_incomeandexpensestatementsgmt 
	* @return
	*/
	public int updateFinIncomeandexpensestatementsgmtBySelective(FinIncomeandexpensestatementsgmt finIncomeandexpensestatementsgmt){
		return this.update("updateFinIncomeandexpensestatementsgmtBySelective", finIncomeandexpensestatementsgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delFinIncomeandexpensestatementsgmt(Map<String,Object> condition){
		return this.del("delFinIncomeandexpensestatementsgmt", condition);
	}
	/**
	* 批量添加
	* @param fin_incomeandexpensestatementsgmtList 
	* @return
	*/
	public int addBatchFinIncomeandexpensestatementsgmt(List<FinIncomeandexpensestatementsgmt> finIncomeandexpensestatementsgmtList){
		return this.add("addBatchFinIncomeandexpensestatementsgmt", finIncomeandexpensestatementsgmtList);
	}
	/**
	* 批量修改
	* @param fin_incomeandexpensestatementsgmtList 
	* @return
	*/
	public int updateBatchFinIncomeandexpensestatementsgmt(List<FinIncomeandexpensestatementsgmt> finIncomeandexpensestatementsgmtList){
		return this.update("updateBatchFinIncomeandexpensestatementsgmt", finIncomeandexpensestatementsgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param fin_incomeandexpensestatementsgmtList 
	* @return
	*/
	public int updateBatchFinIncomeandexpensestatementsgmtBySelective(List<FinIncomeandexpensestatementsgmt> finIncomeandexpensestatementsgmtList){
		return this.update("updateBatchFinIncomeandexpensestatementsgmtBySelective", finIncomeandexpensestatementsgmtList);
	}
}
