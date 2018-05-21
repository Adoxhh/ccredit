package ccredit.xmlmodules.xmldao.impl;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ccredit.xmlmodules.xmldao.XmltemplateDao;
import ccredit.xmlmodules.xmlmodel.Xmltemplate;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;


/**
* xmltemplate 
* 2018-04-08 14:29:28  孟贝贝
*/
@Repository("xmltemplateDao")
public class XmltemplateDaoImpl  extends BaseDaoImpl implements XmltemplateDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	@SuppressWarnings("unchecked")
	public List<Xmltemplate> getXmltemplateListByCondition(Map<String,Object> condition){
		return (List<Xmltemplate>)this.getList("getXmltemplateListByCondition",condition);
	}
	/**
	* 查询对象
	* @param id 
	* @return
	*/
	public Xmltemplate getXmltemplateById(String id){
		return (Xmltemplate)this.get("getXmltemplateById", id);
	}
	/**
	* 添加
	* @param xmltemplate 
	* @return
	*/
	public int addXmltemplate(Xmltemplate xmltemplate){
		return this.add("addXmltemplate", xmltemplate);
	}
	/**
	* 修改
	* @param xmltemplate 
	* @return
	*/
	public int updateXmltemplate(Xmltemplate xmltemplate){
		return this.update("updateXmltemplate", xmltemplate);
	}
	/**
	* 修改（根据动态条件）
	* @param xmltemplate 
	* @return
	*/
	public int updateXmltemplateBySelective(Xmltemplate xmltemplate){
		return this.update("updateXmltemplateBySelective", xmltemplate);
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delXmltemplate(Map<String,Object> condition){
		return this.del("delXmltemplate", condition);
	}
	/**
	* 批量添加
	* @param xmltemplateList 
	* @return
	*/
	public int addBatchXmltemplate(List<Xmltemplate> xmltemplateList){
		return this.add("addBatchXmltemplate", xmltemplateList);
	}
	/**
	* 批量修改
	* @param xmltemplateList 
	* @return
	*/
	public int updateBatchXmltemplate(List<Xmltemplate> xmltemplateList){
		return this.update("updateBatchXmltemplate", xmltemplateList);
	}
	/**
	* 批量修改（根据动态条件）
	* @param xmltemplateList 
	* @return
	*/
	public int updateBatchXmltemplateBySelective(List<Xmltemplate> xmltemplateList){
		return this.update("updateBatchXmltemplateBySelective", xmltemplateList);
	}
}
