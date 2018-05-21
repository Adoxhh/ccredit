<%@ page language="java" contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en" id="htmlId">
<head>
<meta charset="UTF-8" />
<style>
      .box{
          /* width: 1000px;
          border:1px solid red; */
          text-align: center;
      }
      table{
          width: 100%;
      }
      table, th, td {
          border: 1px solid grey;
          border-collapse: collapse;
          font-size: 12px;
      }
      table th {
          height: 40px;
          line-height: 40px;
          background: #cdcdcd;
          text-align: center;
      }
      table td {
          height: 40px;
          line-height: 40px;
          color: black;
          text-align: center;
          width:20%;
      }

      /*如果要隔行变色把下面解开换色就行*/
   /*   table tr:nth-child(odd) {
          background-color: white;
      }
      table tr:nth-child(even) {
          background-color:#99ccff;
      }*/
      .civilRecord{
          margin-top: 20px;
      }
      /*这是固定某一列表格的宽度*/
      .civilRecord .th1{
          width: 70px;
      }
      
      .bj{
          margin-left: 5%;
          margin-right: 5%;        
      }
	*{ margin:0px; padding:0px;}
	
	/**分页重影问题
	div{margin:auto;page-break-inside:avoid;}
	*/
</style>
<script type="text/javascript" src="${syspath}/deng/source/plugins/jquery-1.9.1.min.js"></script>
<script type="text/javascript">
	function msg() {
        var form=$("<form>");//定义一个form表单
        form.attr("style","display:none");
        form.attr("target","");
        form.attr("method","post");
        form.attr("action", "../loanAcctbsinfsgmtController/exportLoanPDF");
        var input1=$("<input>");
        input1.attr("type","hidden");
        input1.attr("name","htmlContent");
        var html=$("#htmlId").html();
        input1.attr("value",html);
        $("#pdfBody").append(form);//将表单放置在web中
        form.append(input1);
        form.submit();//表单提交 
    }
</script>
</head>
<body id="pdfBody">
<div class="box" style="height:430px;overflow:auto ">
    <div style="margin-left:80%;line-height: 28px;position: relative;">
       <input type="button" value="导出PDF" onclick="msg()"/>
    </div>
    <div class="taxesRecord bj">
        <p style="font-weight: bold;">企业借贷基础信息</p>
        <table >
            
            <tr>
                <th >信息记录类型</th>
                <th >账户类型</th>
                <th >企业账户标识码</th>
                <th >信息报告日期</th>
                <th >报告时点说明代码</th>
            </tr>
            
            
            <tr>
              <c:forEach var="LoanAcctbssgmt" items="${LoanAcctbssgmt}">
                <td>${LoanAcctbssgmt.infrectypetext}</td>
                <td>${LoanAcctbssgmt.accttypetext}</td>
                <td>${LoanAcctbssgmt.acctcode}</td>
                <td>${LoanAcctbssgmt.rptdatetext}</td>
                <td>${LoanAcctbssgmt.rptdatecodetext}</td>
              </c:forEach>
            </tr>
            
        
         
            <tr>
           		<th >借款人名称</th>
                <th >借款人身份标识类型</th>
                <th >借款人身份标识号码</th>
                <th >业务管理机构代码</th>
                <th ></th>
            </tr>
            
            
            <tr>
            <c:forEach var="LoanAcctbssgmt" items="${LoanAcctbssgmt}">
                <td>${LoanAcctbssgmt.name}</td>
                <td>${LoanAcctbssgmt.idtypetext}</td>
                <td>${LoanAcctbssgmt.idnum}</td>
                <td>${LoanAcctbssgmt.mngmtorgcode}</td>
                <td></td>
                </c:forEach>
            </tr>
            
        </table>
    </div>
     <div class="civilRecord bj">
        <p style="font-weight: bold;">企业借贷基本信息</p>
        <table>
            
            <tr>
                <th class="th1">借贷业务大类</th>
                <th class="th1">借贷业务种类细分</th>
                <th class="th1">开户日期</th>
                <th class="th1">币种</th>
                <th class="th1">信用额度</th>
            </tr>
            
            
            <tr>
            <c:forEach var="LoanAcctbsinfsgmt" items="${LoanAcctbsinfsgmt}">
                <td >${LoanAcctbsinfsgmt.busilinestext}</td>
                <td >${LoanAcctbsinfsgmt.busidtllinestext}</td>
                <td >${LoanAcctbsinfsgmt.opendatetext}</td>
                <td >${LoanAcctbsinfsgmt.cytext}</td>
                <td >${LoanAcctbsinfsgmt.acctcredline}</td>
             </c:forEach>
            </tr>
            
        
            
            <tr>
                <th class="th1">借款金额</th>
                <th class="th1">分次放款标志</th>
                <th class="th1">到期日期</th>
                <th class="th1">还款方式</th>
                <th class="th1">还款频率</th>
            </tr>
            
            
            <tr>
            <c:forEach var="LoanAcctbsinfsgmt" items="${LoanAcctbsinfsgmt}">
                <td >${LoanAcctbsinfsgmt.loanamt}</td>
                <td >${LoanAcctbsinfsgmt.flagtext}</td>
                <td >${LoanAcctbsinfsgmt.duedatetext}</td>
                <td >${LoanAcctbsinfsgmt.repaymodetext}</td>
                <td >${LoanAcctbsinfsgmt.repayfreqcytext}</td>
             </c:forEach>
            </tr>
            
        
            
            <tr>
                <th class="th1">业务申请地行政区划代码</th>
                <th class="th1">担保方式 </th>
                <th class="th1">其他还款保证方式</th>
                <th class="th1">贷款期限分类</th>
                <th class="th1">贷款发放形式</th>
            </tr>
            
            
            <tr>
            <c:forEach var="LoanAcctbsinfsgmt" items="${LoanAcctbsinfsgmt}">
                <td>${LoanAcctbsinfsgmt.applybusidist}</td>
                <td>${LoanAcctbsinfsgmt.guarmodetext}</td>
                <td>${LoanAcctbsinfsgmt.othrepyguarwaytext}</td>
                <td>${LoanAcctbsinfsgmt.loantimelimcattext}</td>
                <td>${LoanAcctbsinfsgmt.loafrmtext}</td>
             </c:forEach>
            </tr>
            
        
            
            <tr>
                <th class="th1">贷款实际投向</th>
                <th class="th1">资产转让标识</th>
                <th class="th1">资金来源 </th>
                <th class="th1"></th>
                <th class="th1"></th>
            </tr>
            
            
            <tr>
            <c:forEach var="LoanAcctbsinfsgmt" items="${LoanAcctbsinfsgmt}">
                <td>${LoanAcctbsinfsgmt.actinvesttext}</td>
                <td>${LoanAcctbsinfsgmt.assettrandflagtext}</td>
                <td>${LoanAcctbsinfsgmt.fundsoutext}</td>
                <td></td>
                <td></td>
             </c:forEach>
            </tr>
            
        </table>
    </div>
    
    <div class="civilRecord bj">
        <p style="font-weight: bold;">关联还款责任人信息</p>
        <table>
            
            <tr>
                <th class="th1">责任人个数</th>
                <th class="th1">身份类别</th>
                <th class="th1">责任人名称</th>
                <th class="th1">责任人身份标识类型</th>
                <th class="th1">责任人身份标识号码</th>
            </tr>
            
            <c:forEach var="LoanRltrepymtinfsgmt" items="${LoanRltrepymtinfsgmt}">
            
            <tr>
                <td>${LoanRltrepymtinfsgmt.rltrepymtnm}</td>
                <td>${LoanRltrepymtinfsgmt.arlpidtypetext}</td>
                <td>${LoanRltrepymtinfsgmt.arlpname}</td>
                <td>${LoanRltrepymtinfsgmt.arlpcerttypetext}</td>
                <td>${LoanRltrepymtinfsgmt.arlpcertnum}</td>
            </tr>
            
             </c:forEach>
        
            
            <tr>
                <th class="th1">还款责任人类型</th>
                <th class="th1">还款责任金额</th>
                <th class="th1"></th>
                <th class="th1"></th>
                <th class="th1"></th>
            </tr>
            
            <c:forEach var="LoanRltrepymtinfsgmt" items="${LoanRltrepymtinfsgmt}">
            
            <tr>
                <td>${LoanRltrepymtinfsgmt.arlptypetext}</td>
                <td>${LoanRltrepymtinfsgmt.arlpamt}</td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
            
             </c:forEach>
        </table>
    </div>
    <div class="civilRecord bj">
        <p style="font-weight: bold;">抵质押品信息</p>
        <table>
            
            <tr>
                <th class="th1">抵质押合同个数</th>
                <th class="th1">抵质押合同标识码 </th>
                <th class="th1"></th>
                <th class="th1"></th>
                <th class="th1"></th>
            </tr>
            
            
            <tr>
            <c:forEach var="LoanMotgacltalctrctinfsgmt" items="${LoanMotgacltalctrctinfsgmt}">
                <td>${LoanMotgacltalctrctinfsgmt.ccnm }</td>
                <td>${LoanMotgacltalctrctinfsgmt.ccc}</td>
                <td></td>
                <td></td>
                <td></td>
             </c:forEach>
            </tr>
            
        </table>
    </div>
    
    <div class="civilRecord bj">
        <p style="font-weight: bold;">授信额度信息</p>
        <table>
            
            <tr>
                <th class="th1">授信协议标识码</th>
                <th class="th1"></th>
                <th class="th1"></th>
                <th class="th1"></th>
                <th class="th1"></th>
            </tr>
            
             <c:forEach var="LoanAcctcredsgmt" items="${LoanAcctcredsgmt}">
            
            <tr>
                <td>${LoanAcctcredsgmt.mcc}</td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
            
            </c:forEach>
        </table>
    </div>
    
    <div class="civilRecord bj">
        <p style="font-weight: bold;">初始债权说明</p>
        <table>
            
            <tr>
                <th class="th1">初始债权人名称</th>
                <th class="th1">初始债权人机构代码 </th>
                <th class="th1">原债务种类</th>
                <th class="th1">债权转移时的还款状态</th>
                <th class="th1"></th>
            </tr>
            
             <c:forEach var="LoanOrigcreditorinfsgmt" items="${LoanOrigcreditorinfsgmt}">
            
            <tr>
                <td>${LoanOrigcreditorinfsgmt.initcredname}</td>
                <td>${LoanOrigcreditorinfsgmt.initcedorgcode}</td>
                <td>${LoanOrigcreditorinfsgmt.origdbtcatetext}</td>
                <td>${LoanOrigcreditorinfsgmt.initrpyststext}</td>
                <td></td>
            </tr>
            
             </c:forEach>
        </table>
    </div>
    
    <div class="civilRecord bj">
        <p style="font-weight: bold;">还款表现信息</p>
        <table>
            
            <tr>
                <th class="th1">账户状态</th>
                <th class="th1">余额 </th>
                <th class="th1">余额变化日期</th>
                <th class="th1">五级分类</th>
                <th class="th1">五级分类认定日期 </th>
                
            </tr>
            
             <c:forEach var="LoanActlbltyinfsgmt" items="${LoanActlbltyinfsgmt}">
            
            <tr>
                <td>${LoanActlbltyinfsgmt.acctstatustext}</td>
                <td>${LoanActlbltyinfsgmt.acctbal}</td>
                <td>${LoanActlbltyinfsgmt.balchgdatetext}</td>
                <td>${LoanActlbltyinfsgmt.fivecatetext}</td>
                <td>${LoanActlbltyinfsgmt.fivecateadjdatetext}</td>
            </tr>
            
             </c:forEach>
        
            
            <tr>
            	<th class="th1">剩余还款月数</th>
                <th class="th1">当前逾期总额 </th>
                <th class="th1">当前逾期本金</th>
                <th class="th1">当前逾期天数</th>
                <th class="th1">最近一次实际还款日期</th>
            </tr>
            
             <c:forEach var="LoanActlbltyinfsgmt" items="${LoanActlbltyinfsgmt}">
            
            <tr>
                <td>${LoanActlbltyinfsgmt.pymtprd}</td>
                <td>${LoanActlbltyinfsgmt.totoverd}</td>
                <td>${LoanActlbltyinfsgmt.overdprinc}</td>
                <td>${LoanActlbltyinfsgmt.overddy}</td>
                <td>${LoanActlbltyinfsgmt.latrpydatetext}</td>
            </tr>
            
             </c:forEach>
            
            <tr>
            	<th class="th1">最近一次实际还款金额</th>
                <th class="th1">还款形式 </th>
                <th class="th1">最近一次约定还款日</th>
                <th class="th1">最近一次应还款金额</th>
                <th class="th1">下一次约定还款日期</th>
            </tr>
            
             <c:forEach var="LoanActlbltyinfsgmt" items="${LoanActlbltyinfsgmt}">
            
            <tr>
                <td>${LoanActlbltyinfsgmt.latrpyamt}</td>
                <td>${LoanActlbltyinfsgmt.rpmttypetext}</td>
                <td>${LoanActlbltyinfsgmt.latagrrrpydatetext}</td>
                <td>${LoanActlbltyinfsgmt.latagrrrpyamt}</td>
                <td>${LoanActlbltyinfsgmt.nxtagrrrpydatetext}</td>
            </tr>
            
             </c:forEach>
        
            
            <tr>
                <th class="th1">账户关闭日期</th>
                <th class="th1"></th>
                <th class="th1"></th>
                <th class="th1"></th>
                <th class="th1"></th>
            </tr>
            
             <c:forEach var="LoanActlbltyinfsgmt" items="${LoanActlbltyinfsgmt}">
            
            <tr>
                <td>${LoanActlbltyinfsgmt.closedatetext}</td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
            
             </c:forEach>
        </table>
    </div>
    
    <div class="civilRecord bj">
        <p style="font-weight: bold;">特定交易说明信息</p>
        <table>
            
            <tr>
                <th class="th1">交易个数</th>
                <th class="th1">交易类型 </th>
                <th class="th1">交易日期</th>
                <th class="th1">交易金额</th>
                <th class="th1">到期日期变更月数</th>
            </tr>
            
             <c:forEach var="LoanAcctspectrstdspnsgmt" items="${LoanAcctspectrstdspnsgmt}">
            
            <tr>
                <td>${LoanAcctspectrstdspnsgmt.cagoftrdnm}</td>
                <td>${LoanAcctspectrstdspnsgmt.chantrantypetext}</td>
                <td>${LoanAcctspectrstdspnsgmt.trandatetext}</td>
                <td>${LoanAcctspectrstdspnsgmt.tranamt}</td>
                <td>${LoanAcctspectrstdspnsgmt.duetranmon}</td>
            </tr>
            
             </c:forEach>
        
            
            <tr>
                <th class="th1">交易明细信息</th>
                <th class="th1"></th>
                <th class="th1"></th>
                <th class="th1"></th>
                <th class="th1"></th>
            </tr>
            
             <c:forEach var="LoanAcctspectrstdspnsgmt" items="${LoanAcctspectrstdspnsgmt}">
            
            <tr>
                <td>${LoanAcctspectrstdspnsgmt.detinfo}</td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
            
             </c:forEach>
        </table>
    </div>
    
    <div class="civilRecord bj">
        <p style="font-weight: bold;">企业授信协议信息记录</p>
        <table>
            
            <tr>
                <th class="th1">信息记录类型</th>
                <th class="th1">授信协议标识码 </th>
                <th class="th1">信息报告日期</th>
                <th class="th1">报告时点说明代码</th>
                <th class="th1">受信人名称</th>
            </tr>
            
             <c:forEach var="LoanCtrctbssgmt" items="${LoanCtrctbssgmt}">
            
            <tr>
                <td>${LoanCtrctbssgmt.infrectypetext}</td>
                <td>${LoanCtrctbssgmt.contractcode}</td>
                <td>${LoanCtrctbssgmt.rptdatetext}</td>
                <td>${LoanCtrctbssgmt.rptdatecodetext}</td>
                <td>${LoanCtrctbssgmt.name}</td>
            </tr>
            
             </c:forEach>
        
            
            <tr>
                <th class="th1">受信人身份标识类型</th>
                <th class="th1">受信人身份标识证件号码</th>
                <th class="th1">业务管理机构代码</th>
                <th class="th1"></th>
                <th class="th1"></th>
            </tr>
            
             <c:forEach var="LoanCtrctbssgmt" items="${LoanCtrctbssgmt}">
            
            <tr>
                <td>${LoanCtrctbssgmt.idtypetext}</td>
                <td>${LoanCtrctbssgmt.idnum}</td>
                <td>${LoanCtrctbssgmt.mngmtorgcode}</td>
                <td></td>
                <td></td>
            </tr>
            
             </c:forEach>
        </table>
    </div>
    
    <div class="civilRecord bj">
        <p style="font-weight: bold;">企业授信协议共同受信人信息</p>
        <table>
            
            <tr>
                <th class="th1">受信人个数</th>
                <th class="th1">共同受信人身份类别 </th>
                <th class="th1">共同受信人名称</th>
                <th class="th1">共同受信人身份标识类型</th>
                <th class="th1">共同受信人身份标识号码 </th>
            </tr>
            
             <c:forEach var="LoanCtrctcertrelsgmt" items="${LoanCtrctcertrelsgmt}">
            
            <tr>
                <td>${LoanCtrctcertrelsgmt.brernm}</td>
                <td>${LoanCtrctcertrelsgmt.brertypetext}</td>
                <td>${LoanCtrctcertrelsgmt.certrelname}</td>
                <td>${LoanCtrctcertrelsgmt.certrelidtypetext}</td>
                <td>${LoanCtrctcertrelsgmt.certrelidnum}</td>
            </tr>
            
             </c:forEach>
        </table>
    </div>
    
    <div class="civilRecord bj">
        <p style="font-weight: bold;">企业授信额度信息</p>
        <table>
            
            <tr>
                <th class="th1">授信额度类型 </th>
                <th class="th1">额度循环标志 </th>
                <th class="th1">授信额度</th>
                <th class="th1">币种</th>
                <th class="th1">额度生效日期</th>
            </tr>
            
             <c:forEach var="LoanCreditlimsgmt" items="${LoanCreditlimsgmt}">
            
            <tr>
                <td>${LoanCreditlimsgmt.creditlimtypetext}</td>
                <td>${LoanCreditlimsgmt.limloopflgtext}</td>
                <td>${LoanCreditlimsgmt.creditlim}</td>
                <td>${LoanCreditlimsgmt.cytext}</td>
                <td>${LoanCreditlimsgmt.coneffdatetext}</td>
            </tr>
            
             </c:forEach>
        
            
            <tr>
                <th class="th1">额度到期日期</th>
                <th class="th1">额度状态</th>
                <th class="th1"> </th>
                <th class="th1"></th>
                <th class="th1"></th>
            </tr>
            
             <c:forEach var="LoanCreditlimsgmt" items="${LoanCreditlimsgmt}">
            
            <tr>
                <td>${LoanCreditlimsgmt.conexpdatetext}</td>
                <td>${LoanCreditlimsgmt.constatustext}</td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
            
             </c:forEach>
        </table>
    </div>
    
    <div class="civilRecord bj">
        <p style="font-weight: bold;">企业最高额保证合同信息记录</p>
        <table>
            
            <tr>
                <th class="th1">信息记录类型</th>
                <th class="th1">保证合同标识码</th>
                <th class="th1">信息报告日期</th>
                <th class="th1">报告时点说明代码</th>
                <th class="th1">受信人名称</th>
            </tr>
            
             <c:forEach var="LoanGuarbssgmt" items="${LoanGuarbssgmt}">
            
            <tr>
                <td>${LoanGuarbssgmt.infrectypetext}</td>
                <td>${LoanGuarbssgmt.guarmccode}</td>
                <td>${LoanGuarbssgmt.rptdatetext}</td>
                <td>${LoanGuarbssgmt.rptdatecodetext}</td>
                <td>${LoanGuarbssgmt.name}</td>
            </tr>
            
             </c:forEach>
       
            
            <tr>
                <th class="th1">受信人身份标识类型</th>
                <th class="th1">受信人身份标识证件号码</th>
                <th class="th1">业务管理机构代码</th>
                <th class="th1"></th>
                <th class="th1"></th>
            </tr>
            
             <c:forEach var="LoanGuarbssgmt" items="${LoanGuarbssgmt}">
            
            <tr>
                <td>${LoanGuarbssgmt.idtypetext}</td>
                <td>${LoanGuarbssgmt.idnum}</td>
                <td>${LoanGuarbssgmt.mngmtorgcode}</td>
                <td></td>
                <td></td>
            </tr>
            
             </c:forEach>
        </table>
    </div>
    
    <div class="civilRecord bj">
        <p style="font-weight: bold;">企业最高额保证联保人信息</p>
        <table>
            
            <tr>
                <th class="th1">联保人个数</th>
                <th class="th1">联保人身份类别</th>
                <th class="th1">联保人名称</th>
                <th class="th1">联保人身份标识类型</th>
                <th class="th1">联保人身份标识号码</th>
            </tr>
            
             <c:forEach var="LoanCosignersgmt" items="${LoanCosignersgmt}">
            
            <tr>
                <td>${LoanCosignersgmt.cosignersnm}</td>
                <td>${LoanCosignersgmt.cosignerstypetext}</td>
                <td>${LoanCosignersgmt.cosignersname}</td>
                <td>${LoanCosignersgmt.cosignersidtypetext}</td>
                <td>${LoanCosignersgmt.cosignersidnum}</td>
            </tr>
            
             </c:forEach>
        </table>
    </div>
    
    <div class="civilRecord bj">
        <p style="font-weight: bold;">企业最高额保证额度信息</p>
        <table>
            
            <tr>
                <th class="th1">额度循环标志</th>
                <th class="th1">保证额度</th>
                <th class="th1">币种</th>
                <th class="th1">额度生效日期</th>
                <th class="th1">额度到期日期</th>
            </tr>
            
             <c:forEach var="LoanGuarcreditlimsgmt" items="${LoanGuarcreditlimsgmt}">
            
            <tr>
                <td>${LoanGuarcreditlimsgmt.limloopflgtext}</td>
                <td>${LoanGuarcreditlimsgmt.guarlim}</td>
                <td>${LoanGuarcreditlimsgmt.cytext}</td>
                <td>${LoanGuarcreditlimsgmt.coneffdatetext}</td>
                <td>${LoanGuarcreditlimsgmt.conexpdatetext}</td>
            </tr>
            
             </c:forEach>
        
            
            <tr>
                <th class="th1">额度状态</th>
                <th class="th1"></th>
                <th class="th1"></th>
                <th class="th1"></th>
                <th class="th1"></th>
            </tr>
            
             <c:forEach var="LoanGuarcreditlimsgmt" items="${LoanGuarcreditlimsgmt}">
            
            <tr>
                <td>${LoanGuarcreditlimsgmt.constatustext}</td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
            </tr>
            
             </c:forEach>
        </table>
    </div>
    
    
</div>
</body>
</html>