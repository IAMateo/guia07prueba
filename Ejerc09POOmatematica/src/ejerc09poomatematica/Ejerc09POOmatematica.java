/*Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.*/
package ejerc09poomatematica;

import Entidad.Matematica;

public class Ejerc09POOmatematica {

    public static void main(String[] args) {
  //instanciar objeto
        Matematica m1 = new Matematica();
        
 //Math.random para generar los dos números y se guardaran en el objeto con su respectivos set.       
        m1.setNumero1((int) (Math.random() * 100));
        System.out.println("Numero 1 - Aleatorio: " + m1.getNumero1());
        m1.setNumero2((int) (Math.random() * 100));
        System.out.println("Numero 2 - Aleatorio: " + m1.getNumero2());
                
        m1.DevolverMayor(m1);
        m1.CalcularPotencia(m1);
        m1.CalcularRaiz(m1);

    }

}
