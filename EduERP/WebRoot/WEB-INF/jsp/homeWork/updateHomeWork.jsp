<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updateHomeWork.jsp' starting page</title>
    
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
   <div class="right">
     <div class="location">
         <strong>你现在所在的位置是:</strong>
         <span>作业管理页面 >> 作业添加页面</span>
     </div>
     <div>
        <form method="post" action="${pageContext.request.contextPath }/homeWork/update">
        	<div>
	    		<td colspan="3">修改用户<input type="hidden" name="id" value="${homeWork.id}"></td>
	    	</div>
              <div>
              <label for="chpId">章节:</label>
                 <input type="text" name="chpId" class="text" id="title" value=""> 
				 <font color="red"></font>
             </div>
             <div>
              <label for="claId">班级：</label>
                 <input type="text" name="claId" class="text" id="title" value=""> 
				 <font color="red"></font>
             </div>
             <div>
                 <label for="type">作业类型：</label>
                 <input type="text" name="type" id="paperSummary" value=""> 
				 <font color="red"></font>
             </div>
             <div>
                 <label for="completion">完成情况：</label>
                 <input type="text" name="completion" id="paperPath" value=""> 
				 <font color="red"></font>
             </div>
              <div>
                 <label for="userId">用户：</label>
                 <input type="text" name="userId" id="paperPath" value=""> 
				 <font color="red"></font>
             </div>
             <div>
                 	<input type="submit" value="保存"/>
				  	<input type="button" id="back" name="back" value="返回" >
             </div>
         </form>
     </div>
 </div>
  </body>
</html>
