package controler;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Funcionario;
import model.FuncionarioDAO;
import model.Pedido;
import model.PedidoDAO;
import model.Perfil;
import model.PerfilDAO;
@WebServlet(name="InserirFuncionario.java", urlPatterns = {"/InserirFuncionario.do"})
public class InserirFuncionario extends HttpServlet {
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Inserir Funcionario</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Inserir Funcionario at " + request.getContextPath() + "</h1>");
          //  out.println("</body>");
          //  out.println("</html>");

            Funcionario f = new Funcionario();
            int id_funcionario =  Integer.parseInt(request.getParameter("id_funcionario"));
            String nome = request.getParameter("nome");
            String usuario = request.getParameter("usuário");
            String senha = request.getParameter("senha");
            Perfil perfil = PerfilDAO.carregaPorId(request.getParameter("id_perfil"));
            Pedido pedido = PedidoDAO.carregaPorId(Integer.parseInt(request.getParameter("pedido")));

            if(id_funcionario==0){
                f.setId_funcionario(id_funcionario);
            }else{
                out.println("<script type='text/javascript'>");
                out.println("alert('O campo id_funcionario deve ser preenchido!');");
                out.println("history.back();");
                out.println("</script>");
            }
            if(!nome.isEmpty()){
                f.setNome(nome);
            }else{
                out.println("<script type='text/javascript'>");
                out.println("alert('O campo nome deve ser preenchido!');");
                out.println("history.back();");
                out.println("</script>");
            }
            if(!usuario.isEmpty()){
                f.setUsuario(usuario);
            }else{
                out.println("<script type='text/javascript'>");
                out.println("alert('O campo usuário deve ser preenchido!');");
                out.println("history.back();");
                out.println("</script>");
            }
            if(!senha.isEmpty()){
                f.setSenha(senha);
            }else{
                out.println("<script type='text/javascript'>");
                out.println("alert('O campo senha deve ser preenchido!');");
                out.println("history.back();");
                out.println("</script>");
            }
            if(!perfil.equals(0)){
                f.setPerfil(perfil);
            }else{
                out.println("<script type='text/javascript'>");
                out.println("alert('O campo perfil deve ser preenchido!');");
                out.println("history.back();");
                out.println("</script>");
            }
            if(!pedido.equals(0)){
                f.setPedido(pedido);
            }else{
                out.println("<script type='text/javascript'>");
                out.println("alert('O campo pedido deve ser preenchido!');");
                out.println("history.back();");
                out.println("</script>");
            }

            try {
                FuncionarioDAO fDAO = new FuncionarioDAO();
                fDAO.conectar();
                fDAO.inserir(f);
                fDAO.desconectar();
                response.sendRedirect("listar_funcionario.jsp");
            } catch (Exception e) {
                out.print("Erro ao inserir Funcionário: "+e);
            }
            out.println("<a>Deu certo </a>");
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(InserirFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(InserirFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
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
