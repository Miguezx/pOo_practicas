package biblioteca.materiales;

import java.util.Scanner;

public class Revista extends MaterialBiblioteca{
    private int numEdicion;

    public Revista() {
        super();
    }

    public int getNumEdicion() {
        return numEdicion;
    }

    public void setNumEdicion(int numEdicion) {
        this.numEdicion = numEdicion;
    }

    public void leerInformacion(){
        super.leerInformacion();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de edicion");
        this.setNumEdicion(scanner.nextInt());
    }

    public void mostrarInformacion(){
        String info = super.mostrarInformacion();
        info += "Numero de edicion -- " + getNumEdicion() + "\n";
        System.out.println(info);
    }
}
