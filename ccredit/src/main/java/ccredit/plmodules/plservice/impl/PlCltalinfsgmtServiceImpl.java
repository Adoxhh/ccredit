package ccredit.plmodules.plservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.plmodules.plservice.PlCltalinfsgmtService;
import ccredit.plmodules.pldao.PlCltalinfsgmtDao;
import ccredit.plmodules.plmodel.PlCltalinfsgmt;

/**
* 质物信息 
* 2018-04-28 17:08:53  yangzhou
*/
@Service("plCltalinfsgmtService")
public class PlCltalinfsgmtServiceImpl extends BaseService implements PlCltalinfsgmtService{
	@Autowired
	private PlCltalinfsgmtDao plCltalinfsgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<PlCltalinfsgmt> getPlCltalinfsgmtListByCondition(Map<String,Object> condition){
		try{
			return plCltalinfsgmtDao.getPlCltalinfsgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param pl_cltalinfsgmt_id 
	* @return
	*/
	public PlCltalinfsgmt getPlCltalinfsgmtById(String pl_cltalinfsgmt_id){
		try{
			PlCltalinfsgmt plCltalinfsgmt = plCltalinfsgmtDao.getPlCltalinfsgmtById(pl_cltalinfsgmt_id);
			return plCltalinfsgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param pl_cltalinfsgmt 
	* @return
	*/
	public int addPlCltalinfsgmt(PlCltalinfsgmt plCltalinfsgmt){
		int i = 0;
		try {
			i = plCltalinfsgmtDao.addPlCltalinfsgmt(plCltalinfsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param pl_cltalinfsgmt 
	* @return
	*/
	public int updatePlCltalinfsgmt(PlCltalinfsgmt plCltalinfsgmt){
		int i = 0;
		try {
			i = plCltalinfsgmtDao.updatePlCltalinfsgmt(plCltalinfsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param pl_cltalinfsgmt 
	* @return
	*/
	public int updatePlCltalinfsgmtBySelective(PlCltalinfsgmt plCltalinfsgmt){
		int i = 0;
		try {
			i = plCltalinfsgmtDao.updatePlCltalinfsgmtBySelective(plCltalinfsgmt);
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
	public int delPlCltalinfsgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = plCltalinfsgmtDao.delPlCltalinfsgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param pl_cltalinfsgmtList 
	* @return
	*/
	public int addBatchPlCltalinfsgmt(List<PlCltalinfsgmt> plCltalinfsgmtList){
		int i = 0;
		try {
			i = plCltalinfsgmtDao.addBatchPlCltalinfsgmt(plCltalinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param pl_cltalinfsgmtList 
	* @return
	*/
	public int updateBatchPlCltalinfsgmt(List<PlCltalinfsgmt> plCltalinfsgmtList){
		int i = 0;
		try {
			i = plCltalinfsgmtDao.updateBatchPlCltalinfsgmt(plCltalinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param pl_cltalinfsgmtList 
	* @return
	*/
	public int updateBatchPlCltalinfsgmtBySelective(List<PlCltalinfsgmt> plCltalinfsgmtList){
		int i = 0;
		try {
			i = plCltalinfsgmtDao.updateBatchPlCltalinfsgmtBySelective(plCltalinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
