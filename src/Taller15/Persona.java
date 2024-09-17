package Taller15;

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

    // Métodos getter y setter para los atributos restantes (opcional)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
