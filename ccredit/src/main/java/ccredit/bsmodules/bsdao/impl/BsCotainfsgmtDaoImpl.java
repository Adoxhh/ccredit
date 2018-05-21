package ccredit.bsmodules.bsdao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.bsmodules.bsdao.BsCotainfsgmtDao;
import ccredit.bsmodules.bsmodel.BsCotainfsgmt;

/**
* 联系方式 
* 2018-04-26 14:44:28  mengbeibei
*/
@Repository("bsCotainfsgmtDao")
public class BsCotainfsgmtDaoImpl  extends BaseDaoImpl implements BsCotainfsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<BsCotainfsgmt> getBsCotainfsgmtListByCondition(Map<String,Object> condition){
		return (List<BsCotainfsgmt>)this.getList("getBsCotainfsgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param bs_cotainfsgmt_id 
	* @return
	*/
	public BsCotainfsgmt getBsCotainfsgmtById(String bs_cotainfsgmt_id){
		return (BsCotainfsgmt)this.get("getBsCotainfsgmtById", bs_cotainfsgmt_id);
	}
	/**
	* 添加
	* @param bs_cotainfsgmt 
	* @return
	*/
	public int addBsCotainfsgmt(BsCotainfsgmt bsCotainfsgmt){
		return this.add("addBsCotainfsgmt", bsCotainfsgmt);
	}
	/**
	* 修改
	* @param bs_cotainfsgmt 
	* @return
	*/
	public int updateBsCotainfsgmt(BsCotainfsgmt bsCotainfsgmt){
		return this.update("updateBsCotainfsgmt", bsCotainfsgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param bs_cotainfsgmt 
	* @return
	*/
	public int updateBsCotainfsgmtBySelective(BsCotainfsgmt bsCotainfsgmt){
		return this.update("updateBsCotainfsgmtBySelective", bsCotainfsgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delBsCotainfsgmt(Map<String,Object> condition){
		return this.del("delBsCotainfsgmt", condition);
	}
	/**
	* 批量添加
	* @param bs_cotainfsgmtList 
	* @return
	*/
	public int addBatchBsCotainfsgmt(List<BsCotainfsgmt> bsCotainfsgmtList){
		return this.add("addBatchBsCotainfsgmt", bsCotainfsgmtList);
	}
	/**
	* 批量修改
	* @param bs_cotainfsgmtList 
	* @return
	*/
	public int updateBatchBsCotainfsgmt(List<BsCotainfsgmt> bsCotainfsgmtList){
		return this.update("updateBatchBsCotainfsgmt", bsCotainfsgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param bs_cotainfsgmtList 
	* @return
	*/
	public int updateBatchBsCotainfsgmtBySelective(List<BsCotainfsgmt> bsCotainfsgmtList){
		return this.update("updateBatchBsCotainfsgmtBySelective", bsCotainfsgmtList);
	}
}
