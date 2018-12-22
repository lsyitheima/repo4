<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/12/15
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>入门程序</title>
    <script src="js/jquery.min.js"></script>
    <script>
        $(function () {
           //绑定单机事件
            $("#btn").click(function () {
                //发送ajax请求
                $.ajax({
                    url:"account/yibu",
                    data:'{"username":"李白","password":"123","age":18}',
                    type:"post",
                    contentType:"application/json;charset=utf-8",
                    dataType:"json",
                    success:function (data) {
                        alert(data);
                        alert(data.username);
                    }
                });
            });

        });

    </script>

</head>
<body>

<a href="user/hello">我要入门</a>

<%--基本类型示例--%>
<a href="user/findOne?id=12&username=libai">查询账户</a>
<hr/>

<form action="user/findAll" method="post">
    姓名：<input type="text" name="username">
    密码：<input type="password" name="password">
    年龄：<input type="text" name="age">
    <input type="submit" value="提交">
</form>

<hr/>

<form action="user/toList" method="post">
    用户名：<input type="text" name="name"><br>
    性别：<input type="text" name="sex"><br>

    姓名：<input type="text" name="user.username"><br>
    密码：<input type="password" name="user.password"><br>
    年龄：<input type="text" name="user.age"><br>

    姓名：<input type="text" name="users[0].username"><br>
    密码：<input type="password" name="users[0].password"><br>
    年龄：<input type="text" name="users[0].age"><br>

    姓名：<input type="text" name="map[one].username"><br>
    密码：<input type="password" name="map[one].password"><br>
    年龄：<input type="text" name="map[one].age"><br>
    <input type="submit" value="提交">

</form>
<hr/>
<hr/>
<form action="account/toString" method="post">
    姓名：<input type="text" name="username">
    密码：<input type="password" name="password">
    年龄：<input type="text" name="age">
    <input type="submit" value="提交">
</form>

<hr/>
<form action="account/toModelAndView" method="post">
    姓名：<input type="text" name="username">
    密码：<input type="password" name="password">
    年龄：<input type="text" name="age">
    <input type="submit" value="提交">
</form>
<hr/>
<button id="btn">发送ajax异步请求</button>

</body>
</html>
