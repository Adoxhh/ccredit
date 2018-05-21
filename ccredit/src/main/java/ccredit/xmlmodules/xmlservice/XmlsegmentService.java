package ccredit.xmlmodules.xmlservice;
import java.util.List;
import java.util.Map;

import ccredit.xmlmodules.xmlmodel.Xmlsegment;


/**
* xmlsegment 
* 2018-04-08 14:31:32  孟贝贝
*/
public interface XmlsegmentService{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<Xmlsegment> getXmlsegmentListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param id 
	* @return
	*/
	public Xmlsegment getXmlsegmentById(String id);
	/**
	* 添加
	* @param xmlsegment 
	* @return
	*/
	public int addXmlsegment(Xmlsegment xmlsegment);
	/**
	* 修改
	* @param xmlsegment 
	* @return
	*/
	public int updateXmlsegment(Xmlsegment xmlsegment);
	/**
	* 修改（根据动态条件）
	* @param xmlsegment 
	* @return
	*/
	public int updateXmlsegmentBySelective(Xmlsegment xmlsegment);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delXmlsegment(Map<String,Object> condition);
	/**
	* 批量添加
	* @param xmlsegmentList 
	* @return
	*/
	public int addBatchXmlsegment(List<Xmlsegment> xmlsegmentList);
	/**
	* 批量修改
	* @param xmlsegmentList 
	* @return
	*/
	public int updateBatchXmlsegment(List<Xmlsegment> xmlsegmentList);
	/**
	* 批量修改（根据动态条件）
	* @param xmlsegmentList 
	* @return
	*/
	public int updateBatchXmlsegmentBySelective(List<Xmlsegment> xmlsegmentList);
}
