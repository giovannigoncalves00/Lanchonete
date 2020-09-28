package model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ProdutoDAO extends DataBaseDAO{
    public void inserir (Produto produto) throws Exception{
        String sql = "INSERT INTO produto (idproduto,preco,nome,unidadeMedida) VALUES(?,?,?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, produto.getIdproduto());
        pst.setDouble(2, produto.getPreco());
        pst.setString(3, produto.getNome());
        pst.setString(4, produto.getUnidadeMedida());
        pst.execute();

    }

     public ArrayList<Produto> listar() throws Exception{
        ArrayList<Produto> lista = new ArrayList();
        String sql="SELECT * FROM produto ";
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next()) {
            Produto p = new Produto();
            p.setId_produto(rs.getInt("idproduto"));
            p.setPreco(rs.getDouble("preco"));
            p.setNome(rs.getString("nome"));
            p.setUnidadeMedida(rs.getString("unidadeMedida"));
   
            lista.add(p);
        }
        return lista;
    }
      public static Produto carregaPorId(int id) throws Exception{
        Produto p = new Produto();
        String sql="SELECT * FROM produto WHERE id_produto="+id;
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        if (rs.next()) {
             p.setId_produto(rs.getInt("idproduto"));
            p.setPreco(rs.getDouble("preco"));
            p.setNome(rs.getString("nome"));
            p.setUnidadeMedida(rs.getString("unidadeMedida"));
        }
        return p;
    }
      public void alterar(Produto produto) throws Exception{
        String sql = "UPDATE produto SET preco=?,nome=?,unidadeMedida=? WHERE idproduto=?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setDouble(1, produto.getPreco());
        pst.setString(2, produto.getNome());
        pst.setString(3, produto.getUnidadeMedida());
        pst.setInt(4, produto.getIdproduto());
        pst.execute();
    }

    public void excluir(String id) throws Exception{
        String sql = "DELETE FROM produto WHERE idproduto=?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, Integer.parseInt(id));
        pst.execute();
    }
}
