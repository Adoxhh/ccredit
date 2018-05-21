package ccredit.finmodules.findao;
import java.util.List;
import java.util.Map;
import ccredit.finmodules.finmodel.Fin2007incomestatementprofitappropriationsgmt;

/**
* 2007版利润及利润分配表 
* 2018-05-03 15:00:09  yangzhou
*/
public interface Fin2007incomestatementprofitappropriationsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<Fin2007incomestatementprofitappropriationsgmt> getFin2007incomestatementprofitappropriationsgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param fin_2007incomestatementprofitappropriationsgmt_id 
	* @return
	*/
	public Fin2007incomestatementprofitappropriationsgmt getFin2007incomestatementprofitappropriationsgmtById(String fin_2007incomestatementprofitappropriationsgmt_id);
	/**
	* 添加
	* @param fin_2007incomestatementprofitappropriationsgmt 
	* @return
	*/
	public int addFin2007incomestatementprofitappropriationsgmt(Fin2007incomestatementprofitappropriationsgmt fin2007incomestatementprofitappropriationsgmt);
	/**
	* 修改
	* @param fin_2007incomestatementprofitappropriationsgmt 
	* @return
	*/
	public int updateFin2007incomestatementprofitappropriationsgmt(Fin2007incomestatementprofitappropriationsgmt fin2007incomestatementprofitappropriationsgmt);
	/**
	* 修改（根据动态条件）
	* @param fin_2007incomestatementprofitappropriationsgmt 
	* @return
	*/
	public int updateFin2007incomestatementprofitappropriationsgmtBySelective(Fin2007incomestatementprofitappropriationsgmt fin2007incomestatementprofitappropriationsgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delFin2007incomestatementprofitappropriationsgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param fin_2007incomestatementprofitappropriationsgmtList 
	* @return
	*/
	public int addBatchFin2007incomestatementprofitappropriationsgmt(List<Fin2007incomestatementprofitappropriationsgmt> fin2007incomestatementprofitappropriationsgmtList);
	/**
	* 批量修改
	* @param fin_2007incomestatementprofitappropriationsgmtList 
	* @return
	*/
	public int updateBatchFin2007incomestatementprofitappropriationsgmt(List<Fin2007incomestatementprofitappropriationsgmt> fin2007incomestatementprofitappropriationsgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param fin_2007incomestatementprofitappropriationsgmtList 
	* @return
	*/
	public int updateBatchFin2007incomestatementprofitappropriationsgmtBySelective(List<Fin2007incomestatementprofitappropriationsgmt> fin2007incomestatementprofitappropriationsgmtList);
}
