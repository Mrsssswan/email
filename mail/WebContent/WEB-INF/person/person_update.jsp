<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改个人信息</title>
</head>
<body>

<form class="layui-form" action="jump" method="post">
		
		<div class="layui-form-item">
			<div class="layui-input-block">
				<span class="decrib">用户名：</span> <input type="text" name="person.username"
					placeholder="请输入用户名" autocomplete="off" class="layui-input"
					autofocus="true" required>
			</div>
		</div>
		<div class="layui-form-item">
			<div class="layui-input-block">
				<span class="decrib">邮箱&nbsp;：</span> <input type="text"
					name="person.email" placeholder="请输入邮箱" autocomplete="off"
					class="layui-input" autofocus="true" required>
			</div>
		</div>
		<div class="layui-form-item">
			<div class="layui-input-block">
				<button class="layui-btn layui-btn-fluid" lay-submit
					lay-filter="formDemo">确定</button>
			</div>
		</div>
	</form>

</body>
</html>