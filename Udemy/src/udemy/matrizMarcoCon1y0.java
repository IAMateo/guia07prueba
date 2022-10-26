/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy;

import java.util.Scanner;

/**
 *
 * @author A275084
 */
public class matrizMarcoCon1y0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz [][] = new int [5][5];
        
        //llenar matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i==0 || i==4)  //delimita de las columnas
                    matriz[i][j]= 1;
            
            else if(j==0 || j==4) {
                    matriz [i][j]= 1;
            }
            else {
                    matriz[i][j] = 0;
                
            }
            }
        }
        System.out.println("la matriz es: ");
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j]+ "");
                
            }
            System.out.println(""); 
        }
    }
}

