<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    /<!-- /Ŭ���� ���� -->
   <%!
   		String name= "��ũ";
   		public String getName(){return name;}
   %>
   <!-- //��������  -->
   <%
   String age= request.getParameter("age"); 
   
   /* �ڹ� �ּ��� */
   %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ǥ���� �ǽ�</title>
<!--html�ּ���  -->
</head>
<body>
<h1>�ȳ��ϼ���<%-- <%= name%> --%> ��!</h1>


</body>
</html>