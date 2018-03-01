<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加机房信息</title>
    
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
  	<form action="class/insert" method="post">
	    <table>
	    	<tr>
	    		<td>添加机房</td>
	    	</tr>
	    	<tr>
	    		<td>机房ID:</td>
	    		<td><input type="text" name="id"></td>
	    		<td></td>
	    	</tr>
	    	<tr>
	    		<td>机房名称:</td>
	    		<td><input type="text" name="className"></td>
	    		<td>
	    		</td>
	    	</tr>
			<tr>
	    		<td>座位数:</td>
	    		<td><input type="text" name="seats"></td>
	    		<td></td>
	    	</tr>
	    	<tr>
	    		<td>类型:</td>
	    		<td><input type="text" name="typeId"></td>
	    		<td></td>
	    	</tr>
	    	<tr>
	    		<td><input type="submit" value="添加"></td>
	    		<td></td>
	    		<td></td>
	    	</tr>
	    </table>
    </form>
  </body>
</html>
