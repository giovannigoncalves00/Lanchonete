package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Produto;

public final class index2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write(" <head>\n");
      out.write(" <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write(" <title>JSP Page</title>\n");
      out.write(" </head>\n");
      out.write(" <body>\n");
      out.write(" \n");
      out.write("Aplicativos Web com Orientação a Objetos\n");
      out.write("Prof. Wolley W. Silva\n");
      out.write(" ");

 // Recupera os produtos.
 java.util.List<Produto> produtos = (java.util.List<Produto>)
request.getAttribute("produtos");
 if(produtos == null) {
 request.getRequestDispatcher("/ControleProduto?acao=listaProdutos").forward(request,
response);
 }
 
      out.write("\n");
      out.write("\n");
      out.write(" <h1>Lista de Produtos</h1>\n");
      out.write(" <table border=\"0\" cellpadding=\"5\" align=\"center\">\n");
      out.write(" ");

 int contadorColuna=1;
 for(Produto produto : produtos){
 //se é o primeiro produto, cria o inicio da linha
 if(contadorColuna == 1) {
 out.println("<tr>");
 }
 
      out.write("\n");
      out.write(" <br/>\n");
      out.write(" ");
      out.print(produto.getNome());
      out.write("<br/>\n");
      out.write(" <a href=\"ControleCarrinho?acao=addProduto&idProduto=");
      out.print(produto.getIdproduto());
      out.write("\">\n");
      out.write("Comprar</a></td>\n");
      out.write(" ");

 //se é o último produto, exibir o término da linha
 if(contadorColuna == 3){
 out.println("</tr>");
 contadorColuna =0;
 }
 //atualiza o contador de colulas
 contadorColuna ++;

 }//fim do for
 
      out.write("\n");
      out.write(" </table>\n");
      out.write("\n");
      out.write(" </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
