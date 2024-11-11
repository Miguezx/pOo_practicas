package MPHerencia;

public class PrincipalHerencia {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Alumno alumno = new Alumno();
        alumno.setNombre("Julio");
        alumno.setNombre("Jaramillo");
        alumno.setCarrera("Ing. Software");
        alumno.setEdad(21);
        alumno.setNotap1(7D);
        System.out.println("Datos del alumno");
        System.out.println("Nombre y Apellido" + alumno.getNombre() + "_" + alumno.getApellido());

        AlumnoInt alumnoInternacional = new AlumnoInt();
        Profesor profesor = new Profesor();

    }
}
