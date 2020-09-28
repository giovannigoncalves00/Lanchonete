package controler;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Funcionario;
import model.FuncionarioDAO;
import model.Pedido;
import model.PedidoDAO;
import model.Perfil;
import model.PerfilDAO;


public class AlterarFuncionario extends HttpServlet {
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AlterarFuncionario</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AlterarFuncionario at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
       try{


            int id_funcionario =  Integer.parseInt(request.getParameter("id_funcionario"));
            String nome = request.getParameter("nome");
            String usuario = request.getParameter("usuário");
            String senha = request.getParameter("senha");
            Perfil perfil = PerfilDAO.carregaPorId(request.getParameter("id_perfil"));
            Pedido pedido = PedidoDAO.carregaPorId(Integer.parseInt(request.getParameter("pedido")));

            Funcionario f = new Funcionario();
            f.setId_funcionario(id_funcionario);
            f.setNome(nome);
            f.setUsuario(usuario);
            f.setSenha(senha);
            f.setPerfil(perfil);
            f.setPedido(pedido);

            FuncionarioDAO fDAO = new FuncionarioDAO();
            fDAO.conectar();
            fDAO.alterar(f);
            fDAO.desconectar();
            response.sendRedirect("listar_funcionario.jsp");
         }catch(Exception e){
                out.println("Erro ao alterar Cliente");
            }

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
