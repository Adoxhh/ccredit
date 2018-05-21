package ccredit.xtmodules.xtservice.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import ccredit.xtmodules.xtdao.XtGeneratorTableColumnDao;
import ccredit.xtmodules.xtmodel.XtGeneratorTableColumn;
import ccredit.xtmodules.xtservice.XtGeneratorTableColumnService;
/**
 * 代码生成-表字段信息
 * @author邓纯杰
 *
 */
@Service("xtGeneratorTableColumnService")
public class XtGeneratorTableColumnServiceImpl extends BaseService implements XtGeneratorTableColumnService {
	@Autowired
	private XtGeneratorTableColumnDao xtGeneratorTableColumnDao;
	/**
	 * 获取所有表字段
	 * @return
	 */
	public List<XtGeneratorTableColumn> getXtGeneratorTableColumnList(Map<String, Object> condition){
		try {
			return xtGeneratorTableColumnDao.getXtGeneratorTableColumnList(condition);
		} catch (Exception e) {
			/**方案一加上这句话这样程序异常时才能被aop捕获进而回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
}
