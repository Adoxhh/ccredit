package ccredit.asmodules.asdao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.asmodules.asdao.AsGuaracctbsinfsgmtDao;
import ccredit.asmodules.asmodel.AsGuaracctbsinfsgmt;

/**
* 企业担保账户基本信息段 
* 2018-04-28 15:37:03  mengbeibei
*/
@Repository("asGuaracctbsinfsgmtDao")
public class AsGuaracctbsinfsgmtDaoImpl  extends BaseDaoImpl implements AsGuaracctbsinfsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<AsGuaracctbsinfsgmt> getAsGuaracctbsinfsgmtListByCondition(Map<String,Object> condition){
		return (List<AsGuaracctbsinfsgmt>)this.getList("getAsGuaracctbsinfsgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param guaracctbsinfsgmt_id 
	* @return
	*/
	public AsGuaracctbsinfsgmt getAsGuaracctbsinfsgmtById(String guaracctbsinfsgmt_id){
		return (AsGuaracctbsinfsgmt)this.get("getAsGuaracctbsinfsgmtById", guaracctbsinfsgmt_id);
	}
	/**
	* 添加
	* @param as_guaracctbsinfsgmt 
	* @return
	*/
	public int addAsGuaracctbsinfsgmt(AsGuaracctbsinfsgmt asGuaracctbsinfsgmt){
		return this.add("addAsGuaracctbsinfsgmt", asGuaracctbsinfsgmt);
	}
	/**
	* 修改
	* @param as_guaracctbsinfsgmt 
	* @return
	*/
	public int updateAsGuaracctbsinfsgmt(AsGuaracctbsinfsgmt asGuaracctbsinfsgmt){
		return this.update("updateAsGuaracctbsinfsgmt", asGuaracctbsinfsgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param as_guaracctbsinfsgmt 
	* @return
	*/
	public int updateAsGuaracctbsinfsgmtBySelective(AsGuaracctbsinfsgmt asGuaracctbsinfsgmt){
		return this.update("updateAsGuaracctbsinfsgmtBySelective", asGuaracctbsinfsgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delAsGuaracctbsinfsgmt(Map<String,Object> condition){
		return this.del("delAsGuaracctbsinfsgmt", condition);
	}
	/**
	* 批量添加
	* @param as_guaracctbsinfsgmtList 
	* @return
	*/
	public int addBatchAsGuaracctbsinfsgmt(List<AsGuaracctbsinfsgmt> asGuaracctbsinfsgmtList){
		return this.add("addBatchAsGuaracctbsinfsgmt", asGuaracctbsinfsgmtList);
	}
	/**
	* 批量修改
	* @param as_guaracctbsinfsgmtList 
	* @return
	*/
	public int updateBatchAsGuaracctbsinfsgmt(List<AsGuaracctbsinfsgmt> asGuaracctbsinfsgmtList){
		return this.update("updateBatchAsGuaracctbsinfsgmt", asGuaracctbsinfsgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param as_guaracctbsinfsgmtList 
	* @return
	*/
	public int updateBatchAsGuaracctbsinfsgmtBySelective(List<AsGuaracctbsinfsgmt> asGuaracctbsinfsgmtList){
		return this.update("updateBatchAsGuaracctbsinfsgmtBySelective", asGuaracctbsinfsgmtList);
	}
	
	/**
	 * 查询历史信息
	 */
	public  List<?> getHisAsListByCondition(Map<String,Object> condition){
		String tablename = (String) condition.get("table");
		return (List<?>)this.getList(tablename,condition);
	}
}
