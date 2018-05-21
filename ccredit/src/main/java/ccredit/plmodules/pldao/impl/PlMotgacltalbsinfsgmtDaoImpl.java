package ccredit.plmodules.pldao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.plmodules.pldao.PlMotgacltalbsinfsgmtDao;
import ccredit.plmodules.plmodel.PlMotgacltalbsinfsgmt;

/**
* 抵（质）押合同基本信息段 
* 2018-04-28 16:59:38  yangzhou
*/
@Repository("plMotgacltalbsinfsgmtDao")
public class PlMotgacltalbsinfsgmtDaoImpl  extends BaseDaoImpl implements PlMotgacltalbsinfsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<PlMotgacltalbsinfsgmt> getPlMotgacltalbsinfsgmtListByCondition(Map<String,Object> condition){
		return (List<PlMotgacltalbsinfsgmt>)this.getList("getPlMotgacltalbsinfsgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param pl_motgacltalbsinfsgmt_id 
	* @return
	*/
	public PlMotgacltalbsinfsgmt getPlMotgacltalbsinfsgmtById(String pl_motgacltalbsinfsgmt_id){
		return (PlMotgacltalbsinfsgmt)this.get("getPlMotgacltalbsinfsgmtById", pl_motgacltalbsinfsgmt_id);
	}
	/**
	* 添加
	* @param pl_motgacltalbsinfsgmt 
	* @return
	*/
	public int addPlMotgacltalbsinfsgmt(PlMotgacltalbsinfsgmt plMotgacltalbsinfsgmt){
		return this.add("addPlMotgacltalbsinfsgmt", plMotgacltalbsinfsgmt);
	}
	/**
	* 修改
	* @param pl_motgacltalbsinfsgmt 
	* @return
	*/
	public int updatePlMotgacltalbsinfsgmt(PlMotgacltalbsinfsgmt plMotgacltalbsinfsgmt){
		return this.update("updatePlMotgacltalbsinfsgmt", plMotgacltalbsinfsgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param pl_motgacltalbsinfsgmt 
	* @return
	*/
	public int updatePlMotgacltalbsinfsgmtBySelective(PlMotgacltalbsinfsgmt plMotgacltalbsinfsgmt){
		return this.update("updatePlMotgacltalbsinfsgmtBySelective", plMotgacltalbsinfsgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delPlMotgacltalbsinfsgmt(Map<String,Object> condition){
		return this.del("delPlMotgacltalbsinfsgmt", condition);
	}
	/**
	* 批量添加
	* @param pl_motgacltalbsinfsgmtList 
	* @return
	*/
	public int addBatchPlMotgacltalbsinfsgmt(List<PlMotgacltalbsinfsgmt> plMotgacltalbsinfsgmtList){
		return this.add("addBatchPlMotgacltalbsinfsgmt", plMotgacltalbsinfsgmtList);
	}
	/**
	* 批量修改
	* @param pl_motgacltalbsinfsgmtList 
	* @return
	*/
	public int updateBatchPlMotgacltalbsinfsgmt(List<PlMotgacltalbsinfsgmt> plMotgacltalbsinfsgmtList){
		return this.update("updateBatchPlMotgacltalbsinfsgmt", plMotgacltalbsinfsgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param pl_motgacltalbsinfsgmtList 
	* @return
	*/
	public int updateBatchPlMotgacltalbsinfsgmtBySelective(List<PlMotgacltalbsinfsgmt> plMotgacltalbsinfsgmtList){
		return this.update("updateBatchPlMotgacltalbsinfsgmtBySelective", plMotgacltalbsinfsgmtList);
	}
}
