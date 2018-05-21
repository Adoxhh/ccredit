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
        form.attr("action", "../plMotgacltalctrctbssgmtController/exportPlPDF");
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
        <p style="font-weight: bold;">抵（质）押合同信息记录</p>
        <table >
            
            <tr>
                <th >信息记录类型</th>
                <th >抵（质）押合同标识码</th>
                <th >信息报告日期</th>
                <th >报告时点说明代码</th>
                <th >债务人身份类别</th>
            </tr>
            <tr>
              <c:forEach var="PlMotgacltalctrctbssgmt" items="${PlMotgacltalctrctbssgmt}">
                <td>${PlMotgacltalctrctbssgmt.infrectypetext}</td>
                <td>${PlMotgacltalctrctbssgmt.cccode}</td>
                <td>${PlMotgacltalctrctbssgmt.rptdatetext}</td>
                <td>${PlMotgacltalctrctbssgmt.rptdatecodetext}</td>
                <td>${PlMotgacltalctrctbssgmt.infoidtypetext}</td>
              </c:forEach>
            </tr>
           
            <tr>
           		<th >债务人姓名</th>
                <th >债务人身份标识类型</th>
                <th >债务人身份标识号码</th>
                <th >业务管理机构代码</th>
                <th ></th>
            </tr>
            
            
            <tr>
	            <c:forEach var="PlMotgacltalctrctbssgmt" items="${PlMotgacltalctrctbssgmt}">
                <td>${PlMotgacltalctrctbssgmt.name}</td>
                <td>${PlMotgacltalctrctbssgmt.certtypetext}</td>
                <td>${PlMotgacltalctrctbssgmt.certnum}</td>
                <td>${PlMotgacltalctrctbssgmt.mngmtorgcode}</td>
                <td></td>
	            </c:forEach>
            </tr>
            
        </table>
    </div>
    
     <div class="civilRecord bj">
        <p style="font-weight: bold;">抵（质）押合同基本信息</p>
        <table>
            
            <tr>
                <th class="th1">合同类型</th>
                <th class="th1">担保金额</th>
                <th class="th1">币种</th>
                <th class="th1">抵（质）押合同生效日期</th>
                <th class="th1">抵（质）押合同到期日期</th>
            </tr>
            
            
            <tr>			
            <c:forEach var="PlMotgacltalbsinfsgmt" items="${PlMotgacltalbsinfsgmt}">
                <td >${PlMotgacltalbsinfsgmt.guartypetext}</td>
                <td >${PlMotgacltalbsinfsgmt.ccamt}</td>
                <td >${PlMotgacltalbsinfsgmt.cytext}</td>
                <td >${PlMotgacltalbsinfsgmt.ccvaldatetext}</td>
                <td >${PlMotgacltalbsinfsgmt.ccexpdatetext}</td>
             </c:forEach>
            </tr>
            
            <tr>
                <th class="th1">最高额担保标志</th>
                <th class="th1">抵质押合同状态</th>
                <th class="th1"></th>
                <th class="th1"></th>
                <th class="th1"></th>
            </tr>
             <tr>
	            <c:forEach var="PlMotgacltalbsinfsgmt" items="${PlMotgacltalbsinfsgmt}">
                <td >${PlMotgacltalbsinfsgmt.maxguartext}</td>
                <td >${PlMotgacltalbsinfsgmt.ccstatustext}</td>
                <td></td>
                <td></td>
                <td></td>
	            </c:forEach>
            </tr>
            
        </table>
    </div>
     
    <div class="civilRecord bj">
        <p style="font-weight: bold;">共同债务人信息</p>
        <table>
            
            <tr>
                <th class="th1">债务人个数</th>
                <th class="th1">身份类别</th>
                <th class="th1">共同债务人名称</th>
                <th class="th1">共同债务人身份标识类型</th>
                <th class="th1">债务人身份标识号码</th>
            </tr>
            <tr>			
            <c:forEach var="PlComrecinfsgmt" items="${PlComrecinfsgmt}">
                <td >${PlComrecinfsgmt.grtdnm}</td>
                <td >${PlComrecinfsgmt.infoidtypetext}</td>
                <td >${PlComrecinfsgmt.guarname}</td>
                <td >${PlComrecinfsgmt.guarcerttypetext}</td>
                <td >${PlComrecinfsgmt.guarcertnum}</td>
             </c:forEach>
            </tr>
        </table>
    </div>
    
    <div class="civilRecord bj">
        <p style="font-weight: bold;">抵押物信息</p>
        <table>
            
            <tr>
                <th class="th1">抵押物个数</th>
                <th class="th1">抵押物种类</th>
                <th class="th1">抵押物识别号类型</th>
                <th class="th1">抵押物唯一识别号</th>
                <th class="th1">抵押物所在地行政区划</th>
            </tr>
            <tr>			
            <c:forEach var="PlMotgaproptinfsgmt" items="${PlMotgaproptinfsgmt}">
                <td >${PlMotgaproptinfsgmt.plenm}</td>
                <td >${PlMotgaproptinfsgmt.pletypetext}</td>
                <td >${PlMotgaproptinfsgmt.motgaproptidtypetext}</td>
                <td >${PlMotgaproptinfsgmt.plecertid}</td>
                <td >${PlMotgaproptinfsgmt.pledistrtext}</td>
             </c:forEach>
            </tr>
            
            <tr>
                <th class="th1">抵押物评估价值</th>
                <th class="th1">评估机构类型</th>
                <th class="th1">抵押物评估日期</th>
                <th class="th1">抵押人类型</th>
                <th class="th1">抵押人姓名</th>
            </tr>
            <tr>			
            <c:forEach var="PlMotgaproptinfsgmt" items="${PlMotgaproptinfsgmt}">
                <td >${PlMotgaproptinfsgmt.plevalue}</td>
                <td >${PlMotgaproptinfsgmt.valorgtypetext}</td>
                <td >${PlMotgaproptinfsgmt.valdatetext}</td>
                <td >${PlMotgaproptinfsgmt.pledgortypetext}</td>
                <td >${PlMotgaproptinfsgmt.pledgorname}</td>
             </c:forEach>
            </tr>
            
            <tr>
                <th class="th1">抵押人身份标识类型</th>
                <th class="th1">抵押人身份标识号码</th>
                <th class="th1">抵押物说明</th>
                <th class="th1"></th>
                <th class="th1"></th>
            </tr>
            <tr>			
            <c:forEach var="PlMotgaproptinfsgmt" items="${PlMotgaproptinfsgmt}">
                <td >${PlMotgaproptinfsgmt.pleorcerttypetext}</td>
                <td >${PlMotgaproptinfsgmt.pleorcertnum}</td>
                <td >${PlMotgaproptinfsgmt.pledesc}</td>
                <td ></td>
                <td ></td>
             </c:forEach>
            </tr>
        </table>
      </div>
	
        
      <div class="civilRecord bj">
        <p style="font-weight: bold;">质物信息</p>
        <table>
            <tr>
                <th class="th1">质物种类个数</th>
                <th class="th1">质物种类</th>
                <th class="th1">质物价值</th>
                <th class="th1">出质人类型</th>
                <th class="th1">出质人名称</th>
            </tr>
            <tr>			
             <c:forEach var="PlCltalinfsgmt" items="${PlCltalinfsgmt}">
                <td >${PlCltalinfsgmt.impnm}</td>
                <td >${PlCltalinfsgmt.imptypetext}</td>
                <td >${PlCltalinfsgmt.impval}</td>
                <td >${PlCltalinfsgmt.ippctext}</td>
                <td >${PlCltalinfsgmt.pawnname}</td>
             </c:forEach>
            </tr>
            
            <tr>
                <th class="th1">出质人身份标识类型</th>
                <th class="th1">出质人身份标识号码</th>
                <th class="th1"></th>
                <th class="th1"></th>
                <th class="th1"></th>
            </tr>
            <tr>			
             <c:forEach var="PlCltalinfsgmt" items="${PlCltalinfsgmt}">
                <td >${PlCltalinfsgmt.pawncerttypetext}</td>
                <td >${PlCltalinfsgmt.pawncertnum}</td>
                <td ></td>
                <td ></td>
                <td ></td>
             </c:forEach>
            </tr>
        </table>
    </div>
    
</div>
</body>
</html>