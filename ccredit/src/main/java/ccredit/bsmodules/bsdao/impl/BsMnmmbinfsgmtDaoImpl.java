package ccredit.bsmodules.bsdao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.bsmodules.bsdao.BsMnmmbinfsgmtDao;
import ccredit.bsmodules.bsmodel.BsMnmmbinfsgmt;

/**
* 主要组成人员 
* 2018-04-26 11:18:18  mengbeibei
*/
@Repository("bsMnmmbinfsgmtDao")
public class BsMnmmbinfsgmtDaoImpl  extends BaseDaoImpl implements BsMnmmbinfsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<BsMnmmbinfsgmt> getBsMnmmbinfsgmtListByCondition(Map<String,Object> condition){
		return (List<BsMnmmbinfsgmt>)this.getList("getBsMnmmbinfsgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param bs_mnmmbinfsgmt_id 
	* @return
	*/
	public BsMnmmbinfsgmt getBsMnmmbinfsgmtById(String bs_mnmmbinfsgmt_id){
		return (BsMnmmbinfsgmt)this.get("getBsMnmmbinfsgmtById", bs_mnmmbinfsgmt_id);
	}
	/**
	* 添加
	* @param bs_mnmmbinfsgmt 
	* @return
	*/
	public int addBsMnmmbinfsgmt(BsMnmmbinfsgmt bsMnmmbinfsgmt){
		return this.add("addBsMnmmbinfsgmt", bsMnmmbinfsgmt);
	}
	/**
	* 修改
	* @param bs_mnmmbinfsgmt 
	* @return
	*/
	public int updateBsMnmmbinfsgmt(BsMnmmbinfsgmt bsMnmmbinfsgmt){
		return this.update("updateBsMnmmbinfsgmt", bsMnmmbinfsgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param bs_mnmmbinfsgmt 
	* @return
	*/
	public int updateBsMnmmbinfsgmtBySelective(BsMnmmbinfsgmt bsMnmmbinfsgmt){
		return this.update("updateBsMnmmbinfsgmtBySelective", bsMnmmbinfsgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delBsMnmmbinfsgmt(Map<String,Object> condition){
		return this.del("delBsMnmmbinfsgmt", condition);
	}
	/**
	* 批量添加
	* @param bs_mnmmbinfsgmtList 
	* @return
	*/
	public int addBatchBsMnmmbinfsgmt(List<BsMnmmbinfsgmt> bsMnmmbinfsgmtList){
		return this.add("addBatchBsMnmmbinfsgmt", bsMnmmbinfsgmtList);
	}
	/**
	* 批量修改
	* @param bs_mnmmbinfsgmtList 
	* @return
	*/
	public int updateBatchBsMnmmbinfsgmt(List<BsMnmmbinfsgmt> bsMnmmbinfsgmtList){
		return this.update("updateBatchBsMnmmbinfsgmt", bsMnmmbinfsgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param bs_mnmmbinfsgmtList 
	* @return
	*/
	public int updateBatchBsMnmmbinfsgmtBySelective(List<BsMnmmbinfsgmt> bsMnmmbinfsgmtList){
		return this.update("updateBatchBsMnmmbinfsgmtBySelective", bsMnmmbinfsgmtList);
	}
}
