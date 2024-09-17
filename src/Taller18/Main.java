package Taller18;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("Cien años de soledad", "Gabriel García Márquez");

        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
    }
}
