/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6java;

import java.util.Scanner;

/**
 *
 * @author A275084
 */
public class Ejerc11 {

    /**
     * Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       int num1, num2, opcion, suma, resta, mult;
       float div;
       String op;
       op = "n";
       
       
        System.out.println("ingrese dos numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        if (num1 < 0 && num2 < 0 ){
            System.out.println("en numero ingresado no es correcto");}
        else { 
            while(!op.equals("S")){
             System.out.println("MENU");
             System.out.println("1. SUMAR");
             System.out.println("2. RESTAR");
             System.out.println("3. MULTIPLICAR");
             System.out.println("4. DIVIDIR");
             System.out.println("5. SALIR");
             System.out.println("ELIJA OPCION");
             
           opcion = leer.nextInt();
           
           switch (opcion) {
               case 1: suma = num1+num2;
                   System.out.println("el resultado de la suma es " + suma);
               break;
               case 2: resta = num1 - num2;
                   System.out.println("el resultado de la resta es " + resta);
               break;
               case 3: mult = num1* num2;
                   System.out.println("El resultado de la multiplicacion es " + mult);
               break;
               case 4: div = num1 / num2;
                   System.out.println("el resultado de la divicion es " + div);
               break;
               case 5: System.out.println("¿estas seguro de querer salir S/N");
               op = leer.next();
               if (op.equals("S"))
                       System.out.println("fin del programa");
             
                       
           }
    }}
    
}
}
