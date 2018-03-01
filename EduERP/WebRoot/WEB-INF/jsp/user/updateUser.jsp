<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>修改用户</title>
    
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
    <form action="${basePath}user/update" method="post">
	    <table>
	    	<tr>
	    		<td colspan="3">修改用户<input type="hidden" name="id" value="${user.id}"></td>
	    	</tr>
	    	<tr>
	    		<td>登录名:</td>
	    		<td><input type="text" name="userName" value="${user.userName}"></td>
	    		<td></td>
	    	</tr>
	    	<tr>
	    		<td>密码:</td>
	    		<td><input type="password" name="passWord" value="${user.passWord}"></td>
	    		<td>
	    		</td>
	    	</tr>
			<tr>
	    		<td>姓名:</td>
	    		<td><input type="text" name="name" value="${user.name}"></td>
	    		<td></td>
	    	</tr>
	    	<tr>
	    		<td>电话:</td>
	    		<td><input type="text" name="phone" value="${user.phone}"></td>
	    		<td></td>
	    	</tr>
	    	<tr>
	    		<td><input type="submit" value="提交"></td>
	    		<td></td>
	    		<td></td>
	    	</tr>
	    </table>
    </form>
  </body>
</html>
