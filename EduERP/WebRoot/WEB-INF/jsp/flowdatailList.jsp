<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title></title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <table border="1">
    	<tr>
    		<td>流程详情表ID</td>
    		<td>流程主表ID</td>
    		<td>流程环节名称</td>
    		<td>流程环节状态</td>
    		<td>审核人ID</td>
    	</tr>
		<c:forEach items="${flowdatailList}" var="sadsa">
			<tr>
				<td>${sadsa.fldId}</td>
				<td>${sadsa.fliId}</td>
				<td>${sadsa.fldName}</td>
				<td>${sadsa.dictCode}</td>
				<td>${sadsa.userId}</td>
			</tr>
		</c:forEach>
	</table>
  </body>
</html>
