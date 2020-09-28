<%@page import="model.Cliente"%>
<%
 Cliente cliente = new Cliente();
 try{
     cliente = (Cliente) session.getAttribute("cliente");
     if(cliente.getIdcliente()<=0){
         response.sendRedirect("painel.jsp");
     }
     
 }catch(Exception e){
     response.sendRedirect("login.jsp");
 }
 
%>