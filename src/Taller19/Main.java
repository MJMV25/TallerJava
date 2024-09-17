package Taller19;

public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche();

        Coche coche2 = new Coche("Toyota", "Corolla");

        System.out.println("Coche 1:");
        System.out.println("Marca: " + coche1.getMarca());
        System.out.println("Modelo: " + coche1.getModelo());

        System.out.println("\nCoche 2:");
        System.out.println("Marca: " + coche2.getMarca());
        System.out.println("Modelo: " + coche2.getModelo());
    }
}
