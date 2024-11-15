package biblioteca.materiales;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Libro extends MaterialBiblioteca{
    private String genero;

    public Libro() {
        super(); //Llama al constructor por defecto de la superclase
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void leerInformacion(){
        super.leerInformacion(); //  Llama al método de la superclase para leer 'titulo', 'autor' y 'año'
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el género: ");
        this.setGenero(scanner.nextLine());
    }

    public void mostrarInformacion(){
        String info = super.mostrarInformacion();
        info += "Género: " + getGenero() + "\n";
        System.out.println(info);
    }
}
