package ccredit.finmodules.findao;
import java.util.List;
import java.util.Map;
import ccredit.finmodules.finmodel.Fin2007balancesheetsgmt;

/**
* 2007版资产负债表 
* 2018-05-03 14:56:53  yangzhou
*/
public interface Fin2007balancesheetsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<Fin2007balancesheetsgmt> getFin2007balancesheetsgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param fin_2007BalanceSheetSgmt_id 
	* @return
	*/
	public Fin2007balancesheetsgmt getFin2007balancesheetsgmtById(String fin_2007BalanceSheetSgmt_id);
	/**
	* 添加
	* @param fin_2007balancesheetsgmt 
	* @return
	*/
	public int addFin2007balancesheetsgmt(Fin2007balancesheetsgmt fin2007balancesheetsgmt);
	/**
	* 修改
	* @param fin_2007balancesheetsgmt 
	* @return
	*/
	public int updateFin2007balancesheetsgmt(Fin2007balancesheetsgmt fin2007balancesheetsgmt);
	/**
	* 修改（根据动态条件）
	* @param fin_2007balancesheetsgmt 
	* @return
	*/
	public int updateFin2007balancesheetsgmtBySelective(Fin2007balancesheetsgmt fin2007balancesheetsgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delFin2007balancesheetsgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param fin_2007balancesheetsgmtList 
	* @return
	*/
	public int addBatchFin2007balancesheetsgmt(List<Fin2007balancesheetsgmt> fin2007balancesheetsgmtList);
	/**
	* 批量修改
	* @param fin_2007balancesheetsgmtList 
	* @return
	*/
	public int updateBatchFin2007balancesheetsgmt(List<Fin2007balancesheetsgmt> fin2007balancesheetsgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param fin_2007balancesheetsgmtList 
	* @return
	*/
	public int updateBatchFin2007balancesheetsgmtBySelective(List<Fin2007balancesheetsgmt> fin2007balancesheetsgmtList);
}
