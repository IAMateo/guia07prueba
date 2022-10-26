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
public class Ejerc06 {

    /**
     * Crear un programa que dado un numero determine si es par o impar.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        double num,par,impar;
        
        System.out.println("ingrese un numero");
        num = leer.nextDouble();
        if (num % 2 == 0) {
            System.out.println("El numero " + num +  " es PAR");
    }else {System.out.println ("El numero " + num +  " es IMPAR");   
           
        }
    }
}
