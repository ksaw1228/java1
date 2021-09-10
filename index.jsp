<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%	
	Random ran = new Random();
	int r1 = ran.nextInt(8)+2;
	int r2 = ran.nextInt(9)+1;
	int total = r1*r2;
	session.setAttribute("r1" , r1);
	session.setAttribute("r2" , r2);
	session.setAttribute("total" , total);
%>

<h1>구구단 게임!</h1>

<button onclick="window.location.href='gugudan.jsp'">게임시작</button>