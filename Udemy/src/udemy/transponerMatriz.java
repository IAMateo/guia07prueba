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
public class transponerMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int matriz [][] = new int [3][3];
        
        //llenar
        System.out.println("digite matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Matriz [" +i+ "][" +j+ "]:");
                
                matriz[i][j] = leer.nextInt();
                  
            }
        }
        //imprimir matriz original
        System.out.println("Matriz Original");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+ " "); //sin ln
                
            }
            System.out.println("");//salto de linea
        }
        //transponer matriz
        int aux;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) { //se colola i y no 3
                aux = matriz [i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
                
            }
        }
        
        //imprimir matriz transpuesta:
        System.out.println("la matriz transpuesta es: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(-matriz [i][j]+ " ");
                
            }
            System.out.println(""); //salto de linea
        }
        
        
        }    
}
