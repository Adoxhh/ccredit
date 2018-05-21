package ccredit.plmodules.plservice;
import java.util.List;
import java.util.Map;
import ccredit.plmodules.plmodel.PlMotgacltalctrctbssgmt;

/**
* 抵（质）押合同信息记录基础段 
* 2018-04-28 16:56:37  yangzhou
*/
public interface PlMotgacltalctrctbssgmtService{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<PlMotgacltalctrctbssgmt> getPlMotgacltalctrctbssgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param pl_motgacltalctrctbssgmt_id 
	* @return
	*/
	public PlMotgacltalctrctbssgmt getPlMotgacltalctrctbssgmtById(String pl_motgacltalctrctbssgmt_id);
	/**
	* 添加
	* @param pl_motgacltalctrctbssgmt 
	* @return
	*/
	public int addPlMotgacltalctrctbssgmt(PlMotgacltalctrctbssgmt plMotgacltalctrctbssgmt);
	/**
	* 修改
	* @param pl_motgacltalctrctbssgmt 
	* @return
	*/
	public int updatePlMotgacltalctrctbssgmt(PlMotgacltalctrctbssgmt plMotgacltalctrctbssgmt);
	/**
	* 修改（根据动态条件）
	* @param pl_motgacltalctrctbssgmt 
	* @return
	*/
	public int updatePlMotgacltalctrctbssgmtBySelective(PlMotgacltalctrctbssgmt plMotgacltalctrctbssgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delPlMotgacltalctrctbssgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param pl_motgacltalctrctbssgmtList 
	* @return
	*/
	public int addBatchPlMotgacltalctrctbssgmt(List<PlMotgacltalctrctbssgmt> plMotgacltalctrctbssgmtList);
	/**
	* 批量修改
	* @param pl_motgacltalctrctbssgmtList 
	* @return
	*/
	public int updateBatchPlMotgacltalctrctbssgmt(List<PlMotgacltalctrctbssgmt> plMotgacltalctrctbssgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param pl_motgacltalctrctbssgmtList 
	* @return
	*/
	public int updateBatchPlMotgacltalctrctbssgmtBySelective(List<PlMotgacltalctrctbssgmt> plMotgacltalctrctbssgmtList);
	
	
	/**
	* 查询历史信息
	*/
	public List<?> getHisPlListByCondition(Map<String,Object> condition);
	
}
