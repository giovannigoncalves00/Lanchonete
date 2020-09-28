<%-- 
    Document   : form_inserir_perfil
    Created on : 28/03/2016, 16:21:21
    Author     : aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="_css/style.css">
    </head>
    <body>
        <section>
            <div class="content">
                <h1>Novo Perfil</h1>
                <form name="perfil" method="post" action="inserir_perfil.do">
                        <label for="pf">Perfil: </label>
                        <fieldset>
                            <input class="box" type="text" name="perfil" id="pf" placeholder="Digite o nome do perfil">
                        </fieldset>
                        <fieldset>
                            <input class="enviar" type="submit" value="Enviar"/>
                        </fieldset>
                </form>
            </div>
        </section>
    </body>
</html>
