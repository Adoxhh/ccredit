package ccredit.bsmodules.bsmodel;
import ccredit.util.DictionaryText;
import ccredit.xtmodules.xtcore.base.BaseEntity;
import ccredit.xtmodules.xtcore.util.DateUtils;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

/**
* bs_actucotrlinfsgmt 实际控制人 
* 2018-04-26 14:38:51  mengbeibei
*/
public class BsActucotrlinfsgmt extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	private String bs_actucotrlinfsgmt_id;/**编号**/
	private String actucotrlnm;/**实际控制人个数 **/
	private String actucotrlidtype1;/**实际控制人身份类别**/
	private String actucotrlidtype1text;/**实际控制人身份类别**/
	private String actucotrlname;/**实际控制人名称**/
	private String actucotrlidtype2;/**实际控制人身份标识类型**/
	private String actucotrlidtype2text;/**实际控制人身份标识类型**/
	private String actucotrlidnum;/**实际控制人身份标识号码**/
	private Date actucotrlinfoupdate;/**信息更新日期**/
	private String actucotrlinfoupdatetext;/**信息更新日期**/
	private String customid;/**客户号**/
	private Date lastdate;/**最后一次修改日期**/
	private String changeflag;/**状态位**/
	public void setBs_actucotrlinfsgmt_id(String bs_actucotrlinfsgmt_id){
		this.bs_actucotrlinfsgmt_id=bs_actucotrlinfsgmt_id;
	}
	public String getBs_actucotrlinfsgmt_id(){
		return bs_actucotrlinfsgmt_id;
	}
	public void setActucotrlnm(String actucotrlnm){
		this.actucotrlnm=actucotrlnm;
	}
	public String getActucotrlnm(){
		return actucotrlnm;
	}
	public void setActucotrlidtype1(String actucotrlidtype1){
		this.actucotrlidtype1=actucotrlidtype1;
	}
	public String getActucotrlidtype1(){
		return actucotrlidtype1;
	}
	public void setActucotrlname(String actucotrlname){
		this.actucotrlname=actucotrlname;
	}
	public String getActucotrlname(){
		return actucotrlname;
	}
	public void setActucotrlidtype2(String actucotrlidtype2){
		this.actucotrlidtype2=actucotrlidtype2;
	}
	public String getActucotrlidtype2(){
		return actucotrlidtype2;
	}
	public void setActucotrlidnum(String actucotrlidnum){
		this.actucotrlidnum=actucotrlidnum;
	}
	public String getActucotrlidnum(){
		return actucotrlidnum;
	}
	public void setActucotrlinfoupdate(Date actucotrlinfoupdate){
		this.actucotrlinfoupdate=actucotrlinfoupdate;
	}
	public Date getActucotrlinfoupdate(){
		return actucotrlinfoupdate;
	}
	public void setCustomid(String customid){
		this.customid=customid;
	}
	public String getCustomid(){
		return customid;
	}
	public void setLastdate(Date lastdate){
		this.lastdate=lastdate;
	}
	public Date getLastdate(){
		return lastdate;
	}
	public void setChangeflag(String changeflag){
		this.changeflag=changeflag;
	}
	public String getChangeflag(){
		return changeflag;
	}
	
	
	public String getActucotrlidtype1text() {
		if(this.actucotrlidtype1!=null){
			this.actucotrlidtype1text= DictionaryText.get("ARLPIDTYPECODE", this.actucotrlidtype1);
		}
		return this.actucotrlidtype1text;
	}
	public void setActucotrlidtype1text(String actucotrlidtype1text) {
		this.actucotrlidtype1text = actucotrlidtype1text;
	}
	public String getActucotrlidtype2text() {
		if(this.actucotrlidtype2!=null){
			this.actucotrlidtype2text= DictionaryText.get("ARLPIDTYPECODE", this.actucotrlidtype2);
		}
		return this.actucotrlidtype2text;
	}
	public void setActucotrlidtype2text(String actucotrlidtype2text) {
		this.actucotrlidtype2text = actucotrlidtype2text;
	}
	public String getActucotrlinfoupdatetext() {
		if(this.actucotrlinfoupdate!=null){
			this.actucotrlinfoupdatetext = DateUtils.formatDate(this.actucotrlinfoupdate);
		}
		return this.actucotrlinfoupdatetext;
	}
	public void setActucotrlinfoupdatetext(String actucotrlinfoupdatetext) {
		this.actucotrlinfoupdatetext = actucotrlinfoupdatetext;
	}
	
}
