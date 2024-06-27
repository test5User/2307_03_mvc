<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>User Info</title>
</head>
<body>
    <h1>User Info:</h1>
    <c:choose>
        <c:when test="${not empty us}">
            <p>Id: ${us.getId()}</p>
            <p>FIO: ${us.fio}</p>
            <p>EMAIL: ${us.email}</p>
            <p>${us.toString()}</p>
        </c:when>
        <c:otherwise>
            <p>${message}</p>
        </c:otherwise>
    </c:choose>
</body>
</html>
