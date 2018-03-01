<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updateClassInfo.jsp' starting page</title>
    
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
    <form action="${basePath}classInfo/update" method="post">
	    <table>
	    	<tr>
	    		<td colspan="3">修改班级编号<input type="hidden" name="id" value="${classInfo.id}"></td>
	    	</tr>
	    	<tr>
	    		<td>班级名称:</td>
	    		<td><input type="text" name="className" value="${classInfo.className}"></td>
	    		<td></td>
	    	</tr>
	    	<tr>
	    		<td>教员:</td>
	    		<td><input type="text" name="faculty" value="${classInfo.faculty}"></td>
	    		<td>
	    		</td>
	    	</tr>
			<tr>
	    		<td>班主任:</td>
	    		<td><input type="text" name="head" value="${classInfo.head}"></td>
	    		<td></td>
	    	</tr>
	    	<tr>
	    		<td>人数:</td>
	    		<td><input type="text" name="classNumber" value="${classInfo.classNumber}"></td>
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
