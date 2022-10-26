/*
 *Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas. */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author A275084
 */
public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int numeroDePaginas;

    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor, int numeroDePaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;    
    }
    
    public void cargarLibro(){
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese ISBN");
        isbn = leer.nextLine();
        System.out.println("ingrese titulo del libro");
        titulo = leer.nextLine();
        System.out.println("ingrese autor");
        autor = leer.nextLine();
        System.out.println("ingrese cantidad de paginas del libro");
        numeroDePaginas = leer.nextInt();
    }

    public void imprimirLibro(){
        System.out.println (" ISBN: " + isbn + ", TITULO: " +titulo+ ", AUTOR: "+autor+ ", CANTIDAD DE PAGINAS: " +numeroDePaginas);
               
    }  
    
}

