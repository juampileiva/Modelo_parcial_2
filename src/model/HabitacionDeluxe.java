/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author leand
 */
public class HabitacionDeluxe extends Habitacion {

    private boolean incluyeDesayuno;
    private double tarifaDesayuno;
    private int numeroNochesMinimas;

    public HabitacionDeluxe(boolean incluyeDesayuno, double tarifaDesayuno, int numeroNochesMinimas, String codigoHabitacion, double precioPorNoche) throws Exception {
        super(codigoHabitacion, precioPorNoche);
        this.incluyeDesayuno = incluyeDesayuno;
        this.tarifaDesayuno = tarifaDesayuno;
        this.numeroNochesMinimas = numeroNochesMinimas;
    }

    //Si el desayuno está incluido añadir el costo del desayuno por cada día de la estadía. Además, se aplica un descuento del 10% si la estadía es mayor a 7 días, 
    //pero si el cliente no alcanza el número mínimo de noches (numeroNochesMinimas), añadir una penalización del 20% al precio total.  
    @Override
    public void calcularPrecioTotal(int dias) {
        double precioTotal = 0;

        if (dias > 0) {
            if (dias > 7) {
                if (this.incluyeDesayuno) {
                    precioTotal = (tarifaDesayuno * dias) + ((precioPorNoche * dias) * 0.9);
                } else {
                    precioTotal = ((precioPorNoche * dias) * 0.9);
                }
            } else {
                if (this.incluyeDesayuno) {
                    precioTotal = (tarifaDesayuno * dias) + ((precioPorNoche * dias) * 1.2);
                } else {
                    precioTotal = ((precioPorNoche * dias) * 1.2);
                }
            }

        } else {
            System.out.println("No existen dias negativos");
        }

        System.out.println("El precio total es: " + precioTotal);
    }

    public int getNumeroNochesMinimas() {
        return numeroNochesMinimas;
    }

    @Override
    public String toString() {
        return "HabitacionDeluxe{" + "codigoHabitacion=" + codigoHabitacion + "incluyeDesayuno=" + incluyeDesayuno + ", tarifaDesayuno=" + tarifaDesayuno + ", numeroNochesMinimas=" + numeroNochesMinimas + '}';
    }

}
