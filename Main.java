//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Alumno alu1 = new Alumno(); //creacion de objeto, y llamado al constructor
        Alumno alu2 = new Alumno(1723189369, "Maria", "Perez", 5);
        alu1.setId(1724317183);
        alu1.setNombre("Marcos");
        alu1.setApellido("Inca");
        alu1.setCalificacion(7.5);

        alu1.mostrarInformacion();
        alu2.mostrarInformacion();

        alu2.setId(35); //sobrescribir

        alu2.mostrarInformacion();
    }
}