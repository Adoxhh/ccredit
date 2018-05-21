package ccredit.bsmodules.bsdao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.bsmodules.bsdao.BsEnicdnrltpinfDao;
import ccredit.bsmodules.bsmodel.BsEnicdnrltpinf;

/**
* 企业间关联关系信息记录 
* 2018-04-26 14:51:38  mengbeibei
*/
@Repository("bsEnicdnrltpinfDao")
public class BsEnicdnrltpinfDaoImpl  extends BaseDaoImpl implements BsEnicdnrltpinfDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<BsEnicdnrltpinf> getBsEnicdnrltpinfListByCondition(Map<String,Object> condition){
		return (List<BsEnicdnrltpinf>)this.getList("getBsEnicdnrltpinfListByCondition",condition);
	}
	/**
	* 查询对象
	* @param enicdnrltpinf_id 
	* @return
	*/
	public BsEnicdnrltpinf getBsEnicdnrltpinfById(String enicdnrltpinf_id){
		return (BsEnicdnrltpinf)this.get("getBsEnicdnrltpinfById", enicdnrltpinf_id);
	}
	/**
	* 添加
	* @param bs_enicdnrltpinf 
	* @return
	*/
	public int addBsEnicdnrltpinf(BsEnicdnrltpinf bsEnicdnrltpinf){
		return this.add("addBsEnicdnrltpinf", bsEnicdnrltpinf);
	}
	/**
	* 修改
	* @param bs_enicdnrltpinf 
	* @return
	*/
	public int updateBsEnicdnrltpinf(BsEnicdnrltpinf bsEnicdnrltpinf){
		return this.update("updateBsEnicdnrltpinf", bsEnicdnrltpinf);
	}
	/**
	* 修改（根据动态条件）
	* @param bs_enicdnrltpinf 
	* @return
	*/
	public int updateBsEnicdnrltpinfBySelective(BsEnicdnrltpinf bsEnicdnrltpinf){
		return this.update("updateBsEnicdnrltpinfBySelective", bsEnicdnrltpinf);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delBsEnicdnrltpinf(Map<String,Object> condition){
		return this.del("delBsEnicdnrltpinf", condition);
	}
	/**
	* 批量添加
	* @param bs_enicdnrltpinfList 
	* @return
	*/
	public int addBatchBsEnicdnrltpinf(List<BsEnicdnrltpinf> bsEnicdnrltpinfList){
		return this.add("addBatchBsEnicdnrltpinf", bsEnicdnrltpinfList);
	}
	/**
	* 批量修改
	* @param bs_enicdnrltpinfList 
	* @return
	*/
	public int updateBatchBsEnicdnrltpinf(List<BsEnicdnrltpinf> bsEnicdnrltpinfList){
		return this.update("updateBatchBsEnicdnrltpinf", bsEnicdnrltpinfList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param bs_enicdnrltpinfList 
	* @return
	*/
	public int updateBatchBsEnicdnrltpinfBySelective(List<BsEnicdnrltpinf> bsEnicdnrltpinfList){
		return this.update("updateBatchBsEnicdnrltpinfBySelective", bsEnicdnrltpinfList);
	}
}
