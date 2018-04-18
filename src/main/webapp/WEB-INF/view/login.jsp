<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Hello World</title>
</head>
<body>
<h2>Players</h2>
<ul>
    <c:if test="${!empty message}">
        <p>${message}</p>
    </c:if>
    <form method="post">
        <label>Username: <input type="text" name="username"/></label>
        <label>Password: <input type="password" name="password"/></label>
        <input type="submit"/>
    </form>
</ul>
</body>
</html>