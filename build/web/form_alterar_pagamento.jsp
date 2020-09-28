<%@page import="model.PagamentoDAO"%>
<%@page import="model.Pagamento"%>
<%
    int id_pagamento  = Integer.parseInt(request.getParameter("id_formaPagamento"));
    Pagamento p = new Pagamento();
    try {
        PagamentoDAO pDAO = new PagamentoDAO();
        pDAO.conectar();
        p = pDAO.carregaPorId(id_pagamento);

    } catch (Exception e) {
        out.print("Erro ao carregar  Pagamento: " + e.toString());
    }


%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="_css/style.css">
        <title>Alterar Pagamento</title>
    </head>
    <body>
        <section>
            <div class="content">
                <h1>Alterar Pagamento</h1>

                <form name="form_pagamento" method="post" action="AlterarPagamento.do">

                    <label>ID:<%=p.getId_pagamento()%> </label>

                    <fieldset> 
                        <input type="hidden" name="id" value="<%=fp.getId_formaPagamento()%>" >
                    </fieldset>

                    <fieldset> 
                        <input class="box" name="valor"  type="text" value="<%=p.getValor()%>" placeholder="Informe o valor">
                    </fieldset>
                    
                    <fieldset> 
                        <input class="box" name="data"  type="text" value="<%=p.getData()%>" placeholder="Informe a data">
                    </fieldset>
                    
                    <fieldset> 
                        <input class="box" name="formaPagamento"  type="text" value="<%=p.getFormaPagamento()%>" placeholder="Informe a forma de Pagamento">
                    </fieldset>
                    
                </form>
            </div>
        </section>
    </body>
</html>
