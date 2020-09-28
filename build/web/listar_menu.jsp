<%-- 
    Document   : listar_menu
    Created on : 23/04/2016, 14:28:22
    Author     : Sara
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Menu"%>
<%@page import="model.MenuDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="_css/style.css">
        <title>JSP Page</title>
        <script type="text/javascript">
            function excluir(id){
                if(confirm("Deseja excluir o menu:"+id+"?")){
                    window.location = "excluir_menu.do?id="+id;
                }
            }
            
        </script>
    </head>
   <body> 
       <section>
           <div class="content">
        <div align="center">
            <h1>Lista de Menus (<a href="form_inserir_menu.jsp"><img src="imagens/inserir.png" border="0"/></a>)</h1>
        <table>
            <tr>
                <td> ID </td>
                <td> Título </td>
                <td> Link </td>
                <td> Ícone </td>
                <td> Ações</td>
            </tr>
            <%
                try{
                    MenuDAO mDAO = new MenuDAO();
                    ArrayList<Menu> lista = new ArrayList();
                    mDAO.conectar();
                    lista = mDAO.listar();
                    for(Menu m:lista){
                       %>
                        <tr>
                            <td><%=m.getId() %> </td>
                            <td> <%=m.getTitulo() %> </td>
                            <td> <%=m.getLink() %> </td>
                            <td> <%=m.getIcone() %> </td>
                            <td>  <a href="form_alterar_menu.jsp?id=<%=m.getId() %>"> <img src="imagens/alterar.png" border="0"/></a> &nbsp;&nbsp;&nbsp;
                                <%
                                if(m.isDep()){
                                %>
                                <a href="#" onclick="excluir(<%=m.getId() %>);"> <img src="imagens/excluir.png" border="0"/></a>
                            <%
                            }else{
                            %>
                                <img src="imagens/exluir_1.png" border="0"/>
                             <%
                                }
                                %>
                         </td>
                        </tr>

                       <% 
                        
                    }
                    mDAO.desconectar();
                    
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
