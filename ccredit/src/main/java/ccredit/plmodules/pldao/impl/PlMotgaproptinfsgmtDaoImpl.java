package ccredit.plmodules.pldao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.plmodules.pldao.PlMotgaproptinfsgmtDao;
import ccredit.plmodules.plmodel.PlMotgaproptinfsgmt;

/**
* 抵押物信息 
* 2018-04-28 17:06:08  yangzhou
*/
@Repository("plMotgaproptinfsgmtDao")
public class PlMotgaproptinfsgmtDaoImpl  extends BaseDaoImpl implements PlMotgaproptinfsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<PlMotgaproptinfsgmt> getPlMotgaproptinfsgmtListByCondition(Map<String,Object> condition){
		return (List<PlMotgaproptinfsgmt>)this.getList("getPlMotgaproptinfsgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param pl_motgaproptinfsgmt_id 
	* @return
	*/
	public PlMotgaproptinfsgmt getPlMotgaproptinfsgmtById(String pl_motgaproptinfsgmt_id){
		return (PlMotgaproptinfsgmt)this.get("getPlMotgaproptinfsgmtById", pl_motgaproptinfsgmt_id);
	}
	/**
	* 添加
	* @param pl_motgaproptinfsgmt 
	* @return
	*/
	public int addPlMotgaproptinfsgmt(PlMotgaproptinfsgmt plMotgaproptinfsgmt){
		return this.add("addPlMotgaproptinfsgmt", plMotgaproptinfsgmt);
	}
	/**
	* 修改
	* @param pl_motgaproptinfsgmt 
	* @return
	*/
	public int updatePlMotgaproptinfsgmt(PlMotgaproptinfsgmt plMotgaproptinfsgmt){
		return this.update("updatePlMotgaproptinfsgmt", plMotgaproptinfsgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param pl_motgaproptinfsgmt 
	* @return
	*/
	public int updatePlMotgaproptinfsgmtBySelective(PlMotgaproptinfsgmt plMotgaproptinfsgmt){
		return this.update("updatePlMotgaproptinfsgmtBySelective", plMotgaproptinfsgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delPlMotgaproptinfsgmt(Map<String,Object> condition){
		return this.del("delPlMotgaproptinfsgmt", condition);
	}
	/**
	* 批量添加
	* @param pl_motgaproptinfsgmtList 
	* @return
	*/
	public int addBatchPlMotgaproptinfsgmt(List<PlMotgaproptinfsgmt> plMotgaproptinfsgmtList){
		return this.add("addBatchPlMotgaproptinfsgmt", plMotgaproptinfsgmtList);
	}
	/**
	* 批量修改
	* @param pl_motgaproptinfsgmtList 
	* @return
	*/
	public int updateBatchPlMotgaproptinfsgmt(List<PlMotgaproptinfsgmt> plMotgaproptinfsgmtList){
		return this.update("updateBatchPlMotgaproptinfsgmt", plMotgaproptinfsgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param pl_motgaproptinfsgmtList 
	* @return
	*/
	public int updateBatchPlMotgaproptinfsgmtBySelective(List<PlMotgaproptinfsgmt> plMotgaproptinfsgmtList){
		return this.update("updateBatchPlMotgaproptinfsgmtBySelective", plMotgaproptinfsgmtList);
	}
}
