package ccredit.finmodules.finservice.impl;
import java.util.List;
import java.util.Map;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ccredit.finmodules.finservice.FinInstitutionbalancesheetsgmtService;
import ccredit.finmodules.findao.FinInstitutionbalancesheetsgmtDao;
import ccredit.finmodules.finmodel.FinInstitutionbalancesheetsgmt;

/**
* 事业单位资产负债表 
* 2018-05-03 15:05:22  yangzhou
*/
@Service("finInstitutionbalancesheetsgmtService")
public class FinInstitutionbalancesheetsgmtServiceImpl extends BaseService implements FinInstitutionbalancesheetsgmtService{
	@Autowired
	private FinInstitutionbalancesheetsgmtDao finInstitutionbalancesheetsgmtDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<FinInstitutionbalancesheetsgmt> getFinInstitutionbalancesheetsgmtListByCondition(Map<String,Object> condition){
		try{
			return finInstitutionbalancesheetsgmtDao.getFinInstitutionbalancesheetsgmtListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param fin_institutionbalancesheetsgmt_id 
	* @return
	*/
	public FinInstitutionbalancesheetsgmt getFinInstitutionbalancesheetsgmtById(String fin_institutionbalancesheetsgmt_id){
		try{
			FinInstitutionbalancesheetsgmt finInstitutionbalancesheetsgmt = finInstitutionbalancesheetsgmtDao.getFinInstitutionbalancesheetsgmtById(fin_institutionbalancesheetsgmt_id);
			return finInstitutionbalancesheetsgmt;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param fin_institutionbalancesheetsgmt 
	* @return
	*/
	public int addFinInstitutionbalancesheetsgmt(FinInstitutionbalancesheetsgmt finInstitutionbalancesheetsgmt){
		int i = 0;
		try {
			i = finInstitutionbalancesheetsgmtDao.addFinInstitutionbalancesheetsgmt(finInstitutionbalancesheetsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param fin_institutionbalancesheetsgmt 
	* @return
	*/
	public int updateFinInstitutionbalancesheetsgmt(FinInstitutionbalancesheetsgmt finInstitutionbalancesheetsgmt){
		int i = 0;
		try {
			i = finInstitutionbalancesheetsgmtDao.updateFinInstitutionbalancesheetsgmt(finInstitutionbalancesheetsgmt);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param fin_institutionbalancesheetsgmt 
	* @return
	*/
	public int updateFinInstitutionbalancesheetsgmtBySelective(FinInstitutionbalancesheetsgmt finInstitutionbalancesheetsgmt){
		int i = 0;
		try {
			i = finInstitutionbalancesheetsgmtDao.updateFinInstitutionbalancesheetsgmtBySelective(finInstitutionbalancesheetsgmt);
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
	public int delFinInstitutionbalancesheetsgmt(Map<String,Object> condition){
		int i = 0;
		try {
			i = finInstitutionbalancesheetsgmtDao.delFinInstitutionbalancesheetsgmt(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param fin_institutionbalancesheetsgmtList 
	* @return
	*/
	public int addBatchFinInstitutionbalancesheetsgmt(List<FinInstitutionbalancesheetsgmt> finInstitutionbalancesheetsgmtList){
		int i = 0;
		try {
			i = finInstitutionbalancesheetsgmtDao.addBatchFinInstitutionbalancesheetsgmt(finInstitutionbalancesheetsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param fin_institutionbalancesheetsgmtList 
	* @return
	*/
	public int updateBatchFinInstitutionbalancesheetsgmt(List<FinInstitutionbalancesheetsgmt> finInstitutionbalancesheetsgmtList){
		int i = 0;
		try {
			i = finInstitutionbalancesheetsgmtDao.updateBatchFinInstitutionbalancesheetsgmt(finInstitutionbalancesheetsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param fin_institutionbalancesheetsgmtList 
	* @return
	*/
	public int updateBatchFinInstitutionbalancesheetsgmtBySelective(List<FinInstitutionbalancesheetsgmt> finInstitutionbalancesheetsgmtList){
		int i = 0;
		try {
			i = finInstitutionbalancesheetsgmtDao.updateBatchFinInstitutionbalancesheetsgmtBySelective(finInstitutionbalancesheetsgmtList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
