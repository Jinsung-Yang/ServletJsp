<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    /<!-- /Ŭ���� ���� -->
   <%!
   		String name= "��ũ";
   		public String getName(){return name;}
   %>
   <!-- //��������  -->
   <%String age= request.getParameter("age"); %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ǥ���� �ǽ�</title>
</head>
<body>
<h1>�ȳ��ϼ���<%= name%> ��!</h1>
<h1>���̴�<%=age %>���Դϴ�</h1>
<h1>Ű��<%=180 %>cm�Դϴ�</h1>
<h1>����+10��<%=Integer.parseInt(age)+10 %>�Դϴ�</h1>
</body>
</html>