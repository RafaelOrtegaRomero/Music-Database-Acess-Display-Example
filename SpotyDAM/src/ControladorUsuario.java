/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafae
 */

import java.sql.*;
import java.util.ArrayList;

public class ControladorUsuario {
    private ConexionMySQL conexion;

    public ControladorUsuario(ConexionMySQL conexion) {
        this.conexion = conexion;
    }
    
    public ArrayList<Usuarios> ObtenerTodosUsuarios() throws SQLException{
        ArrayList<Usuarios> lista = new ArrayList<>();
        String consulta = "SELECT * FROM usuarios";
        ResultSet rset = conexion.ejecutarSelect(consulta);
        while(rset.next()){
            String Usuario = rset.getString("Usuario");
            String Contraseña = rset.getString("Contraseña");
            String Respuesta = rset.getString("Respuesta");
            Usuarios user = new Usuarios(Usuario,Contraseña,Respuesta);
            lista.add(user);
        }
        return lista;
    }
    
}
