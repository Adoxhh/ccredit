package ccredit.xtmodules.xtservice;

import java.util.List;
import java.util.Map;

import ccredit.xtmodules.xtmodel.XtDbFun;
import ccredit.xtmodules.xtmodel.XtDbProc;
import ccredit.xtmodules.xtmodel.XtDbStructure;
import ccredit.xtmodules.xtmodel.XtDbTableAttribute;
import ccredit.xtmodules.xtmodel.XtDbTableIndex;
import ccredit.xtmodules.xtmodel.XtDbTableSize;
import ccredit.xtmodules.xtmodel.XtDbTri;
import ccredit.xtmodules.xtmodel.XtDbView;

/**
 * 数据库表
 * @author 邓纯杰
 */
public interface XtDbStructureService {
	/**
	 * 获取所有表属性
	 * @param condition
	 * @return
	 */
	public List<XtDbTableAttribute> getXtDbTableAttribute(Map<String, Object> condition);
	/**
	 * 获取数据库表结构
	 * @param condition
	 * @return
	 */
	public List<XtDbStructure> getXtDbStructureByCondition(Map<String, Object> condition);
	
	/**
	 * 显示建表语句
	 * @param condition
	 * @return
	 */
	public XtDbStructure getTablePhrases(Map<String, Object> condition);
	
	/**
	 * 读取表中索引
	 * @param condition
	 * @return
	 */
	public List<XtDbTableIndex> getXtDbTableIndex(Map<String, Object> condition);
	
	/**
	 * 读取表大小
	 * @param condition
	 * @return
	 */
	public XtDbTableSize getXtDbTableSize(Map<String, Object> condition);
	
	/**
	 * 创建索引
	 * @param sql
	 */
	public int addXtDbTableIndex(Map<String, Object> condition);
	
	/**
	 * 删除索引
	 * @param sql
	 */
	public int delXtDbTableIndex(Map<String, Object> condition);
	
	/**
	 * 查询存储过程
	 * @param condition
	 * @return
	 */
	public List<XtDbProc> getXtDbProcList(Map<String, Object> condition);
	
	/**
	 * 查询函数
	 * @param condition
	 * @return
	 */
	public List<XtDbFun> getXtDbFunList(Map<String, Object> condition);
	
	/**
	 * 查询视图
	 * @param condition
	 * @return
	 */
	public List<XtDbView> getXtDbViewList(Map<String, Object> condition);
	
	/**
	 * 查询触发器
	 * @param condition
	 * @return
	 */
	public List<XtDbTri> getXtDbTriList(Map<String, Object> condition);
}
