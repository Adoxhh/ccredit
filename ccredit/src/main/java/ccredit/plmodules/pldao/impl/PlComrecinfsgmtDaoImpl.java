package ccredit.plmodules.pldao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.plmodules.pldao.PlComrecinfsgmtDao;
import ccredit.plmodules.plmodel.PlComrecinfsgmt;

/**
* 抵(质)押合同共同债务人信息 
* 2018-04-28 17:01:31  yangzhou
*/
@Repository("plComrecinfsgmtDao")
public class PlComrecinfsgmtDaoImpl  extends BaseDaoImpl implements PlComrecinfsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<PlComrecinfsgmt> getPlComrecinfsgmtListByCondition(Map<String,Object> condition){
		return (List<PlComrecinfsgmt>)this.getList("getPlComrecinfsgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param pl_comrecinfsgmt_id 
	* @return
	*/
	public PlComrecinfsgmt getPlComrecinfsgmtById(String pl_comrecinfsgmt_id){
		return (PlComrecinfsgmt)this.get("getPlComrecinfsgmtById", pl_comrecinfsgmt_id);
	}
	/**
	* 添加
	* @param pl_comrecinfsgmt 
	* @return
	*/
	public int addPlComrecinfsgmt(PlComrecinfsgmt plComrecinfsgmt){
		return this.add("addPlComrecinfsgmt", plComrecinfsgmt);
	}
	/**
	* 修改
	* @param pl_comrecinfsgmt 
	* @return
	*/
	public int updatePlComrecinfsgmt(PlComrecinfsgmt plComrecinfsgmt){
		return this.update("updatePlComrecinfsgmt", plComrecinfsgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param pl_comrecinfsgmt 
	* @return
	*/
	public int updatePlComrecinfsgmtBySelective(PlComrecinfsgmt plComrecinfsgmt){
		return this.update("updatePlComrecinfsgmtBySelective", plComrecinfsgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delPlComrecinfsgmt(Map<String,Object> condition){
		return this.del("delPlComrecinfsgmt", condition);
	}
	/**
	* 批量添加
	* @param pl_comrecinfsgmtList 
	* @return
	*/
	public int addBatchPlComrecinfsgmt(List<PlComrecinfsgmt> plComrecinfsgmtList){
		return this.add("addBatchPlComrecinfsgmt", plComrecinfsgmtList);
	}
	/**
	* 批量修改
	* @param pl_comrecinfsgmtList 
	* @return
	*/
	public int updateBatchPlComrecinfsgmt(List<PlComrecinfsgmt> plComrecinfsgmtList){
		return this.update("updateBatchPlComrecinfsgmt", plComrecinfsgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param pl_comrecinfsgmtList 
	* @return
	*/
	public int updateBatchPlComrecinfsgmtBySelective(List<PlComrecinfsgmt> plComrecinfsgmtList){
		return this.update("updateBatchPlComrecinfsgmtBySelective", plComrecinfsgmtList);
	}
}
