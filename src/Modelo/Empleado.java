/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Empleado {
    private int legajo;
    private int dni;
    private String apellido;
    private String nombre;
    private String usuario;
    private String contraseña;
    private ArrayList<Turno> turnos = new ArrayList<Turno>();

    public Empleado(int legajo, int dni, String apellido, String nombre) {
        this.legajo = legajo;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(ArrayList<Turno> turnos) {
        this.turnos = turnos;
    }
    
    public void agregarTurno(Turno turno){
        this.turnos.add(turno);
    }
    
    public void cerrarSesion(){
        for(Turno turno : this.getTurnos()){
            turno.cerrarSesion();
        }
    }

    Turno turnoActual() {
        return turnos.get(turnos.size() - 1);
    }
    
    
}
