package ccredit.bsmodules.bsdao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.bsmodules.bsdao.BsActucotrlinfsgmtDao;
import ccredit.bsmodules.bsmodel.BsActucotrlinfsgmt;

/**
* 实际控制人 
* 2018-04-26 14:38:51  mengbeibei
*/
@Repository("bsActucotrlinfsgmtDao")
public class BsActucotrlinfsgmtDaoImpl  extends BaseDaoImpl implements BsActucotrlinfsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<BsActucotrlinfsgmt> getBsActucotrlinfsgmtListByCondition(Map<String,Object> condition){
		return (List<BsActucotrlinfsgmt>)this.getList("getBsActucotrlinfsgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param bs_actucotrlinfsgmt_id 
	* @return
	*/
	public BsActucotrlinfsgmt getBsActucotrlinfsgmtById(String bs_actucotrlinfsgmt_id){
		return (BsActucotrlinfsgmt)this.get("getBsActucotrlinfsgmtById", bs_actucotrlinfsgmt_id);
	}
	/**
	* 添加
	* @param bs_actucotrlinfsgmt 
	* @return
	*/
	public int addBsActucotrlinfsgmt(BsActucotrlinfsgmt bsActucotrlinfsgmt){
		return this.add("addBsActucotrlinfsgmt", bsActucotrlinfsgmt);
	}
	/**
	* 修改
	* @param bs_actucotrlinfsgmt 
	* @return
	*/
	public int updateBsActucotrlinfsgmt(BsActucotrlinfsgmt bsActucotrlinfsgmt){
		return this.update("updateBsActucotrlinfsgmt", bsActucotrlinfsgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param bs_actucotrlinfsgmt 
	* @return
	*/
	public int updateBsActucotrlinfsgmtBySelective(BsActucotrlinfsgmt bsActucotrlinfsgmt){
		return this.update("updateBsActucotrlinfsgmtBySelective", bsActucotrlinfsgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delBsActucotrlinfsgmt(Map<String,Object> condition){
		return this.del("delBsActucotrlinfsgmt", condition);
	}
	/**
	* 批量添加
	* @param bs_actucotrlinfsgmtList 
	* @return
	*/
	public int addBatchBsActucotrlinfsgmt(List<BsActucotrlinfsgmt> bsActucotrlinfsgmtList){
		return this.add("addBatchBsActucotrlinfsgmt", bsActucotrlinfsgmtList);
	}
	/**
	* 批量修改
	* @param bs_actucotrlinfsgmtList 
	* @return
	*/
	public int updateBatchBsActucotrlinfsgmt(List<BsActucotrlinfsgmt> bsActucotrlinfsgmtList){
		return this.update("updateBatchBsActucotrlinfsgmt", bsActucotrlinfsgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param bs_actucotrlinfsgmtList 
	* @return
	*/
	public int updateBatchBsActucotrlinfsgmtBySelective(List<BsActucotrlinfsgmt> bsActucotrlinfsgmtList){
		return this.update("updateBatchBsActucotrlinfsgmtBySelective", bsActucotrlinfsgmtList);
	}
}
