<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
<link rel="stylesheet" type="text/css" href="css/loginForm.css">
</head>
<body>
<p class="threed">用户登录</p>
<form action="login" method="post">
    <font color="red">${requestScope.message }</font>
     <table>

         <tr>
            <td><label>登录名: </label></td>
             <td><input type="text" id="userName" name="userName" /></td>
         </tr>

         <tr>
            <td><label>密码: </label></td>
             <td><input type="password" id="userPwd" name="userPwd" /></td>
         </tr>

     </table>
     <input type="submit" name="Submit" value="登录" id="sub"/>
     <br/>


</form>
    <br />
    <br />
    <br />
    <br />
    <a href="register">没有账户？点我注册！</a>
</body>
</html>