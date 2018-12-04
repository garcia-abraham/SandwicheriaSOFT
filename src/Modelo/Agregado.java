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
public class Agregado extends DescripcionProducto{
    private boolean incluido;
    private boolean habilitado;

    public Agregado(int codigo, String nombre, double precio, boolean esAgregado, int cantidad, Rubro rubro, boolean seControla) {
        super(codigo, nombre, precio, esAgregado, cantidad, rubro, seControla);
    }

    public boolean isIncluido() {
        return incluido;
    }

    public void setIncluido(boolean incluido) {
        this.incluido = incluido;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
    
    
    
}
