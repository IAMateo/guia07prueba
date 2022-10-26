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
public class sumaDeMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int matriz1 [][], matriz2 [][], suma[][];
        
        matriz1 = new int [3][3];
        matriz2 = new int [3][3];
        //llenar matriz1
        System.out.println("digite la matriz ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriz [" +i+"]["+j+"]: ");
                matriz1[i][j] = leer.nextInt();
            }
            
        }
        //llenar matriz2
        System.out.println("digite la segunda matriz ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriz2[" +i+"]["+j+"]: ");
                matriz2[i][j] = leer.nextInt();
            }
            
        }
        //sumar matrices
        suma = new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
                
                
            }
            
        }
        //imprimir  resultado
        System.out.println("la suma de las matrices es: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(suma [i][j] + " ");
            }
            System.out.println(""); 
        }
    }
    
}
