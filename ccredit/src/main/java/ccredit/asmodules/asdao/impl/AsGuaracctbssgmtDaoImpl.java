package ccredit.asmodules.asdao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.asmodules.asdao.AsGuaracctbssgmtDao;
import ccredit.asmodules.asmodel.AsGuaracctbssgmt;

/**
* as_guaracctbssgmt 
* 2018-04-27 15:41:57  mengbeibei
*/
@Repository("asGuaracctbssgmtDao")
public class AsGuaracctbssgmtDaoImpl  extends BaseDaoImpl implements AsGuaracctbssgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<AsGuaracctbssgmt> getAsGuaracctbssgmtListByCondition(Map<String,Object> condition){
		return (List<AsGuaracctbssgmt>)this.getList("getAsGuaracctbssgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param guaracctbssgmt_id 
	* @return
	*/
	public AsGuaracctbssgmt getAsGuaracctbssgmtById(String guaracctbssgmt_id){
		return (AsGuaracctbssgmt)this.get("getAsGuaracctbssgmtById", guaracctbssgmt_id);
	}
	/**
	* 添加
	* @param as_guaracctbssgmt 
	* @return
	*/
	public int addAsGuaracctbssgmt(AsGuaracctbssgmt asGuaracctbssgmt){
		return this.add("addAsGuaracctbssgmt", asGuaracctbssgmt);
	}
	/**
	* 修改
	* @param as_guaracctbssgmt 
	* @return
	*/
	public int updateAsGuaracctbssgmt(AsGuaracctbssgmt asGuaracctbssgmt){
		return this.update("updateAsGuaracctbssgmt", asGuaracctbssgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param as_guaracctbssgmt 
	* @return
	*/
	public int updateAsGuaracctbssgmtBySelective(AsGuaracctbssgmt asGuaracctbssgmt){
		return this.update("updateAsGuaracctbssgmtBySelective", asGuaracctbssgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delAsGuaracctbssgmt(Map<String,Object> condition){
		return this.del("delAsGuaracctbssgmt", condition);
	}
	/**
	* 批量添加
	* @param as_guaracctbssgmtList 
	* @return
	*/
	public int addBatchAsGuaracctbssgmt(List<AsGuaracctbssgmt> asGuaracctbssgmtList){
		return this.add("addBatchAsGuaracctbssgmt", asGuaracctbssgmtList);
	}
	/**
	* 批量修改
	* @param as_guaracctbssgmtList 
	* @return
	*/
	public int updateBatchAsGuaracctbssgmt(List<AsGuaracctbssgmt> asGuaracctbssgmtList){
		return this.update("updateBatchAsGuaracctbssgmt", asGuaracctbssgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param as_guaracctbssgmtList 
	* @return
	*/
	public int updateBatchAsGuaracctbssgmtBySelective(List<AsGuaracctbssgmt> asGuaracctbssgmtList){
		return this.update("updateBatchAsGuaracctbssgmtBySelective", asGuaracctbssgmtList);
	}
}
