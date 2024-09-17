package Tarea7;

import java.util.Scanner;

public class ContraseñaCorrecta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contraseñaCorrecta = "miContraseña123";
        String contraseñaIngresada;

        do {
            System.out.print("Ingresa la contraseña: ");
            contraseñaIngresada = scanner.nextLine();
        } while (!contraseñaIngresada.equals(contraseñaCorrecta));

        System.out.println("Contraseña correcta. Acceso concedido.");
        scanner.close();
    }
}
