package ccredit.bsmodules.bsservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.bsmodules.bsservice.BsCotainfsgmtService;
import ccredit.bsmodules.bsdao.BsCotainfsgmtDao;
import ccredit.bsmodules.bsmodel.BsCotainfsgmt;

/**
* 联系方式 
* 2018-04-26 14:44:28  mengbeibei
*/
@Service("bsCotainfsgmtService")
public class BsCotainfsgmtServiceImpl extends BaseService implements BsCotainfsgmtService{
	@Autowired
	private BsCotainfsgmtDao bsCotainfsgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<BsCotainfsgmt> getBsCotainfsgmtListByCondition(Map<String,Object> condition){
		try{
			return bsCotainfsgmtDao.getBsCotainfsgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param bs_cotainfsgmt_id 
	* @return
	*/
	public BsCotainfsgmt getBsCotainfsgmtById(String bs_cotainfsgmt_id){
		try{
			BsCotainfsgmt bsCotainfsgmt = bsCotainfsgmtDao.getBsCotainfsgmtById(bs_cotainfsgmt_id);
			return bsCotainfsgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param bs_cotainfsgmt 
	* @return
	*/
	public int addBsCotainfsgmt(BsCotainfsgmt bsCotainfsgmt){
		int i = 0;
		try {
			i = bsCotainfsgmtDao.addBsCotainfsgmt(bsCotainfsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param bs_cotainfsgmt 
	* @return
	*/
	public int updateBsCotainfsgmt(BsCotainfsgmt bsCotainfsgmt){
		int i = 0;
		try {
			i = bsCotainfsgmtDao.updateBsCotainfsgmt(bsCotainfsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param bs_cotainfsgmt 
	* @return
	*/
	public int updateBsCotainfsgmtBySelective(BsCotainfsgmt bsCotainfsgmt){
		int i = 0;
		try {
			i = bsCotainfsgmtDao.updateBsCotainfsgmtBySelective(bsCotainfsgmt);
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
	public int delBsCotainfsgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = bsCotainfsgmtDao.delBsCotainfsgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param bs_cotainfsgmtList 
	* @return
	*/
	public int addBatchBsCotainfsgmt(List<BsCotainfsgmt> bsCotainfsgmtList){
		int i = 0;
		try {
			i = bsCotainfsgmtDao.addBatchBsCotainfsgmt(bsCotainfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param bs_cotainfsgmtList 
	* @return
	*/
	public int updateBatchBsCotainfsgmt(List<BsCotainfsgmt> bsCotainfsgmtList){
		int i = 0;
		try {
			i = bsCotainfsgmtDao.updateBatchBsCotainfsgmt(bsCotainfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param bs_cotainfsgmtList 
	* @return
	*/
	public int updateBatchBsCotainfsgmtBySelective(List<BsCotainfsgmt> bsCotainfsgmtList){
		int i = 0;
		try {
			i = bsCotainfsgmtDao.updateBatchBsCotainfsgmtBySelective(bsCotainfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
