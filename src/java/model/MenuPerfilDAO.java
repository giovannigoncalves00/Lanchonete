package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MenuPerfilDAO extends DataBaseDAO {
    
    public void inserir (Menu menu) throws Exception{
        String sql = "INSERT INTO menu (titulo,link,icone) VALUES(?,?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, menu.getTitulo());
        pst.setString(2, menu.getLink());
        pst.setString(3, menu.getIcone());
        pst.execute();
       
    }
   
     public ArrayList<Menu> listar() throws Exception{
        ArrayList<Menu> lista = new ArrayList();
        String sql="SELECT m.id,m.titulo,m.link,m.icone,(SELECT COUNT(*) FROM menu_perfil as mp WHERE mp.id_menu=m.id) as dep FROM menu as m";
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next()) {            
            Menu m = new Menu();
            m.setId(rs.getInt("id"));
            m.setTitulo(rs.getString("titulo"));
            m.setLink(rs.getString("link"));
            m.setIcone(rs.getString("icone"));
            m.setDep(true);
            if(rs.getInt("dep")>0){
                 m.setDep(false);
            }
            lista.add(m);
        }
        return lista;
    }
      public Menu carregaPorId(String id) throws Exception{
       Menu m = new Menu();
        String sql="SELECT * FROM menu WHERE id="+id;
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        if (rs.next()) {            
            m.setId(rs.getInt("id"));
            m.setTitulo(rs.getString("titulo"));
            m.setLink(rs.getString("link"));
            m.setIcone(rs.getString("icone"));
        }
        return m;
    }
      public void alterar(Menu menu) throws Exception{
        String sql = "UPDATE menu SET titulo=?, link=?, icone=? WHERE id=?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, menu.getTitulo());
        pst.setString(2, menu.getLink());
        pst.setString(3, menu.getIcone());
        pst.setInt(4, menu.getId());
        pst.execute();
    }
    
    public void excluir(String id) throws Exception{
        String sql = "DELETE FROM menu WHERE id=?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, Integer.parseInt(id));
        pst.execute();
    }
   
    
}
