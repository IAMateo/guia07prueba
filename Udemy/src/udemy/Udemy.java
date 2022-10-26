/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author A275084
 */
public class Udemy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int matriz [] [], nFilas, nCol;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("digite el numero de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("digite el numero de Columnas: "));
        
        matriz = new int [nFilas] [nCol];
        
        //bucle para llenar la matriz
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz [i][j] = leer.nextInt();
            }  
        }
        
        //imprimir matriz
        System.out.println(" La Matriz es: ");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j <nCol; j++) {
                System.out.println(matriz [i][j]);
                
            }
            
        }
        
    }
    
}
