/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc06poocafetera;
import Cafetera.Cafetera;
import CafeteraService.CafeteraService;

/**
 *
 * @author A275084
 */
public class Ejerc06POOcafetera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CafeteraService cs = new CafeteraService();
        Cafetera c = new Cafetera(30, 0);
        cs.llenarCafetera(c);
        cs.servirTaza(c);
        cs.vaciarCafetera(c);
        cs.agregarCafe(c);

    }
}
