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



