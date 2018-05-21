package ccredit.finmodules.findao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.finmodules.findao.Fin2007balancesheetsgmtDao;
import ccredit.finmodules.finmodel.Fin2007balancesheetsgmt;

/**
* 2007版资产负债表 
* 2018-05-03 14:56:53  yangzhou
*/
@Repository("fin2007balancesheetsgmtDao")
public class Fin2007balancesheetsgmtDaoImpl  extends BaseDaoImpl implements Fin2007balancesheetsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<Fin2007balancesheetsgmt> getFin2007balancesheetsgmtListByCondition(Map<String,Object> condition){
		return (List<Fin2007balancesheetsgmt>)this.getList("getFin2007balancesheetsgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param fin_2007BalanceSheetSgmt_id 
	* @return
	*/
	public Fin2007balancesheetsgmt getFin2007balancesheetsgmtById(String fin_2007BalanceSheetSgmt_id){
		return (Fin2007balancesheetsgmt)this.get("getFin2007balancesheetsgmtById", fin_2007BalanceSheetSgmt_id);
	}
	/**
	* 添加
	* @param fin_2007balancesheetsgmt 
	* @return
	*/
	public int addFin2007balancesheetsgmt(Fin2007balancesheetsgmt fin2007balancesheetsgmt){
		return this.add("addFin2007balancesheetsgmt", fin2007balancesheetsgmt);
	}
	/**
	* 修改
	* @param fin_2007balancesheetsgmt 
	* @return
	*/
	public int updateFin2007balancesheetsgmt(Fin2007balancesheetsgmt fin2007balancesheetsgmt){
		return this.update("updateFin2007balancesheetsgmt", fin2007balancesheetsgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param fin_2007balancesheetsgmt 
	* @return
	*/
	public int updateFin2007balancesheetsgmtBySelective(Fin2007balancesheetsgmt fin2007balancesheetsgmt){
		return this.update("updateFin2007balancesheetsgmtBySelective", fin2007balancesheetsgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delFin2007balancesheetsgmt(Map<String,Object> condition){
		return this.del("delFin2007balancesheetsgmt", condition);
	}
	/**
	* 批量添加
	* @param fin_2007balancesheetsgmtList 
	* @return
	*/
	public int addBatchFin2007balancesheetsgmt(List<Fin2007balancesheetsgmt> fin2007balancesheetsgmtList){
		return this.add("addBatchFin2007balancesheetsgmt", fin2007balancesheetsgmtList);
	}
	/**
	* 批量修改
	* @param fin_2007balancesheetsgmtList 
	* @return
	*/
	public int updateBatchFin2007balancesheetsgmt(List<Fin2007balancesheetsgmt> fin2007balancesheetsgmtList){
		return this.update("updateBatchFin2007balancesheetsgmt", fin2007balancesheetsgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param fin_2007balancesheetsgmtList 
	* @return
	*/
	public int updateBatchFin2007balancesheetsgmtBySelective(List<Fin2007balancesheetsgmt> fin2007balancesheetsgmtList){
		return this.update("updateBatchFin2007balancesheetsgmtBySelective", fin2007balancesheetsgmtList);
	}
}
