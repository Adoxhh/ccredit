package ccredit.bsmodules.bsdao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.bsmodules.bsdao.BsFcsinfsgmtDao;
import ccredit.bsmodules.bsmodel.BsFcsinfsgmt;

/**
* 基本概况信息 
* 2018-04-26 10:57:16  mengbeibei
*/
@Repository("bsFcsinfsgmtDao")
public class BsFcsinfsgmtDaoImpl  extends BaseDaoImpl implements BsFcsinfsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<BsFcsinfsgmt> getBsFcsinfsgmtListByCondition(Map<String,Object> condition){
		return (List<BsFcsinfsgmt>)this.getList("getBsFcsinfsgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param bs_fcsinfsgmt_id 
	* @return
	*/
	public BsFcsinfsgmt getBsFcsinfsgmtById(String bs_fcsinfsgmt_id){
		return (BsFcsinfsgmt)this.get("getBsFcsinfsgmtById", bs_fcsinfsgmt_id);
	}
	/**
	* 添加
	* @param bs_fcsinfsgmt 
	* @return
	*/
	public int addBsFcsinfsgmt(BsFcsinfsgmt bsFcsinfsgmt){
		return this.add("addBsFcsinfsgmt", bsFcsinfsgmt);
	}
	/**
	* 修改
	* @param bs_fcsinfsgmt 
	* @return
	*/
	public int updateBsFcsinfsgmt(BsFcsinfsgmt bsFcsinfsgmt){
		return this.update("updateBsFcsinfsgmt", bsFcsinfsgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param bs_fcsinfsgmt 
	* @return
	*/
	public int updateBsFcsinfsgmtBySelective(BsFcsinfsgmt bsFcsinfsgmt){
		return this.update("updateBsFcsinfsgmtBySelective", bsFcsinfsgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delBsFcsinfsgmt(Map<String,Object> condition){
		return this.del("delBsFcsinfsgmt", condition);
	}
	/**
	* 批量添加
	* @param bs_fcsinfsgmtList 
	* @return
	*/
	public int addBatchBsFcsinfsgmt(List<BsFcsinfsgmt> bsFcsinfsgmtList){
		return this.add("addBatchBsFcsinfsgmt", bsFcsinfsgmtList);
	}
	/**
	* 批量修改
	* @param bs_fcsinfsgmtList 
	* @return
	*/
	public int updateBatchBsFcsinfsgmt(List<BsFcsinfsgmt> bsFcsinfsgmtList){
		return this.update("updateBatchBsFcsinfsgmt", bsFcsinfsgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param bs_fcsinfsgmtList 
	* @return
	*/
	public int updateBatchBsFcsinfsgmtBySelective(List<BsFcsinfsgmt> bsFcsinfsgmtList){
		return this.update("updateBatchBsFcsinfsgmtBySelective", bsFcsinfsgmtList);
	}
}
