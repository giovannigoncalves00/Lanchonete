    <%-- 
        Document   : form_inserir_cliente
        Created on : 15/06/2016, 15:57:07
        Author     : 248983
    --%>

    <%@page contentType="text/html" pageEncoding="UTF-8"%>
    <%@page import="model.PedidoDAO"%>
    <%@page import="model.Pedido"%>
    <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
       "http://www.w3.org/TR/html4/loose.dtd">

    <html lang="en">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Script Marscara de campo -->
    <script type="text/javascript">
            function formatar(mascara, documento){
              var i = documento.value.length;
              var saida = mascara.substring(0,1);
              var texto = mascara.substring(i)

              if (texto.substring(0,1) != saida){
                                    documento.value += texto.substring(0,1);
              }

            }
      </script>
             <script type="text/javascript">
                function validaForm(){  
                    var campoData = document.form_pedido.data.value;
                    var campoPreco = document.form_pedido.preco.value;
                    var campoQuantidade = document.form_pedido.quantidade.value;
                    var campoPagamento = document.form_pedido.pagamento.value;
                    var campoProduto = document.form_pedido.produto.value;

                     if(campoData==""){
                        alert("O campo data deve ser preenchido!");
                        return false;
                    }

                       if(campoPreco==""){
                        alert("O campo preço deve ser preenchido!");
                        return false;
                    }
                       if(campoPagamento==""){
                        alert("O campo Pagamento deve ser preenchido!");
                        return false;
                    }

                    if(campoProduto!=campoCSenha){
                        alert("O campo Produto deve ser preenchido!");
                        return false;
                    }
                    
                    return true;
                }
            </script>
    </script>
    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Cadastar Pedidos</title>

        <!-- Bootstrap Core CSS -->
        <link href="bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">

        <!-- MetisMenu CSS -->
        <link href="bower_components/metisMenu/dist/metisMenu.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="dist/css/xis-do-tche.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="bower_components/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

    </head>

    <body>

        <div id="wrapper">

            <!-- Start Navigation -->
            <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="painel.html">3G&L</a>
                </div>
                <!-- /.navbar-header -->

                <ul class="nav navbar-top-links navbar-right">
                    <li class="dropdown" id="log">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                            <i class="fa fa-user fa-fw"></i>  <i class="fa fa-caret-down"></i>
                        </a>
                        <ul class="dropdown-menu dropdown-user">
                            <li><a href="#"><i class="fa fa-user fa-fw"></i> Perfil de usuário</a>
                            </li>
                            <!--<li>
                                                            <a href="#"><i class="fa fa-gear fa-fw"></i> Configurações</a>
                            </li>-->
                            <li class="divider"></li>
                            <li><a href="login.html"><i class="fa fa-sign-out fa-fw"></i> Sair</a>
                            </li>
                        </ul>
                        <!-- /.dropdown-user -->
                    </li>
                    <!-- /.dropdown -->
                </ul>
                <!-- /.navbar-top-links -->

                <div class="navbar-default sidebar" role="navigation">
                    <div class="sidebar-nav navbar-collapse">
                        <ul class="nav" id="side-menu">
                            <!--<li class="sidebar-search">
                                <div class="input-group custom-search-form">
                                    <input type="text" class="form-control" placeholder="Search...">
                                    <span class="input-group-btn">
                                    <button class="btn btn-default" type="button">
                                        <i class="fa fa-search"></i>
                                    </button>
                                </span>
                                </div>
                                <!-- /input-group
                            </li>-->
                            <li>
                                <a href="painel.html"><i class="fa fa-dashboard fa-fw"></i> Painel</a>
                            </li>
                            <li>
                                <a href="tables.html"><i class="fa fa-table fa-fw"></i> Manter Dados</a>
                                                            <ul class="nav nav-second-level">
                                    <li>
                                        <a href="manterclientes.html">Clientes</a>
                                    </li>
                                                            </ul>
                                                            <ul class="nav nav-second-level">
                                    <li>
                                        <a href="manterfuncionarios.html">Funcionarios</a>
                                    </li>
                                                            </ul>
                                                            <ul class="nav nav-second-level">
                                    <li>
                                        <a href="manterpedidos.html">Pedidos</a>
                                    </li>
                                                            </ul>
                                                            <ul class="nav nav-second-level">
                                    <li>
                                        <a href="manterprodutos.html">Produtos</a>
                                    </li>
                                                            </ul>
                            </li>
                            <li>
                                <a href="tables.html"><i class="fa fa-edit fa-fw"></i> Formulários</a>
                                                            <ul class="nav nav-second-level">
                                    <li>
                                        <a href="#.html">Cadastrar <span class="fa arrow"></span></a>
                                        <ul class="nav nav-third-level">
                                            <li>
                                                <a href="cadastrarclientes.html">Clientes</a>
                                            </li>
                                            <li>
                                                                                            <a href="cadastrarfuncionarios.html">Funcionarios</a>
                                                                                    </li>
                                            <li>
                                                                                            <a href="cadastrarpedidos.html">Pedidos</a>
                                                                                    </li>
                                            <li>
                                                                                            <a href="cadastrarprodutos.html">Produtos</a>
                                                                                    </li>
                                        </ul>
                                        <!-- /.nav-third-level -->
                                    </li>
                                                                    <li>
                                        <a href="#">Alterar <span class="fa arrow"></span></a>
                                        <ul class="nav nav-third-level">
                                            <li>
                                                <a href="alterarclientes.html">Clientes</a>
                                            </li>
                                            <li>
                                                                                            <a href="alterarfuncionarios.html">Funcionarios</a>
                                                                                    </li>
                                            <li>
                                                                                            <a href="alterarpedidos.html">Pedidos</a>
                                                                                    </li>
                                            <li>
                                                                                            <a href="alterarprodutos.html">Produtos</a>
                                                                                    </li>
                                        </ul>
                                        <!-- /.nav-third-level -->
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                    <!-- /.sidebar-collapse -->
                </div>
                <!-- /.navbar-static-side -->
            </nav>
                    <!-- END Navigation -->

            <div id="page-wrapper">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">Cadastrar Pedidos</h1>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
                <div class="row">
                    <div class="col-lg-12">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                Formulário para cadastrar pedidos
                            </div>
                            <div class="panel-body">
                                <div class="row">
                                    <div class="col-lg-6">
                                        <form role="form" method="post" action="inserir_cliente.do" onsubmit="return validaForm();">
                                            <div class="form-group">
                                                <label>Produto</label>
                                                <input class="form-control" placeholder="Produto" type="text">
                                            </div>
                                                                                    <div class="form-group">
                                                <label>Quantidade</label>
                                                <input class="form-control" type="text" placeholder="Quantidade">
                                                
                                            </div>
                                                                                    <div class="form-group">
                                                <label>Preço</label>
                                                <input class="form-control" type="text">
                                            </div>
                                                                                    <div class="form-group">
                                                <label>Data</label>
                                                <input class="form-control" placeholder="dd/MM/yyyy">
                                            </div>
                                                                                    <div class="form-group">
                                                <label>Pagamento</label>
                                                <input class="form-control" type="text">
                                            </div>
                                                                                    
                                            <button type="submit" class="btn btn-default">Salvar</button>
                                            <button type="reset" class="btn btn-default">Resetar</button>
                                        </form>
                                    </div>
                                    <!-- /.col-lg-6 (nested) -->
                                </div>
                                <!-- /.row (nested) -->
                            </div>
                            <!-- /.panel-body -->
                        </div>
                        <!-- /.panel -->
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
            </div>
            <!-- /#page-wrapper -->

        </div>
        <!-- /#wrapper -->

        <!-- jQuery -->
        <script src="bower_components/jquery/dist/jquery.min.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

        <!-- Metis Menu Plugin JavaScript -->
        <script src="bower_components/metisMenu/dist/metisMenu.min.js"></script>

        <!-- Custom Theme JavaScript -->
        <script src="dist/js/sb-admin-2.js"></script>

    </body>

    </html>
