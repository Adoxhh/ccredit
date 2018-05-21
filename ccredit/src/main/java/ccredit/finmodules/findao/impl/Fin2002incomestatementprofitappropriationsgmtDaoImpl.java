package ccredit.finmodules.findao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.finmodules.findao.Fin2002incomestatementprofitappropriationsgmtDao;
import ccredit.finmodules.finmodel.Fin2002incomestatementprofitappropriationsgmt;

/**
* 2002版利润及利润分配表 
* 2018-05-03 14:55:47  yangzhou
*/
@Repository("fin2002incomestatementprofitappropriationsgmtDao")
public class Fin2002incomestatementprofitappropriationsgmtDaoImpl  extends BaseDaoImpl implements Fin2002incomestatementprofitappropriationsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<Fin2002incomestatementprofitappropriationsgmt> getFin2002incomestatementprofitappropriationsgmtListByCondition(Map<String,Object> condition){
		return (List<Fin2002incomestatementprofitappropriationsgmt>)this.getList("getFin2002incomestatementprofitappropriationsgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param fin_2002incomestatementprofitappropriationsgmt_id 
	* @return
	*/
	public Fin2002incomestatementprofitappropriationsgmt getFin2002incomestatementprofitappropriationsgmtById(String fin_2002incomestatementprofitappropriationsgmt_id){
		return (Fin2002incomestatementprofitappropriationsgmt)this.get("getFin2002incomestatementprofitappropriationsgmtById", fin_2002incomestatementprofitappropriationsgmt_id);
	}
	/**
	* 添加
	* @param fin_2002incomestatementprofitappropriationsgmt 
	* @return
	*/
	public int addFin2002incomestatementprofitappropriationsgmt(Fin2002incomestatementprofitappropriationsgmt fin2002incomestatementprofitappropriationsgmt){
		return this.add("addFin2002incomestatementprofitappropriationsgmt", fin2002incomestatementprofitappropriationsgmt);
	}
	/**
	* 修改
	* @param fin_2002incomestatementprofitappropriationsgmt 
	* @return
	*/
	public int updateFin2002incomestatementprofitappropriationsgmt(Fin2002incomestatementprofitappropriationsgmt fin2002incomestatementprofitappropriationsgmt){
		return this.update("updateFin2002incomestatementprofitappropriationsgmt", fin2002incomestatementprofitappropriationsgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param fin_2002incomestatementprofitappropriationsgmt 
	* @return
	*/
	public int updateFin2002incomestatementprofitappropriationsgmtBySelective(Fin2002incomestatementprofitappropriationsgmt fin2002incomestatementprofitappropriationsgmt){
		return this.update("updateFin2002incomestatementprofitappropriationsgmtBySelective", fin2002incomestatementprofitappropriationsgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delFin2002incomestatementprofitappropriationsgmt(Map<String,Object> condition){
		return this.del("delFin2002incomestatementprofitappropriationsgmt", condition);
	}
	/**
	* 批量添加
	* @param fin_2002incomestatementprofitappropriationsgmtList 
	* @return
	*/
	public int addBatchFin2002incomestatementprofitappropriationsgmt(List<Fin2002incomestatementprofitappropriationsgmt> fin2002incomestatementprofitappropriationsgmtList){
		return this.add("addBatchFin2002incomestatementprofitappropriationsgmt", fin2002incomestatementprofitappropriationsgmtList);
	}
	/**
	* 批量修改
	* @param fin_2002incomestatementprofitappropriationsgmtList 
	* @return
	*/
	public int updateBatchFin2002incomestatementprofitappropriationsgmt(List<Fin2002incomestatementprofitappropriationsgmt> fin2002incomestatementprofitappropriationsgmtList){
		return this.update("updateBatchFin2002incomestatementprofitappropriationsgmt", fin2002incomestatementprofitappropriationsgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param fin_2002incomestatementprofitappropriationsgmtList 
	* @return
	*/
	public int updateBatchFin2002incomestatementprofitappropriationsgmtBySelective(List<Fin2002incomestatementprofitappropriationsgmt> fin2002incomestatementprofitappropriationsgmtList){
		return this.update("updateBatchFin2002incomestatementprofitappropriationsgmtBySelective", fin2002incomestatementprofitappropriationsgmtList);
	}
}
