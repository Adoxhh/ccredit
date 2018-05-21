package ccredit.plmodules.plservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.plmodules.plservice.PlComrecinfsgmtService;
import ccredit.plmodules.pldao.PlComrecinfsgmtDao;
import ccredit.plmodules.plmodel.PlComrecinfsgmt;

/**
* 抵(质)押合同共同债务人信息 
* 2018-04-28 17:01:31  yangzhou
*/
@Service("plComrecinfsgmtService")
public class PlComrecinfsgmtServiceImpl extends BaseService implements PlComrecinfsgmtService{
	@Autowired
	private PlComrecinfsgmtDao plComrecinfsgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<PlComrecinfsgmt> getPlComrecinfsgmtListByCondition(Map<String,Object> condition){
		try{
			return plComrecinfsgmtDao.getPlComrecinfsgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param pl_comrecinfsgmt_id 
	* @return
	*/
	public PlComrecinfsgmt getPlComrecinfsgmtById(String pl_comrecinfsgmt_id){
		try{
			PlComrecinfsgmt plComrecinfsgmt = plComrecinfsgmtDao.getPlComrecinfsgmtById(pl_comrecinfsgmt_id);
			return plComrecinfsgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param pl_comrecinfsgmt 
	* @return
	*/
	public int addPlComrecinfsgmt(PlComrecinfsgmt plComrecinfsgmt){
		int i = 0;
		try {
			i = plComrecinfsgmtDao.addPlComrecinfsgmt(plComrecinfsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param pl_comrecinfsgmt 
	* @return
	*/
	public int updatePlComrecinfsgmt(PlComrecinfsgmt plComrecinfsgmt){
		int i = 0;
		try {
			i = plComrecinfsgmtDao.updatePlComrecinfsgmt(plComrecinfsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param pl_comrecinfsgmt 
	* @return
	*/
	public int updatePlComrecinfsgmtBySelective(PlComrecinfsgmt plComrecinfsgmt){
		int i = 0;
		try {
			i = plComrecinfsgmtDao.updatePlComrecinfsgmtBySelective(plComrecinfsgmt);
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
	public int delPlComrecinfsgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = plComrecinfsgmtDao.delPlComrecinfsgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param pl_comrecinfsgmtList 
	* @return
	*/
	public int addBatchPlComrecinfsgmt(List<PlComrecinfsgmt> plComrecinfsgmtList){
		int i = 0;
		try {
			i = plComrecinfsgmtDao.addBatchPlComrecinfsgmt(plComrecinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param pl_comrecinfsgmtList 
	* @return
	*/
	public int updateBatchPlComrecinfsgmt(List<PlComrecinfsgmt> plComrecinfsgmtList){
		int i = 0;
		try {
			i = plComrecinfsgmtDao.updateBatchPlComrecinfsgmt(plComrecinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param pl_comrecinfsgmtList 
	* @return
	*/
	public int updateBatchPlComrecinfsgmtBySelective(List<PlComrecinfsgmt> plComrecinfsgmtList){
		int i = 0;
		try {
			i = plComrecinfsgmtDao.updateBatchPlComrecinfsgmtBySelective(plComrecinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
