<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List</title>

</head>
<body>

	<c:if test="${empty requestScope.users }">
		没有任何用户信息！
	</c:if>
	<c:if test="${!empty requestScope.users }">
		<table border="1" cellpadding="10" cellspacing="0">
			<tr>
				<th>用户名</th>
				<th>性别</th>
				<th>Email</th>
				<th>电话</th>
				<th>年龄</th>
				<th>游览历史</th>
			</tr>
			
			<c:forEach items="${requestScope.users }" var="user">
				<tr>
					<td>${user.userName }</td>
					<td>${user.userSex }</td>
					<td>${user.userMail }</td>
					<td>${user.userPhone }</td>
					<td>${user.userAge }</td>
					<td>${user.userHis }</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	
	<br />
	<a href="loginseccess">返回</a>
</body>
</html>