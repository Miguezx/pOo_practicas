package miguel.abstraccionInterface.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja{
    public String persona;
    public String carrera;

    private List<String> experiencia;

    public Curriculo(String contenido, String persona, String carrera, List<String> experiencia) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencia = new ArrayList<>();
    }

    public Curriculo experiencia(String exp){
        experiencia.add(exp);
        return this; //retornar los mismos valores de la clase experiencia.
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(persona).append("\n")
        .append("Resumen: ").append(this.contenido).append("\n")
                .append("Profesion: ").append(this.carrera).append("\n")
                .append("Experiencia : \n" );
        for(String exp:this.experiencia){
            sb.append(" - ").append(exp).append("\n");
        }
        return sb.toString();
    }
}
