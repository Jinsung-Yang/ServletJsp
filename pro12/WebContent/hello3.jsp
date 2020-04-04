<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    /<!-- /클래스 변수 -->
   <%!
   		String name= "듀크";
   		public String getName(){return name;}
   %>
   <!-- //지역변수  -->
   <%
   String age= request.getParameter("age"); 
   
   /* 자바 주석문 */
   %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>표현신 실습</title>
<!--html주석문  -->
</head>
<body>
<h1>안녕하세요<%-- <%= name%> --%> 님!</h1>


</body>
</html>