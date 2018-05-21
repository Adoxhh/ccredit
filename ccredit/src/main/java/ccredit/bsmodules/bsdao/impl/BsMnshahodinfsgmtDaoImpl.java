package ccredit.bsmodules.bsdao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.bsmodules.bsdao.BsMnshahodinfsgmtDao;
import ccredit.bsmodules.bsmodel.BsMnshahodinfsgmt;

/**
* 注册资本及主要出资人 
* 2018-04-26 11:28:45  mengbeibei
*/
@Repository("bsMnshahodinfsgmtDao")
public class BsMnshahodinfsgmtDaoImpl  extends BaseDaoImpl implements BsMnshahodinfsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<BsMnshahodinfsgmt> getBsMnshahodinfsgmtListByCondition(Map<String,Object> condition){
		return (List<BsMnshahodinfsgmt>)this.getList("getBsMnshahodinfsgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param bs_mnshahodinfsgmt_id 
	* @return
	*/
	public BsMnshahodinfsgmt getBsMnshahodinfsgmtById(String bs_mnshahodinfsgmt_id){
		return (BsMnshahodinfsgmt)this.get("getBsMnshahodinfsgmtById", bs_mnshahodinfsgmt_id);
	}
	/**
	* 添加
	* @param bs_mnshahodinfsgmt 
	* @return
	*/
	public int addBsMnshahodinfsgmt(BsMnshahodinfsgmt bsMnshahodinfsgmt){
		return this.add("addBsMnshahodinfsgmt", bsMnshahodinfsgmt);
	}
	/**
	* 修改
	* @param bs_mnshahodinfsgmt 
	* @return
	*/
	public int updateBsMnshahodinfsgmt(BsMnshahodinfsgmt bsMnshahodinfsgmt){
		return this.update("updateBsMnshahodinfsgmt", bsMnshahodinfsgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param bs_mnshahodinfsgmt 
	* @return
	*/
	public int updateBsMnshahodinfsgmtBySelective(BsMnshahodinfsgmt bsMnshahodinfsgmt){
		return this.update("updateBsMnshahodinfsgmtBySelective", bsMnshahodinfsgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delBsMnshahodinfsgmt(Map<String,Object> condition){
		return this.del("delBsMnshahodinfsgmt", condition);
	}
	/**
	* 批量添加
	* @param bs_mnshahodinfsgmtList 
	* @return
	*/
	public int addBatchBsMnshahodinfsgmt(List<BsMnshahodinfsgmt> bsMnshahodinfsgmtList){
		return this.add("addBatchBsMnshahodinfsgmt", bsMnshahodinfsgmtList);
	}
	/**
	* 批量修改
	* @param bs_mnshahodinfsgmtList 
	* @return
	*/
	public int updateBatchBsMnshahodinfsgmt(List<BsMnshahodinfsgmt> bsMnshahodinfsgmtList){
		return this.update("updateBatchBsMnshahodinfsgmt", bsMnshahodinfsgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param bs_mnshahodinfsgmtList 
	* @return
	*/
	public int updateBatchBsMnshahodinfsgmtBySelective(List<BsMnshahodinfsgmt> bsMnshahodinfsgmtList){
		return this.update("updateBatchBsMnshahodinfsgmtBySelective", bsMnshahodinfsgmtList);
	}
}
