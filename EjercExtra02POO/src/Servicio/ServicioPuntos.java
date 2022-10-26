/*
 Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos..
 */
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

public class ServicioPuntos {

    Scanner leer = new Scanner(System.in);
    Puntos d1 = new Puntos();

    //Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números
    //y los ingresa en los atributos del objeto.
    public Puntos crearPuntos() {
        System.out.println("Introduzca las coordenadas de dos puntos A y B, para medir su distancia");
        System.out.println("Punto (A)=(x1,y1)");
        System.out.print("x1= ");
        d1.setX1(leer.nextInt());
        System.out.print("y1= ");
        d1.setY1(leer.nextInt());
        System.out.println("Punto (B)= (x2, y2)");
        System.out.print("x2= ");
        d1.setX2(leer.nextInt());
        System.out.print("y2= ");
        d1.setY2(leer.nextInt());

        return d1;
    }

    public void MostrarPuntos() {
        System.out.println("Punto A = (" + d1.getX1() + "," + d1.getY1() + ")");
        System.out.println("Punto B = (" + d1.getX2() + "," + d1.getY2() + ")");
    }

    /*Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. 
Para conocer como calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html*/

    public void CalcularDistancia() {
        double distancia;
        System.out.println("D(A,B) = RAIZ de [(x2-x1)² + (y2-y1)²]");
        distancia = (double) Math.sqrt(((int) Math.pow((d1.getX2()) - (d1.getX1()), 2)) + ((int) Math.pow((d1.getY2()) - (d1.getY1()), 2)));
        System.out.println("La Distancia entre el punto A y el punto B, en el plano es: " + distancia);
    }
}

