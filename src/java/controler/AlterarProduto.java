package controler;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Produto;
import model.ProdutoDAO;


public class AlterarProduto extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AlterarProduto</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AlterarProduto at " + request.getContextPath () + "</h1>");
          try{
            Produto p = new Produto();
            int id_produto = Integer.parseInt(request.getParameter("id_produto"));
            Double preco = Double.parseDouble(request.getParameter("preco"));
            String nome = request.getParameter("nome");
            String unidadeMedida = request.getParameter("unidadeMedida");
            p.setId_produto(id_produto);
            p.setPreco(preco);
            p.setNome(nome);
            p.setUnidadeMedida(unidadeMedida);

             ProdutoDAO pDAO = new ProdutoDAO();
             pDAO.conectar();
             pDAO.alterar(p);
             pDAO.desconectar();

            response.sendRedirect("listar_produto.jsp");
            } catch (Exception e) {
                out.printf("Erro ao alterar Produto" + e);
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
