/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Time;
import java.util.ArrayList;
import sun.util.calendar.LocalGregorianCalendar;
import sun.util.calendar.LocalGregorianCalendar.Date;

/**
 *
 * @author Usuario
 */
public class Venta {
    private int numeroVenta;
    private int diaVenta;
    private int mesVenta;
    private int añoVenta;
    private int horaVenta;
    private int minutoVenta;
    private Date fechaVenta;
    private Time horarioVenta;
    private double total;
    private Comprobante comprobante;
    private ArrayList<LineaVenta> lineasVentas = new ArrayList<LineaVenta>();
    private Cliente cliente;
    private double neto;
    private double iva;

    public Venta(int numeroVenta) {
        this.numeroVenta = numeroVenta;
        this.iva = 0.21;
    }

    public double getNeto() {
        return neto;
    }

    public void setNeto(double neto) {
        this.neto = neto;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }
    
    

    public int getNumeroVenta() {
        return numeroVenta;
    }

    public void setNumeroVenta(int numeroVenta) {
        this.numeroVenta = numeroVenta;
    }

    public int getDiaVenta() {
        return diaVenta;
    }

    public void setDiaVenta(int diaVenta) {
        this.diaVenta = diaVenta;
    }

    public int getMesVenta() {
        return mesVenta;
    }

    public void setMesVenta(int mesVenta) {
        this.mesVenta = mesVenta;
    }

    public int getAñoVenta() {
        return añoVenta;
    }

    public void setAñoVenta(int añoVenta) {
        this.añoVenta = añoVenta;
    }

    public int getHoraVenta() {
        return horaVenta;
    }

    public void setHoraVenta(int horaVenta) {
        this.horaVenta = horaVenta;
    }

    public int getMinutoVenta() {
        return minutoVenta;
    }

    public void setMinutoVenta(int minutoVenta) {
        this.minutoVenta = minutoVenta;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Time getHorarioVenta() {
        return horarioVenta;
    }

    public void setHorarioVenta(Time horarioVenta) {
        this.horarioVenta = horarioVenta;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<LineaVenta> getLineasVentas() {
        return lineasVentas;
    }

    public void setComprobante(Comprobante comprobante){
        this.comprobante = comprobante;
    }
    public void setLineasVentas(ArrayList<LineaVenta> lineasVentas) {
        this.lineasVentas = lineasVentas;
    }
    
    public void crearCliente(String condicionTributaria){
        Cliente cliente = new Cliente(0, 0, 0, condicionTributaria, "", "");
        this.setCliente(cliente);
        
    }
    
    public void calculatTotal(){
        double neto = 0;
        for(LineaVenta lp : this.lineasVentas){
            neto = neto + lp.getSubTotal();
        }
        this.setNeto(neto);
        double total = neto*this.getIva() + neto;
        this.setTotal(total);
    }
    
}
