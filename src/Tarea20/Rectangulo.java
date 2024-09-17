package Tarea20;

public class Rectangulo {
    private double base;
    private double altura;

    // Constructor sin parámetros
    public Rectangulo() {
        this.base = 0;
        this.altura = 0;
    }

    // Constructor con parámetros
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para calcular el área del rectángulo
    public double calcularArea() {
        return base * altura;
    }

    // Método para mostrar el área
    public void mostrarArea() {
        System.out.println("Área del rectángulo: " + calcularArea());
    }
}
