<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="include/header.jsp"/>
<jsp:include page="include/nav.jsp"/>
<style>
	section {
		width : 960px;
		margin : 0 auto;
	}
	#content img {
		display : block;
		width : 40%;
		float : left;
		padding : 20px 0;
	}
	#content div {
		margin-left : 20px;
		width : 57%;
		float : right;
	}
	section>p {
		clear : both;
		margin-left : 350px;
	}
</style>
	<section>
		<div id="content">
			<img src="upload/${movie.file}">		
			<div>
				<h2>${movie.name}</h2>
				<p>
					${movie.content}
				</p>
			</div>
		</div>
	</section>
<jsp:include page="include/footer.jsp"/>