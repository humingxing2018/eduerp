<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>添加用户</title>

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
<center>
	<form action="task/doAddTask" method="post">
			<table border="1px">
			<tr>
				<td align="center" colspan="2">添加任务信息</td>
			</tr>
			<tr>
				<td>标题:</td>
				<td><input type="text" name="title"></td>
			</tr>
			<tr>
				<td>路径:</td>
				<td><input type="text" name="path"></td>
			</tr>
			<tr>
				<td>优先级:</td>
				<td><input type="text" name="sortIdex"></td>
			</tr>
			<tr>
				<td align="center" colspan="2">
				<input type="submit" value="提交"></td>
			</tr>
		</table>
		
	</form>
</center>
</body>
</html>
