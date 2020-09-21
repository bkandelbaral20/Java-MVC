
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="Partials/head.jsp">
    <jsp:param name="title" value="Practice MVC"/></jsp:include>
</head>
<body>
<h5>Form For email and password</h5>
</body>

<form method="POST" action="/login.jsp">
    <label for="email">Email:</label>
    <input id="email" name="email" placeholder="Enter your email address" />
    <label for="passw">Password:</label>
    <input type="password" id="passw" name="passw" placeholder="Enter your Password" />
    <input type="submit" name="submit">
</form>
</html>
