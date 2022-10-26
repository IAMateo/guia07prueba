/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class ServicioPersona {

    Scanner leer = new Scanner(System.in);
    Persona d1 = new Persona();

    public Persona crearPersona() {
        System.out.println("Ingrese el nombre de la persona");
        d1.setNombre(leer.next());
        System.out.println("Fecha de nacimiento: ");
        System.out.println("Ingrese DIA ");
        int dia = leer.nextInt();
        System.out.println("ingrese MES ");
        int mes = leer.nextInt();
        System.out.println("Ingrese AÑO ");
        int anio = leer.nextInt();

        Date cumple = new Date(anio -1900, mes -1, dia);
        d1.setFechaNacimiento(cumple);

        return d1;
    }

    /* Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.*/
    public void calcularEdad() {
        Date fechaActual = new Date();  //para saber la fecha de hoy 
        int edad = fechaActual.getYear() - d1.getFechaNacimiento().getYear();
        System.out.println(d1.getNombre() + "tiene: " + edad + " años.");
    }

    /*  Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario. */
    public boolean menorQue() {
        System.out.println("Ingrese una nueva fecha para comparar");
        boolean respuesta = false;
        System.out.println("Ingrese DIA ");
        int dia = leer.nextInt();
        System.out.println("ingrese MES ");
        int mes = leer.nextInt();
        System.out.println("Ingrese AÑO ");
        int anio = leer.nextInt();

        Date nuevaFecha = new Date(anio - 1900, mes - 1, dia);
        d1.setFechaNacimiento1(nuevaFecha);
        if (nuevaFecha.after(d1.getFechaNacimiento())) { // .after -> Retorna verdadero si la fecha esta después de la fecha del parámetro
            respuesta = true;
        }
        return respuesta;
    }

    public Persona CrearNuevaPersona() {
        System.out.println("Ingrese el nombre de la persona");
        d1.setNombre1(leer.next());
        return d1;
    }

    /* Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.*/
    public void MostrarNuevaPersona() {
        System.out.println("Nombre nueva persona: " + d1.getNombre1());
        System.out.println("Fecha de nacimiento: " + d1.getFechaNacimiento1());
    }

}
