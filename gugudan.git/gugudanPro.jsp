<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
String str = request.getParameter("me");
int me = Integer.parseInt(str);
Object obj = session.getAttribute("total");
int total = (int)obj;
%>

	<%if(me == total){%>
		����
		<button onclick="window.location.href='index.jsp'">ó������</button>
	<%}else{ %>
		����
		<button onclick="window.location.href='gugudan.jsp'">�ٽ�Ǯ��</button>
		<button onclick="window.location.href='index.jsp'">ó������</button>
	<%}%>

	