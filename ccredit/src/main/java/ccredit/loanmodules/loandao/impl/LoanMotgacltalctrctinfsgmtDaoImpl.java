package ccredit.loanmodules.loandao.impl;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.loanmodules.loandao.LoanMotgacltalctrctinfsgmtDao;
import ccredit.loanmodules.loanmodel.LoanMotgacltalctrctinfsgmt;

/**
* 抵质押物信息 
* 2018-04-27 16:27:40  yangzhou
*/
@Repository("loanMotgacltalctrctinfsgmtDao")
public class LoanMotgacltalctrctinfsgmtDaoImpl  extends BaseDaoImpl implements LoanMotgacltalctrctinfsgmtDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<LoanMotgacltalctrctinfsgmt> getLoanMotgacltalctrctinfsgmtListByCondition(Map<String,Object> condition){
		return (List<LoanMotgacltalctrctinfsgmt>)this.getList("getLoanMotgacltalctrctinfsgmtListByCondition",condition);
	}
	/**
	* 查询对象
	* @param loan_motgacltalctrctinfsgmt_id 
	* @return
	*/
	public LoanMotgacltalctrctinfsgmt getLoanMotgacltalctrctinfsgmtById(String loan_motgacltalctrctinfsgmt_id){
		return (LoanMotgacltalctrctinfsgmt)this.get("getLoanMotgacltalctrctinfsgmtById", loan_motgacltalctrctinfsgmt_id);
	}
	/**
	* 添加
	* @param loan_motgacltalctrctinfsgmt 
	* @return
	*/
	public int addLoanMotgacltalctrctinfsgmt(LoanMotgacltalctrctinfsgmt loanMotgacltalctrctinfsgmt){
		return this.add("addLoanMotgacltalctrctinfsgmt", loanMotgacltalctrctinfsgmt);
	}
	/**
	* 修改
	* @param loan_motgacltalctrctinfsgmt 
	* @return
	*/
	public int updateLoanMotgacltalctrctinfsgmt(LoanMotgacltalctrctinfsgmt loanMotgacltalctrctinfsgmt){
		return this.update("updateLoanMotgacltalctrctinfsgmt", loanMotgacltalctrctinfsgmt);
	}
	/**
	* 修改（根据动态条件）
	* @param loan_motgacltalctrctinfsgmt 
	* @return
	*/
	public int updateLoanMotgacltalctrctinfsgmtBySelective(LoanMotgacltalctrctinfsgmt loanMotgacltalctrctinfsgmt){
		return this.update("updateLoanMotgacltalctrctinfsgmtBySelective", loanMotgacltalctrctinfsgmt);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delLoanMotgacltalctrctinfsgmt(Map<String,Object> condition){
		return this.del("delLoanMotgacltalctrctinfsgmt", condition);
	}
	/**
	* 批量添加
	* @param loan_motgacltalctrctinfsgmtList 
	* @return
	*/
	public int addBatchLoanMotgacltalctrctinfsgmt(List<LoanMotgacltalctrctinfsgmt> loanMotgacltalctrctinfsgmtList){
		return this.add("addBatchLoanMotgacltalctrctinfsgmt", loanMotgacltalctrctinfsgmtList);
	}
	/**
	* 批量修改
	* @param loan_motgacltalctrctinfsgmtList 
	* @return
	*/
	public int updateBatchLoanMotgacltalctrctinfsgmt(List<LoanMotgacltalctrctinfsgmt> loanMotgacltalctrctinfsgmtList){
		return this.update("updateBatchLoanMotgacltalctrctinfsgmt", loanMotgacltalctrctinfsgmtList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param loan_motgacltalctrctinfsgmtList 
	* @return
	*/
	public int updateBatchLoanMotgacltalctrctinfsgmtBySelective(List<LoanMotgacltalctrctinfsgmt> loanMotgacltalctrctinfsgmtList){
		return this.update("updateBatchLoanMotgacltalctrctinfsgmtBySelective", loanMotgacltalctrctinfsgmtList);
	}
}
