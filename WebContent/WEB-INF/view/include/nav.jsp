<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<style>
	nav ul {
		margin : 0;
		padding : 0;
		background-color : #ccc;
		height : 50px;
	}
	nav ul li {
		list-style: none;
		float : left;
		margin-right : 100px;
		line-height: 50px;
		text-align: center;
	}
	nav ul li:first-child {
		margin-left : 700px;
	}
	nav ul li::after {
		content : 
	}
	nav ul li a {
		text-decoration: none;
		color : white;
	}
	nav ul li a:hover {
		font-weight: bold;
	}
</style>
	<nav>
		<ul>
			<li><a href="main.do">HOME</a></li>
			<li><a href="list.do">상영영화 </a></li>
			<li><a href="movieSchedule.jsp">상영시간표</a></li>
			<li><a href="movieContent.jsp">게시판</a></li>
		</ul>
	</nav>