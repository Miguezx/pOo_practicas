package miguel.abstraccionInterface.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja {
    private String persona;
    private String carrera;
    private List<String> experiencia;

    public Curriculo(String contenido, String persona, String carrera) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencia = new ArrayList<>();
    }

    public Curriculo experiencia(String exp) {
        experiencia.add(exp);
        return this; // Retorna la instancia actual para permitir llamadas encadenadas.
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(persona).append("\n")
                .append("Resumen: ").append(this.contenido).append("\n")
                .append("Profesión: ").append(this.carrera).append("\n")
                .append("Experiencia: \n");
        for (String exp : this.experiencia) {
            sb.append(" - ").append(exp).append("\n");
        }
        return sb.toString();
    }
}

