package miguel.abstraccionInterface.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro {//implements imprimible{
        private List<Hoja> paginas;
        private Persona autor;
        private String titulo;
        private Genero genero;

        public Libro(Persona autor, Genero genero, String titulo, List<Hoja> paginas) {
            this.autor = autor;
            this.genero = genero;
            this.titulo = titulo;
            this.paginas = new ArrayList<>();
        }

        public Libro addPaginas(Hoja pagina){
            paginas.add(pagina);
            return this;
        }

        public String imprimir(){
            StringBuilder sb = new StringBuilder("Titulo: ");
            sb.append(this.titulo).append("\n")
                    .append("Autor: ").append(this.autor).append("\n")
                    .append("Genero: ").append(genero).append("\n");
            for (Hoja pag: this.paginas) {
                sb.append(pag.imprimir()).append("\n");
            }
            return sb.toString();

        }

}
