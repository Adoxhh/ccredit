package ccredit.bsmodules.bsservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.bsmodules.bsservice.BsSpvsgathrtyinfsgmtService;
import ccredit.bsmodules.bsdao.BsSpvsgathrtyinfsgmtDao;
import ccredit.bsmodules.bsmodel.BsSpvsgathrtyinfsgmt;

/**
* 上级机构 
* 2018-04-26 14:42:34  mengbeibei
*/
@Service("bsSpvsgathrtyinfsgmtService")
public class BsSpvsgathrtyinfsgmtServiceImpl extends BaseService implements BsSpvsgathrtyinfsgmtService{
	@Autowired
	private BsSpvsgathrtyinfsgmtDao bsSpvsgathrtyinfsgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<BsSpvsgathrtyinfsgmt> getBsSpvsgathrtyinfsgmtListByCondition(Map<String,Object> condition){
		try{
			return bsSpvsgathrtyinfsgmtDao.getBsSpvsgathrtyinfsgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param bs_spvsgathrtyinfsgmt_id 
	* @return
	*/
	public BsSpvsgathrtyinfsgmt getBsSpvsgathrtyinfsgmtById(String bs_spvsgathrtyinfsgmt_id){
		try{
			BsSpvsgathrtyinfsgmt bsSpvsgathrtyinfsgmt = bsSpvsgathrtyinfsgmtDao.getBsSpvsgathrtyinfsgmtById(bs_spvsgathrtyinfsgmt_id);
			return bsSpvsgathrtyinfsgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param bs_spvsgathrtyinfsgmt 
	* @return
	*/
	public int addBsSpvsgathrtyinfsgmt(BsSpvsgathrtyinfsgmt bsSpvsgathrtyinfsgmt){
		int i = 0;
		try {
			i = bsSpvsgathrtyinfsgmtDao.addBsSpvsgathrtyinfsgmt(bsSpvsgathrtyinfsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param bs_spvsgathrtyinfsgmt 
	* @return
	*/
	public int updateBsSpvsgathrtyinfsgmt(BsSpvsgathrtyinfsgmt bsSpvsgathrtyinfsgmt){
		int i = 0;
		try {
			i = bsSpvsgathrtyinfsgmtDao.updateBsSpvsgathrtyinfsgmt(bsSpvsgathrtyinfsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param bs_spvsgathrtyinfsgmt 
	* @return
	*/
	public int updateBsSpvsgathrtyinfsgmtBySelective(BsSpvsgathrtyinfsgmt bsSpvsgathrtyinfsgmt){
		int i = 0;
		try {
			i = bsSpvsgathrtyinfsgmtDao.updateBsSpvsgathrtyinfsgmtBySelective(bsSpvsgathrtyinfsgmt);
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
	public int delBsSpvsgathrtyinfsgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = bsSpvsgathrtyinfsgmtDao.delBsSpvsgathrtyinfsgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param bs_spvsgathrtyinfsgmtList 
	* @return
	*/
	public int addBatchBsSpvsgathrtyinfsgmt(List<BsSpvsgathrtyinfsgmt> bsSpvsgathrtyinfsgmtList){
		int i = 0;
		try {
			i = bsSpvsgathrtyinfsgmtDao.addBatchBsSpvsgathrtyinfsgmt(bsSpvsgathrtyinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param bs_spvsgathrtyinfsgmtList 
	* @return
	*/
	public int updateBatchBsSpvsgathrtyinfsgmt(List<BsSpvsgathrtyinfsgmt> bsSpvsgathrtyinfsgmtList){
		int i = 0;
		try {
			i = bsSpvsgathrtyinfsgmtDao.updateBatchBsSpvsgathrtyinfsgmt(bsSpvsgathrtyinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param bs_spvsgathrtyinfsgmtList 
	* @return
	*/
	public int updateBatchBsSpvsgathrtyinfsgmtBySelective(List<BsSpvsgathrtyinfsgmt> bsSpvsgathrtyinfsgmtList){
		int i = 0;
		try {
			i = bsSpvsgathrtyinfsgmtDao.updateBatchBsSpvsgathrtyinfsgmtBySelective(bsSpvsgathrtyinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
