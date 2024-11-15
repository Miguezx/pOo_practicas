package biblioteca.materiales;

import biblioteca.materiales.Libro;
import biblioteca.materiales.Revista;

public class BibliotecaMain {
    public static void main(String[] args) {
        Libro libro = new Libro();
        System.out.println("Ingrese la informacion del libro");
        libro.leerInformacion();
        System.out.println("\nMostrando informacion del libro");
        libro.mostrarInformacion();

        Revista revista = new Revista();
        System.out.println("Ingrese la informacion de la revista");
        revista.leerInformacion();
        System.out.println("\nMostrando informacion de la revista");
        revista.mostrarInformacion();
    }
}
