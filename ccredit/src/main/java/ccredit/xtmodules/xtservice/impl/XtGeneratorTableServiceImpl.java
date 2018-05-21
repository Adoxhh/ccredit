package ccredit.xtmodules.xtservice.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import ccredit.xtmodules.xtdao.XtGeneratorTableDao;
import ccredit.xtmodules.xtmodel.XtGeneratorTable;
import ccredit.xtmodules.xtservice.XtGeneratorTableService;
/**
 * 代码生成-表信息
 * @author 邓纯杰
 *
 */
@Service("xtGeneratorTableService")
public class XtGeneratorTableServiceImpl extends BaseService implements XtGeneratorTableService {
	@Autowired
	private XtGeneratorTableDao xtGeneratorTableDao;
	/**
	 * 获取所有表
	 * @return
	 */
	public List<XtGeneratorTable> getXtGeneratorTableList(Map<String, Object> condition){
		try {
			return xtGeneratorTableDao.getXtGeneratorTableList(condition);
		} catch (Exception e) {
			/**方案一加上这句话这样程序异常时才能被aop捕获进而回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
}
