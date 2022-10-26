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
public class Ejerc21 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        // TODO code application logic here

        //21. Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
        //3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
        //dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
        //se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
        //que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
        //la matriz M en la cual empieza el primer elemento de la submatriz P.
        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];
        int fila, columna;
        int[] v_filas = new int[49];
        int[] v_columnas = new int[49];
        int contador = 0;
        boolean contenida = false;

        Scanner leer = new Scanner(System.in);

        //Lleno mi matriz M
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizM[i][j] = (int) (Math.random() * (90) + 10);
                System.out.print(matrizM[i][j] + " ");
            }
            System.out.println("");
        }

        //Genero un numero aleatorio para luego rellenar la matrizP segun los valores de la matrizM de una posición aleatoria
        fila = (int) (Math.random() * (8));
        columna = (int) (Math.random() * (8));

        System.out.println("-----------------------------------");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizP[i][j] = matrizM[i + fila][j + columna];
                System.out.print(matrizP[i][j] + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                if (contenida) {
                    contador++;
                }

                for (int k = 0; k < 3; k++) {

                    for (int l = 0; l < 3; l++) {
                        if (matrizP[k][l] != matrizM[k + i][l + j]) {
                            contenida = false;
                            break;
                        } else {
                            if (k == 0 && l == 0) {
                                v_filas[contador] = k + i;
                                v_columnas[contador] = l + j;
                                contenida = true;
                            }
                        }
                    }
                    if (!contenida) {
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < contador; i++) {
            System.out.println("La matriz P esta contenida en la matriz M en la fila " + v_filas[i] + " y columna " + v_columnas[i]);
        }

    }
}