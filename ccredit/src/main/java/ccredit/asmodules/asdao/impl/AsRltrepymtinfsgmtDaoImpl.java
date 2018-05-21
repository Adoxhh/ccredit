package ccredit.asmodules.asdao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.asmodules.asdao.AsRltrepymtinfsgmtDao;
import ccredit.asmodules.asmodel.AsRltrepymtinfsgmt;

/**
* 企业担保账户相关还款责任人信息段 
* 2018-04-28 15:39:48  mengbeibei
*/
@Repository("asRltrepymtinfsgmtDao")
public class AsRltrepymtinfsgmtDaoImpl  extends BaseDaoImpl implements AsRltrepymtinfsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<AsRltrepymtinfsgmt> getAsRltrepymtinfsgmtListByCondition(Map<String,Object> condition){
		return (List<AsRltrepymtinfsgmt>)this.getList("getAsRltrepymtinfsgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param rltrepymtinfsgmt_id 
	* @return
	*/
	public AsRltrepymtinfsgmt getAsRltrepymtinfsgmtById(String rltrepymtinfsgmt_id){
		return (AsRltrepymtinfsgmt)this.get("getAsRltrepymtinfsgmtById", rltrepymtinfsgmt_id);
	}
	/**
	* 添加
	* @param as_rltrepymtinfsgmt 
	* @return
	*/
	public int addAsRltrepymtinfsgmt(AsRltrepymtinfsgmt asRltrepymtinfsgmt){
		return this.add("addAsRltrepymtinfsgmt", asRltrepymtinfsgmt);
	}
	/**
	* 修改
	* @param as_rltrepymtinfsgmt 
	* @return
	*/
	public int updateAsRltrepymtinfsgmt(AsRltrepymtinfsgmt asRltrepymtinfsgmt){
		return this.update("updateAsRltrepymtinfsgmt", asRltrepymtinfsgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param as_rltrepymtinfsgmt 
	* @return
	*/
	public int updateAsRltrepymtinfsgmtBySelective(AsRltrepymtinfsgmt asRltrepymtinfsgmt){
		return this.update("updateAsRltrepymtinfsgmtBySelective", asRltrepymtinfsgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delAsRltrepymtinfsgmt(Map<String,Object> condition){
		return this.del("delAsRltrepymtinfsgmt", condition);
	}
	/**
	* 批量添加
	* @param as_rltrepymtinfsgmtList 
	* @return
	*/
	public int addBatchAsRltrepymtinfsgmt(List<AsRltrepymtinfsgmt> asRltrepymtinfsgmtList){
		return this.add("addBatchAsRltrepymtinfsgmt", asRltrepymtinfsgmtList);
	}
	/**
	* 批量修改
	* @param as_rltrepymtinfsgmtList 
	* @return
	*/
	public int updateBatchAsRltrepymtinfsgmt(List<AsRltrepymtinfsgmt> asRltrepymtinfsgmtList){
		return this.update("updateBatchAsRltrepymtinfsgmt", asRltrepymtinfsgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param as_rltrepymtinfsgmtList 
	* @return
	*/
	public int updateBatchAsRltrepymtinfsgmtBySelective(List<AsRltrepymtinfsgmt> asRltrepymtinfsgmtList){
		return this.update("updateBatchAsRltrepymtinfsgmtBySelective", asRltrepymtinfsgmtList);
	}
}
