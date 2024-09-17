package Tarea10;

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 30, "Calle Falsa 123");
        persona.saludar();
        persona.cumplirAños();
    }
}

