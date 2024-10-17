/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author leand
 */
public class HabitacionEstandar extends Habitacion {

    private boolean limpiezaIncluida;
    private double costoLimpieza;

    public HabitacionEstandar(boolean limpiezaIncluida, double costoLimpieza, String codigoHabitacion, double precioPorNoche) throws Exception {
        super(codigoHabitacion, precioPorNoche);
        this.limpiezaIncluida = limpiezaIncluida;
        this.costoLimpieza = costoLimpieza;
    }

    @Override
    public void calcularPrecioTotal(int dias) {
        double precioTotal = 0;
        if (dias > 0) {
            if (this.limpiezaIncluida) {
                precioTotal = (precioPorNoche * dias) + this.costoLimpieza;
            } else {
                precioTotal = (this.precioPorNoche * dias) + (this.costoLimpieza * dias);
            }
        }
        System.out.println("Precio total: " + precioTotal);
    }

    @Override
    public String toString() {
        return "HabitacionEstandar{" + "codigoHabitacion=" + codigoHabitacion + "limpiezaIncluida=" + limpiezaIncluida + ", costoLimpieza=" + costoLimpieza + '}';
    }
    
    
    
    

}
