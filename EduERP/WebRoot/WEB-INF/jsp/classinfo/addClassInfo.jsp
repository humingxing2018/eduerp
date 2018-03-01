<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
        <base href="<%=basePath%>">
    
    <title>添加班级信息</title>
    
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
  	<form action="classInfo/doAddClassInfo" method="post">
	    <table>
	    	<tr>
	    		<td>添加班级信息</td>
	    	</tr>
	    	<tr>
	    		<td>班级名称:</td>
	    		<td><input type="text" name="className"></td>
	    		<td>
	    		</td>
	    	</tr>
			<tr>
	    		<td>教员:</td>
	    		<td><input type="text" name="faculty"></td>
	    		<td></td>
	    	</tr>
	    	<tr>
	    		<td>班主任:</td>
	    		<td><input type="text" name="head"></td>
	    		<td></td>
	    	</tr>
	    	<tr>
	    		<td>人数:</td>
	    		<td><input type="text" name="classNumber"></td>
	    		<td></td>
	    	</tr>
	    	<tr>
	    		<td><input type="submit" value="保存"/>
				  	<input type="button" id="back" name="back" value="返回" ></td>
	    		<td></td>
	    		<td></td>
	    	</tr>
	    </table>
    </form>
  </body>
</html>
