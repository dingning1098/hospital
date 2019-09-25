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
  ${messages}
  <form action="${ctx}reg/save" method="post">
    <table>
      <tr>
        <td>用户名：</td>
        <td><input type="text" id="username" name="username" /></td>
      </tr>
      <tr>
        <td>密码：</td>
        <td><input type="password" id="pwd" name="pwd" /></td>
      </tr>
      <tr>
        <td>姓名：</td>
        <td><input type="text" id="name" name="name" /></td>
      </tr>
      <tr>
        <td>身份证：</td>
        <td><input type="text" id="idcard" name="idcard" /></td>
      </tr>
      <tr>
        <td>电话：</td>
        <td><input type="text" id="tel" name="tel" /></td>
      </tr>
      <tr>
        <td><input type="submit" value="注册"/></td>
        <td><input type="reset" value="重置"/></td>
      </tr>
    </table>
  </form>
  </body>
</html>
