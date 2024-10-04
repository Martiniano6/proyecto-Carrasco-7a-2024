import java.util.Scanner;

public class Curso {

    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de curso: ");
        int curso = sc.nextInt();

        if (curso == 0) {
            System.out.println("Jardín de infantes");
        } else if (curso >= 1 && curso <= 6) {
            System.out.println("Primaria");
        } else if (curso >= 7 && curso <= 12) {
            System.out.println("Secundaria");
        } else {
            System.out.println("Curso no válido");
        }
    }
}
