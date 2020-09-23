
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="Partials/head.jsp">
    <jsp:param name="title" value="Practice MVC"/></jsp:include>
</head>
<body>
<%--navbar--%>
<%@ include file="Partials/navbar.jsp" %>

<%--for counting number--%>
<%! int count = 0;
<% count +=1;  %>
<h1> The current count is <%= count%>;</h1>

<h3>Form For email and password</h3>
<form method="POST" action="/login.jsp">
    <label for="email">Email:</label>
    <input id="email" name="email" placeholder="Enter your email address" />
    <label for="passw">Password:</label>
    <input type="password" id="passw" name="passw" placeholder="Enter your Password" />
    <input type="submit" name="submit">
</form>
<%@ include file="Partials/ImplicitObject.jsp" %>

</body>
</html>
