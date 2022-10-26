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
public class matrizSimetrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int matriz [][], nFilas, nCol;
        boolean  simetrica = true;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("ingrese n° de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("ingrese n° de Columnas: "));
        
        matriz =new int [nFilas][nCol];
        
        System.out.println("ingrese numeros para llenar matriz");
        
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print("matriz [" +i+ "] [" +j+ "]: ");
                //guardar datos en la matriz
                matriz[i][j] = leer.nextInt();
                              
            }
        }
        if (nFilas == nCol) {
            int i,j;
            i = 0;
            while(i<nFilas && simetrica== true ){
                j=0;
                while(j<i && simetrica ==true ){
                    if (matriz [i][j] != matriz [j][i]){
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }
            
            if (simetrica == true){
                System.out.println("La matriz es simetrica");
            }else{System.out.println("la matriz no es simetrica");
                
            }
                        
        }else{
            System.out.println("La matriz no es simetrica");
        }
        
    }
    
}
