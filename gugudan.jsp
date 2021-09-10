<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
Object obj = session.getAttribute("r1");
int r1 = (int)obj;
obj = session.getAttribute("r2");
int r2 = (int)obj;
obj = session.getAttribute("total");
int total = (int)obj;
%>

정답을 입력하세요<br>
<%= r1 %> x <%= r2 %><br>
    <form action="gugudanPro.jsp">
	<input type="text" name="me"><br>
	<input type="submit" value="정답확인">
	</form>
	<button onclick="window.location.href='index.jsp'">처음으로</button>
