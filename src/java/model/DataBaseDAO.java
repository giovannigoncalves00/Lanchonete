package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseDAO {

    static Connection conn;

    public DataBaseDAO() {
        try {
            // Carregando o JDBC Driver padrão  
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {  //Driver não encontrado  
            System.out.println("O driver expecificado nao foi encontrado."+e);
        }
    }

    public Connection conectar() {
        try {
            // Configurando a nossa conexão com um banco de dados//   
            String url = "jdbc:mysql://localhost/xtche1";
            String username = "root";        //nome de um usuário de seu BD        
            String password = "";      //sua senha de acesso  
            conn = DriverManager.getConnection(url, username, password);
            return conn;
        } catch (SQLException e) {
            //Não conseguindo se conectar ao banco  
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
            return null;
        }
    }

    public void desconectar() {
        try {
            //fechando a conexao
            conn.close();
        } catch (Exception e) {
            System.out.println("Erro ao fechar a conexao");
        }

    }

}
