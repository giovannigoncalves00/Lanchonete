<%@page import="java.util.ArrayList"%>
<%@page import="model.FormaPagamento"%>
<%@page import="model.FormaPagamentoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="_css/style.css">
        <title>JSP Page</title>
        <script type="text/javascript">
            function excluir(id){
                if(confirm("Deseja excluir a forma de Pagamento"+id+"?")){
                    window.location = "ExcluirFormaPagamento.do?id="+id;
                }
            }

        </script>
    </head>
   <body>
       <section>
           <div class="content">
        <div align="center">
            <h1>Lista de Formas de Pagamentos (<a href="form_inserir_pagamento.jsp"><img src="imagens/inserir.png" border="0"/></a>)</h1>
        <table>
            <tr>
                <td> ID </td>
                <td> Tipo </td>
            </tr>
            <%
                try{
                    FormaPagamentoDAO fpDAO = new FormaPagamentoDAO();
                    ArrayList<FormaPagamento> lista = new ArrayList();
                    fpDAO.conectar();
                    lista = fpDAO.listar();
                    for(FormaPagamento u:lista){
                       %>
                        <tr>
                            <td> <%=u.getId_formaPagamento() %> </td>
                            <td> <%=u.getTipo() %> </td>
                            <td>  <a href="form_alterar_usuario.jsp?id=<%=u.getId_formaPagamento() %>"><img src="imagens/alterar.png" border="0"/></a> &nbsp;&nbsp;&nbsp;
                                  <a href="ExcluirFormaPagamento.do?id=<%=u.getTipo() %>"><img src="_imagens/exluir.png" border="0"> </a>

                         </td>
                        </tr>

                       <%

                    }
                    fpDAO.desconectar();

                }catch(Exception e){
                    out.print(e.getLocalizedMessage());
                }

                %>
        </table>
        </div>
        </div>
       </section>
    </body>
</html>
