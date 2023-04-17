/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author irigo
 */
public class ejercicio2Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Circunferencia c = new Circunferencia(2.5); 
       
        System.out.println("radio: "+ c.getRadio());
        System.out.println("area: "+ c.calcularArea());
        System.out.println("perimetro: "+ c.calcularPerimetro());
        
        c.crearCircunferencia();
        
        System.out.println("radio: "+ c.getRadio());
        System.out.println("area: "+ c.calcularArea());
        System.out.println("perimetro: "+ c.calcularPerimetro());
    }
    
    
}
