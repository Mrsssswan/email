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
<title>所有用户信息</title>
</head>
<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>所有用户</legend>
</fieldset>
 
<div class="layui-form">
  <table class="layui-table">
    <colgroup>
      <col width="150">
      <col width="150">
      <col width="200">
      <col>
    </colgroup>
    <thead>
      <tr>
        <th>ID</th>
        <th>用户名</th>
        <th>邮箱</th>
        <th></th>
      </tr> 
    </thead>
    <tbody>
    
    <s:iterator value="#request.persons">
      <tr>
        <td><s:property value="ID"/></td>
        <td><s:property value="username"/></td>
        <td><s:property value="email"/></td>
        <td><a href="person-delete?ID=${ID}">删除</a></td>
      </tr>
      </s:iterator>
    </tbody>
  </table>
</div>
</body>
</html>