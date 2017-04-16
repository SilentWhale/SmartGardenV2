<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
  <head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta http-equiv="Cache-Control" content="no-siteapp" />
    <title>登录界面</title>
	
	<link rel="stylesheet" href="layui/css/layui.css">
	<link rel="stylesheet" href="css/sccl2.css">

    
  </head>
  
  <body class="login-bg">

    <div class="login-box">
        <header>
            <h1>用户注册</h1>
        </header>

        <div class="login-main">

			<form:form action="${pageContext.request.contextPath }/register" method="POST" modelAttribute="user">
				
			    <div class="layui-form-item">            
			 		<table >
						<tr >
							<td>用户名: </td>  
							<td ><input id="text1" type="text" name="userName" onblur="checkname()"class="layui-input"> 
								<div id="div1" style="display:inline"> </div>	
							</td>
						</tr>

						<tr>
							<td class="wback">
								密码:
							</td>
							<td>
								<input id="text2" type="password" name="userPwd" onblur="check()" class="layui-input"> 
								<div id="div2" style="display:inline"> 
								</div> 
							</td>
						</tr>

						<tr>	
							<td class="wback">
								确认密码: 
							</td>
							<td>	
								<input id="text3" type="password" name="text3" onblur="check() " class="layui-input"> 
								<div id="div3" style="display:inline"> 
								</div>
							</td> 
						</tr>

						<tr>
							<td class="wback">
								性别: </td>
							<td>
								<input name="userSex" type="radio" value="男" />男
					
					<input name="userSex" type="radio" value="女" />女 
							</td>
						</tr>

						<tr>
							<td class="wback">
								邮箱: 
							</td>
							<td>	
								<input id="text4" type="text" name="userMail" onblur="check()" class="layui-input"> 
								<div id="div4" style="display:inline"> 
								</div> 
							</td>
						</tr>	

						<tr>
							<td class="wback">
								电话: 
							</td>
							<td>
								<input id="text5" type="text" name="userPhone" class="layui-input"> 
							</td>
						</tr>	

						<tr>
							<td class="wback">
								年龄: 
							</td>	
							<td>	
								<input id="text6" type="text" name="userAge" class="layui-input"> 
							</td>
						</tr>	

					</table>
			    </div>

				<div class="layui-form-item">
					<div style="margin-left:170px">
						<button class="layui-btn layui-btn-primary" lay-submit="" lay-filter="login" type="submit" name="Submit" value="提交" id="sub">
							提交
						</button>
						<br/>			         	
					</div>		
				</div>

			</form:form>        
		</div>
    </div>

    <script src="js/register.js"></script>
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>

  </body>
</html>
