/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeraaplicacionjava;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author A309436
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //20. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
        //suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
        //permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
        //El programa deberá comprobar que los números introducidos son correctos, es decir,
        //están entre el 1 y el 9.
        Scanner leer = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int[] filas = new int[3];
        int[] columnas = new int[3];
        int diagonal = 0;
        int diagonalInversa = 0;
        boolean esMagica = true;

        System.out.println("Por favor ingresar numeros hasta rellenar la matriz 3x3");

        for (int i = 0; i < 3; i++) {

            filas[i] = 0;
            columnas[i] = 0;

            //System.out.println("Ingrese los valores de la fila " + (i));
            for (int j = 0; j < 3; j++) {
                //System.out.println("Ingrese el valor de la columna " + (j));
                //matriz[i][j] = leer.nextInt();
                //matriz[i][j] = 1;
                matriz[i][j] = (int) (Math.random() * (9) + 1);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                filas[i] += matriz[i][j];
                columnas[j] += matriz[i][j];

                if (i == j) {
                    diagonal += matriz[i][j];
                }

                if ((i + j) == 2) {
                    diagonalInversa += matriz[i][j];
                }
                System.out.print("|" + matriz[i][j] + "|");

            }
            System.out.println("");
        }

        for (int i = 0; i < filas.length; i++) {
            if (filas[i] != columnas[i] || filas[i] != diagonal || filas[i] != diagonalInversa) {
                esMagica = false;
            }
        }

        if (esMagica) {
            System.out.println("¡La matriz es mágica!");
        } else {
            System.out.println("¡Ups! La matriz no es mágica.");
        }

    }

}
