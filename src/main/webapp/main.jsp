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
    <c:set var="nu" value="15"/>
    <p>${nu + 25}</p>

<%--удаление переменной--%>
    <c:remove var="number"/>
    <p>${number + 25}</p>


</body>
</html>
