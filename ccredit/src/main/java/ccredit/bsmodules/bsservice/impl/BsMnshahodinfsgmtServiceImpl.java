package ccredit.bsmodules.bsservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.bsmodules.bsservice.BsMnshahodinfsgmtService;
import ccredit.bsmodules.bsdao.BsMnshahodinfsgmtDao;
import ccredit.bsmodules.bsmodel.BsMnshahodinfsgmt;

/**
* 注册资本及主要出资人 
* 2018-04-26 11:28:45  mengbeibei
*/
@Service("bsMnshahodinfsgmtService")
public class BsMnshahodinfsgmtServiceImpl extends BaseService implements BsMnshahodinfsgmtService{
	@Autowired
	private BsMnshahodinfsgmtDao bsMnshahodinfsgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<BsMnshahodinfsgmt> getBsMnshahodinfsgmtListByCondition(Map<String,Object> condition){
		try{
			return bsMnshahodinfsgmtDao.getBsMnshahodinfsgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param bs_mnshahodinfsgmt_id 
	* @return
	*/
	public BsMnshahodinfsgmt getBsMnshahodinfsgmtById(String bs_mnshahodinfsgmt_id){
		try{
			BsMnshahodinfsgmt bsMnshahodinfsgmt = bsMnshahodinfsgmtDao.getBsMnshahodinfsgmtById(bs_mnshahodinfsgmt_id);
			return bsMnshahodinfsgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param bs_mnshahodinfsgmt 
	* @return
	*/
	public int addBsMnshahodinfsgmt(BsMnshahodinfsgmt bsMnshahodinfsgmt){
		int i = 0;
		try {
			i = bsMnshahodinfsgmtDao.addBsMnshahodinfsgmt(bsMnshahodinfsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param bs_mnshahodinfsgmt 
	* @return
	*/
	public int updateBsMnshahodinfsgmt(BsMnshahodinfsgmt bsMnshahodinfsgmt){
		int i = 0;
		try {
			i = bsMnshahodinfsgmtDao.updateBsMnshahodinfsgmt(bsMnshahodinfsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param bs_mnshahodinfsgmt 
	* @return
	*/
	public int updateBsMnshahodinfsgmtBySelective(BsMnshahodinfsgmt bsMnshahodinfsgmt){
		int i = 0;
		try {
			i = bsMnshahodinfsgmtDao.updateBsMnshahodinfsgmtBySelective(bsMnshahodinfsgmt);
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
	public int delBsMnshahodinfsgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = bsMnshahodinfsgmtDao.delBsMnshahodinfsgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param bs_mnshahodinfsgmtList 
	* @return
	*/
	public int addBatchBsMnshahodinfsgmt(List<BsMnshahodinfsgmt> bsMnshahodinfsgmtList){
		int i = 0;
		try {
			i = bsMnshahodinfsgmtDao.addBatchBsMnshahodinfsgmt(bsMnshahodinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param bs_mnshahodinfsgmtList 
	* @return
	*/
	public int updateBatchBsMnshahodinfsgmt(List<BsMnshahodinfsgmt> bsMnshahodinfsgmtList){
		int i = 0;
		try {
			i = bsMnshahodinfsgmtDao.updateBatchBsMnshahodinfsgmt(bsMnshahodinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param bs_mnshahodinfsgmtList 
	* @return
	*/
	public int updateBatchBsMnshahodinfsgmtBySelective(List<BsMnshahodinfsgmt> bsMnshahodinfsgmtList){
		int i = 0;
		try {
			i = bsMnshahodinfsgmtDao.updateBatchBsMnshahodinfsgmtBySelective(bsMnshahodinfsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
