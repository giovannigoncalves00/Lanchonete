<%@page import="model.ClienteDAO"%>
<%@page import="model.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String idcliente = request.getParameter("idcliente");
    Cliente c = new Cliente();
    try {
        ClienteDAO cDAO = new ClienteDAO();
        cDAO.conectar();
        c = cDAO.carregaPorId(Integer.parseInt(idcliente));
        cDAO.desconectar();
    } catch (Exception e) {
        out.print("Erro ao carregar Cliente " + e.toString());
    }


%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="_css/style.css">
        <title>Alterar Cliente</title>
    </head>
    <body>
        <section>
            <div class="content">
                <h1>Alterar Cliente ID: <%=c.getIdcliente()%></h1>

                <form name="form_cliente" method="post" action="alterar_cliente.do">

                    <fieldset> 
                        <input class="box" name="nome"  type="text" value="<%=c.getNome()%>" placeholder="Digite um nome">
                    </fieldset>

                    <fieldset> 
                        <input class="box" name="cpf"  type="text" value="<%=c.getCpf()%>" placeholder="Digite um cpf">
                    </fieldset>

                    <fieldset> 
                        <input class="box" name="celular"  type="text" value="<%=c.getCelular()%>" placeholder="Digite o celular">
                    </fieldset>

                    <fieldset> 
                        <input class="box" name="cidade"  type="text" value="<%=c.getCidade()%>" placeholder="Digite a cidade">
                    </fieldset>

                    <fieldset> 
                        <input class="box" name="bairro"  type="text" value="<%=c.getBairro()%>" placeholder="Digite o bairro">
                    </fieldset>

                    <fieldset> 
                        <input class="box" name="quadra"  type="text" value="<%=c.getQuadra()%>" placeholder="Digite a quadra">
                    </fieldset>

                    <fieldset> 
                        <input class="box" name="email"  type="text" value="<%=c.getEmail()%>" placeholder="Digite um email">
                    </fieldset>

                    <fieldset>
                        <input class="enviar" type="submit" value="Salvar"/>
                    </fieldset>
                </form>
            </div>
        </section>
    </body>
</html>
