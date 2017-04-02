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
<link rel="stylesheet" type="text/css" href="css/modify.css">
</head>
<body>

<form:form action="${pageContext.request.contextPath }/modify" method="POST" modelAttribute="user">
	<div id="tdiv">
	
		<form:hidden path="userId"/>
		<input type="hidden" name="_method" value="PUT">
		<table >
			<tr>
				<td>用户名: <form:input id="text1" path="userName" />
						   <div id="div1" style="display:inline"> </div>	
				</td>  			
			</tr>

			<tr>
				<td>
					密码: <form:input id="text2" path="userPwd" />
					<div id="div2" style="display:inline"> </div> 
				</td>
			</tr>

			<tr>
				<td>
					性别: <form:input id="text3" path="userSex" />
					<div id="div3" style="display:inline"> </div> 
				</td>
			</tr>

			<tr>
				<td>
					邮箱: <form:input id="text4" path="userMail" />
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
	
</body>
</html>