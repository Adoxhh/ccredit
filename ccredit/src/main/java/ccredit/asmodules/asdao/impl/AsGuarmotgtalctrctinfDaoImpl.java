package ccredit.asmodules.asdao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.asmodules.asdao.AsGuarmotgtalctrctinfDao;
import ccredit.asmodules.asmodel.AsGuarmotgtalctrctinf;

/**
* 企业担保账户抵质押物信息段 
* 2018-04-28 15:41:50  mengbeibei
*/
@Repository("asGuarmotgtalctrctinfDao")
public class AsGuarmotgtalctrctinfDaoImpl  extends BaseDaoImpl implements AsGuarmotgtalctrctinfDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<AsGuarmotgtalctrctinf> getAsGuarmotgtalctrctinfListByCondition(Map<String,Object> condition){
		return (List<AsGuarmotgtalctrctinf>)this.getList("getAsGuarmotgtalctrctinfListByCondition",condition);
	}
	/**
	* 查询对象
	* @param guarmotgtalctrctinf_id 
	* @return
	*/
	public AsGuarmotgtalctrctinf getAsGuarmotgtalctrctinfById(String guarmotgtalctrctinf_id){
		return (AsGuarmotgtalctrctinf)this.get("getAsGuarmotgtalctrctinfById", guarmotgtalctrctinf_id);
	}
	/**
	* 添加
	* @param as_guarmotgtalctrctinf 
	* @return
	*/
	public int addAsGuarmotgtalctrctinf(AsGuarmotgtalctrctinf asGuarmotgtalctrctinf){
		return this.add("addAsGuarmotgtalctrctinf", asGuarmotgtalctrctinf);
	}
	/**
	* 修改
	* @param as_guarmotgtalctrctinf 
	* @return
	*/
	public int updateAsGuarmotgtalctrctinf(AsGuarmotgtalctrctinf asGuarmotgtalctrctinf){
		return this.update("updateAsGuarmotgtalctrctinf", asGuarmotgtalctrctinf);
	}
	/**
	* 修改（根据动态条件）
	* @param as_guarmotgtalctrctinf 
	* @return
	*/
	public int updateAsGuarmotgtalctrctinfBySelective(AsGuarmotgtalctrctinf asGuarmotgtalctrctinf){
		return this.update("updateAsGuarmotgtalctrctinfBySelective", asGuarmotgtalctrctinf);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delAsGuarmotgtalctrctinf(Map<String,Object> condition){
		return this.del("delAsGuarmotgtalctrctinf", condition);
	}
	/**
	* 批量添加
	* @param as_guarmotgtalctrctinfList 
	* @return
	*/
	public int addBatchAsGuarmotgtalctrctinf(List<AsGuarmotgtalctrctinf> asGuarmotgtalctrctinfList){
		return this.add("addBatchAsGuarmotgtalctrctinf", asGuarmotgtalctrctinfList);
	}
	/**
	* 批量修改
	* @param as_guarmotgtalctrctinfList 
	* @return
	*/
	public int updateBatchAsGuarmotgtalctrctinf(List<AsGuarmotgtalctrctinf> asGuarmotgtalctrctinfList){
		return this.update("updateBatchAsGuarmotgtalctrctinf", asGuarmotgtalctrctinfList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param as_guarmotgtalctrctinfList 
	* @return
	*/
	public int updateBatchAsGuarmotgtalctrctinfBySelective(List<AsGuarmotgtalctrctinf> asGuarmotgtalctrctinfList){
		return this.update("updateBatchAsGuarmotgtalctrctinfBySelective", asGuarmotgtalctrctinfList);
	}
}
