package model;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class PagamentoDAO extends DataBaseDAO{
     public void inserir(Pagamento pagamento) throws Exception{
        String sql = "INSERT INTO pagamento (id_pagamento,data,valor,FormaPagamento_id_formaPagamento) VALUES(?,?,?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,pagamento.getId_pagamento());
        pst.setDate(2, (Date) pagamento.getData());
        pst.setDouble(3,pagamento.getValor());
        pst.setInt(4,pagamento.getFormaPagamento().getId_formaPagamento());
        pst.execute();
    }

    public ArrayList<Pagamento> listar() throws Exception{
        ArrayList<Pagamento> lista = new ArrayList();

        String sql="SELECT * FROM pagamento";
        Statement stm = conn.createStatement();
        System.out.println("ok");
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next()) {
            Pagamento p = new Pagamento();
            p.setId_pagamento(rs.getInt("id_pagamento"));
            p.setData(rs.getDate("data"));
            p.setValor(rs.getDouble("valor"));
            p.setFormaPagamento(FormaPagamentoDAO.carregaPorId(rs.getInt("id_formaPagamento")));
            lista.add(p);
        }
        return lista;
    }
    public static Pagamento carregaPorId(int id) throws Exception{
        Pagamento p = new Pagamento();
        String sql="SELECT * FROM pagamento WHERE id_pagamento="+id;
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        if (rs.next()) {
            p.setId_pagamento(rs.getInt("id"));
            p.setData(rs.getDate("data"));
            p.setValor(rs.getDouble("valor"));
            p.setFormaPagamento(FormaPagamentoDAO.carregaPorId(rs.getInt("id_formaPagamento")));

        }
        return p;
    }

    public void excluir(String id) throws Exception{
        String sql = "DELETE FROM pagamento WHERE id_pagamento=?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, Integer.parseInt(id));
        pst.execute();
    }

    public void alterar(Pagamento pagamento) throws Exception{
        String sql = "UPDATE pagamento SET valor=? WHERE id_pagamento=?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setDouble(1, pagamento.getValor());
        pst.setInt(2, pagamento.getId_pagamento());
        pst.execute();
    }
}
