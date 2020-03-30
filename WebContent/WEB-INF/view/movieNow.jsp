<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="include/header.jsp"/>
<jsp:include page="include/nav.jsp"/>
<style>
	section {
		height : 700px;
	}
	section a {
		padding : 20px;
		display : block;
		text-align: right;
		color : #ccc;
	}
	section ul {
		width : 80%;
		margin : 20px auto;
	}
	.listItem {
		list-style : none;
		width : 23%;
		border : 1px solid black;
		margin-right : 10px;
		margin-bottom : 10px;
		float : left;
	}
	.listItem img {
		width : 100%;
		height : 400px;
	}
	.listItem a {
		display : block;
		text-decoration: none;
		color : black;
		text-align: center;
	}
</style>
	<section>
		<c:if test="${size==0}">
			<a href="${pageContext.request.contextPath}/add.do">상영 영화 추가하기</a>
		</c:if>
		<c:if test="${size>0}">
			<ul class="listItem">
			<c:forEach var="movie" items="${list}">
			<li>
				<a href="detail.do?no=${movie.no}">
					<img src="${pageContext.request.contextPath}/upload/${movie.file}"><br>
					${movie.name}
				</a>
			</li>
			</c:forEach>	
			</ul>
		</c:if>
	</section>
<jsp:include page="include/footer.jsp"/>