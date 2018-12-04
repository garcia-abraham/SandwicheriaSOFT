/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Cliente {
    private int dni;
    private int cuit;
    private int cuil;
    private String condicionTributaria;
    private String apellido;
    private String nombre;

    public Cliente(int dni, int cuit, int cuil, String condicionTributaria, String apellido, String nombre) {
        this.dni = dni;
        this.cuit = cuit;
        this.cuil = cuil;
        this.condicionTributaria = condicionTributaria;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public int getCuil() {
        return cuil;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }

    public String getCondicionTributaria() {
        return condicionTributaria;
    }

    public void setCondicionTributaria(String condicionTributaria) {
        this.condicionTributaria = condicionTributaria;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
