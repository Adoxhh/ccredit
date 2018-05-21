package ccredit.bsmodules.bsservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.bsmodules.bsservice.BsEnicdnrltpinfService;
import ccredit.bsmodules.bsdao.BsEnicdnrltpinfDao;
import ccredit.bsmodules.bsmodel.BsEnicdnrltpinf;

/**
* 企业间关联关系信息记录 
* 2018-04-26 14:51:38  mengbeibei
*/
@Service("bsEnicdnrltpinfService")
public class BsEnicdnrltpinfServiceImpl extends BaseService implements BsEnicdnrltpinfService{
	@Autowired
	private BsEnicdnrltpinfDao bsEnicdnrltpinfDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<BsEnicdnrltpinf> getBsEnicdnrltpinfListByCondition(Map<String,Object> condition){
		try{
			return bsEnicdnrltpinfDao.getBsEnicdnrltpinfListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param enicdnrltpinf_id 
	* @return
	*/
	public BsEnicdnrltpinf getBsEnicdnrltpinfById(String enicdnrltpinf_id){
		try{
			BsEnicdnrltpinf bsEnicdnrltpinf = bsEnicdnrltpinfDao.getBsEnicdnrltpinfById(enicdnrltpinf_id);
			return bsEnicdnrltpinf;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param bs_enicdnrltpinf 
	* @return
	*/
	public int addBsEnicdnrltpinf(BsEnicdnrltpinf bsEnicdnrltpinf){
		int i = 0;
		try {
			i = bsEnicdnrltpinfDao.addBsEnicdnrltpinf(bsEnicdnrltpinf);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param bs_enicdnrltpinf 
	* @return
	*/
	public int updateBsEnicdnrltpinf(BsEnicdnrltpinf bsEnicdnrltpinf){
		int i = 0;
		try {
			i = bsEnicdnrltpinfDao.updateBsEnicdnrltpinf(bsEnicdnrltpinf);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param bs_enicdnrltpinf 
	* @return
	*/
	public int updateBsEnicdnrltpinfBySelective(BsEnicdnrltpinf bsEnicdnrltpinf){
		int i = 0;
		try {
			i = bsEnicdnrltpinfDao.updateBsEnicdnrltpinfBySelective(bsEnicdnrltpinf);
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
	public int delBsEnicdnrltpinf(Map<String,Object> condition){
		int i = 0;
		try {
			i = bsEnicdnrltpinfDao.delBsEnicdnrltpinf(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param bs_enicdnrltpinfList 
	* @return
	*/
	public int addBatchBsEnicdnrltpinf(List<BsEnicdnrltpinf> bsEnicdnrltpinfList){
		int i = 0;
		try {
			i = bsEnicdnrltpinfDao.addBatchBsEnicdnrltpinf(bsEnicdnrltpinfList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param bs_enicdnrltpinfList 
	* @return
	*/
	public int updateBatchBsEnicdnrltpinf(List<BsEnicdnrltpinf> bsEnicdnrltpinfList){
		int i = 0;
		try {
			i = bsEnicdnrltpinfDao.updateBatchBsEnicdnrltpinf(bsEnicdnrltpinfList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param bs_enicdnrltpinfList 
	* @return
	*/
	public int updateBatchBsEnicdnrltpinfBySelective(List<BsEnicdnrltpinf> bsEnicdnrltpinfList){
		int i = 0;
		try {
			i = bsEnicdnrltpinfDao.updateBatchBsEnicdnrltpinfBySelective(bsEnicdnrltpinfList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
