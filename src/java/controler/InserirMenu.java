    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controler;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Menu;
import model.MenuPerfilDAO;

public class InserirMenu extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet InserirMenu</title>");  
            out.println("</head>");
            out.println("<body>");

            Menu m = new Menu();
            String titulo = request.getParameter("titulo");
            String link = request.getParameter("link");
            String icone = request.getParameter("icone");

            if(!titulo.isEmpty()){
                m.setTitulo(titulo);

            }else{
                out.println("<script type='text/javascript'>");
                out.println("alert('O campo titulo deve ser preenchido!');");
                out.println("history.back();");
                out.println("</script>");
            }
             if(!link.isEmpty()){

                m.setLink(link);

            }else{
                out.println("<script type='text/javascript'>");
                out.println("alert('O campo link deve ser preenchido!');");
                out.println("history.back();");
                out.println("</script>");

            }
              if(!icone.isEmpty()){

                m.setIcone(icone);
            }else{
                out.println("<script type='text/javascript'>");
                out.println("alert('O campo icone deve ser preenchido!');");
                out.println("history.back();");
                out.println("</script>");
                
            }try {
                MenuPerfilDAO mDAO = new MenuPerfilDAO();
                mDAO.conectar();
                mDAO.inserir(m);
                mDAO.desconectar();
                response.sendRedirect("listar_menu.jsp");
            } catch (Exception e) {
                out.print("Erro ao inserir Menu: "+e);
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
