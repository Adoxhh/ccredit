package ccredit.oamodules.oaservice.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ccredit.lcmodules.activitiutil.ActivitiUtil;
import ccredit.lcmodules.lcdao.LcDeploymentHisDao;
import ccredit.lcmodules.lcmodel.LcApply;
import ccredit.oamodules.oadao.OaNoticeDao;
import ccredit.oamodules.oamodel.OaNotice;
import ccredit.oamodules.oaservice.OaNoticeService;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;
import ccredit.xtmodules.xtcore.util.SysContanst;
import ccredit.xtmodules.xtmodel.XtConstant;

/**
* 公告 
* 2017-11-16 13:23:07  邓纯杰
*/
@Service("oaNoticeService")
public class OaNoticeServiceImpl extends BaseService implements OaNoticeService{
	@Autowired
	private OaNoticeDao oaNoticeDao;
	@Autowired
	ActivitiUtil activitiUtil;
	@Autowired
	private LcDeploymentHisDao lc_Deployment_HisDao;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<OaNotice> getOaNoticeListByCondition(Map<String,Object> condition){
		try{
			return oaNoticeDao.getOaNoticeListByCondition(condition);
		} catch (Exception e) {
			/**方案一加上这句话这样程序异常时才能被aop捕获进而回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param oa_noticeID 
	* @return
	*/
	public OaNotice getOaNoticeById(String oa_noticeID){
		try{
			OaNotice oaNotice = oaNoticeDao.getOaNoticeById(oa_noticeID);
			return oaNotice;
		} catch (Exception e) {
			/**方案一加上这句话这样程序异常时才能被aop捕获进而回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param oa_notice 
	* @return
	*/
	public int addOaNotice(OaNotice oaNotice){
		int i = 0;
		try {
			if("1".equals(oaNotice.getSubmitType())){
				// 处理工作流
				XtConstant Xt_Constant = getXtConstantCache(SysContanst.OA_NOTICE_APPLY);
				Map<String, Object> condition = new HashMap<String, Object>();
				condition.put("xt_constant_id", Xt_Constant.getXt_constant_id());
				String id = lc_Deployment_HisDao.getLcDeploymentHisNewUnique(condition).getId();
				LcApply lc_Apply = new LcApply();
				lc_Apply.setLc_apply_title(getXtUname() + "于" + getSimpleDateFormat() + "，提交了一条公告申请流程");
				lc_Apply.setLc_apply_model_biz_id(oaNotice.getOa_noticeID());
				if (activitiUtil.addApply(id, null, null, lc_Apply)) {
					// 处理业务
					oaNotice.setStatus("1");
					i = this.oaNoticeDao.addOaNotice(oaNotice);
				} else {
					i = 0;
				}
			}else{
				i = this.oaNoticeDao.addOaNotice(oaNotice);
			}
		} catch (Exception e) {
			i = 0;

			throw new ExceptionUtil(e.getMessage(), e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param oa_notice 
	* @return
	*/
	public int updateOaNotice(OaNotice oaNotice){
		int i = 0;
		try {
			if("1".equals(oaNotice.getSubmitType())){
				oaNotice.setStatus("1");
				// 处理工作流
				XtConstant Xt_Constant = getXtConstantCache(SysContanst.OA_NOTICE_APPLY);
				Map<String, Object> condition = new HashMap<String, Object>();
				condition.put("xt_constant_id", Xt_Constant.getXt_constant_id());
				String id = lc_Deployment_HisDao.getLcDeploymentHisNewUnique(condition).getId();
				LcApply lc_Apply = new LcApply();
				lc_Apply.setLc_apply_title(getXtUname() + "于" + getSimpleDateFormat() + "，提交了一条公告申请流程");
				lc_Apply.setLc_apply_model_biz_id(oaNotice.getOa_noticeID());
				if (activitiUtil.addApply(id, null, null, lc_Apply)) {
					// 处理业务
					i = this.oaNoticeDao.updateOaNotice(oaNotice);
				} else {
					i = 0;
				}
			}else{
				i = this.oaNoticeDao.updateOaNotice(oaNotice);
			}
			
		} catch (Exception e) {
			i = 0;
			throw new ExceptionUtil(e.getMessage(), e.getCause());
		}
		return i;
	}
	/**
	* 修改（根据动态条件）
	* @param oa_notice 
	* @return
	*/
	public int updateOaNoticeBySelective(OaNotice oaNotice){
		int i = 0;
		try {
			i = oaNoticeDao.updateOaNoticeBySelective(oaNotice);
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
	public int delOaNotice(Map<String,Object> condition){
		int i = 0;
		try {
			i = oaNoticeDao.delOaNotice(condition);
		} catch (Exception e) {
			i = 0;
			/**方案一加上这句话这样程序异常时才能被aop捕获进而回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param oa_noticeList 
	* @return
	*/
	public int addBatchOaNotice(List<OaNotice> oaNoticeList){
		int i = 0;
		try {
			i = oaNoticeDao.addBatchOaNotice(oaNoticeList);
		} catch (Exception e) {
			i = 0;
			/**方案一加上这句话这样程序异常时才能被aop捕获进而回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param oa_noticeList 
	* @return
	*/
	public int updateBatchOaNotice(List<OaNotice> oaNoticeList){
		int i = 0;
		try {
			i = oaNoticeDao.updateBatchOaNotice(oaNoticeList);
		} catch (Exception e) {
			i = 0;
			/**方案一加上这句话这样程序异常时才能被aop捕获进而回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改（根据动态条件）
	* @param oa_noticeList 
	* @return
	*/
	public int updateBatchOaNoticeBySelective(List<OaNotice> oaNoticeList){
		int i = 0;
		try {
			i = oaNoticeDao.updateBatchOaNoticeBySelective(oaNoticeList);
		} catch (Exception e) {
			i = 0;
			/**方案一加上这句话这样程序异常时才能被aop捕获进而回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
