public class Automovil {
    private String marca;
    private String modelo;
    private String color = "blanco";
    private double cilindraje;

    // Constructores

    public Automovil() { // Constructor explícito
    }

    public Automovil(String marca) {
        this.marca = marca;
    }

    public Automovil(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Métodos set y get

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Métodos propios y de cálculos
    public void verDetalle() {
        System.out.println("La marca es -> " + this.marca + "\n" +
                "El modelo es -> " + this.modelo + "\n" +
                "El color es -> " + this.color + "\n" +
                "El cilindraje es -> " + this.cilindraje + "\n");
    }
}

//Main
public class Main {
    public static void main(String[] args) {
        Automovil bmw = new Automovil();
        bmw.setMarca("BMW");
        bmw.setModelo("i320");
        bmw.setColor("Rosa");
        bmw.setCilindraje(42.5);

        Automovil bmw2 = new Automovil("Mercedes", "i320");
        bmw2.setColor("Rosa");
        bmw2.setCilindraje(42.5);

        bmw.verDetalle();
        bmw2.verDetalle();

        System.out.println("-");
        System.out.println(bmw.equals(bmw2));
    }
}



