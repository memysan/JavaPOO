/*
 Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método 
"calcular_area" que calcule y devuelva el área del rectángulo. Luego crea un objeto "rectangulo1" 
de la clase "Rectángulo" con lados de 4 y 6 y imprime el área del rectángulo.

 */
package extra6;

import java.util.Scanner;

/**
 *
 * @author irigo
 */
public class Circulo {
    public double radio;
    public double altura;
    
    Scanner leer = new Scanner(System.in);

    public Circulo() {
    }

    public Circulo(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }
    
    public double calcularArea(){
        System.out.println("Ingrese el valor del radio en cm");
        radio=leer.nextDouble();
        double area=Math.PI * Math.pow(radio,2);
        System.out.println("Su area es: "+Math.round(area));
        return area;
        
    }
    
    
    
    public void calcularVolumen(double area){
       
        System.out.println("Ingrese la altura");
        altura=leer.nextDouble();
       double volumen =area*altura;
        System.out.println("El volumen es: "+Math.round(volumen)); 
    }
}
