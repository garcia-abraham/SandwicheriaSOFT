/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Time;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import sun.util.calendar.LocalGregorianCalendar.Date;

/**
 *
 * @author Usuario
 */
public class Turno {
    private int dia;
    private int mes;
    private int año;
    private int hora;
    private int minuto;
    private Date fecha;
    private Time horario;
    private int diaFin;
    private int mesFin;
    private int añoFin;
    private int horaFin;
    private int minutoFin;
    private Date fechaFin;
    private Time horarioFin;
    private ArrayList<Venta> ventas = new ArrayList<Venta>();
    private boolean enSesion;

    public Turno(int dia, int mes, int año, int hora, int minuto) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.hora = hora;
        this.minuto = minuto;
        this.enSesion = true;
    }

    public Turno(Date fecha, Time horario) {
        this.fecha = fecha;
        this.horario = horario;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHorario() {
        return horario;
    }

    public void setHorario(Time horario) {
        this.horario = horario;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }

    public int getDiaFin() {
        return diaFin;
    }

    public void setDiaFin(int diaFin) {
        this.diaFin = diaFin;
    }

    public int getMesFin() {
        return mesFin;
    }

    public void setMesFin(int mesFin) {
        this.mesFin = mesFin;
    }

    public int getAñoFin() {
        return añoFin;
    }

    public void setAñoFin(int añoFin) {
        this.añoFin = añoFin;
    }

    public int getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(int horaFin) {
        this.horaFin = horaFin;
    }

    public int getMinutoFin() {
        return minutoFin;
    }

    public void setMinutoFin(int minutoFin) {
        this.minutoFin = minutoFin;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Time getHorarioFin() {
        return horarioFin;
    }

    public void setHorarioFin(Time horarioFin) {
        this.horarioFin = horarioFin;
    }

    public boolean isEnSesion() {
        return enSesion;
    }

    public void setEnSesion(boolean enSesion) {
        this.enSesion = enSesion;
    }
    
    public void cerrarSesion(){
        if(this.isEnSesion()){
            this.setDiaFin(GregorianCalendar.DAY_OF_MONTH);
            this.setMesFin(GregorianCalendar.MONTH);
            this.setAñoFin(GregorianCalendar.YEAR);
            this.setHoraFin(GregorianCalendar.HOUR_OF_DAY);
            this.setMinutoFin(GregorianCalendar.MINUTE);
            this.setEnSesion(false);
        }
    }
    
    public void agregarVentas(Venta venta){
        this.ventas.add(venta);
    }

    public int cantidadDeVentas() {
        return ventas.size();
    }

    public float totalRecaudado() {
        float total = 0;
        for (Venta venta : ventas) {
            total += venta.getTotal();
        }
        return total;
    }
    
}
