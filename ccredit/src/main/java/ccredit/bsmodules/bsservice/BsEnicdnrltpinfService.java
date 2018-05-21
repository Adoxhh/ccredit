package ccredit.bsmodules.bsservice;
import java.util.List;
import java.util.Map;
import ccredit.bsmodules.bsmodel.BsEnicdnrltpinf;

/**
* 企业间关联关系信息记录 
* 2018-04-26 14:51:38  mengbeibei
*/
public interface BsEnicdnrltpinfService{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<BsEnicdnrltpinf> getBsEnicdnrltpinfListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param enicdnrltpinf_id 
	* @return
	*/
	public BsEnicdnrltpinf getBsEnicdnrltpinfById(String enicdnrltpinf_id);
	/**
	* 添加
	* @param bs_enicdnrltpinf 
	* @return
	*/
	public int addBsEnicdnrltpinf(BsEnicdnrltpinf bsEnicdnrltpinf);
	/**
	* 修改
	* @param bs_enicdnrltpinf 
	* @return
	*/
	public int updateBsEnicdnrltpinf(BsEnicdnrltpinf bsEnicdnrltpinf);
	/**
	* 修改（根据动态条件）
	* @param bs_enicdnrltpinf 
	* @return
	*/
	public int updateBsEnicdnrltpinfBySelective(BsEnicdnrltpinf bsEnicdnrltpinf);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delBsEnicdnrltpinf(Map<String,Object> condition);
	/**
	* 批量添加
	* @param bs_enicdnrltpinfList 
	* @return
	*/
	public int addBatchBsEnicdnrltpinf(List<BsEnicdnrltpinf> bsEnicdnrltpinfList);
	/**
	* 批量修改
	* @param bs_enicdnrltpinfList 
	* @return
	*/
	public int updateBatchBsEnicdnrltpinf(List<BsEnicdnrltpinf> bsEnicdnrltpinfList);
	/**
	* 批量修改（根据动态条件）
	* @param bs_enicdnrltpinfList 
	* @return
	*/
	public int updateBatchBsEnicdnrltpinfBySelective(List<BsEnicdnrltpinf> bsEnicdnrltpinfList);
}
