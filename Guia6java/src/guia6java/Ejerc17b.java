/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6java;

/**
 *
 * @author A309436
 */
public class Ejerc17b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //17. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
        //de 2 dígitos, etcétera (hasta 5 dígitos).

        int[] vEnteros = new int[20];
        int[] vContador = new int[5];
        int digitos = 0;

        for (int i = 0; i < 20; i++) {

            vEnteros[i] = (int) (Math.random() * (99999) + 1);

            digitos = (int) Math.log10(vEnteros[i]) + 1;
            
            vContador[digitos - 1] = vContador[digitos - 1] + 1;
            
            System.out.print(" |" + vEnteros[i] + "|");
        }
        
        System.out.println("");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Hay " + vContador[i] + " numeros de " + (i + 1) + " digitos.");
        }
        
    }

}
