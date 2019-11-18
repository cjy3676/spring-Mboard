<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="write_ok">
		<table width="500">
			<tr>
				<td>name</td>
				<td><input type="text" name="name" size="10"></td>
			</tr>
			<tr>
				<td>title</td>
				<td><input type="text" name="title" size="50"></td>
			</tr>
			<tr>
				<td>content</td>
				<td><textarea rows="5" cols="50" name="content"></textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="save"></td>
			</tr>
		</table>
	</form>
</body>
</html>