package controler;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.FormaPagamento;
import model.FormaPagamentoDAO;
import model.Pagamento;
@WebServlet(name="InserirPagamento.java", urlPatterns = {"/InserirPagamento.do"})
public class InserirPagamento extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet InserirPagamento</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet InserirPagamento at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");

            Pagamento p = new Pagamento();
            int id_pagamento = Integer.parseInt(request.getParameter("id_pagamento"));
          //  Date data = (Date) (request.getParameter("data"));
            Double valor = Double.parseDouble(request.getParameter("valor"));
          //  FormaPagamento formaPagamento = FormaPagamentoDAO.carregaPorId(request.getParameter("id_FormaPagamento"));

             if(id_pagamento==0){
                p.setId_pagamento(id_pagamento);
            }else{
                out.println("<script type='text/javascript'>");
                out.println("alert('O campo id_pagamento deve ser preenchido!');");
                out.println("history.back();");
                out.println("</script>");
            }

          /*  if(!data.equals(null)){
                p.setData(data);
            }else{
                out.println("<script type='text/javascript'>");
                out.println("alert('O campo data deve ser preenchido!');");
                out.println("history.back();");
                out.println("</script>");
            } */
        /*    if(!formaPagamento.equals(null)){
                p.setFormaPagamento(formaPagamento);
            }else{
                out.println("<script type='text/javascript'>");
                out.println("alert('O campo Forma de Pagamento deve ser preenchido!');");
                out.println("history.back();");
                out.println("</script>");
            }
            */
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
