<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Job.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/jquery.min.js"></script>

  </head>
  
  <body>
    <div>
    <a href="job/preinsert">添加</a> 
		<table border="1">
			<tr>
				<td>作业类型</td>
				<td>章节序号</td>
				<td>作业名称</td>
				<th>操作</th>
			</tr>

			<c:forEach var="List" items="${List}">
				<tr>
					<td>${List.jid}</td>
					<td>${List.jname}</td>
					<td>${List.chaNumber}</td>
					<td>
					<a href="job/preupdate?id=${List.id}">修改</a> 
					<a href="job/deletejob?id=${List.id}">删除</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
  </body>
</html>
