<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>查询机房信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	<script type="text/javascript" src="statics/js/jquery.min.js"></script>
	<script type="text/javascript">
	$(function(){
		var curpage=1;
		var totpages;
		initData(curpage);
		//首页
		$("#firstPage").click(function(){
			curpage=1;
			initData(curpage);
		});
		//末页
		$("#lastPage").click(function(){
			curpage=totpages;
			initData(curpage);
		});
		//上一页
		$("#prevPage").click(function(){
			curpage=curpage-1;
			initData(curpage);
		});
		//下一页
		$("#nextPage").click(function(){
			curpage=curpage+1;
			initData(curpage);
		});
		function initData(curp){
			$.getJSON("class/page","currentPageNo="+curp,function(data){
				var str="<tr><td>机房ID</td><td>机房名称</td><td>座位数</td><td>类型</td><td>操作</td></tr>";
				var strTr="";
				curpage=data.page.currentPageNo;
				totpages=data.page.totalPageCount;
				$("#curp").html(curpage);
				$("#totp").html(data.page.totalPageCount);
				$.each(data.list,function(i,da){
					strTr+="<tr>";
					strTr+="<td>"+da.id+"</td>";
					strTr+="<td>"+da.className+"</td>";
					strTr+="<td>"+da.seats+"</td>";
					strTr+="<td>"+da.typeId+"</td>";
					strTr+="<td><a href=\"class/preUpdate?id="+da.id+"\">修改</a><a href=\"class/delete?id="+da.id+"\">删除</a>";
					strTr+="</td>";
					strTr+="</tr>";
				});
				str+=strTr;
				$("tbody").html("");
				$("tbody").html(str);
				
				if(curpage<=1){
					$("#prevPage").hide();
					//$("#nextPage").show();
				}else{
					$("#prevPage").show();
				}
				if(curpage>=totpages){
					$("#nextPage").hide();
					//$("#prevPage").show();
				}else{
					$("#nextPage").show();
				}
			});
		}
	});
</script>
  </head>
  
  <body>
  <span><a href="class/addClassroom">添加</a></span>
    <table border="1px">
    <thead>
			<tr>
				<th colspan="5">机房信息</th>
			</tr>
		</thead>
	<tbody>
    <%-- <tr>
    <td>机房ID</td>
    <td>机房名称</td>
    <td>座位数</td>
    <td>类型</td>
    <td>操作</td>
    </tr>
<c:forEach var="Class" items="${list }" varStatus="status"> 
    <tr>
    <td><span>${Class.id }</span></td>
    <td><span>${Class.className }</span></td>
    <td><span>${Class.seats }</span></td>
    <td>
    <select>
						<c:if test="${bill.isPayment == 1}">未付款</c:if>
						<c:if test="${bill.isPayment == 2}">已付款</c:if>
	</select>
	<span>${Class.typeId }</span></td>
    <td><a href="class/preUpdate?id=${Class.id}">修改</a></td>
    <td><a href="class/delete?id=${Class.id}">删除</a></td>
    </tr>
</c:forEach>  --%>
	</tbody>
		<tfoot>
			<tr>
				<td colspan="4">
				<a href="javascript:;" id="firstPage">首页</a> 
				<a href="javascript:;" id="prevPage">上一页</a> 
				<a href="javascript:;" id="nextPage">下一页</a> 
				<a href="javascript:;" id="lastPage">末页</a>
				第<span id="curp"></span>页/共<span id="totp"></span>页
				</td>
			</tr>
		</tfoot>
	</table>
  </body>
</html>
