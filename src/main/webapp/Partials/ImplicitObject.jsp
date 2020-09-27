
<p> Path: <%= request.getRequestURL() %></p>
<p>Query String: <%= request.getQueryString() %></p>
<%--//to get the query string type ? and write value(param) if you want to add another param using &.--%>

<p>"name" parameter: <%= request.getParameter("name") %></p>
<%--//while checking the parameter name type ?name=binji or anyhthing to check--%>

<p>"method" attribute: <%= request.getMethod() %></p>
<%--it will shows which type of method use used on this--%>

<p>User-Agent header: <%= request.getHeader("user-agent") %></p>
<%--print out the laptop user--%>
