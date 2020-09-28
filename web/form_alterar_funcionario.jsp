<%@page import="model.FuncionarioDAO"%>
<%@page import="model.Funcionario"%>
<%
    int id_funcionario = request.getParameter("id_funcionario");
    Funcionario f = new Funcionario();
    try {
        FuncionarioDAO fDAO = new FuncionarioDAO();
        fDAO.conectar();
        f = fDAO.carregaPorId(id_funcionario);

    } catch (Exception e) {
        out.print("Erro ao carregar Funcionário " + e.toString());
    }


%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="_css/style.css">
        <title>Alterar Funcionário</title>
    </head>
    <body>
        <section>
            <div class="content">
                <h1>Alterar Funcionario</h1>

                <form name="form_funcionario" method="post" action="AlterarFuncionario.do">

                    <label>ID:<%=f.getId_funcionario()%> </label>

                    <fieldset> 
                        <input type="hidden" name="id" value="<%=f.getId_funcionario()%>" >
                    </fieldset>

                    <fieldset> 
                        <input class="box" name="nome"  type="text" value="<%=f.getNome()%>" placeholder="Digite um nome">
                    </fieldset>
                    
                    <fieldset> 
                        <input class="box" name="usuario"  type="text" value="<%=f.getUsuario()%>" placeholder="Digite o nome de usuário">
                    </fieldset>
                    
                    <fieldset> 
                        <input class="box" name="senha"  type="password" value="<%=f.getSenha()%>" placeholder="Digite a senha">
                    </fieldset>
                    
                    <fieldset> 
                        <input class="box" name="perfil"  type="text" value="<%=f.getPerfil()%>" placeholder="Escolha o perfil">
                    </fieldset>
                    
                    <fieldset> 
                        <input class="box" name="pedido"  type="text" value="<%=f.getPedido()%>" placeholder="Escolha o pedido">
                    </fieldset>
                    
                   
                </form>
            </div>
        </section>
    </body>
</html>
