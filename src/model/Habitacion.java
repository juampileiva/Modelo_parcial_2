/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author leand
 */
public abstract class Habitacion {
    protected String codigoHabitacion;
    protected boolean estaOcupada;
    protected double precioPorNoche;

    public Habitacion(String codigoHabitacion, double precioPorNoche) throws Exception{
        if (codigoHabitacion.length() == 5) {
            this.codigoHabitacion = codigoHabitacion;
        } else {
            throw new Exception("El codigo de habitacion debe contener 5 caracteres");
        }
        this.estaOcupada = false;
        this.precioPorNoche = precioPorNoche;
    }
    
    //Metodo abstracto 
    public abstract void calcularPrecioTotal(int dias);

    public String getCodigoHabitacion() {
        return codigoHabitacion;
    }

    public boolean isEstaOcupada() {
        return estaOcupada;
    }

    public void setEstaOcupada(boolean estaOcupada) {
        this.estaOcupada = estaOcupada;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "codigoHabitacion=" + codigoHabitacion + ", estaOcupada=" + estaOcupada + ", precioPorNoche=" + precioPorNoche + '}';
    }
    
    
    
    
     
    
     
    
    
    
}
