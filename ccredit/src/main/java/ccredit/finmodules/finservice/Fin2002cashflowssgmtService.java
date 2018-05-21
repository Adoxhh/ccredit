package ccredit.finmodules.finservice;
import java.util.List;
import java.util.Map;
import ccredit.finmodules.finmodel.Fin2002cashflowssgmt;

/**
* 2002版现金流量表 
* 2018-05-03 14:54:38  yangzhou
*/
public interface Fin2002cashflowssgmtService{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<Fin2002cashflowssgmt> getFin2002cashflowssgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param fin_2002cashflowssgmt_id 
	* @return
	*/
	public Fin2002cashflowssgmt getFin2002cashflowssgmtById(String fin_2002cashflowssgmt_id);
	/**
	* 添加
	* @param fin_2002cashflowssgmt 
	* @return
	*/
	public int addFin2002cashflowssgmt(Fin2002cashflowssgmt fin2002cashflowssgmt);
	/**
	* 修改
	* @param fin_2002cashflowssgmt 
	* @return
	*/
	public int updateFin2002cashflowssgmt(Fin2002cashflowssgmt fin2002cashflowssgmt);
	/**
	* 修改（根据动态条件）
	* @param fin_2002cashflowssgmt 
	* @return
	*/
	public int updateFin2002cashflowssgmtBySelective(Fin2002cashflowssgmt fin2002cashflowssgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delFin2002cashflowssgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param fin_2002cashflowssgmtList 
	* @return
	*/
	public int addBatchFin2002cashflowssgmt(List<Fin2002cashflowssgmt> fin2002cashflowssgmtList);
	/**
	* 批量修改
	* @param fin_2002cashflowssgmtList 
	* @return
	*/
	public int updateBatchFin2002cashflowssgmt(List<Fin2002cashflowssgmt> fin2002cashflowssgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param fin_2002cashflowssgmtList 
	* @return
	*/
	public int updateBatchFin2002cashflowssgmtBySelective(List<Fin2002cashflowssgmt> fin2002cashflowssgmtList);
}
