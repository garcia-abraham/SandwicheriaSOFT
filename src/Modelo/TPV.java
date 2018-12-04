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
public class TPV {
    private int numero;
    private Negocio negocio;
    private Venta venta;
    private Empleado empleado;

    public TPV(int numero, Negocio negocio) {
        this.numero = numero;
        this.negocio = negocio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Negocio getNegocio() {
        return negocio;
    }

    public void setNegocio(Negocio negocio) {
        this.negocio = negocio;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
    public void IniciarVenta(){
        int numeroVenta = this.getNegocio().getUltimoNumeroVenta() + 1;
        this.getNegocio().setUltimoNumeroVenta(numeroVenta);
        Venta venta = new Venta(numeroVenta);
        this.setVenta(venta);
    }
    
    public void ingresarCliente(String tipoCliente){
        this.getVenta().crearCliente(tipoCliente);
    }
    
    public Producto ingresarCodigoProducto(int codigo){
        Producto producto = null;
        
        for (Producto product : this.getNegocio().getProductos()) {
            if (product.getCodigo() == codigo) {
                producto = product;
            }

        }
        return producto;
    }
    
    public void agregarAgregado(int codigo, Producto producto){
        producto.habilitarAgregado(codigo);
        
    }
    
    public void quitarAgregado(int codigo, Producto producto){
        producto.deshabilitarAgregado(codigo);
    }
    
    public void agregarPedido(int cantidad, Producto producto){
        
        LineaVenta lv = new LineaVenta(cantidad, producto);
        lv.calcularSubTotal();

        this.getVenta().getLineasVentas().add(lv);
        //this.getVenta().calculatTotal();
    }
    
    public void finalizarVenta(){
        this.getVenta().calculatTotal();
        
        Comprobante comprobante = new Comprobante();
        comprobante.establecerFactura(this.getVenta().getCliente().getCondicionTributaria(), this.getNegocio().getCondicionTributaria());
        this.getNegocio().getComprobantes().add(comprobante);
        Turno turno = empleado.turnoActual();
        turno.agregarVentas(venta);
    }
    
    public void finalizarTurno(){
        this.getEmpleado().cerrarSesion();
    }

    public int cantidadDeVentasEnElTurno() {
        Turno turno = empleado.turnoActual();
        return turno.cantidadDeVentas();
    }

    public float totalRecaudadoEnElTurno() {
        Turno turno = empleado.turnoActual();
        return turno.totalRecaudado();
    }
    
}
