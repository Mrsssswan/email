<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X_UA_Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href="./layui/css/layui.css" media="all">
<title>个人信息</title>
</head>
<body> 
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend><a href="person-update?username=<s:property value="username"/>">修改个人信息</a></legend>
</fieldset>      
</body>
</html>