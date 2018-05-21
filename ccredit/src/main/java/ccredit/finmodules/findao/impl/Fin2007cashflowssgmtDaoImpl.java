package ccredit.finmodules.findao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.finmodules.findao.Fin2007cashflowssgmtDao;
import ccredit.finmodules.finmodel.Fin2007cashflowssgmt;

/**
* 2007版现金流量表 
* 2018-05-03 14:58:47  yangzhou
*/
@Repository("fin2007cashflowssgmtDao")
public class Fin2007cashflowssgmtDaoImpl  extends BaseDaoImpl implements Fin2007cashflowssgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<Fin2007cashflowssgmt> getFin2007cashflowssgmtListByCondition(Map<String,Object> condition){
		return (List<Fin2007cashflowssgmt>)this.getList("getFin2007cashflowssgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param fin_2007cashflowssgmt_id 
	* @return
	*/
	public Fin2007cashflowssgmt getFin2007cashflowssgmtById(String fin_2007cashflowssgmt_id){
		return (Fin2007cashflowssgmt)this.get("getFin2007cashflowssgmtById", fin_2007cashflowssgmt_id);
	}
	/**
	* 添加
	* @param fin_2007cashflowssgmt 
	* @return
	*/
	public int addFin2007cashflowssgmt(Fin2007cashflowssgmt fin2007cashflowssgmt){
		return this.add("addFin2007cashflowssgmt", fin2007cashflowssgmt);
	}
	/**
	* 修改
	* @param fin_2007cashflowssgmt 
	* @return
	*/
	public int updateFin2007cashflowssgmt(Fin2007cashflowssgmt fin2007cashflowssgmt){
		return this.update("updateFin2007cashflowssgmt", fin2007cashflowssgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param fin_2007cashflowssgmt 
	* @return
	*/
	public int updateFin2007cashflowssgmtBySelective(Fin2007cashflowssgmt fin2007cashflowssgmt){
		return this.update("updateFin2007cashflowssgmtBySelective", fin2007cashflowssgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delFin2007cashflowssgmt(Map<String,Object> condition){
		return this.del("delFin2007cashflowssgmt", condition);
	}
	/**
	* 批量添加
	* @param fin_2007cashflowssgmtList 
	* @return
	*/
	public int addBatchFin2007cashflowssgmt(List<Fin2007cashflowssgmt> fin2007cashflowssgmtList){
		return this.add("addBatchFin2007cashflowssgmt", fin2007cashflowssgmtList);
	}
	/**
	* 批量修改
	* @param fin_2007cashflowssgmtList 
	* @return
	*/
	public int updateBatchFin2007cashflowssgmt(List<Fin2007cashflowssgmt> fin2007cashflowssgmtList){
		return this.update("updateBatchFin2007cashflowssgmt", fin2007cashflowssgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param fin_2007cashflowssgmtList 
	* @return
	*/
	public int updateBatchFin2007cashflowssgmtBySelective(List<Fin2007cashflowssgmt> fin2007cashflowssgmtList){
		return this.update("updateBatchFin2007cashflowssgmtBySelective", fin2007cashflowssgmtList);
	}
}
