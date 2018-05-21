package ccredit.oamodules.oadao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ccredit.oamodules.oadao.OaWorklogDao;
import ccredit.oamodules.oamodel.OaWorklog;
import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;

@Repository("oaWorklogDao")
public class OaWorklogDaoImpl extends BaseDaoImpl implements OaWorklogDao {
	
  @SuppressWarnings("unchecked")
public List<OaWorklog> getOaWorklogListByCondition(Map<String, Object> condition){
    return (List<OaWorklog>) getList("getOaWorklogListByCondition", condition);
  }

  public int getOaWorklogListCountByCondition(Map<String, Object> condition)
  {
    return new Integer(get("getOaWorklogListCountByCondition", condition).toString()).intValue();
  }

  public OaWorklog getOaWorklogById(String oaworklogID)
  {
    return (OaWorklog)get("getOaWorklogById", oaworklogID);
  }

  public int addOaWorklog(OaWorklog oaWorklog)
  {
    return add("addOaWorklog", oaWorklog);
  }

  public int updateOaWorklog(OaWorklog oaWorklog)
  {
    return update("updateOaWorklog", oaWorklog);
  }

  public int delOaWorklog(Map<String, Object> condition)
  {
    return del("delOaWorklog", condition);
  }
}