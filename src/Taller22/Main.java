package Taller22;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Coche());
        vehiculos.add(new Motocicleta());


        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.arrancar();
            vehiculo.detener();
            System.out.println();
        }
    }
}
