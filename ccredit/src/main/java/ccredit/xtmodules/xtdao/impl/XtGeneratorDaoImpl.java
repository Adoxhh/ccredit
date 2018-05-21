package ccredit.xtmodules.xtdao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ccredit.xtmodules.xtcore.base.impl.BaseDaoImpl;
import ccredit.xtmodules.xtdao.XtGeneratorDao;
import ccredit.xtmodules.xtmodel.XtGenerator;
/**
 * 代码生成器
 * @author邓纯杰
 *
 */
@Repository("xtGeneratorDao")
public class XtGeneratorDaoImpl extends BaseDaoImpl implements XtGeneratorDao {
	/**
	 * 查询所有生成信息并分页
	 * @param condition
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<XtGenerator> getXtGeneratorListByCondition(Map<String, Object> condition){
		return (List<XtGenerator>)this.getList("getXtGeneratorListByCondition", condition);
	}
	
	/**
	 * 生成代码
	 * @param xt_Generator
	 */
	public int addXtGenerator(XtGenerator xt_Generator){
		return this.add("addXtGenerator", xt_Generator);
	}
	
	/**
	 * 删除
	 * @param condition
	 */
	public int delXtGenerator(Map<String,Object> condition){
		return this.del("delXtGenerator", condition);
	}
}
