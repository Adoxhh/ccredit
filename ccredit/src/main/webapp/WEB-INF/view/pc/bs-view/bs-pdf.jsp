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
        form.attr("action", "../bsBssgmtController/exportBsPDF");
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
        <p style="font-weight: bold;">企业基本信息记录</p>
        <table >
            
            <tr>
                <th >信息记录类型</th>
                <th >企业名称</th>
                <th >企业身份标识类型</th>
                <th >企业身份标识号码</th>
                <th >信息报告日期</th>
            </tr>
            <tr>
              <c:forEach var="BsBssgmt" items="${BsBssgmt}">
                <td>${BsBssgmt.infrectypetext}</td>
                <td>${BsBssgmt.entname}</td>
                <td>${BsBssgmt.entcerttypetext}</td>
                <td>${BsBssgmt.entcertnum}</td>
                <td>${BsBssgmt.rptdatetext}</td>
              </c:forEach>
            </tr>
           
            <tr>
           		<th >信息来源编码</th>
           		<th >客户资料维护机构代码</th>
           		<th >客户资料类型</th>
           		<th >存续状态</th>
           		<th >组织机构类型</th>
            </tr>
            
            
            <tr>
	            <c:forEach var="BsBssgmt" items="${BsBssgmt}">
                <td>${BsBssgmt.infsurccode}</td>
                <td>${BsBssgmt.cimoc}</td>
                <td>${BsBssgmt.customertypetext}</td>
                <td>${BsBssgmt.etpststext}</td>
                <td>${BsBssgmt.orgtypetext}</td>
	            </c:forEach>
            </tr>
            
        </table>
    </div>
    
     <div class="civilRecord bj">
        <p style="font-weight: bold;">其他标识段</p>
        <table>
            
            <tr>
                <th class="th1">其他标识个数</th>
                <th class="th1">企业身份标识类型</th>
                <th class="th1">企业身份标识号码</th>
                <th class="th1">信息更新日期</th>
                <th class="th1"></th>
            </tr>
            <tr>			
            <c:forEach var="BsIdsgmt" items="${BsIdsgmt}">
                <td >${BsIdsgmt.idnm}</td>
                <td >${BsIdsgmt.othentcerttypetext}</td>
                <td >${BsIdsgmt.othentcertnum}</td>
                <td >${BsIdsgmt.idinfoupdatetext}</td>
                <td ></td>
             </c:forEach>
            </tr>
        </table>
    </div>
     
    <div class="civilRecord bj">
        <p style="font-weight: bold;">基本概况信息</p>
        <table>
            <tr>
                <th class="th1">国别代码</th>
                <th class="th1">登记地址</th>
                <th class="th1">登记地行政区划代码</th>
                <th class="th1">成立日期</th>
                <th class="th1">营业许可到期日</th>
            </tr>
            <tr>			
            <c:forEach var="BsFcsinfsgmt" items="${BsFcsinfsgmt}">
                <td >${BsFcsinfsgmt.nationalitytext}</td>
                <td >${BsFcsinfsgmt.regadd}</td>
                <td >${BsFcsinfsgmt.admdivofregtext}</td>
                <td >${BsFcsinfsgmt.establishdatetext}</td>
                <td >${BsFcsinfsgmt.bizenddatetext}</td>
             </c:forEach>
            </tr>
            <tr>
                <th class="th1">业务范围</th>
                <th class="th1">行业分类代码</th>
                <th class="th1">经济类型代码</th>
                <th class="th1">企业规模</th>
                <th class="th1">信息更新日期</th>
            </tr>
            <tr>			
            <c:forEach var="BsFcsinfsgmt" items="${BsFcsinfsgmt}">
                <td >${BsFcsinfsgmt.bizrange}</td>
                <td >${BsFcsinfsgmt.ecoinduscatetext}</td>
                <td >${BsFcsinfsgmt.ecotypetext}</td>
                <td >${BsFcsinfsgmt.entscaletext}</td>
                <td >${BsFcsinfsgmt.fcsinfoupdatetext}</td>
             </c:forEach>
            </tr>
        </table>
    </div>
    
    <div class="civilRecord bj">
        <p style="font-weight: bold;">主要组成人员</p>
        <table>
            <tr>
                <th class="th1">组成人员个数</th>
                <th class="th1">组成人员姓名</th>
                <th class="th1">组成人员证件类型</th>
                <th class="th1">组成人员证件号码</th>
                <th class="th1">组成人员职位</th>
            </tr>
            <tr>			
            <c:forEach var="BsMnmmbinfsgmt" items="${BsMnmmbinfsgmt}">
                <td >${BsMnmmbinfsgmt.mmbnm}</td>
                <td >${BsMnmmbinfsgmt.mmbalias}</td>
                <td >${BsMnmmbinfsgmt.mmbidtypetext}</td>
                <td >${BsMnmmbinfsgmt.mmbidnum}</td>
                <td >${BsMnmmbinfsgmt.mmbpstntext}</td>
             </c:forEach>
            </tr>
            
            <tr>
                <th class="th1">信息更新日期</th>
                <th class="th1"></th>
                <th class="th1"></th>
                <th class="th1"></th>
                <th class="th1"></th>
            </tr>
            <tr>			
            <c:forEach var="BsMnmmbinfsgmt" items="${BsMnmmbinfsgmt}">
                <td >${BsMnmmbinfsgmt.mnmmbinfoupdatetext}</td>
                <td ></td>
                <td ></td>
                <td ></td>
                <td ></td>
             </c:forEach>
            </tr>
        </table>
      </div>
	
        
      <div class="civilRecord bj">
        <p style="font-weight: bold;">注册资本及主要出资人</p>
        <table>
            <tr>
                <th class="th1">注册资本币种</th>
                <th class="th1">注册资本</th>
                <th class="th1">主要出资人个数</th>
                <th class="th1">出资人类型</th>
                <th class="th1">出资人身份类别</th>
            </tr>
            <tr>			
             <c:forEach var="BsMnshahodinfsgmt" items="${BsMnshahodinfsgmt}">
                <td >${BsMnshahodinfsgmt.regcapcurrencytext}</td>
                <td >${BsMnshahodinfsgmt.regcap}</td>
                <td >${BsMnshahodinfsgmt.mnsharhodnm}</td>
                <td >${BsMnshahodinfsgmt.sharhodtypetext}</td>
                <td >${BsMnshahodinfsgmt.sharhodidtype1text}</td>
             </c:forEach>
            </tr>
            <tr>
                <th class="th1">出资人姓名</th>
                <th class="th1">出资人身份标识类型</th>
                <th class="th1">出资人身份标识号码</th>
                <th class="th1">出资比例</th>
                <th class="th1">信息更新日期</th>
            </tr>
            <tr>			
             <c:forEach var="BsMnshahodinfsgmt" items="${BsMnshahodinfsgmt}">
                <td >${BsMnshahodinfsgmt.sharhodname}</td>
                <td >${BsMnshahodinfsgmt.sharhodidtype2text}</td>
                <td >${BsMnshahodinfsgmt.sharhodidnum}</td>
                <td >${BsMnshahodinfsgmt.invratio}</td>
                <td >${BsMnshahodinfsgmt.mnshahodinfoupdatetext}</td>
             </c:forEach>
            </tr>
        </table>
    </div>
    
     <div class="civilRecord bj">
        <p style="font-weight: bold;">实际控制人信息</p>
        <table>
            <tr>
                <th class="th1">实际控制人个数</th>
                <th class="th1">实际控制人身份类别</th>
                <th class="th1">实际控制人姓名</th>
                <th class="th1">实际控制人证件类型</th>
                <th class="th1">实际控制人证件号码</th>
            </tr>
            <tr>			
             <c:forEach var="BsActucotrlinfsgmt" items="${BsActucotrlinfsgmt}">
                <td >${BsActucotrlinfsgmt.actucotrlnm}</td>
                <td >${BsActucotrlinfsgmt.actucotrlidtype1text}</td>
                <td >${BsActucotrlinfsgmt.actucotrlname}</td>
                <td >${BsActucotrlinfsgmt.actucotrlidtype2text}</td>
                <td >${BsActucotrlinfsgmt.actucotrlidnum}</td>
             </c:forEach>
            </tr>
            <tr>
                <th class="th1">信息更新日期</th>
                <th class="th1"></th>
                <th class="th1"></th>
                <th class="th1"></th>
                <th class="th1"></th>
            </tr>
            <tr>			
             <c:forEach var="BsActucotrlinfsgmt" items="${BsActucotrlinfsgmt}">
                <td >${BsActucotrlinfsgmt.actucotrlinfoupdatetext}</td>
                <td ></td>
                <td ></td>
                <td ></td>
                <td ></td>
             </c:forEach>
            </tr>
        </table>
    </div>
    
    <div class="civilRecord bj">
        <p style="font-weight: bold;">上级机构信息</p>
        <table>
            <tr>
                <th class="th1">上级机构类型</th>
                <th class="th1">上级机构名称</th>
                <th class="th1">上级机构身份标识类型</th>
                <th class="th1">上级机构身份标识码</th>
                <th class="th1">信息更新日期</th>
            </tr>
            <tr>			
             <c:forEach var="BsSpvsgathrtyinfsgmt" items="${BsSpvsgathrtyinfsgmt}">
                <td >${BsSpvsgathrtyinfsgmt.suporgtypetext}</td>
                <td >${BsSpvsgathrtyinfsgmt.suporgname}</td>
                <td >${BsSpvsgathrtyinfsgmt.suporgcerttypetext}</td>
                <td >${BsSpvsgathrtyinfsgmt.suporgcertnum}</td>
                <td >${BsSpvsgathrtyinfsgmt.suporginfoupdatetext}</td>
             </c:forEach>
            </tr>
        </table>
    </div>
    
    <div class="civilRecord bj">
        <p style="font-weight: bold;">联系方式信息</p>
        <table>
            <tr>
                <th class="th1">联系地址行政区划代码</th>
                <th class="th1">联系地址</th>
                <th class="th1">联系电话</th>
                <th class="th1">财务部门联系电话</th>
                <th class="th1">信息更新日期</th>
            </tr>
            <tr>			
             <c:forEach var="BsCotainfsgmt" items="${BsCotainfsgmt}">
                <td >${BsCotainfsgmt.conadddistrictcodetext}</td>
                <td >${BsCotainfsgmt.conadd}</td>
                <td >${BsCotainfsgmt.conphone}</td>
                <td >${BsCotainfsgmt.finconphone}</td>
                <td >${BsCotainfsgmt.cotainfoupdatetext}</td>
             </c:forEach>
            </tr>
        </table>
    </div>
    
    <div class="civilRecord bj">
        <p style="font-weight: bold;">企业身份标识整合信息记录</p>
        <table>
            <tr>
                <th class="th1">信息记录类型</th>
                <th class="th1">企业名称</th>
                <th class="th1">企业身份标识类型</th>
                <th class="th1">企业身份标识号码</th>
                <th class="th1">其他企业身份标识类型</th>
            </tr>
            <tr>			
             <c:forEach var="BsEnctfitginf" items="${BsEnctfitginf}">
                <td >${BsEnctfitginf.infrectypetext}</td>
                <td >${BsEnctfitginf.entname}</td>
                <td >${BsEnctfitginf.entcerttypetext}</td>
                <td >${BsEnctfitginf.entcertnum}</td>
                <td >${BsEnctfitginf.othentcerttypetext}</td>
             </c:forEach>
            </tr>
            
            <tr>
                <th class="th1">其他企业身份标识号码</th>
                <th class="th1">身份标识关联标志</th>
                <th class="th1">信息报告日期</th>
                <th class="th1"></th>
                <th class="th1"></th>
            </tr>
            <tr>			
             <c:forEach var="BsEnctfitginf" items="${BsEnctfitginf}">
                <td >${BsEnctfitginf.othentcertnum}</td>
                <td >${BsEnctfitginf.certassflgtext}</td>
                <td >${BsEnctfitginf.rptdatetext}</td>
                <td ></td>
                <td ></td>
             </c:forEach>
            </tr>
        </table>
    </div>
    
    <div class="civilRecord bj">
        <p style="font-weight: bold;">企业间关联关系信息记录</p>
        <table>
            <tr>
                <th class="th1">信息记录类型</th>
                <th class="th1">A企业名称</th>
                <th class="th1">A企业身份标识类型</th>
                <th class="th1">A企业身份标识号码</th>
                <th class="th1">B企业名称</th>
            </tr>
            <tr>			
             <c:forEach var="BsEnicdnrltpinf" items="${BsEnicdnrltpinf}">
                <td >${BsEnicdnrltpinf.infrectypetext}</td>
                <td >${BsEnicdnrltpinf.entname}</td>
                <td >${BsEnicdnrltpinf.entcerttypetext}</td>
                <td >${BsEnicdnrltpinf.entcertnum}</td>
                <td >${BsEnicdnrltpinf.assoentname}</td>
             </c:forEach>
            </tr>
            
             <tr>
                <th class="th1">B企业身份标识类型</th>
                <th class="th1">B企业身份标识号码</th>
                <th class="th1">关联关系类型</th>
                <th class="th1">关联标志</th>
                <th class="th1">信息报告日期</th>
            </tr>
            <tr>			
             <c:forEach var="BsEnicdnrltpinf" items="${BsEnicdnrltpinf}">
                <td >${BsEnicdnrltpinf.assoentcerttypetext}</td>
                <td >${BsEnicdnrltpinf.assoentcertnum}</td>
                <td >${BsEnicdnrltpinf.assotypetext}</td>
                <td >${BsEnicdnrltpinf.assosigntext}</td>
                <td >${BsEnicdnrltpinf.rptdatetext}</td>
             </c:forEach>
            </tr>
            
        </table>
    </div>
    
    
    
</div>
</body>
</html>