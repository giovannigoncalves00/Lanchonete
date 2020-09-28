<%-- 
    Document   : form_inserir_cliente
    Created on : 15/06/2016, 15:57:07
    Author     : 248983
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.ClienteDAO"%>
<%@page import="model.Cliente"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Script Marscara de campo -->
    <script type="text/javascript">
        function formatar(mascara, documento) {
            var i = documento.value.length;
            var saida = mascara.substring(0, 1);
            var texto = mascara.substring(i)

            if (texto.substring(0, 1) != saida) {
                documento.value += texto.substring(0, 1);
            }

        }
    </script>
    <script type="text/javascript">
        function validaForm() {
            var campoNome = document.form_cliente.nome.value;
            var campoEmail = document.form_cliente.email.value;
            var campoSenha = document.form_cliente.senha.value;
            var campoCSenha = document.form_cliente.csenha.value;
            var campoCpf = document.form_cliente.cpf.value;
            var campoCelular = document.form_cliente.celular.value;
            var campoBairro = document.form_cliente.bairro.value;
            var campoQuadra = document.form_cliente.quadra.value;
            var campoCidade = document.form_cliente.cidade.value;
           

            if (campoNome == "") {
                alert("O campo Nome deve ser preenchido!");
                return false;
            }

            if (campoEmail == "") {
                alert("O campo Email deve ser preenchido!");
                return false;
            }
            if (campoSenha == "") {
                alert("O campo Senha deve ser preenchido!");
                return false;
            }

            if (campoSenha !== campoCSenha) {
                alert("Confirmação de senha incorreta!");
                return false;
            }
            if (campoCpf == "") {
                alert("O campo CPF deve ser preenchido!");
                return false;
            }
            if (campoCelular == "") {
                alert("O campo Celular deve ser preenchido!");
                return false;
            }
            if (campoBairro == "") {
                alert("O campo Bairro deve ser preenchido!");
                return false;
            }
            if (campoQuadra == "") {
                alert("O campo Quadra deve ser preenchido!");
                return false;
            }
            if (campoCidade == "") {
                alert("O campo Cidade deve ser preenchido!");
                return false;
            }
            return true;
        }
    </script>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Cadastrar Clientes</title>

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
                            <li><a href="sair.jsp"><i class="fa fa-sign-out fa-fw"></i> Sair</a>
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
                                        <a href="form_alterar_cliente.jsp">Clientes</a>
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
                                                <a href="form_inserir_cliente.jsp">Clientes</a>
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
                        <h1 class="page-header">Cadastrar Clientes</h1>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
                <div class="row">
                    <div class="col-lg-12">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                Formulário para cadastrar clientes
                            </div>
                            <div class="panel-body">
                                <div class="row">
                                    <div class="col-lg-6">
                                        <form role="form" method="post" action="inserir_cliente.do" onsubmit="return validaForm();">
                                            <div class="form-group">
                                                <label>Nome:</label>
                                                <input name="nome" class="form-control" placeholder="Nome completo">
                                            </div>
                                            <div class="form-group">
                                                <label>Senha:</label>
                                                <input name="senha" class="form-control" type="password">
                                                <p class="help-block">(Senha de no mínimo 6 dígitos.)</p>
                                            </div>
                                            <div class="form-group">
                                                <label>Repetir Senha:</label>
                                                <input name="csenha" class="form-control" type="password">
                                            </div>
                                            <div class="form-group">
                                                <label>CPF:</label>
                                                <input name="cpf" class="form-control" placeholder="00000000000">
                                            </div>
                                            <div class="form-group">
                                                <label>E-mail:</label>
                                                <input name="email"class="form-control" placeholder="">
                                            </div>
                                            <div class="form-group">
                                                <label>Celular:</label>
                                                <input name="celular"class="form-control" placeholder="">
                                            </div>
                                            <div class="form-group">
                                                <label>Bairro:</label>
                                                <input name="bairro" class="form-control" placeholder="">
                                            </div>
                                            <div class="form-group">
                                                <label>Quadra:</label>
                                                <input name="quadra"class="form-control" placeholder="">
                                            </div>
                                            <div class="form-group">
                                                <label>Cidade:</label>
                                                <input name="cidade"class="form-control" placeholder="">
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
