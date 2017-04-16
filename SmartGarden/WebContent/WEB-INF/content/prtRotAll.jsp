<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>allroad</title>
<link rel="stylesheet" type="text/css" href="../css/list.css">
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

	<c:if test="${empty requestScope.routestyles }">
		没有所有路线信息！
	</c:if>
	<table align="center" class="altrowstable redone">
			<tr>
				<th>路线编号</th>
				<th>所属风格</th>
				<th>包含观赏点</th>
				<th>编辑</th>
				<th>删除</th>	
			</tr>
	</table>
	<c:if test="${!empty requestScope.routestyles }">
		<table align="center" class="altrowstable" id="alternatecolor">
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
		<table  align="center">
	        <tr><td><div id="barcon" name="barcon"></div></td></tr>
	    </table>
	</c:if>
	
	<br>
	<button><a href="loginseccess">返回</a></button>
	<script type="text/javascript" src="../js/page.js"></script>
</body>
</html>