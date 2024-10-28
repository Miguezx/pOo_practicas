//clase Estudiante
import java.util.Scanner;

// Clase Estudiante
public class Estudiante {
    private String nombre;
    private int edad;
    private String matricula;
    private Materia materia;

    public Estudiante() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void ingresarInformacionAlumno() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresando información del alumno:");
        System.out.print("Ingrese el nombre del estudiante: ");
        this.setNombre(scanner.nextLine());

        System.out.print("Ingrese la edad del estudiante: ");
        this.setEdad(scanner.nextInt());
        scanner.nextLine(); // Limpiar el buffer de entrada

        System.out.print("Ingrese la matrícula del estudiante: ");
        this.setMatricula(scanner.nextLine());
    }


    public double obtenerPromedio(int[] notas) {
        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        return (double) suma / notas.length;
    }


    public void mostrarInfoAlumno() {
        System.out.println("nombre = " + nombre);
        System.out.println("edad = " + edad);
        System.out.println("matricula = " + matricula);
        System.out.println("EL promedio es " + obtenerPromedio(materia.getNotas()));
    }
}

//clase Materia
import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class Materia {
    private String codigo;
    private String nombreMat;
    private int[] notas;

    public Materia() {

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreMat() {
        return nombreMat;
    }

    public void setNombreMat(String nombreMat) {
        this.nombreMat = nombreMat;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public void ingresarInformacionMateria() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresando información de la materia:");
        System.out.print("Ingrese el código de la materia: ");
        this.setCodigo(scanner.nextLine());

        System.out.print("Ingrese el nombre de la materia: ");
        this.setNombreMat(scanner.nextLine());
    }

    public void mostrarInfoMateria() {
        System.out.println("codigo = " + codigo);
        System.out.println("nombreMat = " + nombreMat);
    }
}

//clase Nota

import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class Materia {
    private String codigo;
    private String nombreMat;
    private int[] notas;

    public Materia() {

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreMat() {
        return nombreMat;
    }

    public void setNombreMat(String nombreMat) {
        this.nombreMat = nombreMat;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public void ingresarInformacionMateria() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresando información de la materia:");
        System.out.print("Ingrese el código de la materia: ");
        this.setCodigo(scanner.nextLine());

        System.out.print("Ingrese el nombre de la materia: ");
        this.setNombreMat(scanner.nextLine());
    }

    public void mostrarInfoMateria() {
        System.out.println("codigo = " + codigo);
        System.out.println("nombreMat = " + nombreMat);
    }
}

//clase Universidad
import javax.lang.model.SourceVersion;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Universidad {
    private String nombre;
    private String direccion;
    private String codigo;

    public Universidad() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void leerUniversidad() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la universidad: ");
        this.setNombre(scanner.nextLine());

        System.out.print("Ingrese la dirección de la universidad: ");
        this.setDireccion(scanner.nextLine());

        System.out.print("Ingrese el código de la universidad: ");
        this.setCodigo(scanner.nextLine());
    }

    public void mostrarInfoUniversidad(){
        System.out.println("nombre = " + nombre);
        System.out.println("direccion = " + direccion);
        System.out.println("codigo = " + codigo);
    }
}

//main

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear universidad
        Universidad universidad = new Universidad();
        universidad.leerUniversidad();
        universidad.mostrarInfoUniversidad();

        // Crear un estudiante y asignarle información
        Estudiante estudiante = new Estudiante();
        estudiante.ingresarInformacionAlumno();
        //estudiante.mostrarInfoAlumno();

        // Crear una materia y asignarle información
        Materia materia = new Materia();
        materia.ingresarInformacionMateria();
        materia.mostrarInfoMateria();

        // Pedir y asignar notas
        System.out.print("¿Cuántas notas va a ingresar para " + materia.getNombreMat() + "?: ");
        int cantidadNotas = scanner.nextInt();
        int[] notas = new int[cantidadNotas];

        for (int i = 0; i < cantidadNotas; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = scanner.nextInt();
        }

        // Asignar las notas a la materia
        materia.setNotas(notas);

        // Calcular y mostrar el promedio
        double promedio = estudiante.obtenerPromedio(notas);
        System.out.println("El promedio de las notas en " + materia.getNombreMat() + " para " + estudiante.getNombre() + " es: " + promedio);

        //estudiante.mostrarInfoAlumno();
    }
}
