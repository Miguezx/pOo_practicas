package miguel.abstraccionInterface.modelo;

public class Pagina extends Hoja}// implements imprimible{
    public Pagina(String contenido){
        super(contenido);
    }

    @Override
    public String imprimir() {
        return this.contenido;
    }
}
