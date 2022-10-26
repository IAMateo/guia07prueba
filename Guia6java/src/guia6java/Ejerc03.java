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
public class Ejerc03 {

    /**
     * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
     en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase, ninuscula,mayuscula;
       
        System.out.println("Ingrese un frase");
        
        frase = leer.nextLine();
        
        System.out.println("toda la fraseen mayuscula: "+ frase.toUpperCase());
        System.out.println("toda la fraseen minuscula: "+ frase.toLowerCase());
    }
    
}
