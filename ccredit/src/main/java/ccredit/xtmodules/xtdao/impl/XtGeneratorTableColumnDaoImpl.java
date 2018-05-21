package ccredit.xtmodules.xtdao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.xtmodules.xtdao.XtGeneratorTableColumnDao;
import ccredit.xtmodules.xtmodel.XtGeneratorTableColumn;
/**
 * 代码生成-表字段信息
 * @author邓纯杰
 *
 */
@Repository("xtGeneratorTableColumnDao")
public class XtGeneratorTableColumnDaoImpl extends BaseDaoImpl implements
		XtGeneratorTableColumnDao {
	/**
	 * 获取所有表字段
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<XtGeneratorTableColumn> getXtGeneratorTableColumnList(Map<String, Object> condition){
		return (List<XtGeneratorTableColumn>)this.getList("getXtGeneratorTableColumnList",condition);
	}
}
