package ccredit.xtmodules.xtservice.impl;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import ccredit.xtmodules.xtdao.XtOperateBusinessLogsDao;
import ccredit.xtmodules.xtmodel.XtOperateBusinessLogs;
import ccredit.xtmodules.xtservice.XtOperateBusinessLogsService;

/**
* 平台业务操作日志表 
* 2016-09-19 23:24:17  邓纯杰
*/
@Service("xtOperateBusinessLogsService")
public class XtOperateBusinessLogsServiceImpl implements XtOperateBusinessLogsService{
	@Autowired
	private XtOperateBusinessLogsDao xtOperateBusinessLogsDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<XtOperateBusinessLogs> getXtOperateBusinessLogsListByCondition(Map<String,Object> condition){
		try{
			return xtOperateBusinessLogsDao.getXtOperateBusinessLogsListByCondition(condition);
		} catch (Exception e) {
			/**方案一加上这句话这样程序异常时才能被aop捕获进而回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param xt_operate_business_logs_id 
	* @return
	*/
	public XtOperateBusinessLogs getXtOperateBusinessLogsById(String xt_operate_business_logs_id){
		try{
			return xtOperateBusinessLogsDao.getXtOperateBusinessLogsById(xt_operate_business_logs_id);
		} catch (Exception e) {
			/**方案一加上这句话这样程序异常时才能被aop捕获进而回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param xt_operate_business_logs 
	* @return
	*/
	public int putXtOperateBusinessLogs(XtOperateBusinessLogs xt_Operate_Business_Logs){
		int i = 0;
		try {
			i = xtOperateBusinessLogsDao.addXtOperateBusinessLogs(xt_Operate_Business_Logs);
		} catch (Exception e) {
			i = 0;
			/**方案一加上这句话这样程序异常时才能被aop捕获进而回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param xt_operate_business_logs 
	* @return
	*/
	public int updateXtOperateBusinessLogs(XtOperateBusinessLogs xt_Operate_Business_Logs){
		int i = 0;
		try {
			i = xtOperateBusinessLogsDao.updateXtOperateBusinessLogs(xt_Operate_Business_Logs);
		} catch (Exception e) {
			i = 0;
			/**方案一加上这句话这样程序异常时才能被aop捕获进而回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 删除
	* @param condition 
	* @return
	*/
	public int delXtOperateBusinessLogs(Map<String,Object> condition){
		int i = 0;
		try {
			i = xtOperateBusinessLogsDao.delXtOperateBusinessLogs(condition);
		} catch (Exception e) {
			i = 0;
			/**方案一加上这句话这样程序异常时才能被aop捕获进而回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
