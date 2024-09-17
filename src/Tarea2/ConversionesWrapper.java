package Tarea2;

public class ConversionesWrapper {
    public static void main(String[] args) {
        // Convertir una cadena de texto a números primitivos
        String cadenaInt = "123";
        String cadenaDouble = "45.67";

        int numeroInt = Integer.parseInt(cadenaInt);
        double numeroDouble = Double.parseDouble(cadenaDouble);

        System.out.println("Cadena a int: " + numeroInt);
        System.out.println("Cadena a double: " + numeroDouble);

        // Convertir números primitivos a cadenas de texto
        int otroInt = 789;
        double otroDouble = 123.45;

        String cadenaDesdeInt = Integer.toString(otroInt);
        String cadenaDesdeDouble = Double.toString(otroDouble);

        System.out.println("Int a cadena: " + cadenaDesdeInt);
        System.out.println("Double a cadena: " + cadenaDesdeDouble);
    }
}

