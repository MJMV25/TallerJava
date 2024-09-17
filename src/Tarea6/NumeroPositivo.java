package Tarea6;

import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Ingresa un número positivo (o un número negativo para salir): ");
        numero = scanner.nextInt();

        while (numero >= 0) {
            System.out.println("Ingresaste: " + numero);
            System.out.print("Ingresa otro número positivo (o un número negativo para salir): ");
            numero = scanner.nextInt();
        }

        System.out.println("Ingresaste un número negativo. Programa terminado.");
        scanner.close();
    }
}

