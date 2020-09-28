package model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Array;
import java.sql.CallableStatement;
import java.sql.Types;
import java.util.ArrayList;

public class FormaPagamentoDAO extends DataBaseDAO {

     public void inserir(FormaPagamento formaPagamento) throws Exception{
        String sql = "INSERT INTO formapagamento (id_formaPagamento,tipo) VALUES(?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,formaPagamento.getId_formaPagamento());
        pst.setString(2,formaPagamento.getTipo());
        pst.execute();
    }

    public ArrayList<FormaPagamento> listar() throws Exception{
        ArrayList<FormaPagamento> lista = new ArrayList();

        String sql="SELECT * FROM formapagamento";
        Statement stm = conn.createStatement();
        System.out.println("ok");
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next()) {
            FormaPagamento f = new FormaPagamento();
            f.setId_formaPagamento(rs.getInt("id_formaPagamento"));
            f.setTipo(rs.getString("tipo"));
            lista.add(f);
        }
        return lista;
    }
    public static FormaPagamento carregaPorId(int id) throws Exception{
        FormaPagamento  f = new FormaPagamento();
        String sql="SELECT * FROM formapagamento WHERE id_formaPagamento="+id;
        Statement  stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        if (rs.next()) {
            f.setId_formaPagamento(rs.getInt("id_formaPagamento"));
            f.setTipo(rs.getString("perfil"));
        }
        return f;
    }

    public void excluir(int id) throws Exception{
        String sql = "DELETE FROM formapagamento WHERE id_formaPagamento=?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,id);
        pst.execute();
    }

    public void alterar(FormaPagamento formaPagamento) throws Exception{
        String sql = "UPDATE formapagamento SET tipo=? WHERE id_formaPagamento=?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, formaPagamento.getTipo());
        pst.setInt(2, formaPagamento.getId_formaPagamento());
        pst.execute();
    }
}
