package miguel.abstraccionInterface;

import miguel.abstraccionInterface.modelo.Curriculo;
import miguel.abstraccionInterface.modelo.Hoja;
import miguel.abstraccionInterface.modelo.Informe;

public class Main {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo("Resumen laboral", "Juan Perez", "Ing. Software");
        cv.experiencia("Java")
                .experiencia("Oracle DBA")
                .experiencia("SpringBoot framework")
                .experiencia("Desarrollador Fullstack")
                .experiencia("Angular");

        Informe informe = new Informe("Estudio Microservicio", "Autor", "Revisor KKK");
        imprimir(cv);
        imprimir(informe);
    }

    public static void imprimir(Hoja imprime){
        System.out.println(imprime.imprimir());
    }
}


