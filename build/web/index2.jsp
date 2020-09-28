<%-- 
    Document   : index2
    Created on : 29/06/2016, 07:33:02
    Author     : giova
--%>

<%@page import="model.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>JSP Page</title>
 </head>
 <body>
 
Aplicativos Web com Orientação a Objetos
Prof. Wolley W. Silva
 <%
 // Recupera os produtos.
 java.util.List<Produto> produtos = (java.util.List<Produto>)
request.getAttribute("produtos");
 if(produtos == null) {
 request.getRequestDispatcher("/ControleProduto?acao=listaProdutos").forward(request,
response);
 }
 %>

 <h1>Lista de Produtos</h1>
 <table border="0" cellpadding="5" align="center">
 <%
 int contadorColuna=1;
 for(Produto produto : produtos){
 //se é o primeiro produto, cria o inicio da linha
 if(contadorColuna == 1) {
 out.println("<tr>");
 }
 %>
 <br/>
 <%=produto.getNome()%><br/>
 <a href="ControleCarrinho?acao=addProduto&idProduto=<%=produto.getIdproduto()%>">
Comprar</a></td>
 <%
 //se é o último produto, exibir o término da linha
 if(contadorColuna == 3){
 out.println("</tr>");
 contadorColuna =0;
 }
 //atualiza o contador de colulas
 contadorColuna ++;

 }//fim do for
 %>
 </table>

 </body>
</html>