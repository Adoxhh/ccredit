package ccredit.finmodules.finservice;
import java.util.List;
import java.util.Map;
import ccredit.finmodules.finmodel.FinIncomeandexpensestatementsgmt;

/**
* 事业单位收入支出表 
* 2018-05-03 15:04:06  yangzhou
*/
public interface FinIncomeandexpensestatementsgmtService{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<FinIncomeandexpensestatementsgmt> getFinIncomeandexpensestatementsgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param fin_incomeandexpensestatementsgmt_id 
	* @return
	*/
	public FinIncomeandexpensestatementsgmt getFinIncomeandexpensestatementsgmtById(String fin_incomeandexpensestatementsgmt_id);
	/**
	* 添加
	* @param fin_incomeandexpensestatementsgmt 
	* @return
	*/
	public int addFinIncomeandexpensestatementsgmt(FinIncomeandexpensestatementsgmt finIncomeandexpensestatementsgmt);
	/**
	* 修改
	* @param fin_incomeandexpensestatementsgmt 
	* @return
	*/
	public int updateFinIncomeandexpensestatementsgmt(FinIncomeandexpensestatementsgmt finIncomeandexpensestatementsgmt);
	/**
	* 修改（根据动态条件）
	* @param fin_incomeandexpensestatementsgmt 
	* @return
	*/
	public int updateFinIncomeandexpensestatementsgmtBySelective(FinIncomeandexpensestatementsgmt finIncomeandexpensestatementsgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delFinIncomeandexpensestatementsgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param fin_incomeandexpensestatementsgmtList 
	* @return
	*/
	public int addBatchFinIncomeandexpensestatementsgmt(List<FinIncomeandexpensestatementsgmt> finIncomeandexpensestatementsgmtList);
	/**
	* 批量修改
	* @param fin_incomeandexpensestatementsgmtList 
	* @return
	*/
	public int updateBatchFinIncomeandexpensestatementsgmt(List<FinIncomeandexpensestatementsgmt> finIncomeandexpensestatementsgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param fin_incomeandexpensestatementsgmtList 
	* @return
	*/
	public int updateBatchFinIncomeandexpensestatementsgmtBySelective(List<FinIncomeandexpensestatementsgmt> finIncomeandexpensestatementsgmtList);
}
