/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import model.HabitacionDeluxe;
import model.HabitacionEstandar;

/**
 *
 * @author leand
 */
public class Main{
    public static void main(String[] args) {
        System.out.println("1-1");
        try {
            HabitacionEstandar habitacion1 = new HabitacionEstandar(false, 0.0, "10001", 80.0);
            System.out.println(habitacion1.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("1-2");
        try {
            HabitacionEstandar habitacion1 = new HabitacionEstandar(true, 15.0, "10002", 90.0);
            System.out.println(habitacion1.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("1-3");
        try {
            HabitacionEstandar habitacion1 = new HabitacionEstandar(true, 15.0, "10001", 80.0);
            habitacion1.calcularPrecioTotal(3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
         System.out.println("1-4");
        try {
            HabitacionEstandar habitacion1 = new HabitacionEstandar(false, 0.0, "10001", 90.0);
            habitacion1.calcularPrecioTotal(4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
         System.out.println("2-1");
        try {
            HabitacionDeluxe habitacion1 = new HabitacionDeluxe(false, 25, 2, "2001", 200);
            System.out.println(habitacion1.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("2-2");
        try {
            HabitacionDeluxe habitacion1 = new HabitacionDeluxe(false, 30, 1, "20002", 250);
            System.out.println(habitacion1.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("2-3");
        try {
            HabitacionDeluxe habitacion1 = new HabitacionDeluxe(true, 25, 7, "20001", 200);
            habitacion1.calcularPrecioTotal(8);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        
        
        
    }
    
    
    
    
}
