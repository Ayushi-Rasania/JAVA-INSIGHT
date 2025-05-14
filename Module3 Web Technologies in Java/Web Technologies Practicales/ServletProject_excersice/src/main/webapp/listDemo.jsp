<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
    // Scriplet to create a list
    java.util.List<String> names = new java.util.ArrayList<>();
    names.add("Alice");
    names.add("Bob");
    names.add("Charlie");

    // Set it in request scope
    request.setAttribute("nameList", names);
%>

<html>
<head>
    <title>JSP JSTL and Scriplet Example</title>
</head>
<body>
    <h2>Using JSTL to display a list:</h2>
    <ul>
        <c:forEach var="name" items="${nameList}">
            <li>${name}</li>
        </c:forEach>
    </ul>

    <h2>Using Scriplet to display message:</h2>
    <% out.println("<p>This is printed using a scriplet</p>"); %>

    <h2>Using Implicit Objects:</h2>
    <p>Request URI: <%= request.getRequestURI() %></p>
    <p>Session ID: <%= session.getId() %></p>
    <p>Server Info: <%= application.getServerInfo() %></p>
</body>
</html>
