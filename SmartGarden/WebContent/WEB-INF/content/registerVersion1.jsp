<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
</head>
<body>

<form:form action="${pageContext.request.contextPath }/register" method="POST" modelAttribute="user">
		用户名: <form:input path="userName"/>  	
		<br />
		密码: <form:input path="userPwd"/>
		<br />
		性别: <input name="userSex" type="radio" value="男" />男
		<br />
		<input name="userSex" type="radio" value="女" />女
		<br />
		邮箱: <form:input path="userMail"/>
		<br />
		电话: <form:input path="userPhone"/>
		<br />
		年龄: <form:input path="userAge"/>
		<br />
		<input type="submit" value="提交" />
	</form:form>

</body>
</html>