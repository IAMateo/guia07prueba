 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6java;

import java.util.Scanner;

/**
 *Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 * @author A275084
 */
public class Ejerc13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int elementos;
        System.out.println("ingrese la cantidad de elementos");
        elementos = leer.nextInt ();
        
        for (int i = 0; i < elementos; i++) {
            for (int j = 0; j < elementos; j++) {
                if (i==0  || i == elementos-1 || j==0 || j== elementos-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
                System.out.println("");  //para bajar la linea
            }
        }
    }
    
