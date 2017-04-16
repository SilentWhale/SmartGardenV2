<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Facility</title>
<link rel="stylesheet" type="text/css" href="../../css/list.css">

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

	<c:if test="${empty requestScope.viewpoints }">
		没有任何观赏点信息！
	</c:if>
	<table align="center" class="altrowstable redone">
			<tr>
				<th style="width:80px;">观赏点编号</th>
				<th style="width:70px;">所属类别</th>
				<th style="width:70px;">名称</th>
				<th style="width:150px;">介绍</th>
				<th style="width:70px;">位置</th>
				<th style="width:250px;">图片</th>
				<th style="width:40px;">编辑</th>
				<th style="width:40px;">删除</th>
			</tr>
	</table>
	<c:if test="${!empty requestScope.viewpoints }">
		<table align="center" class="altrowstable" id="alternatecolor">		
			<c:forEach items="${requestScope.viewpoints }" var="viewpoint">
				<tr>
					<td style="width:80px;">${viewpoint.vnsffId }</td>
					<td style="width:70px;">${viewpoint.vnsffTypNam }</td>
					<td style="width:70px;">${viewpoint.sffName }</td>
					<td style="width:150px;">${viewpoint.sffIntro }</td>
					<td style="width:70px;">${viewpoint.sffLoc }</td>
					<td style="width:250px;">${viewpoint.sffPic }</td>
					<td style="width:40px;"><a href="">Edit</a></td>
					<td style="width:40px;"><a class="delete" href="">Delete</a></td>
				</tr>

			</c:forEach>

		</table>
		<table  align="center">
	        <tr><td><div id="barcon" name="barcon"></div></td></tr>
	    </table>
	</c:if>
	
	<br />
	<button><a href="loginseccess">返回</a></button>
	<script type="text/javascript" src="../../js/page.js"></script>
</body>
</html>