package ccredit.bsmodules.bsdao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.bsmodules.bsdao.BsEnctfitginfDao;
import ccredit.bsmodules.bsmodel.BsEnctfitginf;

/**
* 身份标识整合信息记录 
* 2018-04-26 14:47:45  mengbeibei
*/
@Repository("bsEnctfitginfDao")
public class BsEnctfitginfDaoImpl  extends BaseDaoImpl implements BsEnctfitginfDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<BsEnctfitginf> getBsEnctfitginfListByCondition(Map<String,Object> condition){
		return (List<BsEnctfitginf>)this.getList("getBsEnctfitginfListByCondition",condition);
	}
	/**
	* 查询对象
	* @param enctfitginf_id 
	* @return
	*/
	public BsEnctfitginf getBsEnctfitginfById(String enctfitginf_id){
		return (BsEnctfitginf)this.get("getBsEnctfitginfById", enctfitginf_id);
	}
	/**
	* 添加
	* @param bs_enctfitginf 
	* @return
	*/
	public int addBsEnctfitginf(BsEnctfitginf bsEnctfitginf){
		return this.add("addBsEnctfitginf", bsEnctfitginf);
	}
	/**
	* 修改
	* @param bs_enctfitginf 
	* @return
	*/
	public int updateBsEnctfitginf(BsEnctfitginf bsEnctfitginf){
		return this.update("updateBsEnctfitginf", bsEnctfitginf);
	}
	/**
	* 修改（根据动态条件）
	* @param bs_enctfitginf 
	* @return
	*/
	public int updateBsEnctfitginfBySelective(BsEnctfitginf bsEnctfitginf){
		return this.update("updateBsEnctfitginfBySelective", bsEnctfitginf);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delBsEnctfitginf(Map<String,Object> condition){
		return this.del("delBsEnctfitginf", condition);
	}
	/**
	* 批量添加
	* @param bs_enctfitginfList 
	* @return
	*/
	public int addBatchBsEnctfitginf(List<BsEnctfitginf> bsEnctfitginfList){
		return this.add("addBatchBsEnctfitginf", bsEnctfitginfList);
	}
	/**
	* 批量修改
	* @param bs_enctfitginfList 
	* @return
	*/
	public int updateBatchBsEnctfitginf(List<BsEnctfitginf> bsEnctfitginfList){
		return this.update("updateBatchBsEnctfitginf", bsEnctfitginfList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param bs_enctfitginfList 
	* @return
	*/
	public int updateBatchBsEnctfitginfBySelective(List<BsEnctfitginf> bsEnctfitginfList){
		return this.update("updateBatchBsEnctfitginfBySelective", bsEnctfitginfList);
	}
}
