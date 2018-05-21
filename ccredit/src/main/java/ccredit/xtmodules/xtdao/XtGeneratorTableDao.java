package ccredit.xtmodules.xtdao;

import java.util.List;
import java.util.Map;

import ccredit.xtmodules.xtmodel.XtGeneratorTable;

/**
 * 代码生成-表信息
 * @author 邓纯杰
 *
 */
public interface XtGeneratorTableDao {
	/**
	 * 获取所有表
	 * @return
	 */
	public List<XtGeneratorTable> getXtGeneratorTableList(Map<String, Object> condition); 
}
