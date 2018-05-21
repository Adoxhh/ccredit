package ccredit.plmodules.plservice;
import java.util.List;
import java.util.Map;
import ccredit.plmodules.plmodel.PlCltalinfsgmt;

/**
* 质物信息 
* 2018-04-28 17:08:53  yangzhou
*/
public interface PlCltalinfsgmtService{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<PlCltalinfsgmt> getPlCltalinfsgmtListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param pl_cltalinfsgmt_id 
	* @return
	*/
	public PlCltalinfsgmt getPlCltalinfsgmtById(String pl_cltalinfsgmt_id);
	/**
	* 添加
	* @param pl_cltalinfsgmt 
	* @return
	*/
	public int addPlCltalinfsgmt(PlCltalinfsgmt plCltalinfsgmt);
	/**
	* 修改
	* @param pl_cltalinfsgmt 
	* @return
	*/
	public int updatePlCltalinfsgmt(PlCltalinfsgmt plCltalinfsgmt);
	/**
	* 修改（根据动态条件）
	* @param pl_cltalinfsgmt 
	* @return
	*/
	public int updatePlCltalinfsgmtBySelective(PlCltalinfsgmt plCltalinfsgmt);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delPlCltalinfsgmt(Map<String,Object> condition);
	/**
	* 批量添加
	* @param pl_cltalinfsgmtList 
	* @return
	*/
	public int addBatchPlCltalinfsgmt(List<PlCltalinfsgmt> plCltalinfsgmtList);
	/**
	* 批量修改
	* @param pl_cltalinfsgmtList 
	* @return
	*/
	public int updateBatchPlCltalinfsgmt(List<PlCltalinfsgmt> plCltalinfsgmtList);
	/**
	* 批量修改（根据动态条件）
	* @param pl_cltalinfsgmtList 
	* @return
	*/
	public int updateBatchPlCltalinfsgmtBySelective(List<PlCltalinfsgmt> plCltalinfsgmtList);
}
