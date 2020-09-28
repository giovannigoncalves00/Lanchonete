package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ClienteDAO extends DataBaseDAO {

    public void inserir(Cliente cliente) throws Exception {
        String sql = "INSERT INTO cliente(cpf,celular,bairro,quadra,cidade,nome,senha,email) "
                + "VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, cliente.getCpf());
        pst.setString(2, cliente.getCelular());
        pst.setString(3, cliente.getBairro());
        pst.setString(4, cliente.getQuadra());
        pst.setString(5, cliente.getCidade());
        pst.setString(6, cliente.getNome());
        pst.setString(7, cliente.getSenha());
        pst.setString(8, cliente.getEmail());
        pst.execute();
    }

    public ArrayList<Cliente> listar() throws Exception {
        ArrayList<Cliente> lista = new ArrayList();

        String sql = "SELECT * FROM cliente";
        Statement stm = conn.createStatement();
        System.out.println("ok");
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next()) {
            Cliente c = new Cliente();
            c.setIdcliente(rs.getInt("idcliente"));
            c.setCpf(rs.getString("cpf"));
            c.setCelular(rs.getString("celular"));
            c.setBairro(rs.getString("bairro"));
            c.setQuadra(rs.getString("quadra"));
            c.setCidade(rs.getString("cidade"));
            c.setNome(rs.getString("nome"));
            c.setSenha(rs.getString("senha"));
            c.setEmail(rs.getString("email"));
            lista.add(c);
        }
        return lista;
    }

    public Cliente carregaPorId(int idcliente) throws Exception {
        Cliente c = new Cliente();

        String sql = "SELECT * FROM cliente";
        Statement stm = conn.createStatement();
        System.out.println("ok");
        ResultSet rs = stm.executeQuery(sql);
        if (rs.next()) {
            c.setIdcliente(rs.getInt("idcliente"));
            c.setCpf(rs.getString("cpf"));
            c.setCelular(rs.getString("celular"));
            c.setBairro(rs.getString("bairro"));
            c.setQuadra(rs.getString("quadra"));
            c.setCidade(rs.getString("cidade"));
            c.setNome(rs.getString("nome"));
            c.setSenha(rs.getString("senha"));
            c.setEmail(rs.getString("email"));
        }
        return c;
    }

    public boolean isExiste(String login) throws Exception {

        String sql = "SELECT * FROM usuario WHERE login='" + login + "'";
        Statement stm = conn.createStatement();
        System.out.println("ok");
        ResultSet rs = stm.executeQuery(sql);
        if (rs.next()) {
            return true;

        }
        return false;
    }

    public void excluir(int idcliente) throws Exception {
        String sql = "DELETE FROM cliente WHERE idcliente=?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, idcliente);
        pst.execute();
    }

    public void alterar(Cliente cliente) throws Exception {
        String sql = "UPDATE cliente SET cpf=?,celular=?,quadra=?,cidade=?,nome=?,senha=?,email=?, WHERE idcliente=?";

        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, cliente.getCpf());
        pst.setString(2, cliente.getCelular());
        pst.setString(3, cliente.getQuadra());
        pst.setString(4, cliente.getCidade());
        pst.setString(5, cliente.getNome());
        pst.setString(6, cliente.getSenha());
        pst.setString(7, cliente.getEmail());
        pst.setInt(9, cliente.getIdcliente());
        pst.execute();
    }

    public Cliente logar(String email, String senha) throws Exception {
        Cliente c = new Cliente();
        //  String sql="SELECT idcliente,nome,login,senha,MD5('"+senha+"') as campo_senha FROM usuario WHERE login='"+login+"'";
        String sql = "SELECT idcliente,cpf,email,celular,bairro,quadra,cidade,nome,senha,('" + senha + "') as campo_senha FROM cliente WHERE  email='" + email + "'";

        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        if (rs.next()) {
            if (rs.getString("senha").equals(rs.getString("campo_senha"))) {
                c.setIdcliente(rs.getInt("idcliente"));
                c.setCpf(rs.getString("cpf"));
                c.setCelular(rs.getString("celular"));
                c.setBairro(rs.getString("bairro"));
                c.setQuadra(rs.getString("quadra"));
                c.setCidade(rs.getString("cidade"));
                c.setNome(rs.getString("nome"));
                c.setSenha(rs.getString("senha"));
                c.setEmail(rs.getString("email"));


                /*                PerfilDAO pDAO = new PerfilDAO();
                pDAO.conectar();
                Perfil p = pDAO.carregaPorId(rs.getInt("id_perfil") + "");
                pDAO.desconectar();

                u.setPerfil(p); */
            }
        }
        return c;
    }
    public boolean isExisteAltera(String email,int idcliente) throws Exception{
        String sql="SELECT * FROM cliente WHERE email='"+email+"' AND idcliente<>"+idcliente;
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        if(rs.next()) {  
            return true;
        }
        return false;
    }
}
