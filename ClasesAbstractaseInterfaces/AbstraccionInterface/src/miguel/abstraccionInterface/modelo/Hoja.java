package miguel.abstraccionInterface.modelo;

abstract public class Hoja { //CLASE ABSTRACTRA
    protected String contenido;

    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    abstract public String imprimir(); //este metodo no tiene cuerpo
}
