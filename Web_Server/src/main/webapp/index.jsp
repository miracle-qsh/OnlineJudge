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
			<nav class="navbar navbar-default secondwindow">
				<div class="container">
					<div class="navbar-header logomgn">
						<a class="navbar-brand logotitle" href="#">New OJ</a>
					</div>
					<div class="navbar-collapse collapse">
						<ul class="nav navbar-nav newnavlink">
							<li class="active"><a href="index.jsp">Home</a></li>
							<li><a class="newnavlink" href="toproblemlist.jsp">Problem</a></li>
							<li><a class="newnavlink" href="tocontestlist.jsp">Contest</a></li>
							<li><a class="newnavlink" href="tosubmission.jsp">Submission</a></li>
							<li><a class="newnavlink" href="torank.jsp">RankList</a></li>

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
		<div class="container">
			<div class="jumbotron subpad newbtline firstwindow">
				<h1 class="newh1">Welcome to New OJ!</h1>
				<hr />
				<p class="newp">  Please register or log in to practice programming skills or participate in a contest.
					Anonymous visitors (without logging in ) can only check Problems, Standings, and Status.
					As a registered user, you can submit your source code and see if your solution is correct. 
					Please use Chrome, Firefox, IE (above IE9) or other browsers supporting Bootstrap 3.
				Should you have any questions, please contact us.</p>
				<p><a class="btn btn-info toright" href="toproblemlist.jsp" role="button">Start practicing</a></p>
			</div>
			<div class="jumbotron subpad newbtline firstwindow">
				<h1 class="newh1">Frequently Asked Questions</h1>

				<hr/>
				<h2 class="newh2">Input and Output</h2>
				<p class="newp">  你的程序必须从stdin（基本输入）读入数据并且从stdout（基本输出）输出数据。例如，你使用C语言的话，使用scanf读入数据，使用printf输出数据，你使用C++语言的话，还可以使用cin和cout读入和输出数据</p>
				<h2 class="newh2">Compilers and Languages</h2>
				<p class="newp">本OJ目前提供多种语言编译器,它们的编译参数分别是：</p>
				<li><code>gcc : gcc main.c -o main -Wall -lm -O2 -std=c99 --static -DONLINE_JUDGE</code></li>
				<li><code>g++ : g++ main.cpp -O2 -Wall -lm --static -DONLINE_JUDGE -o main --std=gnu++11</code></li>
				<li><code>java : javac Main.java</code></li>

				<h2 class="newh2">Answers and Mean</h2>
				<p class="newp">以下是OJ可能返回的结果和其意义：</p>
				<div>
					<button type="button" class="btn btn-success">Accepted</button>
					<p class="strp flo">&nbsp;&nbsp;&nbsp; 答案正确</p>
					<br/>
					<button type="button" class="btn btn-danger">Wrong Answer</button>
					<p class="strp flo">&nbsp;&nbsp;&nbsp; 答案错误</p>
					<br/>
					<button type="button" class="btn btn-info">Time Limit Exceeded</button>
					<p class="strp flo">&nbsp;&nbsp;&nbsp; 超出时限</p>
					<br/>
					<button type="button" class="btn btn-primary">Memory Limit Exceeded</button>
					<p class="strp flo">&nbsp;&nbsp;&nbsp; 超出内存</p>
					<br/>
					<button type="button" class="btn btn-warning">Runtime Error</button>
					<p class="strp flo">&nbsp;&nbsp;&nbsp; 运行错误</p>
					<br/>
					<button type="button" class="btn btn-primary">Compile Error</button>
					<p class="strp flo">&nbsp;&nbsp;&nbsp; 编译错误</p>
					<br/>
					<button type="button" class="btn btn-info">Output Limit Exceeded</button>
					<p class="strp flo">&nbsp;&nbsp;&nbsp; 输出超限</p>
					<br/>
					<button type="button" class="btn btn-warning">Presentation Error</button>
					<p class="strp flo">&nbsp;&nbsp;&nbsp; 格式错误</p>
					<br/>
				</div>

				<p class="newh2">Problem-1001 Solution</p>
				<pre class="hljs newp"><code >
 #include &lt;bits/stdc++.h&gt;
 using namespace std;
 int main()
 {
 	int a,b;
 	scanf("%d %d",&a, & b);
 	printf("%d\n", a+b);
	return 0;
 }
				</code>
				</pre>
				
			</div>
		</div>
		
	</body>
	
	</html>