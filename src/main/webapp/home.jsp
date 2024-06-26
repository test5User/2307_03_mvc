<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String header = "Hello from JSP!";
%>
<%!
    int square(int n) {
        return n*n;
    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%-- Comment --%>
    <h2><%= header %></h2>
    <p>Today <%= new java.util.Date()%></p>
    <p>Square of 5 = <%= square(5)%></p>
</body>
</html>
