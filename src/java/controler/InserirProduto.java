package controler;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Produto;
import model.ProdutoDAO;
@WebServlet(name="InserirProduto.java", urlPatterns = {"/InserirProduto.do"})
public class InserirProduto extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet InserirProduto</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet InserirProduto at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");

            Produto p = new Produto();
            int id_produto = Integer.parseInt(request.getParameter("id_produto"));
            Double preco = Double.parseDouble(request.getParameter("preco"));
            String nome = request.getParameter("nome");
            String unidadeMedida = request.getParameter("unidadeMedida");


            if(id_produto==0){
                p.setId_produto(id_produto);
            }else{
                out.println("<script type='text/javascript'>");
                out.println("alert('O campo id_produto deve ser preenchido!');");
                out.println("history.back();");
                out.println("</script>");
            }
            if(!preco.equals(0.0)){
                p.setPreco(preco);
            }else{
                out.println("<script type='text/javascript'>");
                out.println("alert('O campo preço deve ser preenchido!');");
                out.println("history.back();");
                out.println("</script>");
            }
            if(!nome.isEmpty()){
                p.setNome(nome);
            }else{
                out.println("<script type='text/javascript'>");
                out.println("alert('O campo nome deve ser preenchido!');");
                out.println("history.back();");
                out.println("</script>");
            }
            if(!unidadeMedida.isEmpty()){
                p.setUnidadeMedida(unidadeMedida);
            }else{
                out.println("<script type='text/javascript'>");
                out.println("alert('O campo unidade de medida deve ser preenchido!');");
                out.println("history.back();");
                out.println("</script>");
            }
            try {
                ProdutoDAO pDAO = new ProdutoDAO();
                pDAO.conectar();
                pDAO.inserir(p);
                pDAO.desconectar();
                response.sendRedirect("login.jsp");
            } catch (Exception e) {
                out.print("Erro ao inserir Produto: "+e);
            }
            
            out.println("</body>");
            out.println("</html>");
        } finally{ 
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
