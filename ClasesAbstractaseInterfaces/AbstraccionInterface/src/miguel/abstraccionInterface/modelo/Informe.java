package miguel.abstraccionInterface.modelo;

public class Informe extends Hoja{ //la herencia de una clase debe utilizar los metodos de la clase padre de acuerdo a la necesidad
    private String autor;
    private String revisor;



    public Informe(String contenido, String autor, String revisor) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Informe escrito por: " + this.autor +
                "Revisado por:  " + this.revisor +
                "\n" + this.contenido;
    }
}
