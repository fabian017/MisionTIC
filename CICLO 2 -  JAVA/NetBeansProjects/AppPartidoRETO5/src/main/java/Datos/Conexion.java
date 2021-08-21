/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;


import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;
/**
 *
 * @author FABIAN JIMENEZ <fabian.jovalle at gmail.com>
 */
public class Conexion {
    // JDBC DRIVER JAVA CON MYSQL
    private static final String JDBC_URL="jdbc:mysql://localhost:3307/bd_campeonato_g27?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER="root";
    private static final String JDBC_PASSWORD = "Thiago_017-2010";
    
    public static DataSource getDataSource(){
       BasicDataSource ds =  new BasicDataSource();
       ds.setUrl(JDBC_URL);
       ds.setUsername(JDBC_USER);
       ds.setPassword(JDBC_PASSWORD);
       ds.setInitialSize(50);
       return ds;
    }
    
    public static Connection getConnection() throws SQLException{
        return getDataSource().getConnection();
    }
    
    public static void close(Connection conn){
        try{
            conn.close();
        }
        catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(PreparedStatement stmt){
        try{
            stmt.close();
        }
        catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(ResultSet rs){
        try{
            rs.close();
        }
        catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    }
    
}
