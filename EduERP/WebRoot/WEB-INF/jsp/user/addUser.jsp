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
	<form action="user/doAddUser" method="post">
		<table>
			<tr>
				<td>添加用户</td>
			</tr>
			<tr>
				<td>登录名:</td>
				<td><input type="text" name="userName">
				</td>
				<td></td>
			</tr>
			<tr>
				<td>密码:</td>
				<td><input type="password" name="passWord">
				</td>
				<td></td>
			</tr>
			<tr>
				<td>姓名:</td>
				<td><input type="text" name="name">
				</td>
				<td></td>
			</tr>
			<tr>
				<td>电话:</td>
				<td><input type="text" name="phone">
				</td>
				<td></td>
			</tr>
			<tr>
				<td><input type="submit" value="登录">
				</td>
				<td></td>
				<td></td>
			</tr>
		</table>
	</form>
</body>
</html>
