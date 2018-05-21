package ccredit.xmlmodules.xmlservice.impl;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ccredit.xmlmodules.xmldao.XmltemplateDao;
import ccredit.xmlmodules.xmlmodel.Xmltemplate;
import ccredit.xmlmodules.xmlservice.XmltemplateService;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;


/**
* xmltemplate 
* 2018-04-08 14:29:28  孟贝贝
*/
@Service("xmltemplateService")
public class XmltemplateServiceImpl extends BaseService implements XmltemplateService{
	@Autowired
	private XmltemplateDao xmltemplateDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<Xmltemplate> getXmltemplateListByCondition(Map<String,Object> condition){
		try{
			return xmltemplateDao.getXmltemplateListByCondition(condition);
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param id 
	* @return
	*/
	public Xmltemplate getXmltemplateById(String id){
		try{
			Xmltemplate xmltemplate = xmltemplateDao.getXmltemplateById(id);
			return xmltemplate;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param xmltemplate 
	* @return
	*/
	public int addXmltemplate(Xmltemplate xmltemplate){
		int i = 0;
		try {
			i = xmltemplateDao.addXmltemplate(xmltemplate);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param xmltemplate 
	* @return
	*/
	public int updateXmltemplate(Xmltemplate xmltemplate){
		int i = 0;
		try {
			i = xmltemplateDao.updateXmltemplate(xmltemplate);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param xmltemplate 
	* @return
	*/
	public int updateXmltemplateBySelective(Xmltemplate xmltemplate){
		int i = 0;
		try {
			i = xmltemplateDao.updateXmltemplateBySelective(xmltemplate);
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
	public int delXmltemplate(Map<String,Object> condition){
		int i = 0;
		try {
			i = xmltemplateDao.delXmltemplate(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param xmltemplateList 
	* @return
	*/
	public int addBatchXmltemplate(List<Xmltemplate> xmltemplateList){
		int i = 0;
		try {
			i = xmltemplateDao.addBatchXmltemplate(xmltemplateList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param xmltemplateList 
	* @return
	*/
	public int updateBatchXmltemplate(List<Xmltemplate> xmltemplateList){
		int i = 0;
		try {
			i = xmltemplateDao.updateBatchXmltemplate(xmltemplateList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param xmltemplateList 
	* @return
	*/
	public int updateBatchXmltemplateBySelective(List<Xmltemplate> xmltemplateList){
		int i = 0;
		try {
			i = xmltemplateDao.updateBatchXmltemplateBySelective(xmltemplateList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
