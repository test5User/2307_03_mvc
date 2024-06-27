<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Users Info</title>
</head>
<body>
<c:choose>
  <c:when test="${not empty users}">
    <c:forEach var="user" items="${users}">
      <p>${user.toString()}</p>
    </c:forEach>
  </c:when>
  <c:otherwise>
    <p>${message}</p>
  </c:otherwise>
</c:choose>
</body>
</html>