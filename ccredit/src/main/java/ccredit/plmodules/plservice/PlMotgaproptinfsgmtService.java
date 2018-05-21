package ccredit.plmodules.plservice;
import java.util.List;
import java.util.Map;
import ccredit.plmodules.plmodel.PlMotgaproptinfsgmt;

/**
* 抵押物信息 
* 2018-04-28 17:06:08  yangzhou
*/
public interface PlMotgaproptinfsgmtService{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<PlMotgaproptinfsgmt> getPlMotgaproptinfsgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param pl_motgaproptinfsgmt_id 
	* @return
	*/
	public PlMotgaproptinfsgmt getPlMotgaproptinfsgmtById(String pl_motgaproptinfsgmt_id);
	/**
	* 添加
	* @param pl_motgaproptinfsgmt 
	* @return
	*/
	public int addPlMotgaproptinfsgmt(PlMotgaproptinfsgmt plMotgaproptinfsgmt);
	/**
	* 修改
	* @param pl_motgaproptinfsgmt 
	* @return
	*/
	public int updatePlMotgaproptinfsgmt(PlMotgaproptinfsgmt plMotgaproptinfsgmt);
	/**
	* 修改（根据动态条件）
	* @param pl_motgaproptinfsgmt 
	* @return
	*/
	public int updatePlMotgaproptinfsgmtBySelective(PlMotgaproptinfsgmt plMotgaproptinfsgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delPlMotgaproptinfsgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param pl_motgaproptinfsgmtList 
	* @return
	*/
	public int addBatchPlMotgaproptinfsgmt(List<PlMotgaproptinfsgmt> plMotgaproptinfsgmtList);
	/**
	* 批量修改
	* @param pl_motgaproptinfsgmtList 
	* @return
	*/
	public int updateBatchPlMotgaproptinfsgmt(List<PlMotgaproptinfsgmt> plMotgaproptinfsgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param pl_motgaproptinfsgmtList 
	* @return
	*/
	public int updateBatchPlMotgaproptinfsgmtBySelective(List<PlMotgaproptinfsgmt> plMotgaproptinfsgmtList);
}
