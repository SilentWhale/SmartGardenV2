<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录成功</title>
<link rel="stylesheet" type="text/css" href="css/loginseccess.css">
</head>
<body>

<h1 align="center">欢迎！以下是你的用户信息：</h1>
<br />


<table align="center">
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



<a href=userlist>查看用户列表</a>

</body>
</html>