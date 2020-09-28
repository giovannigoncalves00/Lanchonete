package model;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class PedidoDAO extends DataBaseDAO{
    public void inserir(Pedido pedido) throws Exception{
        String sql = "INSERT INTO pedido (id_pedido,data,preco,quantidade,Pagamento_id_pagamento,Produto_id_produto)"
                + " VALUES(?,?,?,?,?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,pedido.getId_pedido());
        pst.setDate(2, (Date) pedido.getData());
        pst.setDouble(3,pedido.getPreco());
        pst.setInt(4,pedido.getQuantidade());
        pst.setInt(5,pedido.getPagamento().getId_pagamento());
        pst.setInt(6,pedido.getProduto().getIdproduto());
        pst.execute();
    }

    public ArrayList<Pedido> listar() throws Exception{
        ArrayList<Pedido> lista = new ArrayList();

        String sql="SELECT * FROM pedido";
        Statement stm = conn.createStatement();
        System.out.println("ok");
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next()) {
            Pedido p = new Pedido();
            p.setId_pedido(rs.getInt("id_pedido"));
            p.setData(rs.getDate("data"));
            p.setPreco(rs.getDouble("preco"));
            p.setQuantidade(rs.getInt("quantidade"));
            p.setPagamento(PagamentoDAO.carregaPorId(rs.getInt("id_formaPagamento")));
            p.setProduto(ProdutoDAO.carregaPorId(rs.getInt("id_formaPagamento")));
            lista.add(p);
        }
        return lista;
    }
    public static Pedido carregaPorId(int id) throws Exception{
        Pedido p = new Pedido();
        String sql="SELECT * FROM pedido WHERE id_pedido="+id;
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        if (rs.next()) {
            p.setId_pedido(rs.getInt("id_pedido"));
            p.setData(rs.getDate("data"));
            p.setPreco(rs.getDouble("preco"));
            p.setQuantidade(rs.getInt("quantidade"));
            p.setPagamento(PagamentoDAO.carregaPorId(rs.getInt("id_formaPagamento")));
            p.setProduto(ProdutoDAO.carregaPorId(rs.getInt("id_formaPagamento")));

        }
        return p;
    }

    public void excluir(String id) throws Exception{
        String sql = "DELETE FROM pedido WHERE id_pedido=?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, Integer.parseInt(id));
        pst.execute();
    }

    public void alterar(Pagamento pagamento) throws Exception{
        String sql = "UPDATE pedido SET data=?,preco=?,quantidade=?,Pagamento_id_pagamento=?,Produto_id_produto=? WHERE id_pagamento=?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setDouble(1, pagamento.getValor());
        pst.setDouble(1, pagamento.getValor());
        pst.setDouble(1, pagamento.getValor());
        pst.setDouble(1, pagamento.getValor());
        pst.setInt(2, pagamento.getId_pagamento());
        pst.execute();
    }
}
