package ccredit.plmodules.plservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.plmodules.plservice.PlMotgaproptinfsgmtService;
import ccredit.plmodules.pldao.PlMotgaproptinfsgmtDao;
import ccredit.plmodules.plmodel.PlMotgaproptinfsgmt;

/**
* 抵押物信息 
* 2018-04-28 17:06:08  yangzhou
*/
@Service("plMotgaproptinfsgmtService")
public class PlMotgaproptinfsgmtServiceImpl extends BaseService implements PlMotgaproptinfsgmtService{
	@Autowired
	private PlMotgaproptinfsgmtDao plMotgaproptinfsgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<PlMotgaproptinfsgmt> getPlMotgaproptinfsgmtListByCondition(Map<String,Object> condition){
		try{
			return plMotgaproptinfsgmtDao.getPlMotgaproptinfsgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param pl_motgaproptinfsgmt_id 
	* @return
	*/
	public PlMotgaproptinfsgmt getPlMotgaproptinfsgmtById(String pl_motgaproptinfsgmt_id){
		try{
			PlMotgaproptinfsgmt plMotgaproptinfsgmt = plMotgaproptinfsgmtDao.getPlMotgaproptinfsgmtById(pl_motgaproptinfsgmt_id);
			return plMotgaproptinfsgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param pl_motgaproptinfsgmt 
	* @return
	*/
	public int addPlMotgaproptinfsgmt(PlMotgaproptinfsgmt plMotgaproptinfsgmt){
		int i = 0;
		try {
			i = plMotgaproptinfsgmtDao.addPlMotgaproptinfsgmt(plMotgaproptinfsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param pl_motgaproptinfsgmt 
	* @return
	*/
	public int updatePlMotgaproptinfsgmt(PlMotgaproptinfsgmt plMotgaproptinfsgmt){
		int i = 0;
		try {
			i = plMotgaproptinfsgmtDao.updatePlMotgaproptinfsgmt(plMotgaproptinfsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param pl_motgaproptinfsgmt 
	* @return
	*/
	public int updatePlMotgaproptinfsgmtBySelective(PlMotgaproptinfsgmt plMotgaproptinfsgmt){
		int i = 0;
		try {
			i = plMotgaproptinfsgmtDao.updatePlMotgaproptinfsgmtBySelective(plMotgaproptinfsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delPlMotgaproptinfsgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = plMotgaproptinfsgmtDao.delPlMotgaproptinfsgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param pl_motgaproptinfsgmtList 
	* @return
	*/
	public int addBatchPlMotgaproptinfsgmt(List<PlMotgaproptinfsgmt> plMotgaproptinfsgmtList){
		int i = 0;
		try {
			i = plMotgaproptinfsgmtDao.addBatchPlMotgaproptinfsgmt(plMotgaproptinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param pl_motgaproptinfsgmtList 
	* @return
	*/
	public int updateBatchPlMotgaproptinfsgmt(List<PlMotgaproptinfsgmt> plMotgaproptinfsgmtList){
		int i = 0;
		try {
			i = plMotgaproptinfsgmtDao.updateBatchPlMotgaproptinfsgmt(plMotgaproptinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param pl_motgaproptinfsgmtList 
	* @return
	*/
	public int updateBatchPlMotgaproptinfsgmtBySelective(List<PlMotgaproptinfsgmt> plMotgaproptinfsgmtList){
		int i = 0;
		try {
			i = plMotgaproptinfsgmtDao.updateBatchPlMotgaproptinfsgmtBySelective(plMotgaproptinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
