package ccredit.bsmodules.bsdao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.bsmodules.bsdao.BsIdsgmtDao;
import ccredit.bsmodules.bsmodel.BsIdsgmt;

/**
* 其他标识表 
* 2018-04-26 10:26:44  mengbeibei
*/
@Repository("bsIdsgmtDao")
public class BsIdsgmtDaoImpl  extends BaseDaoImpl implements BsIdsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<BsIdsgmt> getBsIdsgmtListByCondition(Map<String,Object> condition){
		return (List<BsIdsgmt>)this.getList("getBsIdsgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param bs_idsgmt_id 
	* @return
	*/
	public BsIdsgmt getBsIdsgmtById(String bs_idsgmt_id){
		return (BsIdsgmt)this.get("getBsIdsgmtById", bs_idsgmt_id);
	}
	/**
	* 添加
	* @param bs_idsgmt 
	* @return
	*/
	public int addBsIdsgmt(BsIdsgmt bsIdsgmt){
		return this.add("addBsIdsgmt", bsIdsgmt);
	}
	/**
	* 修改
	* @param bs_idsgmt 
	* @return
	*/
	public int updateBsIdsgmt(BsIdsgmt bsIdsgmt){
		return this.update("updateBsIdsgmt", bsIdsgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param bs_idsgmt 
	* @return
	*/
	public int updateBsIdsgmtBySelective(BsIdsgmt bsIdsgmt){
		return this.update("updateBsIdsgmtBySelective", bsIdsgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delBsIdsgmt(Map<String,Object> condition){
		return this.del("delBsIdsgmt", condition);
	}
	/**
	* 批量添加
	* @param bs_idsgmtList 
	* @return
	*/
	public int addBatchBsIdsgmt(List<BsIdsgmt> bsIdsgmtList){
		return this.add("addBatchBsIdsgmt", bsIdsgmtList);
	}
	/**
	* 批量修改
	* @param bs_idsgmtList 
	* @return
	*/
	public int updateBatchBsIdsgmt(List<BsIdsgmt> bsIdsgmtList){
		return this.update("updateBatchBsIdsgmt", bsIdsgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param bs_idsgmtList 
	* @return
	*/
	public int updateBatchBsIdsgmtBySelective(List<BsIdsgmt> bsIdsgmtList){
		return this.update("updateBatchBsIdsgmtBySelective", bsIdsgmtList);
	}
}
