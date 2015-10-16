<%-- 
    Document   : herramientas
    Created on : 9/09/2013, 06:51:24 PM
    Author     : pc16
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
        <h1>HERRAMIENTAS</h1>
        
        <a href="index.jsp">Traductor</a>
    </body>
</html>
