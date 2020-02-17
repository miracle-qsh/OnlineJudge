<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New OJ</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
		<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
		<script
		src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
		<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
		<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
		<!-- Bootstrap -->
		<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
		rel="stylesheet">

		<link rel="stylesheet" type="text/css" href="${APP_PATH }/static/css/newstyle.css">

		<link rel="stylesheet" type="text/css" href="${APP_PATH }/static/css/monokai-sublime.css">
		<script src="${APP_PATH }/static/js/highlight.pack.js"></script>
		<script>
        hljs.initHighlightingOnLoad();</script>
</head>
<body >

		<div class="nav">
			<nav class="navbar navbar-default secondwindow">
				<div class="container">
					<div class="navbar-header logomgn">
						<a class="navbar-brand logotitle" href="#">New OJ</a>
					</div>
					<div class="navbar-collapse collapse">
						<ul class="nav navbar-nav newnavlink">
							<li><a class="newnavlink" href="${APP_PATH }/adminpros/1">Problem Operator</a></li>
							<li class="active"><a href="${APP_PATH }/admincontest/1">Contest Operator</a></li>
						</ul>
						<ul class="nav navbar-nav navbar-right">
							<li><a href="#" class="newlr">Admin</a></li>
							<li><a href="${APP_PATH }/index.jsp" class="newlr" >Logout</a></li>
						</ul>
						
					</div>
					<!--/.nav-collapse -->
				</div>
			</nav>
		</div>
		<div class="container">
		<div class="jumbotron subpad newbtline firstwindow">
			<nav aria-label="Page navigation">
					<ul class="pagination tocenter">
					    <li>
					      <a href="${APP_PATH }/admincontest/${pageInfo.pageNum-1>0?pageInfo.pageNum-1:1 }" aria-label="Previous" class="tosmall" >
					        <span aria-hidden="true">&laquo;</span>
					      </a>
					    </li>
					    <c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
					    	<c:if test="${page_Num == pageInfo.pageNum }">
					    		<li><a class="tosmall nactive" href="${APP_PATH }/admincontest/${page_Num }">${page_Num }</a></li>
					    	</c:if>
					    	<c:if test="${page_Num != pageInfo.pageNum }">
					    		<li><a class="tosmall" href="${APP_PATH }/admincontest/${page_Num }">${page_Num }</a></li>
					    	</c:if>
					    	
					    </c:forEach>
					    <li>
					      <a href="${APP_PATH }/admincontest/${pageInfo.pageNum+1<=pageInfo.pages?pageInfo.pageNum+1:pageInfo.pageNum }" aria-label="Next" class="tosmall" >
					        <span aria-hidden="true">&raquo;</span>
					      </a>
					    </li>
					  </ul>
				</nav>
			<form action="${APP_PATH }/redeletecon/${pageInfo.pageNum }" method="post">
			<table class="table" rules="none">
			<input type="submit" class="btn btn-danger toright" value="删除选中"/>
<!-- 			<a class="btn btn-danger toright" href="#">删除选中</a> -->
			<a class="btn btn-primary toright logomgn" href="${APP_PATH }/addcontest">添加</a>
					<tr>
						<td width="10%">#</td>
						<td width="35%">Title</td>
						<td width="20%">Start Time</td>
						<td width="20%">End Time</td>
						<td width="15%">Operator</td>
					</tr>
					<c:forEach items="${pageInfo.list }" var="con">
					<fmt:formatDate value="${con.conStarttime}" pattern="yyyy-MM-dd HH:mm:ss" var="strr"/>
					<fmt:formatDate value="${con.conEndtime}" pattern="yyyy-MM-dd HH:mm:ss" var="endd"/>
					<tr>
						<td>
						<input type="checkbox" name="checkpro" value="${con.conId }">
						</td>
						<td><a class="procolor" href="#">${con.conName }</a></td>
						<td>${strr }</td>
						<td>${endd }</td>
						<td style="color: white">
						<a class="btn btn-primary" href="${APP_PATH }/touptcon/${con.conId }">编辑</a>&nbsp;&nbsp;&nbsp;&nbsp;<a class="btn btn-danger" href="${APP_PATH }/deletecon/${pageInfo.pageNum }/${con.conId }">删除</a>
						</td>
					</tr>
					<c:remove var="str"/>
					<c:remove var="end"/>
					<c:remove var="now"/>
					<c:remove var="strr"/>
					<c:remove var="endd"/>
					</c:forEach>	
				</table>
				</form>
		</div>
		</div>
		
	</body>
</html>