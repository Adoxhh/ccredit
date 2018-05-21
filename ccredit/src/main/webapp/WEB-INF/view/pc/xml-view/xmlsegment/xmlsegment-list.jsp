<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="/deng/include/include.jsp"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String templateid = (String)request.getAttribute("templateid"); 
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>  
<head>  
<meta charset="UTF-8">  
<title>模板维护</title>  
	<script type="text/javascript" src="../view/pc/xml-view/xmlsegment/xmlsegment-list.js"></script>  
	<script type="text/javascript" src="../view/pc/xml-view/xmlsegment/xmlsegment-add.js"></script>  
	<script type="text/javascript" src="../view/pc/xml-view/xmlsegment/xmlsegment-update.js"></script>  
	<script type="text/javascript" src="../view/pc/xml-view/xmlsegment/xmlsegment-detail.js"></script>  
	
	<script type="text/javascript" src="../view/pc/xml-view/xmlnode/xmlnode-list.js"></script>  
	<script type="text/javascript" src="../view/pc/xml-view/xmlnode/xmlnode-add.js"></script>  
	<script type="text/javascript" src="../view/pc/xml-view/xmlnode/xmlnode-update.js"></script>  
	<script type="text/javascript" src="../view/pc/xml-view/xmlnode/xmlnode-detail.js"></script>  
	
</head>  
<body>
<input type="hidden" id="templateid" value="<%=templateid%>"/>  
</body>  
</html> 