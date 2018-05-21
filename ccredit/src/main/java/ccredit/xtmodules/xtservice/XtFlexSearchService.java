package ccredit.xtmodules.xtservice;

import java.util.List;

import ccredit.xtmodules.xtmodel.XtDbFun;
import ccredit.xtmodules.xtmodel.XtDbProc;
import ccredit.xtmodules.xtmodel.XtDbStructure;
import ccredit.xtmodules.xtmodel.XtDbTableAttribute;
import ccredit.xtmodules.xtmodel.XtDbTableIndex;
import ccredit.xtmodules.xtmodel.XtDbTri;
import ccredit.xtmodules.xtmodel.XtDbView;

/**
 * 查询工具
 * @author 邓纯杰
 *
 */
public interface XtFlexSearchService {
	/**
	 * 查询返回结果集
	 * @param sql
	 * @param param
	 * @return
	 */
	public String getXtFlexSearchQuery(String sql,Object[]param,String xt_dbinfo_id);
	
	/**
	 * 查询返回结果集
	 * @param sql
	 * @param param
	 * @return
	 */
	public String getXtFlexSearchListQuery(String sql, Object[] param,String xt_dbinfo_id);
	
	/**
	 * 执行非查询结果集操作语句
	 * @param sql
	 * @param param
	 * @return
	 */
	public String executeUpdate(String sql, Object[] param,String xt_dbinfo_id);
	
	
	////////////////////////////为菜单服务///////////////////////
	/**
	 * 获取所有表
	 * @param sql
	 * @param xt_Dbinfo
	 * @return
	 */
	public List<XtDbTableAttribute> getXtDbTableAttributeForFlex(String xt_dbinfo_id);
	
	/**
	* 查询表索引
	* @return
	*/
	public List<XtDbTableIndex> getXtDbTableIndexForFlex(String xt_dbinfo_id,String tableName);
	
	/**
	* 查询存储过程
	* @return
	*/
	public  List<XtDbProc> getXtDbProcListForFlex(String xt_dbinfo_id);
	
	/**
	* 查询函数
	* @param sql
	* @return
	*/
	public  List<XtDbFun> getXtDbFunListForFlex(String xt_dbinfo_id);
	
	/**
	* 查询视图
	* @param sql
	* @return
	*/
	public  List<XtDbView> getXtDbViewListForFlex(String xt_dbinfo_id);
	
	/**
	* 查询触发器
	*/
	public  List<XtDbTri> getXtDbTriListForFlex(String xt_dbinfo_id);
	
	/**
	 * 查询字段
	 * @param sql
	 * @param xt_Dbinfo
	 * @return
	 */
	public List<XtDbStructure> getXtDbStructureForFlex(String xt_dbinfo_id,String tableName);
}
