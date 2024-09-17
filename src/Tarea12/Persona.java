package Tarea12;

public class Persona {
    private String nombre;
    private int edad;
    private String direccion;

    public Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre + ". Vivo en " + direccion + ".");
    }

    public void cumplirAños() {
        edad++;
        System.out.println("¡Feliz cumpleaños, " + nombre + "! Ahora tienes " + edad + " años.");
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Ana", 25, "Avenida Principal 456");
        Persona persona2 = new Persona("Luis", 30, "Calle Secundaria 789");

        persona1.saludar();
        persona1.cumplirAños();
        persona1.cumplirAños(); // Puedes llamar el método más de una vez si lo deseas

        persona2.saludar();
        persona2.cumplirAños();
    }
}
