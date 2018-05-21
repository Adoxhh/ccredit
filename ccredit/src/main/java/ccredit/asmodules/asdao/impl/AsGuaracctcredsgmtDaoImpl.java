package ccredit.asmodules.asdao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.asmodules.asdao.AsGuaracctcredsgmtDao;
import ccredit.asmodules.asmodel.AsGuaracctcredsgmt;

/**
* 企业担保账户授信额度息段 
* 2018-04-28 15:43:06  mengbeibei
*/
@Repository("asGuaracctcredsgmtDao")
public class AsGuaracctcredsgmtDaoImpl  extends BaseDaoImpl implements AsGuaracctcredsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<AsGuaracctcredsgmt> getAsGuaracctcredsgmtListByCondition(Map<String,Object> condition){
		return (List<AsGuaracctcredsgmt>)this.getList("getAsGuaracctcredsgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param guaracctcredsgmt_id 
	* @return
	*/
	public AsGuaracctcredsgmt getAsGuaracctcredsgmtById(String guaracctcredsgmt_id){
		return (AsGuaracctcredsgmt)this.get("getAsGuaracctcredsgmtById", guaracctcredsgmt_id);
	}
	/**
	* 添加
	* @param as_guaracctcredsgmt 
	* @return
	*/
	public int addAsGuaracctcredsgmt(AsGuaracctcredsgmt asGuaracctcredsgmt){
		return this.add("addAsGuaracctcredsgmt", asGuaracctcredsgmt);
	}
	/**
	* 修改
	* @param as_guaracctcredsgmt 
	* @return
	*/
	public int updateAsGuaracctcredsgmt(AsGuaracctcredsgmt asGuaracctcredsgmt){
		return this.update("updateAsGuaracctcredsgmt", asGuaracctcredsgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param as_guaracctcredsgmt 
	* @return
	*/
	public int updateAsGuaracctcredsgmtBySelective(AsGuaracctcredsgmt asGuaracctcredsgmt){
		return this.update("updateAsGuaracctcredsgmtBySelective", asGuaracctcredsgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delAsGuaracctcredsgmt(Map<String,Object> condition){
		return this.del("delAsGuaracctcredsgmt", condition);
	}
	/**
	* 批量添加
	* @param as_guaracctcredsgmtList 
	* @return
	*/
	public int addBatchAsGuaracctcredsgmt(List<AsGuaracctcredsgmt> asGuaracctcredsgmtList){
		return this.add("addBatchAsGuaracctcredsgmt", asGuaracctcredsgmtList);
	}
	/**
	* 批量修改
	* @param as_guaracctcredsgmtList 
	* @return
	*/
	public int updateBatchAsGuaracctcredsgmt(List<AsGuaracctcredsgmt> asGuaracctcredsgmtList){
		return this.update("updateBatchAsGuaracctcredsgmt", asGuaracctcredsgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param as_guaracctcredsgmtList 
	* @return
	*/
	public int updateBatchAsGuaracctcredsgmtBySelective(List<AsGuaracctcredsgmt> asGuaracctcredsgmtList){
		return this.update("updateBatchAsGuaracctcredsgmtBySelective", asGuaracctcredsgmtList);
	}
}
