package ccredit.bsmodules.bsservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.bsmodules.bsservice.BsFcsinfsgmtService;
import ccredit.bsmodules.bsdao.BsFcsinfsgmtDao;
import ccredit.bsmodules.bsmodel.BsFcsinfsgmt;

/**
* 基本概况信息 
* 2018-04-26 10:57:16  mengbeibei
*/
@Service("bsFcsinfsgmtService")
public class BsFcsinfsgmtServiceImpl extends BaseService implements BsFcsinfsgmtService{
	@Autowired
	private BsFcsinfsgmtDao bsFcsinfsgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<BsFcsinfsgmt> getBsFcsinfsgmtListByCondition(Map<String,Object> condition){
		try{
			return bsFcsinfsgmtDao.getBsFcsinfsgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param bs_fcsinfsgmt_id 
	* @return
	*/
	public BsFcsinfsgmt getBsFcsinfsgmtById(String bs_fcsinfsgmt_id){
		try{
			BsFcsinfsgmt bsFcsinfsgmt = bsFcsinfsgmtDao.getBsFcsinfsgmtById(bs_fcsinfsgmt_id);
			return bsFcsinfsgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param bs_fcsinfsgmt 
	* @return
	*/
	public int addBsFcsinfsgmt(BsFcsinfsgmt bsFcsinfsgmt){
		int i = 0;
		try {
			i = bsFcsinfsgmtDao.addBsFcsinfsgmt(bsFcsinfsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param bs_fcsinfsgmt 
	* @return
	*/
	public int updateBsFcsinfsgmt(BsFcsinfsgmt bsFcsinfsgmt){
		int i = 0;
		try {
			i = bsFcsinfsgmtDao.updateBsFcsinfsgmt(bsFcsinfsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param bs_fcsinfsgmt 
	* @return
	*/
	public int updateBsFcsinfsgmtBySelective(BsFcsinfsgmt bsFcsinfsgmt){
		int i = 0;
		try {
			i = bsFcsinfsgmtDao.updateBsFcsinfsgmtBySelective(bsFcsinfsgmt);
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
	public int delBsFcsinfsgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = bsFcsinfsgmtDao.delBsFcsinfsgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param bs_fcsinfsgmtList 
	* @return
	*/
	public int addBatchBsFcsinfsgmt(List<BsFcsinfsgmt> bsFcsinfsgmtList){
		int i = 0;
		try {
			i = bsFcsinfsgmtDao.addBatchBsFcsinfsgmt(bsFcsinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param bs_fcsinfsgmtList 
	* @return
	*/
	public int updateBatchBsFcsinfsgmt(List<BsFcsinfsgmt> bsFcsinfsgmtList){
		int i = 0;
		try {
			i = bsFcsinfsgmtDao.updateBatchBsFcsinfsgmt(bsFcsinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param bs_fcsinfsgmtList 
	* @return
	*/
	public int updateBatchBsFcsinfsgmtBySelective(List<BsFcsinfsgmt> bsFcsinfsgmtList){
		int i = 0;
		try {
			i = bsFcsinfsgmtDao.updateBatchBsFcsinfsgmtBySelective(bsFcsinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
