<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSTL</title>
</head>
<body>
<%--Объявить переменную--%>
    <c:set var="header1" value="Hello from JSTL!" scope="page"/>

<%--получить переменную--%>
    ${header1}

<%--сделать некие действия--%>
    <c:set var="nu" value="16"/>
    <p>${nu + 25}</p>

<%--удаление переменной--%>
    <c:remove var="number"/>
    <p>${number + 25}</p>
<%--простой оператор выбора--%>
    <c:if test="${number == null}">
        <p>Not exist</p>
    </c:if>
<%--оператор выбора if-else--%>
    <c:choose>
        <c:when test="${nu == 15}">
            <p>equals 15</p>
        </c:when>
        <c:otherwise>
            <p>not equals 15</p>
        </c:otherwise>
    </c:choose>
<%--оператор url--%>
<%--простое использование--%>
    <c:url var="link" value="http://yandex.ru"/>
    This is the <a href="${link}">linka</a> on page.
<%--продвинутое использование--%>
    <c:url var="link1" value="http://google.com">
        <c:param name="q" value="Телефон"/>
    </c:url>
    This is the second <a href="${link1}">link</a> on page.
<%--цикл--%>
    <c:forEach var="cook" items="${cookie}">
        <li>
            <c:out value="${cook.value.name}"/>
            <c:out value="${cook.value.value}"/>
        </li>
    </c:forEach>
</body>
</html>
