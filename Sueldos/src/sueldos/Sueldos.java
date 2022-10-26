/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldos;

import Entidades.Vendedor;
import Servicio.VendedorServicio;

/**
 *
 * @author A275084
 */
public class Sueldos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       VendedorServicio vs = new VendedorServicio();
       Vendedor v1 = vs.altaVendedor();
       vs.SueldoMensual(v1);
       vs.Vacaciones(v1);
    }
    
}
