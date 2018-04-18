<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Hello World</title>

        <ul>
            <c:forEach items="${players}" var="player">
                <li>
                        ${player.name} ${player.surname} plays at ${player.teamName}
                </li>
            </c:forEach>
        </ul>

    <sec:authorize access="hasRole('USER')">
        <h2>Secret content!</h2>
        <p>${message}</p>
        <p>
            <a href="/logout">Logout</a>
        </p>
    </sec:authorize>
</head>
</html>