/*
 * implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package CadenaService;

import Cadena.Cadena;
import java.util.Scanner;

/**
 *
 * @author A275084
 */
public class CadenaService {

    Scanner leer = new Scanner(System.in);
    Cadena datos = new Cadena();

    public Cadena IngresarDatos() {
        System.out.println("Ingrese una palabra o frase");
        datos.setFrase(leer.next());
        datos.setLargo(datos.getFrase().length());
        return datos;

    }

    public void ContarVocales() {
        String palabra = datos.getFrase();
        int vocales = 0;
        palabra = palabra.toLowerCase();
        for (int i = 0; i < datos.getLargo(); i++) {
            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i' || palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u') {
                vocales++;
            }
        }
        System.out.println("Cantidad de vocales: " + vocales);
    }
    
    

    public void InvertirFrase() {
        System.out.println("Frase Invertida");
        System.out.println("");
        for (int i = datos.getLargo() - 1; i >= 0; i--) {
            System.out.print((datos.getFrase()).charAt(i));
        }
        System.out.println("");
    }
    
    
    
    public void CaracterRepetido() {
        System.out.println("Ingrese el caracter a buscar en la frase");
        String caracter = leer.next();
        String palabra = datos.getFrase();
        palabra = palabra.toLowerCase();
        int contador = 0;
        for (int i = 0; i < datos.getLargo(); i++) {
            if ((palabra.substring(i, i + 1)).equalsIgnoreCase(caracter)) {
                contador++;
            }
        }
        System.out.println("");
        System.out.println("Cantidad de veces que aparece el caracter (" + caracter + "): " + contador);
    }
    


    public void UnirFrase() {
        String nuevafrase;
        System.out.println("Ingrese una nueva frase o palabra, para unirla a la anterior: ");
        nuevafrase = leer.next();
        datos.setFrase(datos.getFrase() + " " + nuevafrase);
        datos.setLargo(datos.getFrase().length());
        System.out.println("");
        System.out.println("Nueva frase: " + datos.getFrase());
    }

    public void ReemplazarA() {
        System.out.println("Ingrese un caracter para cambiar por la letra (a)");
        String letra = leer.next();
        String palabra = datos.getFrase();
        for (int j = 0; j < datos.getLargo(); j++) {
            if (palabra.charAt(j) == 'a') {
                palabra = palabra.replace('a', letra.charAt(0));
            }
        }
        System.out.println("");
        System.out.println("Nueva Frase: " + palabra);
    }

    public boolean ContieneLetra() {
        System.out.println("Ingrese el caracter a buscar en la frase");
        boolean respuesta = false;
        String caracter = leer.next();
        String palabra = datos.getFrase();
        palabra = palabra.toLowerCase();
        int contador = 0;
        for (int i = 0; i < datos.getLargo(); i++) {
            if ((palabra.substring(i, i + 1)).equalsIgnoreCase(caracter)) {
                contador++;
                respuesta = true;
                break;
            }
        }
        return respuesta;
    }
}