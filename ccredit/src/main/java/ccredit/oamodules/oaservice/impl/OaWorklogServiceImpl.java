package ccredit.oamodules.oaservice.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ccredit.oamodules.oadao.OaWorklogDao;
import ccredit.oamodules.oamodel.OaWorklog;
import ccredit.oamodules.oaservice.OaWorklogService;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;

@Service("oaWorklogService")
public class OaWorklogServiceImpl extends BaseService
  implements OaWorklogService
{

  @Autowired
  private OaWorklogDao oaWorklogDao;

  public List<OaWorklog> getOaWorklogListByCondition(Map<String, Object> condition)
  {
    try
    {
      return this.oaWorklogDao.getOaWorklogListByCondition(condition);
    }
    catch (Exception e) {
      throw new ExceptionUtil(e.getMessage(), e.getCause());
    }
  }

  public int getOaWorklogListCountByCondition(Map<String, Object> condition)
  {
    try
    {
      return this.oaWorklogDao.getOaWorklogListCountByCondition(condition);
    }
    catch (Exception e) {
      throw new ExceptionUtil(e.getMessage(), e.getCause());
    }
  }

  public OaWorklog getOaWorklogById(String oaworklogID)
  {
    try
    {
      return this.oaWorklogDao.getOaWorklogById(oaworklogID);
    }
    catch (Exception e) {
      throw new ExceptionUtil(e.getMessage(), e.getCause());
    }
  }

  public int addOaWorklog(OaWorklog oaWorklog)
  {
    int i = 0;
    try {
      i = this.oaWorklogDao.addOaWorklog(oaWorklog);
    } catch (Exception e) {
      i = 0;

      throw new ExceptionUtil(e.getMessage(), e.getCause());
    }
    return i;
  }

  public int updateOaWorklog(OaWorklog oaWorklog)
  {
    int i = 0;
    try {
      i = this.oaWorklogDao.updateOaWorklog(oaWorklog);
    } catch (Exception e) {
      i = 0;

      throw new ExceptionUtil(e.getMessage(), e.getCause());
    }
    return i;
  }

  public int delOaWorklog(Map<String, Object> condition)
  {
    int i = 0;
    try {
      i = this.oaWorklogDao.delOaWorklog(condition);
    } catch (Exception e) {
      i = 0;

      throw new ExceptionUtil(e.getMessage(), e.getCause());
    }
    return i;
  }
}