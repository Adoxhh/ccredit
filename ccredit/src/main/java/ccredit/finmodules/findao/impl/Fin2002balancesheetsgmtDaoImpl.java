package ccredit.finmodules.findao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.finmodules.findao.Fin2002balancesheetsgmtDao;
import ccredit.finmodules.finmodel.Fin2002balancesheetsgmt;

/**
* 2002版资产负债表 
* 2018-05-03 14:53:26  yangzhou
*/
@Repository("fin2002balancesheetsgmtDao")
public class Fin2002balancesheetsgmtDaoImpl  extends BaseDaoImpl implements Fin2002balancesheetsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<Fin2002balancesheetsgmt> getFin2002balancesheetsgmtListByCondition(Map<String,Object> condition){
		return (List<Fin2002balancesheetsgmt>)this.getList("getFin2002balancesheetsgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param fin_2002BalanceSheetSgmt_id 
	* @return
	*/
	public Fin2002balancesheetsgmt getFin2002balancesheetsgmtById(String fin_2002BalanceSheetSgmt_id){
		return (Fin2002balancesheetsgmt)this.get("getFin2002balancesheetsgmtById", fin_2002BalanceSheetSgmt_id);
	}
	/**
	* 添加
	* @param fin_2002balancesheetsgmt 
	* @return
	*/
	public int addFin2002balancesheetsgmt(Fin2002balancesheetsgmt fin2002balancesheetsgmt){
		return this.add("addFin2002balancesheetsgmt", fin2002balancesheetsgmt);
	}
	/**
	* 修改
	* @param fin_2002balancesheetsgmt 
	* @return
	*/
	public int updateFin2002balancesheetsgmt(Fin2002balancesheetsgmt fin2002balancesheetsgmt){
		return this.update("updateFin2002balancesheetsgmt", fin2002balancesheetsgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param fin_2002balancesheetsgmt 
	* @return
	*/
	public int updateFin2002balancesheetsgmtBySelective(Fin2002balancesheetsgmt fin2002balancesheetsgmt){
		return this.update("updateFin2002balancesheetsgmtBySelective", fin2002balancesheetsgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delFin2002balancesheetsgmt(Map<String,Object> condition){
		return this.del("delFin2002balancesheetsgmt", condition);
	}
	/**
	* 批量添加
	* @param fin_2002balancesheetsgmtList 
	* @return
	*/
	public int addBatchFin2002balancesheetsgmt(List<Fin2002balancesheetsgmt> fin2002balancesheetsgmtList){
		return this.add("addBatchFin2002balancesheetsgmt", fin2002balancesheetsgmtList);
	}
	/**
	* 批量修改
	* @param fin_2002balancesheetsgmtList 
	* @return
	*/
	public int updateBatchFin2002balancesheetsgmt(List<Fin2002balancesheetsgmt> fin2002balancesheetsgmtList){
		return this.update("updateBatchFin2002balancesheetsgmt", fin2002balancesheetsgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param fin_2002balancesheetsgmtList 
	* @return
	*/
	public int updateBatchFin2002balancesheetsgmtBySelective(List<Fin2002balancesheetsgmt> fin2002balancesheetsgmtList){
		return this.update("updateBatchFin2002balancesheetsgmtBySelective", fin2002balancesheetsgmtList);
	}
}
