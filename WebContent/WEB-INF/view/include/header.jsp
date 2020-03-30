<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	header {
		position : relative;
	}
	header h1 {
		color : #ccc;
		font-weight: bold;
		text-align: center;
	}
	header a {
		text-decoration: none;
		color : #ccc;
		text-align: right;
		position: absolute;
		right : 0;
		top : 30px;
	}
	header a:hover {
		font-weight: bold;
	}
	header span {
		display : block;
		color : hotpink;
		position : absolute;
		top : 30px;
		right : 100px;
	}
</style>
</head>
<body>
	<header>
		<h1>대구 CGV</h1>
		<%
			String value = (String)session.getAttribute("Auth");
			if(value==null) {%>
				<a href="loginForm.jsp">로그인</a>
			<%}
			else {%>
			<a href="logout.jsp">로그아웃</a> <span><%=value%>님 반갑습니다~!</span>
		  <%}%>
	</header>