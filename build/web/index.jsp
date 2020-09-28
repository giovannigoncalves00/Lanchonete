<%-- 
    Document   : html.jsp
    Created on : 26/06/2016, 20:41:03
    Author     : giova
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Xis do Tche</title>

    <!-- Bootstrap Core CSS -->
    <link rel="stylesheet" href="inicial/css/bootstrap.min.css" type="text/css">

    <!-- Custom Fonts -->
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="inicial/font-awesome/css/font-awesome.min.css" type="text/css">

    <!-- Plugin CSS -->
    <link rel="stylesheet" href="inicial/css/magnific-popup.css" type="text/css">

    <!-- Custom CSS -->
    <link rel="stylesheet" href="inicial/css/creative.css" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body id="page-top">

    <nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand page-scroll" href="#page-top">Xis do Tche</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a class="page-scroll" href="#about">Login</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#services">Delivery</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#portfolio">Fotos</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#contact">Contato</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>

    <header>
        <div class="header-content">
            <div class="header-content-inner">
                <img src="inicial/img/icons/X3.png" alt="">
                <hr>
                <p>No Xis do Tchê você encontra o melhor sanduéche gaécho do Brasil. Crie sua conta e peça seu pedido online</p>
                <a href="#about" class="btn btn-primary btn-xl page-scroll">Saiba Mais</a>
            </div>
        </div>
    </header>

    <section class="bg-primary" id="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <h2 class="section-heading">Temos tudo que você precisa</h2>
                    <hr class="light">
                    <p class="text-faded">Com uma conta em nosso website você podera fazer seu pedido sem sair de casa. É muito fácil, basta clicar abaixo e fazer uma conta para você. Caso já tenha uma conta, é so fazer o pedido.</p>
                    <a href="login.jsp" class="page-scroll btn btn-default btn-xl sr-button">Login</a>
                </div>
            </div>
        </div>
    </section>

    <section id="services">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2 class="section-heading">Delivery</h2>
                    <hr class="primary">
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-lg-3 col-md-6 text-center">
                    <div class="service-box">
                        <img src="inicial/img/icons/1.png" alt="">
                        <h3>Cadastro</h3>
                        <p class="text-muted">Com uma conta em nosso WebSite você pode fazer seu pedido de onde quiser.</p>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 text-center">
                    <div class="service-box">
                        <img src="inicial/img/icons/2.png" alt="">
                        <h3>Cardapio</h3>
                        <p class="text-muted">Todos os nossos deliciosos sanduiches estão esperando por você!</p>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 text-center">
                    <div class="service-box">
                        <img src="inicial/img/icons/3.png" alt="">
                        <h3>Pagamento</h3>
                        <p class="text-muted">Pague da maneira que você achar melhor.</p>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 text-center">
                    <div class="service-box">
                       <img src="inicial/img/icons/4.png" alt="">
                        <h3>Entrega</h3>
                        <p class="text-muted">Você recebera seu lanche quentinho baTchê!</p>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <section class="no-padding" id="portfolio">
        <div class="container-fluid">
            <div class="row no-gutter popup-gallery">
                <div class="col-lg-4 col-sm-6">
					<img src="inicial/img/portfolio/thumbnails/1.jpg" class="img-responsive" alt="">
                </div>
                <div class="col-lg-4 col-sm-6">
					<img src="inicial/img/portfolio/thumbnails/2.jpg" class="img-responsive" alt="">
                </div>
                <div class="col-lg-4 col-sm-6">
					<img src="inicial/img/portfolio/thumbnails/3.jpg" class="img-responsive" alt="">
                </div>
                <div class="col-lg-4 col-sm-6">
					<img src="inicial/img/portfolio/thumbnails/4.jpg" class="img-responsive" alt="">
                </div>
                <div class="col-lg-4 col-sm-6">
					<img src="inicial/img/portfolio/thumbnails/5.jpg" class="img-responsive" alt="">
                </div>
                <div class="col-lg-4 col-sm-6">
					<img src="inicial/img/portfolio/thumbnails/6.jpg" class="img-responsive" alt="">
                </div>
            </div>
        </div>
    </section>

    <aside class="bg-dark">
        <div class="container text-center">
            <div class="call-to-action">
                <h2>Falça seu pedido agora<h2>
                <a href="cardapio.jsp" class="btn btn-default btn-xl sr-button">Pedir</a>
            </div>
        </div>
    </aside>

    <section id="contact">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <h2 class="section-heading">O melhor Sanduíche gaucho</h2>
                    <hr class="primary">
                    <p>Estamos localizados no LOTE 02 LOJA 06 - St. A Norte Qna 11, 2 - Taguatinga, Brasília – DF.</p>
                </div>
                <div class="col-lg-4 col-lg-offset-2 text-center">
                    <i class="fa fa-phone fa-3x sr-contact"></i>
                    <p>(61)3435-0015<p>
                 </div>
                <div class="col-lg-4 text-center">
                    <i class="fa fa-envelope-o fa-3x sr-contact"></i>
                    <p><a href="mailto:your-email@your-domain.com">facebook.com/xisdotche</a></p>
                </div>
            </div>
        </div>
    </section>

    <!-- jQuery -->
    <script src="inicial/js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="inicial/js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="inicial/js/scrollreveal.min.js"></script>
    <script src="inicial/js/jquery.easing.min.js"></script>
    <script src="inicial/js/jquery.fittext.js"></script>
    <script src="inicial/js/jquery.magnific-popup.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="inicial/js/creative.js"></script>

</body>

</html>-