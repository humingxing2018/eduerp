<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'standardlist.jsp' starting page</title>
    
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
    <table border="1">
    <tr>
    <th>标准课程名称</th>
    <th>标准课程类型</th>
    <th>标准课程创建时间</th>
    <th>标准课程生效时间</th>
    <th>操作</th>
    </tr>
      <c:forEach items="${standardList}" var="sdd"  varStatus="status">
      <tr>
      <td>${sdd.stdName}</td>
      <td>${sdd.typeId}</td>
      <td>${sdd.stdTime}</td>
      <td>${sdd.activeTime}</td>
      <td><a href="#">新增</a>
      	  <a href="#">修改</a>
      	  <a href="#">删除</a></td>
      </tr>
      </c:forEach>   
    </table>
  </body>
</html>
