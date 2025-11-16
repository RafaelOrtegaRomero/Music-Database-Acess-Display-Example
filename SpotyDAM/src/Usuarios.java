/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafae
 */
public class Usuarios {
    
    String nombre;
    String contraseña;
    String respuesta;

    public Usuarios(String nombre, String contraseña, String respuesta) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.respuesta = respuesta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    
    
}
