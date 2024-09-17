package Tarea23;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            lista.add(i);
        }

        System.out.println("Lista después de agregar los números del 1 al 5: " + lista);

        lista.set(1, 10);
        lista.remove(lista.size() - 1);

        System.out.println("Tamaño de la lista: " + lista.size());
        System.out.println("Lista final: " + lista);
    }
}
