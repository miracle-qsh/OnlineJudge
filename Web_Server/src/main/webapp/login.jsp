<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<!DOCTYPE html>
	<html>
	<head>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
		<meta charset="UTF-8">
		<title>New OJ</title>
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

		<link rel="stylesheet" type="text/css" href="./static/css/newstyle.css">

		<link rel="stylesheet" type="text/css" href="./static/css/monokai-sublime.css">
		<script src="./static/js/highlight.pack.js"></script>
		<script>
        hljs.initHighlightingOnLoad();</script>
	</head>
	<body >

		<div class="nav">
			<nav class="navbar navbar-default">
				<div class="container">
					<div class="navbar-header logomgn">
						<a class="navbar-brand logotitle" href="#">New OJ</a>
					</div>
					<div class="navbar-collapse collapse">
						<ul class="nav navbar-nav newnavlink">
							<li class="active"><a href="index.jsp">Home</a></li>
							<li><a class="newnavlink" href="toproblemlist.jsp">Problem</a></li>
							<li><a class="newnavlink" href="tocontestlist.jsp">Contest</a></li>
							<li><a class="newnavlink" href="submission.html">Submission</a></li>
							<li><a class="newnavlink" href="ranklist.html">RankList</a></li>

						</ul>
						<ul class="nav navbar-nav navbar-right">
							<li><a href="login.jsp" class="newlr">Login</a></li>
							<li><a href="register.jsp" class="newlr">Register</a></li>
						</ul>
					</div>
					<!--/.nav-collapse -->
				</div>
			</nav>
		</div>
		<div id="nlogin">
			<div class="modal-dialog">
				<div class="modal-content">
					<form action="${APP_PATH }/login" method="get">
					<div class="modal-header">
						<h2 class="newh3 tocenter">用户登陆</h2>
					</div>
					<div class="modal-body">
						
						<div class="form-group">
						    <label >Username</label>
						    <input required="required" name="username" type="text" class="form-control" placeholder="Username">
						</div>
						<div class="form-group">
						    <label >Password</label>
						    <input required="required" name="password" type="password" class="form-control" placeholder="Password">
						</div>
						
					</div>
					<div class="modal-footer">
					<input type="submit" class="btn btn-info tocenter" value="立即登陆">
<!-- 						<a class="btn btn-info tocenter"></a> -->
					</div>
					</form>
				</div>
			</div>
		</div>
		
	</body>
	
	</html>