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
public class Ejerc04 {

    /**
     * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        double  centigrados , fahrenheit;
        
        System.out.println("ingrese grados centigados");
        
        centigrados = leer.nextDouble();
        fahrenheit = 32 + (9 * centigrados / 5);
        
        System.out.println("el equivantente en grados Fahrenheit es de: " + fahrenheit);
        
        
    }
    
}