<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <body>
    <div class="right">
       <div class="location">
           <strong>你现在所在的位置是:</strong>
           <span>作业管理页面</span>
       </div>
       <div class="search">
       <form method="get" action="${pageContext.request.contextPath }/homeWork/doAddService">
			<input name="method" value="query" class="input-text" type="hidden">
			<span>章节：</span>
			<input name="chpId" type="text" value="${chpId}">
			<span>班级：</span>
			<input name="claId" type="text" value="${claId}">
			<span>作业类型：</span>
			<input name="type" type="text" value="${type}">
			<span>完成情况：</span>
			<input name="completion" type="text" value="${completion}">
			 <input	value="查 询" type="submit" id="searchbutton">
			 <a href="homeWorkAdd.html">添加作业情况</a>
		</form>
       </div>
      <table class="homeWorkTeble" cellpadding="0" cellspacing="0">
          <tr class="firstTr">
              <th width="10%">序号</th>
              <th width="20%">章节</th>
              <th width="10%">班级</th>
              <th width="10%">作业类型</th>
              <th width="10%">完成情况</th>
              <th width="20%">用户</th>
              <th width="30%">操作</th>
          </tr>
          <c:forEach var="homeWork" items="${homeWorklist}">
				<tr>
					<td>
					<span>${homeWork.id}</span>
					</td>
					<td>
					<span>${homeWork.chpId}</span>
					</td>
					<td>
					<span>${homeWork.claId}</span>
					</td>
					<td>
					<span>${homeWork.type}</span>
					</td>
					<td>
					<span>${homeWork.completion}</span>
					<td>
					<td>
					<span>${homeWork.userId}</span>
					<td>
				</tr>
				<td>
    			<a href="preUpdate?id=${homeWork.id}">修改</a>
    			<a href="delete?id=${homeWork.id}">删除</a>
    		</td>
			</c:forEach>
			<tr>
    		<td colspan="4">
    			<a href="#">首页</a>
    			<a href="#">上一页</a>
    			<a href="#">下一页</a>
    			<a href="#">末页</a>
    		</td>
    	</tr>
      </table>
  </div>
  </body>
</html>
