package ccredit.util;

import org.apache.commons.lang.StringUtils;
/**
 * 判断是否应该生成xml
 * @author tianpc
 *
 */
public class IsNeedMadeXml {
	/**
	 * 判断是否应该生成xml的方法
	 * @param changeflag  是否有更新
	 * @param p			第p个数据库表
	 * @param msgMtype	信息记录大类
	 * @param rptDateCode	时段代码
	 * @param ostring		数据库表名
	 * @param acctType		账户类别
	 * @return
	 */
	public  boolean  isMadeXml(String changeflag,int p,String msgMtype,String rptDateCode,String ostring,String acctType){
		if(StringUtils.isBlank(changeflag)||StringUtils.isBlank(msgMtype)||StringUtils.isBlank(rptDateCode)){
			return false;
		}
		if(p==0){
			return true;
		}else{
			boolean isChange=!"3".equals(changeflag);
				if("PERSONBASEINFORECCODE".equals(msgMtype)){
					//个人信息
					if("10".equals(rptDateCode)){
						return true;
					}else if("20".equals(rptDateCode)&&isChange){
						return true;
					}
					
				}
				else if("PERGUATRAINFORECTYPECODE".equals(msgMtype)){
					//担保交易
					//账户开立时段
					if("10".equals(rptDateCode)){
						//assurebasicinfo—个人担保基本信息表
						if("assurebasicinfo".equals(ostring)){
							return true;
						}
						//protectioninfo--在保责任信息表
						else if("protectioninfo".equals(ostring)){
							return true;
						}
						//repaymentinfo—相关还款人信息表；
						else if("repaymentinfo".equals(ostring)&&isChange){
							return true;
						}
						//contractinfo—抵押物信息表；
						else if("contractinfo".equals(ostring)){
							return false;
						}
					}
					//在保责任变化--时段
					else if("30".equals(rptDateCode)){
						//assurebasicinfo—个人担保基本信息表
						if("assurebasicinfo".equals(ostring)&&isChange){
							return true;
						}
						//protectioninfo--在保责任信息表
						else if("protectioninfo".equals(ostring)){
							return true;
						}
						//repaymentinfo—相关还款人信息表；
						else if("repaymentinfo".equals(ostring)&&isChange){
							return true;
						}
						//contractinfo—抵押物信息表；
						else if("contractinfo".equals(ostring)){
							return false;
						}
					}
					//五级分类调整--时段
					else if("40".equals(rptDateCode)){
						//assurebasicinfo—个人担保基本信息表
						if("assurebasicinfo".equals(ostring)&&isChange){
							return true;
						}
						//protectioninfo--在保责任信息表
						else if("protectioninfo".equals(ostring)){
							return true;
						}
						//repaymentinfo—相关还款人信息表；
						else if("repaymentinfo".equals(ostring)&&isChange){
							return true;
						}
						//contractinfo—抵押物信息表；
						else if("contractinfo".equals(ostring)){
							return false;
						}
					}
					
					//其他信息变化--时段
					else if("50".equals(rptDateCode)){
						//assurebasicinfo—个人担保基本信息表
						if("assurebasicinfo".equals(ostring)&&isChange){
							return true;
						}
						//protectioninfo--在保责任信息表
						else if("protectioninfo".equals(ostring)){
							return false;
						}
						//repaymentinfo—相关还款人信息表；
						else if("repaymentinfo".equals(ostring)&&isChange){
							return true;
						}
						//contractinfo—抵押物信息表；
						else if("contractinfo".equals(ostring)){
							return false;
						}
					}
					
					//关闭庄户--时段
					else if("20".equals(rptDateCode)){
						//assurebasicinfo—个人担保基本信息表
						if("assurebasicinfo".equals(ostring)){
							return false;
						}
						//protectioninfo--在保责任信息表
						else if("protectioninfo".equals(ostring)){
							return true;
						}
						//repaymentinfo—相关还款人信息表；
						else if("repaymentinfo".equals(ostring)){
							return false;
						}
						//contractinfo—抵押物信息表；
						else if("contractinfo".equals(ostring)){
							return false;
						}
					}
					
				}
				else if("GUARANTYINFOTYPECODE".equals(msgMtype)){
					//抵押物

					
					//合同生效--时段
					if("10".equals(rptDateCode)){
						//debtorinfo—个人抵押物基本信息表；debtcontractinfo—合同基本信息表
						
						if("debtcontractinfo".equals(ostring)){
							return true;
						}
						//coobligorinfo—共同债务人基本信息表；
						else if("coobligorinfo".equals(ostring)&&isChange){
							return true;
						}
						//guarantyinfo—抵押物信息表；
						else if("guarantyinfo".equals(ostring)&&isChange){
							return true;
						}
						//pledgorinfo—出质人基本信息表。
						else if("pledgorinfo".equals(ostring)&&isChange){
							return false;
						}
					}
					//抵（质）押物变更--时段
					else if("30".equals(rptDateCode)){
						//debtorinfo—个人抵押物基本信息表；debtcontractinfo—合同基本信息表
						
						if("debtcontractinfo".equals(ostring)){
							return true;
						}
						//coobligorinfo—共同债务人基本信息表；
						else if("coobligorinfo".equals(ostring)&&isChange){
							return true;
						}
						//guarantyinfo—抵押物信息表；
						else if("guarantyinfo".equals(ostring)&&isChange){
							return true;
						}
						//pledgorinfo—出质人基本信息表。
						else if("pledgorinfo".equals(ostring)&&isChange){
							return false;
						}
					}
					
					//合同到期、失效--时段
					else if("20".equals(rptDateCode)){//debtorinfo—个人抵押物基本信息表；debtcontractinfo—合同基本信息表
						
						if("debtcontractinfo".equals(ostring)){
							return true;
						}
						//coobligorinfo—共同债务人基本信息表；
						else if("coobligorinfo".equals(ostring)&&isChange){
							return true;
						}
						//guarantyinfo—抵押物信息表；
						else if("guarantyinfo".equals(ostring)&&isChange){
							return true;
						}
						//pledgorinfo—出质人基本信息表。
						else if("pledgorinfo".equals(ostring)&&isChange){
							return false;
						}
						}
					
				
				}
				else if("PERBORROWINGRECTYPECODE".equals(msgMtype)){
				//	个人借贷
					if(StringUtils.isBlank(acctType)){
						return  false;
					}
					//6种账户类型
					if("D1".equals(acctType)){
						//新开户--时段
						if("10".equals(rptDateCode)){
							//acctbsinfo-个人借贷基本信息表
							if("acctbsinfo".equals(ostring)){
								return true;
							}
							//rltrepinfo-责任人个数表；
							else if("rltrepinfo".equals(ostring)&&isChange){
								return true;
							}
							//cccinfo-抵押合同数表；
							else if("cccinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctcreditinfo -授信额度信息段表；
							else if("acctcreditinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctmthblginfo -月度表现信息表；
							else if("acctmthblginfo".equals(ostring)){
								return true;
							}
							//acctdbtinfo-账户非月度表现信息表；
							else if("acctdbtinfo".equals(ostring)){
								return false;
							}
							//spectransinfo-特殊交易说明段表；
							else if("spectransinfo".equals(ostring)){
								return false;
							}
						}
						//账户关闭--时段
						else if("20".equals(rptDateCode)){

							//acctbsinfo-个人借贷基本信息表
							if("acctbsinfo".equals(ostring)&&isChange){
								return true;
							}
							//rltrepinfo-责任人个数表；
							else if("rltrepinfo".equals(ostring)&&isChange){
								return true;
							}
							//cccinfo-抵押合同数表；
							else if("cccinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctcreditinfo -授信额度信息段表；
							else if("acctcreditinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctmthblginfo -月度表现信息表；
							else if("acctmthblginfo".equals(ostring)){
								return true;
							}
							//acctdbtinfo-账户非月度表现信息表；
							else if("acctdbtinfo".equals(ostring)){
								return false;
							}
							//spectransinfo-特殊交易说明段表；
							else if("spectransinfo".equals(ostring)&&isChange){
								return true;
							}
						
						}
						//月度结算-时段
						else if("30".equals(rptDateCode)){


							//acctbsinfo-个人借贷基本信息表
							if("acctbsinfo".equals(ostring)&&isChange){
								return true;
							}
							//rltrepinfo-责任人个数表；
							else if("rltrepinfo".equals(ostring)&&isChange){
								return true;
							}
							//cccinfo-抵押合同数表；
							else if("cccinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctcreditinfo -授信额度信息段表；
							else if("acctcreditinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctmthblginfo -月度表现信息表；
							else if("acctmthblginfo".equals(ostring)){
								return true;
							}
							//acctdbtinfo-账户非月度表现信息表；
							else if("acctdbtinfo".equals(ostring)){
								return false;
							}
							//spectransinfo-特殊交易说明段表；
							else if("spectransinfo".equals(ostring)&&isChange){
								return true;
							}
						
						
						}
						//月结日首次上报存量账户--时段
						else if("31".equals(rptDateCode)){



							//acctbsinfo-个人借贷基本信息表
							if("acctbsinfo".equals(ostring)){
								return true;
							}
							//rltrepinfo-责任人个数表；
							else if("rltrepinfo".equals(ostring)&&isChange){
								return true;
							}
							//cccinfo-抵押合同数表；
							else if("cccinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctcreditinfo -授信额度信息段表；
							else if("acctcreditinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctmthblginfo -月度表现信息表；
							else if("acctmthblginfo".equals(ostring)){
								return true;
							}
							//acctdbtinfo-账户非月度表现信息表；
							else if("acctdbtinfo".equals(ostring)){
								return false;
							}
							//spectransinfo-特殊交易说明段表；
							else if("spectransinfo".equals(ostring)&&isChange){
								return true;
							}
						
						
						
							
						}
						//月结日账户关闭--时段
						else if("32".equals(rptDateCode)){



							//acctbsinfo-个人借贷基本信息表
							if("acctbsinfo".equals(ostring)&&isChange){
								return true;
							}
							//rltrepinfo-责任人个数表；
							else if("rltrepinfo".equals(ostring)&&isChange){
								return true;
							}
							//cccinfo-抵押合同数表；
							else if("cccinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctcreditinfo -授信额度信息段表；
							else if("acctcreditinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctmthblginfo -月度表现信息表；
							else if("acctmthblginfo".equals(ostring)){
								return true;
							}
							//acctdbtinfo-账户非月度表现信息表；
							else if("acctdbtinfo".equals(ostring)){
								return false;
							}
							//spectransinfo-特殊交易说明段表；
							else if("spectransinfo".equals(ostring)&&isChange){
								return true;
							}
						
						
						
						}
						//收回逾期款项--时段
						else if("40".equals(rptDateCode)){



							//acctbsinfo-个人借贷基本信息表
							if("acctbsinfo".equals(ostring)){
								return false;
							}
							//rltrepinfo-责任人个数表；
							else if("rltrepinfo".equals(ostring)){
								return false;
							}
							//cccinfo-抵押合同数表；
							else if("cccinfo".equals(ostring)){
								return false;
							}
							//acctcreditinfo -授信额度信息段表；
							else if("acctcreditinfo".equals(ostring)){
								return false;
							}
							//acctmthblginfo -月度表现信息表；
							else if("acctmthblginfo".equals(ostring)){
								return false;
							}
							//acctdbtinfo-账户非月度表现信息表；
							else if("acctdbtinfo".equals(ostring)){
								return true;
							}
							//spectransinfo-特殊交易说明段表；
							else if("spectransinfo".equals(ostring)){
								return false;
							}
						
						
						
						}
					
					}
					else if("R1".equals(acctType)){

						//新开户--时段
						if("10".equals(rptDateCode)){
							//acctbsinfo-个人借贷基本信息表
							if("acctbsinfo".equals(ostring)){
								return true;
							}
							//rltrepinfo-责任人个数表；
							else if("rltrepinfo".equals(ostring)&&isChange){
								return true;
							}
							//cccinfo-抵押合同数表；
							else if("cccinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctcreditinfo -授信额度信息段表；
							else if("acctcreditinfo".equals(ostring)){
								return true;
							}
							//acctmthblginfo -月度表现信息表；
							else if("acctmthblginfo".equals(ostring)){
								return true;
							}
							//acctdbtinfo-账户非月度表现信息表；
							else if("acctdbtinfo".equals(ostring)){
								return false;
							}
							//spectransinfo-特殊交易说明段表；
							else if("spectransinfo".equals(ostring)){
								return false;
							}
						}
						//账户关闭--时段
						else if("20".equals(rptDateCode)){

							//acctbsinfo-个人借贷基本信息表
							if("acctbsinfo".equals(ostring)&&isChange){
								return true;
							}
							//rltrepinfo-责任人个数表；
							else if("rltrepinfo".equals(ostring)&&isChange){
								return true;
							}
							//cccinfo-抵押合同数表；
							else if("cccinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctcreditinfo -授信额度信息段表；
							else if("acctcreditinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctmthblginfo -月度表现信息表；
							else if("acctmthblginfo".equals(ostring)){
								return true;
							}
							//acctdbtinfo-账户非月度表现信息表；
							else if("acctdbtinfo".equals(ostring)){
								return false;
							}
							//spectransinfo-特殊交易说明段表；
							else if("spectransinfo".equals(ostring)&&isChange){
								return true;
							}
						
						}
						//月度结算-时段
						else if("30".equals(rptDateCode)){


							//acctbsinfo-个人借贷基本信息表
							if("acctbsinfo".equals(ostring)&&isChange){
								return true;
							}
							//rltrepinfo-责任人个数表；
							else if("rltrepinfo".equals(ostring)&&isChange){
								return true;
							}
							//cccinfo-抵押合同数表；
							else if("cccinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctcreditinfo -授信额度信息段表；
							else if("acctcreditinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctmthblginfo -月度表现信息表；
							else if("acctmthblginfo".equals(ostring)){
								return true;
							}
							//acctdbtinfo-账户非月度表现信息表；
							else if("acctdbtinfo".equals(ostring)){
								return false;
							}
							//spectransinfo-特殊交易说明段表；
							else if("spectransinfo".equals(ostring)&&isChange){
								return true;
							}
						
						
						}
						//月结日首次上报存量账户--时段
						else if("31".equals(rptDateCode)){



							//acctbsinfo-个人借贷基本信息表
							if("acctbsinfo".equals(ostring)){
								return true;
							}
							//rltrepinfo-责任人个数表；
							else if("rltrepinfo".equals(ostring)&&isChange){
								return true;
							}
							//cccinfo-抵押合同数表；
							else if("cccinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctcreditinfo -授信额度信息段表；
							else if("acctcreditinfo".equals(ostring)){
								return true;
							}
							//acctmthblginfo -月度表现信息表；
							else if("acctmthblginfo".equals(ostring)){
								return true;
							}
							//acctdbtinfo-账户非月度表现信息表；
							else if("acctdbtinfo".equals(ostring)){
								return false;
							}
							//spectransinfo-特殊交易说明段表；
							else if("spectransinfo".equals(ostring)&&isChange){
								return true;
							}
						
						
						
							
						}
						//月结日账户关闭--时段
						else if("32".equals(rptDateCode)){



							//acctbsinfo-个人借贷基本信息表
							if("acctbsinfo".equals(ostring)&&isChange){
								return true;
							}
							//rltrepinfo-责任人个数表；
							else if("rltrepinfo".equals(ostring)&&isChange){
								return true;
							}
							//cccinfo-抵押合同数表；
							else if("cccinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctcreditinfo -授信额度信息段表；
							else if("acctcreditinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctmthblginfo -月度表现信息表；
							else if("acctmthblginfo".equals(ostring)){
								return true;
							}
							//acctdbtinfo-账户非月度表现信息表；
							else if("acctdbtinfo".equals(ostring)){
								return false;
							}
							//spectransinfo-特殊交易说明段表；
							else if("spectransinfo".equals(ostring)&&isChange){
								return true;
							}
						
						
						
						}
						//收回逾期款项--时段
						else if("40".equals(rptDateCode)){



							//acctbsinfo-个人借贷基本信息表
							if("acctbsinfo".equals(ostring)){
								return false;
							}
							//rltrepinfo-责任人个数表；
							else if("rltrepinfo".equals(ostring)){
								return false;
							}
							//cccinfo-抵押合同数表；
							else if("cccinfo".equals(ostring)){
								return false;
							}
							//acctcreditinfo -授信额度信息段表；
							else if("acctcreditinfo".equals(ostring)){
								return false;
							}
							//acctmthblginfo -月度表现信息表；
							else if("acctmthblginfo".equals(ostring)){
								return false;
							}
							
							//acctdbtinfo-账户非月度表现信息表；
							else if("acctdbtinfo".equals(ostring)){
								return true;
							}
							//spectransinfo-特殊交易说明段表；
							else if("spectransinfo".equals(ostring)){
								return false;
							}
						
						
						
						}
					
					
					}
					
					else if("R2".equals(acctType)){


						//新开户--时段
						if("10".equals(rptDateCode)){
							//acctbsinfo-个人借贷基本信息表
							if("acctbsinfo".equals(ostring)){
								return true;
							}
							//rltrepinfo-责任人个数表；
							else if("rltrepinfo".equals(ostring)&&isChange){
								return true;
							}
							//cccinfo-抵押合同数表；
							else if("cccinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctcreditinfo -授信额度信息段表；
							else if("acctcreditinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctmthblginfo -月度表现信息表；
							else if("acctmthblginfo".equals(ostring)){
								return true;
							}
							//Specialstagininfo--大额专项分期段；
							else if("specialstagininfo".equals(ostring)&&isChange){
								return true;
							}
							//acctdbtinfo-账户非月度表现信息表；
							else if("acctdbtinfo".equals(ostring)){
								return false;
							}
							//spectransinfo-特殊交易说明段表；
							else if("spectransinfo".equals(ostring)){
								return false;
							}
						}
						//账户关闭--时段
						else if("20".equals(rptDateCode)){
							//acctbsinfo-个人借贷基本信息表
							if("acctbsinfo".equals(ostring)&&isChange){
								return true;
							}
							//rltrepinfo-责任人个数表；
							else if("rltrepinfo".equals(ostring)&&isChange){
								return true;
							}
							//cccinfo-抵押合同数表；
							else if("cccinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctcreditinfo -授信额度信息段表；
							else if("acctcreditinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctmthblginfo -月度表现信息表；
							else if("acctmthblginfo".equals(ostring)){
								return true;
							}
							//Specialstagininfo--大额专项分期段；
							else if("specialstagininfo".equals(ostring)&&isChange){
								return true;
							}
							//acctdbtinfo-账户非月度表现信息表；
							else if("acctdbtinfo".equals(ostring)){
								return false;
							}
							//spectransinfo-特殊交易说明段表；
							else if("spectransinfo".equals(ostring)&&isChange){
								return true;
							}
						}
						//月度结算-时段
						else if("30".equals(rptDateCode)){
							//acctbsinfo-个人借贷基本信息表
							if("acctbsinfo".equals(ostring)&&isChange){
								return true;
							}
							//rltrepinfo-责任人个数表；
							else if("rltrepinfo".equals(ostring)&&isChange){
								return true;
							}
							//cccinfo-抵押合同数表；
							else if("cccinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctcreditinfo -授信额度信息段表；
							else if("acctcreditinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctmthblginfo -月度表现信息表；
							else if("acctmthblginfo".equals(ostring)){
								return true;
							}
							//Specialstagininfo--大额专项分期段；
							else if("specialstagininfo".equals(ostring)&&isChange){
								return true;
							}
							//acctdbtinfo-账户非月度表现信息表；
							else if("acctdbtinfo".equals(ostring)){
								return false;
							}
							//spectransinfo-特殊交易说明段表；
							else if("spectransinfo".equals(ostring)&&isChange){
								return true;
							}
						}
						//月结日首次上报存量账户--时段
						else if("31".equals(rptDateCode)){
							//acctbsinfo-个人借贷基本信息表
							if("acctbsinfo".equals(ostring)){
								return true;
							}
							//rltrepinfo-责任人个数表；
							else if("rltrepinfo".equals(ostring)&&isChange){
								return true;
							}
							//cccinfo-抵押合同数表；
							else if("cccinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctcreditinfo -授信额度信息段表；
							else if("acctcreditinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctmthblginfo -月度表现信息表；
							else if("acctmthblginfo".equals(ostring)){
								return true;
							}
							//Specialstagininfo--大额专项分期段；
							else if("specialstagininfo".equals(ostring)&&isChange){
								return true;
							}
							//acctdbtinfo-账户非月度表现信息表；
							else if("acctdbtinfo".equals(ostring)){
								return false;
							}
							//spectransinfo-特殊交易说明段表；
							else if("spectransinfo".equals(ostring)&&isChange){
								return true;
							}
						}
						//月结日账户关闭--时段
						else if("32".equals(rptDateCode)){
							//acctbsinfo-个人借贷基本信息表
							if("acctbsinfo".equals(ostring)&&isChange){
								return true;
							}
							//rltrepinfo-责任人个数表；
							else if("rltrepinfo".equals(ostring)&&isChange){
								return true;
							}
							//cccinfo-抵押合同数表；
							else if("cccinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctcreditinfo -授信额度信息段表；
							else if("acctcreditinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctmthblginfo -月度表现信息表；
							else if("acctmthblginfo".equals(ostring)){
								return true;
							}
							//Specialstagininfo--大额专项分期段；
							else if("specialstagininfo".equals(ostring)&&isChange){
								return true;
							}
							//acctdbtinfo-账户非月度表现信息表；
							else if("acctdbtinfo".equals(ostring)){
								return false;
							}
							//spectransinfo-特殊交易说明段表；
							else if("spectransinfo".equals(ostring)&&isChange){
								return true;
							}
						}
						//收回逾期款项--时段
						else if("40".equals(rptDateCode)){



							//acctbsinfo-个人借贷基本信息表
							if("acctbsinfo".equals(ostring)){
								return false;
							}
							//rltrepinfo-责任人个数表；
							else if("rltrepinfo".equals(ostring)){
								return false;
							}
							//cccinfo-抵押合同数表；
							else if("cccinfo".equals(ostring)){
								return false;
							}
							//acctcreditinfo -授信额度信息段表；
							else if("acctcreditinfo".equals(ostring)){
								return false;
							}
							//acctmthblginfo -月度表现信息表；
							else if("acctmthblginfo".equals(ostring)){
								return false;
							}
							//Specialstagininfo--大额专项分期段；
							else if("specialstagininfo".equals(ostring)){
								return false;
							}
							//acctdbtinfo-账户非月度表现信息表；
							else if("acctdbtinfo".equals(ostring)){
								return true;
							}
							//spectransinfo-特殊交易说明段表；
							else if("spectransinfo".equals(ostring)){
								return false;
							}
						
						
						
						}
					
					
					
						
					}
					
					else if("R3".equals(acctType)){


						//新开户--时段
						if("10".equals(rptDateCode)){
							//acctbsinfo-个人借贷基本信息表
							if("acctbsinfo".equals(ostring)){
								return true;
							}
							//rltrepinfo-责任人个数表；
							else if("rltrepinfo".equals(ostring)&&isChange){
								return true;
							}
							//cccinfo-抵押合同数表；
							else if("cccinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctcreditinfo -授信额度信息段表；
							else if("acctcreditinfo".equals(ostring)){
								return true;
							}
							//acctmthblginfo -月度表现信息表；
							else if("acctmthblginfo".equals(ostring)){
								return true;
							}
							//acctdbtinfo-账户非月度表现信息表；
							else if("acctdbtinfo".equals(ostring)){
								return false;
							}
							//spectransinfo-特殊交易说明段表；
							else if("spectransinfo".equals(ostring)){
								return false;
							}
						}
						//账户关闭--时段
						else if("20".equals(rptDateCode)){

							//acctbsinfo-个人借贷基本信息表
							if("acctbsinfo".equals(ostring)&&isChange){
								return true;
							}
							//rltrepinfo-责任人个数表；
							else if("rltrepinfo".equals(ostring)&&isChange){
								return true;
							}
							//cccinfo-抵押合同数表；
							else if("cccinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctcreditinfo -授信额度信息段表；
							else if("acctcreditinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctmthblginfo -月度表现信息表；
							else if("acctmthblginfo".equals(ostring)){
								return true;
							}
							//acctdbtinfo-账户非月度表现信息表；
							else if("acctdbtinfo".equals(ostring)){
								return false;
							}
							//spectransinfo-特殊交易说明段表；
							else if("spectransinfo".equals(ostring)&&isChange){
								return true;
							}
						
						}
						//月度结算-时段
						else if("30".equals(rptDateCode)){


							//acctbsinfo-个人借贷基本信息表
							if("acctbsinfo".equals(ostring)&&isChange){
								return true;
							}
							//rltrepinfo-责任人个数表；
							else if("rltrepinfo".equals(ostring)&&isChange){
								return true;
							}
							//cccinfo-抵押合同数表；
							else if("cccinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctcreditinfo -授信额度信息段表；
							else if("acctcreditinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctmthblginfo -月度表现信息表；
							else if("acctmthblginfo".equals(ostring)){
								return true;
							}
							//acctdbtinfo-账户非月度表现信息表；
							else if("acctdbtinfo".equals(ostring)){
								return false;
							}
							//spectransinfo-特殊交易说明段表；
							else if("spectransinfo".equals(ostring)&&isChange){
								return true;
							}
						
						
						}
						//月结日首次上报存量账户--时段
						else if("31".equals(rptDateCode)){



							//acctbsinfo-个人借贷基本信息表
							if("acctbsinfo".equals(ostring)){
								return true;
							}
							//rltrepinfo-责任人个数表；
							else if("rltrepinfo".equals(ostring)&&isChange){
								return true;
							}
							//cccinfo-抵押合同数表；
							else if("cccinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctcreditinfo -授信额度信息段表；
							else if("acctcreditinfo".equals(ostring)){
								return true;
							}
							//acctmthblginfo -月度表现信息表；
							else if("acctmthblginfo".equals(ostring)){
								return true;
							}
							//acctdbtinfo-账户非月度表现信息表；
							else if("acctdbtinfo".equals(ostring)){
								return false;
							}
							//spectransinfo-特殊交易说明段表；
							else if("spectransinfo".equals(ostring)&&isChange){
								return true;
							}
						
						
						
							
						}
						//月结日账户关闭--时段
						else if("32".equals(rptDateCode)){



							//acctbsinfo-个人借贷基本信息表
							if("acctbsinfo".equals(ostring)&&isChange){
								return true;
							}
							//rltrepinfo-责任人个数表；
							else if("rltrepinfo".equals(ostring)&&isChange){
								return true;
							}
							//cccinfo-抵押合同数表；
							else if("cccinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctcreditinfo -授信额度信息段表；
							else if("acctcreditinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctmthblginfo -月度表现信息表；
							else if("acctmthblginfo".equals(ostring)){
								return true;
							}
							//acctdbtinfo-账户非月度表现信息表；
							else if("acctdbtinfo".equals(ostring)){
								return false;
							}
							//spectransinfo-特殊交易说明段表；
							else if("spectransinfo".equals(ostring)&&isChange){
								return true;
							}
						
						
						
						}
						
					
					
					
					}
					
					else if("R4".equals(acctType)){


						//新开户--时段
						if("10".equals(rptDateCode)){
							//acctbsinfo-个人借贷基本信息表
							if("acctbsinfo".equals(ostring)){
								return true;
							}
							//rltrepinfo-责任人个数表；
							else if("rltrepinfo".equals(ostring)&&isChange){
								return true;
							}
							//cccinfo-抵押合同数表；
							else if("cccinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctcreditinfo -授信额度信息段表；
							else if("acctcreditinfo".equals(ostring)){
								return true;
							}
							//acctmthblginfo -月度表现信息表；
							else if("acctmthblginfo".equals(ostring)){
								return true;
							}
							//acctdbtinfo-账户非月度表现信息表；
							else if("acctdbtinfo".equals(ostring)){
								return false;
							}
							//spectransinfo-特殊交易说明段表；
							else if("spectransinfo".equals(ostring)){
								return false;
							}
						}
						//账户关闭--时段
						else if("20".equals(rptDateCode)){

							//acctbsinfo-个人借贷基本信息表
							if("acctbsinfo".equals(ostring)&&isChange){
								return true;
							}
							//rltrepinfo-责任人个数表；
							else if("rltrepinfo".equals(ostring)&&isChange){
								return true;
							}
							//cccinfo-抵押合同数表；
							else if("cccinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctcreditinfo -授信额度信息段表；
							else if("acctcreditinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctmthblginfo -月度表现信息表；
							else if("acctmthblginfo".equals(ostring)){
								return true;
							}
							//acctdbtinfo-账户非月度表现信息表；
							else if("acctdbtinfo".equals(ostring)){
								return false;
							}
							//spectransinfo-特殊交易说明段表；
							else if("spectransinfo".equals(ostring)&&isChange){
								return true;
							}
						
						}
						//月度结算-时段
						else if("30".equals(rptDateCode)){


							//acctbsinfo-个人借贷基本信息表
							if("acctbsinfo".equals(ostring)&&isChange){
								return true;
							}
							//rltrepinfo-责任人个数表；
							else if("rltrepinfo".equals(ostring)&&isChange){
								return true;
							}
							//cccinfo-抵押合同数表；
							else if("cccinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctcreditinfo -授信额度信息段表；
							else if("acctcreditinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctmthblginfo -月度表现信息表；
							else if("acctmthblginfo".equals(ostring)){
								return true;
							}
							//acctdbtinfo-账户非月度表现信息表；
							else if("acctdbtinfo".equals(ostring)){
								return false;
							}
							//spectransinfo-特殊交易说明段表；
							else if("spectransinfo".equals(ostring)&&isChange){
								return true;
							}
						
						
						}
						//月结日首次上报存量账户--时段
						else if("31".equals(rptDateCode)){



							//acctbsinfo-个人借贷基本信息表
							if("acctbsinfo".equals(ostring)){
								return true;
							}
							//rltrepinfo-责任人个数表；
							else if("rltrepinfo".equals(ostring)&&isChange){
								return true;
							}
							//cccinfo-抵押合同数表；
							else if("cccinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctcreditinfo -授信额度信息段表；
							else if("acctcreditinfo".equals(ostring)){
								return true;
							}
							//acctmthblginfo -月度表现信息表；
							else if("acctmthblginfo".equals(ostring)){
								return true;
							}
							//acctdbtinfo-账户非月度表现信息表；
							else if("acctdbtinfo".equals(ostring)){
								return false;
							}
							//spectransinfo-特殊交易说明段表；
							else if("spectransinfo".equals(ostring)&&isChange){
								return true;
							}
						
						
						
							
						}
						//月结日账户关闭--时段
						else if("32".equals(rptDateCode)){



							//acctbsinfo-个人借贷基本信息表
							if("acctbsinfo".equals(ostring)&&isChange){
								return true;
							}
							//rltrepinfo-责任人个数表；
							else if("rltrepinfo".equals(ostring)&&isChange){
								return true;
							}
							//cccinfo-抵押合同数表；
							else if("cccinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctcreditinfo -授信额度信息段表；
							else if("acctcreditinfo".equals(ostring)&&isChange){
								return true;
							}
							//acctmthblginfo -月度表现信息表；
							else if("acctmthblginfo".equals(ostring)){
								return true;
							}
							//acctdbtinfo-账户非月度表现信息表；
							else if("acctdbtinfo".equals(ostring)){
								return false;
							}
							//spectransinfo-特殊交易说明段表；
							else if("spectransinfo".equals(ostring)&&isChange){
								return true;
							}
						
						
						
						}
						//收回逾期款项--时段
						else if("40".equals(rptDateCode)){



							//acctbsinfo-个人借贷基本信息表
							if("acctbsinfo".equals(ostring)){
								return false;
							}
							//rltrepinfo-责任人个数表；
							else if("rltrepinfo".equals(ostring)){
								return false;
							}
							//cccinfo-抵押合同数表；
							else if("cccinfo".equals(ostring)){
								return false;
							}
							//acctcreditinfo -授信额度信息段表；
							else if("acctcreditinfo".equals(ostring)){
								return false;
							}
							//acctmthblginfo -月度表现信息表；
							else if("acctmthblginfo".equals(ostring)){
								return false;
							}
							
							//acctdbtinfo-账户非月度表现信息表；
							else if("acctdbtinfo".equals(ostring)){
								return true;
							}
							//spectransinfo-特殊交易说明段表；
							else if("spectransinfo".equals(ostring)){
								return false;
							}
						
						
						
						}
					
					
					
						
					}
					//C1账户
					else if("C1".equals(acctType)){

						//新开户--时段
						if("10".equals(rptDateCode)){
							//acctbsinfo-个人借贷基本信息表
							if("acctbsinfo".equals(ostring)){
								return true;
							}
							//rltrepinfo-责任人个数表；
							else if("rltrepinfo".equals(ostring)&&isChange){
								return true;
							}
							//initialclaiminfo--初始债权说明段；
							else if("initialclaiminfo".equals(ostring)){
								return true;
							}
							//acctdbtinfo-账户非月度表现信息表；
							else if("acctdbtinfo".equals(ostring)){
								return true;
							}
							//spectransinfo-特殊交易说明段表；
							else if("spectransinfo".equals(ostring)){
								return false;
							}
						}
						//账户关闭--时段
						else if("20".equals(rptDateCode)){
							//acctbsinfo-个人借贷基本信息表
							if("acctbsinfo".equals(ostring)&&isChange){
								return true;
							}
							//rltrepinfo-责任人个数表；
							else if("rltrepinfo".equals(ostring)){
								return false;
							}
							//initialclaiminfo--初始债权说明段；
							else if("initialclaiminfo".equals(ostring)){
								return false;
							}
							//acctdbtinfo-账户非月度表现信息表；
							else if("acctdbtinfo".equals(ostring)){
								return true;
							}
							//spectransinfo-特殊交易说明段表；
							else if("spectransinfo".equals(ostring)&&isChange){
								return true;
							}
						
						}				
						//收回逾期款项--时段
						else if("40".equals(rptDateCode)){
							//acctbsinfo-个人借贷基本信息表
							if("acctbsinfo".equals(ostring)&&isChange){
								return true;
							}
							//rltrepinfo-责任人个数表；
							else if("rltrepinfo".equals(ostring)){
								return false;
							}
							//initialclaiminfo--初始债权说明段；
							else if("initialclaiminfo".equals(ostring)){
								return false;
							}
							//acctdbtinfo-账户非月度表现信息表；
							else if("acctdbtinfo".equals(ostring)){
								return true;
							}
							//spectransinfo-特殊交易说明段表；
							else if("spectransinfo".equals(ostring)&&isChange){
								return true;
							}
						
						}
					
					
					}
					
					
				}
			
		}
		
		return false;
		
	}

}
