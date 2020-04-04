<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"
    errorPage=  "addException.jsp"%>
    
  <%
  	int num= Integer.parseInt(request.getParameter("num"));
  int sum= 0;
  for(int i=0; i<=num;i++){
	  sum= sum+1;
  }
  %>
<!DOCTYPE html>
<html>
<head>


<meta charset="EUC-KR">
<title>합계 구하기</title>
</head>
<body>
	<h2>합계 구하기</h2>
	<h1>1부터 <%= num %>까지의 합은  <%=sum %>입니다</h1>
</body>
</html>