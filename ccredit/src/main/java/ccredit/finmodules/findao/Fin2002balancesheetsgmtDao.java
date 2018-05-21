package ccredit.finmodules.findao;
import java.util.List;
import java.util.Map;
import ccredit.finmodules.finmodel.Fin2002balancesheetsgmt;

/**
* 2002版资产负债表 
* 2018-05-03 14:53:26  yangzhou
*/
public interface Fin2002balancesheetsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<Fin2002balancesheetsgmt> getFin2002balancesheetsgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param fin_2002BalanceSheetSgmt_id 
	* @return
	*/
	public Fin2002balancesheetsgmt getFin2002balancesheetsgmtById(String fin_2002BalanceSheetSgmt_id);
	/**
	* 添加
	* @param fin_2002balancesheetsgmt 
	* @return
	*/
	public int addFin2002balancesheetsgmt(Fin2002balancesheetsgmt fin2002balancesheetsgmt);
	/**
	* 修改
	* @param fin_2002balancesheetsgmt 
	* @return
	*/
	public int updateFin2002balancesheetsgmt(Fin2002balancesheetsgmt fin2002balancesheetsgmt);
	/**
	* 修改（根据动态条件）
	* @param fin_2002balancesheetsgmt 
	* @return
	*/
	public int updateFin2002balancesheetsgmtBySelective(Fin2002balancesheetsgmt fin2002balancesheetsgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delFin2002balancesheetsgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param fin_2002balancesheetsgmtList 
	* @return
	*/
	public int addBatchFin2002balancesheetsgmt(List<Fin2002balancesheetsgmt> fin2002balancesheetsgmtList);
	/**
	* 批量修改
	* @param fin_2002balancesheetsgmtList 
	* @return
	*/
	public int updateBatchFin2002balancesheetsgmt(List<Fin2002balancesheetsgmt> fin2002balancesheetsgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param fin_2002balancesheetsgmtList 
	* @return
	*/
	public int updateBatchFin2002balancesheetsgmtBySelective(List<Fin2002balancesheetsgmt> fin2002balancesheetsgmtList);
}
