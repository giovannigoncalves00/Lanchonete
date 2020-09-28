package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.PedidoProduto;
import model.CarrinhoDeCompra;

public final class pedido_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" <title>Carrinho de Compras</title>\n");
      out.write(" </head>\n");
      out.write(" <body>\n");
      out.write(" <h1>Carrinho de Compras!</h1>\n");
      out.write(" <table border=\"1\" cellpadding=\"2\" >\n");
      out.write(" <tr>\n");
      out.write(" <td bgcolor=\"#000088\"><font color=\"white\">Excluir</font></td>\n");
      out.write(" <td bgcolor=\"#000088\"><font color=\"white\">Item</font></td>\n");
      out.write(" <td bgcolor=\"#000088\"><font color=\"white\">QTD</font></td>\n");
      out.write(" <td bgcolor=\"#000088\"><font color=\"white\">Preço Unitário</font></td>\n");
      out.write(" <td bgcolor=\"#000088\"><font color=\"white\">Total Item</font></td>\n");
      out.write(" <td bgcolor=\"#000088\"><font color=\"white\">+1</font></td>\n");
      out.write(" </tr>\n");
      out.write(" ");

 //recupera os produtos do carrinho da sessao
 CarrinhoDeCompra carrinho = (CarrinhoDeCompra) session.getAttribute("carrinho");
 for(PedidoProduto item : carrinho.getItens()){
 
      out.write("\n");
      out.write(" <tr>\n");
      out.write(" <td><a\n");
      out.write("href=\"ControleCarrinho?acao=removeProduto&idProduto=");
      out.print(item.getProduto().getIdproduto());
      out.write("\">\n");
      out.write("X</td>\n");
      out.write(" <td>");
      out.print(item.getProduto().getNome() );
      out.write("</td>\n");
      out.write(" <td>");
      out.print(item.getQuantidade() );
      out.write("</td>\n");
      out.write(" <td><a\n");
      out.write("href=\"ControleCarrinho?acao=addProduto&idProduto=");
      out.print(item.getProduto().getIdproduto());
      out.write("\">+</a\n");
      out.write("></td>\n");
      out.write(" </tr>\n");
      out.write("\n");
      out.write(" ");

 }
 
      out.write("\n");
      out.write("\n");
      out.write(" </table>\n");
      out.write("\n");
      out.write(" <strong>Valor Total: </strong><br/>\n");
      out.write("\n");
      out.write(" <a href=\"index.jsp\"> Continue comprando</a><br/>\n");
      out.write("Aplicativos Web com Orientação a Objetos\n");
      out.write("Prof. Wolley W. Silva\n");
      out.write(" <a href=\"ControleCarrinho?acao=cancelaCompra\">Cancelar comprar</a>\n");
      out.write(" </body>\n");
      out.write("</html>\n");
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
