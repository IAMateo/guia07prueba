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
package Entidad;

import java.util.Date;

public class Persona {
    private String nombre;
    private Date fechaNacimiento;
    
    private String nombre1;
    private Date fechaNacimiento1;

    public Persona() {
    }

    public Persona(String nombre, Date fechaNacimiento, String nombre1, Date fechaNacimiento1) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre1 = nombre1;
        this.fechaNacimiento1 = fechaNacimiento1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public Date getFechaNacimiento1() {
        return fechaNacimiento1;
    }

    public void setFechaNacimiento1(Date fechaNacimiento1) {
        this.fechaNacimiento1 = fechaNacimiento1;
    }

   
    
}
