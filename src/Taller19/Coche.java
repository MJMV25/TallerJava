package Taller19;

public class Coche {
    private String marca;
    private String modelo;


    public Coche() {
        this.marca = "Desconocida";
        this.modelo = "Desconocido";
    }

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}

