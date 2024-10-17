/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leand
 */
public class Hotel {

    private String nombreHotel;
    private List<Habitacion> invertarioHabitaciones;

    public Hotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
        this.invertarioHabitaciones = new ArrayList<>();
    }

    //Metodos
    public void agregarHabitacion(Habitacion habitacion) throws Exception {
        if (habitacion instanceof Habitacion) {
            this.invertarioHabitaciones.add(habitacion);
        }
        throw new Exception("No paso el dato correcto");
    }

    public void reservarHabitacion(String codigoHabitacion, int dias) throws Exception {
        for (Habitacion habitacion : this.invertarioHabitaciones) {
            if (habitacion.getCodigoHabitacion().equals(codigoHabitacion)) {
                if (habitacion.isEstaOcupada()) {
                    throw new Exception("La habitacion ya esta ocupada");
                } else {
                    habitacion.setEstaOcupada(true);
                }
            }
        }
    }

    public void reservar(String codigoHabitacion, int dias) throws Exception {
        for (Habitacion habitacion : this.invertarioHabitaciones) {
            if (habitacion.getCodigoHabitacion().equals(codigoHabitacion)) {
                if (habitacion instanceof HabitacionDeluxe suitePremium && dias >= suitePremium.getNumeroNochesMinimas() || habitacion instanceof HabitacionEstandar) {
                    habitacion.setEstaOcupada(true);
                    System.out.println("Se realizo la reserva");
                } else {
                    throw new Exception("Ya esta reservada");
                }

            }

        }

    }

    public void liberarHabitacion(String codigoHabitacion) throws Exception {
        for (Habitacion habitacion : this.invertarioHabitaciones) {
            if (habitacion.getCodigoHabitacion().equals(codigoHabitacion)) {
                if (habitacion.isEstaOcupada()) {
                    habitacion.setEstaOcupada(false);
                } else {
                    throw new Exception("La habitacion no estaba reservada");
                }
            }
        }
    }

    public void calcularCostoEstadia(String codigoHabitacion, int dias) throws Exception {
        for (Habitacion habitacion : this.invertarioHabitaciones) {
            if (habitacion.getCodigoHabitacion().equals(codigoHabitacion)) {
                if (habitacion.isEstaOcupada()) {
                    habitacion.calcularPrecioTotal(dias);
                } else {
                    throw new Exception("La habitacion no existe o esta desocupada");
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Hotel{" + "nombreHotel=" + nombreHotel + ", invertarioHabitaciones=" + invertarioHabitaciones + '}';
    }
    
    
    

}
