<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<td>name</td>
<td>title</td>
<td>writeday</td>
</tr>
 <c:set var="i" value="0"/>  <!--  i변수의 값은 0 -->
<!-- ArrayList<Dto> -->
<c:forEach items="${list}" var="dto"> <!-- for문과 동일한 기능 -->
<c:if test="${i%2 eq 0 }" >
<tr bgcolor=eeeeee>
</c:if>
<c:if test="${i%2 eq 1 }" >
<tr bgcolor=cccccc>
</c:if>
<td>${dto.name}</td>
<td><a href="content?id=${dto.id}">${dto.title}</a></td>
<td>${dto.writeday}</td>
</tr>
 <c:set var="i" value="${i+1}" />  <!--  i변수의 값을 1증가 -->
</c:forEach>
</table>
</body>
</html>