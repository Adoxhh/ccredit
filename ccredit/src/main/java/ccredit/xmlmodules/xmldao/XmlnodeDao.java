package ccredit.xmlmodules.xmldao;
import java.util.List;
import java.util.Map;

import ccredit.xmlmodules.xmlmodel.Xmlnode;


/**
* xmlnode 
* 2018-04-08 14:33:21  孟贝贝
*/
public interface XmlnodeDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<Xmlnode> getXmlnodeListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param id 
	* @return
	*/
	public Xmlnode getXmlnodeById(String id);
	/**
	* 添加
	* @param xmlnode 
	* @return
	*/
	public int addXmlnode(Xmlnode xmlnode);
	/**
	* 修改
	* @param xmlnode 
	* @return
	*/
	public int updateXmlnode(Xmlnode xmlnode);
	/**
	* 修改（根据动态条件）
	* @param xmlnode 
	* @return
	*/
	public int updateXmlnodeBySelective(Xmlnode xmlnode);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delXmlnode(Map<String,Object> condition);
	/**
	* 批量添加
	* @param xmlnodeList 
	* @return
	*/
	public int addBatchXmlnode(List<Xmlnode> xmlnodeList);
	/**
	* 批量修改
	* @param xmlnodeList 
	* @return
	*/
	public int updateBatchXmlnode(List<Xmlnode> xmlnodeList);
	/**
	* 批量修改（根据动态条件）
	* @param xmlnodeList 
	* @return
	*/
	public int updateBatchXmlnodeBySelective(List<Xmlnode> xmlnodeList);
	public String findmaxSubMenuId(Map<String, Object> condition);
}
