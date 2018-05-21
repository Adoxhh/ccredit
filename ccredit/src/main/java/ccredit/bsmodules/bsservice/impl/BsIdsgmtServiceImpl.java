package ccredit.bsmodules.bsservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.bsmodules.bsservice.BsIdsgmtService;
import ccredit.bsmodules.bsdao.BsIdsgmtDao;
import ccredit.bsmodules.bsmodel.BsIdsgmt;

/**
* 其他标识表 
* 2018-04-26 10:26:44  mengbeibei
*/
@Service("bsIdsgmtService")
public class BsIdsgmtServiceImpl extends BaseService implements BsIdsgmtService{
	@Autowired
	private BsIdsgmtDao bsIdsgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<BsIdsgmt> getBsIdsgmtListByCondition(Map<String,Object> condition){
		try{
			return bsIdsgmtDao.getBsIdsgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param bs_idsgmt_id 
	* @return
	*/
	public BsIdsgmt getBsIdsgmtById(String bs_idsgmt_id){
		try{
			BsIdsgmt bsIdsgmt = bsIdsgmtDao.getBsIdsgmtById(bs_idsgmt_id);
			return bsIdsgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param bs_idsgmt 
	* @return
	*/
	public int addBsIdsgmt(BsIdsgmt bsIdsgmt){
		int i = 0;
		try {
			i = bsIdsgmtDao.addBsIdsgmt(bsIdsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param bs_idsgmt 
	* @return
	*/
	public int updateBsIdsgmt(BsIdsgmt bsIdsgmt){
		int i = 0;
		try {
			i = bsIdsgmtDao.updateBsIdsgmt(bsIdsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param bs_idsgmt 
	* @return
	*/
	public int updateBsIdsgmtBySelective(BsIdsgmt bsIdsgmt){
		int i = 0;
		try {
			i = bsIdsgmtDao.updateBsIdsgmtBySelective(bsIdsgmt);
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
	public int delBsIdsgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = bsIdsgmtDao.delBsIdsgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param bs_idsgmtList 
	* @return
	*/
	public int addBatchBsIdsgmt(List<BsIdsgmt> bsIdsgmtList){
		int i = 0;
		try {
			i = bsIdsgmtDao.addBatchBsIdsgmt(bsIdsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param bs_idsgmtList 
	* @return
	*/
	public int updateBatchBsIdsgmt(List<BsIdsgmt> bsIdsgmtList){
		int i = 0;
		try {
			i = bsIdsgmtDao.updateBatchBsIdsgmt(bsIdsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param bs_idsgmtList 
	* @return
	*/
	public int updateBatchBsIdsgmtBySelective(List<BsIdsgmt> bsIdsgmtList){
		int i = 0;
		try {
			i = bsIdsgmtDao.updateBatchBsIdsgmtBySelective(bsIdsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
