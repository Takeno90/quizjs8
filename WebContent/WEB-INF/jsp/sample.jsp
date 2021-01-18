<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import ="model.Quiz" %>
<%
	Quiz quiz = (Quiz)session.getAttribute("quiz");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div><%= quiz.getQuestion() %></div>
	<div>
		<form action="/quizjs8/QuizServlet" method="post">
			<p><input type="radio" name="choice" value="1"><%= quiz.getChoice1() %></p>
			<p><input type="radio" name="choice" value="2"><%= quiz.getChoice2() %></p>
			<p><input type="radio" name="choice" value="3"><%= quiz.getChoice3() %></p>
			<p><input type="radio" name="choice" value="4"><%= quiz.getChoice4() %></p>
			<p><input type="submit" value="解答"></p>
		</form>
	</div>
</body>
</html>