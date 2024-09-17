package Tarea11;

public class Calculadora {

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: División por cero no permitida.");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double num1 = 12;
        double num2 = 4;

        double resultadoMultiplicacion = calculadora.multiplicar(num1, num2);
        System.out.println("El resultado de multiplicar " + num1 + " y " + num2 + " es: " + resultadoMultiplicacion);

        double resultadoDivision = calculadora.dividir(num1, num2);
        if (!Double.isNaN(resultadoDivision)) {
            System.out.println("El resultado de dividir " + num1 + " entre " + num2 + " es: " + resultadoDivision);
        }

        double resultadoDivisionPorCero = calculadora.dividir(num1, 0);
        if (Double.isNaN(resultadoDivisionPorCero)) {
            System.out.println("No se puede dividir por cero.");
        }
    }
}
