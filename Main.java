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