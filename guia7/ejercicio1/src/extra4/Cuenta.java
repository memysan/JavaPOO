/*
 Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta.
Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.

 */
package extra4;

import java.util.Scanner;

/**
 *
 * @author irigo
 */
public class Cuenta {

    public double saldo;
    public String titular;
    Scanner leer = new Scanner(System.in);

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void retirarDinero() {
        saldo = 1000;
        do {
            System.out.println("Su saldo es: " + saldo + ""
                    + "\nIngrese un monto a retirar ");
            double num = leer.nextDouble();
            if (num > saldo) {
                System.out.println("Saldo insuficiente");
            } else {
                saldo -= num;
                //System.out.println("Su saldo actual es: " + saldo);
            }

        } while (saldo > 0);

    }

}
