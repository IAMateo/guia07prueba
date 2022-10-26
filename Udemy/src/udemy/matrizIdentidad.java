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
public class matrizIdentidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner leer = new Scanner(System.in);
        int matriz[][] = new int[7][7];
        
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i==j){  //diagonal principal
                    matriz [i][j] = 1;
                }else{
                    matriz [i][j] = 0;
                }
                
            }
            
        }
        //imprimir matriz
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz [i][j]+" ");
                
            }
            System.out.println("");  
        }
    }
    
}
