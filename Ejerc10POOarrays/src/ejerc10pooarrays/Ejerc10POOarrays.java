/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc10pooarrays;

import java.util.Arrays;

/**
 *
 * @author A275084
 */
public class Ejerc10POOarrays {

    /**
     * /*Realizar un programa en Java donde se creen dos arreglos: el primero
     * será un arreglo A de 50 números reales, y el segundo B, un arreglo de 20
     * números, también reales.
     *
     * El programa deberá inicializar el arreglo A con números aleatorios y
     * mostrarlo por pantalla.
     *
     * Luego, el arreglo A se debe ordenar de menor a mayor y copiar los
     * primeros 10 números ordenados al arreglo B de 20 elementos, y rellenar
     * los 10 últimos elementos con el valor 0.5. Mostrar los dos arreglos
     * resultantes: el ordenado de 50 elementos y el combinado de 20.
     */
    public static void main(String[] args) {
        double arreglo1[] = new double[50];
        double arreglo2[] = new double[20];

        System.out.println("Arreglo A - Aleatorio");
        for (int i = 0; i < arreglo1.length; i++) {
            arreglo1[i] = (int) (Math.random() * 10);
            System.out.print("[" + arreglo1[i] + "]");
        }
        System.out.println("");

        System.out.println("Arreglo A - Ordenado Ascendentemente");
        //se utiliza .sort para ordenar array
        Arrays.sort(arreglo1, 0, 50);
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.print("[" + arreglo1[i] + "]");
        }
        //copiar los primeros 10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 
        for (int i = 0; i < arreglo2.length; i++) {
            if (i < 10) {
                arreglo2[i] = arreglo1[i];
            } else {
                arreglo2[i] = 0.5;
            }
        }
        System.out.println("");
        
        //mostrar array A y B
        System.out.println("Arreglo A");
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.print("[" + arreglo1[i] + "]");
        }
        System.out.println("");

        System.out.println("Arreglo B - Copiado y Rellenado");
        for (int i = 0; i < arreglo2.length; i++) {
            System.out.print("[" + arreglo2[i] + "]");
        }
        System.out.println("");
    }
}
