package ccredit.asmodules.asservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.asmodules.asservice.AsRltrepymtinfsgmtService;
import ccredit.asmodules.asdao.AsRltrepymtinfsgmtDao;
import ccredit.asmodules.asmodel.AsRltrepymtinfsgmt;

/**
* 企业担保账户相关还款责任人信息段 
* 2018-04-28 15:39:48  mengbeibei
*/
@Service("asRltrepymtinfsgmtService")
public class AsRltrepymtinfsgmtServiceImpl extends BaseService implements AsRltrepymtinfsgmtService{
	@Autowired
	private AsRltrepymtinfsgmtDao asRltrepymtinfsgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<AsRltrepymtinfsgmt> getAsRltrepymtinfsgmtListByCondition(Map<String,Object> condition){
		try{
			return asRltrepymtinfsgmtDao.getAsRltrepymtinfsgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param rltrepymtinfsgmt_id 
	* @return
	*/
	public AsRltrepymtinfsgmt getAsRltrepymtinfsgmtById(String rltrepymtinfsgmt_id){
		try{
			AsRltrepymtinfsgmt asRltrepymtinfsgmt = asRltrepymtinfsgmtDao.getAsRltrepymtinfsgmtById(rltrepymtinfsgmt_id);
			return asRltrepymtinfsgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param as_rltrepymtinfsgmt 
	* @return
	*/
	public int addAsRltrepymtinfsgmt(AsRltrepymtinfsgmt asRltrepymtinfsgmt){
		int i = 0;
		try {
			i = asRltrepymtinfsgmtDao.addAsRltrepymtinfsgmt(asRltrepymtinfsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param as_rltrepymtinfsgmt 
	* @return
	*/
	public int updateAsRltrepymtinfsgmt(AsRltrepymtinfsgmt asRltrepymtinfsgmt){
		int i = 0;
		try {
			i = asRltrepymtinfsgmtDao.updateAsRltrepymtinfsgmt(asRltrepymtinfsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param as_rltrepymtinfsgmt 
	* @return
	*/
	public int updateAsRltrepymtinfsgmtBySelective(AsRltrepymtinfsgmt asRltrepymtinfsgmt){
		int i = 0;
		try {
			i = asRltrepymtinfsgmtDao.updateAsRltrepymtinfsgmtBySelective(asRltrepymtinfsgmt);
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
	public int delAsRltrepymtinfsgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = asRltrepymtinfsgmtDao.delAsRltrepymtinfsgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param as_rltrepymtinfsgmtList 
	* @return
	*/
	public int addBatchAsRltrepymtinfsgmt(List<AsRltrepymtinfsgmt> asRltrepymtinfsgmtList){
		int i = 0;
		try {
			i = asRltrepymtinfsgmtDao.addBatchAsRltrepymtinfsgmt(asRltrepymtinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param as_rltrepymtinfsgmtList 
	* @return
	*/
	public int updateBatchAsRltrepymtinfsgmt(List<AsRltrepymtinfsgmt> asRltrepymtinfsgmtList){
		int i = 0;
		try {
			i = asRltrepymtinfsgmtDao.updateBatchAsRltrepymtinfsgmt(asRltrepymtinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param as_rltrepymtinfsgmtList 
	* @return
	*/
	public int updateBatchAsRltrepymtinfsgmtBySelective(List<AsRltrepymtinfsgmt> asRltrepymtinfsgmtList){
		int i = 0;
		try {
			i = asRltrepymtinfsgmtDao.updateBatchAsRltrepymtinfsgmtBySelective(asRltrepymtinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
