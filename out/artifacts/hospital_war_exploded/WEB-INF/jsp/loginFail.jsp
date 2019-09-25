<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-09-25
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/header.jsp"%>

  <body>
  登陆失败！
  <form action="${ctx}reg/login" method="post">
    <input type="text" name="username" /><br/><br/>
    <input type="password" name="pwd" /><br/><br/>
    <input type="submit" value="登录"><br/><br/>
  </form>
  </body>
</html>
