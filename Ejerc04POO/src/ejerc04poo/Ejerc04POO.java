/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc04poo;

import Entidades.Rectangulo;

/**
 *
 * @author A275084
 */
public class Ejerc04POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        
        r1.ingresarDatos();
        r1.calcularSuperficie();
        r1.calcularPerimetro();
        r1.asteriscos();
    }
    
}
