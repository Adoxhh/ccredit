package ccredit.bsmodules.bsservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.bsmodules.bsservice.BsEnctfitginfService;
import ccredit.bsmodules.bsdao.BsEnctfitginfDao;
import ccredit.bsmodules.bsmodel.BsEnctfitginf;

/**
* 身份标识整合信息记录 
* 2018-04-26 14:47:45  mengbeibei
*/
@Service("bsEnctfitginfService")
public class BsEnctfitginfServiceImpl extends BaseService implements BsEnctfitginfService{
	@Autowired
	private BsEnctfitginfDao bsEnctfitginfDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<BsEnctfitginf> getBsEnctfitginfListByCondition(Map<String,Object> condition){
		try{
			return bsEnctfitginfDao.getBsEnctfitginfListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param enctfitginf_id 
	* @return
	*/
	public BsEnctfitginf getBsEnctfitginfById(String enctfitginf_id){
		try{
			BsEnctfitginf bsEnctfitginf = bsEnctfitginfDao.getBsEnctfitginfById(enctfitginf_id);
			return bsEnctfitginf;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param bs_enctfitginf 
	* @return
	*/
	public int addBsEnctfitginf(BsEnctfitginf bsEnctfitginf){
		int i = 0;
		try {
			i = bsEnctfitginfDao.addBsEnctfitginf(bsEnctfitginf);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param bs_enctfitginf 
	* @return
	*/
	public int updateBsEnctfitginf(BsEnctfitginf bsEnctfitginf){
		int i = 0;
		try {
			i = bsEnctfitginfDao.updateBsEnctfitginf(bsEnctfitginf);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param bs_enctfitginf 
	* @return
	*/
	public int updateBsEnctfitginfBySelective(BsEnctfitginf bsEnctfitginf){
		int i = 0;
		try {
			i = bsEnctfitginfDao.updateBsEnctfitginfBySelective(bsEnctfitginf);
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
	public int delBsEnctfitginf(Map<String,Object> condition){
		int i = 0;
		try {
			i = bsEnctfitginfDao.delBsEnctfitginf(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param bs_enctfitginfList 
	* @return
	*/
	public int addBatchBsEnctfitginf(List<BsEnctfitginf> bsEnctfitginfList){
		int i = 0;
		try {
			i = bsEnctfitginfDao.addBatchBsEnctfitginf(bsEnctfitginfList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param bs_enctfitginfList 
	* @return
	*/
	public int updateBatchBsEnctfitginf(List<BsEnctfitginf> bsEnctfitginfList){
		int i = 0;
		try {
			i = bsEnctfitginfDao.updateBatchBsEnctfitginf(bsEnctfitginfList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param bs_enctfitginfList 
	* @return
	*/
	public int updateBatchBsEnctfitginfBySelective(List<BsEnctfitginf> bsEnctfitginfList){
		int i = 0;
		try {
			i = bsEnctfitginfDao.updateBatchBsEnctfitginfBySelective(bsEnctfitginfList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
