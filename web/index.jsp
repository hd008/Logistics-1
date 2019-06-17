<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/6/13
  Time: 18:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <s:form action="test!login" method="POST">
    <s:textfield name="user.username" label="username"/>
    <s:password name="user.password" label="password"/>
    <s:submit value="login"/>
  </s:form>
  </body>
</html>
