<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>班级信息</title>
    
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
              <td>班级名称</td>
              <td>教员</td>
              <td>班主任</td>
              <td>人数</td>
              <td>操作</td>
          </tr>
          <c:forEach var="classInfolist" items="${List}" varStatus="status">
				<tr>
					<td>
					<span>${classInfolist.className}</span>
					</td>
					<td>
					<span>${classInfolist.faculty}</span>
					</td>
					<td>
					<span>${classInfolist.head}</span>
					</td>
					<td>
					<span>${classInfolist.classNumber}</span>
					</td>
					<td>
					<a href="classInfo/preAddClassInfo">新增</a>
                    <a href="classInfo/preUpdateClassInfo?id=${classInfolist.id}">修改</a>
                    <a href="classInfo/deleteclassinfo?id=${classInfolist.id}">删除</a>
                    </td>
				</tr>
			</c:forEach>
			<tr>
			   <td>
    			<a href="#">首页</a>
    			</td>
    			<td>
    			<a href="#">上一页</a></td>
    			<td>
    			<a href="#">下一页</a></td>
    			<td>
    			<a href="#">末页</a></td>
    			</td>
    	</tr>
      </table>
  </body>
</html>

