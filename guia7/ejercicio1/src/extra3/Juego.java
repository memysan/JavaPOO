/*
 Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de adivinanza de números.
El primer jugador elige un número y el segundo jugador intenta adivinarlo.
El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo" después de cada intento.
El juego termina cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.

 */
package extra3;

import java.util.Scanner;

/**
 *
 * @author irigo
 */
public class Juego {

    Scanner leer = new Scanner(System.in);
    int num, num2;

    public void iniciarJuego() {

        System.out.println("Elije un numero");
        num = leer.nextInt();

    }

    public void adivinar() {
        int cont = 0, cont1=0,cont2=0;
       String respuesta= "S";
        System.out.println("Ingrese el numero probable");
        do {
            
       
        
        do {
             num2 = leer.nextInt();
            if (num > num2) {
                System.out.println("mas alto");
                cont++;
            }
            else if (num < num2) {
                System.out.println("mas bajo");
                cont++;
            }
            else  {
                System.out.println("Exacto");
                cont1++;
                break;
            }
        } while (cont < 10);
        if (cont==10) {
            System.out.println("Lo siento no es");
            cont2++;
        }
            System.out.println("desea jugar de nuevo? s/n");
            respuesta=leer.next();
            
         } while (respuesta=="S" || respuesta == "s");
        
            System.out.println("ingrese nuevo numero");
   
            System.out.println("El numero de intentos fue de: " + cont);
        System.out.println("El jugador acerto "+ cont1+ " veces");
        System.out.println("El jugador fallo: "+ cont2+ " veces");
   
        
       
        
        }
    }


