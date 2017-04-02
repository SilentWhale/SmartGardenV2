<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录成功</title>
</head>
<body>

<h1 align="center">欢迎！以下是你的用户信息：</h1>
<br />
<br />
<br />
<p align="center">用户信息</p>
<br />
<br />
<p align="center">用户名：${sessionScope.user.userName }</p>
<p align="center">性别：${sessionScope.user.userSex }</p>
<p align="center">年龄：${sessionScope.user.userAge }</p>
<p align="center">电话：${sessionScope.user.userPhone }</p>
<p align="center">邮件：${sessionScope.user.userMail }</p>
<p align="center">游览历史：${sessionScope.user.userHis }</p>

<a href=userlist>查看用户列表</a>

</body>
</html>