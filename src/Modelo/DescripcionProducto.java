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
public class DescripcionProducto {
    private int codigo;
    private String nombre;
    private double precio;
    private boolean esAgregado;
    private int cantidad;
    private Rubro rubro;
    private boolean seControla;

    public DescripcionProducto(int codigo, String nombre, double precio, boolean esAgregado, int cantidad, Rubro rubro, boolean seControla) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.esAgregado = esAgregado;
        this.cantidad = cantidad;
        this.rubro = rubro;
        this.seControla = seControla;
    }

    public boolean isSeControla() {
        return seControla;
    }

    public void setSeControla(boolean seControla) {
        this.seControla = seControla;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEsAgregado() {
        return esAgregado;
    }

    public void setEsAgregado(boolean esAgregado) {
        this.esAgregado = esAgregado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Rubro getRubro() {
        return rubro;
    }

    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }
    
    
}
