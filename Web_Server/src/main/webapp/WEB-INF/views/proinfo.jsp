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
							<li><a class="newnavlink" href="${APP_PATH }/toindex.jsp">Home</a></li>
							<li class="active"><a href="${APP_PATH }/toproblemlist.jsp">Problem</a></li>
							<li><a class="newnavlink" href="${APP_PATH }/tocontestlist.jsp">Contest</a></li>
							<li><a class="newnavlink" href="${APP_PATH }/tosubmission.jsp">Submission</a></li>
							<li><a class="newnavlink" href="${APP_PATH }/torank.jsp">RankList</a></li>

						</ul>
						<ul class="nav navbar-nav navbar-right">
						<c:if test="${stu != null}">
							<li><a href="#" class="newlr">${stu.stuName }</a></li>
							<li><a href="${APP_PATH }/logout" class="newlr">Logout</a></li>
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
				<h3>${proInfo.proTitle }</h3>
				<hr/>
				<h4>Time Limit: ${proInfo.proTimelim } ms &nbsp;&nbsp;&nbsp;Memory Limit: ${proInfo.proMemlim } KB</h4>
				<hr/>
				<pre class="proinf noborder">
${proInfo.proInfo }
				</pre>
				<h4>Input</h4>
				<pre class="proinf noborder">
${proInfo.proInput }
				</pre>
				<h4>Output</h4>
				<pre class="proinf noborder">
${proInfo.proOutput }
				</pre>
				<h4>Sample Input</h4>
				<pre class="proinf">
${proInfo.proSinput }
				</pre>
				<h4>Sample Output</h4>
				<pre class="proinf">
${proInfo.proSoutput }
				</pre>
				<h4>Hint</h4>
				<pre class="proinf noborder">
${proInfo.proHint }
				</pre>
				<br/>
<!-- 				<div class="dropdown"> -->
<!-- 				  <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true"> -->
<!-- 				    language -->
<!-- 				    <span class="caret"></span> -->
<!-- 				  </button> -->
<!-- 				  <ul class="dropdown-menu" aria-labelledby="dropdownMenu1"> -->
<!-- 				    <li><a href="#">gcc</a></li> -->
<!-- 				    <li><a href="#">g++</a></li> -->
<!-- 				    <li><a href="#">java</a></li> -->
<!-- 				  </ul> -->
<!-- 				</div> -->
				<form action="${APP_PATH }/submit" method="post">
				<select name="lau" class="dropdown" style="width:80px; height:30px;">
					<option value ="g++">g++</option>
					<option value ="gcc">gcc</option>
					<option value ="java">java</option>
				</select>
				<select name="proid" style="opacity: 0;"><option value ="${proInfo.proId }"></option></select>
				<br/><br/>
				<textarea name="code" cols="140" rows="15" wrap="virtual" required="required"></textarea>
				<br>
				<button type="submit" class="btn btn-info">Submit</button>
				<a class="btn btn-link" href="${APP_PATH }/tosubmission.jsp">Statu</a>
				</form>
			</div>
		</div>
		
	</body>
	
</body>
</html>