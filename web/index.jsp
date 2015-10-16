<%-- 
    Document   : index
    Created on : 05-sep-2013, 19:11:38
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
            session.setMaxInactiveInterval(10);
        %>
        <form name="input" action="ServletTraductor" method="get">
            Palabra: <input type="text" name="palabra"><br>
            Idioma:<select name="idioma">
  <option value="ingles">Ingles</option>
  <option value="aleman">Aleman</option>
  <option value="frances">Frances</option>
  
</select>
    <input type="submit" value="Submit">
</form>
    </body>
</html>
