<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>에러 페이지</title>
</head>
<body>
	 <%=exception.toString() %>
	 <%=exception.getMessage() %>
	 <%exception.printStackTrace(); %>
	 
	 숫자만 입력 가능합니다. 다시 시도하세요
	 <a href="add.html">다시하기</a>
</body>
</html>