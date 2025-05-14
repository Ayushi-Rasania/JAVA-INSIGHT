<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%
    String user = (session != null) ? (String)session.getAttribute("user") : null;
    if(user == null){
        response.sendRedirect("userLogin.jsp");
        return;
    }
%>
<html>
<head><title>Welcome</title></head>
<body>
    <h2>Welcome, <%= user %>!</h2>
    <a href="UserLogoutServlet">Logout</a>
</body>
</html>
