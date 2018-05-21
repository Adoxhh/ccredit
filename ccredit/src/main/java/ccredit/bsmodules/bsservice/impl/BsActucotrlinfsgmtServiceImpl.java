package ccredit.bsmodules.bsservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.bsmodules.bsservice.BsActucotrlinfsgmtService;
import ccredit.bsmodules.bsdao.BsActucotrlinfsgmtDao;
import ccredit.bsmodules.bsmodel.BsActucotrlinfsgmt;

/**
* 实际控制人 
* 2018-04-26 14:38:51  mengbeibei
*/
@Service("bsActucotrlinfsgmtService")
public class BsActucotrlinfsgmtServiceImpl extends BaseService implements BsActucotrlinfsgmtService{
	@Autowired
	private BsActucotrlinfsgmtDao bsActucotrlinfsgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<BsActucotrlinfsgmt> getBsActucotrlinfsgmtListByCondition(Map<String,Object> condition){
		try{
			return bsActucotrlinfsgmtDao.getBsActucotrlinfsgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param bs_actucotrlinfsgmt_id 
	* @return
	*/
	public BsActucotrlinfsgmt getBsActucotrlinfsgmtById(String bs_actucotrlinfsgmt_id){
		try{
			BsActucotrlinfsgmt bsActucotrlinfsgmt = bsActucotrlinfsgmtDao.getBsActucotrlinfsgmtById(bs_actucotrlinfsgmt_id);
			return bsActucotrlinfsgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param bs_actucotrlinfsgmt 
	* @return
	*/
	public int addBsActucotrlinfsgmt(BsActucotrlinfsgmt bsActucotrlinfsgmt){
		int i = 0;
		try {
			i = bsActucotrlinfsgmtDao.addBsActucotrlinfsgmt(bsActucotrlinfsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param bs_actucotrlinfsgmt 
	* @return
	*/
	public int updateBsActucotrlinfsgmt(BsActucotrlinfsgmt bsActucotrlinfsgmt){
		int i = 0;
		try {
			i = bsActucotrlinfsgmtDao.updateBsActucotrlinfsgmt(bsActucotrlinfsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param bs_actucotrlinfsgmt 
	* @return
	*/
	public int updateBsActucotrlinfsgmtBySelective(BsActucotrlinfsgmt bsActucotrlinfsgmt){
		int i = 0;
		try {
			i = bsActucotrlinfsgmtDao.updateBsActucotrlinfsgmtBySelective(bsActucotrlinfsgmt);
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
	public int delBsActucotrlinfsgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = bsActucotrlinfsgmtDao.delBsActucotrlinfsgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param bs_actucotrlinfsgmtList 
	* @return
	*/
	public int addBatchBsActucotrlinfsgmt(List<BsActucotrlinfsgmt> bsActucotrlinfsgmtList){
		int i = 0;
		try {
			i = bsActucotrlinfsgmtDao.addBatchBsActucotrlinfsgmt(bsActucotrlinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param bs_actucotrlinfsgmtList 
	* @return
	*/
	public int updateBatchBsActucotrlinfsgmt(List<BsActucotrlinfsgmt> bsActucotrlinfsgmtList){
		int i = 0;
		try {
			i = bsActucotrlinfsgmtDao.updateBatchBsActucotrlinfsgmt(bsActucotrlinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param bs_actucotrlinfsgmtList 
	* @return
	*/
	public int updateBatchBsActucotrlinfsgmtBySelective(List<BsActucotrlinfsgmt> bsActucotrlinfsgmtList){
		int i = 0;
		try {
			i = bsActucotrlinfsgmtDao.updateBatchBsActucotrlinfsgmtBySelective(bsActucotrlinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
