<!DOCTYPE html>
<html>
<head>
    <title>User Form</title>
</head>
<body>
    <h2>Enter Details</h2>
    <form action="SubmitServlet" method="post">
        Username: <input type="text" name="username"><br><br>
        Email: <input type="email" name="email"><br><br>
        <input type="submit" value="Submit">
    </form>

    <%
        String error = request.getParameter("error");
        if (error != null) {
            out.println("<p style='color:red;'>All fields are required!</p>");
        }
    %>
</body>
</html>
