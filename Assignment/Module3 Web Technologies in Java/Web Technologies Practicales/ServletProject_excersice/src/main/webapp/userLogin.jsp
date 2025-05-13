<%@ page language="java" %>
<html>
<head><title>Login</title></head>
<body>
    <h2>Login</h2>
    <form method="post" action="UserLoginServlet">
        Username: <input type="text" name="username" /><br/>
        Password: <input type="password" name="password" /><br/>
        <input type="submit" value="Login" />
    </form>
    <p style="color:red;">${requestScope.error}</p>
</body>
</html>