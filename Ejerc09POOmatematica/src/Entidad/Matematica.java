/*
 Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Entidad;

public class Matematica {
    //atributos
    public int numero1;
    public int numero2;
//contructores
    public Matematica() {
    }

    public Matematica(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
//get & set
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "Matematica{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
    
    //metodos
    public void DevolverMayor(Matematica m1){
        int numeromayor=Math.max(m1.getNumero1(),m1.getNumero2());
        System.out.println("El numero mayor de los ingresados es: "+numeromayor);
    }
    public void CalcularPotencia(Matematica m1){
        int numeromayor=Math.max(m1.getNumero1(),m1.getNumero2());
        int numeromenor=Math.min(numero1, numero2);
        int potencia=(int)(Math.pow(numeromayor, numeromenor));
        System.out.println("La potencia de "+numeromayor+" elevado a "+numeromenor+" es: "+potencia);
    }
    public void CalcularRaiz(Matematica m1){
        int numeromayor=Math.max(m1.getNumero1(),m1.getNumero2());
        int numeromenor=Math.min(numero1, numero2);
        numeromenor=Math.abs(numeromenor);
        int raiz=(int)Math.sqrt(numeromenor);
        System.out.println("La raiz cuadrada de "+numeromenor+" es: "+raiz);
    }
}

