<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    /<!-- /클래스 변수 -->
   <%!
   		String name= "듀크";
   		public String getName(){return name;}
   %>
   <!-- //지역변수  -->
   <%String age= request.getParameter("age"); %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>스크릿틀릿 실습</title>
</head>
<body>
<h1>안녕하세요<%= name%> 님!</h1>
<h1>나이는<%=age %>살입니다</h1>
</body>
</html>