/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6java;

import java.util.Scanner;

/**
 *Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
 * @author A275084
 */
public class Ejerc08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String frase;
        
        System.out.println("ingrese una frase de 8 caracteres");
        frase = leer.nextLine();
        if (frase.length()== 8) {
            System.out.println("correcto, la frase tiene 8 letras");
        } else {
            System.out.println("incorrecto");
        }
        
                
    }
    
}
