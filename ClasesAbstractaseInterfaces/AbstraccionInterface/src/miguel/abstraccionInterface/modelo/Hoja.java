package miguel.abstraccionInterface.modelo;

public abstract class Hoja { // CLASE ABSTRACTA
    protected String contenido;

    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    public abstract String imprimir(); // Este método no tiene cuerpo
}
