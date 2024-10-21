//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Ejemplo de un ciclo for
        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
        }

        // Ejemplo de un ciclo while
        int i = 0;
        while (i < 10) {
            System.out.println("i: " + i);
            i++;
        }

        // Ejemplo de un ciclo do-while
        int i = 0;
        do {
            System.out.println("i: " + i);
            i++;
        } while (i < 10);

        // Ejemplo de condicional if-else
        int x = 10;
        if (x > 0) {
            System.out.println("x es positivo");
        } else if (x < 0) {
            System.out.println("x es negativo");
        } else {
            System.out.println("x es cero");
        }

        // Ejemplo de condicional switch
        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día inválido");
                break;
        }


    }
}