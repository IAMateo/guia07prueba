/*
 Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author A275084
 */
public class Operacion {
    private int numero1;
    private int numero2;
    private int suma;
    private int resta;
    private int multiplicacion;
    private int division;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2, int suma, int resta, int multiplicacion, int division) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.suma = suma;
        this.resta = resta;
        this.multiplicacion = multiplicacion;
        this.division = division;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int getResta() {
        return resta;
    }

    public void setResta(int resta) {
        this.resta = resta;
    }

    public int getMultiplicacion() {
        return multiplicacion;
    }

    public void setMultiplicacion(int multiplicacion) {
        this.multiplicacion = multiplicacion;
    }

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    //calculos
    
    public void crearOperacion() {
       Scanner leer = new Scanner(System.in);
        System.out.println("ingrese dos numeros");
        numero1 = leer.nextInt();
        numero2 = leer.nextInt();
    }
    public void sumar() {
        suma = numero1+numero2;
        System.out.println(" el resultado de la suma es: "+ suma);
    }
    public void restar() {
        resta = numero1-numero2;
        System.out.println(" el resultado de la resta es: "+ resta);
    }
    public void multiplicar() {
        if (numero1 == 0 || numero2 == 0){
        multiplicacion = 0;
            System.out.println("Error, el numero ingresado tiene que ser distinto de 0 ");
        }else {
        multiplicacion = numero1*numero2;
        System.out.println(" el resultado de la multiplicacion es: "+ multiplicacion);}
        }
    public void dividir() {
        if (numero1 == 0 || numero2 == 0){
        division = 0;
            System.out.println("Error, el numero ingresado tiene que ser distinto de 0 ");
        }else {
        division = numero1/numero2;
        System.out.println(" el resultado de la division es: "+ division);}
    }
    
}
