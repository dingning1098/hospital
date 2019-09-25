<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@include file="WEB-INF/jsp/common/header.jsp"%>

  <body>
  ${messages}
  <%
    String error = request.getParameter("error");
    if ("true".equals(error)) {
      %>

  请登录
  <%
    }
  %>
  <form action="${ctx}reg/login" method="post">
    <input type="text" name="username" /><br/><br/>
    <input type="password" name="pwd" /><br/><br/>
    <input type="submit" value="登录">
    <a href="${ctx}reg/reg"><input type="button" value="注册" /></a>
  </form>
  </body>
</html>
