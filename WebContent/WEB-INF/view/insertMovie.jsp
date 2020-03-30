<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="include/header.jsp"/>
<jsp:include page="include/nav.jsp"/>
<style>
	fieldset {
		width : 700px;
		margin : 20px auto;
		boader : 1px solid black;
	}
	label {
		float : left;
		width : 150px;
	}
</style>
<section>
	<form action="add.do" method="post" enctype="multipart/form-data">
		<fieldset>
		<legend>영화 정보</legend>
		<p>
			<label>제목</label>
			<input type="text" placeholder="영화 제목" name="name">
		</p>
		<p>
			<label>상세 설명</label>
			<textarea rows="30" cols="70" name="content" placeholder="영화 상세 내용"></textarea>
		</p>
		<p>
			<label>파일</label>
			<input type="file" placeholder="영화 제목" name="file">
		</p>
		<p>
			<label>상영시간</label>
			<input type="text" placeholder="경로" name="schedule">
		</p>
		<p>
			<button>전송</button>
		</p>
		</fieldset>
		
	</form>
</section>
<jsp:include page="include/footer.jsp"/>