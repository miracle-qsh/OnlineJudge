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
							<li class="active"><a href="${APP_PATH }/adminpros/1">Problem Operator</a></li>
							<li><a class="newnavlink" href="${APP_PATH }/admincontest">Contest Operator</a></li>
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
			<form action="${APP_PATH }/uptpro/${proInfo.proId }" method="post" enctype="multipart/form-data">
				<h4>题目名称&nbsp;&nbsp;&nbsp;<input required="required" value="${proInfo.proTitle }" name="title" type="text" class="form-control" style="width:500px; display:inline-block;"></h3>
				<h4>时间限制(ms)&nbsp; 
				<input value="${proInfo.proTimelim }" required="required" name="timelim" type="text" class="form-control" style="width:100px; display:inline-block;">
				 内存限制(kb)&nbsp; 
				<input value="${proInfo.proMemlim }" required="required" name="memlim" type="text" class="form-control" style="width:100px; display:inline-block;">
				 </h4>
				<h4>题目描述</h4>
				<textarea required="required" name="proinf" cols="140" rows="10" wrap="virtual" class="form-control">${proInfo.proInfo }</textarea>
				<h4>输入描述</h4>
				<textarea required="required" name="input" cols="140" rows="10" wrap="virtual" class="form-control">${proInfo.proInput }</textarea>
				<h4>输出描述</h4>
				<textarea required="required" name="output" cols="140" rows="10" wrap="virtual" class="form-control">${proInfo.proOutput }</textarea>
				<h4>输入样例</h4>
				<textarea required="required" name="sinput" cols="140" rows="10" wrap="virtual" class="form-control">${proInfo.proSinput }</textarea>
				<h4>输出样例</h4>
				<textarea required="required" name="soutput" cols="140" rows="10" wrap="virtual" class="form-control">${proInfo.proSoutput }</textarea>
				<h4>提示信息</h4>
				<textarea name="hit" cols="140" rows="10" wrap="virtual" class="form-control">${proInfo.proHint }</textarea>
				<h4>输入数据(data1.in)</h4>
				<input type="file" name="datain" class="form-group">
				<h4>输出数据(data1.out)</h4>
				<input type="file" name="dataout" class="form-group">
				<button type="submit" class="btn btn-info">上传</button>
				<input type="text" name="proid" style="opacity: 0;" value="">
			</form>
			</div>
		</div>
		
	</body>
	
</body>
</html>