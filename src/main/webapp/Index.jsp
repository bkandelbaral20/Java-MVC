
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <jsp:include page="Partials/head.jsp">
    <jsp:param name="title" value="Practice MVC"/></jsp:include>
</head>
<body>
<%--navbar--%>
<%--<%@ include file="Partials/navbar.jsp" %>--%>

<%--for counting number--%>
<%--<%! int count = 0;--%>
<%--<% count +=1;  %>--%>
<%--<h1> The current count is <%= count%>;</h1>--%>

<%--<h3>Form For email and password</h3>--%>
<%--<form method="POST" action="/login.jsp">--%>
<%--    <label for="uname">UserName:</label>--%>
<%--    <input id="uname" name="uname" placeholder="Enter your user name" />--%>
<%--    <label for="email">Email:</label>--%>
<%--    <input id="email" name="email" placeholder="Enter your email address" />--%>
<%--    <label for="passw">Password:</label>--%>
<%--    <input type="password" id="passw" name="passw" placeholder="Enter your Password" />--%>
<%--    <input type="submit" name="submit">--%>
<%--</form>--%>

<%--for the mvc exerxcises--%>
<%--<% if (request.getParameter("uname") == null || request.getParameter("psw") == null) {--%>
<%--} else if (request.getParameter("uname").equalsIgnoreCase("admin") && request.getParameter("psw").equalsIgnoreCase("password")) {--%>
<%--    response.sendRedirect("/profile.jsp");--%>
<%--} else {--%>
<%--    response.getWriter().println("<h1>Incorrect page </h1>");--%>
<%--} %>--%>


<%--for the product mvc--%>
<h1> Here are all the products:</h1>
<c:forEach var="product" items="${products}">
    <div class ="product">
        <h2>Products: ${product.name}</h2>
        <p>Price : $ ${product.price}</p>
    </div>
</c:forEach>

<%--this one is for Pizza--%>
<h1> Here are all the pizzas:</h1>
<c:forEach var="product" items="${pizzas}">
    <div class ="product">
        <h2>Pizzas: ${pizzas.name}</h2>
        <p>Price : $ ${product.price}</p>
    </div>
</c:forEach>
<%--linking bootsraps scripts--%>
<%@ include file="Partials/Scripts.jsp" %>
</body>
</html>
