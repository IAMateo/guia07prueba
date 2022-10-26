/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6java;

/**
 *
 * @author A275084
 */
public class Ejerc15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                int [] vector = new int [100];
        for (int i = 0; i > 100; i++) {
            vector[i] = i;
        }
        for (int i = 99; i > -1; i--) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
    }
}
