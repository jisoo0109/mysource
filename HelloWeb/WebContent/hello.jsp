<%@ page contentType="text/html;charset=utf-8"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
안녕하세요.<br>
현재 시간 : <%= String.format("%tH:%<tM:%<tS", new Date()) %><p>
안녕을 10번 출력<br>
<%for(int i = 0; i < 10; i++){ %>
안녕
<%} %>
</body>
</html>