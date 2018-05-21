package ccredit.xmlmodules.xmldao.impl;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ccredit.xmlmodules.xmldao.XmlnodeDao;
import ccredit.xmlmodules.xmlmodel.Xmlnode;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;


/**
* xmlnode 
* 2018-04-08 14:33:21  孟贝贝
*/
@Repository("xmlnodeDao")
public class XmlnodeDaoImpl  extends BaseDaoImpl implements XmlnodeDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<Xmlnode> getXmlnodeListByCondition(Map<String,Object> condition){
		return (List<Xmlnode>)this.getList("getXmlnodeListByCondition",condition);
	}
	/**
	* 查询对象
	* @param id 
	* @return
	*/
	public Xmlnode getXmlnodeById(String id){
		return (Xmlnode)this.get("getXmlnodeById", id);
	}
	/**
	* 添加
	* @param xmlnode 
	* @return
	*/
	public int addXmlnode(Xmlnode xmlnode){
		return this.add("addXmlnode", xmlnode);
	}
	/**
	* 修改
	* @param xmlnode 
	* @return
	*/
	public int updateXmlnode(Xmlnode xmlnode){
		return this.update("updateXmlnode", xmlnode);
	}
	/**
	* 修改（根据动态条件）
	* @param xmlnode 
	* @return
	*/
	public int updateXmlnodeBySelective(Xmlnode xmlnode){
		return this.update("updateXmlnodeBySelective", xmlnode);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delXmlnode(Map<String,Object> condition){
		return this.del("delXmlnode", condition);
	}
	/**
	* 批量添加
	* @param xmlnodeList 
	* @return
	*/
	public int addBatchXmlnode(List<Xmlnode> xmlnodeList){
		return this.add("addBatchXmlnode", xmlnodeList);
	}
	/**
	* 批量修改
	* @param xmlnodeList 
	* @return
	*/
	public int updateBatchXmlnode(List<Xmlnode> xmlnodeList){
		return this.update("updateBatchXmlnode", xmlnodeList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param xmlnodeList 
	* @return
	*/
	public int updateBatchXmlnodeBySelective(List<Xmlnode> xmlnodeList){
		return this.update("updateBatchXmlnodeBySelective", xmlnodeList);
	}
	@Override
	public String findmaxSubMenuId(Map<String, Object> condition) {
		return (String)this.get("getMaxNodeid", condition);
	
	}
}
