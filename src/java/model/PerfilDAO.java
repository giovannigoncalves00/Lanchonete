package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class PerfilDAO extends DataBaseDAO{
    public PerfilDAO(){
        
    }
    public void inserir(Perfil perfil) throws Exception{
        String sql = "INSERT INTO perfil (perfil) VALUES(?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, perfil.getPerfil());
        pst.execute();
    }
    
    public ArrayList<Perfil> listar() throws Exception{
        ArrayList<Perfil> lista = new ArrayList();
        
        String sql="SELECT * FROM perfil";
        Statement stm = conn.createStatement();
        System.out.println("ok");
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next()) {            
            Perfil p = new Perfil();
            p.setId(rs.getInt("id"));
            p.setPerfil(rs.getString("perfil"));
            lista.add(p);
        }
        return lista;
    }
    public static Perfil carregaPorId(String id) throws Exception{
        Perfil p = new Perfil();
        String sql="SELECT * FROM perfil WHERE id="+id;
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        if (rs.next()) {            
            p.setId(rs.getInt("id"));
            p.setPerfil(rs.getString("perfil"));
        }
        return p;
    }
    
    public void excluir(String id) throws Exception{
        String sql = "DELETE FROM perfil WHERE id=?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, Integer.parseInt(id));
        pst.execute();
    }
    
    public void alterar(Perfil perfil) throws Exception{
        String sql = "UPDATE perfil SET perfil=? WHERE id=?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, perfil.getPerfil());
        pst.setInt(2, perfil.getId());
        pst.execute();
    }
}
