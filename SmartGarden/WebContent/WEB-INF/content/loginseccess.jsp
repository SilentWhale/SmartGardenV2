<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录成功</title>
<link rel="stylesheet" type="text/css" href="css/loginseccess.css">
</head>
<body>

<h1 align="center">欢迎！</h1>
<h2 align="center">您的个人信息如下：</h2>

<table align="center" class="altrowstable" id="alternatecolor">
	<tr>
		<td align="center">用户名:</td><td>${sessionScope.user.userName }</td>
	</tr>

	<tr>
		<td align="center">性别：</td><td>${sessionScope.user.userSex }</td>
	</tr>

	<tr>
		<td align="center">年龄：</td><td>${sessionScope.user.userAge }</td>
	</tr>

	<tr>
		<td align="center">电话：</td><td>${sessionScope.user.userPhone }</td>
	</tr>

	<tr>
		<td align="center">邮件：</td><td>${sessionScope.user.userMail }</td>
	</tr>

	<tr>
		<td align="center">游览历史：</td><td>${sessionScope.user.userHis }</td>
	</tr>
</table>
<table  align="center">
	 <tr><td><div id="barcon" name="barcon"></div></td></tr>
</table>
	<!--<a href=userlist>查看用户列表</a>-->
<script type="text/javascript" src="js/list.js"></script>
</body>
</html>