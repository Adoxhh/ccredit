package ccredit.bsmodules.bsdao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.bsmodules.bsdao.BsBssgmtDao;
import ccredit.bsmodules.bsmodel.BsBssgmt;

/**
* 企业基本信息基础段 
* 2018-04-26 09:58:53  mengbeibei
*/
@Repository("bsBssgmtDao")
public class BsBssgmtDaoImpl  extends BaseDaoImpl implements BsBssgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<BsBssgmt> getBsBssgmtListByCondition(Map<String,Object> condition){
		return (List<BsBssgmt>)this.getList("getBsBssgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param bssgmt_id 
	* @return
	*/
	public BsBssgmt getBsBssgmtById(String bssgmt_id){
		return (BsBssgmt)this.get("getBsBssgmtById", bssgmt_id);
	}
	/**
	* 添加
	* @param bs_bssgmt 
	* @return
	*/
	public int addBsBssgmt(BsBssgmt bsBssgmt){
		return this.add("addBsBssgmt", bsBssgmt);
	}
	/**
	* 修改
	* @param bs_bssgmt 
	* @return
	*/
	public int updateBsBssgmt(BsBssgmt bsBssgmt){
		return this.update("updateBsBssgmt", bsBssgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param bs_bssgmt 
	* @return
	*/
	public int updateBsBssgmtBySelective(BsBssgmt bsBssgmt){
		return this.update("updateBsBssgmtBySelective", bsBssgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delBsBssgmt(Map<String,Object> condition){
		return this.del("delBsBssgmt", condition);
	}
	/**
	* 批量添加
	* @param bs_bssgmtList 
	* @return
	*/
	public int addBatchBsBssgmt(List<BsBssgmt> bsBssgmtList){
		return this.add("addBatchBsBssgmt", bsBssgmtList);
	}
	/**
	* 批量修改
	* @param bs_bssgmtList 
	* @return
	*/
	public int updateBatchBsBssgmt(List<BsBssgmt> bsBssgmtList){
		return this.update("updateBatchBsBssgmt", bsBssgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param bs_bssgmtList 
	* @return
	*/
	public int updateBatchBsBssgmtBySelective(List<BsBssgmt> bsBssgmtList){
		return this.update("updateBatchBsBssgmtBySelective", bsBssgmtList);
	}
	
	/**
	 * 查询历史信息
	 */
	public  List<?> getHisBsListByCondition(Map<String,Object> condition){
		String tablename = (String) condition.get("table");
		return (List<?>)this.getList(tablename,condition);
	}
}
