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
public class Producto extends DescripcionProducto {
    
    private ArrayList<Agregado> agregados = new ArrayList<Agregado>();
    
    public Producto(int codigo, String nombre, double precio, boolean esAgregado, int cantidad, Rubro rubro, boolean seControla){
        super(codigo, nombre, precio, esAgregado, cantidad, rubro, seControla);
    }


    public ArrayList<Agregado> getAgregados() {
        return agregados;
    }

    public void setAgregados(ArrayList<Agregado> agregados) {
        this.agregados = agregados;
    }
    
    public void agregarAgregadoHabilitado(Agregado agregado){
        agregado.setIncluido(true);
        agregado.setHabilitado(true);
        this.agregados.add(agregado);
    }
    
    public void agregarAgregadoDeshabilitado(Agregado agregado){
        agregado.setIncluido(false);
        agregado.setHabilitado(false);
        this.agregados.add(agregado);
    }
    
    public void habilitarAgregado(int codigo){
        for(Agregado agregado : this.agregados){
            if(!agregado.isHabilitado() && agregado.getCodigo() == codigo){
                agregado.setHabilitado(true);
            }
        }
    }
    
    public void deshabilitarAgregado(int codigo){
        for(Agregado agregado : this.agregados){
            if(agregado.isHabilitado() && agregado.getCodigo() == codigo){
                agregado.setHabilitado(false);
            }
        }
    }
    
    public void restaurar(){
        for(Agregado agregado : this.agregados){
            if(agregado.isIncluido()){
                agregado.setHabilitado(true);
            }else{
                agregado.setHabilitado(false);
            }
        }
    }
    
    public double calcularPrecio(){
        double extra = 0;
        for(Agregado agregado : this.agregados){
            if(agregado.isHabilitado() && !agregado.isIncluido()){
                extra = extra + agregado.getPrecio();
            }
        }
        extra = extra + this.getPrecio();
        return extra;
    }
    
    
}
