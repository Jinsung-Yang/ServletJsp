<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
   <%
   	request.setCharacterEncoding("utf-8");
   int dan= Integer.parseInt(request.getParameter("dan"));
   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>������ ���â</title>
</head>
<body>
	<table border=1 width=800>
		<tr align="center" bgcolor="#FFFF66">
			<td colspan=2> <%=dan  %>�� ���</td>
		</tr>
		<%
			for(int i = 0; i<10;i++){
				if(i%2==1){
					
				
		%>
		<tr align="center" bgcolor="#CCFF66">
			<td width=400>
				<%= dan %>*<%=i %>
			</td>
			<td width=400>
				<%=i*dan %>
			</td>
			</tr>
			
		<%
			}
		%>
	</table>


</body>
</html>