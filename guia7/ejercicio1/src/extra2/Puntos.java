/*
 Definir una clase llamada Puntos que contendrá 
las coordenadas de dos puntos, sus atributos serán,
x1, y1, x2, y2, siendo cada x e y un punto. 
Generar un objeto puntos usando un método crearPuntos()
que le pide al usuario los dos números y los ingresa en los 
atributos del objeto. Después, a través de otro método calcular
y devolver la distancia que existe entre los dos puntos que existen
en la clase Puntos.

 */
package extra2;

import java.util.Scanner;

/**
 *
 * @author irigo
 */
public class Puntos {
    public int x1,x2,y1,y2;
    Scanner leer = new Scanner(System.in);
    public void CrearPuntos(){
        System.out.println("Ingrese las coordenadas del primer punto");
        System.out.print("x1=");
        x1=leer.nextInt();
        System.out.print("x2=");
        x2=leer.nextInt();
        System.out.println("Ingrese las coordenadas del segundo punto");
        System.out.print("y1=");
        y1=leer.nextInt();
        System.out.print("y2=");
        y2=leer.nextInt();
    }
    public double Distancia(){
        double res=Math.pow((x1-y1),2)+Math.pow((x2-y2),2);
        double distancia=Math.sqrt(res);
        return distancia;
    }
}