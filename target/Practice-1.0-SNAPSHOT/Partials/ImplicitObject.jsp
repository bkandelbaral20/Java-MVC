<%--
  Created by IntelliJ IDEA.
  User: binjitakandelbaral
  Date: 9/22/20
  Time: 8:06 PM
  To change this template use File | Settings | File Templates.
--%>
<p> Path: <%= request.getRequestURL() %></p>
<p>Query String: <%= request.getQueryString() %></p>
<%--//to get the query string type ? and write value(param) if you want to add another param using &.--%>

<p>"name" parameter: <%= request.getParameter("name") %></p>
