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
public class Negocio {
    private int cuit;
    private String nombre;
    private String condicionTributaria;
    private String direccion;
    private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    private ArrayList<Producto> productos = new ArrayList<Producto>();
    private int ultimoNumeroVenta;
    private ArrayList<Comprobante> comprobantes = new ArrayList<Comprobante>();

    public Negocio(int cuit, String nombre, String condicionTributaria, String direccion) {
        this.cuit = cuit;
        this.nombre = nombre;
        this.condicionTributaria = condicionTributaria;
        this.direccion = direccion;
        this.ultimoNumeroVenta = 0;
    }

    public ArrayList<Comprobante> getComprobantes() {
        return comprobantes;
    }

    public void setComprobantes(ArrayList<Comprobante> comprobantes) {
        this.comprobantes = comprobantes;
    }


    public int getUltimoNumeroVenta() {
        return ultimoNumeroVenta;
    }

    public void setUltimoNumeroVenta(int ultimoNumeroVenta) {
        this.ultimoNumeroVenta = ultimoNumeroVenta;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCondicionTributaria() {
        return condicionTributaria;
    }

    public void setCondicionTributaria(String condicionTributaria) {
        this.condicionTributaria = condicionTributaria;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    
    
    
}
