<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Li
  Date: 07.11.16
  Time: 9:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>Hello <security:authentication property="principal.username"/>!</h1>

<a href="/adminPage">only for admin</a>
<a href="/userPage">only for user</a>
<a href="/j_spring_security_logout">exit</a>
</body>
</html>
