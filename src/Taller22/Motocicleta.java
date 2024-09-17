package Taller22;

public class Motocicleta implements Vehiculo {
    @Override
    public void arrancar() {
        System.out.println("La motocicleta está arrancando.");
    }

    @Override
    public void detener() {
        System.out.println("La motocicleta se ha detenido.");
    }
}
