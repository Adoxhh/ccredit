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
        form.attr("action", "../asGuaracctbsinfsgmtController/exportAsPDF");
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
        <p style="font-weight: bold;">企业担保账户记录</p>
        <table >
            
            <tr>
                <th >信息记录类型</th>
                <th >账户类型</th>
                <th >账户标识码</th>
                <th >信息报告日期</th>
                <th >报告时点说明代码</th>
            </tr>
            <tr>
              <c:forEach var="AsGuaracctbssgmt" items="${AsGuaracctbssgmt}">
                <td>${AsGuaracctbssgmt.infrectypetext}</td>
                <td>${AsGuaracctbssgmt.accttypetext}</td>
                <td>${AsGuaracctbssgmt.acctcode}</td>
                <td>${AsGuaracctbssgmt.rptdatetext}</td>
                <td>${AsGuaracctbssgmt.rptdatecodetext}</td>
              </c:forEach>
            </tr>
           
            <tr>
           		<th >债务人名称</th>
           		<th >债务人身份标识类型</th>
           		<th >债务人身份标识号码</th>
           		<th >业务管理机构代码</th>
           		<th ></th>
            </tr>
            
            
            <tr>
	            <c:forEach var="AsGuaracctbssgmt" items="${AsGuaracctbssgmt}">
                <td>${AsGuaracctbssgmt.name}</td>
                <td>${AsGuaracctbssgmt.idtypetext}</td>
                <td>${AsGuaracctbssgmt.idnum}</td>
                <td>${AsGuaracctbssgmt.mngmtorgcode}</td>
                <td></td>
	            </c:forEach>
            </tr>
            
        </table>
    </div>
    
     <div class="civilRecord bj">
        <p style="font-weight: bold;">企业担保账户基本信息</p>
        <table>
            
            <tr>
                <th class="th1">担保业务大类</th>
                <th class="th1">担保业务种类细分</th>
                <th class="th1">开户日期</th>
                <th class="th1">担保金额</th>
                <th class="th1">币种</th>
            </tr>
            <tr>			
            <c:forEach var="AsGuaracctbsinfsgmt" items="${AsGuaracctbsinfsgmt}">
                <td >${AsGuaracctbsinfsgmt.busilinestext}</td>
                <td >${AsGuaracctbsinfsgmt.busidtillinestext}</td>
                <td >${AsGuaracctbsinfsgmt.opendatetext}</td>
                <td >${AsGuaracctbsinfsgmt.guaramt}</td>
                <td >${AsGuaracctbsinfsgmt.cytext}</td>
             </c:forEach>
            </tr>
            
            <tr>
                <th class="th1">到期日期</th>
                <th class="th1">反担保方式</th>
                <th class="th1">其他还款保证方式</th>
                <th class="th1">保证金百分比</th>
                <th class="th1">担保合同文本编号</th>
            </tr>
             <tr>
	            <c:forEach var="AsGuaracctbsinfsgmt" items="${AsGuaracctbsinfsgmt}">
                <td >${AsGuaracctbsinfsgmt.duedatetext}</td>
                <td >${AsGuaracctbsinfsgmt.guarmodetext}</td>
                <td >${AsGuaracctbsinfsgmt.othrepyguarwaytext}</td>
                <td >${AsGuaracctbsinfsgmt.secdep}</td>
                <td >${AsGuaracctbsinfsgmt.ctrcttxtcode}</td>
	            </c:forEach>
            </tr>
            
        </table>
    </div>
     
    <div class="civilRecord bj">
        <p style="font-weight: bold;">相关还款责任人信息</p>
        <table>
            <tr>
                <th class="th1">相关还款责任人个数</th>
                <th class="th1">身份类别</th>
                <th class="th1">相关还款责任人名称</th>
                <th class="th1">相关还款责任人身份标识类型</th>
                <th class="th1">相关还款责任人身份标识号码</th>
            </tr>
            <tr>			
            <c:forEach var="AsRltrepymtinfsgmt" items="${AsRltrepymtinfsgmt}">
                <td >${AsRltrepymtinfsgmt.rltrepymtnm}</td>
                <td >${AsRltrepymtinfsgmt.infoidtypetext}</td>
                <td >${AsRltrepymtinfsgmt.arlpname}</td>
                <td >${AsRltrepymtinfsgmt.arlpcerttypetext}</td>
                <td >${AsRltrepymtinfsgmt.arlpcertnum}</td>
             </c:forEach>
            </tr>
            <tr>
                <th class="th1">还款责任类型</th>
                <th class="th1">还款责任金额</th>
                <th class="th1"></th>
                <th class="th1"></th>
                <th class="th1"></th>
            </tr>
            <tr>			
            <c:forEach var="AsRltrepymtinfsgmt" items="${AsRltrepymtinfsgmt}">
                <td >${AsRltrepymtinfsgmt.arlptypetext}</td>
                <td >${AsRltrepymtinfsgmt.arlpamt}</td>
                <td ></td>
                <td ></td>
                <td ></td>
             </c:forEach>
            </tr>
        </table>
    </div>
    
    <div class="civilRecord bj">
        <p style="font-weight: bold;">抵质押品信息</p>
        <table>
            
            <tr>
                <th class="th1">抵质押合同个数</th>
                <th class="th1">抵质押合同标识号</th>
                <th class="th1"></th>
                <th class="th1"></th>
                <th class="th1"></th>
            </tr>
            <tr>			
            <c:forEach var="AsGuarmotgtalctrctinf" items="${AsGuarmotgtalctrctinf}">
                <td >${AsGuarmotgtalctrctinf.ccnm}</td>
                <td >${AsGuarmotgtalctrctinf.ccc}</td>
                <td ></td>
                <td ></td>
                <td ></td>
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
            <tr>			
             <c:forEach var="AsGuaracctcredsgmt" items="${AsGuaracctcredsgmt}">
                <td >${AsGuaracctcredsgmt.mcc}</td>
                <td ></td>
                <td ></td>
                <td ></td>
                <td ></td>
             </c:forEach>
            </tr>
        </table>
    </div>
    
     <div class="civilRecord bj">
        <p style="font-weight: bold;">在保责任信息</p>
        <table>
            <tr>
                <th class="th1">账户状态</th>
                <th class="th1">在保余额</th>
                <th class="th1">余额变化日期</th>
                <th class="th1">五级分类</th>
                <th class="th1">五级分类认定日期</th>
            </tr>
            <tr>			
             <c:forEach var="AsGuarrltrepymtinf" items="${AsGuarrltrepymtinf}">
                <td >${AsGuarrltrepymtinf.acctstatustext}</td>
                <td >${AsGuarrltrepymtinf.loanamt}</td>
                <td >${AsGuarrltrepymtinf.repayprdtext}</td>
                <td >${AsGuarrltrepymtinf.fivecatetext}</td>
                <td >${AsGuarrltrepymtinf.fivecateadjdatetext}</td>
             </c:forEach>
            </tr>
            <tr>
                <th class="th1">风险敞口</th>
                <th class="th1">代偿（垫款）标志</th>
                <th class="th1">账户关闭日期</th>
                <th class="th1"></th>
                <th class="th1"></th>
            </tr>
            <tr>			
             <c:forEach var="AsGuarrltrepymtinf" items="${AsGuarrltrepymtinf}">
                <td >${AsGuarrltrepymtinf.riex}</td>
                <td >${AsGuarrltrepymtinf.compadvflagtext}</td>
                <td >${AsGuarrltrepymtinf.closedatetext}</td>
                <td ></td>
                <td ></td>
             </c:forEach>
            </tr>
        </table>
    </div>
</div>
</body>
</html>