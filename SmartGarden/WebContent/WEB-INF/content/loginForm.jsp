<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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
	<link rel="stylesheet" href="css/sccl.css">

    
  </head>
  
  <body class="login-bg">

    <div class="login-box">
        <header>
            <h1>智慧园林生态体验系统</h1>
        </header>
        
        <div class="login-main">
			<form action="login" method="post">
				<input name="__RequestVerificationToken" type="hidden" value="">                
				<div class="layui-form-item">
					<font color="red">${requestScope.message }</font>
					<input type="text" name="userName" lay-verify="userName" autocomplete="off" placeholder="这里输入登录名" class="layui-input">
                   
				</div>

				<div class="layui-form-item">
					<input type="password" name="userPwd" lay-verify="password" autocomplete="off" placeholder="这里输入密码" class="layui-input">
                   
				</div>
               
                <select name="userRight">
                      <option >请选择身份</option>
                      <option value="1001">超级管理员</option>
                      <option value="1002">普通管理员</option>
                </select>  
               
				<div class="layui-form-item">
					<div class="pull-left login-remember">
						<label>记住帐号？</label>
						<input type="checkbox" name="rememberMe" value="true" lay-skin="switch" title="记住帐号？">
                        <div class="layui-unselect layui-form-switch"><i></i></div>
					</div>
					<div class="pull-right">
						<button class="layui-btn layui-btn-primary" lay-submit="" lay-filter="login">
							登录
						</button>
					</div>
					<div class="clear"></div>
					<a text="align" href="register" style="color: white;">没有账号？点我注册</a>
				</div>

			</form>        
		</div>
       <!-- <footer>
            <p>xuan Â© www.mycodes.net</p>
        </footer>
        -->
    </div>
    <script type="text/html" id="code-temp">
        <div class="login-code-box">
            <input type="text" class="layui-input" id="code" />
            <img id="valiCode" src="/manage/validatecode?v=636150612041789540" alt="éªè¯ç " />
        </div>
    </script>
    <script src="layui/layui.js"></script>
    <script>
        layui.use(['layer', 'form'], function () {
            var layer = layui.layer,
				$ = layui.jquery,
				form = layui.form();

            form.verify({
                userName: function (value) {
                    if (value === '')
                        return '请输入用户名';
                },
                password: function (value) {
                    if (value === '')
                        return '请输入密码 ';
                }
            });

            var errorCount = 0;

            form.on('submit(login)', function (data) {
				window.location.href = "index";
                /*if (errorCount > 5) {
                    layer.open({
                        title: '<img src="' + location.origin + '/Plugins/layui/images/face/7.gif" alt="[å®³ç¾]">è¾å¥éªè¯ç ',
                        type: 1,
                        content: document.getElementById('code-temp').innerHTML,
                        btn: ['ç¡®å®'],
                        yes: function (index, layero) {
                            var $code = $('#code');
                            if ($code.val() === '') {
                                layer.msg('è¾å¥éªè¯ç å¦ï¼è®©æç¥éä½ æ¯äººç±»ã');
                                isCheck = false;
                            } else {
                                $('input[name=verifyCode]').val();
                                var params = data.field;
                                params.verifyCode = $code.val();
                                submit($,params);
                                layer.close(index);
                            }
                        },
                        area: ['250px', '150px']
                    });
                    $('#valiCode').off('click').on('click', function () {
                        this.src = '/manage/validatecode?v=' + new Date().getTime();
                    });
                }else{
                    submit($,data.field);
                }

                return false;*/
            });

        });
		
        /*function submit($,params){
            $.post('/manage/login',params , function (res) {
                if (!res.success) {
                    if (res.data !== undefined)
                        errorCount = res.data.errorCount
                    layer.msg(res.message,{icon:2});
                }else
                {
                    layer.msg(res.message,{icon:1},function(index){
                        layer.close(index);
                        location.href='/manage';
                    });
                }
            }, 'json');
        }*/
    </script>
  </body>
</html>
