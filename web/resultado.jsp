<%-- 
    Document   : resultado
    Created on : 05-sep-2013, 19:35:54
    Author     : minutti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=9" >
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            if(session.getAttribute("validacion") != "true")
            {
                response.sendRedirect("login.jsp");
            }
        %>
        <%
            out.println(request.getAttribute("resultado"));
        %>
    </body>
</html>
