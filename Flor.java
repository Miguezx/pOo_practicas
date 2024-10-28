public class Flor {
    private String nombre;
    private String color;
    private double altura;

    public Flor(String nombre, String color, double altura) {
        this.nombre = nombre;
        this.color = color;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void mostrarDetalles() {
        System.out.println("Flor: " + getNombre() + ", Color: " + getColor() + ", Altura: " + getAltura() + " cm");
    }
}


//Main
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Flor rosa = new Flor("rosa", "rojo", 50);
        Flor girasol = new Flor("girasol", "amarillo", 150);
        Flor tulipan = new Flor("tulipan", "verde", 67.5);
        rosa.mostrarDetalles();
        girasol.mostrarDetalles();
    }
}


