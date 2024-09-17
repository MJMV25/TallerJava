package Tarea8;

public class BuscarNumeroArray {
    public static void main(String[] args) {
        int[] numeros = {5, 12, 7, 9, 21, 14};
        int numeroBuscado = 9;
        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscado) {
                System.out.println("Número encontrado en el índice: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Número no encontrado en el array.");
        }
    }
}
