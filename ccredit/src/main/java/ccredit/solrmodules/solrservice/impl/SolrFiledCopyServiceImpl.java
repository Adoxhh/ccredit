package ccredit.solrmodules.solrservice.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ccredit.solrmodules.solrdao.SolrCoreDao;
import ccredit.solrmodules.solrdao.SolrFiledCopyDao;
import ccredit.solrmodules.solrdao.SolrUrlDao;
import ccredit.solrmodules.solrmodel.SolrCore;
import ccredit.solrmodules.solrmodel.SolrDocument;
import ccredit.solrmodules.solrmodel.SolrFiledCopy;
import ccredit.solrmodules.solrmodel.SolrIndex;
import ccredit.solrmodules.solrmodel.SolrUrl;
import ccredit.solrmodules.solrservice.SolrDocumentService;
import ccredit.solrmodules.solrservice.SolrFiledCopyService;
import ccredit.solrmodules.solrservice.SolrIndexService;
import ccredit.xtmodules.xtcore.base.BaseService;
import ccredit.xtmodules.xtcore.solr.utils.SolrUtil;
import ccredit.xtmodules.xtcore.util.ExceptionUtil;

/**
* Solr字段拷贝配置 
* 2016-11-14 22:20:39  邓纯杰
*/
@Service("solrFiledCopyService")
public class SolrFiledCopyServiceImpl extends BaseService implements SolrFiledCopyService{
	@Autowired
	private SolrFiledCopyDao solrFiledCopyDao;
	@Autowired
	private SolrCoreDao solrCoreDao;
	@Autowired
	private SolrUrlDao solrUrlDao;
	@Autowired
	private SolrDocumentService solrDocumentService;
	@Autowired
	private SolrIndexService solrIndexService;
	/**
	* 分页
	* @param condition 
	* @return
	*/
	public List<SolrFiledCopy> getSolrFiledCopyListByCondition(Map<String,Object> condition){
		try{
			return solrFiledCopyDao.getSolrFiledCopyListByCondition(condition);
		} catch (Exception e) {
			/**方案一加上这句话这样程序异常时才能被aop捕获进而回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 查询对象
	* @param solr_filed_copy_id 
	* @return
	*/
	public SolrFiledCopy getSolrFiledCopyById(String solr_filed_copy_id){
		try{
			return solrFiledCopyDao.getSolrFiledCopyById(solr_filed_copy_id);
		} catch (Exception e) {
			/**方案一加上这句话这样程序异常时才能被aop捕获进而回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
	}
	/**
	* 添加
	* @param solr_filed_copy 
	* @return
	*/
	public int addSolrFiledCopy(SolrFiledCopy solr_Filed_Copy){
		int i = 0;
		try {
			SolrCore solr_Core = solrCoreDao.getSolrCoreById(solr_Filed_Copy.getSolr_core_id());
			SolrUrl solr_url =solrUrlDao.getSolrUrlById(solr_Core.getSolr_url_id());
			String solr_url_url = solr_url.getSolr_url_url();
			SolrDocument solr_Document = solrDocumentService.getSolrDocumentById(solr_Core.getSolr_document_id());
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("solr_core_id", solr_Core.getSolr_core_id());
			List<SolrIndex> solr_IndexList = solrIndexService.getSolrIndexListByCondition(condition);
			i = solrFiledCopyDao.addSolrFiledCopy(solr_Filed_Copy);
			List<SolrFiledCopy> solr_Filed_CopyList = solrFiledCopyDao.getSolrFiledCopyListByCondition(condition);
			SolrUtil.updateCore(solr_url_url, solr_Core,solr_Document,solr_IndexList,solr_Filed_CopyList);
		} catch (Exception e) {
			i = 0;
			/**方案一加上这句话这样程序异常时才能被aop捕获进而回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 修改
	* @param solr_filed_copy 
	* @return
	*/
	public int updateSolrFiledCopy(SolrFiledCopy solr_Filed_Copy){
		int i = 0;
		try {
			SolrCore solr_Core = solrCoreDao.getSolrCoreById(solr_Filed_Copy.getSolr_core_id());
			SolrUrl solr_url =solrUrlDao.getSolrUrlById(solr_Core.getSolr_url_id());
			String solr_url_url = solr_url.getSolr_url_url();
			SolrDocument solr_Document = solrDocumentService.getSolrDocumentById(solr_Core.getSolr_document_id());
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("solr_core_id", solr_Core.getSolr_core_id());
			List<SolrIndex> solr_IndexList = solrIndexService.getSolrIndexListByCondition(condition);
			i = solrFiledCopyDao.updateSolrFiledCopy(solr_Filed_Copy);
			List<SolrFiledCopy> solr_Filed_CopyList = solrFiledCopyDao.getSolrFiledCopyListByCondition(condition);
			SolrUtil.updateCore(solr_url_url, solr_Core,solr_Document,solr_IndexList,solr_Filed_CopyList);
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
	public int delSolrFiledCopy(Map<String,Object> map){
		int i = 0;
		try {
			String[] solr_filed_copy_id =(String[])map.get("solr_filed_copy_id");
			SolrFiledCopy solr_Filed_Copy = solrFiledCopyDao.getSolrFiledCopyById(solr_filed_copy_id[0]);
			SolrCore solr_Core = solrCoreDao.getSolrCoreById(solr_Filed_Copy.getSolr_core_id());
			SolrUrl solr_url =solrUrlDao.getSolrUrlById(solr_Core.getSolr_url_id());
			String solr_url_url = solr_url.getSolr_url_url();
			SolrDocument solr_Document = solrDocumentService.getSolrDocumentById(solr_Core.getSolr_document_id());
			Map<String, Object> condition = new HashMap<String, Object>();
			condition.put("solr_core_id", solr_Core.getSolr_core_id());
			List<SolrIndex> solr_IndexList = solrIndexService.getSolrIndexListByCondition(condition);
			i = solrFiledCopyDao.delSolrFiledCopy(map);
			List<SolrFiledCopy> solr_Filed_CopyList = solrFiledCopyDao.getSolrFiledCopyListByCondition(condition);
			SolrUtil.updateCore(solr_url_url, solr_Core,solr_Document,solr_IndexList,solr_Filed_CopyList);
		} catch (Exception e) {
			i = 0;
			/**方案一加上这句话这样程序异常时才能被aop捕获进而回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量添加
	* @param solr_filed_copyList 
	* @return
	*/
	public int addBatchSolrFiledCopy(List<SolrFiledCopy> solr_Filed_CopyList){
		int i = 0;
		try {
			i = solrFiledCopyDao.addBatchSolrFiledCopy(solr_Filed_CopyList);
		} catch (Exception e) {
			i = 0;
			/**方案一加上这句话这样程序异常时才能被aop捕获进而回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
	/**
	* 批量修改
	* @param solr_filed_copyList 
	* @return
	*/
	public int updateBatchSolrFiledCopy(List<SolrFiledCopy> solr_Filed_CopyList){
		int i = 0;
		try {
			i = solrFiledCopyDao.updateBatchSolrFiledCopy(solr_Filed_CopyList);
		} catch (Exception e) {
			i = 0;
			/**方案一加上这句话这样程序异常时才能被aop捕获进而回滚**/
			throw new ExceptionUtil(e.getMessage(),e.getCause());
		}
		return i;
	}
}
