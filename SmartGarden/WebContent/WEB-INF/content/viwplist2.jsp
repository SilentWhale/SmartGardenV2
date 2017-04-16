<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>观赏点管理</title>
<link rel="stylesheet" type="text/css" href="css/list.css">
<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>
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
	
	
	<c:if test="${empty requestScope.viewpoints }">
		没有任何用户信息！
	</c:if>
	<c:if test="${!empty requestScope.viewpoints }">
		<table class="imagetable" border="1" cellpadding="10" cellspacing="0">
			<tr>
				<th>观赏点编号</th>
				<th>所属类别</th>
				<th>名称</th>
				<th>介绍</th>
				<th>位置</th>
				<th>图片</th>
				<th>编辑</th>
				<th>删除</th>
			</tr>
			
			<c:forEach items="${requestScope.viewpoints }" var="viewpoint">
				
				<tr>
					<td>${viewpoint.vnsffId }</td>
					<td>${viewpoint.vnsffTypNam }</td>
					<td>${viewpoint.sffName }</td>
					<td>${viewpoint.sffIntro }</td>
					<td>${viewpoint.sffLoc }</td>
					<td>${viewpoint.sffPic }</td>
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