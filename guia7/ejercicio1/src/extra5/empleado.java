/*
 Crea una clase "Empleado" que tenga atributos como "nombre", "edad"
y "salario". Luego, crea un método "calcular_aumento" que calcule el 
aumento salarial de un empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado tiene más de 30 años 
o del 5% si tiene menos de 30 años.

 */
package extra5;

import java.util.Scanner;

/**
 *
 * @author irigo
 */
public class empleado {
     public String nombre;
    public int edad;
    public double salario;
    Scanner leer = new Scanner(System.in);
    public empleado() {
    }

    public empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void calcularAumento(){
        System.out.println("Ingrese nombre");
        nombre=leer.nextLine();
        System.out.println("Ingrese salario actual ");
        salario=leer.nextDouble();
        System.out.println("Ingrese su edad");
        edad= leer.nextInt();
        if (edad>=30&& edad<65) {
            System.out.println("su nuevo salario es: "+Math.round(salario*1.1));
        }else if (edad < 30 && edad>= 18) {
            System.out.println("Su salario aumentado es: "+ Math.round(salario*1.05));
        }else
            System.out.println("Ingreso no valido");
    
    }
}
