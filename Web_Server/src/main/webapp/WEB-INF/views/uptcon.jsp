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
</head>
<body>
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
			<form action="${APP_PATH }/uptcon/${con.conId }" method="post">
				<h4>测试名称&nbsp;&nbsp;&nbsp;
				<input required="required" value="${con.conName }" name="title" type="text" class="form-control" style="width:500px; display:inline-block;">
				</h4>
				<h4>开始时间&nbsp; 
				<input required="required" name="starttime" type="date" class="form-control" style="width:300px; display:inline-block;">
				结束时间&nbsp; 
				<input required="required" name="endtime" type="date" class="form-control" style="width:300px; display:inline-block;">
				 </h4>
				<h4>测试题目</h4>
				<input type="text" class="form-control" name="pro" value="1001" style="width:100px;"/>
				<br/>
				<input type="text" class="form-control" name="pro" value="" style="width:100px;"/>
				<br/>
				<input type="text" class="form-control" name="pro" value="" style="width:100px;"/>
				<br/>
				<input type="text" class="form-control" name="pro" value="" style="width:100px;"/>
				<br/>
				<input type="text" class="form-control" name="pro" value="" style="width:100px;"/>
				<br/>
				<input type="text" class="form-control" name="pro" value="" style="width:100px;"/>
				<br/>
				<input type="text" class="form-control" name="pro" value="" style="width:100px;"/>
				<br/>
				<input type="text" class="form-control" name="pro" value="" style="width:100px;"/>
				<br/>
				
				</table>
				<button type="submit" class="btn btn-info">上传</button>
			</form>
			</div>
		</div>
		
	</body>
	
</body>
</html>