<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="model.Quiz" %>
<%--<%
	Quiz quiz = (Quiz)session.getAttribute("Quiz");
	int quizNum = (int)session.getAttribute("quizNum");
%>--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JavaSilver8 4択問題</title>
</head>
<body>
	quiz
	<form action="/quizjs8/QuizServlet" method="post">
		<input type="submit" value="解答">
	</form>
</body>
</html>