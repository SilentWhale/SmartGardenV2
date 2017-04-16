<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List</title>
<link rel="stylesheet" type="text/css" href="css/list.css">
<script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$(".delete").click(function(){
			var href = $(this).attr("href");
			$("form").attr("action",href).submit();
			return false;
		})	
	})
</script>
</head>
<body onLoad="goPage(1,10);">

	<form action="" method="POST">
		<input type="hidden" name="_method" value="DELETE"/>
	</form>
	
	<c:if test="${empty requestScope.users }">
		没有任何用户信息！
	</c:if>
	<table align="center" class="altrowstable redone" >
			<tr>
				<th>用户名</th>
				<th style="width:40px;">性别</th>
				<th style="width:150px;">Email</th>
				<th>电话</th>
				<th>年龄</th>
				<th>游览历史</th>
				<th style="width:40px;">编辑</th>
				<th style="width:40px;">删除</th>
			</tr>
	</table>
	<c:if test="${!empty requestScope.users }">
		<table align="center" class="altrowstable" id="alternatecolor">
						
			<c:forEach items="${requestScope.users }" var="user">
				<tr>
					<td>${user.userName }</td>
					<td style="width:40px;">${user.userSex }</td>
					<td style="width:150px;">${user.userMail }</td>
					<td>${user.userPhone }</td>
					<td>${user.userAge }</td>
					<td>${user.userHis }</td>
					<td style="width:40px;"><a href="user/${user.userId }">Edit</a></td>
					<td style="width:40px;"><a class="delete" href="user/${user.userId }">Delete</a></td>
				</tr>			
			</c:forEach>
		</table>
		<table  align="center">
	        <tr><td><div id="barcon" name="barcon"></div></td></tr>
	    </table>
	</c:if>
	
	<br />
	<button><a href="loginseccess">返回</a></button>
	<script type="text/javascript" src="js/page.js"></script>
</body>
</html>