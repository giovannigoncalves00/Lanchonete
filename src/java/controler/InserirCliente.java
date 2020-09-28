package controler;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cliente;
import model.ClienteDAO;

@WebServlet(name = "InserirCliente.java", urlPatterns = {"/inserir_cliente.do"})
public class InserirCliente extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {

            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet InserirCliente</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet InserirCliente at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            try {
                Cliente c = new Cliente();
                String nome = request.getParameter("nome");
                String cpf = request.getParameter("cpf");
                String celular = request.getParameter("celular");
                String bairro = request.getParameter("bairro");
                String quadra = request.getParameter("quadra");
                String cidade = request.getParameter("cidade");
                String senha = request.getParameter("senha");
                String email = request.getParameter("email");

                if (!nome.isEmpty()) {
                    c.setNome(nome);
                } else {
                    out.println("<script type='text/javascript'>");
                    out.println("alert('O campo Nome deve ser preenchido!');");
                    out.println("history.back();");
                    out.println("</script>");
                }
                if (!cpf.isEmpty()) {
                    c.setCpf(cpf);
                } else {
                    out.println("<script type='text/javascript'>");
                    out.println("alert('O campo cpf deve ser preenchido!');");
                    out.println("history.back();");
                    out.println("</script>");
                }
                if (!celular.isEmpty()) {
                    c.setCelular(celular);
                } else {
                    out.println("<script type='text/javascript'>");
                    out.println("alert('O campo celular deve ser preenchido!');");
                    out.println("history.back();");
                    out.println("</script>");
                }
                if (!bairro.isEmpty()) {
                    c.setBairro(bairro);
                } else {
                    out.println("<script type='text/javascript'>");
                    out.println("alert('O campo bairro deve ser preenchido!');");
                    out.println("history.back();");
                    out.println("</script>");
                }
                if (!quadra.isEmpty()) {
                    c.setCidade(cidade);
                } else {
                    out.println("<script type='text/javascript'>");
                    out.println("alert('O campo quadra deve ser preenchido!');");
                    out.println("history.back();");
                    out.println("</script>");
                }
                if (!cidade.isEmpty()) {
                    c.setCidade(cidade);
                } else {
                    out.println("<script type='text/javascript'>");
                    out.println("alert('O campo cidade deve ser preenchido!');");
                    out.println("history.back();");
                    out.println("</script>");
                }
                if (!senha.isEmpty()) {
                    c.setSenha(senha);
                } else {
                    out.println("<script type='text/javascript'>");
                    out.println("alert('O campo senha deve ser preenchido!');");
                    out.println("history.back();");
                    out.println("</script>");
                }
                if (!email.isEmpty()) {
                    c.setEmail(email);
                } else {
                    out.println("<script type='text/javascript'>");
                    out.println("alert('O campo email deve ser preenchido!');");
                    out.println("history.back();");
                    out.println("</script>");
                }

                try {
                    ClienteDAO cDAO = new ClienteDAO();
                    cDAO.conectar();
                    cDAO.inserir(c);
                    response.sendRedirect("listar_cliente.jsp");
                    cDAO.desconectar();

                } catch (Exception e) {
                    out.print("Erro ao inserir Cliente: " + e.getMessage());
                }
            } catch (Exception e) {
                out.println("Erro ao Inserir Cliente" + e.getMessage());
            }
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
