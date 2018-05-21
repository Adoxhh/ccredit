package ccredit.xmlmodules.xmlservice.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ccredit.xmlmodules.xmldao.XmlnodeDao;
import ccredit.xmlmodules.xmlmodel.Xmlnode;
import ccredit.xmlmodules.xmlservice.XmlnodeService;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;


/**
* xmlnode 
* 2018-04-08 14:33:21  孟贝贝
*/
@Service("xmlnodeService")
public class XmlnodeServiceImpl extends BaseService implements XmlnodeService{
	@Autowired
	private XmlnodeDao xmlnodeDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<Xmlnode> getXmlnodeListByCondition(Map<String,Object> condition){
		try{
			return xmlnodeDao.getXmlnodeListByCondition(condition);
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
	public Xmlnode getXmlnodeById(String id){
		try{
			Xmlnode xmlnode = xmlnodeDao.getXmlnodeById(id);
			return xmlnode;
		} catch (Exception e) {
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param xmlnode 
	* @return
	*/
	public int addXmlnode(Xmlnode xmlnode){
		int i = 0;
		try {
			i = xmlnodeDao.addXmlnode(xmlnode);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param xmlnode 
	* @return
	*/
	public int updateXmlnode(Xmlnode xmlnode){
		int i = 0;
		try {
			i = xmlnodeDao.updateXmlnode(xmlnode);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param xmlnode 
	* @return
	*/
	public int updateXmlnodeBySelective(Xmlnode xmlnode){
		int i = 0;
		try {
			i = xmlnodeDao.updateXmlnodeBySelective(xmlnode);
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
	public int delXmlnode(Map<String,Object> condition){
		int i = 0;
		try {
			i = xmlnodeDao.delXmlnode(condition);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param xmlnodeList 
	* @return
	*/
	public int addBatchXmlnode(List<Xmlnode> xmlnodeList){
		int i = 0;
		try {
			i = xmlnodeDao.addBatchXmlnode(xmlnodeList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param xmlnodeList 
	* @return
	*/
	public int updateBatchXmlnode(List<Xmlnode> xmlnodeList){
		int i = 0;
		try {
			i = xmlnodeDao.updateBatchXmlnode(xmlnodeList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param xmlnodeList 
	* @return
	*/
	public int updateBatchXmlnodeBySelective(List<Xmlnode> xmlnodeList){
		int i = 0;
		try {
			i = xmlnodeDao.updateBatchXmlnodeBySelective(xmlnodeList);
		} catch (Exception e) {
			i = 0;
			/**捕捉异常并回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	
	@Override
	public String findmaxSubMenuId(String pParentid,String segmentid) {
		Map<String,Object> condition=new HashMap<String, Object>();
		condition.put("parentid", pParentid);
		condition.put("segmentid", segmentid);
		String sql="select max(nodeid) from xmlnode where segmentid='"+segmentid+"'";
		if(pParentid!=null||pParentid!=""){
			sql+=" and parentid='"+pParentid+"'";
		}
		String maxid=this.xmlnodeDao.findmaxSubMenuId(condition);
		return maxid;
	}
}
