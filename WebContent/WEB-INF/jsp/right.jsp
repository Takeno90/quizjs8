<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String errorMsg = (String)request.getAttribute("errorMsg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JavaSilver8 4択問題</title>
<link rel="stylesheet" href="/quizjs8/css/style.css">
</head>
<body>
<h1>正解</h1>
<a href="/quizjs8/QuizServlet?action=done">次へ</a>

</body>
</html>