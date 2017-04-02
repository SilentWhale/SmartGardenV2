<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
<link rel="stylesheet" type="text/css" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/register.css">
</head>
<body>

<form:form action="${pageContext.request.contextPath }/register" method="POST" modelAttribute="user" onsubmit="return check()">
	<div id="tdiv">
		<table >
			<tr>
				<td>用户名: <form:input id="text1" path="userName" onblur="checkname()"/>
						   <div id="div1" style="display:inline"> </div>	
				</td>  			
			</tr>

			<tr>
				<td>
					密码: <form:password id="text2" path="userPwd"  onblur="check()"/>
					<div id="div2" style="display:inline"> </div> 
				</td>
			</tr>

			<tr>	
				<td>
					确认密码: <!--<form:password id="text3" path="userPwd" onblur="check()"/>	-->
					<input id="text3" type="password" name="text3" onblur="check()"> 			
					<div id="div3" style="display:inline"> 
					</div>
				</td> 
			</tr>

			<tr>
				<td>
					性别: </td>
				<td>
					<input name="userSex" type="radio" value="男" />男
					
					<input name="userSex" type="radio" value="女" />女
				</td>
			</tr>

			<tr>
				<td>
					邮箱: <form:input id="text4" path="userMail" onblur="check()"/>
					<div id="div4" style="display:inline"> </div> 
				</td>
			</tr>	

			<tr>
				<td>
					电话: <form:input id="text5" path="userPhone"/>
				</td>
			</tr>	

			<tr>
				<td>
					年龄: <form:input id="text6" path="userAge"/>
				</td>
			</tr>	

			<tr > 
			<td > 
				<input id="text7" type="submit" value="提交"/>
			</td>
			</tr>
		</table>	
	</div>		
	</form:form>

	<script src="js/register.js"></script>
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>