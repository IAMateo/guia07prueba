/*
 *Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada..
 */
package Cadena;

/**
 *
 * @author A275084
 */
public class Cadena {

    public String frase;
    public int largo;

    public Cadena() {
    }

    public Cadena(String frase, int largo) {
        this.frase = frase;
        this.largo = largo;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public String getFrase() {
        return frase;
    }

    public int getLargo() {
        return largo;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", largo=" + largo + '}';
    }

}