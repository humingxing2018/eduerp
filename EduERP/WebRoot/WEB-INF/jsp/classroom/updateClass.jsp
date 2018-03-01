<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>修改机房信息</title>
    
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
    <form action="class/update" method="post">
	    <table>
	    	<tr>
	    		<td colspan="3">机房ID<input type="hidden" name="id" value="${Class.id}"></td>
	    	</tr>
	    	<tr>
	    		<td>机房名称:</td>
	    		<td><input type="text" name="className" value="${Class.className}"></td>
	    		<td></td>-
	    	</tr>
	    	<tr>
	    		<td>座位数:</td>
	    		<td><input type="text" name="seats" value="${Class.seats}"></td>
	    		<td>
	    		</td>
	    	</tr>
			<tr>
	    		<td>类型:</td>
	    		<td><input type="text" name="typeId" value="${Class.typeId}"></td>
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
