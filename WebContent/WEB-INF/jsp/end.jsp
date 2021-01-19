<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int quizNum = (int)session.getAttribute("quizNum");
	int score = (int) session.getAttribute("score");
	session.invalidate();
	//session.removeAttribute("score");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>終了</h1>
<p>正答率：<%= score %>/<%= quizNum %></p>
<a href="/quizjs8/QuizServlet">もう一度挑戦</a>

</body>
</html>