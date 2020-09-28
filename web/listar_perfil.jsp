<%-- 
    Document   : listar_perfil
    Created on : 04/04/2016, 17:14:19
    Author     : jotadf
--%>

<%@page import="model.Perfil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.PerfilDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="_css/style.css">
        <title>JSP Page</title>
        <script type="text/javascript">
            function excluir(id){
                if(confirm("Deseja excluir o perfil:"+id+"?")){
                    window.location = "excluir_perfil.do?id="+id;
                }
            }
            
        </script>
    </head>
    <body> 
        <section>
            <div class="content">
        <div align="center">
            <h1>Lista de Perfis (<a href="form_inserir_perfil.jsp"><img src="imagens/inserir.png" border="0"/></a>)</h1>
        <table>
            <tr>
                <td> ID </td>
                <td> Perfil </td>
                <td> Ações</td>
            </tr>
            <%
                try{
                    PerfilDAO pDAO = new PerfilDAO();
                    
                    ArrayList<Perfil> lista = new ArrayList();
                    pDAO.conectar();
                    
                    lista = pDAO.listar();
         
                    for(Perfil p:lista){
                       %>
                        <tr>
                            <td><%=p.getId() %> </td>
                            <td> <%=p.getPerfil() %> </td>
                            <td>  <a href="form_alterar_perfil.jsp?id=<%=p.getId() %>"><img src="imagens/alterar.png" border="0"/></a> &nbsp;&nbsp;&nbsp;
                                <a href="#" onclick="excluir(<%=p.getId() %>);"><img src="imagens/excluir.png" border="0"/></a> </td>
                        </tr>
                       <% 
                        
                    }
                    pDAO.desconectar();
                    
                }catch(Exception e){
                    out.print(e);
                }
                
                %>
        </table>
        </div>
        </div>
        </section>
    </body>
</html>
