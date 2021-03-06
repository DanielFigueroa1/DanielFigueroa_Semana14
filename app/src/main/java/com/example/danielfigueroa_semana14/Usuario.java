package com.example.danielfigueroa_semana14;

public class Usuario {

    private String id;
    private String nombre;
    private String telefono;
    private String correo;
    private String contrasena;
    private String contrasenaOtraVez;

    public Usuario () {
    }

    public Usuario (String id, String nombre, String telefono, String correo, String contrasena, String contrasenaOtraVez) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.contrasena = contrasena;
        this.contrasenaOtraVez = contrasenaOtraVez;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getContrasenaOtraVez() {
        return contrasenaOtraVez;
    }

    public void setContrasenaOtraVez(String contrasenaOtraVez) {
        this.contrasenaOtraVez = contrasenaOtraVez;
    }
}
