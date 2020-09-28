<%@page import="model.FormaPagamentoDAO"%>
<%@page import="model.FormaPagamento"%>
<%
    int id_formaPagamento  = Integer.parseInt(request.getParameter("id_formaPagamento"));
    FormaPagamento fp = new FormaPagamento();
    try {
        FormaPagamentoDAO fpDAO = new FormaPagamentoDAO();
        fpDAO.conectar();
        fp = fpDAO.carregaPorId(id_formaPagamento);

    } catch (Exception e) {
        out.print("Erro ao carregar Forma de Pagamento: " + e.toString());
    }


%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="_css/style.css">
        <title>Alterar Forma de Pagamento</title>
    </head>
    <body>
        <section>
            <div class="content">
                <h1>Alterar Forma de Pagamento</h1>

                <form name="form_funcionario" method="post" action="AlterarFormaPagamento.do">

                    <label>ID:<%=fp.getId_formaPagamento()%> </label>

                    <fieldset> 
                        <input type="hidden" name="id" value="<%=fp.getId_formaPagamento()%>" >
                    </fieldset>

                    <fieldset> 
                        <input class="box" name="tipo"  type="text" value="<%=fp.getTipo()%>" placeholder="Informe o tipo">
                    </fieldset>
                    
                    
                </form>
            </div>
        </section>
    </body>
</html>
