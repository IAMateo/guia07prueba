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
public class Ejerc05 {

    /**
     * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);  
       
       
       double num, raiz, doble,triple;
        System.out.println("ingrese un numero ");
        num = leer.nextDouble();
        
        doble= num * 2;
        triple= num * 3;
        raiz= Math.sqrt(num);
        
        System.out.println("El numero ingreso es: " + num);
         System.out.println("El doble es: " + doble);
          System.out.println("El tripe  es: " + triple);
           System.out.println("la raiz  es: " + raiz);
        
      
       
    }
    
}
