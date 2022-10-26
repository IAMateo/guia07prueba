/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia6;


import static java.util.Objects.equals;
import java.util.Scanner;

/**
 *
 * @author A275084
 */
public class Ejerc07 {

    /**
     * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String frase;
        System.out.println("ingrese una frase");
        frase = leer.nextLine();
        
        if (frase.equals("eureka"))  {
            System.out.println("correcto, las frases son iguales");
        }else {
            System.out.println("incorrecto, las frases no coinciden");
        }
        
    }
    
}