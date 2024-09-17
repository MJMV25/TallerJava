package Tarea9;

public class ParImpar {
    public static void main(String[] args) {
        int numero = 7; // Puedes cambiar este número para probar con otros valores

        String resultado = esParOImpar(numero);
        System.out.println(resultado);
    }

    public static String esParOImpar(int numero) {
        if (numero % 2 == 0) {
            return "El número " + numero + " es par.";
        } else {
            return "El número " + numero + " es impar.";
        }
    }
}
