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
public class Comprobante {
    private int numeroComprobante;
    private String tipoDocumento;
    private String tipo;
  

    public Comprobante() { }

    public int getNumeroComprobante() {
        return numeroComprobante;
    }

    
    public void setNumeroComprobante(int numeroComprobante) {
        this.numeroComprobante = numeroComprobante;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void establecerFactura(String condicionCliente, String condicionNegocio){
        this.setTipoDocumento("Factura");
        if(condicionCliente.equals("Responsable Incripto") && condicionNegocio.equals("Responsable Incripto")){
            
            this.setTipo("A");
        }else{
            if((condicionCliente.equals("Monotributista") || condicionCliente.equals("Excento") || condicionCliente.equals("NR") || condicionCliente.equals("Consumidor Final")) && condicionNegocio.equals("Responsable Incripto")){
            this.setTipo("B");
        }else{
                this.setTipo("C");
            }
        }
    }
    
}
