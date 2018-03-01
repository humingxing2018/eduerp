<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>任务信息</title>
    
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
    <table border="1px">
    	<tr>
    		<th>标题</th>
    		<th>路径</th>
    		<th>优先级</th>
    		<th>操作</th>
    	</tr>
    	<c:forEach items="${tasklist}" var="task" varStatus="status">
    		<tr>
    			<td>${task.title}</td>
    			<td>${task.path}</td>
    			<td>${task.sortIdex}</td>
    			<td>
    				<a href="task/addTask">新增</a>
    				<a href="task/preUpdate?id=${task.id}">修改</a>
    				<a href="task/delete?id=${task.id}">删除</a>
    			</td>
    		</tr>
    	</c:forEach>
    </table>
  </body>
</html>
