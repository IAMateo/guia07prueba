/*

 */
package ejerc08poocadena;

import Cadena.Cadena;
import CadenaService.CadenaService;


/**
 *
 * @author A275084
 */
public class Ejerc08POOcadena {

    public static void main(String[] args) {
        CadenaService datos = new CadenaService();
        Cadena d1 = datos.IngresarDatos();
        
        System.out.println("");
        datos.ContarVocales();
        System.out.println("");
        datos.InvertirFrase();
        System.out.println("");
        datos.CaracterRepetido();
        System.out.println("");
        datos.UnirFrase();
        System.out.println("");
        datos.ReemplazarA();
        System.out.println("");
        if (datos.ContieneLetra()) {
            System.out.println("Contiene esa letra");
        } else {
            System.out.println("No contiene esa letra");
        }
        System.out.println("");

    }

}