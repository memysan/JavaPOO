/*
 Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
package ejercicio2;

import java.util.Scanner;



/**
 *
 * @author irigo
 */
public class Circunferencia {
    private double radio;

    public void crearCircunferencia(){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        this.radio= leer.nextDouble();
        setRadio(radio);
        
    }
    
    public double calcularArea(){
        
        
       return Math.PI*radio*radio;
    }
    public double calcularPerimetro (){
        return 2*Math.PI*radio;
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
