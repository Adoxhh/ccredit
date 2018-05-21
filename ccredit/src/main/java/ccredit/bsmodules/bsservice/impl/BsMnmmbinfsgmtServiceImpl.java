package ccredit.bsmodules.bsservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.bsmodules.bsservice.BsMnmmbinfsgmtService;
import ccredit.bsmodules.bsdao.BsMnmmbinfsgmtDao;
import ccredit.bsmodules.bsmodel.BsMnmmbinfsgmt;

/**
* 主要组成人员 
* 2018-04-26 11:18:18  mengbeibei
*/
@Service("bsMnmmbinfsgmtService")
public class BsMnmmbinfsgmtServiceImpl extends BaseService implements BsMnmmbinfsgmtService{
	@Autowired
	private BsMnmmbinfsgmtDao bsMnmmbinfsgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<BsMnmmbinfsgmt> getBsMnmmbinfsgmtListByCondition(Map<String,Object> condition){
		try{
			return bsMnmmbinfsgmtDao.getBsMnmmbinfsgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param bs_mnmmbinfsgmt_id 
	* @return
	*/
	public BsMnmmbinfsgmt getBsMnmmbinfsgmtById(String bs_mnmmbinfsgmt_id){
		try{
			BsMnmmbinfsgmt bsMnmmbinfsgmt = bsMnmmbinfsgmtDao.getBsMnmmbinfsgmtById(bs_mnmmbinfsgmt_id);
			return bsMnmmbinfsgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param bs_mnmmbinfsgmt 
	* @return
	*/
	public int addBsMnmmbinfsgmt(BsMnmmbinfsgmt bsMnmmbinfsgmt){
		int i = 0;
		try {
			i = bsMnmmbinfsgmtDao.addBsMnmmbinfsgmt(bsMnmmbinfsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param bs_mnmmbinfsgmt 
	* @return
	*/
	public int updateBsMnmmbinfsgmt(BsMnmmbinfsgmt bsMnmmbinfsgmt){
		int i = 0;
		try {
			i = bsMnmmbinfsgmtDao.updateBsMnmmbinfsgmt(bsMnmmbinfsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param bs_mnmmbinfsgmt 
	* @return
	*/
	public int updateBsMnmmbinfsgmtBySelective(BsMnmmbinfsgmt bsMnmmbinfsgmt){
		int i = 0;
		try {
			i = bsMnmmbinfsgmtDao.updateBsMnmmbinfsgmtBySelective(bsMnmmbinfsgmt);
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
	public int delBsMnmmbinfsgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = bsMnmmbinfsgmtDao.delBsMnmmbinfsgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param bs_mnmmbinfsgmtList 
	* @return
	*/
	public int addBatchBsMnmmbinfsgmt(List<BsMnmmbinfsgmt> bsMnmmbinfsgmtList){
		int i = 0;
		try {
			i = bsMnmmbinfsgmtDao.addBatchBsMnmmbinfsgmt(bsMnmmbinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param bs_mnmmbinfsgmtList 
	* @return
	*/
	public int updateBatchBsMnmmbinfsgmt(List<BsMnmmbinfsgmt> bsMnmmbinfsgmtList){
		int i = 0;
		try {
			i = bsMnmmbinfsgmtDao.updateBatchBsMnmmbinfsgmt(bsMnmmbinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param bs_mnmmbinfsgmtList 
	* @return
	*/
	public int updateBatchBsMnmmbinfsgmtBySelective(List<BsMnmmbinfsgmt> bsMnmmbinfsgmtList){
		int i = 0;
		try {
			i = bsMnmmbinfsgmtDao.updateBatchBsMnmmbinfsgmtBySelective(bsMnmmbinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
