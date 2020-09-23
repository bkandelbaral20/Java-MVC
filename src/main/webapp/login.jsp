
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <jsp:include page="Partials/head.jsp">
        <jsp:param name="title" value="practise login"/>
</head>
<body>

<%--method 1--%>
<% String e = request.getParameter("email"); %>
<%  request.setAttribute("email",e); %>

<% String p = request.getParameter("passw"); %>
<% request.setAttribute("password", p); %>

<p> Here is my email : ${email} </p>
<p> Here is my password :  ${password} </p>

<%--Method 2--%>
<p> Here is my email = <%= request.getParameter( "email" )%></p>
<p> Here is my password = <%= request.getParameter( "passw" )%></p>




<%--//response.getWriter().println("<p> The email is " + email + " the password is " + password + " </p>");--%>

</body>
</html>
