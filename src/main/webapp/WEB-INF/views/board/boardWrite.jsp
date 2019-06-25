<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>BoardWrite Page</h1>
	<form action="./boardWrite" method="post">
		<div>
			게시글 번호<input type="text" name="num">
		</div>
		<div>
			제목<input type="text" name="title">
		</div>
		<div>
			작성자<input type="text" name="writer">
		</div>
		<div>
			내용
			<textarea rows="20" cols="50" name="contents"></textarea>
		</div>
		<div>
			<input type="checkbox" name="check" value="v1">
			<input type="checkbox" name="check" value="v2">
			<input type="checkbox" name="check" value="v3">
			<input type="checkbox" name="check" value="v4">
		</div>
		<div>
			<button>게시글 등록</button>
		</div>
	</form>
</body>
</html>