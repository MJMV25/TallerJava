package Taller15;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Laura", 28, "Avenida Libertad 321");

        System.out.println("Edad inicial: " + persona.getEdad());

        persona.setEdad(30);
        System.out.println("Edad después de modificar: " + persona.getEdad());

        persona.setEdad(-5); // Intento de establecer una edad negativa
    }
}
