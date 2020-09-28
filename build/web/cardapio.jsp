<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Cardapio</title>

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
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <div class="row carousel-holder">

                                <div class="col-md-12">
                                    <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                                        <ol class="carousel-indicators">
                                            <li data-target="#carousel-example-generic" data-slide-to="0"></li>
                                            <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                                            <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                                        </ol>
                                        <div class="carousel-inner">
                                            <div class="item active">
                                                <img class="slide-image" src="inicial/img/slide/slide4.jpg" alt="">
                                            </div>
                                            <div class="item">
                                                <img class="slide-image" src="inicial/img/slide/slide5.jpg" alt="">
                                            </div>
                                            <div class="item">
                                                <img class="slide-image" src="inicial/img/slide/slide6.jpg" alt="">
                                            </div>
                                        </div>
                                        <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
                                            <span class="glyphicon glyphicon-chevron-left"></span>
                                        </a>
                                        <a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
                                            <span class="glyphicon glyphicon-chevron-right"></span>
                                        </a>
                                    </div>
                                </div>

                            </div>
                        </div>
                        <div class="panel-body">

                            <div class="row">

                                <div class="col-sm-4 col-lg-4 col-md-4">
                                    <div class="thumbnail">
                                        <img src="inicial/img/cardapio/1.jpg" alt="">
                                        <div class="caption">
                                            <h4 class="pull-right">R$ 6,00</h4>
                                            <h3>Xis Dog</h3>
                                            <p>
                                                <a href="#" class="btn btn-primary">Pedir</a> <a href="#" class="btn btn-default">Sobre</a>
                                            </p>
                                        </div>           
                                    </div>
                                </div>

                                <div class="col-sm-4 col-lg-4 col-md-4">
                                    <div class="thumbnail">
                                        <img src="inicial/img/cardapio/2.jpg" alt="">
                                        <div class="caption">
                                            <h4 class="pull-right">R$ 7,00</h4>
                                            <h3>Xis Grenal</h3>
                                            <p>
                                                <a href="#" class="btn btn-primary">Pedir</a> <a href="#" class="btn btn-default">Sobre</a>
                                            </p>
                                        </div>           
                                    </div>
                                </div>

                                <div class="col-sm-4 col-lg-4 col-md-4">
                                    <div class="thumbnail">
                                        <img src="inicial/img/cardapio/3.jpg" alt="">
                                        <div class="caption">
                                            <h4 class="pull-right">R$ 10,00</h4>
                                            <h3>Xis Bacon</h3>
                                            <p>
                                                <a href="#" class="btn btn-primary">Pedir</a> <a href="#" class="btn btn-default">Sobre</a>
                                            </p>
                                        </div>           
                                    </div>
                                </div>
                            </div>

                            <div class="row">

                                <div class="col-sm-4 col-lg-4 col-md-4">
                                    <div class="thumbnail">
                                        <img src="inicial/img/cardapio/4.jpg" alt="">
                                        <div class="caption">
                                            <h4 class="pull-right">R$ 10,00</h4>
                                            <h3>Xis Calabresa</h3>
                                            <p>
                                                <a href="#" class="btn btn-primary">Pedir</a> <a href="#" class="btn btn-default">Sobre</a>
                                            </p>
                                        </div>
                                    </div>
                                </div>

                                <div class="col-sm-4 col-lg-4 col-md-4">
                                    <div class="thumbnail">
                                        <img src="inicial/img/cardapio/5.jpg" alt="">
                                        <div class="caption">
                                            <h4 class="pull-right">R$ 13,00</h4>
                                            <h3>Xis Coracao</h3>
                                            <p>
                                                <a href="#" class="btn btn-primary">Pedir</a> <a href="#" class="btn btn-default">Sobre</a>
                                            </p>
                                        </div>           
                                    </div>
                                </div>

                                <div class="col-sm-4 col-lg-4 col-md-4">
                                    <div class="thumbnail">
                                        <img src="inicial/img/cardapio/6.jpg" alt="">
                                        <div class="caption">
                                            <h4 class="pull-right">R$ 12,00</h4>
                                            <h3>Xis Frango</h3>
                                            <p>
                                                <a href="#" class="btn btn-primary">Pedir</a> <a href="#" class="btn btn-default">Sobre</a>
                                            </p>
                                        </div>           
                                    </div>
                                </div>

                            </div>

                            <div class="row">

                                <div class="col-sm-4 col-lg-4 col-md-4">
                                    <div class="thumbnail">
                                        <img src="inicial/img/cardapio/7.jpg" alt="">
                                        <div class="caption">
                                            <h4 class="pull-right">R$ 6,00</h4>
                                            <h3>Xis Guri</h3>
                                            <p>
                                                <a href="#" class="btn btn-primary">Pedir</a> <a href="#" class="btn btn-default">Sobre</a>
                                            </p>
                                        </div>           
                                    </div>
                                </div>

                                <div class="col-sm-4 col-lg-4 col-md-4">
                                    <div class="thumbnail">
                                        <img src="inicial/img/cardapio/8.jpg" alt="">
                                        <div class="caption">
                                            <h4 class="pull-right">R$ 13,00</h4>
                                            <h3>Xis Pampas</h3>
                                            <p>
                                                <a href="#" class="btn btn-primary">Pedir</a> <a href="#" class="btn btn-default">Sobre</a>
                                            </p>
                                        </div>           
                                    </div>
                                </div>

                                <div class="col-sm-4 col-lg-4 col-md-4">
                                    <div class="thumbnail">
                                        <img src="inicial/img/cardapio/9.jpg" alt="">
                                        <div class="caption">
                                            <h4 class="pull-right">R$ 9,00</h4>
                                            <h3>Xis Salada</h3>
                                            <p>
                                                <a href="#" class="btn btn-primary">Pedir</a> <a href="#" class="btn btn-default">Sobre</a>
                                            </p>
                                        </div>           
                                    </div>
                                </div>

                            </div>
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
