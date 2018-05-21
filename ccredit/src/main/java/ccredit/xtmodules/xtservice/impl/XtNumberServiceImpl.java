package ccredit.xtmodules.xtservice.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtdao.XtNumberDao;
import ccredit.xtmodules.xtmodel.XtNumber;
import ccredit.xtmodules.xtservice.XtNumberService;

/**
 * 单号生成
 * @author 邓纯杰
 *
 */
@Service("xtNumberService")
public class XtNumberServiceImpl extends BaseService implements XtNumberService{
	@Autowired
	private XtNumberDao xtNumberDao;
	/**
	 * 分页查询
	 * @param condition
	 * @return
	 */
	public List<XtNumber> getXtNumberListByCondition(Map<String, Object> condition){
		return xtNumberDao.getXtNumberListByCondition(condition);
	}
}
