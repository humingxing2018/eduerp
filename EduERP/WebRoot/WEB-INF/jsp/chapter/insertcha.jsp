<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'insertcha.jsp' starting page</title>
    
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
	<form action="chapter/addcha" method="post">
		<table>
			<tr>
				<td>章节编码:</td>
				<td><input type="text" name="chaId">
				</td>
			</tr>
			<tr>
				<td>章节名称:</td>
				<td><input type="text" name="chaName">
				</td>
			</tr>
			<tr>
				<td>章节序号:</td>
				<td><input type="text" name="chaNumber">
				</td>
			</tr>
			<tr>
				<td><input type="submit" name="保存">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
