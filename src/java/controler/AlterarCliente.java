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
import model.Pedido;
import model.PedidoDAO;

@WebServlet(name="AlterarCliente.java", urlPatterns = {"/alterar_cliente.do"})
public class AlterarCliente extends HttpServlet {
   

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AlterarCliente</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AlterarCliente at " + request.getContextPath () + "</h1>");
            

           

            int idcliente =  Integer.parseInt(request.getParameter("idcliente"));
            String cpf =  request.getParameter("cpf");
            String celular =  request.getParameter("celular");
            String bairro =  request.getParameter("bairro");
            String quadra =  request.getParameter("quadra");
            String cidade =  request.getParameter("cidade");
            String nome =  request.getParameter("nome");
            String senha =  request.getParameter("senha");
            String email =  request.getParameter("email");

            Cliente c = new Cliente();
            c.setIdcliente(idcliente);
            
            if(!nome.isEmpty()){
                c.setNome(nome);
            }else{
                out.println("<script type='text/javascript'>");
                out.println("alert('O campo Nome deve ser preenchido!');");
                out.println("history.back();");
                out.println("</script>");
            }
            if(!cpf.isEmpty()){
                c.setCpf(cpf);
            }else{
                out.println("<script type='text/javascript'>");
                out.println("alert('O campo CPF deve ser preenchido!');");
                out.println("history.back();");
                out.println("</script>");
            }
            if(!celular.isEmpty()){
                c.setCelular(celular);
            }else{
                out.println("<script type='text/javascript'>");
                out.println("alert('O campo Celular deve ser preenchido!');");
                out.println("history.back();");
                out.println("</script>");
            }
            if(!cidade.isEmpty()){
                c.setCidade(cidade);
            }else{
                out.println("<script type='text/javascript'>");
                out.println("alert('O campo Cidade deve ser preenchido!');");
                out.println("history.back();");
                out.println("</script>");
            }
            if(!bairro.isEmpty()){
                c.setBairro(bairro);
            }else{
                out.println("<script type='text/javascript'>");
                out.println("alert('O campo Bairro deve ser preenchido!');");
                out.println("history.back();");
                out.println("</script>");
            }
            if(!email.isEmpty()){
                c.setEmail(email);
            }else{
                out.println("<script type='text/javascript'>");
                out.println("alert('O campo Email deve ser preenchido!');");
                out.println("history.back();");
                out.println("</script>");
            }
            try{
            ClienteDAO cDAO = new ClienteDAO();
            cDAO.conectar();
                if(cDAO.isExisteAltera(email,idcliente)){
                    out.println("<script type='text/javascript'>");
                    out.println("alert('Este Login já está cadastrado!');");
                    out.println("history.back();");
                    out.println("</script>");
                    
                }else{
                    cDAO.alterar(c);
                    response.sendRedirect("listar_cliente.jsp");
                }
            cDAO.desconectar();
            
            
            }catch(Exception e){
                out.println("Erro ao alterar Cliente"+e.getMessage());
            }

        
            out.println("</body>");
            out.println("</html>");
            
            } finally { 
            out.close();
        }
    
            
    }   // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
