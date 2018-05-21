package ccredit.plmodules.pldao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.plmodules.pldao.PlCltalinfsgmtDao;
import ccredit.plmodules.plmodel.PlCltalinfsgmt;

/**
* 质物信息 
* 2018-04-28 17:08:53  yangzhou
*/
@Repository("plCltalinfsgmtDao")
public class PlCltalinfsgmtDaoImpl  extends BaseDaoImpl implements PlCltalinfsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<PlCltalinfsgmt> getPlCltalinfsgmtListByCondition(Map<String,Object> condition){
		return (List<PlCltalinfsgmt>)this.getList("getPlCltalinfsgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param pl_cltalinfsgmt_id 
	* @return
	*/
	public PlCltalinfsgmt getPlCltalinfsgmtById(String pl_cltalinfsgmt_id){
		return (PlCltalinfsgmt)this.get("getPlCltalinfsgmtById", pl_cltalinfsgmt_id);
	}
	/**
	* 添加
	* @param pl_cltalinfsgmt 
	* @return
	*/
	public int addPlCltalinfsgmt(PlCltalinfsgmt plCltalinfsgmt){
		return this.add("addPlCltalinfsgmt", plCltalinfsgmt);
	}
	/**
	* 修改
	* @param pl_cltalinfsgmt 
	* @return
	*/
	public int updatePlCltalinfsgmt(PlCltalinfsgmt plCltalinfsgmt){
		return this.update("updatePlCltalinfsgmt", plCltalinfsgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param pl_cltalinfsgmt 
	* @return
	*/
	public int updatePlCltalinfsgmtBySelective(PlCltalinfsgmt plCltalinfsgmt){
		return this.update("updatePlCltalinfsgmtBySelective", plCltalinfsgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delPlCltalinfsgmt(Map<String,Object> condition){
		return this.del("delPlCltalinfsgmt", condition);
	}
	/**
	* 批量添加
	* @param pl_cltalinfsgmtList 
	* @return
	*/
	public int addBatchPlCltalinfsgmt(List<PlCltalinfsgmt> plCltalinfsgmtList){
		return this.add("addBatchPlCltalinfsgmt", plCltalinfsgmtList);
	}
	/**
	* 批量修改
	* @param pl_cltalinfsgmtList 
	* @return
	*/
	public int updateBatchPlCltalinfsgmt(List<PlCltalinfsgmt> plCltalinfsgmtList){
		return this.update("updateBatchPlCltalinfsgmt", plCltalinfsgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param pl_cltalinfsgmtList 
	* @return
	*/
	public int updateBatchPlCltalinfsgmtBySelective(List<PlCltalinfsgmt> plCltalinfsgmtList){
		return this.update("updateBatchPlCltalinfsgmtBySelective", plCltalinfsgmtList);
	}
}
