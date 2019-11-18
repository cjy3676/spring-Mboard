<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="500" height="300">
		<tr>
			<td>name</td>
			<td>${dto.name}</td>
		</tr>
		<tr>
			<td>title</td>
			<td>${dto.title}</td>
		</tr>
		<tr>
			<td>content</td>
			<td>${dto.content}</td>
		</tr>
		<tr>
			<td>writeday</td>
			<td>${dto.writeday}</td>
		</tr>
		<tr>
		    <td colspan="2">
		    <a href="update?id=${dto.id}">수정</a>
		    <a href="delete?id=${dto.id}">삭제</a>
		    <a href="list">목록</a>
		    </td>
		</tr>
	</table>
</body>
</html>