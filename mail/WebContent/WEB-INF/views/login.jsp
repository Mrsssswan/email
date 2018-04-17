<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X_UA_Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, minimum-scale=1">
<link rel="stylesheet" href="./layui/css/layui.css" media="all"/>
<style type="text/css">
h1 {text-align:center;color:#1d598e;}
</style>
<title>登录</title>
</head>
<body>
	<form class="layui-form" action="person-login" method="post">
		<div class="layui-form-item">
			<h1>人脸打卡平台登录</h1>
		</div>
		<div class="layui-form-item">
			<div class="layui-input-block">
				<span class="decrib">用户名：</span> <input type="text" name="username"
					placeholder="请输入用户名" autocomplete="off" class="layui-input"
					autofocus="true" required>
			</div>
		</div>
		<div class="layui-form-item">
			<div class="layui-input-block">
				<span class="decrib">密码：</span> <input type="password"
					name="password" placeholder="请输入密码" autocomplete="off"
					class="layui-input" required>
			</div>
		</div>
		<div class="layui-form-item">
		</div>
		<div class="layui-form-item">
			<div class="layui-input-block">
				<button class="layui-btn layui-btn-fluid" lay-submit
					lay-filter="formDemo">登录</button>
			</div>
		</div>
	</form>
</body>
</html>