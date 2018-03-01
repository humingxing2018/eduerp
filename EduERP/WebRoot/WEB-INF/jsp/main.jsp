<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="common/header.jsp" %>
<div class="page-title">
	<div class="title_left">
		<h3>
			<h3>
			欢迎你：${userSession.userName }<strong> | 角色：${userSession.userName }</strong>
			</h3>
		</h3>
		<a href="${pageContext.request.contextPath }/homeWork/homeWork.html">作业情况</a>
		<a href="${pageContext.request.contextPath }/classInfo/classInfo.html">班级信息</a>
		<a href="${pageContext.request.contextPath }/flowdatail/flowdatailList">流程环节表</a>
		<a href="${pageContext.request.contextPath }/standard/standardlist">标准课程信息</a>
		<a href="${pageContext.request.contextPath }/task/tasklist">任务信息</a>
		<a href="${pageContext.request.contextPath }/chapter/Chapter">章节信息</a>
		<a href="${pageContext.request.contextPath }/user/userList">注册</a>
	</div>
</div>
<div class="clearfix"></div>        
<%@include file="common/footer.jsp" %>  
     
