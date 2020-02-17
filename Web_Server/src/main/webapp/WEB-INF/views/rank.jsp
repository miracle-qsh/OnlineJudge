<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
        <script>
        function clea(){
        	sessionStorage.clear();
        }
        </script>
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
							<li><a class="newnavlink" href="${APP_PATH }/toindex.jsp">Home</a></li>
							<li><a class="newnavlink" href="${APP_PATH }/toproblemlist.jsp">Problem</a></li>
							<li><a class="newnavlink" href="${APP_PATH }/tocontestlist.jsp">Contest</a></li>
							<li><a class="newnavlink" href="${APP_PATH }/tosubmission.jsp">Submission</a></li>
							<li class="active"><a href="${APP_PATH }/torank.jsp">RankList</a></li>

						</ul>
						<ul class="nav navbar-nav navbar-right">
						<c:if test="${stu != null}">
							<li><a href="#" class="newlr">${stu.stuName }</a></li>
							<li><a href="${APP_PATH }/logout" class="newlr" >Logout</a></li>
						</c:if>
						<c:if test="${stu == null}">
							<li><a href="${APP_PATH }/login.jsp" class="newlr">Login</a></li>
							<li><a href="${APP_PATH }/register.jsp" class="newlr">Register</a></li>
						</c:if>
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
					      <a href="${APP_PATH }/rank/${pageInfo.pageNum-1>0?pageInfo.pageNum-1:1 }" aria-label="Previous" class="tosmall" >
					        <span aria-hidden="true">&laquo;</span>
					      </a>
					    </li>
					    <c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
					    	<c:if test="${page_Num == pageInfo.pageNum }">
					    		<li><a class="tosmall nactive" href="${APP_PATH }/rank/${page_Num }">${page_Num }</a></li>
					    	</c:if>
					    	<c:if test="${page_Num != pageInfo.pageNum }">
					    		<li><a class="tosmall" href="${APP_PATH }/rank/${page_Num }">${page_Num }</a></li>
					    	</c:if>
					    	
					    </c:forEach>
					    <li>
					      <a href="${APP_PATH }/rank/${pageInfo.pageNum+1<=pageInfo.pages?pageInfo.pageNum+1:pageInfo.pageNum }" aria-label="Next" class="tosmall" >
					        <span aria-hidden="true">&raquo;</span>
					      </a>
					    </li>
					  </ul>
				</nav>
				
				<table class="table tocenter" rules="none">
					<tr>
						<td width="30%">Rank</td>
						<td width="40%">User</td>
						<td width="30%">Acceptance</td>
					</tr>
					<c:forEach items="${pageInfo.list }" var="stu">
					<tr>
						<td>${stu.stuId }</td>
						<td><a class="procolor" href="#">${stu.stuName }</a></td>
						<td>${stu.stuSloveed }</td>
					</tr>
					</c:forEach>
					
				</table>
			</div>
		</div>
		
	</body>
</html>