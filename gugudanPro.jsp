<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
String str = request.getParameter("me");
int me = Integer.parseInt(str);
Object obj = session.getAttribute("total");
int total = (int)obj;
%>

	<%if(me == total){%>
		정답
		<button onclick="window.location.href='index.jsp'">처음으로</button>
	<%}else{ %>
		오답
		<button onclick="window.location.href='gugudan.jsp'">다시풀기</button>
		<button onclick="window.location.href='index.jsp'">처음으로</button>
	<%}%>

	