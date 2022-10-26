package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class MascotAPP {

    public static void main(String[] args) {
        
        //crear objeto
        Mascota m1 = new Mascota("Fernando Chiquito", leer.next(), "perro");

//        m1.apodo = "Chiquito";
//        m1.nombre = "Fernando Chiquito";
//        m1.tipo = "Perro";
//        m1.edad = 14;
//        m1.raza = "Beagle";
//        m1.cola = true;
//        m1.color = "Tricolor";
        System.out.println(m1.apodo + " " + m1.edad + " " + m1.tipo);

//        public String nombre;
//    public String apodo;
//    //conejo, gato, perro, loro, carpincho
//    public String tipo;
//    public String color;
//    public int edad;
//    public boolean cola;
//    public String raza;
    }

}
