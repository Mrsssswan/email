# email

项目简介

使用spring struts hibernate mysql技术

实现的功能有：

1.用户可以注册，登录，从数据库读取和存储用户信息

2.管理员可以查看所有用户信息，并且删除用户

这个项目有许多致命的缺陷：

1.用户注册时每刷新一次会注册一次

2.用户注册成功后跳转到登录界面，注册的用户信息全都丢失，

  此时在登录界面操作会出异常，异常为无实体（no entity query）
  
3.用户无法修改个人信息，报错原因是action没提供setter方法，

  不过在stackoverflow上有解决方案，在配置文件中将modelParams拦截器中的
  
  modeldriven位置调动。修改后进入登录页面，出现和2相同错误
  
4.管理员删除用户时会抛出无action find异常 但是会从数据库中删除该用户 

  这个异常很头大，完全发现不了原因
  
想要改进的地方：

1.注册时用户名和邮箱要规范，长度有限制，若已有用户名和邮箱。显示已注册信息

2.使用JavaEmail技术，注册时使用邮箱发送验证码

3.登录时需要验证码。用户修改自己信息后要弹出是否修改对话框

4.管理员可以给用户发邮件，管理员删除用户时要弹出是否删除对话框

5.用户之间以及用户可以给管理员发邮件

