/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafae
 */

import java.util.Calendar;
import java.util.TimeZone;
import java.sql.*;

public class ConexionMySQL {
    private String BD;
    private String USUARIO;
    private String PASS;
    private Connection connection;
    private String HOST;
    private TimeZone zonaHoraria;

    public ConexionMySQL() {
        //para usar esto he creado una BD que se llama practica con los distintas tablas correspondientes
        this.BD = "practica";
        this.USUARIO =  "root";
        this.PASS = "";
        this.HOST="localhost";
        this.connection=null;
    }
    
   public void conectar() throws SQLException, ClassNotFoundException{
        if(connection == null || connection.isClosed()){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Calendar now = Calendar.getInstance();
                zonaHoraria = now.getTimeZone();
                connection = (Connection)DriverManager.getConnection("jdbc:mysql://"+HOST+"/"+BD+"?user="+USUARIO+"&password="+PASS+"&userLegacyDateTimeCode=false&serverTimeZone="+zonaHoraria.getID());
            } catch(SQLException e){
                System.out.println("Error");
            }
        }
    }
    
    public void desconectar()throws SQLException{
        if(connection!=null && connection.isClosed()){
        connection.close();  
        }
    }
    
     public ResultSet ejecutarSelect(String consulta)throws SQLException{
        Statement stmt=connection.createStatement();
        ResultSet rset=stmt.executeQuery(consulta);
        
        return rset;
    }
    
     public int ejecutarInsertDeleteUpdate(String consulta) throws SQLException{
        Statement stmt=connection.createStatement();
        int fila=stmt.executeUpdate(consulta);
        return fila;
    }
    
    
}
