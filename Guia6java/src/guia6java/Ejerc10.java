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
public class Ejerc10 {

    /**
     * Bucles y sentencias de salto break y continue
10. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num, lim, sum;
       sum = 0;
        System.out.println("ingrese valor limite");
        lim = leer.nextInt();
        if (lim < sum) {
            System.out.println("el limite ingresa es negativo");
        } else {
    while (sum <= lim) {
     System.out.println("ingrese un numero");
            num = leer.nextInt();
            sum += num;
    
    }}
     System.out.println("El valor sumado es " + sum);
    }
}
