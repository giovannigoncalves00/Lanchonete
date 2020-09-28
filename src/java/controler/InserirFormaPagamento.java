package controler;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.FormaPagamento;
import model.FormaPagamentoDAO;
@WebServlet(name="InserirFormaPagamento.java", urlPatterns = {"/InserirFormaPagamento.do"})

public class InserirFormaPagamento extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Inserir FormaPagamento</title>");  
            out.println("</head>");
            out.println("<body>");

            FormaPagamento fp = new FormaPagamento();
            int id_formaPagamento = Integer.parseInt(request.getParameter("id_formaPagamento"));
            String tipo = request.getParameter("tipo");

            if(id_formaPagamento != 0){
                fp.setId_formaPagamento(id_formaPagamento);
            }else{
                out.println("<script type='text/javascript'>");
                out.println("alert(O campo id_formPagamento deve ser preenchido!);");
                out.println("history.back();");
                out.println("</script>");
            }
            if(!tipo.isEmpty()){
                fp.setTipo(tipo);
            }else{
                out.println("<script type='text/javascript'>");
                out.println("alert(O campo tipo deve ser preenchido!);");
                out.println("history.back();");
                out.println("</script>");
            }
            
            try{
                FormaPagamentoDAO fpDAO = new FormaPagamentoDAO();
                fpDAO.conectar();
                fpDAO.inserir(fp);
                fpDAO.desconectar();
                response.sendRedirect("listar_formaPagamento.jsp");
            } catch (Exception e){
                out.print("Erro ao inserir Forma de Pagamento: "+e);
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
