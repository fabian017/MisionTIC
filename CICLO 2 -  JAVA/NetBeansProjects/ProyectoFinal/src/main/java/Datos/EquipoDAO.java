/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Clases.Equipo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FABIAN JIMENEZ <fabian.jovalle at gmail.com>
 */
public class EquipoDAO {
    private static final String SQL_SELECT = "SELECT equipo_codigo, equipo_nombre, equipo_entrenador FROM equipo";
    private static final String SQL_INSERT = "INSERT INTO Equipo(equipo_nombre, equipo_entrenador) VALUES(?, ?)";
    private static final String SQL_UPDATE = "UPDATE Equipo SET equipo_nombre= ?, equipo_entrenador=? WHERE equipo_codigo = ?";
    private static final String SQL_DELETE = "DELETE FROM Equipo WHERE equipo_codigo = ?";
    
    public int eliminar(Equipo equipo){
        Connection conn=null;
        PreparedStatement stmt = null;
        int rows = 0;
        try{
          conn = Conexion.getConnection();
          stmt = conn.prepareStatement(SQL_DELETE);
          stmt.setInt(1, equipo.getEquipoCodigo());
          rows = stmt.executeUpdate();
        }
        catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
    
    public int actualizar(Equipo equipo){
        Connection conn=null;
        PreparedStatement stmt = null;
        int rows = 0;
        try{
          conn = Conexion.getConnection();
          stmt = conn.prepareStatement(SQL_UPDATE);
          stmt.setString(1, equipo.getEquipoNombre());
          stmt.setString(2, equipo.getEquipoEntrenador());
          stmt.setInt(3, equipo.getEquipoCodigo());
          rows = stmt.executeUpdate();
        }
        catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }    
    
    public int insertar(Equipo equipo){
        Connection conn=null;
        PreparedStatement stmt = null;
        int rows = 0;
        try{
          conn = Conexion.getConnection();
          stmt = conn.prepareStatement(SQL_INSERT);
          stmt.setString(1, equipo.getEquipoNombre());
          stmt.setString(2, equipo.getEquipoEntrenador());
          rows = stmt.executeUpdate();
        }
        catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
    
    public List<Equipo> listar(){
        Connection conn=null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Equipo equipo = null;
        List<Equipo> equipos = new ArrayList<>();
        try{
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                int equipoCodigo = rs.getInt("equipo_codigo");
                String equipoNombre = rs.getString("equipo_nombre");
                String equipoEntrenador = rs.getString("equipo_entrenador");
                
                equipo = new Equipo(equipoCodigo, equipoNombre, equipoEntrenador);
                equipos.add(equipo);
            }
        }
        catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return equipos;
    }
}
