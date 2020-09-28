package controler;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.FormaPagamento;
import model.FormaPagamentoDAO;
import model.Pagamento;
import model.PagamentoDAO;

public class AlterarPagamento extends HttpServlet {
   

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Alterar Pagamento</title>");  
            out.println("</head>");
            out.println("<body>");

          try{
            Pagamento p = new Pagamento();
            int id_pagamento = Integer.parseInt(request.getParameter("id_pagamento"));
            Date data =  Date.valueOf(request.getParameter("data"));
            Double valor = Double.parseDouble(request.getParameter("valor"));
            FormaPagamento fp = FormaPagamentoDAO.carregaPorId(Integer.parseInt(request.getParameter("id_formapagamento")));

            p.setId_pagamento(id_pagamento);
            p.setData(data);
            p.setValor(valor);
            p.setFormaPagamento(fp);
            
            FormaPagamentoDAO fpDAO = new FormaPagamentoDAO();
            fpDAO.conectar();
            fpDAO.alterar(fp);
            fpDAO.desconectar();

            response.sendRedirect("listar_pagamento.jsp");
            }catch(Exception e){
                out.println("Erro ao alterar Pagamento");
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

