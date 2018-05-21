package ccredit.plmodules.pldao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.plmodules.pldao.PlMotgacltalctrctbssgmtDao;
import ccredit.plmodules.plmodel.PlMotgacltalctrctbssgmt;

/**
* 抵（质）押合同信息记录基础段 
* 2018-04-28 16:56:37  yangzhou
*/
@Repository("plMotgacltalctrctbssgmtDao")
public class PlMotgacltalctrctbssgmtDaoImpl  extends BaseDaoImpl implements PlMotgacltalctrctbssgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<PlMotgacltalctrctbssgmt> getPlMotgacltalctrctbssgmtListByCondition(Map<String,Object> condition){
		return (List<PlMotgacltalctrctbssgmt>)this.getList("getPlMotgacltalctrctbssgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param pl_motgacltalctrctbssgmt_id 
	* @return
	*/
	public PlMotgacltalctrctbssgmt getPlMotgacltalctrctbssgmtById(String pl_motgacltalctrctbssgmt_id){
		return (PlMotgacltalctrctbssgmt)this.get("getPlMotgacltalctrctbssgmtById", pl_motgacltalctrctbssgmt_id);
	}
	/**
	* 添加
	* @param pl_motgacltalctrctbssgmt 
	* @return
	*/
	public int addPlMotgacltalctrctbssgmt(PlMotgacltalctrctbssgmt plMotgacltalctrctbssgmt){
		return this.add("addPlMotgacltalctrctbssgmt", plMotgacltalctrctbssgmt);
	}
	/**
	* 修改
	* @param pl_motgacltalctrctbssgmt 
	* @return
	*/
	public int updatePlMotgacltalctrctbssgmt(PlMotgacltalctrctbssgmt plMotgacltalctrctbssgmt){
		return this.update("updatePlMotgacltalctrctbssgmt", plMotgacltalctrctbssgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param pl_motgacltalctrctbssgmt 
	* @return
	*/
	public int updatePlMotgacltalctrctbssgmtBySelective(PlMotgacltalctrctbssgmt plMotgacltalctrctbssgmt){
		return this.update("updatePlMotgacltalctrctbssgmtBySelective", plMotgacltalctrctbssgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delPlMotgacltalctrctbssgmt(Map<String,Object> condition){
		return this.del("delPlMotgacltalctrctbssgmt", condition);
	}
	/**
	* 批量添加
	* @param pl_motgacltalctrctbssgmtList 
	* @return
	*/
	public int addBatchPlMotgacltalctrctbssgmt(List<PlMotgacltalctrctbssgmt> plMotgacltalctrctbssgmtList){
		return this.add("addBatchPlMotgacltalctrctbssgmt", plMotgacltalctrctbssgmtList);
	}
	/**
	* 批量修改
	* @param pl_motgacltalctrctbssgmtList 
	* @return
	*/
	public int updateBatchPlMotgacltalctrctbssgmt(List<PlMotgacltalctrctbssgmt> plMotgacltalctrctbssgmtList){
		return this.update("updateBatchPlMotgacltalctrctbssgmt", plMotgacltalctrctbssgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param pl_motgacltalctrctbssgmtList 
	* @return
	*/
	public int updateBatchPlMotgacltalctrctbssgmtBySelective(List<PlMotgacltalctrctbssgmt> plMotgacltalctrctbssgmtList){
		return this.update("updateBatchPlMotgacltalctrctbssgmtBySelective", plMotgacltalctrctbssgmtList);
	}
	
	
	/**
	 * 查询历史信息
	 */
	public  List<?> getHisPlListByCondition(Map<String,Object> condition){
		String tablename = (String) condition.get("table");
		return (List<?>)this.getList(tablename,condition);
	}
}
