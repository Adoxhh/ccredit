package ccredit.asmodules.asdao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.asmodules.asdao.AsGuarrltrepymtinfDao;
import ccredit.asmodules.asmodel.AsGuarrltrepymtinf;

/**
* 企业担保账户在保责任信息段 
* 2018-04-28 15:46:18  mengbeibei
*/
@Repository("asGuarrltrepymtinfDao")
public class AsGuarrltrepymtinfDaoImpl  extends BaseDaoImpl implements AsGuarrltrepymtinfDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<AsGuarrltrepymtinf> getAsGuarrltrepymtinfListByCondition(Map<String,Object> condition){
		return (List<AsGuarrltrepymtinf>)this.getList("getAsGuarrltrepymtinfListByCondition",condition);
	}
	/**
	* 查询对象
	* @param guarrltrepymtinf_id 
	* @return
	*/
	public AsGuarrltrepymtinf getAsGuarrltrepymtinfById(String guarrltrepymtinf_id){
		return (AsGuarrltrepymtinf)this.get("getAsGuarrltrepymtinfById", guarrltrepymtinf_id);
	}
	/**
	* 添加
	* @param as_guarrltrepymtinf 
	* @return
	*/
	public int addAsGuarrltrepymtinf(AsGuarrltrepymtinf asGuarrltrepymtinf){
		return this.add("addAsGuarrltrepymtinf", asGuarrltrepymtinf);
	}
	/**
	* 修改
	* @param as_guarrltrepymtinf 
	* @return
	*/
	public int updateAsGuarrltrepymtinf(AsGuarrltrepymtinf asGuarrltrepymtinf){
		return this.update("updateAsGuarrltrepymtinf", asGuarrltrepymtinf);
	}
	/**
	* 修改（根据动态条件）
	* @param as_guarrltrepymtinf 
	* @return
	*/
	public int updateAsGuarrltrepymtinfBySelective(AsGuarrltrepymtinf asGuarrltrepymtinf){
		return this.update("updateAsGuarrltrepymtinfBySelective", asGuarrltrepymtinf);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delAsGuarrltrepymtinf(Map<String,Object> condition){
		return this.del("delAsGuarrltrepymtinf", condition);
	}
	/**
	* 批量添加
	* @param as_guarrltrepymtinfList 
	* @return
	*/
	public int addBatchAsGuarrltrepymtinf(List<AsGuarrltrepymtinf> asGuarrltrepymtinfList){
		return this.add("addBatchAsGuarrltrepymtinf", asGuarrltrepymtinfList);
	}
	/**
	* 批量修改
	* @param as_guarrltrepymtinfList 
	* @return
	*/
	public int updateBatchAsGuarrltrepymtinf(List<AsGuarrltrepymtinf> asGuarrltrepymtinfList){
		return this.update("updateBatchAsGuarrltrepymtinf", asGuarrltrepymtinfList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param as_guarrltrepymtinfList 
	* @return
	*/
	public int updateBatchAsGuarrltrepymtinfBySelective(List<AsGuarrltrepymtinf> asGuarrltrepymtinfList){
		return this.update("updateBatchAsGuarrltrepymtinfBySelective", asGuarrltrepymtinfList);
	}
}
