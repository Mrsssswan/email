<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X_UA_Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, minimum-scale=1">
<link rel="stylesheet" href="./layui/css/layui.css" media="all"/>
<title>人脸打卡签到平台</title>
<style type="text/css">
h1 {text-align:center;color:#1d598e;}
body {background:f2f2f2;}
</style>
</head>
<body>
	<form class="layui-form" action="login" method="post">
	<div class="layui-form-item">
			<button class="layui-btn layui-btn-lg layui-btn-fluid layui-btn-normal" lay-submit
					lay-filter="formDemo">用户登录</button>
		</div>
		
	</form>
	<form class="layui-form" action="adminLogin" method="post">
	<div class="layui-form-item">
	<button class="layui-btn layui-btn-fluid layui-btn-lg" lay-submit
					lay-filter="formDemo">管理员登录</button>
	</div>
	</form>
	<form class="layui-form" action="register" method="post">
	<div class="layui-form-item">
		<button class="layui-btn layui-btn-fluid layui-btn-danger layui-btn-lg" lay-submit
					lay-filter="formDemo">还没注册？点击注册</button>
	</div>
	</form>

</body>
</html>