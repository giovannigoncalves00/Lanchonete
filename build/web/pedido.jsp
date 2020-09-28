<%-- 
    Document   : pedido
    Created on : 29/06/2016, 07:36:07
    Author     : giova
--%>
<%@page import="model.PedidoProduto"%>
<%@page import="model.CarrinhoDeCompra"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>Carrinho de Compras</title>
 </head>
 <body>
 <h1>Carrinho de Compras!</h1>
 <table border="1" cellpadding="2" >
 <tr>
 <td bgcolor="#000088"><font color="white">Excluir</font></td>
 <td bgcolor="#000088"><font color="white">Item</font></td>
 <td bgcolor="#000088"><font color="white">QTD</font></td>
 <td bgcolor="#000088"><font color="white">Preço Unitário</font></td>
 <td bgcolor="#000088"><font color="white">Total Item</font></td>
 <td bgcolor="#000088"><font color="white">+1</font></td>
 </tr>
 <%
 //recupera os produtos do carrinho da sessao
 CarrinhoDeCompra carrinho = (CarrinhoDeCompra) session.getAttribute("carrinho");
 for(PedidoProduto item : carrinho.getItens()){
 %>
 <tr>
 <td><a
href="ControleCarrinho?acao=removeProduto&idProduto=<%=item.getProduto().getIdproduto()%>">
X</td>
 <td><%=item.getProduto().getNome() %></td>
 <td><%=item.getQuantidade() %></td>
 <td><a
href="ControleCarrinho?acao=addProduto&idProduto=<%=item.getProduto().getIdproduto()%>">+</a
></td>
 </tr>

 <%
 }
 %>

 </table>

 <strong>Valor Total: </strong><br/>

 <a href="index.jsp"> Continue comprando</a><br/>
Aplicativos Web com Orientação a Objetos
Prof. Wolley W. Silva
 <a href="ControleCarrinho?acao=cancelaCompra">Cancelar comprar</a>
 </body>
</html>
