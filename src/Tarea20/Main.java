package Tarea20;

public class Main {
    public static void main(String[] args) {
        // Crear objeto Rectangulo usando el constructor sin parámetros
        Rectangulo rectangulo1 = new Rectangulo();

        // Crear objeto Rectangulo usando el constructor con parámetros
        Rectangulo rectangulo2 = new Rectangulo(5, 10);

        // Mostrar el área del primer rectángulo
        System.out.println("Rectángulo 1:");
        rectangulo1.mostrarArea();

        // Mostrar el área del segundo rectángulo
        System.out.println("\nRectángulo 2:");
        rectangulo2.mostrarArea();
    }
}
