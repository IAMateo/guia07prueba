/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceCuenta;
import EntidadesCuenta.Cuenta;
import java.util.Scanner;
/**
 *
 * @author A275084
 */
public class ServiceCuenta {
    Scanner leer = new Scanner(System.in);
    public Cuenta crearCuenta(){
        Cuenta c = new Cuenta();
        System.out.println("Ingrese numero de cuenta");
        c.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese numero de  DNI");
        c.setDni(leer.nextLong());
        System.out.println("Ingrese el Saldo");
        c.setSaldo(leer.nextDouble());
        
        return c;
    }
    public void depositarCuenta(Cuenta c){
        System.out.println("Su saldo es: $ "+c.getSaldo());
        System.out.println("Ingrese el saldo a depositar ");
        c.setSaldo(c.getSaldo()+ leer.nextDouble());
        System.out.println("Su saldo actualizado es $ "+c.getSaldo());
    }
    public void retirarCuenta(Cuenta c){
        System.out.println("Su saldo es: $ "+c.getSaldo());
        System.out.println("Ingrese el saldo a retirar ");
        c.setSaldo(c.getSaldo()- leer.nextDouble());
        System.out.println("Su saldo actualizado es $ "+c.getSaldo());
    }
    public void extraccionRapida(Cuenta c){
        System.out.println("Su saldo es: $ "+c.getSaldo());
        System.out.println("EXTRACCION RAPIDA, Esta opcion solo le permite retirar el 20% de su saldo actual: " + c.getSaldo()*0.2);
        double x = 0;
                do {
                  System.out.println("Ingrese el importe a retirar ");     
                  x = leer.nextDouble();
                    if (x > c.getSaldo()*0.2) {
                        System.out.println("Operacion invalida, pruebe un monto menor");
                    }
                  
                } while (x>c.getSaldo()*0.2);
                c.setSaldo(c.getSaldo()-x);
                System.out.println("Operacion exitosa!!! Su saldo  actualizado  es: $ "+c.getSaldo());
    }
    public void consultaSaldo(Cuenta c){
        
        System.out.println("Su saldo es: $" + c.getSaldo());
    }
                
      public void consultarDatos(Cuenta c) {
          System.out.println("\n"+ c.toString() );
      }  
}

