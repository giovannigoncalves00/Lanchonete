package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.ClienteDAO;
import model.Cliente;

public final class form_005falterar_005fcliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String id_cliente = request.getParameter("id_cliente");
    Cliente c = new Cliente();
    try {
        ClienteDAO cDAO = new ClienteDAO();
        cDAO.conectar();
        c = cDAO.carregaPorId(Integer.parseInt(id_cliente));
        cDAO.desconectar();
    } catch (Exception e) {
        out.print("Erro ao carregar Cliente " + e.toString());
    }



      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"_css/style.css\">\n");
      out.write("        <title>Alterar Cliente</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section>\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <h1>Alterar Cliente ID: ");
      out.print(c.getId_cliente());
      out.write("</h1>\n");
      out.write("\n");
      out.write("                <form name=\"form_cliente\" method=\"post\" action=\"AlterarCliente.do\">\n");
      out.write("\n");
      out.write("                    <fieldset> \n");
      out.write("                        <input class=\"box\" name=\"nome\"  type=\"text\" value=\"");
      out.print(c.getNome());
      out.write("\" placeholder=\"Digite um nome\">\n");
      out.write("                    </fieldset>\n");
      out.write("\n");
      out.write("                    <fieldset> \n");
      out.write("                        <input class=\"box\" name=\"cpf\"  type=\"text\" value=\"");
      out.print(c.getCpf());
      out.write("\" placeholder=\"Digite um cpf\">\n");
      out.write("                    </fieldset>\n");
      out.write("\n");
      out.write("                    <fieldset> \n");
      out.write("                        <input class=\"box\" name=\"celular\"  type=\"text\" value=\"");
      out.print(c.getCelular());
      out.write("\" placeholder=\"Digite o celular\">\n");
      out.write("                    </fieldset>\n");
      out.write("\n");
      out.write("                    <fieldset> \n");
      out.write("                        <input class=\"box\" name=\"cidade\"  type=\"text\" value=\"");
      out.print(c.getCidade());
      out.write("\" placeholder=\"Digite a cidade\">\n");
      out.write("                    </fieldset>\n");
      out.write("\n");
      out.write("                    <fieldset> \n");
      out.write("                        <input class=\"box\" name=\"bairro\"  type=\"text\" value=\"");
      out.print(c.getBairro());
      out.write("\" placeholder=\"Digite o bairro\">\n");
      out.write("                    </fieldset>\n");
      out.write("\n");
      out.write("                    <fieldset> \n");
      out.write("                        <input class=\"box\" name=\"quadra\"  type=\"text\" value=\"");
      out.print(c.getQuadra());
      out.write("\" placeholder=\"Digite a quadra\">\n");
      out.write("                    </fieldset>\n");
      out.write("\n");
      out.write("                    <fieldset> \n");
      out.write("                        <input class=\"box\" name=\"email\"  type=\"text\" value=\"");
      out.print(c.getEmail());
      out.write("\" placeholder=\"Digite um email\">\n");
      out.write("                    </fieldset>\n");
      out.write("\n");
      out.write("                    <fieldset>\n");
      out.write("                        <input class=\"enviar\" type=\"submit\" value=\"Salvar\"/>\n");
      out.write("                    </fieldset>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    </body>\n");
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
