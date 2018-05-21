package ccredit.xmlmodules.xmldao.impl;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ccredit.xmlmodules.xmldao.XmlsegmentDao;
import ccredit.xmlmodules.xmlmodel.Xmlsegment;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;


/**
* xmlsegment 
* 2018-04-08 14:31:32  孟贝贝
*/
@Repository("xmlsegmentDao")
public class XmlsegmentDaoImpl  extends BaseDaoImpl implements XmlsegmentDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<Xmlsegment> getXmlsegmentListByCondition(Map<String,Object> condition){
		return (List<Xmlsegment>)this.getList("getXmlsegmentListByCondition",condition);
	}
	/**
	* 查询对象
	* @param id 
	* @return
	*/
	public Xmlsegment getXmlsegmentById(String id){
		return (Xmlsegment)this.get("getXmlsegmentById", id);
	}
	/**
	* 添加
	* @param xmlsegment 
	* @return
	*/
	public int addXmlsegment(Xmlsegment xmlsegment){
		return this.add("addXmlsegment", xmlsegment);
	}
	/**
	* 修改
	* @param xmlsegment 
	* @return
	*/
	public int updateXmlsegment(Xmlsegment xmlsegment){
		return this.update("updateXmlsegment", xmlsegment);
	}
	/**
	* 修改（根据动态条件）
	* @param xmlsegment 
	* @return
	*/
	public int updateXmlsegmentBySelective(Xmlsegment xmlsegment){
		return this.update("updateXmlsegmentBySelective", xmlsegment);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delXmlsegment(Map<String,Object> condition){
		return this.del("delXmlsegment", condition);
	}
	/**
	* 批量添加
	* @param xmlsegmentList 
	* @return
	*/
	public int addBatchXmlsegment(List<Xmlsegment> xmlsegmentList){
		return this.add("addBatchXmlsegment", xmlsegmentList);
	}
	/**
	* 批量修改
	* @param xmlsegmentList 
	* @return
	*/
	public int updateBatchXmlsegment(List<Xmlsegment> xmlsegmentList){
		return this.update("updateBatchXmlsegment", xmlsegmentList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param xmlsegmentList 
	* @return
	*/
	public int updateBatchXmlsegmentBySelective(List<Xmlsegment> xmlsegmentList){
		return this.update("updateBatchXmlsegmentBySelective", xmlsegmentList);
	}
}
