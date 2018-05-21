package ccredit.spmodules.spmodel;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;
import ccredit.xtmodules.xtcore.util.DateUtils;
import ccredit.util.DictionaryText;

/**
* sp_objectionmsg 异议申请 
* 2018-05-03 10:27:23  mengbeibei
*/
public class SpObjectionmsg extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	/**编号**/
	private String objectionmsg_id;
	/**异议申请机构**/
	private String applydept;
	/**异议发起人**/
	private String regperson;
	/**申请主题**/
	private String theme;
	/**异议申请时间**/
	private Date applytime;
	/**异议申请时间**/
	private String applytimetext;
	/**异议申请人**/
	private String applyperson;
	/**申请人联系方式**/
	private String applyphone;
	/**异议事项描述**/
	private String description;
	/**审批人**/
	private String checkperson;
	/**状态**/
	private String status;
	/**状态**/
	private String statustext;
	/**审核结果**/
	private String result;
	/**审核意见**/
	private String advice;
	public void setObjectionmsg_id(String objectionmsg_id){
		this.objectionmsg_id=objectionmsg_id;
	}
	public String getObjectionmsg_id(){
		return objectionmsg_id;
	}
	public void setApplydept(String applydept){
		this.applydept=applydept;
	}
	public String getApplydept(){
		return applydept;
	}
	public void setRegperson(String regperson){
		this.regperson=regperson;
	}
	public String getRegperson(){
		return regperson;
	}
	public void setTheme(String theme){
		this.theme=theme;
	}
	public String getTheme(){
		return theme;
	}
	public void setApplytimetext(String applytimetext) {
		this.applytimetext = applytimetext;
	}
	public String getApplytimetext() {
		if(this.applytime!=null){
			this.applytimetext = DateUtils.formatDate(this.applytime);
		}
		return this.applytimetext;
	}
	public void setApplytime(Date applytime){
		this.applytime=applytime;
	}
	public Date getApplytime(){
		return applytime;
	}
	public void setApplyperson(String applyperson){
		this.applyperson=applyperson;
	}
	public String getApplyperson(){
		return applyperson;
	}
	public void setApplyphone(String applyphone){
		this.applyphone=applyphone;
	}
	public String getApplyphone(){
		return applyphone;
	}
	public void setDescription(String description){
		this.description=description;
	}
	public String getDescription(){
		return description;
	}
	public void setCheckperson(String checkperson){
		this.checkperson=checkperson;
	}
	public String getCheckperson(){
		return checkperson;
	}
	public void setStatustext( String statustext) {
		this.statustext = statustext;
	}
	public String getStatustext() {
		if(this.status!=null){
			this.statustext= DictionaryText.get("SENDMSGSTATUS", this.status);
		}
		return this.statustext;
	}
	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return status;
	}
	public void setResult(String result){
		this.result=result;
	}
	public String getResult(){
		return result;
	}
	public void setAdvice(String advice){
		this.advice=advice;
	}
	public String getAdvice(){
		return advice;
	}
}
