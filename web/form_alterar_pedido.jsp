<%@page import="model.PedidoDAO"%>
<%@page import="model.Pedido"%>
<%
    int id_pedido  = Integer.parseInt(request.getParameter("id_pedido"));
    Pedido p = new Pedido();
    try {
        PedidoDAO pDAO = new PedidoDAO();
        pDAO.conectar();
        p = pDAO.carregaPorId(id_pedido );

    } catch (Exception e) {
        out.print("Erro ao carregar  Pedido " + e.toString());
    }


%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="_css/style.css">
        <title>Alterar Pedido</title>
    </head>
    <body>
        <section>
            <div class="content">
                <h1>Alterar Pedido</h1>

                <form name="form_pedido" method="post" action="AlterarPedido.do">

                    <label>ID:<%=p.getId_pedido()%> </label>

                    <fieldset> 
                        <input type="hidden" name="id" value="<%=p.getId_pedido()%>" >
                    </fieldset>

                    <fieldset> 
                        <input class="box" name="produto"  type="text" value="<%=p.getProduto()%>" placeholder="Informe o produto">
                    </fieldset>
                    
                    <fieldset> 
                        <input class="box" name="preco"  type="text" value="<%=p.getPreco()%>" placeholder="Informe o preço">
                    </fieldset>
                    
                    <fieldset> 
                        <input class="box" name="quantidade"  type="text" value="<%=p.getQuantidade()%>" placeholder="Informe a quantidade">
                    </fieldset>
                    
                    <fieldset> 
                        <input class="box" name="data"  type="text" value="<%=p.getData()%>" placeholder="Informe a data">
                    </fieldset>
                    
                    <fieldset> 
                        <input class="box" name="pagamento"  type="text" value="<%=p.getPagamento()%>" placeholder="Informe o pagamento">
                    </fieldset>
                    
                </form>
            </div>
        </section>
    </body>
</html>
