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

public class ControladorCanciones {
    private ConexionMySQL conexion;

    public ControladorCanciones(ConexionMySQL conexion) {
        this.conexion = conexion;
    }
    
    public ArrayList<Canciones> ObtenerTodosCanciones() throws SQLException{
        ArrayList<Canciones> lista = new ArrayList<>();
        String consulta = "SELECT * FROM `canciones`;";
        ResultSet rset = conexion.ejecutarSelect(consulta);
        while(rset.next()){
            String titulo =   rset.getString("TITULO");
            String album = rset.getString("ALBUM");
            String artista = rset.getString("ARTISTA");
            String duracion= rset.getString("DURACION");
            Canciones cancion= new Canciones(titulo,album,artista,duracion);
            lista.add(cancion);
        }
        return lista;
    }
    
}
