package ccredit.plmodules.plservice;
import java.util.List;
import java.util.Map;
import ccredit.plmodules.plmodel.PlMotgacltalbsinfsgmt;

/**
* 抵（质）押合同基本信息段 
* 2018-04-28 16:59:38  yangzhou
*/
public interface PlMotgacltalbsinfsgmtService{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<PlMotgacltalbsinfsgmt> getPlMotgacltalbsinfsgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param pl_motgacltalbsinfsgmt_id 
	* @return
	*/
	public PlMotgacltalbsinfsgmt getPlMotgacltalbsinfsgmtById(String pl_motgacltalbsinfsgmt_id);
	/**
	* 添加
	* @param pl_motgacltalbsinfsgmt 
	* @return
	*/
	public int addPlMotgacltalbsinfsgmt(PlMotgacltalbsinfsgmt plMotgacltalbsinfsgmt);
	/**
	* 修改
	* @param pl_motgacltalbsinfsgmt 
	* @return
	*/
	public int updatePlMotgacltalbsinfsgmt(PlMotgacltalbsinfsgmt plMotgacltalbsinfsgmt);
	/**
	* 修改（根据动态条件）
	* @param pl_motgacltalbsinfsgmt 
	* @return
	*/
	public int updatePlMotgacltalbsinfsgmtBySelective(PlMotgacltalbsinfsgmt plMotgacltalbsinfsgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delPlMotgacltalbsinfsgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param pl_motgacltalbsinfsgmtList 
	* @return
	*/
	public int addBatchPlMotgacltalbsinfsgmt(List<PlMotgacltalbsinfsgmt> plMotgacltalbsinfsgmtList);
	/**
	* 批量修改
	* @param pl_motgacltalbsinfsgmtList 
	* @return
	*/
	public int updateBatchPlMotgacltalbsinfsgmt(List<PlMotgacltalbsinfsgmt> plMotgacltalbsinfsgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param pl_motgacltalbsinfsgmtList 
	* @return
	*/
	public int updateBatchPlMotgacltalbsinfsgmtBySelective(List<PlMotgacltalbsinfsgmt> plMotgacltalbsinfsgmtList);
}
