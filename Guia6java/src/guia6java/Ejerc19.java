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
public class Ejerc19 {

    /**
     * @param args the command line arguments
     * Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
      
   
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        
       
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                 //llenar matriz
                matrizA[i][j] = (int) leer.nextInt();  
            }
            for ( i=0 ; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i==j)
                        matrizB[i][j]=matrizA[i][j];
                    else 
                        matrizB[j][i]=matrizA[i][j];
                    
                }
                
            }
}
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("[" + matrizA[i][j] + "]");
                    
                }
                System.out.println("");
            }
            
            System.out.println("==");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print("[" + matrizB[i][j] + "]");
                    
                }
                System.out.println("");
        }
    
    
    }
    
}