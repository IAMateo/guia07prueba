/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6java;

import java.util.Scanner;

/**
 *
 * @author A275084
 */
public class Ejerc02 {

    /**
     *2- Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
     pantalla.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);
      
      String nombre;
        System.out.println("ingrese su nombre");
        
        nombre = leer.nextLine();
        
        System.out.println("tu nombre es: "+ nombre);
    }
    
}
