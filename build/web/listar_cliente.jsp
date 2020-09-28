<%@page import="java.util.ArrayList"%>
<%@page import="model.Cliente"%>
<%@page import="model.ClienteDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>



<html>
    <head>
        <%@include file="banner.jsp"%>

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

        <title>Listar Cliente</title>
        <script type="text/javascript">
            function excluir(id) {
                if (confirm("Deseja excluir o cliente " + id + "?")) {
                    window.location = "excluir_cliente.do?idcliente=" + id;
                }
            }
        </script>
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
                    <a class="navbar-brand" href="painel.jsp">3G&L</a>
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
                            <li>
                                <a href="#"><i class="fa fa-gear fa-fw"></i> Configurações</a>
                            </li>
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
                            <li class="sidebar-search">
                                <div class="input-group custom-search-form">
                                    <input type="text" class="form-control" placeholder="Search...">
                                    <span class="input-group-btn">
                                        <button class="btn btn-default" type="button">
                                            <i class="fa fa-search"></i>
                                        </button>
                                    </span>
                                </div>
                            </li>
                            <li>
                                <a href="painel.jsp"><i class="fa fa-dashboard fa-fw"></i> Painel</a>
                            </li>
                            <li>
                                <a href="tables.html"><i class="fa fa-table fa-fw"></i> Manter Dados</a>
                                <ul class="nav nav-second-level">
                                    <li>
                                        <a href="listar_cliente.jsp">Clientes</a>
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
        </div>

        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Clientes</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Dados da tabela "cliente"
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="dataTable_wrapper">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th> ID </th>
                                            <th> Nome </th>
                                            <th> CPF </th>
                                            <th> Celular </th>
                                            <th> Bairro </th>
                                            <th> Quadra</th>
                                            <th> Cidade</th>
                                            <th> Senha</th>
                                            <th> Email</th>
                                            <th> Ações</th>
                                        </tr>
                                        <%                                            try {
                                                ClienteDAO cDAO = new ClienteDAO();
                                                ArrayList<Cliente> lista = new ArrayList();
                                                cDAO.conectar();
                                                lista = cDAO.listar();
                                                for (Cliente c : lista) {
                                        %>
                                        <tr>
                                            <td> <%=c.getIdcliente()%> </td>
                                            <td> <%=c.getNome()%> </td>
                                            <td> <%=c.getCpf()%> </td>
                                            <td> <%=c.getCelular()%> </td>
                                            <td> <%=c.getBairro()%> </td>
                                            <td> <%=c.getQuadra()%> </td>
                                            <td> <%=c.getCidade()%> </td>
                                            <td> <%=c.getSenha()%> </td>
                                            <td> <%=c.getEmail()%> </td>
                                            <td><a href="#" onclick="excluir(<%=c.getIdcliente()%>)"><i class="fa fa-times"></i></a>
                                                <a href="form_alterar_cliente.jsp?id=<%=c.getIdcliente()%>"><i class="fa fa-edit"></i></a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                                                <%
                                                        }
                                                        cDAO.desconectar();

                                                    } catch (Exception e) {
                                                        out.print(e);
                                                    }
                                                %>
                                    </thead>
                                </table>
                            </div>
                            <!-- /.table-responsive -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
        </div>
        <!-- /#wrapper -->

        <!-- jQuery -->
        <script src="bower_components/jquery/dist/jquery.min.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

        <!-- Metis Menu Plugin JavaScript -->
        <script src="bower_components/metisMenu/dist/metisMenu.min.js"></script>

        <!-- Morris Charts JavaScript -->
        <script src="bower_components/raphael/raphael-min.js"></script>
        <script src="bower_components/morrisjs/morris.min.js"></script>
        <script src="js/morris-data.js"></script>

        <!-- Custom Theme JavaScript -->
        <script src="dist/js/sb-admin-2.js"></script>
    </body>
</html>
