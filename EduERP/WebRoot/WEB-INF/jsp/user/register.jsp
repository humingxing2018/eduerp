<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0"/>
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
<!DOCTYPE html>
<html>
<head lang="en">
<meta charset="UTF-8">
<title>用户注册 - EDUERP系统</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/statics/css/register.css" />
<script type="text/javascript" src="statics/js/jquery.min.js">
</script>
<body>  
<center>  
    <form action="/doRegister" method="post">
	    <table border="1px">
	    	<tr>
	    		<td align="center" colspan="2">添加用户</td>
	    	</tr>
	    	<tr>
	    		<td>用户名:</td>
	    		<td><input type="text" name="userName"></td>
	    	</tr>
	    	<tr>
	    		<td>密码:</td>
	    		<td><input type="password" name="passWord"></td>
	    	</tr>
			<tr>
	    		<td>姓名:</td>
	    		<td><input type="text" name="name"></td>
	    	</tr>
	    	<tr>
	    		<td>电话:</td>
	    		<td><input type="text" name="phone"></td>
	    	</tr>
	    	<tr>
	    		<td colspan="2" align="center">
	    			<input type="submit" value="提交">	
	    		</td>
	    	</tr>
	    </table>
    </form>
    </center>  
</body>
</html>
