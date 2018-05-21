package ccredit.xmlmodules.xmlservice.impl;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ccredit.xmlmodules.xmldao.XmlsegmentDao;
import ccredit.xmlmodules.xmlmodel.Xmlsegment;
import ccredit.xmlmodules.xmlservice.XmlsegmentService;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;


/**
* xmlsegment 
* 2018-04-08 14:31:32  孟贝贝
*/
@Service("xmlsegmentService")
public class XmlsegmentServiceImpl extends BaseService implements XmlsegmentService{
	@Autowired
	private XmlsegmentDao xmlsegmentDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<Xmlsegment> getXmlsegmentListByCondition(Map<String,Object> condition){
		try{
			return xmlsegmentDao.getXmlsegmentListByCondition(condition);
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
	public Xmlsegment getXmlsegmentById(String id){
		try{
			Xmlsegment xmlsegment = xmlsegmentDao.getXmlsegmentById(id);
			return xmlsegment;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param xmlsegment 
	* @return
	*/
	public int addXmlsegment(Xmlsegment xmlsegment){
		int i = 0;
		try {
			i = xmlsegmentDao.addXmlsegment(xmlsegment);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param xmlsegment 
	* @return
	*/
	public int updateXmlsegment(Xmlsegment xmlsegment){
		int i = 0;
		try {
			i = xmlsegmentDao.updateXmlsegment(xmlsegment);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param xmlsegment 
	* @return
	*/
	public int updateXmlsegmentBySelective(Xmlsegment xmlsegment){
		int i = 0;
		try {
			i = xmlsegmentDao.updateXmlsegmentBySelective(xmlsegment);
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
	public int delXmlsegment(Map<String,Object> condition){
		int i = 0;
		try {
			i = xmlsegmentDao.delXmlsegment(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param xmlsegmentList 
	* @return
	*/
	public int addBatchXmlsegment(List<Xmlsegment> xmlsegmentList){
		int i = 0;
		try {
			i = xmlsegmentDao.addBatchXmlsegment(xmlsegmentList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param xmlsegmentList 
	* @return
	*/
	public int updateBatchXmlsegment(List<Xmlsegment> xmlsegmentList){
		int i = 0;
		try {
			i = xmlsegmentDao.updateBatchXmlsegment(xmlsegmentList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param xmlsegmentList 
	* @return
	*/
	public int updateBatchXmlsegmentBySelective(List<Xmlsegment> xmlsegmentList){
		int i = 0;
		try {
			i = xmlsegmentDao.updateBatchXmlsegmentBySelective(xmlsegmentList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
