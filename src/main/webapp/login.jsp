<%--
  Created by IntelliJ IDEA.
  User: binjitakandelbaral
  Date: 9/20/20
  Time: 6:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>

<head>
    <jsp:include page="Partials/head.jsp">
        <jsp:param name="title" value="practise login"/></jsp:include>
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
