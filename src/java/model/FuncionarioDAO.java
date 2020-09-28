package model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class FuncionarioDAO extends DataBaseDAO {
    public void inserir (Funcionario funcionario) throws Exception{
        String sql = "INSERT INTO funcionario(id_funcionario,nome,usuario,senha,Perfil_id,Pedido_id_pedido)) "
                + "VALUES (?,?,?,?,?,?,?,MD5(?),?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,funcionario.getId_funcionario());
        pst.setString(2,funcionario.getNome());
        pst.setString(3,funcionario.getUsuario());
        pst.setString(4,funcionario.getSenha());
        pst.setInt(5,funcionario.getPerfil().getId());
        pst.setInt(6,funcionario.getPedido().getId_pedido());
        pst.execute();
    }
    public ArrayList<Funcionario> listar() throws Exception{
        ArrayList<Funcionario> lista = new ArrayList();

        String sql="SELECT * FROM funcionario";
        Statement stm = conn.createStatement();
        System.out.println("ok");
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next()) {
            Funcionario f = new Funcionario();
            f.setId_funcionario(rs.getInt("id_funcionario"));
            f.setNome(rs.getString("nome"));
            f.setUsuario(rs.getString("usuairo"));
            f.setSenha(rs.getString("senha"));
            f.setPerfil(PerfilDAO.carregaPorId(rs.getString("id_perfil")));
            f.setPedido(PedidoDAO.carregaPorId(rs.getInt("id_pedido")));
            lista.add(f);
        }
        return lista;
}
     public Funcionario carregaPorId(String id) throws Exception{
        Funcionario f = new Funcionario();

        String sql="SELECT * FROM funcionario";
        Statement stm = conn.createStatement();
        System.out.println("ok");
        ResultSet rs = stm.executeQuery(sql);
        if (rs.next()) {
            f.setId_funcionario(rs.getInt("id_funcionario"));
            f.setNome(rs.getString("nome"));
            f.setSenha(rs.getString("senha"));
            f.setPerfil(PerfilDAO.carregaPorId(rs.getString("id_perfil")));
            f.setPedido(PedidoDAO.carregaPorId(rs.getInt("id_pedido")));


        }
        return f;

}
        public boolean isExiste(String id) throws Exception{

        String sql="SELECT * FROM funcionario WHERE id_funcionario='"+id+"'";
        Statement stm = conn.createStatement();
        System.out.println("ok");
        ResultSet rs = stm.executeQuery(sql);
        if (rs.next()) {
          return true;

        }
        return false;
        }
        public void excluir(String id) throws Exception{
        String sql = "DELETE FROM funcionario WHERE id_funcionario=?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, Integer.parseInt(id));
        pst.execute();
        }

        public void alterar(Funcionario f) throws Exception{
        String sql = "UPDATE funcionario SET nome=?, usuario=?, senha=? ,Perfil_id=?, Pedido_id_pedido=? WHERE id_funcionario=?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, f.getNome());
        pst.setString(2, f.getUsuario());
        pst.setString(3, f.getSenha());
        pst.setInt(4, f.getPerfil().getId());
        pst.setInt(5, f.getPedido().getId_pedido());
        pst.setInt(6, f.getId_funcionario());
        pst.execute();
        }
}
