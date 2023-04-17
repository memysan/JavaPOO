/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author irigo
 */
public class Libro {

    Scanner leer = new Scanner(System.in);

    public String ISBN;
    public String titulo;
    public String autor;
    public int NPag;

    public Libro(String ISBN, String titulo, String autor, int NPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.NPag = NPag;

    }

    public Libro() {
    }

    public void Carga() {
        System.out.println("Ingrese ISBN");
        this.ISBN = leer.nextLine();
        System.out.println("Ingrese nombre del libro");
        this.titulo = leer.nextLine();
        System.out.println("Ingrese autor");
        this.autor = leer.nextLine();
        
        System.out.println("Ingrese cantidad de paginas");
        this.NPag = leer.nextInt();
    }
public void mostrar(){
    
    System.out.println(titulo+" "+ autor+" "+ISBN+" "+NPag);
    
    
}
}
