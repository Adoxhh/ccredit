package ccredit.bsmodules.bsdao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.bsmodules.bsdao.BsSpvsgathrtyinfsgmtDao;
import ccredit.bsmodules.bsmodel.BsSpvsgathrtyinfsgmt;

/**
* 上级机构 
* 2018-04-26 14:42:34  mengbeibei
*/
@Repository("bsSpvsgathrtyinfsgmtDao")
public class BsSpvsgathrtyinfsgmtDaoImpl  extends BaseDaoImpl implements BsSpvsgathrtyinfsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<BsSpvsgathrtyinfsgmt> getBsSpvsgathrtyinfsgmtListByCondition(Map<String,Object> condition){
		return (List<BsSpvsgathrtyinfsgmt>)this.getList("getBsSpvsgathrtyinfsgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param bs_spvsgathrtyinfsgmt_id 
	* @return
	*/
	public BsSpvsgathrtyinfsgmt getBsSpvsgathrtyinfsgmtById(String bs_spvsgathrtyinfsgmt_id){
		return (BsSpvsgathrtyinfsgmt)this.get("getBsSpvsgathrtyinfsgmtById", bs_spvsgathrtyinfsgmt_id);
	}
	/**
	* 添加
	* @param bs_spvsgathrtyinfsgmt 
	* @return
	*/
	public int addBsSpvsgathrtyinfsgmt(BsSpvsgathrtyinfsgmt bsSpvsgathrtyinfsgmt){
		return this.add("addBsSpvsgathrtyinfsgmt", bsSpvsgathrtyinfsgmt);
	}
	/**
	* 修改
	* @param bs_spvsgathrtyinfsgmt 
	* @return
	*/
	public int updateBsSpvsgathrtyinfsgmt(BsSpvsgathrtyinfsgmt bsSpvsgathrtyinfsgmt){
		return this.update("updateBsSpvsgathrtyinfsgmt", bsSpvsgathrtyinfsgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param bs_spvsgathrtyinfsgmt 
	* @return
	*/
	public int updateBsSpvsgathrtyinfsgmtBySelective(BsSpvsgathrtyinfsgmt bsSpvsgathrtyinfsgmt){
		return this.update("updateBsSpvsgathrtyinfsgmtBySelective", bsSpvsgathrtyinfsgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delBsSpvsgathrtyinfsgmt(Map<String,Object> condition){
		return this.del("delBsSpvsgathrtyinfsgmt", condition);
	}
	/**
	* 批量添加
	* @param bs_spvsgathrtyinfsgmtList 
	* @return
	*/
	public int addBatchBsSpvsgathrtyinfsgmt(List<BsSpvsgathrtyinfsgmt> bsSpvsgathrtyinfsgmtList){
		return this.add("addBatchBsSpvsgathrtyinfsgmt", bsSpvsgathrtyinfsgmtList);
	}
	/**
	* 批量修改
	* @param bs_spvsgathrtyinfsgmtList 
	* @return
	*/
	public int updateBatchBsSpvsgathrtyinfsgmt(List<BsSpvsgathrtyinfsgmt> bsSpvsgathrtyinfsgmtList){
		return this.update("updateBatchBsSpvsgathrtyinfsgmt", bsSpvsgathrtyinfsgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param bs_spvsgathrtyinfsgmtList 
	* @return
	*/
	public int updateBatchBsSpvsgathrtyinfsgmtBySelective(List<BsSpvsgathrtyinfsgmt> bsSpvsgathrtyinfsgmtList){
		return this.update("updateBatchBsSpvsgathrtyinfsgmtBySelective", bsSpvsgathrtyinfsgmtList);
	}
}
