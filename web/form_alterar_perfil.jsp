<%-- 
    Document   : form_alterar_perfil
    Created on : 28/03/2016, 16:21:22
    Author     : jotadf
--%>
<%@page import="model.PerfilDAO"%>
<%@page import="model.Perfil"%>
<%
    String id = request.getParameter("id");
    Perfil p = new Perfil();
    try {
        PerfilDAO pDAO = new PerfilDAO();
        pDAO.conectar();
        p = pDAO.carregaPorId(id);

    } catch (Exception e) {
        out.print("Erro ao carregar Perfil: " + e);
    }


%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="_css/style.css">
        <title>Alterar Perfil</title>
    </head>
    <body>
        <section>
            <div class="content">
                <h1>Alterar Perfil</h1>

                <form name="form_perfil" method="post" action="alterar_perfil.do">

                    <label>ID:<%=p.getId()%> </label>

                    <fieldset> 
                        <input type="hidden" name="id" value="<%=p.getId()%>" >
                    </fieldset>

                    <fieldset> 
                        <input class="box" name="perfil"  type="text" value="<%=p.getPerfil()%>" placeholder="Digite um perfil">
                    </fieldset>

                    <fieldset>
                        <input class="enviar" type="submit" value="Salvar"/>
                    </fieldset>
                </form>
            </div>
        </section>
    </body>
</html>
