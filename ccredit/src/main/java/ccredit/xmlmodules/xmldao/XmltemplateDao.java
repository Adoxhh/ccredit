package ccredit.xmlmodules.xmldao;
import java.util.List;
import java.util.Map;

import ccredit.xmlmodules.xmlmodel.Xmltemplate;


/**
* xmltemplate 
* 2018-04-08 14:29:28  孟贝贝
*/
public interface XmltemplateDao{
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<Xmltemplate> getXmltemplateListByCondition(Map<String,Object> condition);
	/**
	* 查询对象
	* @param id 
	* @return
	*/
	public Xmltemplate getXmltemplateById(String id);
	/**
	* 添加
	* @param xmltemplate 
	* @return
	*/
	public int addXmltemplate(Xmltemplate xmltemplate);
	/**
	* 修改
	* @param xmltemplate 
	* @return
	*/
	public int updateXmltemplate(Xmltemplate xmltemplate);
	/**
	* 修改（根据动态条件）
	* @param xmltemplate 
	* @return
	*/
	public int updateXmltemplateBySelective(Xmltemplate xmltemplate);
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delXmltemplate(Map<String,Object> condition);
	/**
	* 批量添加
	* @param xmltemplateList 
	* @return
	*/
	public int addBatchXmltemplate(List<Xmltemplate> xmltemplateList);
	/**
	* 批量修改
	* @param xmltemplateList 
	* @return
	*/
	public int updateBatchXmltemplate(List<Xmltemplate> xmltemplateList);
	/**
	* 批量修改（根据动态条件）
	* @param xmltemplateList 
	* @return
	*/
	public int updateBatchXmltemplateBySelective(List<Xmltemplate> xmltemplateList);
}
