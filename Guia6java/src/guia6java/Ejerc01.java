/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6java;

import java.util.Scanner;

/**
 * * @author A275084
 * 1-Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
public class Ejerc01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num1, num2, sum;
        System.out.println("ingrese dos numero para sumar");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        sum = num1 + num2;
        
        System.out.println("el resultado de la suma es: " + sum);
             
    }
    
}
