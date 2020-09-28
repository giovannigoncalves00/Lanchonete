<%-- 
    Document   : sair
    Created on : Jun 27, 2016, 4:23:24 PM
    Author     : gustavo
--%>
<%
    session.removeAttribute("cliente");
    response.sendRedirect("index.jsp");
%>