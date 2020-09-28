<%-- 
    Document   : form_alterar_menu
    Created on : 23/04/2016, 14:54:41
    Author     : Sara
--%>
<%@page import="model.MenuDAO"%>
<%@page import="model.Menu"%>
<%
    String id = request.getParameter("id");
    Menu m = new Menu();
    try {
        MenuDAO mDAO = new MenuDAO();
        mDAO.conectar();
        m = mDAO.carregaPorId(id);

    } catch (Exception e) {
        out.print("Erro ao carregar Menu: " + e);
    }


%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alterar Menu</title>
    </head>
    <body>
        <section>
            <div class="content">
                <h1>Alterar Perfil</h1>

                <form name="form_menu" method="post" action="alterar_menu.do">
                    <link rel="stylesheet" type="text/css" href="_css/style.css">

                    <label>ID:<%=m.getId()%> </label>

                    <fieldset> 
                        <input type="hidden" name="id" value="<%=m.getId()%>" >
                    </fieldset>

                    <fieldset> 
                        <input class="box" name="titulo"  type="text" value="<%=m.getTitulo()%>" placeholder="Digite um título">
                    </fieldset>
                    <fieldset> 
                        <input class="box" name="link"  type="text" value="<%=m.getLink()%>" placeholder="Digite um link">
                    </fieldset>
                    <fieldset> 
                        <input class="box" name="icone"  type="text" value="<%=m.getIcone()%>" placeholder="Digite um icone">
                    </fieldset>

                    <fieldset>
                        <input class="enviar" type="submit" value="Salvar"/>
                    </fieldset>
                </form>
            </div>
        </section>
    </body>
</html>
