package biblioteca.materiales;

import java.util.Scanner;

public class MaterialBiblioteca {
    private String titulo;
    private String autor;
    private int año;

    public MaterialBiblioteca() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void leerInformacion(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el Titulo: ");
        this.setTitulo(scanner.nextLine());

        System.out.print("Ingrese el autor ");
        this.setAutor(scanner.nextLine());

        System.out.print("Ingrese el año: ");
        this.setAño(scanner.nextInt());
    }

    public String mostrarInformacion(){
        String sb = "El titulo es " + getTitulo() + "\n" +
                "El autor es " + getAutor() + "\n" +
                "El año es " + getAño() + "\n";
        return sb;
    }

}
