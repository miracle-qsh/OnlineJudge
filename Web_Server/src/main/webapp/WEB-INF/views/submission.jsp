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
							<li class="active"><a href="${APP_PATH }/tosubmission.jsp">Submission</a></li>
							<li><a class="newnavlink" href="${APP_PATH }/torank.jsp">RankList</a></li>

						</ul>
						<ul class="nav navbar-nav navbar-right">
						<c:if test="${stu != null}">
							<li><a href="#" class="newlr">${stu.stuName }</a></li>
							<li><a href="${APP_PATH }/logout" class="newlr" >Logout</a></li>
						</c:if>
						<c:if test="${stu == null}">
							<li><a href="login.jsp" class="newlr">Login</a></li>
							<li><a href="register.jsp" class="newlr">Register</a></li>
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
					      <a href="${APP_PATH }/subs/${pageInfo.pageNum-1>0?pageInfo.pageNum-1:1 }" aria-label="Previous" class="tosmall" >
					        <span aria-hidden="true">&laquo;</span>
					      </a>
					    </li>
					    <c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
					    	<c:if test="${page_Num == pageInfo.pageNum }">
					    		<li><a class="tosmall nactive" href="${APP_PATH }/subs/${page_Num }">${page_Num }</a></li>
					    	</c:if>
					    	<c:if test="${page_Num != pageInfo.pageNum }">
					    		<li><a class="tosmall" href="${APP_PATH }/subs/${page_Num }">${page_Num }</a></li>
					    	</c:if>
					    	
					    </c:forEach>
					    <li>
					      <a href="${APP_PATH }/subs/${pageInfo.pageNum+1<=pageInfo.pages?pageInfo.pageNum+1:pageInfo.pageNum }" aria-label="Next" class="tosmall" >
					        <span aria-hidden="true">&raquo;</span>
					      </a>
					    </li>
					  </ul>
				</nav>
				<table class="table" rules="none">
					<tr>
						<td width="10%">RunID</td>
						<td width="15%">Nick Name</td>
						<td width="10%">Problem</td>
						<td width="15%">Result</td>
						<td width="10%">Time</td>
						<td width="10%">Memory</td>
						<td width="10%">Language</td>
						<td width="5%">Length</td>
						<td width="15%">Submission Time</td>
					</tr>
					<c:forEach items="${list }" var="subm">
					<fmt:formatDate value="${subm.sub.subTime }" pattern="yyyy-MM-dd HH:mm:ss" var="strr"/>
					<fmt:formatNumber type="number" value="${(subm.sub.length-subm.sub.length%10)/10}" maxFractionDigits="0" var="numbers"/>
					<tr>
						<td>${subm.sub.subId }</td>
						<td><a class="procolor" href="#" href="#">${subm.name }</a></td>
						<td><a class="procolor" href="#" href="#">${subm.sub.proId }</a></td>
						<td style="color: white">
						<c:if test="${subm.sub.result=='Accepted' }"><a class="btn btn-success marl">Accepted</a></c:if>
						<c:if test="${subm.sub.result=='Wrong Answer' }"><a class="btn btn-danger marl">Wrong Answer</a></c:if>
						<c:if test="${subm.sub.result=='Time Limit Exceeded' }"><a class="btn btn-info marl">Time Limit Exceeded</a></c:if>
						<c:if test="${subm.sub.result=='Memory Limit Exceeded' }"><a class="btn btn-primary marl">Memory Limit Exceeded</a></c:if>
						<c:if test="${subm.sub.result=='Runtime Error' }"><a class="btn btn-warning marl">Runtime Error</a></c:if>
						<c:if test="${subm.sub.result=='Compile Error' }"><a class="btn btn-primary marl">Compile Error</a></c:if>
						<c:if test="${subm.sub.result=='Output Limit Exceeded' }"><a class="btn btn-info marl">Output Limit Exceeded</a></c:if>
						<c:if test="${subm.sub.result=='Presentation Error' }"><a class="btn btn-warning marl">Presentation Error</a></c:if>
						
						</td>
						<td>${subm.sub.time }ms</td>
						<td>${subm.sub.mem }KiB</td>
						<td>
						<c:if test="${subm.sub.length%10==1 }">g++</c:if>
						<c:if test="${subm.sub.length%10==2 }">gcc</c:if>
						<c:if test="${subm.sub.length%10==3 }">java</c:if>
						</td>
						<td>${numbers }B</td>
						<td>${strr }</td>
					</tr>
					</c:forEach>
					
					
				</table>
			</div>
		</div>
		
	</body>
</html>