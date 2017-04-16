<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>路线管理</title>
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
<body>


	<form action="" method="POST">
		<input type="hidden" name="_method" value="DELETE"/>
	</form>
	
	
	<c:if test="${empty requestScope.routestyles }">
		没有任何用户信息！
	</c:if>
	<c:if test="${!empty requestScope.routestyles }">
		<table class="imagetable" border="1" cellpadding="10" cellspacing="0">
			<tr>
				<th>路线编号</th>
				<th>所属风格</th>
				<th>包含观赏点</th>
				<th>编辑</th>
				<th>删除</th>
			</tr>
			
			<c:forEach items="${requestScope.routestyles }" var="routestyle">
				
				<tr>
					<td>${routestyle.rotId }</td>
					<td>${routestyle.styNam }</td>
					<td>${routestyle.rotInclViwp }</td>
					<td><a href="">Edit</a></td>
					<td><a class="delete" href="">Delete</a></td>
				</tr>
			
			</c:forEach>
		</table>
	</c:if>
	
	<br />
	<a href="loginseccess">返回</a>
</body>
</html>