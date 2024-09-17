package Taller16;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("Laptop", 999.99, 10);

        producto.mostrarDetalles();

        producto.nombre = "Smartphone";
        producto.setPrecio(499.99);
        producto.setCantidad(20);

        System.out.println("\nDetalles actualizados:");
        producto.mostrarDetalles();

        producto.setCantidad(-5); // Intento de establecer una cantidad negativa
    }
}
