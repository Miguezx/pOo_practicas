public class Alumno { //creación de clases
    private int id;
    private String nombre;
    private String apellido;
    private double calificacion;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido, int calificacion) { //constructor, utiliza la p. reservada this, para iodnetificar la variable
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificacion = calificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    // Método para mostrar información del alumno
    public void mostrarInformacion() {
        System.out.println("Hola, soy un alumno y sé decir mi nombre");
        System.out.println("------------------------------------------------");
        System.out.println("La id del alumno es: " + this.getId());
        System.out.println("El nombre es: " + this.getNombre());
        System.out.println("El apellido es: " + this.getApellido());
        System.out.println("Mi calificación es: " + this.getCalificacion());
        this.saberAprobado();
    }

    public void saberAprobado (){ //metodo, procedimento, recibiendo un párametro
        if (this.calificacion >= 6) {
            System.out.println("Aprobo la matería");
        }
        else{
            System.out.println("Desaprobo");
        }

        //System.out.println("Hola mundo");
    }
}
