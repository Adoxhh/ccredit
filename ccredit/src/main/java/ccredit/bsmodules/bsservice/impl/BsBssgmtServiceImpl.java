package ccredit.bsmodules.bsservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.bsmodules.bsservice.BsBssgmtService;
import ccredit.bsmodules.bsdao.BsBssgmtDao;
import ccredit.bsmodules.bsmodel.BsBssgmt;

/**
* 企业基本信息基础段 
* 2018-04-26 09:58:53  mengbeibei
*/
@Service("bsBssgmtService")
public class BsBssgmtServiceImpl extends BaseService implements BsBssgmtService{
	@Autowired
	private BsBssgmtDao bsBssgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<BsBssgmt> getBsBssgmtListByCondition(Map<String,Object> condition){
		try{
			return bsBssgmtDao.getBsBssgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param bssgmt_id 
	* @return
	*/
	public BsBssgmt getBsBssgmtById(String bssgmt_id){
		try{
			BsBssgmt bsBssgmt = bsBssgmtDao.getBsBssgmtById(bssgmt_id);
			return bsBssgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param bs_bssgmt 
	* @return
	*/
	public int addBsBssgmt(BsBssgmt bsBssgmt){
		int i = 0;
		try {
			i = bsBssgmtDao.addBsBssgmt(bsBssgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param bs_bssgmt 
	* @return
	*/
	public int updateBsBssgmt(BsBssgmt bsBssgmt){
		int i = 0;
		try {
			i = bsBssgmtDao.updateBsBssgmt(bsBssgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param bs_bssgmt 
	* @return
	*/
	public int updateBsBssgmtBySelective(BsBssgmt bsBssgmt){
		int i = 0;
		try {
			i = bsBssgmtDao.updateBsBssgmtBySelective(bsBssgmt);
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
	public int delBsBssgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = bsBssgmtDao.delBsBssgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param bs_bssgmtList 
	* @return
	*/
	public int addBatchBsBssgmt(List<BsBssgmt> bsBssgmtList){
		int i = 0;
		try {
			i = bsBssgmtDao.addBatchBsBssgmt(bsBssgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param bs_bssgmtList 
	* @return
	*/
	public int updateBatchBsBssgmt(List<BsBssgmt> bsBssgmtList){
		int i = 0;
		try {
			i = bsBssgmtDao.updateBatchBsBssgmt(bsBssgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param bs_bssgmtList 
	* @return
	*/
	public int updateBatchBsBssgmtBySelective(List<BsBssgmt> bsBssgmtList){
		int i = 0;
		try {
			i = bsBssgmtDao.updateBatchBsBssgmtBySelective(bsBssgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	
	
	/**
	* 查询历史信息
	*/
	public List<?> getHisBsListByCondition(Map<String,Object> condition){
		try{
			return (List<?>)bsBssgmtDao.getHisBsListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
}
