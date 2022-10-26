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
public class Ejerc16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño del vector");
        int N = leer.nextInt();
        int vector[] = new int [N];
        for (int i = 0; i < N-1; i++) {
            vector [i] = (int) (Math. random () * 10);
        }
        System.out.println("");
        
        for (int i = 0; i < N; i++) {
            System.out.println(vector[i]+"");
        }
        
        
        System.out.println("Ingrese un numero a buscar");
        int num2 = leer.nextInt ();
        int contador;
        contador = 0;
        for (int i = 0; i < N; i++) {
           
            if (vector [i] == num2) {
                contador ++;
                
                System.out.println("El numero "+ num2 +" se encuentra en la posicion " + i);
            } 
        }
        System.out.println("se encontro " + contador + " veces");
            
    }
}